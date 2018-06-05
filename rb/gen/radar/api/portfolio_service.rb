#
# Autogenerated by Thrift Compiler (0.10.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'radar/api/data_server_types'

module Radar
  module Api
    module PortfolioService
      class Client
        include ::Thrift::Client

        def run_portfolio(trxs, reports_dates, user, portfolio)
          send_run_portfolio(trxs, reports_dates, user, portfolio)
          return recv_run_portfolio()
        end

        def send_run_portfolio(trxs, reports_dates, user, portfolio)
          send_message('run_portfolio', Run_portfolio_args, :trxs => trxs, :reports_dates => reports_dates, :user => user, :portfolio => portfolio)
        end

        def recv_run_portfolio()
          result = receive_message(Run_portfolio_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'run_portfolio failed: unknown result')
        end

      end

      class Processor
        include ::Thrift::Processor

        def process_run_portfolio(seqid, iprot, oprot)
          args = read_args(iprot, Run_portfolio_args)
          result = Run_portfolio_result.new()
          result.success = @handler.run_portfolio(args.trxs, args.reports_dates, args.user, args.portfolio)
          write_result(result, oprot, 'run_portfolio', seqid)
        end

      end

      # HELPER FUNCTIONS AND STRUCTURES

      class Run_portfolio_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        TRXS = 1
        REPORTS_DATES = 2
        USER = 3
        PORTFOLIO = 4

        FIELDS = {
          TRXS => {:type => ::Thrift::Types::LIST, :name => 'trxs', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::Transaction}},
          REPORTS_DATES => {:type => ::Thrift::Types::LIST, :name => 'reports_dates', :element => {:type => ::Thrift::Types::I64}},
          USER => {:type => ::Thrift::Types::STRING, :name => 'user'},
          PORTFOLIO => {:type => ::Thrift::Types::STRING, :name => 'portfolio'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Run_portfolio_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::LIST, :name => 'success', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::MonthlyPosition}}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

    end

  end
end
