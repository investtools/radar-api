namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'
include 'transaction.thrift'

exception AuthenticationError {
  1: string message
}

exception SystemUnavailableError {
  1: string message
}

struct RenewResult {
  1: bool error
  2: string original
  3: string current
}

service TransactionImporter {
  void fetch(1: string username, 2: string password, 3: string user, 4: common.Date last_transaction_date) throws (1: AuthenticationError auth_error, 2: SystemUnavailableError system_unavailable)
  RenewResult renew_password(1: string username, 2: string password, 3: string original_pwd)
}
