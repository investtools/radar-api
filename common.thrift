namespace rb Radar.Api
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
  2: double factor
  3: Date base_date
  4: Date maturity_date
}

union SecurityId {
  1: StockId stock
  2: FundId fund
  3: IndexLinkedBondId index_linked_bond
}

