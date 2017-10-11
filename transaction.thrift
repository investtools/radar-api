namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'

enum StockBuyTransactionType {
  REGULAR = 1, IPO = 2
}

struct StockSell {
  1: common.Date date
  2: string account
  3: common.StockId stock
  4: i32 shares
  5: double price
}

struct StockBuy {
  1: common.Date date
  2: string account
  3: common.StockId stock
  4: i32 shares
  5: double price
  6: StockBuyTransactionType type = 1
}

struct StockLending {
  1: common.Date date
  2: string account
  3: common.StockId stock
  4: i32 shares
  5: double price
  6: double rate
  7: common.Date due
}

struct StockLendingReturning {
  1: common.Date date
  2: string account
  3: common.StockId stock
  4: i32 shares
  5: double credit
}

struct CommissionExpense {
  1: common.Date date
  2: double amount
  3: string description
}

union Transaction {
  1: StockBuy stock_buy
  2: StockSell stock_sell
  3: StockLending stock_lending
  4: StockLendingReturning stock_lending_returning
  5: CommissionExpense stock_commission_expense
}