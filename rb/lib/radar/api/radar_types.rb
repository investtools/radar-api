#
# Autogenerated by Thrift Compiler (1.0.0-dev)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'

module Radar
  module API
    module LineSeriesType
      LINE = 0
      AREA = 1
      VALUE_MAP = {0 => "LINE", 1 => "AREA"}
      VALID_VALUES = Set.new([LINE, AREA]).freeze
    end

    module Event
      EACH_DAY = 0
      EACH_MONTH = 1
      FINISH = 2
      VALUE_MAP = {0 => "EACH_DAY", 1 => "EACH_MONTH", 2 => "FINISH"}
      VALID_VALUES = Set.new([EACH_DAY, EACH_MONTH, FINISH]).freeze
    end

    module ResultType
      TABLE = 0
      PIE_CHART = 1
      LINE_CHART = 2
      BAR_CHART = 3
      VALUE_MAP = {0 => "TABLE", 1 => "PIE_CHART", 2 => "LINE_CHART", 3 => "BAR_CHART"}
      VALID_VALUES = Set.new([TABLE, PIE_CHART, LINE_CHART, BAR_CHART]).freeze
    end

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
      FATOR = 2

      FIELDS = {
        INDEX => {:type => ::Thrift::Types::STRUCT, :name => 'index', :class => ::Radar::API::IndexId},
        FATOR => {:type => ::Thrift::Types::DOUBLE, :name => 'fator'}
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
      end

      STOCK = 1
      FUND = 2
      INDEX_LINKED_BOND = 3

      FIELDS = {
        STOCK => {:type => ::Thrift::Types::STRUCT, :name => 'stock', :class => ::Radar::API::StockId},
        FUND => {:type => ::Thrift::Types::STRUCT, :name => 'fund', :class => ::Radar::API::FundId},
        INDEX_LINKED_BOND => {:type => ::Thrift::Types::STRUCT, :name => 'index_linked_bond', :class => ::Radar::API::IndexLinkedBondId}
      }

      def struct_fields; FIELDS; end

      def validate
        raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
      end

      ::Thrift::Union.generate_accessors self
    end

    class Point
      include ::Thrift::Struct, ::Thrift::Struct_Union
      X = 1
      Y = 2

      FIELDS = {
        X => {:type => ::Thrift::Types::I32, :name => 'x'},
        Y => {:type => ::Thrift::Types::DOUBLE, :name => 'y'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class PieSeries
      include ::Thrift::Struct, ::Thrift::Struct_Union
      NAME = 1
      VALUE = 2

      FIELDS = {
        NAME => {:type => ::Thrift::Types::STRING, :name => 'name'},
        VALUE => {:type => ::Thrift::Types::DOUBLE, :name => 'value'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class PieChart
      include ::Thrift::Struct, ::Thrift::Struct_Union
      TITLE = 1
      SERIES = 2

      FIELDS = {
        TITLE => {:type => ::Thrift::Types::STRING, :name => 'title'},
        SERIES => {:type => ::Thrift::Types::LIST, :name => 'series', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::API::PieSeries}}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class LineSeries
      include ::Thrift::Struct, ::Thrift::Struct_Union
      NAME = 1
      POINTS = 2
      TYPE = 3

      FIELDS = {
        NAME => {:type => ::Thrift::Types::STRING, :name => 'name'},
        POINTS => {:type => ::Thrift::Types::LIST, :name => 'points', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::API::Point}},
        TYPE => {:type => ::Thrift::Types::I32, :name => 'type', :default =>         0, :enum_class => ::Radar::API::LineSeriesType}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @type.nil? || ::Radar::API::LineSeriesType::VALID_VALUES.include?(@type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field type!')
        end
      end

      ::Thrift::Struct.generate_accessors self
    end

    class LineChartOptions
      include ::Thrift::Struct, ::Thrift::Struct_Union
      STACKED = 1
      COMPARE = 2

      FIELDS = {
        STACKED => {:type => ::Thrift::Types::BOOL, :name => 'stacked'},
        COMPARE => {:type => ::Thrift::Types::BOOL, :name => 'compare'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class LineChart
      include ::Thrift::Struct, ::Thrift::Struct_Union
      TITLE = 1
      SERIES = 2
      OPTIONS = 3

      FIELDS = {
        TITLE => {:type => ::Thrift::Types::STRING, :name => 'title'},
        SERIES => {:type => ::Thrift::Types::LIST, :name => 'series', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::API::LineSeries}},
        OPTIONS => {:type => ::Thrift::Types::STRUCT, :name => 'options', :class => ::Radar::API::LineChartOptions}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class BarSeries
      include ::Thrift::Struct, ::Thrift::Struct_Union
      NAME = 1
      DATA = 2

      FIELDS = {
        NAME => {:type => ::Thrift::Types::STRING, :name => 'name'},
        DATA => {:type => ::Thrift::Types::LIST, :name => 'data', :element => {:type => ::Thrift::Types::DOUBLE}}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class BarChart
      include ::Thrift::Struct, ::Thrift::Struct_Union
      TITLE = 1
      SERIES = 2
      CATEGORIES = 3

      FIELDS = {
        TITLE => {:type => ::Thrift::Types::STRING, :name => 'title'},
        SERIES => {:type => ::Thrift::Types::LIST, :name => 'series', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::API::BarSeries}},
        CATEGORIES => {:type => ::Thrift::Types::LIST, :name => 'categories', :element => {:type => ::Thrift::Types::STRING}}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class Text
      include ::Thrift::Struct, ::Thrift::Struct_Union
      TITLE = 1
      CONTENT = 2

      FIELDS = {
        TITLE => {:type => ::Thrift::Types::STRING, :name => 'title'},
        CONTENT => {:type => ::Thrift::Types::STRING, :name => 'content'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class TableCellContent < ::Thrift::Union
      include ::Thrift::Struct_Union
      class << self
        def text(val)
          TableCellContent.new(:text, val)
        end

        def percent(val)
          TableCellContent.new(:percent, val)
        end

        def currency(val)
          TableCellContent.new(:currency, val)
        end
      end

      TEXT = 1
      PERCENT = 2
      CURRENCY = 3

      FIELDS = {
        TEXT => {:type => ::Thrift::Types::STRING, :name => 'text'},
        PERCENT => {:type => ::Thrift::Types::DOUBLE, :name => 'percent'},
        CURRENCY => {:type => ::Thrift::Types::DOUBLE, :name => 'currency'}
      }

      def struct_fields; FIELDS; end

      def validate
        raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
      end

      ::Thrift::Union.generate_accessors self
    end

    class TableCellFormat
      include ::Thrift::Struct, ::Thrift::Struct_Union
      BOLD = 1
      ITALIC = 2
      COLOR = 3
      COLSPAN = 4
      ROWSPAN = 5

      FIELDS = {
        BOLD => {:type => ::Thrift::Types::BOOL, :name => 'bold'},
        ITALIC => {:type => ::Thrift::Types::BOOL, :name => 'italic'},
        COLOR => {:type => ::Thrift::Types::I32, :name => 'color'},
        COLSPAN => {:type => ::Thrift::Types::I16, :name => 'colspan'},
        ROWSPAN => {:type => ::Thrift::Types::I16, :name => 'rowspan'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class TableCell
      include ::Thrift::Struct, ::Thrift::Struct_Union
      CONTENT = 1
      FORMAT = 2

      FIELDS = {
        CONTENT => {:type => ::Thrift::Types::STRUCT, :name => 'content', :class => ::Radar::API::TableCellContent},
        FORMAT => {:type => ::Thrift::Types::STRUCT, :name => 'format', :class => ::Radar::API::TableCellFormat}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class TableRow
      include ::Thrift::Struct, ::Thrift::Struct_Union
      CELLS = 1

      FIELDS = {
        CELLS => {:type => ::Thrift::Types::LIST, :name => 'cells', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::API::TableCell}}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class Table
      include ::Thrift::Struct, ::Thrift::Struct_Union
      TITLE = 1
      HEADER = 2
      BODY = 3
      FOOTER = 4

      FIELDS = {
        TITLE => {:type => ::Thrift::Types::STRING, :name => 'title'},
        HEADER => {:type => ::Thrift::Types::LIST, :name => 'header', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::API::TableRow}},
        BODY => {:type => ::Thrift::Types::LIST, :name => 'body', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::API::TableRow}},
        FOOTER => {:type => ::Thrift::Types::LIST, :name => 'footer', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::API::TableRow}}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class Result < ::Thrift::Union
      include ::Thrift::Struct_Union
      class << self
        def table(val)
          Result.new(:table, val)
        end

        def pie_chart(val)
          Result.new(:pie_chart, val)
        end

        def line_chart(val)
          Result.new(:line_chart, val)
        end

        def bar_chart(val)
          Result.new(:bar_chart, val)
        end
      end

      TABLE = 1
      PIE_CHART = 2
      LINE_CHART = 3
      BAR_CHART = 4

      FIELDS = {
        TABLE => {:type => ::Thrift::Types::STRUCT, :name => 'table', :class => ::Radar::API::Table},
        PIE_CHART => {:type => ::Thrift::Types::STRUCT, :name => 'pie_chart', :class => ::Radar::API::PieChart},
        LINE_CHART => {:type => ::Thrift::Types::STRUCT, :name => 'line_chart', :class => ::Radar::API::LineChart},
        BAR_CHART => {:type => ::Thrift::Types::STRUCT, :name => 'bar_chart', :class => ::Radar::API::BarChart}
      }

      def struct_fields; FIELDS; end

      def validate
        raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
      end

      ::Thrift::Union.generate_accessors self
    end

    class Position
      include ::Thrift::Struct, ::Thrift::Struct_Union
      ID = 1
      VALUE = 2
      RENTABILITY = 3

      FIELDS = {
        ID => {:type => ::Thrift::Types::STRUCT, :name => 'id', :class => ::Radar::API::SecurityId},
        VALUE => {:type => ::Thrift::Types::DOUBLE, :name => 'value'},
        RENTABILITY => {:type => ::Thrift::Types::DOUBLE, :name => 'rentability'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class Portfolio
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      RENTABILITY = 2
      NAV = 3
      POSITIONS = 4

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I32, :name => 'date'},
        RENTABILITY => {:type => ::Thrift::Types::DOUBLE, :name => 'rentability'},
        NAV => {:type => ::Thrift::Types::DOUBLE, :name => 'nav'},
        POSITIONS => {:type => ::Thrift::Types::MAP, :name => 'positions', :key => {:type => ::Thrift::Types::STRING}, :value => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::API::Position}}
      }

      def struct_fields; FIELDS; end

      def validate
        raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field date is unset!') unless @date
      end

      ::Thrift::Struct.generate_accessors self
    end

    class AnalyzerConfig
      include ::Thrift::Struct, ::Thrift::Struct_Union
      ID = 1
      RESULT_TYPE = 2
      ACCEPTED_EVENTS = 3

      FIELDS = {
        ID => {:type => ::Thrift::Types::STRING, :name => 'id'},
        RESULT_TYPE => {:type => ::Thrift::Types::I32, :name => 'result_type', :enum_class => ::Radar::API::ResultType},
        ACCEPTED_EVENTS => {:type => ::Thrift::Types::SET, :name => 'accepted_events', :element => {:type => ::Thrift::Types::I32, :enum_class => ::Radar::API::Event}}
      }

      def struct_fields; FIELDS; end

      def validate
        raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field id is unset!') unless @id
        raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field result_type is unset!') unless @result_type
        raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Required field accepted_events is unset!') unless @accepted_events
        unless @result_type.nil? || ::Radar::API::ResultType::VALID_VALUES.include?(@result_type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field result_type!')
        end
      end

      ::Thrift::Struct.generate_accessors self
    end

  end
end
