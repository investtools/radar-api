namespace rb Radar.Api
namespace java br.com.investtools.radar.api

include 'common.thrift'
include 'transaction.thrift'

struct Price {
  1: common.Date date
  2: double close
}

struct DailyFundData {
  1: double price
  2: common.Date date
  3: double nav
}

struct SecurityPosition {
  1: string symbol
  2: i32 shares 
}

struct MonthlyPosition {
  1: common.Date date
  2: list<SecurityPosition> position
}

service PortfolioService {
  list<MonthlyPosition> run_portfolio(1: list<transaction.Transaction> trxs)
}

service FundService {
  string name(1: common.FundId id)
  string short_name(1: common.FundId id)
  DailyFundData daily_data(1: common.FundId id, 2: common.Date date)
}

service SecurityService {
  string short_name(1: common.SecurityId id)
  list<Price> prices(1: common.SecurityId id, 2: common.Date start_date, 3: common.Date end_date)
  double price(1: common.SecurityId id, 2: common.Date date)
  double price_change(1: common.SecurityId id, 2: common.Date start_date, 3: common.Date end_date)
  list<double> price_changes(1: common.SecurityId id, 2: common.Date start_date, 3: common.Date end_date)
  double price_volatility(1: common.SecurityId id, 2: common.Date start_date, 3: common.Date end_date)
}

service IndexService {
  list<Price> prices(1: string symbol, 2: common.Date start_date, 3: common.Date end_date)
  double price(1: string symbol, 2: common.Date date)
  double price_change(1: string symbol, 2: common.Date start_date, 3: common.Date end_date)
}

service CalendarService {
  common.Date advance(1: string calendar, 2: common.Date date, 3: i16 n)
  common.Date back(1: string calendar, 2: common.Date date, 3: i16 n)
  common.Date first_business_day(1: string calendar, 2: common.Date date)
}
