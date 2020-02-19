#
# Autogenerated by Thrift Compiler (0.12.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'

module Radar
  module Api
    class EquityId; end

    class IndexId; end

    class FundId; end

    class CorporateBondId; end

    class GovernmentBondId; end

    class CustomSecurityId; end

    class SecurityId < ::Thrift::Union; end

    class Broker; end

    class ApplicationError < ::Thrift::Exception; end

    class EquityId
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

    class CorporateBondId
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
        BASE_DATE => {:type => ::Thrift::Types::I64, :name => 'base_date'},
        MATURITY_DATE => {:type => ::Thrift::Types::I64, :name => 'maturity_date'}
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
        MATURITY_DATE => {:type => ::Thrift::Types::I64, :name => 'maturity_date'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class CustomSecurityId
      include ::Thrift::Struct, ::Thrift::Struct_Union
      USER_ID = 1
      ID = 2

      FIELDS = {
        USER_ID => {:type => ::Thrift::Types::STRING, :name => 'user_id'},
        ID => {:type => ::Thrift::Types::STRING, :name => 'id'}
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

        def corporate_bond(val)
          SecurityId.new(:corporate_bond, val)
        end

        def government_bond(val)
          SecurityId.new(:government_bond, val)
        end

        def custom_security(val)
          SecurityId.new(:custom_security, val)
        end
      end

      STOCK = 1
      FUND = 2
      CORPORATE_BOND = 3
      GOVERNMENT_BOND = 4
      CUSTOM_SECURITY = 5

      FIELDS = {
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::Api::EquityId, :optional => true},
        FUND => {:type => ::Thrift::Types::STRUCT, :name => 'fund', :class => ::Radar::Api::FundId, :optional => true},
        CORPORATE_BOND => {:type => ::Thrift::Types::STRUCT, :name => 'corporate_bond', :class => ::Radar::Api::CorporateBondId, :optional => true},
        GOVERNMENT_BOND => {:type => ::Thrift::Types::STRUCT, :name => 'government_bond', :class => ::Radar::Api::GovernmentBondId, :optional => true},
        CUSTOM_SECURITY => {:type => ::Thrift::Types::STRUCT, :name => 'custom_security', :class => ::Radar::Api::CustomSecurityId, :optional => true}
      }

      def struct_fields; FIELDS; end

      def validate
        raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
      end

      ::Thrift::Union.generate_accessors self
    end

    class Broker
      include ::Thrift::Struct, ::Thrift::Struct_Union
      CODE = 1
      NAME = 2
      SEGMENT = 3

      FIELDS = {
        CODE => {:type => ::Thrift::Types::STRING, :name => 'code'},
        NAME => {:type => ::Thrift::Types::STRING, :name => 'name'},
        SEGMENT => {:type => ::Thrift::Types::STRING, :name => 'segment'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class ApplicationError < ::Thrift::Exception
      include ::Thrift::Struct, ::Thrift::Struct_Union
      MESSAGE = 1
      STACKTRACE = 2

      FIELDS = {
        MESSAGE => {:type => ::Thrift::Types::STRING, :name => 'message'},
        STACKTRACE => {:type => ::Thrift::Types::LIST, :name => 'stacktrace', :element => {:type => ::Thrift::Types::STRING}}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

  end
end
