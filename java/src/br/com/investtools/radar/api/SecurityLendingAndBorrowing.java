/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class SecurityLendingAndBorrowing implements org.apache.thrift.TBase<SecurityLendingAndBorrowing, SecurityLendingAndBorrowing._Fields>, java.io.Serializable, Cloneable, Comparable<SecurityLendingAndBorrowing> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SecurityLendingAndBorrowing");

  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField STOCK_FIELD_DESC = new org.apache.thrift.protocol.TField("stock", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SHARES_FIELD_DESC = new org.apache.thrift.protocol.TField("shares", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField RATE_FIELD_DESC = new org.apache.thrift.protocol.TField("rate", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField DUE_FIELD_DESC = new org.apache.thrift.protocol.TField("due", org.apache.thrift.protocol.TType.I64, (short)5);
  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)6);
  private static final org.apache.thrift.protocol.TField CONTRACT_FIELD_DESC = new org.apache.thrift.protocol.TField("contract", org.apache.thrift.protocol.TType.STRING, (short)7);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new SecurityLendingAndBorrowingStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new SecurityLendingAndBorrowingTupleSchemeFactory();

  public long date; // required
  public @org.apache.thrift.annotation.Nullable br.com.investtools.radar.api.StockId stock; // required
  public int shares; // required
  public double rate; // required
  public long due; // required
  /**
   * 
   * @see SecurityLendingAndBorrowingType
   */
  public @org.apache.thrift.annotation.Nullable SecurityLendingAndBorrowingType type; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String contract; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATE((short)1, "date"),
    STOCK((short)2, "stock"),
    SHARES((short)3, "shares"),
    RATE((short)4, "rate"),
    DUE((short)5, "due"),
    /**
     * 
     * @see SecurityLendingAndBorrowingType
     */
    TYPE((short)6, "type"),
    CONTRACT((short)7, "contract");

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
        case 4: // RATE
          return RATE;
        case 5: // DUE
          return DUE;
        case 6: // TYPE
          return TYPE;
        case 7: // CONTRACT
          return CONTRACT;
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
  private static final int __RATE_ISSET_ID = 2;
  private static final int __DUE_ISSET_ID = 3;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Date")));
    tmpMap.put(_Fields.STOCK, new org.apache.thrift.meta_data.FieldMetaData("stock", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, br.com.investtools.radar.api.StockId.class)));
    tmpMap.put(_Fields.SHARES, new org.apache.thrift.meta_data.FieldMetaData("shares", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RATE, new org.apache.thrift.meta_data.FieldMetaData("rate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.DUE, new org.apache.thrift.meta_data.FieldMetaData("due", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Date")));
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, SecurityLendingAndBorrowingType.class)));
    tmpMap.put(_Fields.CONTRACT, new org.apache.thrift.meta_data.FieldMetaData("contract", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SecurityLendingAndBorrowing.class, metaDataMap);
  }

  public SecurityLendingAndBorrowing() {
  }

  public SecurityLendingAndBorrowing(
    long date,
    br.com.investtools.radar.api.StockId stock,
    int shares,
    double rate,
    long due,
    SecurityLendingAndBorrowingType type,
    java.lang.String contract)
  {
    this();
    this.date = date;
    setDateIsSet(true);
    this.stock = stock;
    this.shares = shares;
    setSharesIsSet(true);
    this.rate = rate;
    setRateIsSet(true);
    this.due = due;
    setDueIsSet(true);
    this.type = type;
    this.contract = contract;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public SecurityLendingAndBorrowing(SecurityLendingAndBorrowing other) {
    __isset_bitfield = other.__isset_bitfield;
    this.date = other.date;
    if (other.isSetStock()) {
      this.stock = new br.com.investtools.radar.api.StockId(other.stock);
    }
    this.shares = other.shares;
    this.rate = other.rate;
    this.due = other.due;
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetContract()) {
      this.contract = other.contract;
    }
  }

  public SecurityLendingAndBorrowing deepCopy() {
    return new SecurityLendingAndBorrowing(this);
  }

  @Override
  public void clear() {
    setDateIsSet(false);
    this.date = 0;
    this.stock = null;
    setSharesIsSet(false);
    this.shares = 0;
    setRateIsSet(false);
    this.rate = 0.0;
    setDueIsSet(false);
    this.due = 0;
    this.type = null;
    this.contract = null;
  }

  public long getDate() {
    return this.date;
  }

  public SecurityLendingAndBorrowing setDate(long date) {
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
  public br.com.investtools.radar.api.StockId getStock() {
    return this.stock;
  }

  public SecurityLendingAndBorrowing setStock(@org.apache.thrift.annotation.Nullable br.com.investtools.radar.api.StockId stock) {
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

  public SecurityLendingAndBorrowing setShares(int shares) {
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

  public double getRate() {
    return this.rate;
  }

  public SecurityLendingAndBorrowing setRate(double rate) {
    this.rate = rate;
    setRateIsSet(true);
    return this;
  }

  public void unsetRate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __RATE_ISSET_ID);
  }

  /** Returns true if field rate is set (has been assigned a value) and false otherwise */
  public boolean isSetRate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __RATE_ISSET_ID);
  }

  public void setRateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __RATE_ISSET_ID, value);
  }

  public long getDue() {
    return this.due;
  }

  public SecurityLendingAndBorrowing setDue(long due) {
    this.due = due;
    setDueIsSet(true);
    return this;
  }

  public void unsetDue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DUE_ISSET_ID);
  }

  /** Returns true if field due is set (has been assigned a value) and false otherwise */
  public boolean isSetDue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DUE_ISSET_ID);
  }

  public void setDueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DUE_ISSET_ID, value);
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
  public SecurityLendingAndBorrowing setType(@org.apache.thrift.annotation.Nullable SecurityLendingAndBorrowingType type) {
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

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getContract() {
    return this.contract;
  }

  public SecurityLendingAndBorrowing setContract(@org.apache.thrift.annotation.Nullable java.lang.String contract) {
    this.contract = contract;
    return this;
  }

  public void unsetContract() {
    this.contract = null;
  }

  /** Returns true if field contract is set (has been assigned a value) and false otherwise */
  public boolean isSetContract() {
    return this.contract != null;
  }

  public void setContractIsSet(boolean value) {
    if (!value) {
      this.contract = null;
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
        setStock((br.com.investtools.radar.api.StockId)value);
      }
      break;

    case SHARES:
      if (value == null) {
        unsetShares();
      } else {
        setShares((java.lang.Integer)value);
      }
      break;

    case RATE:
      if (value == null) {
        unsetRate();
      } else {
        setRate((java.lang.Double)value);
      }
      break;

    case DUE:
      if (value == null) {
        unsetDue();
      } else {
        setDue((java.lang.Long)value);
      }
      break;

    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((SecurityLendingAndBorrowingType)value);
      }
      break;

    case CONTRACT:
      if (value == null) {
        unsetContract();
      } else {
        setContract((java.lang.String)value);
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

    case RATE:
      return getRate();

    case DUE:
      return getDue();

    case TYPE:
      return getType();

    case CONTRACT:
      return getContract();

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
    case RATE:
      return isSetRate();
    case DUE:
      return isSetDue();
    case TYPE:
      return isSetType();
    case CONTRACT:
      return isSetContract();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof SecurityLendingAndBorrowing)
      return this.equals((SecurityLendingAndBorrowing)that);
    return false;
  }

  public boolean equals(SecurityLendingAndBorrowing that) {
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

    boolean this_present_rate = true;
    boolean that_present_rate = true;
    if (this_present_rate || that_present_rate) {
      if (!(this_present_rate && that_present_rate))
        return false;
      if (this.rate != that.rate)
        return false;
    }

    boolean this_present_due = true;
    boolean that_present_due = true;
    if (this_present_due || that_present_due) {
      if (!(this_present_due && that_present_due))
        return false;
      if (this.due != that.due)
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

    boolean this_present_contract = true && this.isSetContract();
    boolean that_present_contract = true && that.isSetContract();
    if (this_present_contract || that_present_contract) {
      if (!(this_present_contract && that_present_contract))
        return false;
      if (!this.contract.equals(that.contract))
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

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(rate);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(due);

    hashCode = hashCode * 8191 + ((isSetType()) ? 131071 : 524287);
    if (isSetType())
      hashCode = hashCode * 8191 + type.getValue();

    hashCode = hashCode * 8191 + ((isSetContract()) ? 131071 : 524287);
    if (isSetContract())
      hashCode = hashCode * 8191 + contract.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(SecurityLendingAndBorrowing other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetRate()).compareTo(other.isSetRate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rate, other.rate);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDue()).compareTo(other.isSetDue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.due, other.due);
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
    lastComparison = java.lang.Boolean.valueOf(isSetContract()).compareTo(other.isSetContract());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContract()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contract, other.contract);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("SecurityLendingAndBorrowing(");
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
    sb.append("rate:");
    sb.append(this.rate);
    first = false;
    if (!first) sb.append(", ");
    sb.append("due:");
    sb.append(this.due);
    first = false;
    if (!first) sb.append(", ");
    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contract:");
    if (this.contract == null) {
      sb.append("null");
    } else {
      sb.append(this.contract);
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

  private static class SecurityLendingAndBorrowingStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SecurityLendingAndBorrowingStandardScheme getScheme() {
      return new SecurityLendingAndBorrowingStandardScheme();
    }
  }

  private static class SecurityLendingAndBorrowingStandardScheme extends org.apache.thrift.scheme.StandardScheme<SecurityLendingAndBorrowing> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, SecurityLendingAndBorrowing struct) throws org.apache.thrift.TException {
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
              struct.stock = new br.com.investtools.radar.api.StockId();
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
          case 4: // RATE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.rate = iprot.readDouble();
              struct.setRateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // DUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.due = iprot.readI64();
              struct.setDueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = br.com.investtools.radar.api.SecurityLendingAndBorrowingType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // CONTRACT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.contract = iprot.readString();
              struct.setContractIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, SecurityLendingAndBorrowing struct) throws org.apache.thrift.TException {
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
      oprot.writeFieldBegin(RATE_FIELD_DESC);
      oprot.writeDouble(struct.rate);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(DUE_FIELD_DESC);
      oprot.writeI64(struct.due);
      oprot.writeFieldEnd();
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.contract != null) {
        oprot.writeFieldBegin(CONTRACT_FIELD_DESC);
        oprot.writeString(struct.contract);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class SecurityLendingAndBorrowingTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public SecurityLendingAndBorrowingTupleScheme getScheme() {
      return new SecurityLendingAndBorrowingTupleScheme();
    }
  }

  private static class SecurityLendingAndBorrowingTupleScheme extends org.apache.thrift.scheme.TupleScheme<SecurityLendingAndBorrowing> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, SecurityLendingAndBorrowing struct) throws org.apache.thrift.TException {
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
      if (struct.isSetRate()) {
        optionals.set(3);
      }
      if (struct.isSetDue()) {
        optionals.set(4);
      }
      if (struct.isSetType()) {
        optionals.set(5);
      }
      if (struct.isSetContract()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetDate()) {
        oprot.writeI64(struct.date);
      }
      if (struct.isSetStock()) {
        struct.stock.write(oprot);
      }
      if (struct.isSetShares()) {
        oprot.writeI32(struct.shares);
      }
      if (struct.isSetRate()) {
        oprot.writeDouble(struct.rate);
      }
      if (struct.isSetDue()) {
        oprot.writeI64(struct.due);
      }
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetContract()) {
        oprot.writeString(struct.contract);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, SecurityLendingAndBorrowing struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.date = iprot.readI64();
        struct.setDateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.stock = new br.com.investtools.radar.api.StockId();
        struct.stock.read(iprot);
        struct.setStockIsSet(true);
      }
      if (incoming.get(2)) {
        struct.shares = iprot.readI32();
        struct.setSharesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.rate = iprot.readDouble();
        struct.setRateIsSet(true);
      }
      if (incoming.get(4)) {
        struct.due = iprot.readI64();
        struct.setDueIsSet(true);
      }
      if (incoming.get(5)) {
        struct.type = br.com.investtools.radar.api.SecurityLendingAndBorrowingType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(6)) {
        struct.contract = iprot.readString();
        struct.setContractIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

