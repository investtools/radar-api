namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'

enum StockBuyTransactionType {
  REGULAR = 1, IPO = 2
}

struct StockSellTransaction {
  1: common.Date date
  2: string account
  3: common.StockId stock
  4: i32 shares
  5: double price
}

struct StockBuyTransaction {
  1: common.Date date
  2: string account
  3: common.StockId stock
  4: i32 shares
  5: double price
  6: StockBuyTransactionType type = 1
}

struct StockLendingTransaction {
  1: common.Date date
  2: string account
  3: common.StockId stock
  4: i32 shares
  5: double price
  6: double rate
  7: commom.Date due
}

struct StockLendingReturningTransaction {
  1: common.Date date
  2: string account
  3: common.StockId stock
  4: i32 shares
  5: double credit
}

union Transaction {
  1: StockBuyTransaction stock_buy
  2: StockSellTransaction stock_sell
  3: StockLendingTransaction stock_lending
  4: StockLendingReturningTransaction stock_lending_returning
}

struct Account {
  1: string id
  2: common.Date last_transaction_date
}

exception AuthenticationError {
  1: string message
}

exception SystemUnavailableError {
  1: string message
}

service TransactionImporter {
  string name()
  map<string, string> accounts(1: string username, 2: string password) throws (1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
  list<Transaction> fetch(1: string username, 2: string password, 3: list<Account> accounts)  throws (1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
}
