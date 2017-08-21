namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'

typedef i16 SessionId

struct Point {
  1: common.Date x
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
  3: common.Color color
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
  1: common.SecurityId id
  2: double value
  3: double rentability
  4: double avg_price
  5: double shares
  6: double paid_value
}

/**
 * Criado na versão 0.2.1
 */
union Settlement {
  1: common.Date date
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
  1: common.Date date
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

enum CashFlowType {
  DIVIDEND, INTEREST_ON_OWN_CAPITAL, DEPOSIT, WITHDRAWAL
}

struct CashFlow {
  1: common.Date date
  2: double value
  3: double balance
  4: CashFlowType type
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

