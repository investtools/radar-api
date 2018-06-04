namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'

enum StockBuyTransactionType {
  REGULAR = 1, IPO = 2
}

enum StockOptionTransactionType {
  BUY = 1, SELL = 2
}

enum SecurityLendingAndBorrowingType {
  LENDER = 1, BORROWER = 2
}

struct StockSell {
  1: common.Date date
  2: common.StockId stock
  3: i32 shares
  4: double price
}

struct StockBuy {
  1: common.Date date
  2: common.StockId stock
  3: i32 shares
  4: double price
  5: StockBuyTransactionType type = 1
}

struct Subscription {
  1: common.Date date
  2: common.StockId stock
  3: i32 shares
}

struct StockOption {
  1: common.Date date
  2: common.StockId stock
  3: i32 shares
  4: double price
  5: common.Date maturity
  6: StockOptionTransactionType transaction_type
  7: StockBuyTransactionType type = 1
}

struct SecurityLendingAndBorrowing {
  1: common.Date date
  2: common.StockId stock
  3: i32 shares
  4: double rate
  5: common.Date due
  6: SecurityLendingAndBorrowingType type
}

struct SecurityLendingAndBorrowingReturning {
  1: common.Date date
  2: common.StockId stock
  3: i32 shares
  4: double value
  5: SecurityLendingAndBorrowingType type
}

struct CommissionExpense {
  1: common.Date date
  2: double amount
  3: string description
}

union Transaction {
  1: StockBuy stock_buy
  2: StockSell stock_sell
  3: SecurityLendingAndBorrowing slb
  4: SecurityLendingAndBorrowingReturning slbr
  5: CommissionExpense stock_commission_expense
  6: StockOption stock_option
  7: Subscription subscription
}
