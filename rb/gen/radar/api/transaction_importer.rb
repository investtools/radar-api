#
# Autogenerated by Thrift Compiler (0.12.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'radar/api/transaction_importer_types'

module Radar
  module Api
    module TransactionImporter
      class Client
        include ::Thrift::Client

        def authenticate(username, password, user)
          send_authenticate(username, password, user)
          return recv_authenticate()
        end

        def send_authenticate(username, password, user)
          send_message('authenticate', Authenticate_args, :username => username, :password => password, :user => user)
        end

        def recv_authenticate()
          result = receive_message(Authenticate_result)
          return result.success unless result.success.nil?
          raise result.auth_error unless result.auth_error.nil?
          raise result.system_unavailable unless result.system_unavailable.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'authenticate failed: unknown result')
        end

        def fetch(username, password, user, last_transaction_date)
          send_fetch(username, password, user, last_transaction_date)
          recv_fetch()
        end

        def send_fetch(username, password, user, last_transaction_date)
          send_message('fetch', Fetch_args, :username => username, :password => password, :user => user, :last_transaction_date => last_transaction_date)
        end

        def recv_fetch()
          result = receive_message(Fetch_result)
          raise result.auth_error unless result.auth_error.nil?
          raise result.system_unavailable unless result.system_unavailable.nil?
          return
        end

        def fetch_portfolio(username, password)
          send_fetch_portfolio(username, password)
          return recv_fetch_portfolio()
        end

        def send_fetch_portfolio(username, password)
          send_message('fetch_portfolio', Fetch_portfolio_args, :username => username, :password => password)
        end

        def recv_fetch_portfolio()
          result = receive_message(Fetch_portfolio_result)
          return result.success unless result.success.nil?
          raise result.auth_error unless result.auth_error.nil?
          raise result.system_unavailable unless result.system_unavailable.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'fetch_portfolio failed: unknown result')
        end

      end

      class Processor
        include ::Thrift::Processor

        def process_authenticate(seqid, iprot, oprot)
          args = read_args(iprot, Authenticate_args)
          result = Authenticate_result.new()
          begin
            result.success = @handler.authenticate(args.username, args.password, args.user)
          rescue ::Radar::Api::AuthenticationError => auth_error
            result.auth_error = auth_error
          rescue ::Radar::Api::SystemUnavailableError => system_unavailable
            result.system_unavailable = system_unavailable
          end
          write_result(result, oprot, 'authenticate', seqid)
        end

        def process_fetch(seqid, iprot, oprot)
          args = read_args(iprot, Fetch_args)
          result = Fetch_result.new()
          begin
            @handler.fetch(args.username, args.password, args.user, args.last_transaction_date)
          rescue ::Radar::Api::AuthenticationError => auth_error
            result.auth_error = auth_error
          rescue ::Radar::Api::SystemUnavailableError => system_unavailable
            result.system_unavailable = system_unavailable
          end
          write_result(result, oprot, 'fetch', seqid)
        end

        def process_fetch_portfolio(seqid, iprot, oprot)
          args = read_args(iprot, Fetch_portfolio_args)
          result = Fetch_portfolio_result.new()
          begin
            result.success = @handler.fetch_portfolio(args.username, args.password)
          rescue ::Radar::Api::AuthenticationError => auth_error
            result.auth_error = auth_error
          rescue ::Radar::Api::SystemUnavailableError => system_unavailable
            result.system_unavailable = system_unavailable
          end
          write_result(result, oprot, 'fetch_portfolio', seqid)
        end

      end

      # HELPER FUNCTIONS AND STRUCTURES

      class Authenticate_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        USERNAME = 1
        PASSWORD = 2
        USER = 3

        FIELDS = {
          USERNAME => {:type => ::Thrift::Types::STRING, :name => 'username'},
          PASSWORD => {:type => ::Thrift::Types::STRING, :name => 'password'},
          USER => {:type => ::Thrift::Types::STRING, :name => 'user'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Authenticate_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0
        AUTH_ERROR = 1
        SYSTEM_UNAVAILABLE = 2

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::BOOL, :name => 'success'},
          AUTH_ERROR => {:type => ::Thrift::Types::STRUCT, :name => 'auth_error', :class => ::Radar::Api::AuthenticationError},
          SYSTEM_UNAVAILABLE => {:type => ::Thrift::Types::STRUCT, :name => 'system_unavailable', :class => ::Radar::Api::SystemUnavailableError}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Fetch_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        USERNAME = 1
        PASSWORD = 2
        USER = 3
        LAST_TRANSACTION_DATE = 4

        FIELDS = {
          USERNAME => {:type => ::Thrift::Types::STRING, :name => 'username'},
          PASSWORD => {:type => ::Thrift::Types::STRING, :name => 'password'},
          USER => {:type => ::Thrift::Types::STRING, :name => 'user'},
          LAST_TRANSACTION_DATE => {:type => ::Thrift::Types::I64, :name => 'last_transaction_date'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Fetch_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        AUTH_ERROR = 1
        SYSTEM_UNAVAILABLE = 2

        FIELDS = {
          AUTH_ERROR => {:type => ::Thrift::Types::STRUCT, :name => 'auth_error', :class => ::Radar::Api::AuthenticationError},
          SYSTEM_UNAVAILABLE => {:type => ::Thrift::Types::STRUCT, :name => 'system_unavailable', :class => ::Radar::Api::SystemUnavailableError}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Fetch_portfolio_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        USERNAME = 1
        PASSWORD = 2

        FIELDS = {
          USERNAME => {:type => ::Thrift::Types::STRING, :name => 'username'},
          PASSWORD => {:type => ::Thrift::Types::STRING, :name => 'password'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Fetch_portfolio_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0
        AUTH_ERROR = 1
        SYSTEM_UNAVAILABLE = 2

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::MAP, :name => 'success', :key => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::SecurityId}, :value => {:type => ::Thrift::Types::I32}},
          AUTH_ERROR => {:type => ::Thrift::Types::STRUCT, :name => 'auth_error', :class => ::Radar::Api::AuthenticationError},
          SYSTEM_UNAVAILABLE => {:type => ::Thrift::Types::STRUCT, :name => 'system_unavailable', :class => ::Radar::Api::SystemUnavailableError}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

    end

  end
end
