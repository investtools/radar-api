namespace rb Radar.API
namespace java br.com.investtools.radar.api

/**
 * Representação <i><a href="http://en.wikipedia.org/wiki/Unix_time">Unix time</a></i>
 * no horário 00:00:00.00 UTC.
 */
typedef i32 Date

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

enum TableLineType {
  HEADER, BODY, FOOTER
}

struct TableLine {
  1: TableLineType type = TableLineType.HEADER
  2: list<string> cells
}

struct Table {
  1: string title
  2: list<TableLine> lines
}



enum AnalyzerOutputType {
  PIE, LINE
}

union AnalyzerOutputContent {
  1: PieChart pie
  2: LineChart line
}

struct AnalyzerOutput {
  1: AnalyzerOutputType type
  2: AnalyzerOutputContent content
}

struct Portfolio {
  1: required Date date
  2: double rentability
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
   * Este método deve retornar o nome deste serviço.
   */
  string id()

  /**
   * É chamado no fim do processamento para pegar o resultado do Analyzer.
   */
  LineChart result()
}

