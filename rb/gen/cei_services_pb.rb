# Generated by the protocol buffer compiler.  DO NOT EDIT!
# Source: cei.proto for package ''

require 'grpc'
require 'cei_pb'

module CaptchaCracker
  class Service

    include GRPC::GenericService

    self.marshal_class_method = :encode
    self.unmarshal_class_method = :decode
    self.service_name = 'CaptchaCracker'

    rpc :Solve, SolveReq, SolveResp
  end

  Stub = Service.rpc_stub_class
end
