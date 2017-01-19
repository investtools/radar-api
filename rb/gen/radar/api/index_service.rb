#
# Autogenerated by Thrift Compiler (0.9.3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'radar/api/data_server_types'

module Radar
  module Api
    module IndexService
      class Client
        include ::Thrift::Client

        def prices(symbol, start_date, end_date)
          send_prices(symbol, start_date, end_date)
          return recv_prices()
        end

        def send_prices(symbol, start_date, end_date)
          send_message('prices', Prices_args, :symbol => symbol, :start_date => start_date, :end_date => end_date)
        end

        def recv_prices()
          result = receive_message(Prices_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'prices failed: unknown result')
        end

        def price(symbol, date)
          send_price(symbol, date)
          return recv_price()
        end

        def send_price(symbol, date)
          send_message('price', Price_args, :symbol => symbol, :date => date)
        end

        def recv_price()
          result = receive_message(Price_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'price failed: unknown result')
        end

        def price_change(symbol, start_date, end_date)
          send_price_change(symbol, start_date, end_date)
          return recv_price_change()
        end

        def send_price_change(symbol, start_date, end_date)
          send_message('price_change', Price_change_args, :symbol => symbol, :start_date => start_date, :end_date => end_date)
        end

        def recv_price_change()
          result = receive_message(Price_change_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'price_change failed: unknown result')
        end

      end

      class Processor
        include ::Thrift::Processor

        def process_prices(seqid, iprot, oprot)
          args = read_args(iprot, Prices_args)
          result = Prices_result.new()
          result.success = @handler.prices(args.symbol, args.start_date, args.end_date)
          write_result(result, oprot, 'prices', seqid)
        end

        def process_price(seqid, iprot, oprot)
          args = read_args(iprot, Price_args)
          result = Price_result.new()
          result.success = @handler.price(args.symbol, args.date)
          write_result(result, oprot, 'price', seqid)
        end

        def process_price_change(seqid, iprot, oprot)
          args = read_args(iprot, Price_change_args)
          result = Price_change_result.new()
          result.success = @handler.price_change(args.symbol, args.start_date, args.end_date)
          write_result(result, oprot, 'price_change', seqid)
        end

      end

      # HELPER FUNCTIONS AND STRUCTURES

      class Prices_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SYMBOL = 1
        START_DATE = 2
        END_DATE = 3

        FIELDS = {
          SYMBOL => {:type => ::Thrift::Types::STRING, :name => 'symbol'},
          START_DATE => {:type => ::Thrift::Types::I64, :name => 'start_date'},
          END_DATE => {:type => ::Thrift::Types::I64, :name => 'end_date'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Prices_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::LIST, :name => 'success', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::Price}}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Price_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SYMBOL = 1
        DATE = 2

        FIELDS = {
          SYMBOL => {:type => ::Thrift::Types::STRING, :name => 'symbol'},
          DATE => {:type => ::Thrift::Types::I64, :name => 'date'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Price_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::DOUBLE, :name => 'success'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Price_change_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SYMBOL = 1
        START_DATE = 2
        END_DATE = 3

        FIELDS = {
          SYMBOL => {:type => ::Thrift::Types::STRING, :name => 'symbol'},
          START_DATE => {:type => ::Thrift::Types::I64, :name => 'start_date'},
          END_DATE => {:type => ::Thrift::Types::I64, :name => 'end_date'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Price_change_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::DOUBLE, :name => 'success'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

    end

  end
end
