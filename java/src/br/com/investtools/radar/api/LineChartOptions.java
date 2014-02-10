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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-2-10")
public class LineChartOptions implements org.apache.thrift.TBase<LineChartOptions, LineChartOptions._Fields>, java.io.Serializable, Cloneable, Comparable<LineChartOptions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("LineChartOptions");

  private static final org.apache.thrift.protocol.TField STACKED_FIELD_DESC = new org.apache.thrift.protocol.TField("stacked", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField COMPARE_FIELD_DESC = new org.apache.thrift.protocol.TField("compare", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new LineChartOptionsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new LineChartOptionsTupleSchemeFactory());
  }

  public boolean stacked; // required
  public boolean compare; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STACKED((short)1, "stacked"),
    COMPARE((short)2, "compare");

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
        case 1: // STACKED
          return STACKED;
        case 2: // COMPARE
          return COMPARE;
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

  // isset id assignments
  private static final int __STACKED_ISSET_ID = 0;
  private static final int __COMPARE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STACKED, new org.apache.thrift.meta_data.FieldMetaData("stacked", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COMPARE, new org.apache.thrift.meta_data.FieldMetaData("compare", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(LineChartOptions.class, metaDataMap);
  }

  public LineChartOptions() {
  }

  public LineChartOptions(
    boolean stacked,
    boolean compare)
  {
    this();
    this.stacked = stacked;
    setStackedIsSet(true);
    this.compare = compare;
    setCompareIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public LineChartOptions(LineChartOptions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.stacked = other.stacked;
    this.compare = other.compare;
  }

  public LineChartOptions deepCopy() {
    return new LineChartOptions(this);
  }

  @Override
  public void clear() {
    setStackedIsSet(false);
    this.stacked = false;
    setCompareIsSet(false);
    this.compare = false;
  }

  public boolean isStacked() {
    return this.stacked;
  }

  public LineChartOptions setStacked(boolean stacked) {
    this.stacked = stacked;
    setStackedIsSet(true);
    return this;
  }

  public void unsetStacked() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __STACKED_ISSET_ID);
  }

  /** Returns true if field stacked is set (has been assigned a value) and false otherwise */
  public boolean isSetStacked() {
    return EncodingUtils.testBit(__isset_bitfield, __STACKED_ISSET_ID);
  }

  public void setStackedIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __STACKED_ISSET_ID, value);
  }

  public boolean isCompare() {
    return this.compare;
  }

  public LineChartOptions setCompare(boolean compare) {
    this.compare = compare;
    setCompareIsSet(true);
    return this;
  }

  public void unsetCompare() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COMPARE_ISSET_ID);
  }

  /** Returns true if field compare is set (has been assigned a value) and false otherwise */
  public boolean isSetCompare() {
    return EncodingUtils.testBit(__isset_bitfield, __COMPARE_ISSET_ID);
  }

  public void setCompareIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COMPARE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case STACKED:
      if (value == null) {
        unsetStacked();
      } else {
        setStacked((Boolean)value);
      }
      break;

    case COMPARE:
      if (value == null) {
        unsetCompare();
      } else {
        setCompare((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STACKED:
      return Boolean.valueOf(isStacked());

    case COMPARE:
      return Boolean.valueOf(isCompare());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case STACKED:
      return isSetStacked();
    case COMPARE:
      return isSetCompare();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof LineChartOptions)
      return this.equals((LineChartOptions)that);
    return false;
  }

  public boolean equals(LineChartOptions that) {
    if (that == null)
      return false;

    boolean this_present_stacked = true;
    boolean that_present_stacked = true;
    if (this_present_stacked || that_present_stacked) {
      if (!(this_present_stacked && that_present_stacked))
        return false;
      if (this.stacked != that.stacked)
        return false;
    }

    boolean this_present_compare = true;
    boolean that_present_compare = true;
    if (this_present_compare || that_present_compare) {
      if (!(this_present_compare && that_present_compare))
        return false;
      if (this.compare != that.compare)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_stacked = true;
    list.add(present_stacked);
    if (present_stacked)
      list.add(stacked);

    boolean present_compare = true;
    list.add(present_compare);
    if (present_compare)
      list.add(compare);

    return list.hashCode();
  }

  @Override
  public int compareTo(LineChartOptions other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetStacked()).compareTo(other.isSetStacked());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStacked()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stacked, other.stacked);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCompare()).compareTo(other.isSetCompare());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCompare()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.compare, other.compare);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("LineChartOptions(");
    boolean first = true;

    sb.append("stacked:");
    sb.append(this.stacked);
    first = false;
    if (!first) sb.append(", ");
    sb.append("compare:");
    sb.append(this.compare);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class LineChartOptionsStandardSchemeFactory implements SchemeFactory {
    public LineChartOptionsStandardScheme getScheme() {
      return new LineChartOptionsStandardScheme();
    }
  }

  private static class LineChartOptionsStandardScheme extends StandardScheme<LineChartOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, LineChartOptions struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // STACKED
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.stacked = iprot.readBool();
              struct.setStackedIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // COMPARE
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.compare = iprot.readBool();
              struct.setCompareIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, LineChartOptions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STACKED_FIELD_DESC);
      oprot.writeBool(struct.stacked);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COMPARE_FIELD_DESC);
      oprot.writeBool(struct.compare);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class LineChartOptionsTupleSchemeFactory implements SchemeFactory {
    public LineChartOptionsTupleScheme getScheme() {
      return new LineChartOptionsTupleScheme();
    }
  }

  private static class LineChartOptionsTupleScheme extends TupleScheme<LineChartOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, LineChartOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStacked()) {
        optionals.set(0);
      }
      if (struct.isSetCompare()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetStacked()) {
        oprot.writeBool(struct.stacked);
      }
      if (struct.isSetCompare()) {
        oprot.writeBool(struct.compare);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, LineChartOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.stacked = iprot.readBool();
        struct.setStackedIsSet(true);
      }
      if (incoming.get(1)) {
        struct.compare = iprot.readBool();
        struct.setCompareIsSet(true);
      }
    }
  }

}

