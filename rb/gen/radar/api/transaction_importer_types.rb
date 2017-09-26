#
# Autogenerated by Thrift Compiler (0.10.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'radar/api/common_types'


module Radar
  module Api
    module StockBuyTransactionType
      REGULAR = 1
      IPO = 2
      VALUE_MAP = {1 => "REGULAR", 2 => "IPO"}
      VALID_VALUES = Set.new([REGULAR, IPO]).freeze
    end

    class StockSellTransaction
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      ACCOUNT = 2
      STOCK = 3
      SHARES = 4
      PRICE = 5

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        ACCOUNT => {:type => ::Thrift::Types::STRING, :name => 'account'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        PRICE => {:type => ::Thrift::Types::DOUBLE, :name => 'price'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class StockBuyTransaction
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      ACCOUNT = 2
      STOCK = 3
      SHARES = 4
      PRICE = 5
      TYPE = 6

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        ACCOUNT => {:type => ::Thrift::Types::STRING, :name => 'account'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        PRICE => {:type => ::Thrift::Types::DOUBLE, :name => 'price'},
        TYPE => {:type => ::Thrift::Types::I32, :name => 'type', :default =>         1, :enum_class => ::Radar::Api::StockBuyTransactionType}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @type.nil? || ::Radar::Api::StockBuyTransactionType::VALID_VALUES.include?(@type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field type!')
        end
      end

      ::Thrift::Struct.generate_accessors self
    end

    class StockLendingTransaction
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      ACCOUNT = 2
      STOCK = 3
      SHARES = 4
      PRICE = 5
      RATE = 6
      DUE = 7

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        ACCOUNT => {:type => ::Thrift::Types::STRING, :name => 'account'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        PRICE => {:type => ::Thrift::Types::DOUBLE, :name => 'price'},
        RATE => {:type => ::Thrift::Types::DOUBLE, :name => 'rate'},
        DUE => {:type => ::Thrift::Types::I64, :name => 'due'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class StockLendingReturningTransaction
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      ACCOUNT = 2
      STOCK = 3
      SHARES = 4
      CREDIT = 5

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        ACCOUNT => {:type => ::Thrift::Types::STRING, :name => 'account'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        CREDIT => {:type => ::Thrift::Types::DOUBLE, :name => 'credit'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class Transaction < ::Thrift::Union
      include ::Thrift::Struct_Union
      class << self
        def stock_buy(val)
          Transaction.new(:stock_buy, val)
        end

        def stock_sell(val)
          Transaction.new(:stock_sell, val)
        end

        def stock_lending(val)
          Transaction.new(:stock_lending, val)
        end

        def stock_lending_returning(val)
          Transaction.new(:stock_lending_returning, val)
        end
      end

      STOCK_BUY = 1
      STOCK_SELL = 2
      STOCK_LENDING = 3
      STOCK_LENDING_RETURNING = 4

      FIELDS = {
        STOCK_BUY => {:type => ::Thrift::Types::STRUCT, :name => 'stock_buy', :class => ::Radar::Api::StockBuyTransaction, :optional => true},
        STOCK_SELL => {:type => ::Thrift::Types::STRUCT, :name => 'stock_sell', :class => ::Radar::Api::StockSellTransaction, :optional => true},
        STOCK_LENDING => {:type => ::Thrift::Types::STRUCT, :name => 'stock_lending', :class => ::Radar::Api::StockLendingTransaction, :optional => true},
        STOCK_LENDING_RETURNING => {:type => ::Thrift::Types::STRUCT, :name => 'stock_lending_returning', :class => ::Radar::Api::StockLendingReturningTransaction, :optional => true}
      }

      def struct_fields; FIELDS; end

      def validate
        raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
      end

      ::Thrift::Union.generate_accessors self
    end

    class Account
      include ::Thrift::Struct, ::Thrift::Struct_Union
      ID = 1
      LAST_TRANSACTION_DATE = 2

      FIELDS = {
        ID => {:type => ::Thrift::Types::STRING, :name => 'id'},
        LAST_TRANSACTION_DATE => {:type => ::Thrift::Types::I64, :name => 'last_transaction_date'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

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

  end
end