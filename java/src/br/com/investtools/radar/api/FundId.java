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
public class FundId implements org.apache.thrift.TBase<FundId, FundId._Fields>, java.io.Serializable, Cloneable, Comparable<FundId> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("FundId");

  private static final org.apache.thrift.protocol.TField CNPJ_FIELD_DESC = new org.apache.thrift.protocol.TField("cnpj", org.apache.thrift.protocol.TType.STRING, (short)1);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new FundIdStandardSchemeFactory());
    schemes.put(TupleScheme.class, new FundIdTupleSchemeFactory());
  }

  public String cnpj; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    CNPJ((short)1, "cnpj");

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
        case 1: // CNPJ
          return CNPJ;
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
    tmpMap.put(_Fields.CNPJ, new org.apache.thrift.meta_data.FieldMetaData("cnpj", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(FundId.class, metaDataMap);
  }

  public FundId() {
  }

  public FundId(
    String cnpj)
  {
    this();
    this.cnpj = cnpj;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public FundId(FundId other) {
    if (other.isSetCnpj()) {
      this.cnpj = other.cnpj;
    }
  }

  public FundId deepCopy() {
    return new FundId(this);
  }

  @Override
  public void clear() {
    this.cnpj = null;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public FundId setCnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

  public void unsetCnpj() {
    this.cnpj = null;
  }

  /** Returns true if field cnpj is set (has been assigned a value) and false otherwise */
  public boolean isSetCnpj() {
    return this.cnpj != null;
  }

  public void setCnpjIsSet(boolean value) {
    if (!value) {
      this.cnpj = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case CNPJ:
      if (value == null) {
        unsetCnpj();
      } else {
        setCnpj((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case CNPJ:
      return getCnpj();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case CNPJ:
      return isSetCnpj();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof FundId)
      return this.equals((FundId)that);
    return false;
  }

  public boolean equals(FundId that) {
    if (that == null)
      return false;

    boolean this_present_cnpj = true && this.isSetCnpj();
    boolean that_present_cnpj = true && that.isSetCnpj();
    if (this_present_cnpj || that_present_cnpj) {
      if (!(this_present_cnpj && that_present_cnpj))
        return false;
      if (!this.cnpj.equals(that.cnpj))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_cnpj = true && (isSetCnpj());
    list.add(present_cnpj);
    if (present_cnpj)
      list.add(cnpj);

    return list.hashCode();
  }

  @Override
  public int compareTo(FundId other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetCnpj()).compareTo(other.isSetCnpj());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCnpj()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cnpj, other.cnpj);
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
    StringBuilder sb = new StringBuilder("FundId(");
    boolean first = true;

    sb.append("cnpj:");
    if (this.cnpj == null) {
      sb.append("null");
    } else {
      sb.append(this.cnpj);
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

  private static class FundIdStandardSchemeFactory implements SchemeFactory {
    public FundIdStandardScheme getScheme() {
      return new FundIdStandardScheme();
    }
  }

  private static class FundIdStandardScheme extends StandardScheme<FundId> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, FundId struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // CNPJ
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.cnpj = iprot.readString();
              struct.setCnpjIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, FundId struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.cnpj != null) {
        oprot.writeFieldBegin(CNPJ_FIELD_DESC);
        oprot.writeString(struct.cnpj);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class FundIdTupleSchemeFactory implements SchemeFactory {
    public FundIdTupleScheme getScheme() {
      return new FundIdTupleScheme();
    }
  }

  private static class FundIdTupleScheme extends TupleScheme<FundId> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, FundId struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetCnpj()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetCnpj()) {
        oprot.writeString(struct.cnpj);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, FundId struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.cnpj = iprot.readString();
        struct.setCnpjIsSet(true);
      }
    }
  }

}

