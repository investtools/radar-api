/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class AnalyzerOutputContent extends org.apache.thrift.TUnion<AnalyzerOutputContent, AnalyzerOutputContent._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AnalyzerOutputContent");
  private static final org.apache.thrift.protocol.TField PIE_FIELD_DESC = new org.apache.thrift.protocol.TField("pie", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField LINE_FIELD_DESC = new org.apache.thrift.protocol.TField("line", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PIE((short)1, "pie"),
    LINE((short)2, "line");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // PIE
          return PIE;
        case 2: // LINE
          return LINE;
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
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PIE, new org.apache.thrift.meta_data.FieldMetaData("pie", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PieChart.class)));
    tmpMap.put(_Fields.LINE, new org.apache.thrift.meta_data.FieldMetaData("line", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LineChart.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AnalyzerOutputContent.class, metaDataMap);
  }

  public AnalyzerOutputContent() {
    super();
  }

  public AnalyzerOutputContent(_Fields setField, Object value) {
    super(setField, value);
  }

  public AnalyzerOutputContent(AnalyzerOutputContent other) {
    super(other);
  }
  public AnalyzerOutputContent deepCopy() {
    return new AnalyzerOutputContent(this);
  }

  public static AnalyzerOutputContent pie(PieChart value) {
    AnalyzerOutputContent x = new AnalyzerOutputContent();
    x.setPie(value);
    return x;
  }

  public static AnalyzerOutputContent line(LineChart value) {
    AnalyzerOutputContent x = new AnalyzerOutputContent();
    x.setLine(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case PIE:
        if (value instanceof PieChart) {
          break;
        }
        throw new ClassCastException("Was expecting value of type PieChart for field 'pie', but got " + value.getClass().getSimpleName());
      case LINE:
        if (value instanceof LineChart) {
          break;
        }
        throw new ClassCastException("Was expecting value of type LineChart for field 'line', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case PIE:
          if (field.type == PIE_FIELD_DESC.type) {
            PieChart pie;
            pie = new PieChart();
            pie.read(iprot);
            return pie;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case LINE:
          if (field.type == LINE_FIELD_DESC.type) {
            LineChart line;
            line = new LineChart();
            line.read(iprot);
            return line;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case PIE:
        PieChart pie = (PieChart)value_;
        pie.write(oprot);
        return;
      case LINE:
        LineChart line = (LineChart)value_;
        line.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case PIE:
          PieChart pie;
          pie = new PieChart();
          pie.read(iprot);
          return pie;
        case LINE:
          LineChart line;
          line = new LineChart();
          line.read(iprot);
          return line;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case PIE:
        PieChart pie = (PieChart)value_;
        pie.write(oprot);
        return;
      case LINE:
        LineChart line = (LineChart)value_;
        line.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case PIE:
        return PIE_FIELD_DESC;
      case LINE:
        return LINE_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
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


  public PieChart getPie() {
    if (getSetField() == _Fields.PIE) {
      return (PieChart)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'pie' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setPie(PieChart value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.PIE;
    value_ = value;
  }

  public LineChart getLine() {
    if (getSetField() == _Fields.LINE) {
      return (LineChart)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'line' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setLine(LineChart value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.LINE;
    value_ = value;
  }

  public boolean isSetPie() {
    return setField_ == _Fields.PIE;
  }


  public boolean isSetLine() {
    return setField_ == _Fields.LINE;
  }


  public boolean equals(Object other) {
    if (other instanceof AnalyzerOutputContent) {
      return equals((AnalyzerOutputContent)other);
    } else {
      return false;
    }
  }

  public boolean equals(AnalyzerOutputContent other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(AnalyzerOutputContent other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
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


  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
