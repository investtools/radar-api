namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'

exception AuthenticationError {
  1: string message
}

exception SystemUnavailableError {
  1: string message
}

struct FetchedPortfolio {
  1: common.Date date
  2: map<common.SecurityId,i32> portfolio
}

service TransactionImporter {
  bool authenticate(1: string username, 2: string password, 3: string user) throws (100: common.ApplicationError app_error, 1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
  void fetch(1: string username, 2: string password, 3: string user, 4: common.Date last_transaction_date) throws (100: common.ApplicationError app_error, 1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
  FetchedPortfolio fetch_portfolio(1: string username, 2: string password, 3: common.Date date) throws (100: common.ApplicationError app_error, 1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
}
