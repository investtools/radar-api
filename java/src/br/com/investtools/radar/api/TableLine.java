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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-2-11")
public class TableLine implements org.apache.thrift.TBase<TableLine, TableLine._Fields>, java.io.Serializable, Cloneable, Comparable<TableLine> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TableLine");

  private static final org.apache.thrift.protocol.TField TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField CELLS_FIELD_DESC = new org.apache.thrift.protocol.TField("cells", org.apache.thrift.protocol.TType.LIST, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableLineStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableLineTupleSchemeFactory());
  }

  /**
   * 
   * @see TableLineType
   */
  public TableLineType type; // required
  public List<String> cells; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see TableLineType
     */
    TYPE((short)1, "type"),
    CELLS((short)2, "cells");

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
        case 1: // TYPE
          return TYPE;
        case 2: // CELLS
          return CELLS;
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
    tmpMap.put(_Fields.TYPE, new org.apache.thrift.meta_data.FieldMetaData("type", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, TableLineType.class)));
    tmpMap.put(_Fields.CELLS, new org.apache.thrift.meta_data.FieldMetaData("cells", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TableLine.class, metaDataMap);
  }

  public TableLine() {
    this.type = br.com.investtools.radar.api.TableLineType.HEADER;

  }

  public TableLine(
    TableLineType type,
    List<String> cells)
  {
    this();
    this.type = type;
    this.cells = cells;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableLine(TableLine other) {
    if (other.isSetType()) {
      this.type = other.type;
    }
    if (other.isSetCells()) {
      List<String> __this__cells = new ArrayList<String>(other.cells);
      this.cells = __this__cells;
    }
  }

  public TableLine deepCopy() {
    return new TableLine(this);
  }

  @Override
  public void clear() {
    this.type = br.com.investtools.radar.api.TableLineType.HEADER;

    this.cells = null;
  }

  /**
   * 
   * @see TableLineType
   */
  public TableLineType getType() {
    return this.type;
  }

  /**
   * 
   * @see TableLineType
   */
  public TableLine setType(TableLineType type) {
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

  public int getCellsSize() {
    return (this.cells == null) ? 0 : this.cells.size();
  }

  public java.util.Iterator<String> getCellsIterator() {
    return (this.cells == null) ? null : this.cells.iterator();
  }

  public void addToCells(String elem) {
    if (this.cells == null) {
      this.cells = new ArrayList<String>();
    }
    this.cells.add(elem);
  }

  public List<String> getCells() {
    return this.cells;
  }

  public TableLine setCells(List<String> cells) {
    this.cells = cells;
    return this;
  }

  public void unsetCells() {
    this.cells = null;
  }

  /** Returns true if field cells is set (has been assigned a value) and false otherwise */
  public boolean isSetCells() {
    return this.cells != null;
  }

  public void setCellsIsSet(boolean value) {
    if (!value) {
      this.cells = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TYPE:
      if (value == null) {
        unsetType();
      } else {
        setType((TableLineType)value);
      }
      break;

    case CELLS:
      if (value == null) {
        unsetCells();
      } else {
        setCells((List<String>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TYPE:
      return getType();

    case CELLS:
      return getCells();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TYPE:
      return isSetType();
    case CELLS:
      return isSetCells();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableLine)
      return this.equals((TableLine)that);
    return false;
  }

  public boolean equals(TableLine that) {
    if (that == null)
      return false;

    boolean this_present_type = true && this.isSetType();
    boolean that_present_type = true && that.isSetType();
    if (this_present_type || that_present_type) {
      if (!(this_present_type && that_present_type))
        return false;
      if (!this.type.equals(that.type))
        return false;
    }

    boolean this_present_cells = true && this.isSetCells();
    boolean that_present_cells = true && that.isSetCells();
    if (this_present_cells || that_present_cells) {
      if (!(this_present_cells && that_present_cells))
        return false;
      if (!this.cells.equals(that.cells))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_type = true && (isSetType());
    list.add(present_type);
    if (present_type)
      list.add(type.getValue());

    boolean present_cells = true && (isSetCells());
    list.add(present_cells);
    if (present_cells)
      list.add(cells);

    return list.hashCode();
  }

  @Override
  public int compareTo(TableLine other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetType()).compareTo(other.isSetType());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetType()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.type, other.type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCells()).compareTo(other.isSetCells());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCells()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.cells, other.cells);
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
    StringBuilder sb = new StringBuilder("TableLine(");
    boolean first = true;

    sb.append("type:");
    if (this.type == null) {
      sb.append("null");
    } else {
      sb.append(this.type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("cells:");
    if (this.cells == null) {
      sb.append("null");
    } else {
      sb.append(this.cells);
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

  private static class TableLineStandardSchemeFactory implements SchemeFactory {
    public TableLineStandardScheme getScheme() {
      return new TableLineStandardScheme();
    }
  }

  private static class TableLineStandardScheme extends StandardScheme<TableLine> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TableLine struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.type = TableLineType.findByValue(iprot.readI32());
              struct.setTypeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // CELLS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list40 = iprot.readListBegin();
                struct.cells = new ArrayList<String>(_list40.size);
                for (int _i41 = 0; _i41 < _list40.size; ++_i41)
                {
                  String _elem42;
                  _elem42 = iprot.readString();
                  struct.cells.add(_elem42);
                }
                iprot.readListEnd();
              }
              struct.setCellsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TableLine struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.type != null) {
        oprot.writeFieldBegin(TYPE_FIELD_DESC);
        oprot.writeI32(struct.type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.cells != null) {
        oprot.writeFieldBegin(CELLS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.cells.size()));
          for (String _iter43 : struct.cells)
          {
            oprot.writeString(_iter43);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableLineTupleSchemeFactory implements SchemeFactory {
    public TableLineTupleScheme getScheme() {
      return new TableLineTupleScheme();
    }
  }

  private static class TableLineTupleScheme extends TupleScheme<TableLine> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TableLine struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetType()) {
        optionals.set(0);
      }
      if (struct.isSetCells()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetType()) {
        oprot.writeI32(struct.type.getValue());
      }
      if (struct.isSetCells()) {
        {
          oprot.writeI32(struct.cells.size());
          for (String _iter44 : struct.cells)
          {
            oprot.writeString(_iter44);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TableLine struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        struct.type = TableLineType.findByValue(iprot.readI32());
        struct.setTypeIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.cells = new ArrayList<String>(_list45.size);
          for (int _i46 = 0; _i46 < _list45.size; ++_i46)
          {
            String _elem47;
            _elem47 = iprot.readString();
            struct.cells.add(_elem47);
          }
        }
        struct.setCellsIsSet(true);
      }
    }
  }

}

