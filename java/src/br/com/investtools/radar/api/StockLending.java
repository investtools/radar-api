/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class StockLending implements org.apache.thrift.TBase<StockLending, StockLending._Fields>, java.io.Serializable, Cloneable, Comparable<StockLending> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StockLending");

  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField ACCOUNT_FIELD_DESC = new org.apache.thrift.protocol.TField("account", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField STOCK_FIELD_DESC = new org.apache.thrift.protocol.TField("stock", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField SHARES_FIELD_DESC = new org.apache.thrift.protocol.TField("shares", org.apache.thrift.protocol.TType.I32, (short)4);
  private static final org.apache.thrift.protocol.TField RATE_FIELD_DESC = new org.apache.thrift.protocol.TField("rate", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField DUE_FIELD_DESC = new org.apache.thrift.protocol.TField("due", org.apache.thrift.protocol.TType.I64, (short)6);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new StockLendingStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new StockLendingTupleSchemeFactory();

  public long date; // required
  public java.lang.String account; // required
  public br.com.investtools.radar.api.StockId stock; // required
  public int shares; // required
  public double rate; // required
  public long due; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATE((short)1, "date"),
    ACCOUNT((short)2, "account"),
    STOCK((short)3, "stock"),
    SHARES((short)4, "shares"),
    RATE((short)5, "rate"),
    DUE((short)6, "due");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
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
        case 2: // ACCOUNT
          return ACCOUNT;
        case 3: // STOCK
          return STOCK;
        case 4: // SHARES
          return SHARES;
        case 5: // RATE
          return RATE;
        case 6: // DUE
          return DUE;
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
    tmpMap.put(_Fields.ACCOUNT, new org.apache.thrift.meta_data.FieldMetaData("account", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.STOCK, new org.apache.thrift.meta_data.FieldMetaData("stock", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, br.com.investtools.radar.api.StockId.class)));
    tmpMap.put(_Fields.SHARES, new org.apache.thrift.meta_data.FieldMetaData("shares", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.RATE, new org.apache.thrift.meta_data.FieldMetaData("rate", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.DUE, new org.apache.thrift.meta_data.FieldMetaData("due", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Date")));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StockLending.class, metaDataMap);
  }

  public StockLending() {
  }

  public StockLending(
    long date,
    java.lang.String account,
    br.com.investtools.radar.api.StockId stock,
    int shares,
    double rate,
    long due)
  {
    this();
    this.date = date;
    setDateIsSet(true);
    this.account = account;
    this.stock = stock;
    this.shares = shares;
    setSharesIsSet(true);
    this.rate = rate;
    setRateIsSet(true);
    this.due = due;
    setDueIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StockLending(StockLending other) {
    __isset_bitfield = other.__isset_bitfield;
    this.date = other.date;
    if (other.isSetAccount()) {
      this.account = other.account;
    }
    if (other.isSetStock()) {
      this.stock = new br.com.investtools.radar.api.StockId(other.stock);
    }
    this.shares = other.shares;
    this.rate = other.rate;
    this.due = other.due;
  }

  public StockLending deepCopy() {
    return new StockLending(this);
  }

  @Override
  public void clear() {
    setDateIsSet(false);
    this.date = 0;
    this.account = null;
    this.stock = null;
    setSharesIsSet(false);
    this.shares = 0;
    setRateIsSet(false);
    this.rate = 0.0;
    setDueIsSet(false);
    this.due = 0;
  }

  public long getDate() {
    return this.date;
  }

  public StockLending setDate(long date) {
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

  public java.lang.String getAccount() {
    return this.account;
  }

  public StockLending setAccount(java.lang.String account) {
    this.account = account;
    return this;
  }

  public void unsetAccount() {
    this.account = null;
  }

  /** Returns true if field account is set (has been assigned a value) and false otherwise */
  public boolean isSetAccount() {
    return this.account != null;
  }

  public void setAccountIsSet(boolean value) {
    if (!value) {
      this.account = null;
    }
  }

  public br.com.investtools.radar.api.StockId getStock() {
    return this.stock;
  }

  public StockLending setStock(br.com.investtools.radar.api.StockId stock) {
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

  public StockLending setShares(int shares) {
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

  public StockLending setRate(double rate) {
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

  public StockLending setDue(long due) {
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

  public void setFieldValue(_Fields field, java.lang.Object value) {
    switch (field) {
    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((java.lang.Long)value);
      }
      break;

    case ACCOUNT:
      if (value == null) {
        unsetAccount();
      } else {
        setAccount((java.lang.String)value);
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

    }
  }

  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DATE:
      return getDate();

    case ACCOUNT:
      return getAccount();

    case STOCK:
      return getStock();

    case SHARES:
      return getShares();

    case RATE:
      return getRate();

    case DUE:
      return getDue();

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
    case ACCOUNT:
      return isSetAccount();
    case STOCK:
      return isSetStock();
    case SHARES:
      return isSetShares();
    case RATE:
      return isSetRate();
    case DUE:
      return isSetDue();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof StockLending)
      return this.equals((StockLending)that);
    return false;
  }

  public boolean equals(StockLending that) {
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

    boolean this_present_account = true && this.isSetAccount();
    boolean that_present_account = true && that.isSetAccount();
    if (this_present_account || that_present_account) {
      if (!(this_present_account && that_present_account))
        return false;
      if (!this.account.equals(that.account))
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

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(date);

    hashCode = hashCode * 8191 + ((isSetAccount()) ? 131071 : 524287);
    if (isSetAccount())
      hashCode = hashCode * 8191 + account.hashCode();

    hashCode = hashCode * 8191 + ((isSetStock()) ? 131071 : 524287);
    if (isSetStock())
      hashCode = hashCode * 8191 + stock.hashCode();

    hashCode = hashCode * 8191 + shares;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(rate);

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(due);

    return hashCode;
  }

  @Override
  public int compareTo(StockLending other) {
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
    lastComparison = java.lang.Boolean.valueOf(isSetAccount()).compareTo(other.isSetAccount());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccount()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.account, other.account);
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
    return 0;
  }

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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("StockLending(");
    boolean first = true;

    sb.append("date:");
    sb.append(this.date);
    first = false;
    if (!first) sb.append(", ");
    sb.append("account:");
    if (this.account == null) {
      sb.append("null");
    } else {
      sb.append(this.account);
    }
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

  private static class StockLendingStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StockLendingStandardScheme getScheme() {
      return new StockLendingStandardScheme();
    }
  }

  private static class StockLendingStandardScheme extends org.apache.thrift.scheme.StandardScheme<StockLending> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StockLending struct) throws org.apache.thrift.TException {
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
          case 2: // ACCOUNT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.account = iprot.readString();
              struct.setAccountIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STOCK
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.stock = new br.com.investtools.radar.api.StockId();
              struct.stock.read(iprot);
              struct.setStockIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // SHARES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.shares = iprot.readI32();
              struct.setSharesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // RATE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.rate = iprot.readDouble();
              struct.setRateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DUE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.due = iprot.readI64();
              struct.setDueIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StockLending struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DATE_FIELD_DESC);
      oprot.writeI64(struct.date);
      oprot.writeFieldEnd();
      if (struct.account != null) {
        oprot.writeFieldBegin(ACCOUNT_FIELD_DESC);
        oprot.writeString(struct.account);
        oprot.writeFieldEnd();
      }
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
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StockLendingTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public StockLendingTupleScheme getScheme() {
      return new StockLendingTupleScheme();
    }
  }

  private static class StockLendingTupleScheme extends org.apache.thrift.scheme.TupleScheme<StockLending> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StockLending struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDate()) {
        optionals.set(0);
      }
      if (struct.isSetAccount()) {
        optionals.set(1);
      }
      if (struct.isSetStock()) {
        optionals.set(2);
      }
      if (struct.isSetShares()) {
        optionals.set(3);
      }
      if (struct.isSetRate()) {
        optionals.set(4);
      }
      if (struct.isSetDue()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetDate()) {
        oprot.writeI64(struct.date);
      }
      if (struct.isSetAccount()) {
        oprot.writeString(struct.account);
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
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StockLending struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.date = iprot.readI64();
        struct.setDateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.account = iprot.readString();
        struct.setAccountIsSet(true);
      }
      if (incoming.get(2)) {
        struct.stock = new br.com.investtools.radar.api.StockId();
        struct.stock.read(iprot);
        struct.setStockIsSet(true);
      }
      if (incoming.get(3)) {
        struct.shares = iprot.readI32();
        struct.setSharesIsSet(true);
      }
      if (incoming.get(4)) {
        struct.rate = iprot.readDouble();
        struct.setRateIsSet(true);
      }
      if (incoming.get(5)) {
        struct.due = iprot.readI64();
        struct.setDueIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

