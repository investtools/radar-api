#
# Autogenerated by Thrift Compiler (0.9.2)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'transaction_sync_types'

module Radar
  module Api
    module TransactionSynchronizerController
      class Client
        include ::Thrift::Client

        def synchronizers()
          send_synchronizers()
          return recv_synchronizers()
        end

        def send_synchronizers()
          send_message('synchronizers', Synchronizers_args)
        end

        def recv_synchronizers()
          result = receive_message(Synchronizers_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'synchronizers failed: unknown result')
        end

        def sync(synchronizer_id)
          send_sync(synchronizer_id)
          return recv_sync()
        end

        def send_sync(synchronizer_id)
          send_message('sync', Sync_args, :synchronizer_id => synchronizer_id)
        end

        def recv_sync()
          result = receive_message(Sync_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'sync failed: unknown result')
        end

      end

      class Processor
        include ::Thrift::Processor

        def process_synchronizers(seqid, iprot, oprot)
          args = read_args(iprot, Synchronizers_args)
          result = Synchronizers_result.new()
          result.success = @handler.synchronizers()
          write_result(result, oprot, 'synchronizers', seqid)
        end

        def process_sync(seqid, iprot, oprot)
          args = read_args(iprot, Sync_args)
          result = Sync_result.new()
          result.success = @handler.sync(args.synchronizer_id)
          write_result(result, oprot, 'sync', seqid)
        end

      end

      # HELPER FUNCTIONS AND STRUCTURES

      class Synchronizers_args
        include ::Thrift::Struct, ::Thrift::Struct_Union

        FIELDS = {

        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Synchronizers_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::LIST, :name => 'success', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::TransactionSynchronizerConfig}}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Sync_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SYNCHRONIZER_ID = 1

        FIELDS = {
          SYNCHRONIZER_ID => {:type => ::Thrift::Types::STRING, :name => 'synchronizer_id'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Sync_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::LIST, :name => 'success', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::Transaction}}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

    end

  end
end
