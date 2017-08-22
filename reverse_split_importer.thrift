namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'

struct ReverseSplit {
  1: common.Date date
  2: double ratio
  3: common.StockId stock
}

service ReverseSplitImporter {
  list<ReverseSplit> fetch(1: list<string> securities)
}
