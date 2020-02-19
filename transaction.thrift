namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'

enum SecurityLendingAndBorrowingType {
  LENDER = 1, BORROWER = 2
}

enum TransferType {
  IN = 1, OUT = 2
}

struct EquityBuy {
  1: common.Date date
  2: common.EquityId equity
  3: i32 shares
  4: double price
}

struct EquitySell {
  1: common.Date date
  2: common.EquityId equity
  3: i32 shares
  4: double price
}

struct EquityPositionSnapshot {
  1: common.Date date
  2: common.EquityId equity
  3: i32 shares
  4: double price
}

struct SecurityLendingAndBorrowing {
  1: common.Date date
  2: common.EquityId stock
  3: i32 shares
  4: double rate
  5: common.Date due
  6: SecurityLendingAndBorrowingType type
  7: string contract
}

struct SecurityLendingAndBorrowingReturning {
  1: common.Date date
  2: common.EquityId stock
  3: i32 shares
  4: double value
  5: SecurityLendingAndBorrowingType type
}

struct CommissionExpense {
  1: common.Date date
  2: double amount
  3: string description
}

struct Transfer {
  1: common.Date date
  2: common.EquityId stock
  3: i32 shares
  4: TransferType type
}

struct OptionExercise {
  1: common.Date date
  2: common.EquityId option
  3: i32 shares
  4: double strike
}

union Transaction {
  1: EquityBuy equity_buy
  2: EquitySell equity_sell
  3: EquityPositionSnapshot equity_position_snapshot
  4: SecurityLendingAndBorrowing slb
  5: SecurityLendingAndBorrowingReturning slbr
  6: CommissionExpense stock_commission_expense
  7: Transfer transfer
  8: OptionExercise option_exercise
}
