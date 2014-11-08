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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-11-8")
public class Position implements org.apache.thrift.TBase<Position, Position._Fields>, java.io.Serializable, Cloneable, Comparable<Position> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Position");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField RENTABILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("rentability", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField AVG_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("avg_price", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField SHARES_FIELD_DESC = new org.apache.thrift.protocol.TField("shares", org.apache.thrift.protocol.TType.DOUBLE, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PositionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PositionTupleSchemeFactory());
  }

  public SecurityId id; // required
  public double value; // required
  public double rentability; // required
  public double avg_price; // required
  public double shares; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    VALUE((short)2, "value"),
    RENTABILITY((short)3, "rentability"),
    AVG_PRICE((short)4, "avg_price"),
    SHARES((short)5, "shares");

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
        case 1: // ID
          return ID;
        case 2: // VALUE
          return VALUE;
        case 3: // RENTABILITY
          return RENTABILITY;
        case 4: // AVG_PRICE
          return AVG_PRICE;
        case 5: // SHARES
          return SHARES;
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
  private static final int __VALUE_ISSET_ID = 0;
  private static final int __RENTABILITY_ISSET_ID = 1;
  private static final int __AVG_PRICE_ISSET_ID = 2;
  private static final int __SHARES_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SecurityId.class)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.RENTABILITY, new org.apache.thrift.meta_data.FieldMetaData("rentability", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.AVG_PRICE, new org.apache.thrift.meta_data.FieldMetaData("avg_price", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SHARES, new org.apache.thrift.meta_data.FieldMetaData("shares", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Position.class, metaDataMap);
  }

  public Position() {
  }

  public Position(
    SecurityId id,
    double value,
    double rentability,
    double avg_price,
    double shares)
  {
    this();
    this.id = id;
    this.value = value;
    setValueIsSet(true);
    this.rentability = rentability;
    setRentabilityIsSet(true);
    this.avg_price = avg_price;
    setAvg_priceIsSet(true);
    this.shares = shares;
    setSharesIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Position(Position other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = new SecurityId(other.id);
    }
    this.value = other.value;
    this.rentability = other.rentability;
    this.avg_price = other.avg_price;
    this.shares = other.shares;
  }

  public Position deepCopy() {
    return new Position(this);
  }

  @Override
  public void clear() {
    this.id = null;
    setValueIsSet(false);
    this.value = 0.0;
    setRentabilityIsSet(false);
    this.rentability = 0.0;
    setAvg_priceIsSet(false);
    this.avg_price = 0.0;
    setSharesIsSet(false);
    this.shares = 0.0;
  }

  public SecurityId getId() {
    return this.id;
  }

  public Position setId(SecurityId id) {
    this.id = id;
    return this;
  }

  public void unsetId() {
    this.id = null;
  }

  /** Returns true if field id is set (has been assigned a value) and false otherwise */
  public boolean isSetId() {
    return this.id != null;
  }

  public void setIdIsSet(boolean value) {
    if (!value) {
      this.id = null;
    }
  }

  public double getValue() {
    return this.value;
  }

  public Position setValue(double value) {
    this.value = value;
    setValueIsSet(true);
    return this;
  }

  public void unsetValue() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return EncodingUtils.testBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  public void setValueIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VALUE_ISSET_ID, value);
  }

  public double getRentability() {
    return this.rentability;
  }

  public Position setRentability(double rentability) {
    this.rentability = rentability;
    setRentabilityIsSet(true);
    return this;
  }

  public void unsetRentability() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __RENTABILITY_ISSET_ID);
  }

  /** Returns true if field rentability is set (has been assigned a value) and false otherwise */
  public boolean isSetRentability() {
    return EncodingUtils.testBit(__isset_bitfield, __RENTABILITY_ISSET_ID);
  }

  public void setRentabilityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __RENTABILITY_ISSET_ID, value);
  }

  public double getAvg_price() {
    return this.avg_price;
  }

  public Position setAvg_price(double avg_price) {
    this.avg_price = avg_price;
    setAvg_priceIsSet(true);
    return this;
  }

  public void unsetAvg_price() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __AVG_PRICE_ISSET_ID);
  }

  /** Returns true if field avg_price is set (has been assigned a value) and false otherwise */
  public boolean isSetAvg_price() {
    return EncodingUtils.testBit(__isset_bitfield, __AVG_PRICE_ISSET_ID);
  }

  public void setAvg_priceIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __AVG_PRICE_ISSET_ID, value);
  }

  public double getShares() {
    return this.shares;
  }

  public Position setShares(double shares) {
    this.shares = shares;
    setSharesIsSet(true);
    return this;
  }

  public void unsetShares() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __SHARES_ISSET_ID);
  }

  /** Returns true if field shares is set (has been assigned a value) and false otherwise */
  public boolean isSetShares() {
    return EncodingUtils.testBit(__isset_bitfield, __SHARES_ISSET_ID);
  }

  public void setSharesIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __SHARES_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((SecurityId)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((Double)value);
      }
      break;

    case RENTABILITY:
      if (value == null) {
        unsetRentability();
      } else {
        setRentability((Double)value);
      }
      break;

    case AVG_PRICE:
      if (value == null) {
        unsetAvg_price();
      } else {
        setAvg_price((Double)value);
      }
      break;

    case SHARES:
      if (value == null) {
        unsetShares();
      } else {
        setShares((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case VALUE:
      return Double.valueOf(getValue());

    case RENTABILITY:
      return Double.valueOf(getRentability());

    case AVG_PRICE:
      return Double.valueOf(getAvg_price());

    case SHARES:
      return Double.valueOf(getShares());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case VALUE:
      return isSetValue();
    case RENTABILITY:
      return isSetRentability();
    case AVG_PRICE:
      return isSetAvg_price();
    case SHARES:
      return isSetShares();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Position)
      return this.equals((Position)that);
    return false;
  }

  public boolean equals(Position that) {
    if (that == null)
      return false;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_value = true;
    boolean that_present_value = true;
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (this.value != that.value)
        return false;
    }

    boolean this_present_rentability = true;
    boolean that_present_rentability = true;
    if (this_present_rentability || that_present_rentability) {
      if (!(this_present_rentability && that_present_rentability))
        return false;
      if (this.rentability != that.rentability)
        return false;
    }

    boolean this_present_avg_price = true;
    boolean that_present_avg_price = true;
    if (this_present_avg_price || that_present_avg_price) {
      if (!(this_present_avg_price && that_present_avg_price))
        return false;
      if (this.avg_price != that.avg_price)
        return false;
    }

    boolean this_present_shares = true;
    boolean that_present_shares = true;
    if (this_present_shares || that_present_shares) {
      if (!(this_present_shares && that_present_shares))
        return false;
      if (this.shares != that.shares)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_id = true && (isSetId());
    list.add(present_id);
    if (present_id)
      list.add(id);

    boolean present_value = true;
    list.add(present_value);
    if (present_value)
      list.add(value);

    boolean present_rentability = true;
    list.add(present_rentability);
    if (present_rentability)
      list.add(rentability);

    boolean present_avg_price = true;
    list.add(present_avg_price);
    if (present_avg_price)
      list.add(avg_price);

    boolean present_shares = true;
    list.add(present_shares);
    if (present_shares)
      list.add(shares);

    return list.hashCode();
  }

  @Override
  public int compareTo(Position other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRentability()).compareTo(other.isSetRentability());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRentability()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rentability, other.rentability);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAvg_price()).compareTo(other.isSetAvg_price());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAvg_price()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.avg_price, other.avg_price);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetShares()).compareTo(other.isSetShares());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShares()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shares, other.shares);
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
    StringBuilder sb = new StringBuilder("Position(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    sb.append(this.value);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rentability:");
    sb.append(this.rentability);
    first = false;
    if (!first) sb.append(", ");
    sb.append("avg_price:");
    sb.append(this.avg_price);
    first = false;
    if (!first) sb.append(", ");
    sb.append("shares:");
    sb.append(this.shares);
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

  private static class PositionStandardSchemeFactory implements SchemeFactory {
    public PositionStandardScheme getScheme() {
      return new PositionStandardScheme();
    }
  }

  private static class PositionStandardScheme extends StandardScheme<Position> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Position struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.id = new SecurityId();
              struct.id.read(iprot);
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.value = iprot.readDouble();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // RENTABILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.rentability = iprot.readDouble();
              struct.setRentabilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // AVG_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.avg_price = iprot.readDouble();
              struct.setAvg_priceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SHARES
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.shares = iprot.readDouble();
              struct.setSharesIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Position struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.id != null) {
        oprot.writeFieldBegin(ID_FIELD_DESC);
        struct.id.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeDouble(struct.value);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RENTABILITY_FIELD_DESC);
      oprot.writeDouble(struct.rentability);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(AVG_PRICE_FIELD_DESC);
      oprot.writeDouble(struct.avg_price);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(SHARES_FIELD_DESC);
      oprot.writeDouble(struct.shares);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PositionTupleSchemeFactory implements SchemeFactory {
    public PositionTupleScheme getScheme() {
      return new PositionTupleScheme();
    }
  }

  private static class PositionTupleScheme extends TupleScheme<Position> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Position struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetValue()) {
        optionals.set(1);
      }
      if (struct.isSetRentability()) {
        optionals.set(2);
      }
      if (struct.isSetAvg_price()) {
        optionals.set(3);
      }
      if (struct.isSetShares()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetId()) {
        struct.id.write(oprot);
      }
      if (struct.isSetValue()) {
        oprot.writeDouble(struct.value);
      }
      if (struct.isSetRentability()) {
        oprot.writeDouble(struct.rentability);
      }
      if (struct.isSetAvg_price()) {
        oprot.writeDouble(struct.avg_price);
      }
      if (struct.isSetShares()) {
        oprot.writeDouble(struct.shares);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Position struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.id = new SecurityId();
        struct.id.read(iprot);
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.value = iprot.readDouble();
        struct.setValueIsSet(true);
      }
      if (incoming.get(2)) {
        struct.rentability = iprot.readDouble();
        struct.setRentabilityIsSet(true);
      }
      if (incoming.get(3)) {
        struct.avg_price = iprot.readDouble();
        struct.setAvg_priceIsSet(true);
      }
      if (incoming.get(4)) {
        struct.shares = iprot.readDouble();
        struct.setSharesIsSet(true);
      }
    }
  }

}

