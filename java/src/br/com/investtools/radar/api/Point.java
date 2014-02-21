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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-2-21")
public class Point implements org.apache.thrift.TBase<Point, Point._Fields>, java.io.Serializable, Cloneable, Comparable<Point> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Point");

  private static final org.apache.thrift.protocol.TField X_FIELD_DESC = new org.apache.thrift.protocol.TField("x", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField Y_FIELD_DESC = new org.apache.thrift.protocol.TField("y", org.apache.thrift.protocol.TType.DOUBLE, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PointStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PointTupleSchemeFactory());
  }

  public int x; // required
  public double y; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    X((short)1, "x"),
    Y((short)2, "y");

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
        case 1: // X
          return X;
        case 2: // Y
          return Y;
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
  private static final int __X_ISSET_ID = 0;
  private static final int __Y_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.X, new org.apache.thrift.meta_data.FieldMetaData("x", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Date")));
    tmpMap.put(_Fields.Y, new org.apache.thrift.meta_data.FieldMetaData("y", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Point.class, metaDataMap);
  }

  public Point() {
  }

  public Point(
    int x,
    double y)
  {
    this();
    this.x = x;
    setXIsSet(true);
    this.y = y;
    setYIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Point(Point other) {
    __isset_bitfield = other.__isset_bitfield;
    this.x = other.x;
    this.y = other.y;
  }

  public Point deepCopy() {
    return new Point(this);
  }

  @Override
  public void clear() {
    setXIsSet(false);
    this.x = 0;
    setYIsSet(false);
    this.y = 0.0;
  }

  public int getX() {
    return this.x;
  }

  public Point setX(int x) {
    this.x = x;
    setXIsSet(true);
    return this;
  }

  public void unsetX() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __X_ISSET_ID);
  }

  /** Returns true if field x is set (has been assigned a value) and false otherwise */
  public boolean isSetX() {
    return EncodingUtils.testBit(__isset_bitfield, __X_ISSET_ID);
  }

  public void setXIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __X_ISSET_ID, value);
  }

  public double getY() {
    return this.y;
  }

  public Point setY(double y) {
    this.y = y;
    setYIsSet(true);
    return this;
  }

  public void unsetY() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __Y_ISSET_ID);
  }

  /** Returns true if field y is set (has been assigned a value) and false otherwise */
  public boolean isSetY() {
    return EncodingUtils.testBit(__isset_bitfield, __Y_ISSET_ID);
  }

  public void setYIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __Y_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case X:
      if (value == null) {
        unsetX();
      } else {
        setX((Integer)value);
      }
      break;

    case Y:
      if (value == null) {
        unsetY();
      } else {
        setY((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case X:
      return Integer.valueOf(getX());

    case Y:
      return Double.valueOf(getY());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case X:
      return isSetX();
    case Y:
      return isSetY();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Point)
      return this.equals((Point)that);
    return false;
  }

  public boolean equals(Point that) {
    if (that == null)
      return false;

    boolean this_present_x = true;
    boolean that_present_x = true;
    if (this_present_x || that_present_x) {
      if (!(this_present_x && that_present_x))
        return false;
      if (this.x != that.x)
        return false;
    }

    boolean this_present_y = true;
    boolean that_present_y = true;
    if (this_present_y || that_present_y) {
      if (!(this_present_y && that_present_y))
        return false;
      if (this.y != that.y)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_x = true;
    list.add(present_x);
    if (present_x)
      list.add(x);

    boolean present_y = true;
    list.add(present_y);
    if (present_y)
      list.add(y);

    return list.hashCode();
  }

  @Override
  public int compareTo(Point other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetX()).compareTo(other.isSetX());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetX()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.x, other.x);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetY()).compareTo(other.isSetY());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetY()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.y, other.y);
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
    StringBuilder sb = new StringBuilder("Point(");
    boolean first = true;

    sb.append("x:");
    sb.append(this.x);
    first = false;
    if (!first) sb.append(", ");
    sb.append("y:");
    sb.append(this.y);
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PointStandardSchemeFactory implements SchemeFactory {
    public PointStandardScheme getScheme() {
      return new PointStandardScheme();
    }
  }

  private static class PointStandardScheme extends StandardScheme<Point> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Point struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // X
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.x = iprot.readI32();
              struct.setXIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // Y
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.y = iprot.readDouble();
              struct.setYIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Point struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(X_FIELD_DESC);
      oprot.writeI32(struct.x);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Y_FIELD_DESC);
      oprot.writeDouble(struct.y);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PointTupleSchemeFactory implements SchemeFactory {
    public PointTupleScheme getScheme() {
      return new PointTupleScheme();
    }
  }

  private static class PointTupleScheme extends TupleScheme<Point> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Point struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetX()) {
        optionals.set(0);
      }
      if (struct.isSetY()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetX()) {
        oprot.writeI32(struct.x);
      }
      if (struct.isSetY()) {
        oprot.writeDouble(struct.y);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Point struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.x = iprot.readI32();
        struct.setXIsSet(true);
      }
      if (incoming.get(1)) {
        struct.y = iprot.readDouble();
        struct.setYIsSet(true);
      }
    }
  }

}

