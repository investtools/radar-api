/**
 * Autogenerated by Thrift Compiler (0.9.3)
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
public partial class TableCell : TBase
{
  private TableCellContent _content;
  private TableCellFormat _format;

  public TableCellContent Content
  {
    get
    {
      return _content;
    }
    set
    {
      __isset.content = true;
      this._content = value;
    }
  }

  public TableCellFormat Format
  {
    get
    {
      return _format;
    }
    set
    {
      __isset.format = true;
      this._format = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool content;
    public bool format;
  }

  public TableCell() {
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
              Content = new TableCellContent();
              Content.Read(iprot);
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.Struct) {
              Format = new TableCellFormat();
              Format.Read(iprot);
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
      TStruct struc = new TStruct("TableCell");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Content != null && __isset.content) {
        field.Name = "content";
        field.Type = TType.Struct;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        Content.Write(oprot);
        oprot.WriteFieldEnd();
      }
      if (Format != null && __isset.format) {
        field.Name = "format";
        field.Type = TType.Struct;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        Format.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("TableCell(");
    bool __first = true;
    if (Content != null && __isset.content) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Content: ");
      __sb.Append(Content== null ? "<null>" : Content.ToString());
    }
    if (Format != null && __isset.format) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Format: ");
      __sb.Append(Format== null ? "<null>" : Format.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

