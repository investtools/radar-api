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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-4-6")
public class TableCellFormat implements org.apache.thrift.TBase<TableCellFormat, TableCellFormat._Fields>, java.io.Serializable, Cloneable, Comparable<TableCellFormat> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TableCellFormat");

  private static final org.apache.thrift.protocol.TField BOLD_FIELD_DESC = new org.apache.thrift.protocol.TField("bold", org.apache.thrift.protocol.TType.BOOL, (short)1);
  private static final org.apache.thrift.protocol.TField ITALIC_FIELD_DESC = new org.apache.thrift.protocol.TField("italic", org.apache.thrift.protocol.TType.BOOL, (short)2);
  private static final org.apache.thrift.protocol.TField COLOR_FIELD_DESC = new org.apache.thrift.protocol.TField("color", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField COLSPAN_FIELD_DESC = new org.apache.thrift.protocol.TField("colspan", org.apache.thrift.protocol.TType.I16, (short)4);
  private static final org.apache.thrift.protocol.TField ROWSPAN_FIELD_DESC = new org.apache.thrift.protocol.TField("rowspan", org.apache.thrift.protocol.TType.I16, (short)5);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableCellFormatStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableCellFormatTupleSchemeFactory());
  }

  public boolean bold; // required
  public boolean italic; // required
  public int color; // required
  public short colspan; // required
  public short rowspan; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BOLD((short)1, "bold"),
    ITALIC((short)2, "italic"),
    COLOR((short)3, "color"),
    COLSPAN((short)4, "colspan"),
    ROWSPAN((short)5, "rowspan");

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
        case 1: // BOLD
          return BOLD;
        case 2: // ITALIC
          return ITALIC;
        case 3: // COLOR
          return COLOR;
        case 4: // COLSPAN
          return COLSPAN;
        case 5: // ROWSPAN
          return ROWSPAN;
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
  private static final int __BOLD_ISSET_ID = 0;
  private static final int __ITALIC_ISSET_ID = 1;
  private static final int __COLOR_ISSET_ID = 2;
  private static final int __COLSPAN_ISSET_ID = 3;
  private static final int __ROWSPAN_ISSET_ID = 4;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BOLD, new org.apache.thrift.meta_data.FieldMetaData("bold", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.ITALIC, new org.apache.thrift.meta_data.FieldMetaData("italic", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    tmpMap.put(_Fields.COLOR, new org.apache.thrift.meta_data.FieldMetaData("color", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32        , "Color")));
    tmpMap.put(_Fields.COLSPAN, new org.apache.thrift.meta_data.FieldMetaData("colspan", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    tmpMap.put(_Fields.ROWSPAN, new org.apache.thrift.meta_data.FieldMetaData("rowspan", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I16)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TableCellFormat.class, metaDataMap);
  }

  public TableCellFormat() {
    this.colspan = (short)1;

    this.rowspan = (short)1;

  }

  public TableCellFormat(
    boolean bold,
    boolean italic,
    int color,
    short colspan,
    short rowspan)
  {
    this();
    this.bold = bold;
    setBoldIsSet(true);
    this.italic = italic;
    setItalicIsSet(true);
    this.color = color;
    setColorIsSet(true);
    this.colspan = colspan;
    setColspanIsSet(true);
    this.rowspan = rowspan;
    setRowspanIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TableCellFormat(TableCellFormat other) {
    __isset_bitfield = other.__isset_bitfield;
    this.bold = other.bold;
    this.italic = other.italic;
    this.color = other.color;
    this.colspan = other.colspan;
    this.rowspan = other.rowspan;
  }

  public TableCellFormat deepCopy() {
    return new TableCellFormat(this);
  }

  @Override
  public void clear() {
    setBoldIsSet(false);
    this.bold = false;
    setItalicIsSet(false);
    this.italic = false;
    setColorIsSet(false);
    this.color = 0;
    this.colspan = (short)1;

    this.rowspan = (short)1;

  }

  public boolean isBold() {
    return this.bold;
  }

  public TableCellFormat setBold(boolean bold) {
    this.bold = bold;
    setBoldIsSet(true);
    return this;
  }

  public void unsetBold() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __BOLD_ISSET_ID);
  }

  /** Returns true if field bold is set (has been assigned a value) and false otherwise */
  public boolean isSetBold() {
    return EncodingUtils.testBit(__isset_bitfield, __BOLD_ISSET_ID);
  }

  public void setBoldIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __BOLD_ISSET_ID, value);
  }

  public boolean isItalic() {
    return this.italic;
  }

  public TableCellFormat setItalic(boolean italic) {
    this.italic = italic;
    setItalicIsSet(true);
    return this;
  }

  public void unsetItalic() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ITALIC_ISSET_ID);
  }

  /** Returns true if field italic is set (has been assigned a value) and false otherwise */
  public boolean isSetItalic() {
    return EncodingUtils.testBit(__isset_bitfield, __ITALIC_ISSET_ID);
  }

  public void setItalicIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ITALIC_ISSET_ID, value);
  }

  public int getColor() {
    return this.color;
  }

  public TableCellFormat setColor(int color) {
    this.color = color;
    setColorIsSet(true);
    return this;
  }

  public void unsetColor() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COLOR_ISSET_ID);
  }

  /** Returns true if field color is set (has been assigned a value) and false otherwise */
  public boolean isSetColor() {
    return EncodingUtils.testBit(__isset_bitfield, __COLOR_ISSET_ID);
  }

  public void setColorIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COLOR_ISSET_ID, value);
  }

  public short getColspan() {
    return this.colspan;
  }

  public TableCellFormat setColspan(short colspan) {
    this.colspan = colspan;
    setColspanIsSet(true);
    return this;
  }

  public void unsetColspan() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __COLSPAN_ISSET_ID);
  }

  /** Returns true if field colspan is set (has been assigned a value) and false otherwise */
  public boolean isSetColspan() {
    return EncodingUtils.testBit(__isset_bitfield, __COLSPAN_ISSET_ID);
  }

  public void setColspanIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __COLSPAN_ISSET_ID, value);
  }

  public short getRowspan() {
    return this.rowspan;
  }

  public TableCellFormat setRowspan(short rowspan) {
    this.rowspan = rowspan;
    setRowspanIsSet(true);
    return this;
  }

  public void unsetRowspan() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ROWSPAN_ISSET_ID);
  }

  /** Returns true if field rowspan is set (has been assigned a value) and false otherwise */
  public boolean isSetRowspan() {
    return EncodingUtils.testBit(__isset_bitfield, __ROWSPAN_ISSET_ID);
  }

  public void setRowspanIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ROWSPAN_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BOLD:
      if (value == null) {
        unsetBold();
      } else {
        setBold((Boolean)value);
      }
      break;

    case ITALIC:
      if (value == null) {
        unsetItalic();
      } else {
        setItalic((Boolean)value);
      }
      break;

    case COLOR:
      if (value == null) {
        unsetColor();
      } else {
        setColor((Integer)value);
      }
      break;

    case COLSPAN:
      if (value == null) {
        unsetColspan();
      } else {
        setColspan((Short)value);
      }
      break;

    case ROWSPAN:
      if (value == null) {
        unsetRowspan();
      } else {
        setRowspan((Short)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BOLD:
      return Boolean.valueOf(isBold());

    case ITALIC:
      return Boolean.valueOf(isItalic());

    case COLOR:
      return Integer.valueOf(getColor());

    case COLSPAN:
      return Short.valueOf(getColspan());

    case ROWSPAN:
      return Short.valueOf(getRowspan());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BOLD:
      return isSetBold();
    case ITALIC:
      return isSetItalic();
    case COLOR:
      return isSetColor();
    case COLSPAN:
      return isSetColspan();
    case ROWSPAN:
      return isSetRowspan();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TableCellFormat)
      return this.equals((TableCellFormat)that);
    return false;
  }

  public boolean equals(TableCellFormat that) {
    if (that == null)
      return false;

    boolean this_present_bold = true;
    boolean that_present_bold = true;
    if (this_present_bold || that_present_bold) {
      if (!(this_present_bold && that_present_bold))
        return false;
      if (this.bold != that.bold)
        return false;
    }

    boolean this_present_italic = true;
    boolean that_present_italic = true;
    if (this_present_italic || that_present_italic) {
      if (!(this_present_italic && that_present_italic))
        return false;
      if (this.italic != that.italic)
        return false;
    }

    boolean this_present_color = true;
    boolean that_present_color = true;
    if (this_present_color || that_present_color) {
      if (!(this_present_color && that_present_color))
        return false;
      if (this.color != that.color)
        return false;
    }

    boolean this_present_colspan = true;
    boolean that_present_colspan = true;
    if (this_present_colspan || that_present_colspan) {
      if (!(this_present_colspan && that_present_colspan))
        return false;
      if (this.colspan != that.colspan)
        return false;
    }

    boolean this_present_rowspan = true;
    boolean that_present_rowspan = true;
    if (this_present_rowspan || that_present_rowspan) {
      if (!(this_present_rowspan && that_present_rowspan))
        return false;
      if (this.rowspan != that.rowspan)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_bold = true;
    list.add(present_bold);
    if (present_bold)
      list.add(bold);

    boolean present_italic = true;
    list.add(present_italic);
    if (present_italic)
      list.add(italic);

    boolean present_color = true;
    list.add(present_color);
    if (present_color)
      list.add(color);

    boolean present_colspan = true;
    list.add(present_colspan);
    if (present_colspan)
      list.add(colspan);

    boolean present_rowspan = true;
    list.add(present_rowspan);
    if (present_rowspan)
      list.add(rowspan);

    return list.hashCode();
  }

  @Override
  public int compareTo(TableCellFormat other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBold()).compareTo(other.isSetBold());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBold()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.bold, other.bold);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetItalic()).compareTo(other.isSetItalic());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetItalic()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.italic, other.italic);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColor()).compareTo(other.isSetColor());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColor()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.color, other.color);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetColspan()).compareTo(other.isSetColspan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetColspan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.colspan, other.colspan);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRowspan()).compareTo(other.isSetRowspan());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRowspan()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.rowspan, other.rowspan);
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
    StringBuilder sb = new StringBuilder("TableCellFormat(");
    boolean first = true;

    sb.append("bold:");
    sb.append(this.bold);
    first = false;
    if (!first) sb.append(", ");
    sb.append("italic:");
    sb.append(this.italic);
    first = false;
    if (!first) sb.append(", ");
    sb.append("color:");
    sb.append(this.color);
    first = false;
    if (!first) sb.append(", ");
    sb.append("colspan:");
    sb.append(this.colspan);
    first = false;
    if (!first) sb.append(", ");
    sb.append("rowspan:");
    sb.append(this.rowspan);
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

  private static class TableCellFormatStandardSchemeFactory implements SchemeFactory {
    public TableCellFormatStandardScheme getScheme() {
      return new TableCellFormatStandardScheme();
    }
  }

  private static class TableCellFormatStandardScheme extends StandardScheme<TableCellFormat> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TableCellFormat struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BOLD
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.bold = iprot.readBool();
              struct.setBoldIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ITALIC
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.italic = iprot.readBool();
              struct.setItalicIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // COLOR
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.color = iprot.readI32();
              struct.setColorIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // COLSPAN
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.colspan = iprot.readI16();
              struct.setColspanIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // ROWSPAN
            if (schemeField.type == org.apache.thrift.protocol.TType.I16) {
              struct.rowspan = iprot.readI16();
              struct.setRowspanIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TableCellFormat struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(BOLD_FIELD_DESC);
      oprot.writeBool(struct.bold);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ITALIC_FIELD_DESC);
      oprot.writeBool(struct.italic);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COLOR_FIELD_DESC);
      oprot.writeI32(struct.color);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(COLSPAN_FIELD_DESC);
      oprot.writeI16(struct.colspan);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ROWSPAN_FIELD_DESC);
      oprot.writeI16(struct.rowspan);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableCellFormatTupleSchemeFactory implements SchemeFactory {
    public TableCellFormatTupleScheme getScheme() {
      return new TableCellFormatTupleScheme();
    }
  }

  private static class TableCellFormatTupleScheme extends TupleScheme<TableCellFormat> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TableCellFormat struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBold()) {
        optionals.set(0);
      }
      if (struct.isSetItalic()) {
        optionals.set(1);
      }
      if (struct.isSetColor()) {
        optionals.set(2);
      }
      if (struct.isSetColspan()) {
        optionals.set(3);
      }
      if (struct.isSetRowspan()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetBold()) {
        oprot.writeBool(struct.bold);
      }
      if (struct.isSetItalic()) {
        oprot.writeBool(struct.italic);
      }
      if (struct.isSetColor()) {
        oprot.writeI32(struct.color);
      }
      if (struct.isSetColspan()) {
        oprot.writeI16(struct.colspan);
      }
      if (struct.isSetRowspan()) {
        oprot.writeI16(struct.rowspan);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TableCellFormat struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.bold = iprot.readBool();
        struct.setBoldIsSet(true);
      }
      if (incoming.get(1)) {
        struct.italic = iprot.readBool();
        struct.setItalicIsSet(true);
      }
      if (incoming.get(2)) {
        struct.color = iprot.readI32();
        struct.setColorIsSet(true);
      }
      if (incoming.get(3)) {
        struct.colspan = iprot.readI16();
        struct.setColspanIsSet(true);
      }
      if (incoming.get(4)) {
        struct.rowspan = iprot.readI16();
        struct.setRowspanIsSet(true);
      }
    }
  }

}

