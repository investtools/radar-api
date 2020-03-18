// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var exporter_pb = require('./exporter_pb.js');

function serialize_Radar_Chunk(arg) {
  if (!(arg instanceof exporter_pb.Chunk)) {
    throw new Error('Expected argument of type Radar.Chunk');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_Radar_Chunk(buffer_arg) {
  return exporter_pb.Chunk.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_Radar_GenerateReq(arg) {
  if (!(arg instanceof exporter_pb.GenerateReq)) {
    throw new Error('Expected argument of type Radar.GenerateReq');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_Radar_GenerateReq(buffer_arg) {
  return exporter_pb.GenerateReq.deserializeBinary(new Uint8Array(buffer_arg));
}


var ReportGeneratorService = exports.ReportGeneratorService = {
  generate: {
    path: '/Radar.ReportGenerator/generate',
    requestStream: false,
    responseStream: true,
    requestType: exporter_pb.GenerateReq,
    responseType: exporter_pb.Chunk,
    requestSerialize: serialize_Radar_GenerateReq,
    requestDeserialize: deserialize_Radar_GenerateReq,
    responseSerialize: serialize_Radar_Chunk,
    responseDeserialize: deserialize_Radar_Chunk,
  },
};

exports.ReportGeneratorClient = grpc.makeGenericClientConstructor(ReportGeneratorService);
