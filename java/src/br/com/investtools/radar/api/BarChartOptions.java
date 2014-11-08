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
/**
 * Criado na versão 0.2.2.
 */
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-11-8")
public class BarChartOptions implements org.apache.thrift.TBase<BarChartOptions, BarChartOptions._Fields>, java.io.Serializable, Cloneable, Comparable<BarChartOptions> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BarChartOptions");

  private static final org.apache.thrift.protocol.TField STACKED_FIELD_DESC = new org.apache.thrift.protocol.TField("stacked", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField PERCENT_FIELD_DESC = new org.apache.thrift.protocol.TField("percent", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField Y_AXIS_TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("y_axis_title", org.apache.thrift.protocol.TType.STRING, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BarChartOptionsStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BarChartOptionsTupleSchemeFactory());
  }

  public boolean stacked; // required
  public boolean percent; // required
  public String y_axis_title; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STACKED((short)1, "stacked"),
    PERCENT((short)2, "percent"),
    Y_AXIS_TITLE((short)4, "y_axis_title");

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
        case 2: // PERCENT
          return PERCENT;
        case 4: // Y_AXIS_TITLE
          return Y_AXIS_TITLE;
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
  private static final int __PERCENT_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.Y_AXIS_TITLE};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STACKED, new org.apache.thrift.meta_data.FieldMetaData("stacked", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.PERCENT, new org.apache.thrift.meta_data.FieldMetaData("percent", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.Y_AXIS_TITLE, new org.apache.thrift.meta_data.FieldMetaData("y_axis_title", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BarChartOptions.class, metaDataMap);
  }

  public BarChartOptions() {
    this.stacked = false;

    this.percent = false;

  }

  public BarChartOptions(
    boolean stacked,
    boolean percent)
  {
    this();
    this.stacked = stacked;
    setStackedIsSet(true);
    this.percent = percent;
    setPercentIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BarChartOptions(BarChartOptions other) {
    __isset_bitfield = other.__isset_bitfield;
    this.stacked = other.stacked;
    this.percent = other.percent;
    if (other.isSetY_axis_title()) {
      this.y_axis_title = other.y_axis_title;
    }
  }

  public BarChartOptions deepCopy() {
    return new BarChartOptions(this);
  }

  @Override
  public void clear() {
    this.stacked = false;

    this.percent = false;

    this.y_axis_title = null;
  }

  public boolean isStacked() {
    return this.stacked;
  }

  public BarChartOptions setStacked(boolean stacked) {
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

  public boolean isPercent() {
    return this.percent;
  }

  public BarChartOptions setPercent(boolean percent) {
    this.percent = percent;
    setPercentIsSet(true);
    return this;
  }

  public void unsetPercent() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PERCENT_ISSET_ID);
  }

  /** Returns true if field percent is set (has been assigned a value) and false otherwise */
  public boolean isSetPercent() {
    return EncodingUtils.testBit(__isset_bitfield, __PERCENT_ISSET_ID);
  }

  public void setPercentIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PERCENT_ISSET_ID, value);
  }

  public String getY_axis_title() {
    return this.y_axis_title;
  }

  public BarChartOptions setY_axis_title(String y_axis_title) {
    this.y_axis_title = y_axis_title;
    return this;
  }

  public void unsetY_axis_title() {
    this.y_axis_title = null;
  }

  /** Returns true if field y_axis_title is set (has been assigned a value) and false otherwise */
  public boolean isSetY_axis_title() {
    return this.y_axis_title != null;
  }

  public void setY_axis_titleIsSet(boolean value) {
    if (!value) {
      this.y_axis_title = null;
    }
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

    case PERCENT:
      if (value == null) {
        unsetPercent();
      } else {
        setPercent((Boolean)value);
      }
      break;

    case Y_AXIS_TITLE:
      if (value == null) {
        unsetY_axis_title();
      } else {
        setY_axis_title((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case STACKED:
      return Boolean.valueOf(isStacked());

    case PERCENT:
      return Boolean.valueOf(isPercent());

    case Y_AXIS_TITLE:
      return getY_axis_title();

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
    case PERCENT:
      return isSetPercent();
    case Y_AXIS_TITLE:
      return isSetY_axis_title();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BarChartOptions)
      return this.equals((BarChartOptions)that);
    return false;
  }

  public boolean equals(BarChartOptions that) {
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

    boolean this_present_percent = true;
    boolean that_present_percent = true;
    if (this_present_percent || that_present_percent) {
      if (!(this_present_percent && that_present_percent))
        return false;
      if (this.percent != that.percent)
        return false;
    }

    boolean this_present_y_axis_title = true && this.isSetY_axis_title();
    boolean that_present_y_axis_title = true && that.isSetY_axis_title();
    if (this_present_y_axis_title || that_present_y_axis_title) {
      if (!(this_present_y_axis_title && that_present_y_axis_title))
        return false;
      if (!this.y_axis_title.equals(that.y_axis_title))
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

    boolean present_percent = true;
    list.add(present_percent);
    if (present_percent)
      list.add(percent);

    boolean present_y_axis_title = true && (isSetY_axis_title());
    list.add(present_y_axis_title);
    if (present_y_axis_title)
      list.add(y_axis_title);

    return list.hashCode();
  }

  @Override
  public int compareTo(BarChartOptions other) {
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
    lastComparison = Boolean.valueOf(isSetPercent()).compareTo(other.isSetPercent());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPercent()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.percent, other.percent);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetY_axis_title()).compareTo(other.isSetY_axis_title());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetY_axis_title()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.y_axis_title, other.y_axis_title);
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
    StringBuilder sb = new StringBuilder("BarChartOptions(");
    boolean first = true;

    sb.append("stacked:");
    sb.append(this.stacked);
    first = false;
    if (!first) sb.append(", ");
    sb.append("percent:");
    sb.append(this.percent);
    first = false;
    if (isSetY_axis_title()) {
      if (!first) sb.append(", ");
      sb.append("y_axis_title:");
      if (this.y_axis_title == null) {
        sb.append("null");
      } else {
        sb.append(this.y_axis_title);
      }
      first = false;
    }
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

  private static class BarChartOptionsStandardSchemeFactory implements SchemeFactory {
    public BarChartOptionsStandardScheme getScheme() {
      return new BarChartOptionsStandardScheme();
    }
  }

  private static class BarChartOptionsStandardScheme extends StandardScheme<BarChartOptions> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BarChartOptions struct) throws org.apache.thrift.TException {
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
          case 2: // PERCENT
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.percent = iprot.readBool();
              struct.setPercentIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // Y_AXIS_TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.y_axis_title = iprot.readString();
              struct.setY_axis_titleIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BarChartOptions struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(STACKED_FIELD_DESC);
      oprot.writeBool(struct.stacked);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(PERCENT_FIELD_DESC);
      oprot.writeBool(struct.percent);
      oprot.writeFieldEnd();
      if (struct.y_axis_title != null) {
        if (struct.isSetY_axis_title()) {
          oprot.writeFieldBegin(Y_AXIS_TITLE_FIELD_DESC);
          oprot.writeString(struct.y_axis_title);
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BarChartOptionsTupleSchemeFactory implements SchemeFactory {
    public BarChartOptionsTupleScheme getScheme() {
      return new BarChartOptionsTupleScheme();
    }
  }

  private static class BarChartOptionsTupleScheme extends TupleScheme<BarChartOptions> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BarChartOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetStacked()) {
        optionals.set(0);
      }
      if (struct.isSetPercent()) {
        optionals.set(1);
      }
      if (struct.isSetY_axis_title()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetStacked()) {
        oprot.writeBool(struct.stacked);
      }
      if (struct.isSetPercent()) {
        oprot.writeBool(struct.percent);
      }
      if (struct.isSetY_axis_title()) {
        oprot.writeString(struct.y_axis_title);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BarChartOptions struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.stacked = iprot.readBool();
        struct.setStackedIsSet(true);
      }
      if (incoming.get(1)) {
        struct.percent = iprot.readBool();
        struct.setPercentIsSet(true);
      }
      if (incoming.get(2)) {
        struct.y_axis_title = iprot.readString();
        struct.setY_axis_titleIsSet(true);
      }
    }
  }

}

