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
  2: double fator
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
}

struct BarChart {
  1: string title
  2: list<BarSeries> series
  3: list<string> categories
}

struct Text {
  1: string title
  2: string content
}

union TableCellContent {
  1: string text
  2: double percent
  3: double currency
}

struct TableCellFormat {
  1: bool bold
  2: bool italic
  3: Color color
  4: i16 colspan
  5: i16 rowspan
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
  EACH_DAY, EACH_MONTH, FINISH
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
}

struct Portfolio {
  1: required Date date
  2: double rentability
  3: double nav
  4: map<string, Position> positions
}

struct AnalyzerConfig {
  1: required string id
  2: required ResultType result_type
  3: required set<Event> accepted_events
}

service Analyzer {
  /**
   * É chamado <i>n</i> vezes durante o processamento da carteira, sendo
   * <i>n</i> o número de dias processados.
   *
   * <code>portfolio</code> Estado da carteira no dia que está sendo processado.
   */
  oneway void on_each_day(1: Portfolio portfolio)

  /**
   * É chamado ao final do processamento da carteira.
   *
   * <code>portfolio</code> Estado da carteira no último dia de processamento.
   */
  oneway void on_finish(1: Portfolio portfolio)

  /**
   * É chamado antes do processamento para o Radar receber as configurações do analyzer.
   */
  AnalyzerConfig handshake()

  /**
   * É chamado sempre que o Radar quiser gerar uma imagem do estado atual do serviço
   * para poder restaurar nos próximos processamentos.
   *
   * O retorno pode ter qualquer formato, desde que seja compreendido pelo método
   * <code>resume()</code>, já que posteriormente o conteúdo do retorno será
   * passado como argumento para o método.
   */
  binary dump()

  /**
   * É chamado sempre que o Radar quiser começar a processar uma carteira à partir de
   * uma imagem gerada pelo método <code>dump()</code>.
   */
  oneway void resume(1: binary data)

  /**
   * É chamado no fim do processamento para pegar o resultado do Analyzer.
   */
  LineChart result()
}

