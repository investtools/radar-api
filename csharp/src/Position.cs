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
public partial class Position : TBase
{
  private SecurityId _id;
  private double _value;
  private double _rentability;
  private double _avg_price;
  private double _shares;
  private double _paid_value;

  public SecurityId Id
  {
    get
    {
      return _id;
    }
    set
    {
      __isset.id = true;
      this._id = value;
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

  public double Rentability
  {
    get
    {
      return _rentability;
    }
    set
    {
      __isset.rentability = true;
      this._rentability = value;
    }
  }

  public double Avg_price
  {
    get
    {
      return _avg_price;
    }
    set
    {
      __isset.avg_price = true;
      this._avg_price = value;
    }
  }

  public double Shares
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

  public double Paid_value
  {
    get
    {
      return _paid_value;
    }
    set
    {
      __isset.paid_value = true;
      this._paid_value = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool id;
    public bool @value;
    public bool rentability;
    public bool avg_price;
    public bool shares;
    public bool paid_value;
  }

  public Position() {
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
              Id = new SecurityId();
              Id.Read(iprot);
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
              Rentability = iprot.ReadDouble();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Double) {
              Avg_price = iprot.ReadDouble();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 5:
            if (field.Type == TType.Double) {
              Shares = iprot.ReadDouble();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 6:
            if (field.Type == TType.Double) {
              Paid_value = iprot.ReadDouble();
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
      TStruct struc = new TStruct("Position");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Id != null && __isset.id) {
        field.Name = "id";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        Id.Write(oprot);
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
      if (__isset.rentability) {
        field.Name = "rentability";
        field.Type = TType.Double;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Rentability);
        oprot.WriteFieldEnd();
      }
      if (__isset.avg_price) {
        field.Name = "avg_price";
        field.Type = TType.Double;
        field.ID = 4;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Avg_price);
        oprot.WriteFieldEnd();
      }
      if (__isset.shares) {
        field.Name = "shares";
        field.Type = TType.Double;
        field.ID = 5;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Shares);
        oprot.WriteFieldEnd();
      }
      if (__isset.paid_value) {
        field.Name = "paid_value";
        field.Type = TType.Double;
        field.ID = 6;
        oprot.WriteFieldBegin(field);
        oprot.WriteDouble(Paid_value);
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
    StringBuilder __sb = new StringBuilder("Position(");
    bool __first = true;
    if (Id != null && __isset.id) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Id: ");
      __sb.Append(Id== null ? "<null>" : Id.ToString());
    }
    if (__isset.@value) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Value: ");
      __sb.Append(Value);
    }
    if (__isset.rentability) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Rentability: ");
      __sb.Append(Rentability);
    }
    if (__isset.avg_price) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Avg_price: ");
      __sb.Append(Avg_price);
    }
    if (__isset.shares) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Shares: ");
      __sb.Append(Shares);
    }
    if (__isset.paid_value) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Paid_value: ");
      __sb.Append(Paid_value);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

