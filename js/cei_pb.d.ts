// package: 
// file: cei.proto

/* tslint:disable */
/* eslint-disable */

import * as jspb from "google-protobuf";

export class SolveReq extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): SolveReq.AsObject;
    static toObject(includeInstance: boolean, msg: SolveReq): SolveReq.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: SolveReq, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): SolveReq;
    static deserializeBinaryFromReader(message: SolveReq, reader: jspb.BinaryReader): SolveReq;
}

export namespace SolveReq {
    export type AsObject = {
    }
}

export class SolveResp extends jspb.Message { 
    getText(): string;
    setText(value: string): SolveResp;


    getCookiesMap(): jspb.Map<string, string>;
    clearCookiesMap(): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): SolveResp.AsObject;
    static toObject(includeInstance: boolean, msg: SolveResp): SolveResp.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: SolveResp, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): SolveResp;
    static deserializeBinaryFromReader(message: SolveResp, reader: jspb.BinaryReader): SolveResp;
}

export namespace SolveResp {
    export type AsObject = {
        text: string,

        cookiesMap: Array<[string, string]>,
    }
}
