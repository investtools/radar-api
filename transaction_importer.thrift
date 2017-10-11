namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'
include 'transaction.thrift'

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
  list<transaction.Transaction> fetch(1: string username, 2: string password, 3: list<Account> accounts) throws (1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
}
