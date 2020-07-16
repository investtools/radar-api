// package: 
// file: cei.proto

/* tslint:disable */
/* eslint-disable */

import * as jspb from "google-protobuf";
import * as google_protobuf_timestamp_pb from "google-protobuf/google/protobuf/timestamp_pb";

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

export class AuthenticateReq extends jspb.Message { 
    getUsername(): string;
    setUsername(value: string): AuthenticateReq;

    getPassword(): string;
    setPassword(value: string): AuthenticateReq;

    getPartialEmail(): string;
    setPartialEmail(value: string): AuthenticateReq;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): AuthenticateReq.AsObject;
    static toObject(includeInstance: boolean, msg: AuthenticateReq): AuthenticateReq.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: AuthenticateReq, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): AuthenticateReq;
    static deserializeBinaryFromReader(message: AuthenticateReq, reader: jspb.BinaryReader): AuthenticateReq;
}

export namespace AuthenticateReq {
    export type AsObject = {
        username: string,
        password: string,
        partialEmail: string,
    }
}

export class AuthenticateResp extends jspb.Message { 
    getUserFullName(): string;
    setUserFullName(value: string): AuthenticateResp;

    getUserFullEmail(): string;
    setUserFullEmail(value: string): AuthenticateResp;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): AuthenticateResp.AsObject;
    static toObject(includeInstance: boolean, msg: AuthenticateResp): AuthenticateResp.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: AuthenticateResp, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): AuthenticateResp;
    static deserializeBinaryFromReader(message: AuthenticateResp, reader: jspb.BinaryReader): AuthenticateResp;
}

export namespace AuthenticateResp {
    export type AsObject = {
        userFullName: string,
        userFullEmail: string,
    }
}

export class VerifyAccountReq extends jspb.Message { 
    getUsername(): string;
    setUsername(value: string): VerifyAccountReq;


    hasBirthdate(): boolean;
    clearBirthdate(): void;
    getBirthdate(): google_protobuf_timestamp_pb.Timestamp | undefined;
    setBirthdate(value?: google_protobuf_timestamp_pb.Timestamp): VerifyAccountReq;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): VerifyAccountReq.AsObject;
    static toObject(includeInstance: boolean, msg: VerifyAccountReq): VerifyAccountReq.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: VerifyAccountReq, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): VerifyAccountReq;
    static deserializeBinaryFromReader(message: VerifyAccountReq, reader: jspb.BinaryReader): VerifyAccountReq;
}

export namespace VerifyAccountReq {
    export type AsObject = {
        username: string,
        birthdate?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    }
}

export class VerifyAccountResp extends jspb.Message { 
    getExist(): boolean;
    setExist(value: boolean): VerifyAccountResp;

    getPartialEmail(): string;
    setPartialEmail(value: string): VerifyAccountResp;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): VerifyAccountResp.AsObject;
    static toObject(includeInstance: boolean, msg: VerifyAccountResp): VerifyAccountResp.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: VerifyAccountResp, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): VerifyAccountResp;
    static deserializeBinaryFromReader(message: VerifyAccountResp, reader: jspb.BinaryReader): VerifyAccountResp;
}

export namespace VerifyAccountResp {
    export type AsObject = {
        exist: boolean,
        partialEmail: string,
    }
}

export class RecoverPasswordReq extends jspb.Message { 
    getUsername(): string;
    setUsername(value: string): RecoverPasswordReq;


    hasBirthdate(): boolean;
    clearBirthdate(): void;
    getBirthdate(): google_protobuf_timestamp_pb.Timestamp | undefined;
    setBirthdate(value?: google_protobuf_timestamp_pb.Timestamp): RecoverPasswordReq;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): RecoverPasswordReq.AsObject;
    static toObject(includeInstance: boolean, msg: RecoverPasswordReq): RecoverPasswordReq.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: RecoverPasswordReq, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): RecoverPasswordReq;
    static deserializeBinaryFromReader(message: RecoverPasswordReq, reader: jspb.BinaryReader): RecoverPasswordReq;
}

export namespace RecoverPasswordReq {
    export type AsObject = {
        username: string,
        birthdate?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    }
}

export class RecoverPasswordResp extends jspb.Message { 

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): RecoverPasswordResp.AsObject;
    static toObject(includeInstance: boolean, msg: RecoverPasswordResp): RecoverPasswordResp.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: RecoverPasswordResp, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): RecoverPasswordResp;
    static deserializeBinaryFromReader(message: RecoverPasswordResp, reader: jspb.BinaryReader): RecoverPasswordResp;
}

export namespace RecoverPasswordResp {
    export type AsObject = {
    }
}

export class DefinePermanentPasswordReq extends jspb.Message { 
    getUsername(): string;
    setUsername(value: string): DefinePermanentPasswordReq;

    getTemporaryPassword(): string;
    setTemporaryPassword(value: string): DefinePermanentPasswordReq;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): DefinePermanentPasswordReq.AsObject;
    static toObject(includeInstance: boolean, msg: DefinePermanentPasswordReq): DefinePermanentPasswordReq.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: DefinePermanentPasswordReq, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): DefinePermanentPasswordReq;
    static deserializeBinaryFromReader(message: DefinePermanentPasswordReq, reader: jspb.BinaryReader): DefinePermanentPasswordReq;
}

export namespace DefinePermanentPasswordReq {
    export type AsObject = {
        username: string,
        temporaryPassword: string,
    }
}

export class DefinePermanentPasswordResp extends jspb.Message { 
    getPermanentPassword(): string;
    setPermanentPassword(value: string): DefinePermanentPasswordResp;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): DefinePermanentPasswordResp.AsObject;
    static toObject(includeInstance: boolean, msg: DefinePermanentPasswordResp): DefinePermanentPasswordResp.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: DefinePermanentPasswordResp, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): DefinePermanentPasswordResp;
    static deserializeBinaryFromReader(message: DefinePermanentPasswordResp, reader: jspb.BinaryReader): DefinePermanentPasswordResp;
}

export namespace DefinePermanentPasswordResp {
    export type AsObject = {
        permanentPassword: string,
    }
}
