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
public partial class BarChart : TBase
{
  private string _title;
  private List<BarSeries> _series;
  private List<string> _categories;
  private BarChartOptions _options;

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

  public List<BarSeries> Series
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

  public List<string> Categories
  {
    get
    {
      return _categories;
    }
    set
    {
      __isset.categories = true;
      this._categories = value;
    }
  }

  /// <summary>
  /// Criado na versão 0.2.2.
  /// </summary>
  public BarChartOptions Options
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
    public bool categories;
    public bool options;
  }

  public BarChart() {
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
                Series = new List<BarSeries>();
                TList _list16 = iprot.ReadListBegin();
                for( int _i17 = 0; _i17 < _list16.Count; ++_i17)
                {
                  BarSeries _elem18;
                  _elem18 = new BarSeries();
                  _elem18.Read(iprot);
                  Series.Add(_elem18);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 3:
            if (field.Type == TType.List) {
              {
                Categories = new List<string>();
                TList _list19 = iprot.ReadListBegin();
                for( int _i20 = 0; _i20 < _list19.Count; ++_i20)
                {
                  string _elem21;
                  _elem21 = iprot.ReadString();
                  Categories.Add(_elem21);
                }
                iprot.ReadListEnd();
              }
            } else { 
              TProtocolUtil.Skip(iprot, field.Type);
            }
            break;
          case 4:
            if (field.Type == TType.Struct) {
              Options = new BarChartOptions();
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
      TStruct struc = new TStruct("BarChart");
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
          foreach (BarSeries _iter22 in Series)
          {
            _iter22.Write(oprot);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (Categories != null && __isset.categories) {
        field.Name = "categories";
        field.Type = TType.List;
        field.ID = 3;
        oprot.WriteFieldBegin(field);
        {
          oprot.WriteListBegin(new TList(TType.String, Categories.Count));
          foreach (string _iter23 in Categories)
          {
            oprot.WriteString(_iter23);
          }
          oprot.WriteListEnd();
        }
        oprot.WriteFieldEnd();
      }
      if (Options != null && __isset.options) {
        field.Name = "options";
        field.Type = TType.Struct;
        field.ID = 4;
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
    StringBuilder __sb = new StringBuilder("BarChart(");
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
    if (Categories != null && __isset.categories) {
      if(!__first) { __sb.Append(", "); }
      __first = false;
      __sb.Append("Categories: ");
      __sb.Append(Categories);
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

