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

union Transaction {
  1: StockBuyTransaction stock_buy
  2: StockSellTransaction stock_sell
}

struct Account {
  1: string id
  2: common.Date last_transaction_date
}

exception AuthenticationError {
  1: string message
}

exception CEIUnderMaintenance {
  1: string message
}

service TransactionImporter {
  string name()
  map<string, string> accounts(1: string username, 2: string password) throws (1: AuthenticationError auth_error, 2: CEIUnderMaintenance under_maintenance_error)
  list<Transaction> fetch(1: string username, 2: string password, 3: list<Account> accounts)  throws (1: AuthenticationError auth_error, 2: CEIUnderMaintenance under_maintenance_error)
}
