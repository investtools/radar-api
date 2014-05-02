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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-5-2")
public class DailyFundData implements org.apache.thrift.TBase<DailyFundData, DailyFundData._Fields>, java.io.Serializable, Cloneable, Comparable<DailyFundData> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("DailyFundData");

  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.I32, (short)2);
  private static final org.apache.thrift.protocol.TField NAV_FIELD_DESC = new org.apache.thrift.protocol.TField("nav", org.apache.thrift.protocol.TType.DOUBLE, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new DailyFundDataStandardSchemeFactory());
    schemes.put(TupleScheme.class, new DailyFundDataTupleSchemeFactory());
  }

  public double price; // required
  public int date; // required
  public double nav; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    PRICE((short)1, "price"),
    DATE((short)2, "date"),
    NAV((short)3, "nav");

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
        case 1: // PRICE
          return PRICE;
        case 2: // DATE
          return DATE;
        case 3: // NAV
          return NAV;
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
  private static final int __PRICE_ISSET_ID = 0;
  private static final int __DATE_ISSET_ID = 1;
  private static final int __NAV_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Date")));
    tmpMap.put(_Fields.NAV, new org.apache.thrift.meta_data.FieldMetaData("nav", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(DailyFundData.class, metaDataMap);
  }

  public DailyFundData() {
  }

  public DailyFundData(
    double price,
    int date,
    double nav)
  {
    this();
    this.price = price;
    setPriceIsSet(true);
    this.date = date;
    setDateIsSet(true);
    this.nav = nav;
    setNavIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public DailyFundData(DailyFundData other) {
    __isset_bitfield = other.__isset_bitfield;
    this.price = other.price;
    this.date = other.date;
    this.nav = other.nav;
  }

  public DailyFundData deepCopy() {
    return new DailyFundData(this);
  }

  @Override
  public void clear() {
    setPriceIsSet(false);
    this.price = 0.0;
    setDateIsSet(false);
    this.date = 0;
    setNavIsSet(false);
    this.nav = 0.0;
  }

  public double getPrice() {
    return this.price;
  }

  public DailyFundData setPrice(double price) {
    this.price = price;
    setPriceIsSet(true);
    return this;
  }

  public void unsetPrice() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  /** Returns true if field price is set (has been assigned a value) and false otherwise */
  public boolean isSetPrice() {
    return EncodingUtils.testBit(__isset_bitfield, __PRICE_ISSET_ID);
  }

  public void setPriceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __PRICE_ISSET_ID, value);
  }

  public int getDate() {
    return this.date;
  }

  public DailyFundData setDate(int date) {
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

  public double getNav() {
    return this.nav;
  }

  public DailyFundData setNav(double nav) {
    this.nav = nav;
    setNavIsSet(true);
    return this;
  }

  public void unsetNav() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __NAV_ISSET_ID);
  }

  /** Returns true if field nav is set (has been assigned a value) and false otherwise */
  public boolean isSetNav() {
    return EncodingUtils.testBit(__isset_bitfield, __NAV_ISSET_ID);
  }

  public void setNavIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __NAV_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case PRICE:
      if (value == null) {
        unsetPrice();
      } else {
        setPrice((Double)value);
      }
      break;

    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((Integer)value);
      }
      break;

    case NAV:
      if (value == null) {
        unsetNav();
      } else {
        setNav((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case PRICE:
      return Double.valueOf(getPrice());

    case DATE:
      return Integer.valueOf(getDate());

    case NAV:
      return Double.valueOf(getNav());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case PRICE:
      return isSetPrice();
    case DATE:
      return isSetDate();
    case NAV:
      return isSetNav();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof DailyFundData)
      return this.equals((DailyFundData)that);
    return false;
  }

  public boolean equals(DailyFundData that) {
    if (that == null)
      return false;

    boolean this_present_price = true;
    boolean that_present_price = true;
    if (this_present_price || that_present_price) {
      if (!(this_present_price && that_present_price))
        return false;
      if (this.price != that.price)
        return false;
    }

    boolean this_present_date = true;
    boolean that_present_date = true;
    if (this_present_date || that_present_date) {
      if (!(this_present_date && that_present_date))
        return false;
      if (this.date != that.date)
        return false;
    }

    boolean this_present_nav = true;
    boolean that_present_nav = true;
    if (this_present_nav || that_present_nav) {
      if (!(this_present_nav && that_present_nav))
        return false;
      if (this.nav != that.nav)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_price = true;
    list.add(present_price);
    if (present_price)
      list.add(price);

    boolean present_date = true;
    list.add(present_date);
    if (present_date)
      list.add(date);

    boolean present_nav = true;
    list.add(present_nav);
    if (present_nav)
      list.add(nav);

    return list.hashCode();
  }

  @Override
  public int compareTo(DailyFundData other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetPrice()).compareTo(other.isSetPrice());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPrice()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.price, other.price);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetNav()).compareTo(other.isSetNav());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetNav()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.nav, other.nav);
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
    StringBuilder sb = new StringBuilder("DailyFundData(");
    boolean first = true;

    sb.append("price:");
    sb.append(this.price);
    first = false;
    if (!first) sb.append(", ");
    sb.append("date:");
    sb.append(this.date);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nav:");
    sb.append(this.nav);
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

  private static class DailyFundDataStandardSchemeFactory implements SchemeFactory {
    public DailyFundDataStandardScheme getScheme() {
      return new DailyFundDataStandardScheme();
    }
  }

  private static class DailyFundDataStandardScheme extends StandardScheme<DailyFundData> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, DailyFundData struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.price = iprot.readDouble();
              struct.setPriceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.date = iprot.readI32();
              struct.setDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // NAV
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.nav = iprot.readDouble();
              struct.setNavIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, DailyFundData struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(PRICE_FIELD_DESC);
      oprot.writeDouble(struct.price);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DATE_FIELD_DESC);
      oprot.writeI32(struct.date);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NAV_FIELD_DESC);
      oprot.writeDouble(struct.nav);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class DailyFundDataTupleSchemeFactory implements SchemeFactory {
    public DailyFundDataTupleScheme getScheme() {
      return new DailyFundDataTupleScheme();
    }
  }

  private static class DailyFundDataTupleScheme extends TupleScheme<DailyFundData> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, DailyFundData struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetPrice()) {
        optionals.set(0);
      }
      if (struct.isSetDate()) {
        optionals.set(1);
      }
      if (struct.isSetNav()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetPrice()) {
        oprot.writeDouble(struct.price);
      }
      if (struct.isSetDate()) {
        oprot.writeI32(struct.date);
      }
      if (struct.isSetNav()) {
        oprot.writeDouble(struct.nav);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, DailyFundData struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.price = iprot.readDouble();
        struct.setPriceIsSet(true);
      }
      if (incoming.get(1)) {
        struct.date = iprot.readI32();
        struct.setDateIsSet(true);
      }
      if (incoming.get(2)) {
        struct.nav = iprot.readDouble();
        struct.setNavIsSet(true);
      }
    }
  }

}

