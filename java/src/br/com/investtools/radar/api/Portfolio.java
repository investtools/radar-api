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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-2-11")
public class Portfolio implements org.apache.thrift.TBase<Portfolio, Portfolio._Fields>, java.io.Serializable, Cloneable, Comparable<Portfolio> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Portfolio");

  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField RENTABILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("rentability", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField NAV_FIELD_DESC = new org.apache.thrift.protocol.TField("nav", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField POSITIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("positions", org.apache.thrift.protocol.TType.MAP, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PortfolioStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PortfolioTupleSchemeFactory());
  }

  public int date; // required
  public double rentability; // required
  public double nav; // required
  public Map<String,Position> positions; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATE((short)1, "date"),
    RENTABILITY((short)2, "rentability"),
    NAV((short)3, "nav"),
    POSITIONS((short)4, "positions");

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
        case 2: // RENTABILITY
          return RENTABILITY;
        case 3: // NAV
          return NAV;
        case 4: // POSITIONS
          return POSITIONS;
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
  private static final int __RENTABILITY_ISSET_ID = 1;
  private static final int __NAV_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Date")));
    tmpMap.put(_Fields.RENTABILITY, new org.apache.thrift.meta_data.FieldMetaData("rentability", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.NAV, new org.apache.thrift.meta_data.FieldMetaData("nav", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.POSITIONS, new org.apache.thrift.meta_data.FieldMetaData("positions", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Position.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Portfolio.class, metaDataMap);
  }

  public Portfolio() {
  }

  public Portfolio(
    int date,
    double rentability,
    double nav,
    Map<String,Position> positions)
  {
    this();
    this.date = date;
    setDateIsSet(true);
    this.rentability = rentability;
    setRentabilityIsSet(true);
    this.nav = nav;
    setNavIsSet(true);
    this.positions = positions;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Portfolio(Portfolio other) {
    __isset_bitfield = other.__isset_bitfield;
    this.date = other.date;
    this.rentability = other.rentability;
    this.nav = other.nav;
    if (other.isSetPositions()) {
      Map<String,Position> __this__positions = new HashMap<String,Position>(other.positions.size());
      for (Map.Entry<String, Position> other_element : other.positions.entrySet()) {

        String other_element_key = other_element.getKey();
        Position other_element_value = other_element.getValue();

        String __this__positions_copy_key = other_element_key;

        Position __this__positions_copy_value = new Position(other_element_value);

        __this__positions.put(__this__positions_copy_key, __this__positions_copy_value);
      }
      this.positions = __this__positions;
    }
  }

  public Portfolio deepCopy() {
    return new Portfolio(this);
  }

  @Override
  public void clear() {
    setDateIsSet(false);
    this.date = 0;
    setRentabilityIsSet(false);
    this.rentability = 0.0;
    setNavIsSet(false);
    this.nav = 0.0;
    this.positions = null;
  }

  public int getDate() {
    return this.date;
  }

  public Portfolio setDate(int date) {
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

  public double getRentability() {
    return this.rentability;
  }

  public Portfolio setRentability(double rentability) {
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

  public double getNav() {
    return this.nav;
  }

  public Portfolio setNav(double nav) {
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

  public int getPositionsSize() {
    return (this.positions == null) ? 0 : this.positions.size();
  }

  public void putToPositions(String key, Position val) {
    if (this.positions == null) {
      this.positions = new HashMap<String,Position>();
    }
    this.positions.put(key, val);
  }

  public Map<String,Position> getPositions() {
    return this.positions;
  }

  public Portfolio setPositions(Map<String,Position> positions) {
    this.positions = positions;
    return this;
  }

  public void unsetPositions() {
    this.positions = null;
  }

  /** Returns true if field positions is set (has been assigned a value) and false otherwise */
  public boolean isSetPositions() {
    return this.positions != null;
  }

  public void setPositionsIsSet(boolean value) {
    if (!value) {
      this.positions = null;
    }
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

    case RENTABILITY:
      if (value == null) {
        unsetRentability();
      } else {
        setRentability((Double)value);
      }
      break;

    case NAV:
      if (value == null) {
        unsetNav();
      } else {
        setNav((Double)value);
      }
      break;

    case POSITIONS:
      if (value == null) {
        unsetPositions();
      } else {
        setPositions((Map<String,Position>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATE:
      return Integer.valueOf(getDate());

    case RENTABILITY:
      return Double.valueOf(getRentability());

    case NAV:
      return Double.valueOf(getNav());

    case POSITIONS:
      return getPositions();

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
    case RENTABILITY:
      return isSetRentability();
    case NAV:
      return isSetNav();
    case POSITIONS:
      return isSetPositions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Portfolio)
      return this.equals((Portfolio)that);
    return false;
  }

  public boolean equals(Portfolio that) {
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

    boolean this_present_rentability = true;
    boolean that_present_rentability = true;
    if (this_present_rentability || that_present_rentability) {
      if (!(this_present_rentability && that_present_rentability))
        return false;
      if (this.rentability != that.rentability)
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

    boolean this_present_positions = true && this.isSetPositions();
    boolean that_present_positions = true && that.isSetPositions();
    if (this_present_positions || that_present_positions) {
      if (!(this_present_positions && that_present_positions))
        return false;
      if (!this.positions.equals(that.positions))
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

    boolean present_rentability = true;
    list.add(present_rentability);
    if (present_rentability)
      list.add(rentability);

    boolean present_nav = true;
    list.add(present_nav);
    if (present_nav)
      list.add(nav);

    boolean present_positions = true && (isSetPositions());
    list.add(present_positions);
    if (present_positions)
      list.add(positions);

    return list.hashCode();
  }

  @Override
  public int compareTo(Portfolio other) {
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
    lastComparison = Boolean.valueOf(isSetPositions()).compareTo(other.isSetPositions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPositions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.positions, other.positions);
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
    StringBuilder sb = new StringBuilder("Portfolio(");
    boolean first = true;

    sb.append("date:");
    sb.append(this.date);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rentability:");
    sb.append(this.rentability);
    first = false;
    if (!first) sb.append(", ");
    sb.append("nav:");
    sb.append(this.nav);
    first = false;
    if (!first) sb.append(", ");
    sb.append("positions:");
    if (this.positions == null) {
      sb.append("null");
    } else {
      sb.append(this.positions);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // alas, we cannot check 'date' because it's a primitive and you chose the non-beans generator.
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

  private static class PortfolioStandardSchemeFactory implements SchemeFactory {
    public PortfolioStandardScheme getScheme() {
      return new PortfolioStandardScheme();
    }
  }

  private static class PortfolioStandardScheme extends StandardScheme<Portfolio> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Portfolio struct) throws org.apache.thrift.TException {
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
          case 2: // RENTABILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.rentability = iprot.readDouble();
              struct.setRentabilityIsSet(true);
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
          case 4: // POSITIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map40 = iprot.readMapBegin();
                struct.positions = new HashMap<String,Position>(2*_map40.size);
                for (int _i41 = 0; _i41 < _map40.size; ++_i41)
                {
                  String _key42;
                  Position _val43;
                  _key42 = iprot.readString();
                  _val43 = new Position();
                  _val43.read(iprot);
                  struct.positions.put(_key42, _val43);
                }
                iprot.readMapEnd();
              }
              struct.setPositionsIsSet(true);
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
      if (!struct.isSetDate()) {
        throw new org.apache.thrift.protocol.TProtocolException("Required field 'date' was not found in serialized data! Struct: " + toString());
      }
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, Portfolio struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DATE_FIELD_DESC);
      oprot.writeI32(struct.date);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(RENTABILITY_FIELD_DESC);
      oprot.writeDouble(struct.rentability);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(NAV_FIELD_DESC);
      oprot.writeDouble(struct.nav);
      oprot.writeFieldEnd();
      if (struct.positions != null) {
        oprot.writeFieldBegin(POSITIONS_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.positions.size()));
          for (Map.Entry<String, Position> _iter44 : struct.positions.entrySet())
          {
            oprot.writeString(_iter44.getKey());
            _iter44.getValue().write(oprot);
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PortfolioTupleSchemeFactory implements SchemeFactory {
    public PortfolioTupleScheme getScheme() {
      return new PortfolioTupleScheme();
    }
  }

  private static class PortfolioTupleScheme extends TupleScheme<Portfolio> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Portfolio struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.date);
      BitSet optionals = new BitSet();
      if (struct.isSetRentability()) {
        optionals.set(0);
      }
      if (struct.isSetNav()) {
        optionals.set(1);
      }
      if (struct.isSetPositions()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetRentability()) {
        oprot.writeDouble(struct.rentability);
      }
      if (struct.isSetNav()) {
        oprot.writeDouble(struct.nav);
      }
      if (struct.isSetPositions()) {
        {
          oprot.writeI32(struct.positions.size());
          for (Map.Entry<String, Position> _iter45 : struct.positions.entrySet())
          {
            oprot.writeString(_iter45.getKey());
            _iter45.getValue().write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Portfolio struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.date = iprot.readI32();
      struct.setDateIsSet(true);
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.rentability = iprot.readDouble();
        struct.setRentabilityIsSet(true);
      }
      if (incoming.get(1)) {
        struct.nav = iprot.readDouble();
        struct.setNavIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TMap _map46 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.positions = new HashMap<String,Position>(2*_map46.size);
          for (int _i47 = 0; _i47 < _map46.size; ++_i47)
          {
            String _key48;
            Position _val49;
            _key48 = iprot.readString();
            _val49 = new Position();
            _val49.read(iprot);
            struct.positions.put(_key48, _val49);
          }
        }
        struct.setPositionsIsSet(true);
      }
    }
  }

}

