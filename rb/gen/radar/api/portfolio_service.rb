#
# Autogenerated by Thrift Compiler (0.12.0)
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

        def run_portfolio(trxs, reports_dates, user)
          send_run_portfolio(trxs, reports_dates, user)
          return recv_run_portfolio()
        end

        def send_run_portfolio(trxs, reports_dates, user)
          send_message('run_portfolio', Run_portfolio_args, :trxs => trxs, :reports_dates => reports_dates, :user => user)
        end

        def recv_run_portfolio()
          result = receive_message(Run_portfolio_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'run_portfolio failed: unknown result')
        end

        def persist(trxs, user)
          send_persist(trxs, user)
          recv_persist()
        end

        def send_persist(trxs, user)
          send_message('persist', Persist_args, :trxs => trxs, :user => user)
        end

        def recv_persist()
          result = receive_message(Persist_result)
          return
        end

      end

      class Processor
        include ::Thrift::Processor

        def process_run_portfolio(seqid, iprot, oprot)
          args = read_args(iprot, Run_portfolio_args)
          result = Run_portfolio_result.new()
          result.success = @handler.run_portfolio(args.trxs, args.reports_dates, args.user)
          write_result(result, oprot, 'run_portfolio', seqid)
        end

        def process_persist(seqid, iprot, oprot)
          args = read_args(iprot, Persist_args)
          result = Persist_result.new()
          @handler.persist(args.trxs, args.user)
          write_result(result, oprot, 'persist', seqid)
        end

      end

      # HELPER FUNCTIONS AND STRUCTURES

      class Run_portfolio_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        TRXS = 1
        REPORTS_DATES = 2
        USER = 3

        FIELDS = {
          TRXS => {:type => ::Thrift::Types::LIST, :name => 'trxs', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::Transaction}},
          REPORTS_DATES => {:type => ::Thrift::Types::LIST, :name => 'reports_dates', :element => {:type => ::Thrift::Types::I64}},
          USER => {:type => ::Thrift::Types::STRING, :name => 'user'}
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

      class Persist_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        TRXS = 1
        USER = 2

        FIELDS = {
          TRXS => {:type => ::Thrift::Types::LIST, :name => 'trxs', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::Transaction}},
          USER => {:type => ::Thrift::Types::STRING, :name => 'user'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Persist_result
        include ::Thrift::Struct, ::Thrift::Struct_Union

        FIELDS = {

        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

    end

  end
end
