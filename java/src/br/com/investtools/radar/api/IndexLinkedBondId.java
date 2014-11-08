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
public class IndexLinkedBondId implements org.apache.thrift.TBase<IndexLinkedBondId, IndexLinkedBondId._Fields>, java.io.Serializable, Cloneable, Comparable<IndexLinkedBondId> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("IndexLinkedBondId");

  private static final org.apache.thrift.protocol.TField INDEX_FIELD_DESC = new org.apache.thrift.protocol.TField("index", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FACTOR_FIELD_DESC = new org.apache.thrift.protocol.TField("factor", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField BASE_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("base_date", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField MATURITY_DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("maturity_date", org.apache.thrift.protocol.TType.I32, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new IndexLinkedBondIdStandardSchemeFactory());
    schemes.put(TupleScheme.class, new IndexLinkedBondIdTupleSchemeFactory());
  }

  public IndexId index; // required
  public double factor; // required
  public int base_date; // required
  public int maturity_date; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    INDEX((short)1, "index"),
    FACTOR((short)2, "factor"),
    BASE_DATE((short)3, "base_date"),
    MATURITY_DATE((short)4, "maturity_date");

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
        case 1: // INDEX
          return INDEX;
        case 2: // FACTOR
          return FACTOR;
        case 3: // BASE_DATE
          return BASE_DATE;
        case 4: // MATURITY_DATE
          return MATURITY_DATE;
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
  private static final int __FACTOR_ISSET_ID = 0;
  private static final int __BASE_DATE_ISSET_ID = 1;
  private static final int __MATURITY_DATE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.INDEX, new org.apache.thrift.meta_data.FieldMetaData("index", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, IndexId.class)));
    tmpMap.put(_Fields.FACTOR, new org.apache.thrift.meta_data.FieldMetaData("factor", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.BASE_DATE, new org.apache.thrift.meta_data.FieldMetaData("base_date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Date")));
    tmpMap.put(_Fields.MATURITY_DATE, new org.apache.thrift.meta_data.FieldMetaData("maturity_date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Date")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(IndexLinkedBondId.class, metaDataMap);
  }

  public IndexLinkedBondId() {
  }

  public IndexLinkedBondId(
    IndexId index,
    double factor,
    int base_date,
    int maturity_date)
  {
    this();
    this.index = index;
    this.factor = factor;
    setFactorIsSet(true);
    this.base_date = base_date;
    setBase_dateIsSet(true);
    this.maturity_date = maturity_date;
    setMaturity_dateIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IndexLinkedBondId(IndexLinkedBondId other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetIndex()) {
      this.index = new IndexId(other.index);
    }
    this.factor = other.factor;
    this.base_date = other.base_date;
    this.maturity_date = other.maturity_date;
  }

  public IndexLinkedBondId deepCopy() {
    return new IndexLinkedBondId(this);
  }

  @Override
  public void clear() {
    this.index = null;
    setFactorIsSet(false);
    this.factor = 0.0;
    setBase_dateIsSet(false);
    this.base_date = 0;
    setMaturity_dateIsSet(false);
    this.maturity_date = 0;
  }

  public IndexId getIndex() {
    return this.index;
  }

  public IndexLinkedBondId setIndex(IndexId index) {
    this.index = index;
    return this;
  }

  public void unsetIndex() {
    this.index = null;
  }

  /** Returns true if field index is set (has been assigned a value) and false otherwise */
  public boolean isSetIndex() {
    return this.index != null;
  }

  public void setIndexIsSet(boolean value) {
    if (!value) {
      this.index = null;
    }
  }

  public double getFactor() {
    return this.factor;
  }

  public IndexLinkedBondId setFactor(double factor) {
    this.factor = factor;
    setFactorIsSet(true);
    return this;
  }

  public void unsetFactor() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __FACTOR_ISSET_ID);
  }

  /** Returns true if field factor is set (has been assigned a value) and false otherwise */
  public boolean isSetFactor() {
    return EncodingUtils.testBit(__isset_bitfield, __FACTOR_ISSET_ID);
  }

  public void setFactorIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __FACTOR_ISSET_ID, value);
  }

  public int getBase_date() {
    return this.base_date;
  }

  public IndexLinkedBondId setBase_date(int base_date) {
    this.base_date = base_date;
    setBase_dateIsSet(true);
    return this;
  }

  public void unsetBase_date() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BASE_DATE_ISSET_ID);
  }

  /** Returns true if field base_date is set (has been assigned a value) and false otherwise */
  public boolean isSetBase_date() {
    return EncodingUtils.testBit(__isset_bitfield, __BASE_DATE_ISSET_ID);
  }

  public void setBase_dateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BASE_DATE_ISSET_ID, value);
  }

  public int getMaturity_date() {
    return this.maturity_date;
  }

  public IndexLinkedBondId setMaturity_date(int maturity_date) {
    this.maturity_date = maturity_date;
    setMaturity_dateIsSet(true);
    return this;
  }

  public void unsetMaturity_date() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MATURITY_DATE_ISSET_ID);
  }

  /** Returns true if field maturity_date is set (has been assigned a value) and false otherwise */
  public boolean isSetMaturity_date() {
    return EncodingUtils.testBit(__isset_bitfield, __MATURITY_DATE_ISSET_ID);
  }

  public void setMaturity_dateIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MATURITY_DATE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case INDEX:
      if (value == null) {
        unsetIndex();
      } else {
        setIndex((IndexId)value);
      }
      break;

    case FACTOR:
      if (value == null) {
        unsetFactor();
      } else {
        setFactor((Double)value);
      }
      break;

    case BASE_DATE:
      if (value == null) {
        unsetBase_date();
      } else {
        setBase_date((Integer)value);
      }
      break;

    case MATURITY_DATE:
      if (value == null) {
        unsetMaturity_date();
      } else {
        setMaturity_date((Integer)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case INDEX:
      return getIndex();

    case FACTOR:
      return Double.valueOf(getFactor());

    case BASE_DATE:
      return Integer.valueOf(getBase_date());

    case MATURITY_DATE:
      return Integer.valueOf(getMaturity_date());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case INDEX:
      return isSetIndex();
    case FACTOR:
      return isSetFactor();
    case BASE_DATE:
      return isSetBase_date();
    case MATURITY_DATE:
      return isSetMaturity_date();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IndexLinkedBondId)
      return this.equals((IndexLinkedBondId)that);
    return false;
  }

  public boolean equals(IndexLinkedBondId that) {
    if (that == null)
      return false;

    boolean this_present_index = true && this.isSetIndex();
    boolean that_present_index = true && that.isSetIndex();
    if (this_present_index || that_present_index) {
      if (!(this_present_index && that_present_index))
        return false;
      if (!this.index.equals(that.index))
        return false;
    }

    boolean this_present_factor = true;
    boolean that_present_factor = true;
    if (this_present_factor || that_present_factor) {
      if (!(this_present_factor && that_present_factor))
        return false;
      if (this.factor != that.factor)
        return false;
    }

    boolean this_present_base_date = true;
    boolean that_present_base_date = true;
    if (this_present_base_date || that_present_base_date) {
      if (!(this_present_base_date && that_present_base_date))
        return false;
      if (this.base_date != that.base_date)
        return false;
    }

    boolean this_present_maturity_date = true;
    boolean that_present_maturity_date = true;
    if (this_present_maturity_date || that_present_maturity_date) {
      if (!(this_present_maturity_date && that_present_maturity_date))
        return false;
      if (this.maturity_date != that.maturity_date)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_index = true && (isSetIndex());
    list.add(present_index);
    if (present_index)
      list.add(index);

    boolean present_factor = true;
    list.add(present_factor);
    if (present_factor)
      list.add(factor);

    boolean present_base_date = true;
    list.add(present_base_date);
    if (present_base_date)
      list.add(base_date);

    boolean present_maturity_date = true;
    list.add(present_maturity_date);
    if (present_maturity_date)
      list.add(maturity_date);

    return list.hashCode();
  }

  @Override
  public int compareTo(IndexLinkedBondId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetIndex()).compareTo(other.isSetIndex());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetIndex()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.index, other.index);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFactor()).compareTo(other.isSetFactor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFactor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.factor, other.factor);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBase_date()).compareTo(other.isSetBase_date());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBase_date()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.base_date, other.base_date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMaturity_date()).compareTo(other.isSetMaturity_date());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMaturity_date()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.maturity_date, other.maturity_date);
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
    StringBuilder sb = new StringBuilder("IndexLinkedBondId(");
    boolean first = true;

    sb.append("index:");
    if (this.index == null) {
      sb.append("null");
    } else {
      sb.append(this.index);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("factor:");
    sb.append(this.factor);
    first = false;
    if (!first) sb.append(", ");
    sb.append("base_date:");
    sb.append(this.base_date);
    first = false;
    if (!first) sb.append(", ");
    sb.append("maturity_date:");
    sb.append(this.maturity_date);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (index != null) {
      index.validate();
    }
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

  private static class IndexLinkedBondIdStandardSchemeFactory implements SchemeFactory {
    public IndexLinkedBondIdStandardScheme getScheme() {
      return new IndexLinkedBondIdStandardScheme();
    }
  }

  private static class IndexLinkedBondIdStandardScheme extends StandardScheme<IndexLinkedBondId> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, IndexLinkedBondId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // INDEX
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.index = new IndexId();
              struct.index.read(iprot);
              struct.setIndexIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // FACTOR
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.factor = iprot.readDouble();
              struct.setFactorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BASE_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.base_date = iprot.readI32();
              struct.setBase_dateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // MATURITY_DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.maturity_date = iprot.readI32();
              struct.setMaturity_dateIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, IndexLinkedBondId struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.index != null) {
        oprot.writeFieldBegin(INDEX_FIELD_DESC);
        struct.index.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(FACTOR_FIELD_DESC);
      oprot.writeDouble(struct.factor);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(BASE_DATE_FIELD_DESC);
      oprot.writeI32(struct.base_date);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(MATURITY_DATE_FIELD_DESC);
      oprot.writeI32(struct.maturity_date);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class IndexLinkedBondIdTupleSchemeFactory implements SchemeFactory {
    public IndexLinkedBondIdTupleScheme getScheme() {
      return new IndexLinkedBondIdTupleScheme();
    }
  }

  private static class IndexLinkedBondIdTupleScheme extends TupleScheme<IndexLinkedBondId> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, IndexLinkedBondId struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetIndex()) {
        optionals.set(0);
      }
      if (struct.isSetFactor()) {
        optionals.set(1);
      }
      if (struct.isSetBase_date()) {
        optionals.set(2);
      }
      if (struct.isSetMaturity_date()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetIndex()) {
        struct.index.write(oprot);
      }
      if (struct.isSetFactor()) {
        oprot.writeDouble(struct.factor);
      }
      if (struct.isSetBase_date()) {
        oprot.writeI32(struct.base_date);
      }
      if (struct.isSetMaturity_date()) {
        oprot.writeI32(struct.maturity_date);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, IndexLinkedBondId struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.index = new IndexId();
        struct.index.read(iprot);
        struct.setIndexIsSet(true);
      }
      if (incoming.get(1)) {
        struct.factor = iprot.readDouble();
        struct.setFactorIsSet(true);
      }
      if (incoming.get(2)) {
        struct.base_date = iprot.readI32();
        struct.setBase_dateIsSet(true);
      }
      if (incoming.get(3)) {
        struct.maturity_date = iprot.readI32();
        struct.setMaturity_dateIsSet(true);
      }
    }
  }

}

