// package: Radar
// file: exporter.proto

/* tslint:disable */
/* eslint-disable */

import * as grpc from "grpc";
import * as exporter_pb from "./exporter_pb";

interface IReportGeneratorService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
    generate: IReportGeneratorService_IGenerate;
}

interface IReportGeneratorService_IGenerate extends grpc.MethodDefinition<exporter_pb.GenerateReq, exporter_pb.GenerateResp> {
    path: string; // "/Radar.ReportGenerator/Generate"
    requestStream: false;
    responseStream: true;
    requestSerialize: grpc.serialize<exporter_pb.GenerateReq>;
    requestDeserialize: grpc.deserialize<exporter_pb.GenerateReq>;
    responseSerialize: grpc.serialize<exporter_pb.GenerateResp>;
    responseDeserialize: grpc.deserialize<exporter_pb.GenerateResp>;
}

export const ReportGeneratorService: IReportGeneratorService;

export interface IReportGeneratorServer {
    generate: grpc.handleServerStreamingCall<exporter_pb.GenerateReq, exporter_pb.GenerateResp>;
}

export interface IReportGeneratorClient {
    generate(request: exporter_pb.GenerateReq, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<exporter_pb.GenerateResp>;
    generate(request: exporter_pb.GenerateReq, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<exporter_pb.GenerateResp>;
}

export class ReportGeneratorClient extends grpc.Client implements IReportGeneratorClient {
    constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
    public generate(request: exporter_pb.GenerateReq, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<exporter_pb.GenerateResp>;
    public generate(request: exporter_pb.GenerateReq, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<exporter_pb.GenerateResp>;
}
