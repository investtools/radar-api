/**
 * Autogenerated by Thrift Compiler (0.9.3)
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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
public class StockSellTransaction implements org.apache.thrift.TBase<StockSellTransaction, StockSellTransaction._Fields>, java.io.Serializable, Cloneable, Comparable<StockSellTransaction> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("StockSellTransaction");

  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField STOCK_FIELD_DESC = new org.apache.thrift.protocol.TField("stock", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SHARES_FIELD_DESC = new org.apache.thrift.protocol.TField("shares", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField PRICE_FIELD_DESC = new org.apache.thrift.protocol.TField("price", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new StockSellTransactionStandardSchemeFactory());
    schemes.put(TupleScheme.class, new StockSellTransactionTupleSchemeFactory());
  }

  public long date; // required
  public br.com.investtools.radar.api.StockId stock; // required
  public int shares; // required
  public double price; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATE((short)1, "date"),
    STOCK((short)2, "stock"),
    SHARES((short)3, "shares"),
    PRICE((short)4, "price");

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
        case 2: // STOCK
          return STOCK;
        case 3: // SHARES
          return SHARES;
        case 4: // PRICE
          return PRICE;
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
  private static final int __SHARES_ISSET_ID = 1;
  private static final int __PRICE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Date")));
    tmpMap.put(_Fields.STOCK, new org.apache.thrift.meta_data.FieldMetaData("stock", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, br.com.investtools.radar.api.StockId.class)));
    tmpMap.put(_Fields.SHARES, new org.apache.thrift.meta_data.FieldMetaData("shares", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.PRICE, new org.apache.thrift.meta_data.FieldMetaData("price", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(StockSellTransaction.class, metaDataMap);
  }

  public StockSellTransaction() {
  }

  public StockSellTransaction(
    long date,
    br.com.investtools.radar.api.StockId stock,
    int shares,
    double price)
  {
    this();
    this.date = date;
    setDateIsSet(true);
    this.stock = stock;
    this.shares = shares;
    setSharesIsSet(true);
    this.price = price;
    setPriceIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public StockSellTransaction(StockSellTransaction other) {
    __isset_bitfield = other.__isset_bitfield;
    this.date = other.date;
    if (other.isSetStock()) {
      this.stock = new br.com.investtools.radar.api.StockId(other.stock);
    }
    this.shares = other.shares;
    this.price = other.price;
  }

  public StockSellTransaction deepCopy() {
    return new StockSellTransaction(this);
  }

  @Override
  public void clear() {
    setDateIsSet(false);
    this.date = 0;
    this.stock = null;
    setSharesIsSet(false);
    this.shares = 0;
    setPriceIsSet(false);
    this.price = 0.0;
  }

  public long getDate() {
    return this.date;
  }

  public StockSellTransaction setDate(long date) {
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

  public br.com.investtools.radar.api.StockId getStock() {
    return this.stock;
  }

  public StockSellTransaction setStock(br.com.investtools.radar.api.StockId stock) {
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

  public StockSellTransaction setShares(int shares) {
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

  public double getPrice() {
    return this.price;
  }

  public StockSellTransaction setPrice(double price) {
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

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((Long)value);
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
        setShares((Integer)value);
      }
      break;

    case PRICE:
      if (value == null) {
        unsetPrice();
      } else {
        setPrice((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case DATE:
      return getDate();

    case STOCK:
      return getStock();

    case SHARES:
      return getShares();

    case PRICE:
      return getPrice();

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
    case STOCK:
      return isSetStock();
    case SHARES:
      return isSetShares();
    case PRICE:
      return isSetPrice();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof StockSellTransaction)
      return this.equals((StockSellTransaction)that);
    return false;
  }

  public boolean equals(StockSellTransaction that) {
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

    boolean this_present_price = true;
    boolean that_present_price = true;
    if (this_present_price || that_present_price) {
      if (!(this_present_price && that_present_price))
        return false;
      if (this.price != that.price)
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

    boolean present_stock = true && (isSetStock());
    list.add(present_stock);
    if (present_stock)
      list.add(stock);

    boolean present_shares = true;
    list.add(present_shares);
    if (present_shares)
      list.add(shares);

    boolean present_price = true;
    list.add(present_price);
    if (present_price)
      list.add(price);

    return list.hashCode();
  }

  @Override
  public int compareTo(StockSellTransaction other) {
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
    lastComparison = Boolean.valueOf(isSetStock()).compareTo(other.isSetStock());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStock()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.stock, other.stock);
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
    StringBuilder sb = new StringBuilder("StockSellTransaction(");
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
    sb.append("price:");
    sb.append(this.price);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class StockSellTransactionStandardSchemeFactory implements SchemeFactory {
    public StockSellTransactionStandardScheme getScheme() {
      return new StockSellTransactionStandardScheme();
    }
  }

  private static class StockSellTransactionStandardScheme extends StandardScheme<StockSellTransaction> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, StockSellTransaction struct) throws org.apache.thrift.TException {
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
          case 4: // PRICE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.price = iprot.readDouble();
              struct.setPriceIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, StockSellTransaction struct) throws org.apache.thrift.TException {
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
      oprot.writeFieldBegin(PRICE_FIELD_DESC);
      oprot.writeDouble(struct.price);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class StockSellTransactionTupleSchemeFactory implements SchemeFactory {
    public StockSellTransactionTupleScheme getScheme() {
      return new StockSellTransactionTupleScheme();
    }
  }

  private static class StockSellTransactionTupleScheme extends TupleScheme<StockSellTransaction> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, StockSellTransaction struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetDate()) {
        optionals.set(0);
      }
      if (struct.isSetStock()) {
        optionals.set(1);
      }
      if (struct.isSetShares()) {
        optionals.set(2);
      }
      if (struct.isSetPrice()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetDate()) {
        oprot.writeI64(struct.date);
      }
      if (struct.isSetStock()) {
        struct.stock.write(oprot);
      }
      if (struct.isSetShares()) {
        oprot.writeI32(struct.shares);
      }
      if (struct.isSetPrice()) {
        oprot.writeDouble(struct.price);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, StockSellTransaction struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
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
        struct.price = iprot.readDouble();
        struct.setPriceIsSet(true);
      }
    }
  }

}

