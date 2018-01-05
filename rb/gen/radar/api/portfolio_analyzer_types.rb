#
# Autogenerated by Thrift Compiler (0.10.0)
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#

require 'thrift'
require 'radar/api/common_types'


module Radar
  module Api
    module LineSeriesType
      LINE = 0
      AREA = 1
      VALUE_MAP = {0 => "LINE", 1 => "AREA"}
      VALID_VALUES = Set.new([LINE, AREA]).freeze
    end

    module Event
      EACH_DAY = 0
      EACH_MONTH = 1
      CASH_FLOW = 2
      FINISH = 3
      VALUE_MAP = {0 => "EACH_DAY", 1 => "EACH_MONTH", 2 => "CASH_FLOW", 3 => "FINISH"}
      VALID_VALUES = Set.new([EACH_DAY, EACH_MONTH, CASH_FLOW, FINISH]).freeze
    end

    module ResultType
      TABLE = 0
      PIE_CHART = 1
      LINE_CHART = 2
      BAR_CHART = 3
      VALUE_MAP = {0 => "TABLE", 1 => "PIE_CHART", 2 => "LINE_CHART", 3 => "BAR_CHART"}
      VALID_VALUES = Set.new([TABLE, PIE_CHART, LINE_CHART, BAR_CHART]).freeze
    end

    module CashFlowType
      DIVIDEND = 0
      INTEREST_ON_OWN_CAPITAL = 1
      DEPOSIT = 2
      WITHDRAWAL = 3
      VALUE_MAP = {0 => "DIVIDEND", 1 => "INTEREST_ON_OWN_CAPITAL", 2 => "DEPOSIT", 3 => "WITHDRAWAL"}
      VALID_VALUES = Set.new([DIVIDEND, INTEREST_ON_OWN_CAPITAL, DEPOSIT, WITHDRAWAL]).freeze
    end

    class Point
      include ::Thrift::Struct, ::Thrift::Struct_Union
      X = 1
      Y = 2

      FIELDS = {
        X => {:type => ::Thrift::Types::I64, :name => 'x'},
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
        SERIES => {:type => ::Thrift::Types::LIST, :name => 'series', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::PieSeries}}
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
        POINTS => {:type => ::Thrift::Types::LIST, :name => 'points', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::Point}},
        TYPE => {:type => ::Thrift::Types::I32, :name => 'type', :default =>         0, :enum_class => ::Radar::Api::LineSeriesType}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @type.nil? || ::Radar::Api::LineSeriesType::VALID_VALUES.include?(@type)
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
        SERIES => {:type => ::Thrift::Types::LIST, :name => 'series', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::LineSeries}},
        OPTIONS => {:type => ::Thrift::Types::STRUCT, :name => 'options', :class => ::Radar::Api::LineChartOptions}
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
      STACK_NAME = 3

      FIELDS = {
        NAME => {:type => ::Thrift::Types::STRING, :name => 'name'},
        DATA => {:type => ::Thrift::Types::LIST, :name => 'data', :element => {:type => ::Thrift::Types::DOUBLE}},
        # Criado na versão 0.2.2.
# 
# Só é necessário se <code>BarChart.options.stacked = true</code> e a intenção for agrupar as pilhas.
        STACK_NAME => {:type => ::Thrift::Types::STRING, :name => 'stack_name', :optional => true}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    # Criado na versão 0.2.2.
    class BarChartOptions
      include ::Thrift::Struct, ::Thrift::Struct_Union
      STACKED = 1
      PERCENT = 2
      Y_AXIS_TITLE = 4

      FIELDS = {
        STACKED => {:type => ::Thrift::Types::BOOL, :name => 'stacked', :default => false},
        PERCENT => {:type => ::Thrift::Types::BOOL, :name => 'percent', :default => false},
        Y_AXIS_TITLE => {:type => ::Thrift::Types::STRING, :name => 'y_axis_title', :optional => true}
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
      OPTIONS = 4

      FIELDS = {
        TITLE => {:type => ::Thrift::Types::STRING, :name => 'title'},
        SERIES => {:type => ::Thrift::Types::LIST, :name => 'series', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::BarSeries}},
        CATEGORIES => {:type => ::Thrift::Types::LIST, :name => 'categories', :element => {:type => ::Thrift::Types::STRING}},
        # Criado na versão 0.2.2.
        OPTIONS => {:type => ::Thrift::Types::STRUCT, :name => 'options', :class => ::Radar::Api::BarChartOptions}
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

    class TableCellTypes < ::Thrift::Union
      include ::Thrift::Struct_Union
      class << self
        def text(val)
          TableCellTypes.new(:text, val)
        end

        def percent(val)
          TableCellTypes.new(:percent, val)
        end

        def currency(val)
          TableCellTypes.new(:currency, val)
        end

        def number(val)
          TableCellTypes.new(:number, val)
        end

        def percentage_point(val)
          TableCellTypes.new(:percentage_point, val)
        end
      end

      TEXT = 1
      PERCENT = 2
      CURRENCY = 3
      NUMBER = 4
      PERCENTAGE_POINT = 5

      FIELDS = {
        TEXT => {:type => ::Thrift::Types::STRING, :name => 'text', :optional => true},
        PERCENT => {:type => ::Thrift::Types::DOUBLE, :name => 'percent', :optional => true},
        CURRENCY => {:type => ::Thrift::Types::DOUBLE, :name => 'currency', :optional => true},
        NUMBER => {:type => ::Thrift::Types::DOUBLE, :name => 'number', :optional => true},
        PERCENTAGE_POINT => {:type => ::Thrift::Types::DOUBLE, :name => 'percentage_point', :optional => true}
      }

      def struct_fields; FIELDS; end

      def validate
        raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
      end

      ::Thrift::Union.generate_accessors self
    end

    class TableCellContent
      include ::Thrift::Struct, ::Thrift::Struct_Union
      TYPE = 1
      STRIP_INSIGNIFICANT_ZEROS = 2

      FIELDS = {
        TYPE => {:type => ::Thrift::Types::STRUCT, :name => 'type', :class => ::Radar::Api::TableCellTypes},
        STRIP_INSIGNIFICANT_ZEROS => {:type => ::Thrift::Types::BOOL, :name => 'strip_insignificant_zeros', :default => false}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
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
        COLSPAN => {:type => ::Thrift::Types::I16, :name => 'colspan', :default => 1},
        ROWSPAN => {:type => ::Thrift::Types::I16, :name => 'rowspan', :default => 1}
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
        CONTENT => {:type => ::Thrift::Types::STRUCT, :name => 'content', :class => ::Radar::Api::TableCellContent},
        FORMAT => {:type => ::Thrift::Types::STRUCT, :name => 'format', :class => ::Radar::Api::TableCellFormat}
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
        CELLS => {:type => ::Thrift::Types::LIST, :name => 'cells', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::TableCell}}
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
        HEADER => {:type => ::Thrift::Types::LIST, :name => 'header', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::TableRow}},
        BODY => {:type => ::Thrift::Types::LIST, :name => 'body', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::TableRow}},
        FOOTER => {:type => ::Thrift::Types::LIST, :name => 'footer', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::TableRow}}
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
        TABLE => {:type => ::Thrift::Types::STRUCT, :name => 'table', :class => ::Radar::Api::Table, :optional => true},
        PIE_CHART => {:type => ::Thrift::Types::STRUCT, :name => 'pie_chart', :class => ::Radar::Api::PieChart, :optional => true},
        LINE_CHART => {:type => ::Thrift::Types::STRUCT, :name => 'line_chart', :class => ::Radar::Api::LineChart, :optional => true},
        BAR_CHART => {:type => ::Thrift::Types::STRUCT, :name => 'bar_chart', :class => ::Radar::Api::BarChart, :optional => true}
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
      AVG_PRICE = 4
      SHARES = 5
      PAID_VALUE = 6

      FIELDS = {
        ID => {:type => ::Thrift::Types::STRUCT, :name => 'id', :class => ::Radar::Api::SecurityId},
        VALUE => {:type => ::Thrift::Types::DOUBLE, :name => 'value'},
        RENTABILITY => {:type => ::Thrift::Types::DOUBLE, :name => 'rentability'},
        AVG_PRICE => {:type => ::Thrift::Types::DOUBLE, :name => 'avg_price'},
        SHARES => {:type => ::Thrift::Types::DOUBLE, :name => 'shares'},
        PAID_VALUE => {:type => ::Thrift::Types::DOUBLE, :name => 'paid_value'}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    # Criado na versão 0.2.1
    class Settlement < ::Thrift::Union
      include ::Thrift::Struct_Union
      class << self
        def date(val)
          Settlement.new(:date, val)
        end

        def period(val)
          Settlement.new(:period, val)
        end
      end

      DATE = 1
      PERIOD = 2

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date', :optional => true},
        PERIOD => {:type => ::Thrift::Types::I16, :name => 'period', :optional => true}
      }

      def struct_fields; FIELDS; end

      def validate
        raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
      end

      ::Thrift::Union.generate_accessors self
    end

    # Criado na versão 0.2.1
    class Provision
      include ::Thrift::Struct, ::Thrift::Struct_Union
      VALUE = 1
      DESCRIPTION = 2
      SETTLEMENT = 3

      FIELDS = {
        VALUE => {:type => ::Thrift::Types::DOUBLE, :name => 'value'},
        DESCRIPTION => {:type => ::Thrift::Types::STRING, :name => 'description'},
        SETTLEMENT => {:type => ::Thrift::Types::STRUCT, :name => 'settlement', :class => ::Radar::Api::Settlement}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class Portfolio
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      POSITIONS = 2
      RENTABILITY = 3
      NAV = 4
      CASH = 5
      PROVISIONS = 6

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        POSITIONS => {:type => ::Thrift::Types::LIST, :name => 'positions', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::Position}},
        RENTABILITY => {:type => ::Thrift::Types::DOUBLE, :name => 'rentability'},
        NAV => {:type => ::Thrift::Types::DOUBLE, :name => 'nav'},
        CASH => {:type => ::Thrift::Types::DOUBLE, :name => 'cash'},
        # Criado na versão 0.2.1
        PROVISIONS => {:type => ::Thrift::Types::LIST, :name => 'provisions', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::Api::Provision}}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class AnalyzerConfig
      include ::Thrift::Struct, ::Thrift::Struct_Union
      ID = 1
      NAME = 2
      RESULT_TYPE = 3
      ACCEPTED_EVENTS = 4

      FIELDS = {
        ID => {:type => ::Thrift::Types::STRING, :name => 'id'},
        NAME => {:type => ::Thrift::Types::STRING, :name => 'name'},
        RESULT_TYPE => {:type => ::Thrift::Types::I32, :name => 'result_type', :enum_class => ::Radar::Api::ResultType},
        ACCEPTED_EVENTS => {:type => ::Thrift::Types::SET, :name => 'accepted_events', :element => {:type => ::Thrift::Types::I32, :enum_class => ::Radar::Api::Event}}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @result_type.nil? || ::Radar::Api::ResultType::VALID_VALUES.include?(@result_type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field result_type!')
        end
      end

      ::Thrift::Struct.generate_accessors self
    end

    class CashFlow
      include ::Thrift::Struct, ::Thrift::Struct_Union
      DATE = 1
      VALUE = 2
      BALANCE = 3
      TYPE = 4

      FIELDS = {
        DATE => {:type => ::Thrift::Types::I64, :name => 'date'},
        VALUE => {:type => ::Thrift::Types::DOUBLE, :name => 'value'},
        BALANCE => {:type => ::Thrift::Types::DOUBLE, :name => 'balance'},
        TYPE => {:type => ::Thrift::Types::I32, :name => 'type', :enum_class => ::Radar::Api::CashFlowType}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @type.nil? || ::Radar::Api::CashFlowType::VALID_VALUES.include?(@type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field type!')
        end
      end

      ::Thrift::Struct.generate_accessors self
    end

  end
end
