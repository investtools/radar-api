// package: 
// file: cei.proto

/* tslint:disable */
/* eslint-disable */

import * as grpc from "grpc";
import * as cei_pb from "./cei_pb";

interface ICaptchaCrackerService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
    solve: ICaptchaCrackerService_ISolve;
}

interface ICaptchaCrackerService_ISolve extends grpc.MethodDefinition<cei_pb.SolveReq, cei_pb.SolveResp> {
    path: string; // "/.CaptchaCracker/Solve"
    requestStream: false;
    responseStream: false;
    requestSerialize: grpc.serialize<cei_pb.SolveReq>;
    requestDeserialize: grpc.deserialize<cei_pb.SolveReq>;
    responseSerialize: grpc.serialize<cei_pb.SolveResp>;
    responseDeserialize: grpc.deserialize<cei_pb.SolveResp>;
}

export const CaptchaCrackerService: ICaptchaCrackerService;

export interface ICaptchaCrackerServer {
    solve: grpc.handleUnaryCall<cei_pb.SolveReq, cei_pb.SolveResp>;
}

export interface ICaptchaCrackerClient {
    solve(request: cei_pb.SolveReq, callback: (error: grpc.ServiceError | null, response: cei_pb.SolveResp) => void): grpc.ClientUnaryCall;
    solve(request: cei_pb.SolveReq, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: cei_pb.SolveResp) => void): grpc.ClientUnaryCall;
    solve(request: cei_pb.SolveReq, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: cei_pb.SolveResp) => void): grpc.ClientUnaryCall;
}

export class CaptchaCrackerClient extends grpc.Client implements ICaptchaCrackerClient {
    constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
    public solve(request: cei_pb.SolveReq, callback: (error: grpc.ServiceError | null, response: cei_pb.SolveResp) => void): grpc.ClientUnaryCall;
    public solve(request: cei_pb.SolveReq, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: cei_pb.SolveResp) => void): grpc.ClientUnaryCall;
    public solve(request: cei_pb.SolveReq, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: cei_pb.SolveResp) => void): grpc.ClientUnaryCall;
}
