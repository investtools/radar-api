# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: exporter.proto for package 'Radar'

require 'grpc'
require 'exporter_pb'

module Radar
  module ReportGenerator
    class Service

      include GRPC::GenericService

      self.marshal_class_method = :encode
      self.unmarshal_class_method = :decode
      self.service_name = 'Radar.ReportGenerator'

      rpc :generate, GenerateReq, stream(Chunk)
    end

    Stub = Service.rpc_stub_class
  end
end
