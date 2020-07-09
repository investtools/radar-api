// package: 
// file: cei.proto

import * as cei_pb from "./cei_pb";
import {grpc} from "@improbable-eng/grpc-web";

type CaptchaCrackerSolve = {
  readonly methodName: string;
  readonly service: typeof CaptchaCracker;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof cei_pb.SolveReq;
  readonly responseType: typeof cei_pb.SolveResp;
};

export class CaptchaCracker {
  static readonly serviceName: string;
  static readonly Solve: CaptchaCrackerSolve;
}

type AccountVerifyAccount = {
  readonly methodName: string;
  readonly service: typeof Account;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof cei_pb.VerifyAccountReq;
  readonly responseType: typeof cei_pb.VerifyAccountResp;
};

type AccountRecoverPassword = {
  readonly methodName: string;
  readonly service: typeof Account;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof cei_pb.RecoverPasswordReq;
  readonly responseType: typeof cei_pb.RecoverPasswordResp;
};

type AccountDefinePermanentPassword = {
  readonly methodName: string;
  readonly service: typeof Account;
  readonly requestStream: false;
  readonly responseStream: false;
  readonly requestType: typeof cei_pb.DefinePermanentPasswordReq;
  readonly responseType: typeof cei_pb.DefinePermanentPasswordResp;
};

export class Account {
  static readonly serviceName: string;
  static readonly VerifyAccount: AccountVerifyAccount;
  static readonly RecoverPassword: AccountRecoverPassword;
  static readonly DefinePermanentPassword: AccountDefinePermanentPassword;
}

export type ServiceError = { message: string, code: number; metadata: grpc.Metadata }
export type Status = { details: string, code: number; metadata: grpc.Metadata }

interface UnaryResponse {
  cancel(): void;
}
interface ResponseStream<T> {
  cancel(): void;
  on(type: 'data', handler: (message: T) => void): ResponseStream<T>;
  on(type: 'end', handler: (status?: Status) => void): ResponseStream<T>;
  on(type: 'status', handler: (status: Status) => void): ResponseStream<T>;
}
interface RequestStream<T> {
  write(message: T): RequestStream<T>;
  end(): void;
  cancel(): void;
  on(type: 'end', handler: (status?: Status) => void): RequestStream<T>;
  on(type: 'status', handler: (status: Status) => void): RequestStream<T>;
}
interface BidirectionalStream<ReqT, ResT> {
  write(message: ReqT): BidirectionalStream<ReqT, ResT>;
  end(): void;
  cancel(): void;
  on(type: 'data', handler: (message: ResT) => void): BidirectionalStream<ReqT, ResT>;
  on(type: 'end', handler: (status?: Status) => void): BidirectionalStream<ReqT, ResT>;
  on(type: 'status', handler: (status: Status) => void): BidirectionalStream<ReqT, ResT>;
}

export class CaptchaCrackerClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  solve(
    requestMessage: cei_pb.SolveReq,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: cei_pb.SolveResp|null) => void
  ): UnaryResponse;
  solve(
    requestMessage: cei_pb.SolveReq,
    callback: (error: ServiceError|null, responseMessage: cei_pb.SolveResp|null) => void
  ): UnaryResponse;
}

export class AccountClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  verifyAccount(
    requestMessage: cei_pb.VerifyAccountReq,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: cei_pb.VerifyAccountResp|null) => void
  ): UnaryResponse;
  verifyAccount(
    requestMessage: cei_pb.VerifyAccountReq,
    callback: (error: ServiceError|null, responseMessage: cei_pb.VerifyAccountResp|null) => void
  ): UnaryResponse;
  recoverPassword(
    requestMessage: cei_pb.RecoverPasswordReq,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: cei_pb.RecoverPasswordResp|null) => void
  ): UnaryResponse;
  recoverPassword(
    requestMessage: cei_pb.RecoverPasswordReq,
    callback: (error: ServiceError|null, responseMessage: cei_pb.RecoverPasswordResp|null) => void
  ): UnaryResponse;
  definePermanentPassword(
    requestMessage: cei_pb.DefinePermanentPasswordReq,
    metadata: grpc.Metadata,
    callback: (error: ServiceError|null, responseMessage: cei_pb.DefinePermanentPasswordResp|null) => void
  ): UnaryResponse;
  definePermanentPassword(
    requestMessage: cei_pb.DefinePermanentPasswordReq,
    callback: (error: ServiceError|null, responseMessage: cei_pb.DefinePermanentPasswordResp|null) => void
  ): UnaryResponse;
}

