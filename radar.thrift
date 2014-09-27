namespace rb Radar.API
namespace java br.com.investtools.radar.api

/**
 * Representação <i><a href="http://en.wikipedia.org/wiki/Unix_time">Unix time</a></i>
 * no horário 00:00:00.00 UTC.
 */
typedef i32 Date

/**
 * Representação <i><a href="http://en.wikipedia.org/wiki/RGB_color_model">RGB</a></i>
 * de 24 bits.
 *
 * Exemplo: Vermelho = <code>#FF0000</code> =
 * <code>11111111 00000000 00000000</code> =
 * (255 × 2¹⁶) + (0 × 2⁸) + (0 × 2⁰) = 167.11.680
 */
typedef i32 Color

typedef i16 SessionId

struct StockId {
  1: string symbol
}

struct IndexId {
  1: string symbol
}

struct FundId {
  1: string cnpj
}

struct IndexLinkedBondId {
  1: IndexId index
  2: double factor
  3: Date base_date
  4: Date maturity_date
}

union SecurityId {
  1: StockId stock
  2: FundId fund
  3: IndexLinkedBondId index_linked_bond
}

struct Point {
  1: Date x
  2: double y
}

struct PieSeries {
  1: string name
  2: double value
}

struct PieChart {
  1: string title
  2: list<PieSeries> series
}

enum LineSeriesType {
  LINE, AREA
}

struct LineSeries {
  1: string name
  2: list<Point> points
  3: LineSeriesType type = LineSeriesType.LINE
}

struct LineChartOptions {
  1: bool stacked
  2: bool compare
}

struct LineChart {
  1: string title
  2: list<LineSeries> series
  3: LineChartOptions options
}

struct BarSeries {
  1: string name
  2: list<double> data
  /**
   * Criado na versão 0.2.2.
   *
   * Só é necessário se <code>BarChart.options.stacked = true</code> e a intenção for agrupar as pilhas.
   */
  3: optional string stack_name
}

/**
 * Criado na versão 0.2.2.
 */
struct BarChartOptions {
  1: bool stacked = false
  2: bool percent = false
  4: optional string y_axis_title
}

struct BarChart {
  1: string title
  2: list<BarSeries> series
  3: list<string> categories
  /**
   * Criado na versão 0.2.2.
   */
  4: BarChartOptions options
}

struct Text {
  1: string title
  2: string content
}

union TableCellContent {
  1: string text
  2: double percent
  3: double currency
  4: double number
}

struct TableCellFormat {
  1: bool bold
  2: bool italic
  3: Color color
  4: i16 colspan = 1
  5: i16 rowspan = 1
}

struct TableCell {
  1: TableCellContent content
  2: TableCellFormat format
}

struct TableRow {
  1: list<TableCell> cells
}

struct Table {
  1: string title
  2: list<TableRow> header
  3: list<TableRow> body
  4: list<TableRow> footer
}

enum Event {
  EACH_DAY, EACH_MONTH, CASH_FLOW, FINISH
}


enum ResultType {
  TABLE, PIE_CHART, LINE_CHART, BAR_CHART
}

union Result {
  1: Table table
  2: PieChart pie_chart
  3: LineChart line_chart
  4: BarChart bar_chart
}

struct Position {
  1: SecurityId id
  2: double value
  3: double rentability
  4: double avg_price
  5: double shares
}

/**
 * Criado na versão 0.2.1
 */
union Settlement {
  1: Date date
  2: i16 period
}

/**
 * Criado na versão 0.2.1
 */
struct Provision {
  1: double value
  2: string description
  3: Settlement settlement
}

struct Portfolio {
  1: Date date
  2: list<Position> positions
  3: double rentability
  4: double nav
  5: double cash
  /**
   * Criado na versão 0.2.1
   */
  6: list<Provision> provisions
}

struct AnalyzerConfig {
  1: string id
  2: string name
  3: ResultType result_type
  4: set<Event> accepted_events
}

struct Price {
  1: Date date
  2: double close
}

enum CashFlowType {
  DIVIDEND, INTEREST_ON_OWN_CAPITAL, DEPOSIT, WITHDRAWAL
}

struct CashFlow {
  1: Date date
  2: double value
  3: double balance
  4: CashFlowType type
}

struct DailyFundData {
  1: double price
  2: Date date
  3: double nav
}

