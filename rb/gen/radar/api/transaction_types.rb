#
# Autogenerated by Thrift Compiler (0.12.0)
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

    module SecurityLendingAndBorrowingType
      LENDER = 1
      BORROWER = 2
      VALUE_MAP = {1 => "LENDER", 2 => "BORROWER"}
      VALID_VALUES = Set.new([LENDER, BORROWER]).freeze
    end

    module TransferType
      IN = 1
      OUT = 2
      VALUE_MAP = {1 => "IN", 2 => "OUT"}
      VALID_VALUES = Set.new([IN, OUT]).freeze
    end

    module OptionExerciseType
      BUY = 1
      SELL = 2
      VALUE_MAP = {1 => "BUY", 2 => "SELL"}
      VALID_VALUES = Set.new([BUY, SELL]).freeze
    end

    class StockSell; end

    class StockBuy; end

    class Subscription; end

    class StockOption; end

    class SecurityLendingAndBorrowing; end

    class SecurityLendingAndBorrowingReturning; end

    class CommissionExpense; end

    class Transfer; end

    class StockPositionSnapshot; end

    class OptionPositionSnapshot; end

    class OptionExercisePositionSnapshot; end

    class OptionExercise; end

    class Transaction < ::Thrift::Union; end

    class StockSell
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      STOCK = 2
      SHARES = 3
      PRICE = 4

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
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
      STOCK = 2
      SHARES = 3
      PRICE = 4
      TYPE = 5

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
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

    class Subscription
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      STOCK = 2
      SHARES = 3

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class StockOption
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      STOCK = 2
      SHARES = 3
      PRICE = 4
      MATURITY = 5
      TRANSACTION_TYPE = 6
      TYPE = 7

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
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

    class SecurityLendingAndBorrowing
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      STOCK = 2
      SHARES = 3
      RATE = 4
      DUE = 5
      TYPE = 6
      CONTRACT = 7

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        RATE => {:type => ::Thrift::Types::DOUBLE, :name => 'rate'},
        DUE => {:type => ::Thrift::Types::I64, :name => 'due'},
        TYPE => {:type => ::Thrift::Types::I32, :name => 'type', :enum_class => ::Radar::Api::SecurityLendingAndBorrowingType},
        CONTRACT => {:type => ::Thrift::Types::STRING, :name => 'contract'}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @type.nil? || ::Radar::Api::SecurityLendingAndBorrowingType::VALID_VALUES.include?(@type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field type!')
        end
      end

      ::Thrift::Struct.generate_accessors self
    end

    class SecurityLendingAndBorrowingReturning
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      STOCK = 2
      SHARES = 3
      VALUE = 4
      TYPE = 5

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        VALUE => {:type => ::Thrift::Types::DOUBLE, :name => 'value'},
        TYPE => {:type => ::Thrift::Types::I32, :name => 'type', :enum_class => ::Radar::Api::SecurityLendingAndBorrowingType}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @type.nil? || ::Radar::Api::SecurityLendingAndBorrowingType::VALID_VALUES.include?(@type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field type!')
        end
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

    class Transfer
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      STOCK = 2
      SHARES = 3
      TYPE = 4

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        TYPE => {:type => ::Thrift::Types::I32, :name => 'type', :enum_class => ::Radar::Api::TransferType}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @type.nil? || ::Radar::Api::TransferType::VALID_VALUES.include?(@type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field type!')
        end
      end

      ::Thrift::Struct.generate_accessors self
    end

    class StockPositionSnapshot
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      STOCK = 2
      SHARES = 3
      PRICE = 4

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        PRICE => {:type => ::Thrift::Types::DOUBLE, :name => 'price'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class OptionPositionSnapshot
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      STOCK = 2
      SHARES = 3
      PRICE = 4
      MATURITY = 5

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        PRICE => {:type => ::Thrift::Types::DOUBLE, :name => 'price'},
        MATURITY => {:type => ::Thrift::Types::I64, :name => 'maturity'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class OptionExercisePositionSnapshot
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      STOCK = 2
      SHARES = 3
      PRICE = 4
      MATURITY = 5
      TYPE = 7

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        PRICE => {:type => ::Thrift::Types::DOUBLE, :name => 'price'},
        MATURITY => {:type => ::Thrift::Types::I64, :name => 'maturity'},
        TYPE => {:type => ::Thrift::Types::I32, :name => 'type', :enum_class => ::Radar::Api::OptionExerciseType}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @type.nil? || ::Radar::Api::OptionExerciseType::VALID_VALUES.include?(@type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field type!')
        end
      end

      ::Thrift::Struct.generate_accessors self
    end

    class OptionExercise
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      OPTION = 2
      SHARES = 3
      STRIKE = 4

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        OPTION => {:type => ::Thrift::Types::STRUCT, :name => 'option', :class => ::Radar::Api::StockId},
        SHARES => {:type => ::Thrift::Types::I32, :name => 'shares'},
        STRIKE => {:type => ::Thrift::Types::DOUBLE, :name => 'strike'}
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

        def slb(val)
          Transaction.new(:slb, val)
        end

        def slbr(val)
          Transaction.new(:slbr, val)
        end

        def stock_commission_expense(val)
          Transaction.new(:stock_commission_expense, val)
        end

        def stock_option(val)
          Transaction.new(:stock_option, val)
        end

        def subscription(val)
          Transaction.new(:subscription, val)
        end

        def transfer(val)
          Transaction.new(:transfer, val)
        end

        def stock_position_snapshot(val)
          Transaction.new(:stock_position_snapshot, val)
        end

        def option_position_snapshot(val)
          Transaction.new(:option_position_snapshot, val)
        end

        def option_exercise_position_snapshot(val)
          Transaction.new(:option_exercise_position_snapshot, val)
        end

        def option_exercise(val)
          Transaction.new(:option_exercise, val)
        end
      end

      STOCK_BUY = 1
      STOCK_SELL = 2
      SLB = 3
      SLBR = 4
      STOCK_COMMISSION_EXPENSE = 5
      STOCK_OPTION = 6
      SUBSCRIPTION = 7
      TRANSFER = 8
      STOCK_POSITION_SNAPSHOT = 9
      OPTION_POSITION_SNAPSHOT = 10
      OPTION_EXERCISE_POSITION_SNAPSHOT = 11
      OPTION_EXERCISE = 12

      FIELDS = {
        STOCK_BUY => {:type => ::Thrift::Types::STRUCT, :name => 'stock_buy', :class => ::Radar::Api::StockBuy, :optional => true},
        STOCK_SELL => {:type => ::Thrift::Types::STRUCT, :name => 'stock_sell', :class => ::Radar::Api::StockSell, :optional => true},
        SLB => {:type => ::Thrift::Types::STRUCT, :name => 'slb', :class => ::Radar::Api::SecurityLendingAndBorrowing, :optional => true},
        SLBR => {:type => ::Thrift::Types::STRUCT, :name => 'slbr', :class => ::Radar::Api::SecurityLendingAndBorrowingReturning, :optional => true},
        STOCK_COMMISSION_EXPENSE => {:type => ::Thrift::Types::STRUCT, :name => 'stock_commission_expense', :class => ::Radar::Api::CommissionExpense, :optional => true},
        STOCK_OPTION => {:type => ::Thrift::Types::STRUCT, :name => 'stock_option', :class => ::Radar::Api::StockOption, :optional => true},
        SUBSCRIPTION => {:type => ::Thrift::Types::STRUCT, :name => 'subscription', :class => ::Radar::Api::Subscription, :optional => true},
        TRANSFER => {:type => ::Thrift::Types::STRUCT, :name => 'transfer', :class => ::Radar::Api::Transfer, :optional => true},
        STOCK_POSITION_SNAPSHOT => {:type => ::Thrift::Types::STRUCT, :name => 'stock_position_snapshot', :class => ::Radar::Api::StockPositionSnapshot, :optional => true},
        OPTION_POSITION_SNAPSHOT => {:type => ::Thrift::Types::STRUCT, :name => 'option_position_snapshot', :class => ::Radar::Api::OptionPositionSnapshot, :optional => true},
        OPTION_EXERCISE_POSITION_SNAPSHOT => {:type => ::Thrift::Types::STRUCT, :name => 'option_exercise_position_snapshot', :class => ::Radar::Api::OptionExercisePositionSnapshot, :optional => true},
        OPTION_EXERCISE => {:type => ::Thrift::Types::STRUCT, :name => 'option_exercise', :class => ::Radar::Api::OptionExercise, :optional => true}
      }

      def struct_fields; FIELDS; end

      def validate
        raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
      end

      ::Thrift::Union.generate_accessors self
    end

  end
end
