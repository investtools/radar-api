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
public partial class TableCellContent : TBase
{
  private TableCellTypes _type;
  private bool _strip_insignificant_zeros;

  public TableCellTypes Type
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

  public bool Strip_insignificant_zeros
  {
    get
    {
      return _strip_insignificant_zeros;
    }
    set
    {
      __isset.strip_insignificant_zeros = true;
      this._strip_insignificant_zeros = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool type;
    public bool strip_insignificant_zeros;
  }

  public TableCellContent() {
    this._strip_insignificant_zeros = false;
    this.__isset.strip_insignificant_zeros = true;
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
              Type = new TableCellTypes();
              Type.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Bool) {
              Strip_insignificant_zeros = iprot.ReadBool();
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
      TStruct struc = new TStruct("TableCellContent");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Type != null && __isset.type) {
        field.Name = "type";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        Type.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (__isset.strip_insignificant_zeros) {
        field.Name = "strip_insignificant_zeros";
        field.Type = TType.Bool;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        oprot.WriteBool(Strip_insignificant_zeros);
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
    StringBuilder __sb = new StringBuilder("TableCellContent(");
    bool __first = true;
    if (Type != null && __isset.type) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Type: ");
      __sb.Append(Type== null ? "<null>" : Type.ToString());
    }
    if (__isset.strip_insignificant_zeros) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Strip_insignificant_zeros: ");
      __sb.Append(Strip_insignificant_zeros);
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

