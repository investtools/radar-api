// package: Radar
// file: portfolios.proto

/* tslint:disable */
/* eslint-disable */

import * as jspb from "google-protobuf";
import * as google_protobuf_timestamp_pb from "google-protobuf/google/protobuf/timestamp_pb";

export class EquitySource extends jspb.Message { 
    getEquity(): string;
    setEquity(value: string): EquitySource;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): EquitySource.AsObject;
    static toObject(includeInstance: boolean, msg: EquitySource): EquitySource.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: EquitySource, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): EquitySource;
    static deserializeBinaryFromReader(message: EquitySource, reader: jspb.BinaryReader): EquitySource;
}

export namespace EquitySource {
    export type AsObject = {
        equity: string,
    }
}

export class InterestOnOwnCapital extends jspb.Message { 
    getEquity(): string;
    setEquity(value: string): InterestOnOwnCapital;


    serializeBinary(): Uint8Array;
    toObject(includeInstance?: boolean): InterestOnOwnCapital.AsObject;
    static toObject(includeInstance: boolean, msg: InterestOnOwnCapital): InterestOnOwnCapital.AsObject;
    static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
    static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
    static serializeBinaryToWriter(message: InterestOnOwnCapital, writer: jspb.BinaryWriter): void;
    static deserializeBinary(bytes: Uint8Array): InterestOnOwnCapital;
    static deserializeBinaryFromReader(message: InterestOnOwnCapital, reader: jspb.BinaryReader): InterestOnOwnCapital;
}

export namespace InterestOnOwnCapital {
    export type AsObject = {
        equity: string,
    }
}

export class Event extends jspb.Message { 

    hasDate(): boolean;
    clearDate(): void;
    getDate(): google_protobuf_timestamp_pb.Timestamp | undefined;
    setDate(value?: google_protobuf_timestamp_pb.Timestamp): Event;


    hasCashFlow(): boolean;
    clearCashFlow(): void;
    getCashFlow(): Event.CashFlow | undefined;
    setCashFlow(value?: Event.CashFlow): Event;


    hasPortfolio(): boolean;
    clearPortfolio(): void;
    getPortfolio(): Event.Portfolio | undefined;
    setPortfolio(value?: Event.Portfolio): Event;


    hasPositionMonthTax(): boolean;
    clearPositionMonthTax(): void;
    getPositionMonthTax(): Event.PositionMonthTax | undefined;
    setPositionMonthTax(value?: Event.PositionMonthTax): Event;


    hasStockExemptMonthTax(): boolean;
    clearStockExemptMonthTax(): void;
    getStockExemptMonthTax(): Event.StockExemptMonthTax | undefined;
    setStockExemptMonthTax(value?: Event.StockExemptMonthTax): Event;


    hasAccumulatedTaxCredit(): boolean;
    clearAccumulatedTaxCredit(): void;
    getAccumulatedTaxCredit(): Event.AccumulatedTaxCredit | undefined;
    setAccumulatedTaxCredit(value?: Event.AccumulatedTaxCredit): Event;


    hasMonthlySell(): boolean;
    clearMonthlySell(): void;
    getMonthlySell(): Event.MonthlySell | undefined;
    setMonthlySell(value?: Event.MonthlySell): Event;


