// package: Radar
// file: portfolios.proto

/* tslint:disable */
/* eslint-disable */

import * as jspb from "google-protobuf";
import * as google_protobuf_timestamp_pb from "google-protobuf/google/protobuf/timestamp_pb";

export class Event extends jspb.Message { 

    hasDate(): boolean;
    clearDate(): void;
    getDate(): google_protobuf_timestamp_pb.Timestamp | undefined;
    setDate(value?: google_protobuf_timestamp_pb.Timestamp): void;


    hasCashFlow(): boolean;
    clearCashFlow(): void;
    getCashFlow(): Event.CashFlow | undefined;
    setCashFlow(value?: Event.CashFlow): void;


    hasPortfolio(): boolean;
    clearPortfolio(): void;
    getPortfolio(): Event.Portfolio | undefined;
    setPortfolio(value?: Event.Portfolio): void;


    getTypeCase(): Event.TypeCase;

    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): Event.AsObject;
    static toObject(includeInstance: boolean, msg: Event): Event.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: Event, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): Event;
    static deserializeBinaryFromReader(message: Event, reader: jspb.BinaryReader): Event;
}

export namespace Event {
    export type AsObject = {
        date?: google_protobuf_timestamp_pb.Timestamp.AsObject,
        cashFlow?: Event.CashFlow.AsObject,
        portfolio?: Event.Portfolio.AsObject,
    }


    export class CashFlow extends jspb.Message { 
        getType(): Event.CashFlow.Type;
        setType(value: Event.CashFlow.Type): void;

        getValue(): number;
        setValue(value: number): void;

        getSource(): string;
        setSource(value: string): void;


        serializeBinary(): Uint8Array;
        toObject(includeInstance?: boolean): CashFlow.AsObject;
        static toObject(includeInstance: boolean, msg: CashFlow): CashFlow.AsObject;
        static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
        static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
        static serializeBinaryToWriter(message: CashFlow, writer: jspb.BinaryWriter): void;
        static deserializeBinary(bytes: Uint8Array): CashFlow;
        static deserializeBinaryFromReader(message: CashFlow, reader: jspb.BinaryReader): CashFlow;
    }

    export namespace CashFlow {
        export type AsObject = {
            type: Event.CashFlow.Type,
            value: number,
            source: string,
        }

        export enum Type {
    DIVIDEND = 0,
    INTEREST_ON_OWN_CAPITAL = 1,
        }

    }

    export class Portfolio extends jspb.Message { 
        clearPositionsList(): void;
        getPositionsList(): Array<Event.Portfolio.Position>;
        setPositionsList(value: Array<Event.Portfolio.Position>): void;
        addPositions(value?: Event.Portfolio.Position, index?: number): Event.Portfolio.Position;

        clearProvisionsList(): void;
        getProvisionsList(): Array<Event.Portfolio.Provision>;
        setProvisionsList(value: Array<Event.Portfolio.Provision>): void;
        addProvisions(value?: Event.Portfolio.Provision, index?: number): Event.Portfolio.Provision;


        serializeBinary(): Uint8Array;
        toObject(includeInstance?: boolean): Portfolio.AsObject;
        static toObject(includeInstance: boolean, msg: Portfolio): Portfolio.AsObject;
        static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
        static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
        static serializeBinaryToWriter(message: Portfolio, writer: jspb.BinaryWriter): void;
        static deserializeBinary(bytes: Uint8Array): Portfolio;
        static deserializeBinaryFromReader(message: Portfolio, reader: jspb.BinaryReader): Portfolio;
    }

    export namespace Portfolio {
        export type AsObject = {
            positionsList: Array<Event.Portfolio.Position.AsObject>,
            provisionsList: Array<Event.Portfolio.Provision.AsObject>,
        }


        export class Position extends jspb.Message { 
            getId(): string;
            setId(value: string): void;

            getShares(): number;
            setShares(value: number): void;

            getValue(): number;
            setValue(value: number): void;

            getAvgPrice(): number;
            setAvgPrice(value: number): void;


            serializeBinary(): Uint8Array;
            toObject(includeInstance?: boolean): Position.AsObject;
            static toObject(includeInstance: boolean, msg: Position): Position.AsObject;
            static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
            static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
            static serializeBinaryToWriter(message: Position, writer: jspb.BinaryWriter): void;
            static deserializeBinary(bytes: Uint8Array): Position;
            static deserializeBinaryFromReader(message: Position, reader: jspb.BinaryReader): Position;
        }

        export namespace Position {
            export type AsObject = {
                id: string,
                shares: number,
                value: number,
                avgPrice: number,
            }
        }

        export class Provision extends jspb.Message { 
            getValue(): number;
            setValue(value: number): void;

            getSource(): string;
            setSource(value: string): void;


            serializeBinary(): Uint8Array;
            toObject(includeInstance?: boolean): Provision.AsObject;
            static toObject(includeInstance: boolean, msg: Provision): Provision.AsObject;
            static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
            static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
            static serializeBinaryToWriter(message: Provision, writer: jspb.BinaryWriter): void;
            static deserializeBinary(bytes: Uint8Array): Provision;
            static deserializeBinaryFromReader(message: Provision, reader: jspb.BinaryReader): Provision;
        }

        export namespace Provision {
            export type AsObject = {
                value: number,
                source: string,
            }
        }

    }


    export enum TypeCase {
        TYPE_NOT_SET = 0,
    
    CASH_FLOW = 20,

    PORTFOLIO = 21,

    }

}

export class RunReq extends jspb.Message { 
    getUserId(): string;
    setUserId(value: string): void;

    getEvents(): RunReq.Events;
    setEvents(value: RunReq.Events): void;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): RunReq.AsObject;
    static toObject(includeInstance: boolean, msg: RunReq): RunReq.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: RunReq, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): RunReq;
    static deserializeBinaryFromReader(message: RunReq, reader: jspb.BinaryReader): RunReq;
}

export namespace RunReq {
    export type AsObject = {
        userId: string,
        events: RunReq.Events,
    }

    export enum Events {
    CASH_FLOW = 0,
    }

}
