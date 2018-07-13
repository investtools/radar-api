#
# Autogenerated by Thrift Compiler (0.10.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'radar/api/common_types'
require 'radar/api/transaction_types'


module Radar
  module Api
    class AuthenticationError < ::Thrift::Exception
      include ::Thrift::Struct, ::Thrift::Struct_Union
      def initialize(message=nil)
        super()
        self.message = message
      end

      MESSAGE = 1

      FIELDS = {
        MESSAGE => {:type => ::Thrift::Types::STRING, :name => 'message'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class SystemUnavailableError < ::Thrift::Exception
      include ::Thrift::Struct, ::Thrift::Struct_Union
      def initialize(message=nil)
        super()
        self.message = message
      end

      MESSAGE = 1

      FIELDS = {
        MESSAGE => {:type => ::Thrift::Types::STRING, :name => 'message'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class RenewResult
      include ::Thrift::Struct, ::Thrift::Struct_Union
      ERROR = 1
      ORIGINAL = 2
      CURRENT = 3

      FIELDS = {
        ERROR => {:type => ::Thrift::Types::BOOL, :name => 'error'},
        ORIGINAL => {:type => ::Thrift::Types::STRING, :name => 'original'},
        CURRENT => {:type => ::Thrift::Types::STRING, :name => 'current'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

  end
end