    hasMonthlyStockExemptionPeriodProfit(): boolean;
    clearMonthlyStockExemptionPeriodProfit(): void;
    getMonthlyStockExemptionPeriodProfit(): Event.MonthlyStockExemptionPeriodProfit | undefined;
    setMonthlyStockExemptionPeriodProfit(value?: Event.MonthlyStockExemptionPeriodProfit): Event;


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
        positionMonthTax?: Event.PositionMonthTax.AsObject,
        stockExemptMonthTax?: Event.StockExemptMonthTax.AsObject,
        accumulatedTaxCredit?: Event.AccumulatedTaxCredit.AsObject,
        monthlySell?: Event.MonthlySell.AsObject,
        monthlyStockExemptionPeriodProfit?: Event.MonthlyStockExemptionPeriodProfit.AsObject,
    }


    export class EquitySource extends jspb.Message { 
        getSymbol(): string;
        setSymbol(value: string): EquitySource;

        getType(): Event.EquityType;
        setType(value: Event.EquityType): EquitySource;


        serializeBinary(): Uint8Array;
        toObject(includeInstance?: boolean): EquitySource.AsObject;
        static toObject(includeInstance: boolean, msg: EquitySource): EquitySource.AsObject;
        static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
        static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
        static serializeBinaryToWriter(message: EquitySource, writer: jspb.BinaryWriter): void;
        static deserializeBinary(bytes: Uint8Array): EquitySource;
        static deserializeBinaryFromReader(message: EquitySource, reader: jspb.BinaryReader): EquitySource;
    }

    export namespace EquitySource {
        export type AsObject = {
            symbol: string,
            type: Event.EquityType,
        }
    }

    export class Source extends jspb.Message { 

        hasOther(): boolean;
        clearOther(): void;
        getOther(): string;
        setOther(value: string): Source;


        hasEquity(): boolean;
        clearEquity(): void;
        getEquity(): Event.EquitySource | undefined;
        setEquity(value?: Event.EquitySource): Source;


        getTypeCase(): Source.TypeCase;

        serializeBinary(): Uint8Array;
        toObject(includeInstance?: boolean): Source.AsObject;
        static toObject(includeInstance: boolean, msg: Source): Source.AsObject;
        static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
        static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
        static serializeBinaryToWriter(message: Source, writer: jspb.BinaryWriter): void;
        static deserializeBinary(bytes: Uint8Array): Source;
        static deserializeBinaryFromReader(message: Source, reader: jspb.BinaryReader): Source;
    }

    export namespace Source {
        export type AsObject = {
            other: string,
            equity?: Event.EquitySource.AsObject,
        }

        export enum TypeCase {
            TYPE_NOT_SET = 0,
        
    OTHER = 1,

    EQUITY = 2,

        }

    }

    export class CashFlow extends jspb.Message { 
        getType(): Event.CashFlow.Type;
        setType(value: Event.CashFlow.Type): CashFlow;

        getValue(): number;
        setValue(value: number): CashFlow;


        hasSource(): boolean;
        clearSource(): void;
        getSource(): Event.Source | undefined;
        setSource(value?: Event.Source): CashFlow;


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
            source?: Event.Source.AsObject,
        }

        export enum Type {
    OTHER = 0,
    DIVIDEND = 1,
    INTEREST_ON_OWN_CAPITAL = 2,
    BONUS = 3,
        }

    }

    export class Portfolio extends jspb.Message { 
        clearPositionList(): void;
        getPositionList(): Array<Event.Portfolio.Position>;
        setPositionList(value: Array<Event.Portfolio.Position>): Portfolio;
        addPosition(value?: Event.Portfolio.Position, index?: number): Event.Portfolio.Position;

        clearProvisionList(): void;
        getProvisionList(): Array<Event.Portfolio.Provision>;
        setProvisionList(value: Array<Event.Portfolio.Provision>): Portfolio;
        addProvision(value?: Event.Portfolio.Provision, index?: number): Event.Portfolio.Provision;


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
            positionList: Array<Event.Portfolio.Position.AsObject>,
            provisionList: Array<Event.Portfolio.Provision.AsObject>,
        }


        export class Position extends jspb.Message { 
            getId(): string;
            setId(value: string): Position;

            getShares(): number;
            setShares(value: number): Position;

            getValue(): number;
            setValue(value: number): Position;

            getAvgPrice(): number;
            setAvgPrice(value: number): Position;

            getEquityType(): Event.EquityType;
            setEquityType(value: Event.EquityType): Position;


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
                equityType: Event.EquityType,
            }
        }

        export class Provision extends jspb.Message { 
            getValue(): number;
            setValue(value: number): Provision;

            getSource(): string;
            setSource(value: string): Provision;


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

    export class PositionMonthTax extends jspb.Message { 
        getPositionType(): Event.PositionType;
        setPositionType(value: Event.PositionType): PositionMonthTax;

        getEquityType(): Event.EquityType;
        setEquityType(value: Event.EquityType): PositionMonthTax;

        getValue(): number;
        setValue(value: number): PositionMonthTax;


        serializeBinary(): Uint8Array;
        toObject(includeInstance?: boolean): PositionMonthTax.AsObject;
        static toObject(includeInstance: boolean, msg: PositionMonthTax): PositionMonthTax.AsObject;
        static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
        static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
        static serializeBinaryToWriter(message: PositionMonthTax, writer: jspb.BinaryWriter): void;
        static deserializeBinary(bytes: Uint8Array): PositionMonthTax;
        static deserializeBinaryFromReader(message: PositionMonthTax, reader: jspb.BinaryReader): PositionMonthTax;
    }

    export namespace PositionMonthTax {
        export type AsObject = {
            positionType: Event.PositionType,
            equityType: Event.EquityType,
            value: number,
        }
    }

    export class StockExemptMonthTax extends jspb.Message { 
        getValue(): number;
        setValue(value: number): StockExemptMonthTax;


        serializeBinary(): Uint8Array;
        toObject(includeInstance?: boolean): StockExemptMonthTax.AsObject;
        static toObject(includeInstance: boolean, msg: StockExemptMonthTax): StockExemptMonthTax.AsObject;
        static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
        static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
        static serializeBinaryToWriter(message: StockExemptMonthTax, writer: jspb.BinaryWriter): void;
        static deserializeBinary(bytes: Uint8Array): StockExemptMonthTax;
        static deserializeBinaryFromReader(message: StockExemptMonthTax, reader: jspb.BinaryReader): StockExemptMonthTax;
    }

    export namespace StockExemptMonthTax {
        export type AsObject = {
            value: number,
        }
    }

    export class AccumulatedTaxCredit extends jspb.Message { 
        getSwingTrade(): number;
        setSwingTrade(value: number): AccumulatedTaxCredit;

        getDayTrade(): number;
        setDayTrade(value: number): AccumulatedTaxCredit;

        getReit(): number;
        setReit(value: number): AccumulatedTaxCredit;


        serializeBinary(): Uint8Array;
        toObject(includeInstance?: boolean): AccumulatedTaxCredit.AsObject;
        static toObject(includeInstance: boolean, msg: AccumulatedTaxCredit): AccumulatedTaxCredit.AsObject;
        static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
        static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
        static serializeBinaryToWriter(message: AccumulatedTaxCredit, writer: jspb.BinaryWriter): void;
        static deserializeBinary(bytes: Uint8Array): AccumulatedTaxCredit;
        static deserializeBinaryFromReader(message: AccumulatedTaxCredit, reader: jspb.BinaryReader): AccumulatedTaxCredit;
    }

    export namespace AccumulatedTaxCredit {
        export type AsObject = {
            swingTrade: number,
            dayTrade: number,
            reit: number,
        }
    }

    export class MonthlySell extends jspb.Message { 
        getSwingTrade(): number;
        setSwingTrade(value: number): MonthlySell;

        getReit(): number;
        setReit(value: number): MonthlySell;


        serializeBinary(): Uint8Array;
        toObject(includeInstance?: boolean): MonthlySell.AsObject;
        static toObject(includeInstance: boolean, msg: MonthlySell): MonthlySell.AsObject;
        static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
        static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
        static serializeBinaryToWriter(message: MonthlySell, writer: jspb.BinaryWriter): void;
        static deserializeBinary(bytes: Uint8Array): MonthlySell;
        static deserializeBinaryFromReader(message: MonthlySell, reader: jspb.BinaryReader): MonthlySell;
    }

    export namespace MonthlySell {
        export type AsObject = {
            swingTrade: number,
            reit: number,
        }
    }

    export class MonthlyStockExemptionPeriodProfit extends jspb.Message { 
        getValue(): number;
        setValue(value: number): MonthlyStockExemptionPeriodProfit;

        getSource(): string;
        setSource(value: string): MonthlyStockExemptionPeriodProfit;


        serializeBinary(): Uint8Array;
        toObject(includeInstance?: boolean): MonthlyStockExemptionPeriodProfit.AsObject;
        static toObject(includeInstance: boolean, msg: MonthlyStockExemptionPeriodProfit): MonthlyStockExemptionPeriodProfit.AsObject;
        static extensions: {[key: number]: jspb.ExtensionFieldInfo<jspb.Message>};
        static extensionsBinary: {[key: number]: jspb.ExtensionFieldBinaryInfo<jspb.Message>};
        static serializeBinaryToWriter(message: MonthlyStockExemptionPeriodProfit, writer: jspb.BinaryWriter): void;
        static deserializeBinary(bytes: Uint8Array): MonthlyStockExemptionPeriodProfit;
        static deserializeBinaryFromReader(message: MonthlyStockExemptionPeriodProfit, reader: jspb.BinaryReader): MonthlyStockExemptionPeriodProfit;
    }

    export namespace MonthlyStockExemptionPeriodProfit {
        export type AsObject = {
            value: number,
            source: string,
        }
    }


    export enum PositionType {
    SWING_TRADE = 0,
    DAY_TRADE = 1,
    }

    export enum EquityType {
    OTHER = 0,
    STOCK = 1,
    OPTION = 2,
    REIT = 3,
    SUBSCRIPTION_RIGHT = 4,
    }


    export enum TypeCase {
        TYPE_NOT_SET = 0,
    
    CASH_FLOW = 20,

    PORTFOLIO = 21,

    POSITION_MONTH_TAX = 22,

    STOCK_EXEMPT_MONTH_TAX = 23,

    ACCUMULATED_TAX_CREDIT = 24,

    MONTHLY_SELL = 25,

    MONTHLY_STOCK_EXEMPTION_PERIOD_PROFIT = 26,

    }

}

export class RunReq extends jspb.Message { 
    getUserId(): string;
    setUserId(value: string): RunReq;

    getPortfolioId(): string;
    setPortfolioId(value: string): RunReq;

    clearEventsList(): void;
    getEventsList(): Array<RunReq.Event>;
    setEventsList(value: Array<RunReq.Event>): RunReq;
    addEvents(value: RunReq.Event, index?: number): RunReq.Event;


    hasUpto(): boolean;
    clearUpto(): void;
    getUpto(): google_protobuf_timestamp_pb.Timestamp | undefined;
    setUpto(value?: google_protobuf_timestamp_pb.Timestamp): RunReq;


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
        portfolioId: string,
        eventsList: Array<RunReq.Event>,
        upto?: google_protobuf_timestamp_pb.Timestamp.AsObject,
    }

    export enum Event {
    CASH_FLOW = 0,
    EACH_DAY = 1,
    EACH_MONTH = 2,
    }

}
