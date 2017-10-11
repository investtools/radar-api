namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'transaction.thrift'

exception WrongFileStructure {
  1: string message
}

service TransactionFileImporter {
  list<transaction.Transaction> extract(1: string data) throws (1: WrongFileStructure col_quantity_error)
}
