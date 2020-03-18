// package: Radar
// file: exporter.proto

/* tslint:disable */
/* eslint-disable */

import * as jspb from "google-protobuf";

export class Chunk extends jspb.Message { 
    getContent(): Uint8Array | string;
    getContent_asU8(): Uint8Array;
    getContent_asB64(): string;
    setContent(value: Uint8Array | string): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): Chunk.AsObject;
    static toObject(includeInstance: boolean, msg: Chunk): Chunk.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: Chunk, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): Chunk;
    static deserializeBinaryFromReader(message: Chunk, reader: jspb.BinaryReader): Chunk;
}

export namespace Chunk {
    export type AsObject = {
        content: Uint8Array | string,
    }
}

export class GenerateReq extends jspb.Message { 
    getUserId(): string;
    setUserId(value: string): void;

    getPortfolioId(): string;
    setPortfolioId(value: string): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): GenerateReq.AsObject;
    static toObject(includeInstance: boolean, msg: GenerateReq): GenerateReq.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: GenerateReq, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): GenerateReq;
    static deserializeBinaryFromReader(message: GenerateReq, reader: jspb.BinaryReader): GenerateReq;
}

export namespace GenerateReq {
    export type AsObject = {
        userId: string,
        portfolioId: string,
    }
}
