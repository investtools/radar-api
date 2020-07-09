// package: Radar
// file: exporter.proto

/* tslint:disable */
/* eslint-disable */

import * as jspb from "google-protobuf";

export class Metadata extends jspb.Message { 
    getFilename(): string;
    setFilename(value: string): Metadata;

    getPassword(): string;
    setPassword(value: string): Metadata;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): Metadata.AsObject;
    static toObject(includeInstance: boolean, msg: Metadata): Metadata.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: Metadata, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): Metadata;
    static deserializeBinaryFromReader(message: Metadata, reader: jspb.BinaryReader): Metadata;
}

export namespace Metadata {
    export type AsObject = {
        filename: string,
        password: string,
    }
}

export class GenerateReq extends jspb.Message { 
    getUserId(): string;
    setUserId(value: string): GenerateReq;

    getPortfolioId(): string;
    setPortfolioId(value: string): GenerateReq;


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

export class GenerateResp extends jspb.Message { 

    hasMetadata(): boolean;
    clearMetadata(): void;
    getMetadata(): Metadata | undefined;
    setMetadata(value?: Metadata): GenerateResp;


    hasChunk(): boolean;
    clearChunk(): void;
    getChunk(): Uint8Array | string;
    getChunk_asU8(): Uint8Array;
    getChunk_asB64(): string;
    setChunk(value: Uint8Array | string): GenerateResp;


    getTypeCase(): GenerateResp.TypeCase;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): GenerateResp.AsObject;
    static toObject(includeInstance: boolean, msg: GenerateResp): GenerateResp.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: GenerateResp, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): GenerateResp;
    static deserializeBinaryFromReader(message: GenerateResp, reader: jspb.BinaryReader): GenerateResp;
}

export namespace GenerateResp {
    export type AsObject = {
        metadata?: Metadata.AsObject,
        chunk: Uint8Array | string,
    }

    export enum TypeCase {
        TYPE_NOT_SET = 0,
    
    METADATA = 1,

    CHUNK = 2,

    }

}
