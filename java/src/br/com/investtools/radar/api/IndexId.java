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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-4-10")
public class IndexId implements org.apache.thrift.TBase<IndexId, IndexId._Fields>, java.io.Serializable, Cloneable, Comparable<IndexId> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("IndexId");

  private static final org.apache.thrift.protocol.TField SYMBOL_FIELD_DESC = new org.apache.thrift.protocol.TField("symbol", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new IndexIdStandardSchemeFactory());
    schemes.put(TupleScheme.class, new IndexIdTupleSchemeFactory());
  }

  public String symbol; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    SYMBOL((short)1, "symbol");

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
        case 1: // SYMBOL
          return SYMBOL;
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
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.SYMBOL, new org.apache.thrift.meta_data.FieldMetaData("symbol", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(IndexId.class, metaDataMap);
  }

  public IndexId() {
  }

  public IndexId(
    String symbol)
  {
    this();
    this.symbol = symbol;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public IndexId(IndexId other) {
    if (other.isSetSymbol()) {
      this.symbol = other.symbol;
    }
  }

  public IndexId deepCopy() {
    return new IndexId(this);
  }

  @Override
  public void clear() {
    this.symbol = null;
  }

  public String getSymbol() {
    return this.symbol;
  }

  public IndexId setSymbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

  public void unsetSymbol() {
    this.symbol = null;
  }

  /** Returns true if field symbol is set (has been assigned a value) and false otherwise */
  public boolean isSetSymbol() {
    return this.symbol != null;
  }

  public void setSymbolIsSet(boolean value) {
    if (!value) {
      this.symbol = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case SYMBOL:
      if (value == null) {
        unsetSymbol();
      } else {
        setSymbol((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case SYMBOL:
      return getSymbol();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case SYMBOL:
      return isSetSymbol();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof IndexId)
      return this.equals((IndexId)that);
    return false;
  }

  public boolean equals(IndexId that) {
    if (that == null)
      return false;

    boolean this_present_symbol = true && this.isSetSymbol();
    boolean that_present_symbol = true && that.isSetSymbol();
    if (this_present_symbol || that_present_symbol) {
      if (!(this_present_symbol && that_present_symbol))
        return false;
      if (!this.symbol.equals(that.symbol))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_symbol = true && (isSetSymbol());
    list.add(present_symbol);
    if (present_symbol)
      list.add(symbol);

    return list.hashCode();
  }

  @Override
  public int compareTo(IndexId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSymbol()).compareTo(other.isSetSymbol());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSymbol()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.symbol, other.symbol);
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
    StringBuilder sb = new StringBuilder("IndexId(");
    boolean first = true;

    sb.append("symbol:");
    if (this.symbol == null) {
      sb.append("null");
    } else {
      sb.append(this.symbol);
    }
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class IndexIdStandardSchemeFactory implements SchemeFactory {
    public IndexIdStandardScheme getScheme() {
      return new IndexIdStandardScheme();
    }
  }

  private static class IndexIdStandardScheme extends StandardScheme<IndexId> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, IndexId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // SYMBOL
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.symbol = iprot.readString();
              struct.setSymbolIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, IndexId struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.symbol != null) {
        oprot.writeFieldBegin(SYMBOL_FIELD_DESC);
        oprot.writeString(struct.symbol);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class IndexIdTupleSchemeFactory implements SchemeFactory {
    public IndexIdTupleScheme getScheme() {
      return new IndexIdTupleScheme();
    }
  }

  private static class IndexIdTupleScheme extends TupleScheme<IndexId> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, IndexId struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetSymbol()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetSymbol()) {
        oprot.writeString(struct.symbol);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, IndexId struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.symbol = iprot.readString();
        struct.setSymbolIsSet(true);
      }
    }
  }

}

