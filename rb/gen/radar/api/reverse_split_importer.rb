#
# Autogenerated by Thrift Compiler (0.10.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'radar/api/reverse_split_importer_types'

module Radar
  module Api
    module ReverseSplitImporter
      class Client
        include ::Thrift::Client

        def fetch(securities)
          send_fetch(securities)
          return recv_fetch()
        end

        def send_fetch(securities)
          send_message('fetch', Fetch_args, :securities => securities)
        end

        def recv_fetch()
          result = receive_message(Fetch_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'fetch failed: unknown result')
        end

      end

      class Processor
        include ::Thrift::Processor

        def process_fetch(seqid, iprot, oprot)
          args = read_args(iprot, Fetch_args)
          result = Fetch_result.new()
          result.success = @handler.fetch(args.securities)
          write_result(result, oprot, 'fetch', seqid)
        end

      end

      # HELPER FUNCTIONS AND STRUCTURES

      class Fetch_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SECURITIES = 1

        FIELDS = {
          SECURITIES => {:type => ::Thrift::Types::LIST, :name => 'securities', :element => {:type => ::Thrift::Types::STRING}}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Fetch_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::LIST, :name => 'success', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::ReverseSplit}}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

    end

  end
end
