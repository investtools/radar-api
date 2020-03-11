// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var portfolios_pb = require('./portfolios_pb.js');
var google_protobuf_timestamp_pb = require('google-protobuf/google/protobuf/timestamp_pb.js');

function serialize_Radar_Event(arg) {
  if (!(arg instanceof portfolios_pb.Event)) {
    throw new Error('Expected argument of type Radar.Event');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_Radar_Event(buffer_arg) {
  return portfolios_pb.Event.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_Radar_RunReq(arg) {
  if (!(arg instanceof portfolios_pb.RunReq)) {
    throw new Error('Expected argument of type Radar.RunReq');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_Radar_RunReq(buffer_arg) {
  return portfolios_pb.RunReq.deserializeBinary(new Uint8Array(buffer_arg));
}


var PortfoliosService = exports.PortfoliosService = {
  run: {
    path: '/Radar.Portfolios/Run',
    requestStream: false,
    responseStream: true,
    requestType: portfolios_pb.RunReq,
    responseType: portfolios_pb.Event,
    requestSerialize: serialize_Radar_RunReq,
    requestDeserialize: deserialize_Radar_RunReq,
    responseSerialize: serialize_Radar_Event,
    responseDeserialize: deserialize_Radar_Event,
  },
};

exports.PortfoliosClient = grpc.makeGenericClientConstructor(PortfoliosService);
