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
public partial class LineChart : TBase
{
  private string _title;
  private List<LineSeries> _series;
  private LineChartOptions _options;

  public string Title
  {
    get
    {
      return _title;
    }
    set
    {
      __isset.title = true;
      this._title = value;
    }
  }

  public List<LineSeries> Series
  {
    get
    {
      return _series;
    }
    set
    {
      __isset.series = true;
      this._series = value;
    }
  }

  public LineChartOptions Options
  {
    get
    {
      return _options;
    }
    set
    {
      __isset.options = true;
      this._options = value;
    }
  }


  public Isset __isset;
  #if !SILVERLIGHT
  [Serializable]
  #endif
  public struct Isset {
    public bool title;
    public bool series;
    public bool options;
  }

  public LineChart() {
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
            if (field.Type == TType.String) {
              Title = iprot.ReadString();
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 2:
            if (field.Type == TType.List) {
              {
                Series = new List<LineSeries>();
                TList _list8 = iprot.ReadListBegin();
                for( int _i9 = 0; _i9 < _list8.Count; ++_i9)
                {
                  LineSeries _elem10;
                  _elem10 = new LineSeries();
                  _elem10.Read(iprot);
                  Series.Add(_elem10);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.Struct) {
              Options = new LineChartOptions();
              Options.Read(iprot);
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
      TStruct struc = new TStruct("LineChart");
      oprot.WriteStructBegin(struc);
      TField field = new TField();
      if (Title != null && __isset.title) {
        field.Name = "title";
        field.Type = TType.String;
        field.ID = 1;
        oprot.WriteFieldBegin(field);
        oprot.WriteString(Title);
        oprot.WriteFieldEnd();
      }
      if (Series != null && __isset.series) {
        field.Name = "series";
        field.Type = TType.List;
        field.ID = 2;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.Struct, Series.Count));
          foreach (LineSeries _iter11 in Series)
          {
            _iter11.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (Options != null && __isset.options) {
        field.Name = "options";
        field.Type = TType.Struct;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        Options.Write(oprot);
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
    StringBuilder __sb = new StringBuilder("LineChart(");
    bool __first = true;
    if (Title != null && __isset.title) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Title: ");
      __sb.Append(Title);
    }
    if (Series != null && __isset.series) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Series: ");
      __sb.Append(Series);
    }
    if (Options != null && __isset.options) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Options: ");
      __sb.Append(Options== null ? "<null>" : Options.ToString());
    }
    __sb.Append(")");
    return __sb.ToString();
  }

}

