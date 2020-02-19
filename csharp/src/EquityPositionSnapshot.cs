/**
 * Autogenerated by Thrift Compiler (0.12.0)
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
public partial class EquityPositionSnapshot : TBase
{
  private long _date;
  private EquityId _equity;
  private int _shares;
  private double _price;

  public long Date
  {
    get
    {
      return _date;
    }
    set
    {
      __isset.date = true;
      this._date = value;
    }
  }

  public EquityId Equity
  {
    get
    {
      return _equity;
    }
    set
    {
      __isset.equity = true;
      this._equity = value;
    }
  }

  public int Shares
  {
    get
    {
      return _shares;
    }
    set
    {
      __isset.shares = true;
      this._shares = value;
    }
  }

  public double Price
  {
    get
    {
      return _price;
    }
    set
    {
      __isset.price = true;
      this._price = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool date;
    public bool equity;
    public bool shares;
    public bool price;
  }

  public EquityPositionSnapshot() {
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
            if (field.Type == TType.I64) {
              Date = iprot.ReadI64();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              Equity = new EquityId();
              Equity.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.I32) {
              Shares = iprot.ReadI32();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Double) {
              Price = iprot.ReadDouble();
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
      TStruct struc = new TStruct("EquityPositionSnapshot");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (__isset.date) {
        field.Name = "date";
        field.Type = TType.I64;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteI64(Date);
        oprot.WriteFieldEnd();
      }
      if (Equity != null && __isset.equity) {
        field.Name = "equity";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        Equity.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (__isset.shares) {
        field.Name = "shares";
        field.Type = TType.I32;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32(Shares);
        oprot.WriteFieldEnd();
      }
      if (__isset.price) {
        field.Name = "price";
        field.Type = TType.Double;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Price);
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
    StringBuilder __sb = new StringBuilder("EquityPositionSnapshot(");
    bool __first = true;
    if (__isset.date) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Date: ");
      __sb.Append(Date);
    }
    if (Equity != null && __isset.equity) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Equity: ");
      __sb.Append(Equity== null ? "<null>" : Equity.ToString());
    }
    if (__isset.shares) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Shares: ");
      __sb.Append(Shares);
    }
    if (__isset.price) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Price: ");
      __sb.Append(Price);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}
