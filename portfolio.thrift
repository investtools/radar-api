namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'

struct Security {
  1: string account
  2: common.StockId stock
  3: i32 shares
}

struct Lending {
  1: string account
  2: common.StockId stock
  3: i32 shares
}

struct Borrowing {
  1: string account
  2: common.StockId stock
  3: i32 shares
}

union SimplePosition {
  1: Security security
  2: Lending lending
  3: Borrowing borrowing
}
