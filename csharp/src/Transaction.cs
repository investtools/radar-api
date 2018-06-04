/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
using System;
using System.Collections;
using System.Collections.Generic;
using System.Text;
using System.IO;
using Thrift;
using Thrift.Collections;
using System.Runtime.Serialization;
using Thrift.Protocol;
using Thrift.Transport;


#if !SILVERLIGHT
[Serializable]
#endif
public partial class Transaction : TBase
{
  private StockBuy _stock_buy;
  private StockSell _stock_sell;
  private SecurityLendingAndBorrowing _slb;
  private SecurityLendingAndBorrowingReturning _slbr;
  private CommissionExpense _stock_commission_expense;
  private StockOption _stock_option;
  private Subscription _subscription;

  public StockBuy Stock_buy
  {
    get
    {
      return _stock_buy;
    }
    set
    {
      __isset.stock_buy = true;
      this._stock_buy = value;
    }
  }

  public StockSell Stock_sell
  {
    get
    {
      return _stock_sell;
    }
    set
    {
      __isset.stock_sell = true;
      this._stock_sell = value;
    }
  }

  public SecurityLendingAndBorrowing Slb
  {
    get
    {
      return _slb;
    }
    set
    {
      __isset.slb = true;
      this._slb = value;
    }
  }

  public SecurityLendingAndBorrowingReturning Slbr
  {
    get
    {
      return _slbr;
    }
    set
    {
      __isset.slbr = true;
      this._slbr = value;
    }
  }

  public CommissionExpense Stock_commission_expense
  {
    get
    {
      return _stock_commission_expense;
    }
    set
    {
      __isset.stock_commission_expense = true;
      this._stock_commission_expense = value;
    }
  }

  public StockOption Stock_option
  {
    get
    {
      return _stock_option;
    }
    set
    {
      __isset.stock_option = true;
      this._stock_option = value;
    }
  }

  public Subscription Subscription
  {
    get
    {
      return _subscription;
    }
    set
    {
      __isset.subscription = true;
      this._subscription = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool stock_buy;
    public bool stock_sell;
    public bool slb;
    public bool slbr;
    public bool stock_commission_expense;
    public bool stock_option;
    public bool subscription;
  }

  public Transaction() {
  }

  public void Read (TProtocol iprot)
  {
    iprot.IncrementRecursionDepth();
    try
    {
      TField field;
      iprot.ReadStructBegin();
      while (true)
      {
        field = iprot.ReadFieldBegin();
        if (field.Type == TType.Stop) { 
          break;
        }
        switch (field.ID)
        {
          case 1:
            if (field.Type == TType.Struct) {
              Stock_buy = new StockBuy();
              Stock_buy.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              Stock_sell = new StockSell();
              Stock_sell.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              Slb = new SecurityLendingAndBorrowing();
              Slb.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Struct) {
              Slbr = new SecurityLendingAndBorrowingReturning();
              Slbr.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Struct) {
              Stock_commission_expense = new CommissionExpense();
              Stock_commission_expense.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Struct) {
              Stock_option = new StockOption();
              Stock_option.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 7:
            if (field.Type == TType.Struct) {
              Subscription = new Subscription();
              Subscription.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          default: 
            TProtocolUtil.Skip(iprot, field.Type);
            break;
        }
        iprot.ReadFieldEnd();
      }
      iprot.ReadStructEnd();
    }
    finally
    {
      iprot.DecrementRecursionDepth();
    }
  }

  public void Write(TProtocol oprot) {
    oprot.IncrementRecursionDepth();
    try
    {
      TStruct struc = new TStruct("Transaction");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Stock_buy != null && __isset.stock_buy) {
        field.Name = "stock_buy";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        Stock_buy.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Stock_sell != null && __isset.stock_sell) {
        field.Name = "stock_sell";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        Stock_sell.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Slb != null && __isset.slb) {
        field.Name = "slb";
        field.Type = TType.Struct;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        Slb.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Slbr != null && __isset.slbr) {
        field.Name = "slbr";
        field.Type = TType.Struct;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        Slbr.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Stock_commission_expense != null && __isset.stock_commission_expense) {
        field.Name = "stock_commission_expense";
        field.Type = TType.Struct;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        Stock_commission_expense.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Stock_option != null && __isset.stock_option) {
        field.Name = "stock_option";
        field.Type = TType.Struct;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        Stock_option.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Subscription != null && __isset.subscription) {
        field.Name = "subscription";
        field.Type = TType.Struct;
        field.ID = 7;
        oprot.WriteFieldBegin(field);
        Subscription.Write(oprot);
        oprot.WriteFieldEnd();
      }
      oprot.WriteFieldStop();
      oprot.WriteStructEnd();
    }
    finally
    {
      oprot.DecrementRecursionDepth();
    }
  }

  public override string ToString() {
    StringBuilder __sb = new StringBuilder("Transaction(");
    bool __first = true;
    if (Stock_buy != null && __isset.stock_buy) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Stock_buy: ");
      __sb.Append(Stock_buy== null ? "<null>" : Stock_buy.ToString());
    }
    if (Stock_sell != null && __isset.stock_sell) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Stock_sell: ");
      __sb.Append(Stock_sell== null ? "<null>" : Stock_sell.ToString());
    }
    if (Slb != null && __isset.slb) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Slb: ");
      __sb.Append(Slb== null ? "<null>" : Slb.ToString());
    }
    if (Slbr != null && __isset.slbr) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Slbr: ");
      __sb.Append(Slbr== null ? "<null>" : Slbr.ToString());
    }
    if (Stock_commission_expense != null && __isset.stock_commission_expense) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Stock_commission_expense: ");
      __sb.Append(Stock_commission_expense== null ? "<null>" : Stock_commission_expense.ToString());
    }
    if (Stock_option != null && __isset.stock_option) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Stock_option: ");
      __sb.Append(Stock_option== null ? "<null>" : Stock_option.ToString());
    }
    if (Subscription != null && __isset.subscription) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Subscription: ");
      __sb.Append(Subscription== null ? "<null>" : Subscription.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

