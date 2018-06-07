namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'
include 'transaction.thrift'
include 'portfolio.thrift'

exception AuthenticationError {
  1: string message
}

exception SystemUnavailableError {
  1: string message
}

service TransactionImporter {
  string name()
  void fetch(1: string username, 2: string password, 3: string user, 4: common.Date last_transaction_date) throws (1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
  list<portfolio.SimplePosition> portfolio(1: string username, 2: string password) throws (1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
}
