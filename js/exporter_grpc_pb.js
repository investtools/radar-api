// GENERATED CODE -- DO NOT EDIT!

'use strict';
var grpc = require('grpc');
var exporter_pb = require('./exporter_pb.js');
var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');

function serialize_Radar_Chunk(arg) {
  if (!(arg instanceof exporter_pb.Chunk)) {
    throw new Error('Expected argument of type Radar.Chunk');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_Radar_Chunk(buffer_arg) {
  return exporter_pb.Chunk.deserializeBinary(new Uint8Array(buffer_arg));
}

function serialize_google_protobuf_Empty(arg) {
  if (!(arg instanceof google_protobuf_empty_pb.Empty)) {
    throw new Error('Expected argument of type google.protobuf.Empty');
  }
  return Buffer.from(arg.serializeBinary());
}

function deserialize_google_protobuf_Empty(buffer_arg) {
  return google_protobuf_empty_pb.Empty.deserializeBinary(new Uint8Array(buffer_arg));
}


var ReportGeneratorService = exports.ReportGeneratorService = {
  generate: {
    path: '/Radar.ReportGenerator/generate',
    requestStream: false,
    responseStream: true,
    requestType: google_protobuf_empty_pb.Empty,
    responseType: exporter_pb.Chunk,
    requestSerialize: serialize_google_protobuf_Empty,
    requestDeserialize: deserialize_google_protobuf_Empty,
    responseSerialize: serialize_Radar_Chunk,
    responseDeserialize: deserialize_Radar_Chunk,
  },
};

exports.ReportGeneratorClient = grpc.makeGenericClientConstructor(ReportGeneratorService);
