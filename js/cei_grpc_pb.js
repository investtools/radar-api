// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var cei_pb = require('./cei_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_RecoverPasswordReq(arg) {
  if (!(arg instanceof cei_pb.RecoverPasswordReq)) {
    throw new Error('Expected argument of type RecoverPasswordReq');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_RecoverPasswordReq(buffer_arg) {
  return cei_pb.RecoverPasswordReq.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_RecoverPasswordResp(arg) {
  if (!(arg instanceof cei_pb.RecoverPasswordResp)) {
    throw new Error('Expected argument of type RecoverPasswordResp');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_RecoverPasswordResp(buffer_arg) {
  return cei_pb.RecoverPasswordResp.deserializeBinary(new Uint8Array(buffer_arg));
}

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

function serialize_VerifyAccountReq(arg) {
  if (!(arg instanceof cei_pb.VerifyAccountReq)) {
    throw new Error('Expected argument of type VerifyAccountReq');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_VerifyAccountReq(buffer_arg) {
  return cei_pb.VerifyAccountReq.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_VerifyAccountResp(arg) {
  if (!(arg instanceof cei_pb.VerifyAccountResp)) {
    throw new Error('Expected argument of type VerifyAccountResp');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_VerifyAccountResp(buffer_arg) {
  return cei_pb.VerifyAccountResp.deserializeBinary(new Uint8Array(buffer_arg));
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
var AccountService = exports.AccountService = {
  verifyAccount: {
    path: '/Account/VerifyAccount',
    requestStream: false,
    responseStream: false,
    requestType: cei_pb.VerifyAccountReq,
    responseType: cei_pb.VerifyAccountResp,
    requestSerialize: serialize_VerifyAccountReq,
    requestDeserialize: deserialize_VerifyAccountReq,
    responseSerialize: serialize_VerifyAccountResp,
    responseDeserialize: deserialize_VerifyAccountResp,
  },
  recoverPassword: {
    path: '/Account/RecoverPassword',
    requestStream: false,
    responseStream: false,
    requestType: cei_pb.RecoverPasswordReq,
    responseType: cei_pb.RecoverPasswordResp,
    requestSerialize: serialize_RecoverPasswordReq,
    requestDeserialize: deserialize_RecoverPasswordReq,
    responseSerialize: serialize_RecoverPasswordResp,
    responseDeserialize: deserialize_RecoverPasswordResp,
  },
};

exports.AccountClient = grpc.makeGenericClientConstructor(AccountService);