service FundService {
  string name(1: FundId id)
  string short_name(1: FundId id)
  DailyFundData daily_data(1: FundId id, 2: Date date)
}

service SecurityService {
  string short_name(1: SecurityId id)
  list<Price> prices(1: SecurityId id, 2: Date start_date, 3: Date end_date)
  double price(1: SecurityId id, 2: Date date)
  double price_change(1: SecurityId id, 2: Date start_date, 3: Date end_date)
  list<double> price_changes(1: SecurityId id, 2: Date start_date, 3: Date end_date)
  double price_volatility(1: SecurityId id, 2: Date start_date, 3: Date end_date)
}

service IndexService {
  list<Price> prices(1: string symbol, 2: Date start_date, 3: Date end_date)
  double price(1: string symbol, 2: Date date)
  double price_change(1: string symbol, 2: Date start_date, 3: Date end_date)
}

/**
 *
 * O AnalyzerController deve ser implementado pela app e seus métodos são chamados pelo Radar.
 *
 * Suas funções principais são registrar os analyzers, controlar o ciclo de vida das sessões dos analyzers e repassar os eventos para os mesmos.
 *
 * Método que registra os analyzers: <a href="#Fn_AnalyzerController_analyzers">analyzers</a>
 *
 * Métodos que controlam o ciclo de vida da sessão:
 * <a href="#Fn_AnalyzerController_create_session">create_session</a> (criação),
 * <a href="#Fn_AnalyzerController_result">result</a> (destruição)
 *
 * Métodos que devem repassar o controle para os analyzers:
 * <a href="#Fn_AnalyzerController_create_session">on_each_day</a>,
 * <a href="#Fn_AnalyzerController_on_each_month">on_each_month</a>,
 * <a href="#Fn_AnalyzerController_on_finish">on_finish</a>,
 * <a href="#Fn_AnalyzerController_on_cash_flow">on_cash_flow</a>,
 * <a href="#Fn_AnalyzerController_dump">dump</a>,
 * <a href="#Fn_AnalyzerController_resume">resume</a>,
 * <a href="#Fn_AnalyzerController_result">result</a>,
 * <a href="#Fn_AnalyzerController_example_result">example_result</a>
 *
 */
service AnalyzerController {

  /**
   * É chamado quando
   *
   */
  list<AnalyzerConfig> analyzers()

  /**
   * É chamado <i>n</i> vezes durante o processamento da carteira, sendo
   * <i>n</i> o número de dias processados.
   *
   * <code>portfolio</code> Estado da carteira no dia que está sendo processado.
   */
  oneway void on_each_day(1: SessionId sessionid, 2: Portfolio portfolio)

  /**
   * É chamado no final de cada mes durante o processamento da carteira.
   *
   * <code>portfolio</code> Estado da carteira no último dia do mes.
   */
  oneway void on_each_month(1: SessionId sessionid, 2: Portfolio portfolio)

  /**
   * É chamado ao final do processamento da carteira.
   *
   * <code>portfolio</code> Estado da carteira no último dia de processamento.
   */
  oneway void on_finish(1: SessionId session_id, 2: Portfolio portfolio)

  oneway void on_cash_flow(1: SessionId session_id, 2: CashFlow cash_flow)

  /**
   * É chamado antes do processamento para o Radar receber as configurações do analyzer.
   */
  AnalyzerConfig create_session(1: SessionId session_id, 2: string analyzer_id)

  /**
   * É chamado sempre que o Radar quiser gerar uma imagem do estado atual do serviço
   * para poder restaurar nos próximos processamentos.
   *
   * O retorno pode ter qualquer formato, desde que seja compreendido pelo método
   * <code>resume()</code>, já que posteriormente o conteúdo do retorno será
   * passado como argumento para o método.
   */
  binary dump(1: SessionId session_id)

  /**
   * É chamado sempre que o Radar quiser começar a processar uma carteira à partir de
   * uma imagem gerada pelo método <code>dump()</code>.
   */
  oneway void resume(1: SessionId session_id, 2: binary data)

  /**
   * É chamado no fim do processamento para pegar o resultado do Analyzer.
   */
  Result result(1: SessionId session_id)

  /**
   * É chamado no preview para exibir um exemplo de resultado do Analyzer.
   */
  void example_result(1: SessionId session_id)

  oneway void destroy_session(1: SessionId session_id)
}

