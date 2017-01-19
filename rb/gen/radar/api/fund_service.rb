#
# Autogenerated by Thrift Compiler (0.9.3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'radar/api/data_server_types'

module Radar
  module Api
    module FundService
      class Client
        include ::Thrift::Client

        def name(id)
          send_name(id)
          return recv_name()
        end

        def send_name(id)
          send_message('name', Name_args, :id => id)
        end

        def recv_name()
          result = receive_message(Name_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'name failed: unknown result')
        end

        def short_name(id)
          send_short_name(id)
          return recv_short_name()
        end

        def send_short_name(id)
          send_message('short_name', Short_name_args, :id => id)
        end

        def recv_short_name()
          result = receive_message(Short_name_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'short_name failed: unknown result')
        end

        def daily_data(id, date)
          send_daily_data(id, date)
          return recv_daily_data()
        end

        def send_daily_data(id, date)
          send_message('daily_data', Daily_data_args, :id => id, :date => date)
        end

        def recv_daily_data()
          result = receive_message(Daily_data_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'daily_data failed: unknown result')
        end

      end

      class Processor
        include ::Thrift::Processor

        def process_name(seqid, iprot, oprot)
          args = read_args(iprot, Name_args)
          result = Name_result.new()
          result.success = @handler.name(args.id)
          write_result(result, oprot, 'name', seqid)
        end

        def process_short_name(seqid, iprot, oprot)
          args = read_args(iprot, Short_name_args)
          result = Short_name_result.new()
          result.success = @handler.short_name(args.id)
          write_result(result, oprot, 'short_name', seqid)
        end

        def process_daily_data(seqid, iprot, oprot)
          args = read_args(iprot, Daily_data_args)
          result = Daily_data_result.new()
          result.success = @handler.daily_data(args.id, args.date)
          write_result(result, oprot, 'daily_data', seqid)
        end

      end

      # HELPER FUNCTIONS AND STRUCTURES

      class Name_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        ID = 1

        FIELDS = {
          ID => {:type => ::Thrift::Types::STRUCT, :name => 'id', :class => ::Radar::Api::FundId}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Name_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::STRING, :name => 'success'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Short_name_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        ID = 1

        FIELDS = {
          ID => {:type => ::Thrift::Types::STRUCT, :name => 'id', :class => ::Radar::Api::FundId}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Short_name_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::STRING, :name => 'success'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Daily_data_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        ID = 1
        DATE = 2

        FIELDS = {
          ID => {:type => ::Thrift::Types::STRUCT, :name => 'id', :class => ::Radar::Api::FundId},
          DATE => {:type => ::Thrift::Types::I64, :name => 'date'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Daily_data_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::STRUCT, :name => 'success', :class => ::Radar::Api::DailyFundData}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

    end

  end
end
