#
# Autogenerated by Thrift Compiler (1.0.0-dev)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'radar_types'

module Radar
  module API
    module AnalyzerController
      class Client
        include ::Thrift::Client

        def analyzers()
          send_analyzers()
          return recv_analyzers()
        end

        def send_analyzers()
          send_message('analyzers', Analyzers_args)
        end

        def recv_analyzers()
          result = receive_message(Analyzers_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'analyzers failed: unknown result')
        end

        def on_each_day(sessionid, portfolio)
          send_on_each_day(sessionid, portfolio)
        end

        def send_on_each_day(sessionid, portfolio)
          send_message('on_each_day', On_each_day_args, :sessionid => sessionid, :portfolio => portfolio)
        end
        def on_each_month(sessionid, portfolio)
          send_on_each_month(sessionid, portfolio)
        end

        def send_on_each_month(sessionid, portfolio)
          send_message('on_each_month', On_each_month_args, :sessionid => sessionid, :portfolio => portfolio)
        end
        def on_finish(session_id, portfolio)
          send_on_finish(session_id, portfolio)
        end

        def send_on_finish(session_id, portfolio)
          send_message('on_finish', On_finish_args, :session_id => session_id, :portfolio => portfolio)
        end
        def on_cash_flow(session_id, cash_flow)
          send_on_cash_flow(session_id, cash_flow)
        end

        def send_on_cash_flow(session_id, cash_flow)
          send_message('on_cash_flow', On_cash_flow_args, :session_id => session_id, :cash_flow => cash_flow)
        end
        def create_session(session_id, analyzer_id)
          send_create_session(session_id, analyzer_id)
          return recv_create_session()
        end

        def send_create_session(session_id, analyzer_id)
          send_message('create_session', Create_session_args, :session_id => session_id, :analyzer_id => analyzer_id)
        end

        def recv_create_session()
          result = receive_message(Create_session_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'create_session failed: unknown result')
        end

        def dump(session_id)
          send_dump(session_id)
          return recv_dump()
        end

        def send_dump(session_id)
          send_message('dump', Dump_args, :session_id => session_id)
        end

        def recv_dump()
          result = receive_message(Dump_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'dump failed: unknown result')
        end

        def resume(session_id, data)
          send_resume(session_id, data)
        end

        def send_resume(session_id, data)
          send_message('resume', Resume_args, :session_id => session_id, :data => data)
        end
        def result(session_id)
          send_result(session_id)
          return recv_result()
        end

        def send_result(session_id)
          send_message('result', Result_args, :session_id => session_id)
        end

        def recv_result()
          result = receive_message(Result_result)
          return result.success unless result.success.nil?
          raise ::Thrift::ApplicationException.new(::Thrift::ApplicationException::MISSING_RESULT, 'result failed: unknown result')
        end

        def example_result(session_id)
          send_example_result(session_id)
          recv_example_result()
        end

        def send_example_result(session_id)
          send_message('example_result', Example_result_args, :session_id => session_id)
        end

        def recv_example_result()
          result = receive_message(Example_result_result)
          return
        end

        def destroy_session(session_id)
          send_destroy_session(session_id)
        end

        def send_destroy_session(session_id)
          send_message('destroy_session', Destroy_session_args, :session_id => session_id)
        end
      end

      class Processor
        include ::Thrift::Processor

        def process_analyzers(seqid, iprot, oprot)
          args = read_args(iprot, Analyzers_args)
          result = Analyzers_result.new()
          result.success = @handler.analyzers()
          write_result(result, oprot, 'analyzers', seqid)
        end

        def process_on_each_day(seqid, iprot, oprot)
          args = read_args(iprot, On_each_day_args)
          @handler.on_each_day(args.sessionid, args.portfolio)
          return
        end

        def process_on_each_month(seqid, iprot, oprot)
          args = read_args(iprot, On_each_month_args)
          @handler.on_each_month(args.sessionid, args.portfolio)
          return
        end

        def process_on_finish(seqid, iprot, oprot)
          args = read_args(iprot, On_finish_args)
          @handler.on_finish(args.session_id, args.portfolio)
          return
        end

        def process_on_cash_flow(seqid, iprot, oprot)
          args = read_args(iprot, On_cash_flow_args)
          @handler.on_cash_flow(args.session_id, args.cash_flow)
          return
        end

        def process_create_session(seqid, iprot, oprot)
          args = read_args(iprot, Create_session_args)
          result = Create_session_result.new()
          result.success = @handler.create_session(args.session_id, args.analyzer_id)
          write_result(result, oprot, 'create_session', seqid)
        end

        def process_dump(seqid, iprot, oprot)
          args = read_args(iprot, Dump_args)
          result = Dump_result.new()
          result.success = @handler.dump(args.session_id)
          write_result(result, oprot, 'dump', seqid)
        end

        def process_resume(seqid, iprot, oprot)
          args = read_args(iprot, Resume_args)
          @handler.resume(args.session_id, args.data)
          return
        end

        def process_result(seqid, iprot, oprot)
          args = read_args(iprot, Result_args)
          result = Result_result.new()
          result.success = @handler.result(args.session_id)
          write_result(result, oprot, 'result', seqid)
        end

        def process_example_result(seqid, iprot, oprot)
          args = read_args(iprot, Example_result_args)
          result = Example_result_result.new()
          @handler.example_result(args.session_id)
          write_result(result, oprot, 'example_result', seqid)
        end

        def process_destroy_session(seqid, iprot, oprot)
          args = read_args(iprot, Destroy_session_args)
          @handler.destroy_session(args.session_id)
          return
        end

      end

      # HELPER FUNCTIONS AND STRUCTURES

      class Analyzers_args
        include ::Thrift::Struct, ::Thrift::Struct_Union

        FIELDS = {

        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Analyzers_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::LIST, :name => 'success', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::API::AnalyzerConfig}}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class On_each_day_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SESSIONID = 1
        PORTFOLIO = 2

        FIELDS = {
          SESSIONID => {:type => ::Thrift::Types::I16, :name => 'sessionid'},
          PORTFOLIO => {:type => ::Thrift::Types::STRUCT, :name => 'portfolio', :class => ::Radar::API::Portfolio}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class On_each_day_result
        include ::Thrift::Struct, ::Thrift::Struct_Union

        FIELDS = {

        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class On_each_month_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SESSIONID = 1
        PORTFOLIO = 2

        FIELDS = {
          SESSIONID => {:type => ::Thrift::Types::I16, :name => 'sessionid'},
          PORTFOLIO => {:type => ::Thrift::Types::STRUCT, :name => 'portfolio', :class => ::Radar::API::Portfolio}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class On_each_month_result
        include ::Thrift::Struct, ::Thrift::Struct_Union

        FIELDS = {

        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class On_finish_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SESSION_ID = 1
        PORTFOLIO = 2

        FIELDS = {
          SESSION_ID => {:type => ::Thrift::Types::I16, :name => 'session_id'},
          PORTFOLIO => {:type => ::Thrift::Types::STRUCT, :name => 'portfolio', :class => ::Radar::API::Portfolio}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class On_finish_result
        include ::Thrift::Struct, ::Thrift::Struct_Union

        FIELDS = {

        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class On_cash_flow_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SESSION_ID = 1
        CASH_FLOW = 2

        FIELDS = {
          SESSION_ID => {:type => ::Thrift::Types::I16, :name => 'session_id'},
          CASH_FLOW => {:type => ::Thrift::Types::STRUCT, :name => 'cash_flow', :class => ::Radar::API::CashFlow}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class On_cash_flow_result
        include ::Thrift::Struct, ::Thrift::Struct_Union

        FIELDS = {

        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Create_session_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SESSION_ID = 1
        ANALYZER_ID = 2

        FIELDS = {
          SESSION_ID => {:type => ::Thrift::Types::I16, :name => 'session_id'},
          ANALYZER_ID => {:type => ::Thrift::Types::STRING, :name => 'analyzer_id'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Create_session_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::STRUCT, :name => 'success', :class => ::Radar::API::AnalyzerConfig}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Dump_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SESSION_ID = 1

        FIELDS = {
          SESSION_ID => {:type => ::Thrift::Types::I16, :name => 'session_id'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Dump_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::STRING, :name => 'success', :binary => true}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Resume_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SESSION_ID = 1
        DATA = 2

        FIELDS = {
          SESSION_ID => {:type => ::Thrift::Types::I16, :name => 'session_id'},
          DATA => {:type => ::Thrift::Types::STRING, :name => 'data', :binary => true}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Resume_result
        include ::Thrift::Struct, ::Thrift::Struct_Union

        FIELDS = {

        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Result_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SESSION_ID = 1

        FIELDS = {
          SESSION_ID => {:type => ::Thrift::Types::I16, :name => 'session_id'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Result_result
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SUCCESS = 0

        FIELDS = {
          SUCCESS => {:type => ::Thrift::Types::STRUCT, :name => 'success', :class => ::Radar::API::Result}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Example_result_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SESSION_ID = 1

        FIELDS = {
          SESSION_ID => {:type => ::Thrift::Types::I16, :name => 'session_id'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Example_result_result
        include ::Thrift::Struct, ::Thrift::Struct_Union

        FIELDS = {

        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Destroy_session_args
        include ::Thrift::Struct, ::Thrift::Struct_Union
        SESSION_ID = 1

        FIELDS = {
          SESSION_ID => {:type => ::Thrift::Types::I16, :name => 'session_id'}
        }

        def struct_fields; FIELDS; end

        def validate
        end

        ::Thrift::Struct.generate_accessors self
      end

      class Destroy_session_result
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
