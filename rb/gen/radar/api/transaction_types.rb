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

    module StockOptionTransactionType
      BUY = 1
      SELL = 2
      VALUE_MAP = {1 => "BUY", 2 => "SELL"}
      VALID_VALUES = Set.new([BUY, SELL]).freeze
    end

    class StockSell
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

    class StockBuy
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

    class StockOption
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      ACCOUNT = 2
      STOCK = 3
      SHARES = 4
      PRICE = 5
      MATURITY = 6
      TRANSACTION_TYPE = 7
      TYPE = 8

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        ACCOUNT => {:type => ::Thrift::Types::STRING, :name => 'account'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        PRICE => {:type => ::Thrift::Types::DOUBLE, :name => 'price'},
        MATURITY => {:type => ::Thrift::Types::I64, :name => 'maturity'},
        TRANSACTION_TYPE => {:type => ::Thrift::Types::I32, :name => 'transaction_type', :enum_class => ::Radar::Api::StockOptionTransactionType},
        TYPE => {:type => ::Thrift::Types::I32, :name => 'type', :default =>         1, :enum_class => ::Radar::Api::StockBuyTransactionType}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @transaction_type.nil? || ::Radar::Api::StockOptionTransactionType::VALID_VALUES.include?(@transaction_type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field transaction_type!')
        end
        unless @type.nil? || ::Radar::Api::StockBuyTransactionType::VALID_VALUES.include?(@type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field type!')
        end
      end

      ::Thrift::Struct.generate_accessors self
    end

    class StockLending
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      ACCOUNT = 2
      STOCK = 3
      SHARES = 4
      RATE = 5
      DUE = 6

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        ACCOUNT => {:type => ::Thrift::Types::STRING, :name => 'account'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        RATE => {:type => ::Thrift::Types::DOUBLE, :name => 'rate'},
        DUE => {:type => ::Thrift::Types::I64, :name => 'due'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class StockLendingReturning
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

    class CommissionExpense
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      AMOUNT = 2
      DESCRIPTION = 3

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        AMOUNT => {:type => ::Thrift::Types::DOUBLE, :name => 'amount'},
        DESCRIPTION => {:type => ::Thrift::Types::STRING, :name => 'description'}
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

        def stock_commission_expense(val)
          Transaction.new(:stock_commission_expense, val)
        end

        def stock_option(val)
          Transaction.new(:stock_option, val)
        end
      end

      STOCK_BUY = 1
      STOCK_SELL = 2
      STOCK_LENDING = 3
      STOCK_LENDING_RETURNING = 4
      STOCK_COMMISSION_EXPENSE = 5
      STOCK_OPTION = 6

      FIELDS = {
        STOCK_BUY => {:type => ::Thrift::Types::STRUCT, :name => 'stock_buy', :class => ::Radar::Api::StockBuy, :optional => true},
        STOCK_SELL => {:type => ::Thrift::Types::STRUCT, :name => 'stock_sell', :class => ::Radar::Api::StockSell, :optional => true},
        STOCK_LENDING => {:type => ::Thrift::Types::STRUCT, :name => 'stock_lending', :class => ::Radar::Api::StockLending, :optional => true},
        STOCK_LENDING_RETURNING => {:type => ::Thrift::Types::STRUCT, :name => 'stock_lending_returning', :class => ::Radar::Api::StockLendingReturning, :optional => true},
        STOCK_COMMISSION_EXPENSE => {:type => ::Thrift::Types::STRUCT, :name => 'stock_commission_expense', :class => ::Radar::Api::CommissionExpense, :optional => true},
        STOCK_OPTION => {:type => ::Thrift::Types::STRUCT, :name => 'stock_option', :class => ::Radar::Api::StockOption, :optional => true}
      }

      def struct_fields; FIELDS; end

      def validate
        raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
      end

      ::Thrift::Union.generate_accessors self
    end

  end
end
