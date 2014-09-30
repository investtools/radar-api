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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-9-27")
public class Price implements org.apache.thrift.TBase<Price, Price._Fields>, java.io.Serializable, Cloneable, Comparable<Price> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Price");

  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CLOSE_FIELD_DESC = new org.apache.thrift.protocol.TField("close", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PriceStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PriceTupleSchemeFactory());
  }

  public int date; // required
  public double close; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATE((short)1, "date"),
    CLOSE((short)2, "close");

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
        case 1: // DATE
          return DATE;
        case 2: // CLOSE
          return CLOSE;
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
  private static final int __DATE_ISSET_ID = 0;
  private static final int __CLOSE_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Date")));
    tmpMap.put(_Fields.CLOSE, new org.apache.thrift.meta_data.FieldMetaData("close", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Price.class, metaDataMap);
  }

  public Price() {
  }

  public Price(
    int date,
    double close)
  {
    this();
    this.date = date;
    setDateIsSet(true);
    this.close = close;
    setCloseIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Price(Price other) {
    __isset_bitfield = other.__isset_bitfield;
    this.date = other.date;
    this.close = other.close;
  }

  public Price deepCopy() {
    return new Price(this);
  }

  @Override
  public void clear() {
    setDateIsSet(false);
    this.date = 0;
    setCloseIsSet(false);
    this.close = 0.0;
  }

  public int getDate() {
    return this.date;
  }

  public Price setDate(int date) {
    this.date = date;
    setDateIsSet(true);
    return this;
  }

  public void unsetDate() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __DATE_ISSET_ID);
  }

  /** Returns true if field date is set (has been assigned a value) and false otherwise */
  public boolean isSetDate() {
    return EncodingUtils.testBit(__isset_bitfield, __DATE_ISSET_ID);
  }

  public void setDateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __DATE_ISSET_ID, value);
  }

  public double getClose() {
    return this.close;
  }

  public Price setClose(double close) {
    this.close = close;
    setCloseIsSet(true);
    return this;
  }

  public void unsetClose() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CLOSE_ISSET_ID);
  }

  /** Returns true if field close is set (has been assigned a value) and false otherwise */
  public boolean isSetClose() {
    return EncodingUtils.testBit(__isset_bitfield, __CLOSE_ISSET_ID);
  }

  public void setCloseIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CLOSE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((Integer)value);
      }
      break;

    case CLOSE:
      if (value == null) {
        unsetClose();
      } else {
        setClose((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATE:
      return Integer.valueOf(getDate());

    case CLOSE:
      return Double.valueOf(getClose());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case DATE:
      return isSetDate();
    case CLOSE:
      return isSetClose();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Price)
      return this.equals((Price)that);
    return false;
  }

  public boolean equals(Price that) {
    if (that == null)
      return false;

    boolean this_present_date = true;
    boolean that_present_date = true;
    if (this_present_date || that_present_date) {
      if (!(this_present_date && that_present_date))
        return false;
      if (this.date != that.date)
        return false;
    }

    boolean this_present_close = true;
    boolean that_present_close = true;
    if (this_present_close || that_present_close) {
      if (!(this_present_close && that_present_close))
        return false;
      if (this.close != that.close)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_date = true;
    list.add(present_date);
    if (present_date)
      list.add(date);

    boolean present_close = true;
    list.add(present_close);
    if (present_close)
      list.add(close);

    return list.hashCode();
  }

  @Override
  public int compareTo(Price other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetDate()).compareTo(other.isSetDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.date, other.date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetClose()).compareTo(other.isSetClose());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetClose()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.close, other.close);
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
    StringBuilder sb = new StringBuilder("Price(");
    boolean first = true;

    sb.append("date:");
    sb.append(this.date);
    first = false;
    if (!first) sb.append(", ");
    sb.append("close:");
    sb.append(this.close);
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

  private static class PriceStandardSchemeFactory implements SchemeFactory {
    public PriceStandardScheme getScheme() {
      return new PriceStandardScheme();
    }
  }

  private static class PriceStandardScheme extends StandardScheme<Price> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Price struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.date = iprot.readI32();
              struct.setDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CLOSE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.close = iprot.readDouble();
              struct.setCloseIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Price struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DATE_FIELD_DESC);
      oprot.writeI32(struct.date);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CLOSE_FIELD_DESC);
      oprot.writeDouble(struct.close);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PriceTupleSchemeFactory implements SchemeFactory {
    public PriceTupleScheme getScheme() {
      return new PriceTupleScheme();
    }
  }

  private static class PriceTupleScheme extends TupleScheme<Price> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Price struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDate()) {
        optionals.set(0);
      }
      if (struct.isSetClose()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetDate()) {
        oprot.writeI32(struct.date);
      }
      if (struct.isSetClose()) {
        oprot.writeDouble(struct.close);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Price struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.date = iprot.readI32();
        struct.setDateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.close = iprot.readDouble();
        struct.setCloseIsSet(true);
      }
    }
  }

}
