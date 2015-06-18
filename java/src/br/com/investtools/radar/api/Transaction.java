/**
 * Autogenerated by Thrift Compiler (0.9.2)
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
public class Transaction extends org.apache.thrift.TUnion<Transaction, Transaction._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Transaction");
  private static final org.apache.thrift.protocol.TField STOCK_BUY_FIELD_DESC = new org.apache.thrift.protocol.TField("stock_buy", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STOCK_SELL_FIELD_DESC = new org.apache.thrift.protocol.TField("stock_sell", org.apache.thrift.protocol.TType.STRUCT, (short)2);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STOCK_BUY((short)1, "stock_buy"),
    STOCK_SELL((short)2, "stock_sell");

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
        case 1: // STOCK_BUY
          return STOCK_BUY;
        case 2: // STOCK_SELL
          return STOCK_SELL;
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

  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STOCK_BUY, new org.apache.thrift.meta_data.FieldMetaData("stock_buy", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "StockBuyTransaction")));
    tmpMap.put(_Fields.STOCK_SELL, new org.apache.thrift.meta_data.FieldMetaData("stock_sell", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRUCT        , "StockSellTransaction")));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Transaction.class, metaDataMap);
  }

  public Transaction() {
    super();
  }

  public Transaction(_Fields setField, Object value) {
    super(setField, value);
  }

  public Transaction(Transaction other) {
    super(other);
  }
  public Transaction deepCopy() {
    return new Transaction(this);
  }

  public static Transaction stock_buy(StockBuyTransaction value) {
    Transaction x = new Transaction();
    x.setStock_buy(value);
    return x;
  }

  public static Transaction stock_sell(StockSellTransaction value) {
    Transaction x = new Transaction();
    x.setStock_sell(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case STOCK_BUY:
        if (value instanceof StockBuyTransaction) {
          break;
        }
        throw new ClassCastException("Was expecting value of type StockBuyTransaction for field 'stock_buy', but got " + value.getClass().getSimpleName());
      case STOCK_SELL:
        if (value instanceof StockSellTransaction) {
          break;
        }
        throw new ClassCastException("Was expecting value of type StockSellTransaction for field 'stock_sell', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case STOCK_BUY:
          if (field.type == STOCK_BUY_FIELD_DESC.type) {
            StockBuyTransaction stock_buy;
            stock_buy = new StockBuyTransaction();
            stock_buy.read(iprot);
            return stock_buy;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STOCK_SELL:
          if (field.type == STOCK_SELL_FIELD_DESC.type) {
            StockSellTransaction stock_sell;
            stock_sell = new StockSellTransaction();
            stock_sell.read(iprot);
            return stock_sell;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case STOCK_BUY:
        StockBuyTransaction stock_buy = (StockBuyTransaction)value_;
        stock_buy.write(oprot);
        return;
      case STOCK_SELL:
        StockSellTransaction stock_sell = (StockSellTransaction)value_;
        stock_sell.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case STOCK_BUY:
          StockBuyTransaction stock_buy;
          stock_buy = new StockBuyTransaction();
          stock_buy.read(iprot);
          return stock_buy;
        case STOCK_SELL:
          StockSellTransaction stock_sell;
          stock_sell = new StockSellTransaction();
          stock_sell.read(iprot);
          return stock_sell;
        default:
          throw new IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case STOCK_BUY:
        StockBuyTransaction stock_buy = (StockBuyTransaction)value_;
        stock_buy.write(oprot);
        return;
      case STOCK_SELL:
        StockSellTransaction stock_sell = (StockSellTransaction)value_;
        stock_sell.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case STOCK_BUY:
        return STOCK_BUY_FIELD_DESC;
      case STOCK_SELL:
        return STOCK_SELL_FIELD_DESC;
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public StockBuyTransaction getStock_buy() {
    if (getSetField() == _Fields.STOCK_BUY) {
      return (StockBuyTransaction)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'stock_buy' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStock_buy(StockBuyTransaction value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STOCK_BUY;
    value_ = value;
  }

  public StockSellTransaction getStock_sell() {
    if (getSetField() == _Fields.STOCK_SELL) {
      return (StockSellTransaction)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'stock_sell' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStock_sell(StockSellTransaction value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STOCK_SELL;
    value_ = value;
  }

  public boolean isSetStock_buy() {
    return setField_ == _Fields.STOCK_BUY;
  }


  public boolean isSetStock_sell() {
    return setField_ == _Fields.STOCK_SELL;
  }


  public boolean equals(Object other) {
    if (other instanceof Transaction) {
      return equals((Transaction)other);
    } else {
      return false;
    }
  }

  public boolean equals(Transaction other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(Transaction other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
