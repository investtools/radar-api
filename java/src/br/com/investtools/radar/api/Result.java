/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Result extends org.apache.thrift.TUnion<Result, Result._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Result");
  private static final org.apache.thrift.protocol.TField TABLE_FIELD_DESC = new org.apache.thrift.protocol.TField("table", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField PIE_CHART_FIELD_DESC = new org.apache.thrift.protocol.TField("pie_chart", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField LINE_CHART_FIELD_DESC = new org.apache.thrift.protocol.TField("line_chart", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField BAR_CHART_FIELD_DESC = new org.apache.thrift.protocol.TField("bar_chart", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TABLE((short)1, "table"),
    PIE_CHART((short)2, "pie_chart"),
    LINE_CHART((short)3, "line_chart"),
    BAR_CHART((short)4, "bar_chart");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TABLE
          return TABLE;
        case 2: // PIE_CHART
          return PIE_CHART;
        case 3: // LINE_CHART
          return LINE_CHART;
        case 4: // BAR_CHART
          return BAR_CHART;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TABLE, new org.apache.thrift.meta_data.FieldMetaData("table", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Table.class)));
    tmpMap.put(_Fields.PIE_CHART, new org.apache.thrift.meta_data.FieldMetaData("pie_chart", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PieChart.class)));
    tmpMap.put(_Fields.LINE_CHART, new org.apache.thrift.meta_data.FieldMetaData("line_chart", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LineChart.class)));
    tmpMap.put(_Fields.BAR_CHART, new org.apache.thrift.meta_data.FieldMetaData("bar_chart", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BarChart.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Result.class, metaDataMap);
  }

  public Result() {
    super();
  }

  public Result(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public Result(Result other) {
    super(other);
  }
  public Result deepCopy() {
    return new Result(this);
  }

  public static Result table(Table value) {
    Result x = new Result();
    x.setTable(value);
    return x;
  }

  public static Result pie_chart(PieChart value) {
    Result x = new Result();
    x.setPie_chart(value);
    return x;
  }

  public static Result line_chart(LineChart value) {
    Result x = new Result();
    x.setLine_chart(value);
    return x;
  }

  public static Result bar_chart(BarChart value) {
    Result x = new Result();
    x.setBar_chart(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case TABLE:
        if (value instanceof Table) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type Table for field 'table', but got " + value.getClass().getSimpleName());
      case PIE_CHART:
        if (value instanceof PieChart) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type PieChart for field 'pie_chart', but got " + value.getClass().getSimpleName());
      case LINE_CHART:
        if (value instanceof LineChart) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type LineChart for field 'line_chart', but got " + value.getClass().getSimpleName());
      case BAR_CHART:
        if (value instanceof BarChart) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type BarChart for field 'bar_chart', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case TABLE:
          if (field.type == TABLE_FIELD_DESC.type) {
            Table table;
            table = new Table();
            table.read(iprot);
            return table;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case PIE_CHART:
          if (field.type == PIE_CHART_FIELD_DESC.type) {
            PieChart pie_chart;
            pie_chart = new PieChart();
            pie_chart.read(iprot);
            return pie_chart;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LINE_CHART:
          if (field.type == LINE_CHART_FIELD_DESC.type) {
            LineChart line_chart;
            line_chart = new LineChart();
            line_chart.read(iprot);
            return line_chart;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case BAR_CHART:
          if (field.type == BAR_CHART_FIELD_DESC.type) {
            BarChart bar_chart;
            bar_chart = new BarChart();
            bar_chart.read(iprot);
            return bar_chart;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case TABLE:
        Table table = (Table)value_;
        table.write(oprot);
        return;
      case PIE_CHART:
        PieChart pie_chart = (PieChart)value_;
        pie_chart.write(oprot);
        return;
      case LINE_CHART:
        LineChart line_chart = (LineChart)value_;
        line_chart.write(oprot);
        return;
      case BAR_CHART:
        BarChart bar_chart = (BarChart)value_;
        bar_chart.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case TABLE:
          Table table;
          table = new Table();
          table.read(iprot);
          return table;
        case PIE_CHART:
          PieChart pie_chart;
          pie_chart = new PieChart();
          pie_chart.read(iprot);
          return pie_chart;
        case LINE_CHART:
          LineChart line_chart;
          line_chart = new LineChart();
          line_chart.read(iprot);
          return line_chart;
        case BAR_CHART:
          BarChart bar_chart;
          bar_chart = new BarChart();
          bar_chart.read(iprot);
          return bar_chart;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case TABLE:
        Table table = (Table)value_;
        table.write(oprot);
        return;
      case PIE_CHART:
        PieChart pie_chart = (PieChart)value_;
        pie_chart.write(oprot);
        return;
      case LINE_CHART:
        LineChart line_chart = (LineChart)value_;
        line_chart.write(oprot);
        return;
      case BAR_CHART:
        BarChart bar_chart = (BarChart)value_;
        bar_chart.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case TABLE:
        return TABLE_FIELD_DESC;
      case PIE_CHART:
        return PIE_CHART_FIELD_DESC;
      case LINE_CHART:
        return LINE_CHART_FIELD_DESC;
      case BAR_CHART:
        return BAR_CHART_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public Table getTable() {
    if (getSetField() == _Fields.TABLE) {
      return (Table)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'table' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTable(Table value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.TABLE;
    value_ = value;
  }

  public PieChart getPie_chart() {
    if (getSetField() == _Fields.PIE_CHART) {
      return (PieChart)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'pie_chart' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPie_chart(PieChart value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.PIE_CHART;
    value_ = value;
  }

  public LineChart getLine_chart() {
    if (getSetField() == _Fields.LINE_CHART) {
      return (LineChart)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'line_chart' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLine_chart(LineChart value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.LINE_CHART;
    value_ = value;
  }

  public BarChart getBar_chart() {
    if (getSetField() == _Fields.BAR_CHART) {
      return (BarChart)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'bar_chart' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setBar_chart(BarChart value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.BAR_CHART;
    value_ = value;
  }

  public boolean isSetTable() {
    return setField_ == _Fields.TABLE;
  }


  public boolean isSetPie_chart() {
    return setField_ == _Fields.PIE_CHART;
  }


  public boolean isSetLine_chart() {
    return setField_ == _Fields.LINE_CHART;
  }


  public boolean isSetBar_chart() {
    return setField_ == _Fields.BAR_CHART;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof Result) {
      return equals((Result)other);
    } else {
      return false;
    }
  }

  public boolean equals(Result other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(Result other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
  }
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
