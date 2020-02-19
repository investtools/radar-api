/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class SecurityLendingAndBorrowingReturning implements org.apache.thrift.TBase<SecurityLendingAndBorrowingReturning, SecurityLendingAndBorrowingReturning._Fields>, java.io.Serializable, Cloneable, Comparable<SecurityLendingAndBorrowingReturning> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SecurityLendingAndBorrowingReturning");

  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField STOCK_FIELD_DESC = new org.apache.thrift.protocol.TField("stock", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SHARES_FIELD_DESC = new org.apache.thrift.protocol.TField("shares", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)5);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SecurityLendingAndBorrowingReturningStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SecurityLendingAndBorrowingReturningTupleSchemeFactory();

  public long date; // required
  public @org.apache.thrift.annotation.Nullable br.com.investtools.radar.api.EquityId stock; // required
  public int shares; // required
  public double value; // required
  /**
   * 
   * @see SecurityLendingAndBorrowingType
   */
  public @org.apache.thrift.annotation.Nullable SecurityLendingAndBorrowingType type; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATE((short)1, "date"),
    STOCK((short)2, "stock"),
    SHARES((short)3, "shares"),
    VALUE((short)4, "value"),
    /**
     * 
     * @see SecurityLendingAndBorrowingType
     */
    TYPE((short)5, "type");

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
        case 1: // DATE
          return DATE;
        case 2: // STOCK
          return STOCK;
        case 3: // SHARES
          return SHARES;
        case 4: // VALUE
          return VALUE;
        case 5: // TYPE
          return TYPE;
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
  private static final int __DATE_ISSET_ID = 0;
  private static final int __SHARES_ISSET_ID = 1;
  private static final int __VALUE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Date")));
    tmpMap.put(_Fields.STOCK, new org.apache.thrift.meta_data.FieldMetaData("stock", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, br.com.investtools.radar.api.EquityId.class)));
    tmpMap.put(_Fields.SHARES, new org.apache.thrift.meta_data.FieldMetaData("shares", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SecurityLendingAndBorrowingType.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SecurityLendingAndBorrowingReturning.class, metaDataMap);
  }

  public SecurityLendingAndBorrowingReturning() {
  }

  public SecurityLendingAndBorrowingReturning(
    long date,
    br.com.investtools.radar.api.EquityId stock,
    int shares,
    double value,
    SecurityLendingAndBorrowingType type)
  {
    this();
    this.date = date;
    setDateIsSet(true);
    this.stock = stock;
    this.shares = shares;
    setSharesIsSet(true);
    this.value = value;
    setValueIsSet(true);
    this.type = type;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SecurityLendingAndBorrowingReturning(SecurityLendingAndBorrowingReturning other) {
    __isset_bitfield = other.__isset_bitfield;
    this.date = other.date;
    if (other.isSetStock()) {
      this.stock = new br.com.investtools.radar.api.EquityId(other.stock);
    }
    this.shares = other.shares;
    this.value = other.value;
    if (other.isSetType()) {
      this.type = other.type;
    }
  }

  public SecurityLendingAndBorrowingReturning deepCopy() {
    return new SecurityLendingAndBorrowingReturning(this);
  }

  @Override
  public void clear() {
    setDateIsSet(false);
    this.date = 0;
    this.stock = null;
    setSharesIsSet(false);
    this.shares = 0;
    setValueIsSet(false);
    this.value = 0.0;
    this.type = null;
  }

  public long getDate() {
    return this.date;
  }

  public SecurityLendingAndBorrowingReturning setDate(long date) {
    this.date = date;
    setDateIsSet(true);
    return this;
  }

  public void unsetDate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DATE_ISSET_ID);
  }

  /** Returns true if field date is set (has been assigned a value) and false otherwise */
  public boolean isSetDate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DATE_ISSET_ID);
  }

  public void setDateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DATE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public br.com.investtools.radar.api.EquityId getStock() {
    return this.stock;
  }

  public SecurityLendingAndBorrowingReturning setStock(@org.apache.thrift.annotation.Nullable br.com.investtools.radar.api.EquityId stock) {
    this.stock = stock;
    return this;
  }

  public void unsetStock() {
    this.stock = null;
  }

  /** Returns true if field stock is set (has been assigned a value) and false otherwise */
  public boolean isSetStock() {
    return this.stock != null;
  }

  public void setStockIsSet(boolean value) {
    if (!value) {
      this.stock = null;
    }
  }

  public int getShares() {
    return this.shares;
  }

  public SecurityLendingAndBorrowingReturning setShares(int shares) {
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

  public double getValue() {
    return this.value;
  }

  public SecurityLendingAndBorrowingReturning setValue(double value) {
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

  /**
   * 
   * @see SecurityLendingAndBorrowingType
   */
  @org.apache.thrift.annotation.Nullable
  public SecurityLendingAndBorrowingType getType() {
    return this.type;
  }

  /**
   * 
   * @see SecurityLendingAndBorrowingType
   */
  public SecurityLendingAndBorrowingReturning setType(@org.apache.thrift.annotation.Nullable SecurityLendingAndBorrowingType type) {
    this.type = type;
    return this;
  }

  public void unsetType() {
    this.type = null;
  }

  /** Returns true if field type is set (has been assigned a value) and false otherwise */
  public boolean isSetType() {
    return this.type != null;
  }

  public void setTypeIsSet(boolean value) {
    if (!value) {
      this.type = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((java.lang.Long)value);
      }
      break;

    case STOCK:
      if (value == null) {
        unsetStock();
      } else {
        setStock((br.com.investtools.radar.api.EquityId)value);
      }
      break;

    case SHARES:
      if (value == null) {
        unsetShares();
      } else {
        setShares((java.lang.Integer)value);
      }
      break;

    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((java.lang.Double)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((SecurityLendingAndBorrowingType)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DATE:
      return getDate();

    case STOCK:
      return getStock();

    case SHARES:
      return getShares();

    case VALUE:
      return getValue();

    case TYPE:
      return getType();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DATE:
      return isSetDate();
    case STOCK:
      return isSetStock();
    case SHARES:
      return isSetShares();
    case VALUE:
      return isSetValue();
    case TYPE:
      return isSetType();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SecurityLendingAndBorrowingReturning)
      return this.equals((SecurityLendingAndBorrowingReturning)that);
    return false;
  }

  public boolean equals(SecurityLendingAndBorrowingReturning that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_date = true;
    boolean that_present_date = true;
    if (this_present_date || that_present_date) {
      if (!(this_present_date && that_present_date))
        return false;
      if (this.date != that.date)
        return false;
    }

    boolean this_present_stock = true && this.isSetStock();
    boolean that_present_stock = true && that.isSetStock();
    if (this_present_stock || that_present_stock) {
      if (!(this_present_stock && that_present_stock))
        return false;
      if (!this.stock.equals(that.stock))
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

    boolean this_present_value = true;
    boolean that_present_value = true;
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (this.value != that.value)
        return false;
    }

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(date);

    hashCode = hashCode * 8191 + ((isSetStock()) ? 131071 : 524287);
    if (isSetStock())
      hashCode = hashCode * 8191 + stock.hashCode();

    hashCode = hashCode * 8191 + shares;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(value);

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    return hashCode;
  }

  @Override
  public int compareTo(SecurityLendingAndBorrowingReturning other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetDate()).compareTo(other.isSetDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.date, other.date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStock()).compareTo(other.isSetStock());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStock()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stock, other.stock);
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
    lastComparison = java.lang.Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SecurityLendingAndBorrowingReturning(");
    boolean first = true;

    sb.append("date:");
    sb.append(this.date);
    first = false;
    if (!first) sb.append(", ");
    sb.append("stock:");
    if (this.stock == null) {
      sb.append("null");
    } else {
      sb.append(this.stock);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("shares:");
    sb.append(this.shares);
    first = false;
    if (!first) sb.append(", ");
    sb.append("value:");
    sb.append(this.value);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (stock != null) {
      stock.validate();
    }
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

  private static class SecurityLendingAndBorrowingReturningStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SecurityLendingAndBorrowingReturningStandardScheme getScheme() {
      return new SecurityLendingAndBorrowingReturningStandardScheme();
    }
  }

  private static class SecurityLendingAndBorrowingReturningStandardScheme extends org.apache.thrift.scheme.StandardScheme<SecurityLendingAndBorrowingReturning> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SecurityLendingAndBorrowingReturning struct) throws org.apache.thrift.TException {
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
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.date = iprot.readI64();
              struct.setDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // STOCK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stock = new br.com.investtools.radar.api.EquityId();
              struct.stock.read(iprot);
              struct.setStockIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SHARES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.shares = iprot.readI32();
              struct.setSharesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.value = iprot.readDouble();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = br.com.investtools.radar.api.SecurityLendingAndBorrowingType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SecurityLendingAndBorrowingReturning struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DATE_FIELD_DESC);
      oprot.writeI64(struct.date);
      oprot.writeFieldEnd();
      if (struct.stock != null) {
        oprot.writeFieldBegin(STOCK_FIELD_DESC);
        struct.stock.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SHARES_FIELD_DESC);
      oprot.writeI32(struct.shares);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeDouble(struct.value);
      oprot.writeFieldEnd();
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SecurityLendingAndBorrowingReturningTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SecurityLendingAndBorrowingReturningTupleScheme getScheme() {
      return new SecurityLendingAndBorrowingReturningTupleScheme();
    }
  }

  private static class SecurityLendingAndBorrowingReturningTupleScheme extends org.apache.thrift.scheme.TupleScheme<SecurityLendingAndBorrowingReturning> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SecurityLendingAndBorrowingReturning struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDate()) {
        optionals.set(0);
      }
      if (struct.isSetStock()) {
        optionals.set(1);
      }
      if (struct.isSetShares()) {
        optionals.set(2);
      }
      if (struct.isSetValue()) {
        optionals.set(3);
      }
      if (struct.isSetType()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetDate()) {
        oprot.writeI64(struct.date);
      }
      if (struct.isSetStock()) {
        struct.stock.write(oprot);
      }
      if (struct.isSetShares()) {
        oprot.writeI32(struct.shares);
      }
      if (struct.isSetValue()) {
        oprot.writeDouble(struct.value);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SecurityLendingAndBorrowingReturning struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.date = iprot.readI64();
        struct.setDateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stock = new br.com.investtools.radar.api.EquityId();
        struct.stock.read(iprot);
        struct.setStockIsSet(true);
      }
      if (incoming.get(2)) {
        struct.shares = iprot.readI32();
        struct.setSharesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.value = iprot.readDouble();
        struct.setValueIsSet(true);
      }
      if (incoming.get(4)) {
        struct.type = br.com.investtools.radar.api.SecurityLendingAndBorrowingType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

