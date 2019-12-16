namespace rb Radar.Api
namespace java br.com.investtools.radar.api

/**
 * Representação <i><a href="http://en.wikipedia.org/wiki/Unix_time">Unix time</a></i>
 * no horário 00:00:00.00 UTC.
 */
typedef i64 Date

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

struct CorporateBondId {
  1: IndexId index
  2: double factor
  5: double rate
  3: Date base_date
  4: Date maturity_date
}

struct GovernmentBondId {
  1: string name
  2: Date maturity_date
}

struct CustomSecurityId {
  1: string user_id
  2: string id
}

union SecurityId {
  1: StockId stock
  2: FundId fund
  3: CorporateBondId corporate_bond
  4: GovernmentBondId government_bond
  5: CustomSecurityId custom_security
}

struct Broker {
  1: string code
  2: string name
  3: string segment
}

exception ApplicationError {
  1: string message
  2: list<string> stacktrace
}
