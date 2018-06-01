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
    class Price
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      CLOSE = 2

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        CLOSE => {:type => ::Thrift::Types::DOUBLE, :name => 'close'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class DailyFundData
      include ::Thrift::Struct, ::Thrift::Struct_Union
      PRICE = 1
      DATE = 2
      NAV = 3

      FIELDS = {
        PRICE => {:type => ::Thrift::Types::DOUBLE, :name => 'price'},
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        NAV => {:type => ::Thrift::Types::DOUBLE, :name => 'nav'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class Position
      include ::Thrift::Struct, ::Thrift::Struct_Union
      SYMBOL = 1
      SHARES = 2

      FIELDS = {
        SYMBOL => {:type => ::Thrift::Types::STRING, :name => 'symbol'},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class MonthlyPosition
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      POSITION = 2

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        POSITION => {:type => ::Thrift::Types::LIST, :name => 'position', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::Position}}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

  end
end
