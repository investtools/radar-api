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

    module TableLineType
      HEADER = 0
      BODY = 1
      FOOTER = 2
      VALUE_MAP = {0 => "HEADER", 1 => "BODY", 2 => "FOOTER"}
      VALID_VALUES = Set.new([HEADER, BODY, FOOTER]).freeze
    end

    module Event
      EACH_DAY = 0
      FINISH = 1
      VALUE_MAP = {0 => "EACH_DAY", 1 => "FINISH"}
      VALID_VALUES = Set.new([EACH_DAY, FINISH]).freeze
    end

    module ResultType
      PIE_CHART = 0
      LINE_CHART = 1
      VALUE_MAP = {0 => "PIE_CHART", 1 => "LINE_CHART"}
      VALID_VALUES = Set.new([PIE_CHART, LINE_CHART]).freeze
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

    class TableLine
      include ::Thrift::Struct, ::Thrift::Struct_Union
      TYPE = 1
      CELLS = 2

      FIELDS = {
        TYPE => {:type => ::Thrift::Types::I32, :name => 'type', :default =>         0, :enum_class => ::Radar::API::TableLineType},
        CELLS => {:type => ::Thrift::Types::LIST, :name => 'cells', :element => {:type => ::Thrift::Types::STRING}}
      }

      def struct_fields; FIELDS; end

      def validate
        unless @type.nil? || ::Radar::API::TableLineType::VALID_VALUES.include?(@type)
          raise ::Thrift::ProtocolException.new(::Thrift::ProtocolException::UNKNOWN, 'Invalid value of field type!')
        end
      end

      ::Thrift::Struct.generate_accessors self
    end

    class Table
      include ::Thrift::Struct, ::Thrift::Struct_Union
      TITLE = 1
      LINES = 2

      FIELDS = {
        TITLE => {:type => ::Thrift::Types::STRING, :name => 'title'},
        LINES => {:type => ::Thrift::Types::LIST, :name => 'lines', :element => {:type => ::Thrift::Types::STRUCT, :class => ::Radar::API::TableLine}}
      }

      def struct_fields; FIELDS; end

      def validate
      end

      ::Thrift::Struct.generate_accessors self
    end

    class Result < ::Thrift::Union
      include ::Thrift::Struct_Union
      class << self
        def pie_chart(val)
          Result.new(:pie_chart, val)
        end

        def line_chart(val)
          Result.new(:line_chart, val)
        end
      end

      PIE_CHART = 1
      LINE_CHART = 2

      FIELDS = {
        PIE_CHART => {:type => ::Thrift::Types::STRUCT, :name => 'pie_chart', :class => ::Radar::API::PieChart},
        LINE_CHART => {:type => ::Thrift::Types::STRUCT, :name => 'line_chart', :class => ::Radar::API::LineChart}
      }

      def struct_fields; FIELDS; end

      def validate
        raise(StandardError, 'Union fields are not set.') if get_set_field.nil? || get_value.nil?
      end

      ::Thrift::Union.generate_accessors self
    end

    class Position
      include ::Thrift::Struct, ::Thrift::Struct_Union
      VALUE = 1

      FIELDS = {
        VALUE => {:type => ::Thrift::Types::DOUBLE, :name => 'value'}
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
