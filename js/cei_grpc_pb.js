// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cei_pb = require('./cei_pb.js');

function serialize_SolveReq(arg) {
  if (!(arg instanceof cei_pb.SolveReq)) {
    throw new Error('Expected argument of type SolveReq');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_SolveReq(buffer_arg) {
  return cei_pb.SolveReq.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_SolveResp(arg) {
  if (!(arg instanceof cei_pb.SolveResp)) {
    throw new Error('Expected argument of type SolveResp');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_SolveResp(buffer_arg) {
  return cei_pb.SolveResp.deserializeBinary(new Uint8Array(buffer_arg));
}


var CaptchaCrackerService = exports.CaptchaCrackerService = {
  solve: {
    path: '/CaptchaCracker/Solve',
    requestStream: false,
    responseStream: false,
    requestType: cei_pb.SolveReq,
    responseType: cei_pb.SolveResp,
    requestSerialize: serialize_SolveReq,
    requestDeserialize: deserialize_SolveReq,
    responseSerialize: serialize_SolveResp,
    responseDeserialize: deserialize_SolveResp,
  },
};

exports.CaptchaCrackerClient = grpc.makeGenericClientConstructor(CaptchaCrackerService);
