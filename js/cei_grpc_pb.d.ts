// package: 
// file: cei.proto

/* tslint:disable */
/* eslint-disable */

import * as grpc from "grpc";
import * as cei_pb from "./cei_pb";
import * as google_protobuf_timestamp_pb from "google-protobuf/google/protobuf/timestamp_pb";

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

interface IAccountService extends grpc.ServiceDefinition<grpc.UntypedServiceImplementation> {
    verifyAccount: IAccountService_IVerifyAccount;
    recoverPassword: IAccountService_IRecoverPassword;
    definePermanentPassword: IAccountService_IDefinePermanentPassword;
}

interface IAccountService_IVerifyAccount extends grpc.MethodDefinition<cei_pb.VerifyAccountReq, cei_pb.VerifyAccountResp> {
    path: string; // "/.Account/VerifyAccount"
    requestStream: false;
    responseStream: false;
    requestSerialize: grpc.serialize<cei_pb.VerifyAccountReq>;
    requestDeserialize: grpc.deserialize<cei_pb.VerifyAccountReq>;
    responseSerialize: grpc.serialize<cei_pb.VerifyAccountResp>;
    responseDeserialize: grpc.deserialize<cei_pb.VerifyAccountResp>;
}
interface IAccountService_IRecoverPassword extends grpc.MethodDefinition<cei_pb.RecoverPasswordReq, cei_pb.RecoverPasswordResp> {
    path: string; // "/.Account/RecoverPassword"
    requestStream: false;
    responseStream: false;
    requestSerialize: grpc.serialize<cei_pb.RecoverPasswordReq>;
    requestDeserialize: grpc.deserialize<cei_pb.RecoverPasswordReq>;
    responseSerialize: grpc.serialize<cei_pb.RecoverPasswordResp>;
    responseDeserialize: grpc.deserialize<cei_pb.RecoverPasswordResp>;
}
interface IAccountService_IDefinePermanentPassword extends grpc.MethodDefinition<cei_pb.DefinePermanentPasswordReq, cei_pb.DefinePermanentPasswordResp> {
    path: string; // "/.Account/DefinePermanentPassword"
    requestStream: false;
    responseStream: false;
    requestSerialize: grpc.serialize<cei_pb.DefinePermanentPasswordReq>;
    requestDeserialize: grpc.deserialize<cei_pb.DefinePermanentPasswordReq>;
    responseSerialize: grpc.serialize<cei_pb.DefinePermanentPasswordResp>;
    responseDeserialize: grpc.deserialize<cei_pb.DefinePermanentPasswordResp>;
}

export const AccountService: IAccountService;

export interface IAccountServer {
    verifyAccount: grpc.handleUnaryCall<cei_pb.VerifyAccountReq, cei_pb.VerifyAccountResp>;
    recoverPassword: grpc.handleUnaryCall<cei_pb.RecoverPasswordReq, cei_pb.RecoverPasswordResp>;
    definePermanentPassword: grpc.handleUnaryCall<cei_pb.DefinePermanentPasswordReq, cei_pb.DefinePermanentPasswordResp>;
}

export interface IAccountClient {
    verifyAccount(request: cei_pb.VerifyAccountReq, callback: (error: grpc.ServiceError | null, response: cei_pb.VerifyAccountResp) => void): grpc.ClientUnaryCall;
    verifyAccount(request: cei_pb.VerifyAccountReq, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: cei_pb.VerifyAccountResp) => void): grpc.ClientUnaryCall;
    verifyAccount(request: cei_pb.VerifyAccountReq, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: cei_pb.VerifyAccountResp) => void): grpc.ClientUnaryCall;
    recoverPassword(request: cei_pb.RecoverPasswordReq, callback: (error: grpc.ServiceError | null, response: cei_pb.RecoverPasswordResp) => void): grpc.ClientUnaryCall;
    recoverPassword(request: cei_pb.RecoverPasswordReq, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: cei_pb.RecoverPasswordResp) => void): grpc.ClientUnaryCall;
    recoverPassword(request: cei_pb.RecoverPasswordReq, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: cei_pb.RecoverPasswordResp) => void): grpc.ClientUnaryCall;
    definePermanentPassword(request: cei_pb.DefinePermanentPasswordReq, callback: (error: grpc.ServiceError | null, response: cei_pb.DefinePermanentPasswordResp) => void): grpc.ClientUnaryCall;
    definePermanentPassword(request: cei_pb.DefinePermanentPasswordReq, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: cei_pb.DefinePermanentPasswordResp) => void): grpc.ClientUnaryCall;
    definePermanentPassword(request: cei_pb.DefinePermanentPasswordReq, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: cei_pb.DefinePermanentPasswordResp) => void): grpc.ClientUnaryCall;
}

export class AccountClient extends grpc.Client implements IAccountClient {
    constructor(address: string, credentials: grpc.ChannelCredentials, options?: object);
    public verifyAccount(request: cei_pb.VerifyAccountReq, callback: (error: grpc.ServiceError | null, response: cei_pb.VerifyAccountResp) => void): grpc.ClientUnaryCall;
    public verifyAccount(request: cei_pb.VerifyAccountReq, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: cei_pb.VerifyAccountResp) => void): grpc.ClientUnaryCall;
    public verifyAccount(request: cei_pb.VerifyAccountReq, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: cei_pb.VerifyAccountResp) => void): grpc.ClientUnaryCall;
    public recoverPassword(request: cei_pb.RecoverPasswordReq, callback: (error: grpc.ServiceError | null, response: cei_pb.RecoverPasswordResp) => void): grpc.ClientUnaryCall;
    public recoverPassword(request: cei_pb.RecoverPasswordReq, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: cei_pb.RecoverPasswordResp) => void): grpc.ClientUnaryCall;
    public recoverPassword(request: cei_pb.RecoverPasswordReq, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: cei_pb.RecoverPasswordResp) => void): grpc.ClientUnaryCall;
    public definePermanentPassword(request: cei_pb.DefinePermanentPasswordReq, callback: (error: grpc.ServiceError | null, response: cei_pb.DefinePermanentPasswordResp) => void): grpc.ClientUnaryCall;
    public definePermanentPassword(request: cei_pb.DefinePermanentPasswordReq, metadata: grpc.Metadata, callback: (error: grpc.ServiceError | null, response: cei_pb.DefinePermanentPasswordResp) => void): grpc.ClientUnaryCall;
    public definePermanentPassword(request: cei_pb.DefinePermanentPasswordReq, metadata: grpc.Metadata, options: Partial<grpc.CallOptions>, callback: (error: grpc.ServiceError | null, response: cei_pb.DefinePermanentPasswordResp) => void): grpc.ClientUnaryCall;
}
