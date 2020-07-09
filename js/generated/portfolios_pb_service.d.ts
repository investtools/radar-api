// package: Radar
// file: portfolios.proto

import * as portfolios_pb from "./portfolios_pb";
import {grpc} from "@improbable-eng/grpc-web";

type PortfoliosRun = {
  readonly methodName: string;
  readonly service: typeof Portfolios;
  readonly requestStream: false;
  readonly responseStream: true;
  readonly requestType: typeof portfolios_pb.RunReq;
  readonly responseType: typeof portfolios_pb.Event;
};

export class Portfolios {
  static readonly serviceName: string;
  static readonly Run: PortfoliosRun;
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

export class PortfoliosClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  run(requestMessage: portfolios_pb.RunReq, metadata?: grpc.Metadata): ResponseStream<portfolios_pb.Event>;
}

