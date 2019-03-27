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
public partial class CashFlow : TBase
{
  private long _date;
  private double _value;
  private double _balance;
  private CashFlowType _type;

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

  public double Value
  {
    get
    {
      return _value;
    }
    set
    {
      __isset.@value = true;
      this._value = value;
    }
  }

  public double Balance
  {
    get
    {
      return _balance;
    }
    set
    {
      __isset.balance = true;
      this._balance = value;
    }
  }

  /// <summary>
  /// 
  /// <seealso cref="CashFlowType"/>
  /// </summary>
  public CashFlowType Type
  {
    get
    {
      return _type;
    }
    set
    {
      __isset.type = true;
      this._type = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool date;
    public bool @value;
    public bool balance;
    public bool type;
  }

  public CashFlow() {
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
            if (field.Type == TType.Double) {
              Value = iprot.ReadDouble();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Double) {
              Balance = iprot.ReadDouble();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.I32) {
              Type = (CashFlowType)iprot.ReadI32();
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
      TStruct struc = new TStruct("CashFlow");
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
      if (__isset.@value) {
        field.Name = "value";
        field.Type = TType.Double;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Value);
        oprot.WriteFieldEnd();
      }
      if (__isset.balance) {
        field.Name = "balance";
        field.Type = TType.Double;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Balance);
        oprot.WriteFieldEnd();
      }
      if (__isset.type) {
        field.Name = "type";
        field.Type = TType.I32;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteI32((int)Type);
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
    StringBuilder __sb = new StringBuilder("CashFlow(");
    bool __first = true;
    if (__isset.date) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Date: ");
      __sb.Append(Date);
    }
    if (__isset.@value) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Value: ");
      __sb.Append(Value);
    }
    if (__isset.balance) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Balance: ");
      __sb.Append(Balance);
    }
    if (__isset.type) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Type: ");
      __sb.Append(Type);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

