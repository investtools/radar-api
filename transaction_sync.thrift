namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'

union Transaction {
  1: StockBuyTransaction stock_buy
  2: StockSellTransaction stock_sell
}

enum StockBuyTransactionType {
  REGULAR = 1, IPO = 2
}

struct StockBuyTransaction {
  1: common.Date date
  2: common.StockId stock
  3: i32 shares
  4: double price
  5: StockBuyTransactionType type = 1
}

struct StockSellTransaction {
  1: common.Date date
  2: common.StockId stock
  3: i32 shares
  4: double price
}

struct TransactionSynchronizerConfig {
  1: string id
  2: string name
}

service TransactionSynchronizerController {
  list<TransactionSynchronizerConfig> synchronizers()
  list<Transaction> sync(1: string synchronizer_id)
}
