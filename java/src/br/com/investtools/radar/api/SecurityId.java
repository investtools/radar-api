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
public class SecurityId extends org.apache.thrift.TUnion<SecurityId, SecurityId._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("SecurityId");
  private static final org.apache.thrift.protocol.TField STOCK_FIELD_DESC = new org.apache.thrift.protocol.TField("stock", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField FUND_FIELD_DESC = new org.apache.thrift.protocol.TField("fund", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField INDEX_LINKED_BOND_FIELD_DESC = new org.apache.thrift.protocol.TField("index_linked_bond", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField GOVERNMENT_BOND_FIELD_DESC = new org.apache.thrift.protocol.TField("government_bond", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STOCK((short)1, "stock"),
    FUND((short)2, "fund"),
    INDEX_LINKED_BOND((short)3, "index_linked_bond"),
    GOVERNMENT_BOND((short)4, "government_bond");

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
        case 1: // STOCK
          return STOCK;
        case 2: // FUND
          return FUND;
        case 3: // INDEX_LINKED_BOND
          return INDEX_LINKED_BOND;
        case 4: // GOVERNMENT_BOND
          return GOVERNMENT_BOND;
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
    tmpMap.put(_Fields.STOCK, new org.apache.thrift.meta_data.FieldMetaData("stock", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StockId.class)));
    tmpMap.put(_Fields.FUND, new org.apache.thrift.meta_data.FieldMetaData("fund", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, FundId.class)));
    tmpMap.put(_Fields.INDEX_LINKED_BOND, new org.apache.thrift.meta_data.FieldMetaData("index_linked_bond", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, IndexLinkedBondId.class)));
    tmpMap.put(_Fields.GOVERNMENT_BOND, new org.apache.thrift.meta_data.FieldMetaData("government_bond", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, GovernmentBondId.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(SecurityId.class, metaDataMap);
  }

  public SecurityId() {
    super();
  }

  public SecurityId(_Fields setField, Object value) {
    super(setField, value);
  }

  public SecurityId(SecurityId other) {
    super(other);
  }
  public SecurityId deepCopy() {
    return new SecurityId(this);
  }

  public static SecurityId stock(StockId value) {
    SecurityId x = new SecurityId();
    x.setStock(value);
    return x;
  }

  public static SecurityId fund(FundId value) {
    SecurityId x = new SecurityId();
    x.setFund(value);
    return x;
  }

  public static SecurityId index_linked_bond(IndexLinkedBondId value) {
    SecurityId x = new SecurityId();
    x.setIndex_linked_bond(value);
    return x;
  }

  public static SecurityId government_bond(GovernmentBondId value) {
    SecurityId x = new SecurityId();
    x.setGovernment_bond(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, Object value) throws ClassCastException {
    switch (setField) {
      case STOCK:
        if (value instanceof StockId) {
          break;
        }
        throw new ClassCastException("Was expecting value of type StockId for field 'stock', but got " + value.getClass().getSimpleName());
      case FUND:
        if (value instanceof FundId) {
          break;
        }
        throw new ClassCastException("Was expecting value of type FundId for field 'fund', but got " + value.getClass().getSimpleName());
      case INDEX_LINKED_BOND:
        if (value instanceof IndexLinkedBondId) {
          break;
        }
        throw new ClassCastException("Was expecting value of type IndexLinkedBondId for field 'index_linked_bond', but got " + value.getClass().getSimpleName());
      case GOVERNMENT_BOND:
        if (value instanceof GovernmentBondId) {
          break;
        }
        throw new ClassCastException("Was expecting value of type GovernmentBondId for field 'government_bond', but got " + value.getClass().getSimpleName());
      default:
        throw new IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case STOCK:
          if (field.type == STOCK_FIELD_DESC.type) {
            StockId stock;
            stock = new StockId();
            stock.read(iprot);
            return stock;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case FUND:
          if (field.type == FUND_FIELD_DESC.type) {
            FundId fund;
            fund = new FundId();
            fund.read(iprot);
            return fund;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case INDEX_LINKED_BOND:
          if (field.type == INDEX_LINKED_BOND_FIELD_DESC.type) {
            IndexLinkedBondId index_linked_bond;
            index_linked_bond = new IndexLinkedBondId();
            index_linked_bond.read(iprot);
            return index_linked_bond;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case GOVERNMENT_BOND:
          if (field.type == GOVERNMENT_BOND_FIELD_DESC.type) {
            GovernmentBondId government_bond;
            government_bond = new GovernmentBondId();
            government_bond.read(iprot);
            return government_bond;
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
      case STOCK:
        StockId stock = (StockId)value_;
        stock.write(oprot);
        return;
      case FUND:
        FundId fund = (FundId)value_;
        fund.write(oprot);
        return;
      case INDEX_LINKED_BOND:
        IndexLinkedBondId index_linked_bond = (IndexLinkedBondId)value_;
        index_linked_bond.write(oprot);
        return;
      case GOVERNMENT_BOND:
        GovernmentBondId government_bond = (GovernmentBondId)value_;
        government_bond.write(oprot);
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
        case STOCK:
          StockId stock;
          stock = new StockId();
          stock.read(iprot);
          return stock;
        case FUND:
          FundId fund;
          fund = new FundId();
          fund.read(iprot);
          return fund;
        case INDEX_LINKED_BOND:
          IndexLinkedBondId index_linked_bond;
          index_linked_bond = new IndexLinkedBondId();
          index_linked_bond.read(iprot);
          return index_linked_bond;
        case GOVERNMENT_BOND:
          GovernmentBondId government_bond;
          government_bond = new GovernmentBondId();
          government_bond.read(iprot);
          return government_bond;
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
      case STOCK:
        StockId stock = (StockId)value_;
        stock.write(oprot);
        return;
      case FUND:
        FundId fund = (FundId)value_;
        fund.write(oprot);
        return;
      case INDEX_LINKED_BOND:
        IndexLinkedBondId index_linked_bond = (IndexLinkedBondId)value_;
        index_linked_bond.write(oprot);
        return;
      case GOVERNMENT_BOND:
        GovernmentBondId government_bond = (GovernmentBondId)value_;
        government_bond.write(oprot);
        return;
      default:
        throw new IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case STOCK:
        return STOCK_FIELD_DESC;
      case FUND:
        return FUND_FIELD_DESC;
      case INDEX_LINKED_BOND:
        return INDEX_LINKED_BOND_FIELD_DESC;
      case GOVERNMENT_BOND:
        return GOVERNMENT_BOND_FIELD_DESC;
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


  public StockId getStock() {
    if (getSetField() == _Fields.STOCK) {
      return (StockId)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'stock' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStock(StockId value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.STOCK;
    value_ = value;
  }

  public FundId getFund() {
    if (getSetField() == _Fields.FUND) {
      return (FundId)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'fund' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setFund(FundId value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.FUND;
    value_ = value;
  }

  public IndexLinkedBondId getIndex_linked_bond() {
    if (getSetField() == _Fields.INDEX_LINKED_BOND) {
      return (IndexLinkedBondId)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'index_linked_bond' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setIndex_linked_bond(IndexLinkedBondId value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.INDEX_LINKED_BOND;
    value_ = value;
  }

  public GovernmentBondId getGovernment_bond() {
    if (getSetField() == _Fields.GOVERNMENT_BOND) {
      return (GovernmentBondId)getFieldValue();
    } else {
      throw new RuntimeException("Cannot get field 'government_bond' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setGovernment_bond(GovernmentBondId value) {
    if (value == null) throw new NullPointerException();
    setField_ = _Fields.GOVERNMENT_BOND;
    value_ = value;
  }

  public boolean isSetStock() {
    return setField_ == _Fields.STOCK;
  }


  public boolean isSetFund() {
    return setField_ == _Fields.FUND;
  }


  public boolean isSetIndex_linked_bond() {
    return setField_ == _Fields.INDEX_LINKED_BOND;
  }


  public boolean isSetGovernment_bond() {
    return setField_ == _Fields.GOVERNMENT_BOND;
  }


  public boolean equals(Object other) {
    if (other instanceof SecurityId) {
      return equals((SecurityId)other);
    } else {
      return false;
    }
  }

  public boolean equals(SecurityId other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(SecurityId other) {
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
