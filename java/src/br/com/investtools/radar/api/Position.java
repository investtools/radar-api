/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Position implements org.apache.thrift.TBase<Position, Position._Fields>, java.io.Serializable, Cloneable, Comparable<Position> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Position");

  private static final org.apache.thrift.protocol.TField ID_FIELD_DESC = new org.apache.thrift.protocol.TField("id", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField SHORT_NAME_FIELD_DESC = new org.apache.thrift.protocol.TField("short_name", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField RENTABILITY_FIELD_DESC = new org.apache.thrift.protocol.TField("rentability", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField AVG_PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("avg_price", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField SHARES_FIELD_DESC = new org.apache.thrift.protocol.TField("shares", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField PAID_VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("paid_value", org.apache.thrift.protocol.TType.DOUBLE, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new PositionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new PositionTupleSchemeFactory();

  public @org.apache.thrift.annotation.Nullable br.com.investtools.radar.api.SecurityId id; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String short_name; // required
  public double value; // required
  public double rentability; // required
  public double avg_price; // required
  public double shares; // required
  public double paid_value; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ID((short)1, "id"),
    SHORT_NAME((short)2, "short_name"),
    VALUE((short)3, "value"),
    RENTABILITY((short)4, "rentability"),
    AVG_PRICE((short)5, "avg_price"),
    SHARES((short)6, "shares"),
    PAID_VALUE((short)7, "paid_value");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // ID
          return ID;
        case 2: // SHORT_NAME
          return SHORT_NAME;
        case 3: // VALUE
          return VALUE;
        case 4: // RENTABILITY
          return RENTABILITY;
        case 5: // AVG_PRICE
          return AVG_PRICE;
        case 6: // SHARES
          return SHARES;
        case 7: // PAID_VALUE
          return PAID_VALUE;
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
    @org.apache.thrift.annotation.Nullable
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

  // isset id assignments
  private static final int __VALUE_ISSET_ID = 0;
  private static final int __RENTABILITY_ISSET_ID = 1;
  private static final int __AVG_PRICE_ISSET_ID = 2;
  private static final int __SHARES_ISSET_ID = 3;
  private static final int __PAID_VALUE_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ID, new org.apache.thrift.meta_data.FieldMetaData("id", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, br.com.investtools.radar.api.SecurityId.class)));
    tmpMap.put(_Fields.SHORT_NAME, new org.apache.thrift.meta_data.FieldMetaData("short_name", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.RENTABILITY, new org.apache.thrift.meta_data.FieldMetaData("rentability", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.AVG_PRICE, new org.apache.thrift.meta_data.FieldMetaData("avg_price", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.SHARES, new org.apache.thrift.meta_data.FieldMetaData("shares", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.PAID_VALUE, new org.apache.thrift.meta_data.FieldMetaData("paid_value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Position.class, metaDataMap);
  }

  public Position() {
  }

  public Position(
    br.com.investtools.radar.api.SecurityId id,
    java.lang.String short_name,
    double value,
    double rentability,
    double avg_price,
    double shares,
    double paid_value)
  {
    this();
    this.id = id;
    this.short_name = short_name;
    this.value = value;
    setValueIsSet(true);
    this.rentability = rentability;
    setRentabilityIsSet(true);
    this.avg_price = avg_price;
    setAvg_priceIsSet(true);
    this.shares = shares;
    setSharesIsSet(true);
    this.paid_value = paid_value;
    setPaid_valueIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Position(Position other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetId()) {
      this.id = new br.com.investtools.radar.api.SecurityId(other.id);
    }
    if (other.isSetShort_name()) {
      this.short_name = other.short_name;
    }
    this.value = other.value;
    this.rentability = other.rentability;
    this.avg_price = other.avg_price;
    this.shares = other.shares;
    this.paid_value = other.paid_value;
  }

  public Position deepCopy() {
    return new Position(this);
  }

  @Override
  public void clear() {
    this.id = null;
    this.short_name = null;
    setValueIsSet(false);
    this.value = 0.0;
    setRentabilityIsSet(false);
    this.rentability = 0.0;
    setAvg_priceIsSet(false);
    this.avg_price = 0.0;
    setSharesIsSet(false);
    this.shares = 0.0;
    setPaid_valueIsSet(false);
    this.paid_value = 0.0;
  }

  @org.apache.thrift.annotation.Nullable
  public br.com.investtools.radar.api.SecurityId getId() {
    return this.id;
  }

  public Position setId(@org.apache.thrift.annotation.Nullable br.com.investtools.radar.api.SecurityId id) {
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getShort_name() {
    return this.short_name;
  }

  public Position setShort_name(@org.apache.thrift.annotation.Nullable java.lang.String short_name) {
    this.short_name = short_name;
    return this;
  }

  public void unsetShort_name() {
    this.short_name = null;
  }

  /** Returns true if field short_name is set (has been assigned a value) and false otherwise */
  public boolean isSetShort_name() {
    return this.short_name != null;
  }

  public void setShort_nameIsSet(boolean value) {
    if (!value) {
      this.short_name = null;
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
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  public void setValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VALUE_ISSET_ID, value);
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
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RENTABILITY_ISSET_ID);
  }

  /** Returns true if field rentability is set (has been assigned a value) and false otherwise */
  public boolean isSetRentability() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RENTABILITY_ISSET_ID);
  }

  public void setRentabilityIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RENTABILITY_ISSET_ID, value);
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
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __AVG_PRICE_ISSET_ID);
  }

  /** Returns true if field avg_price is set (has been assigned a value) and false otherwise */
  public boolean isSetAvg_price() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __AVG_PRICE_ISSET_ID);
  }

  public void setAvg_priceIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __AVG_PRICE_ISSET_ID, value);
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
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SHARES_ISSET_ID);
  }

  /** Returns true if field shares is set (has been assigned a value) and false otherwise */
  public boolean isSetShares() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SHARES_ISSET_ID);
  }

  public void setSharesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SHARES_ISSET_ID, value);
  }

  public double getPaid_value() {
    return this.paid_value;
  }

  public Position setPaid_value(double paid_value) {
    this.paid_value = paid_value;
    setPaid_valueIsSet(true);
    return this;
  }

  public void unsetPaid_value() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __PAID_VALUE_ISSET_ID);
  }

  /** Returns true if field paid_value is set (has been assigned a value) and false otherwise */
  public boolean isSetPaid_value() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __PAID_VALUE_ISSET_ID);
  }

  public void setPaid_valueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __PAID_VALUE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case ID:
      if (value == null) {
        unsetId();
      } else {
        setId((br.com.investtools.radar.api.SecurityId)value);
      }
      break;

    case SHORT_NAME:
      if (value == null) {
        unsetShort_name();
      } else {
        setShort_name((java.lang.String)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((java.lang.Double)value);
      }
      break;

    case RENTABILITY:
      if (value == null) {
        unsetRentability();
      } else {
        setRentability((java.lang.Double)value);
      }
      break;

    case AVG_PRICE:
      if (value == null) {
        unsetAvg_price();
      } else {
        setAvg_price((java.lang.Double)value);
      }
      break;

    case SHARES:
      if (value == null) {
        unsetShares();
      } else {
        setShares((java.lang.Double)value);
      }
      break;

    case PAID_VALUE:
      if (value == null) {
        unsetPaid_value();
      } else {
        setPaid_value((java.lang.Double)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case ID:
      return getId();

    case SHORT_NAME:
      return getShort_name();

    case VALUE:
      return getValue();

    case RENTABILITY:
      return getRentability();

    case AVG_PRICE:
      return getAvg_price();

    case SHARES:
      return getShares();

    case PAID_VALUE:
      return getPaid_value();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case ID:
      return isSetId();
    case SHORT_NAME:
      return isSetShort_name();
    case VALUE:
      return isSetValue();
    case RENTABILITY:
      return isSetRentability();
    case AVG_PRICE:
      return isSetAvg_price();
    case SHARES:
      return isSetShares();
    case PAID_VALUE:
      return isSetPaid_value();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Position)
      return this.equals((Position)that);
    return false;
  }

  public boolean equals(Position that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_id = true && this.isSetId();
    boolean that_present_id = true && that.isSetId();
    if (this_present_id || that_present_id) {
      if (!(this_present_id && that_present_id))
        return false;
      if (!this.id.equals(that.id))
        return false;
    }

    boolean this_present_short_name = true && this.isSetShort_name();
    boolean that_present_short_name = true && that.isSetShort_name();
    if (this_present_short_name || that_present_short_name) {
      if (!(this_present_short_name && that_present_short_name))
        return false;
      if (!this.short_name.equals(that.short_name))
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

    boolean this_present_paid_value = true;
    boolean that_present_paid_value = true;
    if (this_present_paid_value || that_present_paid_value) {
      if (!(this_present_paid_value && that_present_paid_value))
        return false;
      if (this.paid_value != that.paid_value)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + ((isSetId()) ? 131071 : 524287);
    if (isSetId())
      hashCode = hashCode * 8191 + id.hashCode();

    hashCode = hashCode * 8191 + ((isSetShort_name()) ? 131071 : 524287);
    if (isSetShort_name())
      hashCode = hashCode * 8191 + short_name.hashCode();

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(value);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(rentability);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(avg_price);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(shares);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(paid_value);

    return hashCode;
  }

  @Override
  public int compareTo(Position other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetId()).compareTo(other.isSetId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.id, other.id);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetShort_name()).compareTo(other.isSetShort_name());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShort_name()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.short_name, other.short_name);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetRentability()).compareTo(other.isSetRentability());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRentability()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rentability, other.rentability);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetAvg_price()).compareTo(other.isSetAvg_price());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAvg_price()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.avg_price, other.avg_price);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetShares()).compareTo(other.isSetShares());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShares()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shares, other.shares);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetPaid_value()).compareTo(other.isSetPaid_value());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetPaid_value()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.paid_value, other.paid_value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Position(");
    boolean first = true;

    sb.append("id:");
    if (this.id == null) {
      sb.append("null");
    } else {
      sb.append(this.id);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("short_name:");
    if (this.short_name == null) {
      sb.append("null");
    } else {
      sb.append(this.short_name);
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
    if (!first) sb.append(", ");
    sb.append("paid_value:");
    sb.append(this.paid_value);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PositionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PositionStandardScheme getScheme() {
      return new PositionStandardScheme();
    }
  }

  private static class PositionStandardScheme extends org.apache.thrift.scheme.StandardScheme<Position> {

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
              struct.id = new br.com.investtools.radar.api.SecurityId();
              struct.id.read(iprot);
              struct.setIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // SHORT_NAME
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.short_name = iprot.readString();
              struct.setShort_nameIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.value = iprot.readDouble();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // RENTABILITY
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.rentability = iprot.readDouble();
              struct.setRentabilityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // AVG_PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.avg_price = iprot.readDouble();
              struct.setAvg_priceIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // SHARES
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.shares = iprot.readDouble();
              struct.setSharesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // PAID_VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.paid_value = iprot.readDouble();
              struct.setPaid_valueIsSet(true);
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
      if (struct.short_name != null) {
        oprot.writeFieldBegin(SHORT_NAME_FIELD_DESC);
        oprot.writeString(struct.short_name);
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
      oprot.writeFieldBegin(PAID_VALUE_FIELD_DESC);
      oprot.writeDouble(struct.paid_value);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PositionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public PositionTupleScheme getScheme() {
      return new PositionTupleScheme();
    }
  }

  private static class PositionTupleScheme extends org.apache.thrift.scheme.TupleScheme<Position> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Position struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetId()) {
        optionals.set(0);
      }
      if (struct.isSetShort_name()) {
        optionals.set(1);
      }
      if (struct.isSetValue()) {
        optionals.set(2);
      }
      if (struct.isSetRentability()) {
        optionals.set(3);
      }
      if (struct.isSetAvg_price()) {
        optionals.set(4);
      }
      if (struct.isSetShares()) {
        optionals.set(5);
      }
      if (struct.isSetPaid_value()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetId()) {
        struct.id.write(oprot);
      }
      if (struct.isSetShort_name()) {
        oprot.writeString(struct.short_name);
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
      if (struct.isSetPaid_value()) {
        oprot.writeDouble(struct.paid_value);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Position struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.id = new br.com.investtools.radar.api.SecurityId();
        struct.id.read(iprot);
        struct.setIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.short_name = iprot.readString();
        struct.setShort_nameIsSet(true);
      }
      if (incoming.get(2)) {
        struct.value = iprot.readDouble();
        struct.setValueIsSet(true);
      }
      if (incoming.get(3)) {
        struct.rentability = iprot.readDouble();
        struct.setRentabilityIsSet(true);
      }
      if (incoming.get(4)) {
        struct.avg_price = iprot.readDouble();
        struct.setAvg_priceIsSet(true);
      }
      if (incoming.get(5)) {
        struct.shares = iprot.readDouble();
        struct.setSharesIsSet(true);
      }
      if (incoming.get(6)) {
        struct.paid_value = iprot.readDouble();
        struct.setPaid_valueIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

