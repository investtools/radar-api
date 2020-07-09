// package: Radar
// file: exporter.proto

import * as exporter_pb from "./exporter_pb";
import {grpc} from "@improbable-eng/grpc-web";

type ReportGeneratorGenerate = {
  readonly methodName: string;
  readonly service: typeof ReportGenerator;
  readonly requestStream: false;
  readonly responseStream: true;
  readonly requestType: typeof exporter_pb.GenerateReq;
  readonly responseType: typeof exporter_pb.GenerateResp;
};

export class ReportGenerator {
  static readonly serviceName: string;
  static readonly Generate: ReportGeneratorGenerate;
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

export class ReportGeneratorClient {
  readonly serviceHost: string;

  constructor(serviceHost: string, options?: grpc.RpcOptions);
  generate(requestMessage: exporter_pb.GenerateReq, metadata?: grpc.Metadata): ResponseStream<exporter_pb.GenerateResp>;
}

