// package: Radar
// file: portfolios.proto

/* tslint:disable */
/* eslint-disable */

import * as grpc from "grpc";
import * as portfolios_pb from "./portfolios_pb";
import * as google_protobuf_timestamp_pb from "google-protobuf/google/protobuf/timestamp_pb";

interface IPortfoliosService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
    run: IPortfoliosService_IRun;
}

interface IPortfoliosService_IRun extends grpc.MethodDefinition<portfolios_pb.RunReq, portfolios_pb.Event> {
    path: string; // "/Radar.Portfolios/Run"
    requestStream: boolean; // false
    responseStream: boolean; // true
    requestSerialize: grpc.serialize<portfolios_pb.RunReq>;
    requestDeserialize: grpc.deserialize<portfolios_pb.RunReq>;
    responseSerialize: grpc.serialize<portfolios_pb.Event>;
    responseDeserialize: grpc.deserialize<portfolios_pb.Event>;
}

export const PortfoliosService: IPortfoliosService;

export interface IPortfoliosServer {
    run: grpc.handleServerStreamingCall<portfolios_pb.RunReq, portfolios_pb.Event>;
}

export interface IPortfoliosClient {
    run(request: portfolios_pb.RunReq, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<portfolios_pb.Event>;
    run(request: portfolios_pb.RunReq, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<portfolios_pb.Event>;
}

export class PortfoliosClient extends grpc.Client implements IPortfoliosClient {
    constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
    public run(request: portfolios_pb.RunReq, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<portfolios_pb.Event>;
    public run(request: portfolios_pb.RunReq, metadata?: grpc.Metadata, options?: Partial<grpc.CallOptions>): grpc.ClientReadableStream<portfolios_pb.Event>;
}
