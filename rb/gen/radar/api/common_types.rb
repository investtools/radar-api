#
# Autogenerated by Thrift Compiler (0.9.3)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'

module Radar
  module Api
    class StockId
      include ::Thrift::Struct, ::Thrift::Struct_Union
      SYMBOL = 1

      FIELDS = {
        SYMBOL => {:type => ::Thrift::Types::STRING, :name => 'symbol'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class IndexId
      include ::Thrift::Struct, ::Thrift::Struct_Union
      SYMBOL = 1

      FIELDS = {
        SYMBOL => {:type => ::Thrift::Types::STRING, :name => 'symbol'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class FundId
      include ::Thrift::Struct, ::Thrift::Struct_Union
      CNPJ = 1

      FIELDS = {
        CNPJ => {:type => ::Thrift::Types::STRING, :name => 'cnpj'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class IndexLinkedBondId
      include ::Thrift::Struct, ::Thrift::Struct_Union
      INDEX = 1
      FACTOR = 2
      RATE = 5
      BASE_DATE = 3
      MATURITY_DATE = 4

      FIELDS = {
        INDEX => {:type => ::Thrift::Types::STRUCT, :name => 'index', :class => ::Radar::Api::IndexId},
        FACTOR => {:type => ::Thrift::Types::DOUBLE, :name => 'factor'},
        RATE => {:type => ::Thrift::Types::DOUBLE, :name => 'rate'},
        BASE_DATE => {:type => ::Thrift::Types::I32, :name => 'base_date'},
        MATURITY_DATE => {:type => ::Thrift::Types::I32, :name => 'maturity_date'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class GovernmentBondId
      include ::Thrift::Struct, ::Thrift::Struct_Union
      NAME = 1
      MATURITY_DATE = 2

      FIELDS = {
        NAME => {:type => ::Thrift::Types::STRING, :name => 'name'},
        MATURITY_DATE => {:type => ::Thrift::Types::I32, :name => 'maturity_date'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class SecurityId < ::Thrift::Union
      include ::Thrift::Struct_Union
      class << self
        def stock(val)
          SecurityId.new(:stock, val)
        end

        def fund(val)
          SecurityId.new(:fund, val)
        end

        def index_linked_bond(val)
          SecurityId.new(:index_linked_bond, val)
        end

        def government_bond(val)
          SecurityId.new(:government_bond, val)
        end
      end

      STOCK = 1
      FUND = 2
      INDEX_LINKED_BOND = 3
      GOVERNMENT_BOND = 4

      FIELDS = {
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::StockId},
        FUND => {:type => ::Thrift::Types::STRUCT, :name => 'fund', :class => ::Radar::Api::FundId},
        INDEX_LINKED_BOND => {:type => ::Thrift::Types::STRUCT, :name => 'index_linked_bond', :class => ::Radar::Api::IndexLinkedBondId},
        GOVERNMENT_BOND => {:type => ::Thrift::Types::STRUCT, :name => 'government_bond', :class => ::Radar::Api::GovernmentBondId}
      }

      def struct_fields; FIELDS; end

      def validate
        raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
      end

      ::Thrift::Union.generate_accessors self
    end

  end
end
