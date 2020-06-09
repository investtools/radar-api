namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'

exception AuthenticationError {
  1: string message
}

exception SystemUnavailableError {
  1: string message
}


service TransactionImporter {
  bool authenticate(1: string username, 2: string password, 3: string user) throws (100: common.ApplicationError app_error, 1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
  void fetch(1: string username, 2: string password, 3: string user, 4: common.Date last_transaction_date) throws (100: common.ApplicationError app_error, 1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
  map<common.SecurityId,i32> fetch_portfolio(1: string username, 2: string password, 3: common.Date stock_position_date, 4: common.Date option_position_date) throws (100: common.ApplicationError app_error, 1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
}
