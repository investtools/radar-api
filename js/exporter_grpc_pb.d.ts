// package: Radar
// file: exporter.proto

/* tslint:disable */
/* eslint-disable */

import * as grpc from "grpc";
import * as exporter_pb from "./exporter_pb";
import * as google_protobuf_empty_pb from "google-protobuf/google/protobuf/empty_pb";

interface IReportGeneratorService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
    generate: IReportGeneratorService_Igenerate;
}

interface IReportGeneratorService_Igenerate extends grpc.MethodDefinition<google_protobuf_empty_pb.Empty, exporter_pb.Chunk> {
    path: string; // "/Radar.ReportGenerator/generate"
    requestStream: boolean; // false
    responseStream: boolean; // true
    requestSerialize: grpc.serialize<google_protobuf_empty_pb.Empty>;
    requestDeserialize: grpc.deserialize<google_protobuf_empty_pb.Empty>;
    responseSerialize: grpc.serialize<exporter_pb.Chunk>;
    responseDeserialize: grpc.deserialize<exporter_pb.Chunk>;
}

export const ReportGeneratorService: IReportGeneratorService;

export interface IReportGeneratorServer {
    generate: grpc.handleServerStreamingCall<google_protobuf_empty_pb.Empty, exporter_pb.Chunk>;
}

export interface IReportGeneratorClient {
    generate(request: google_protobuf_empty_pb.Empty, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<exporter_pb.Chunk>;
    generate(request: google_protobuf_empty_pb.Empty, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<exporter_pb.Chunk>;
}

export class ReportGeneratorClient extends grpc.Client implements IReportGeneratorClient {
    constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
    public generate(request: google_protobuf_empty_pb.Empty, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<exporter_pb.Chunk>;
    public generate(request: google_protobuf_empty_pb.Empty, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<exporter_pb.Chunk>;
}
