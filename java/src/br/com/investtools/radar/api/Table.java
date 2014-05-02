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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-5-2")
public class Table implements org.apache.thrift.TBase<Table, Table._Fields>, java.io.Serializable, Cloneable, Comparable<Table> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Table");

  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField HEADER_FIELD_DESC = new org.apache.thrift.protocol.TField("header", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField BODY_FIELD_DESC = new org.apache.thrift.protocol.TField("body", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField FOOTER_FIELD_DESC = new org.apache.thrift.protocol.TField("footer", org.apache.thrift.protocol.TType.LIST, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TableStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TableTupleSchemeFactory());
  }

  public String title; // required
  public List<TableRow> header; // required
  public List<TableRow> body; // required
  public List<TableRow> footer; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TITLE((short)1, "title"),
    HEADER((short)2, "header"),
    BODY((short)3, "body"),
    FOOTER((short)4, "footer");

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
        case 1: // TITLE
          return TITLE;
        case 2: // HEADER
          return HEADER;
        case 3: // BODY
          return BODY;
        case 4: // FOOTER
          return FOOTER;
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
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.HEADER, new org.apache.thrift.meta_data.FieldMetaData("header", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TableRow.class))));
    tmpMap.put(_Fields.BODY, new org.apache.thrift.meta_data.FieldMetaData("body", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TableRow.class))));
    tmpMap.put(_Fields.FOOTER, new org.apache.thrift.meta_data.FieldMetaData("footer", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TableRow.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Table.class, metaDataMap);
  }

  public Table() {
  }

  public Table(
    String title,
    List<TableRow> header,
    List<TableRow> body,
    List<TableRow> footer)
  {
    this();
    this.title = title;
    this.header = header;
    this.body = body;
    this.footer = footer;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Table(Table other) {
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetHeader()) {
      List<TableRow> __this__header = new ArrayList<TableRow>(other.header.size());
      for (TableRow other_element : other.header) {
        __this__header.add(new TableRow(other_element));
      }
      this.header = __this__header;
    }
    if (other.isSetBody()) {
      List<TableRow> __this__body = new ArrayList<TableRow>(other.body.size());
      for (TableRow other_element : other.body) {
        __this__body.add(new TableRow(other_element));
      }
      this.body = __this__body;
    }
    if (other.isSetFooter()) {
      List<TableRow> __this__footer = new ArrayList<TableRow>(other.footer.size());
      for (TableRow other_element : other.footer) {
        __this__footer.add(new TableRow(other_element));
      }
      this.footer = __this__footer;
    }
  }

  public Table deepCopy() {
    return new Table(this);
  }

  @Override
  public void clear() {
    this.title = null;
    this.header = null;
    this.body = null;
    this.footer = null;
  }

  public String getTitle() {
    return this.title;
  }

  public Table setTitle(String title) {
    this.title = title;
    return this;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public int getHeaderSize() {
    return (this.header == null) ? 0 : this.header.size();
  }

  public java.util.Iterator<TableRow> getHeaderIterator() {
    return (this.header == null) ? null : this.header.iterator();
  }

  public void addToHeader(TableRow elem) {
    if (this.header == null) {
      this.header = new ArrayList<TableRow>();
    }
    this.header.add(elem);
  }

  public List<TableRow> getHeader() {
    return this.header;
  }

  public Table setHeader(List<TableRow> header) {
    this.header = header;
    return this;
  }

  public void unsetHeader() {
    this.header = null;
  }

  /** Returns true if field header is set (has been assigned a value) and false otherwise */
  public boolean isSetHeader() {
    return this.header != null;
  }

  public void setHeaderIsSet(boolean value) {
    if (!value) {
      this.header = null;
    }
  }

  public int getBodySize() {
    return (this.body == null) ? 0 : this.body.size();
  }

  public java.util.Iterator<TableRow> getBodyIterator() {
    return (this.body == null) ? null : this.body.iterator();
  }

  public void addToBody(TableRow elem) {
    if (this.body == null) {
      this.body = new ArrayList<TableRow>();
    }
    this.body.add(elem);
  }

  public List<TableRow> getBody() {
    return this.body;
  }

  public Table setBody(List<TableRow> body) {
    this.body = body;
    return this;
  }

  public void unsetBody() {
    this.body = null;
  }

  /** Returns true if field body is set (has been assigned a value) and false otherwise */
  public boolean isSetBody() {
    return this.body != null;
  }

  public void setBodyIsSet(boolean value) {
    if (!value) {
      this.body = null;
    }
  }

  public int getFooterSize() {
    return (this.footer == null) ? 0 : this.footer.size();
  }

  public java.util.Iterator<TableRow> getFooterIterator() {
    return (this.footer == null) ? null : this.footer.iterator();
  }

  public void addToFooter(TableRow elem) {
    if (this.footer == null) {
      this.footer = new ArrayList<TableRow>();
    }
    this.footer.add(elem);
  }

  public List<TableRow> getFooter() {
    return this.footer;
  }

  public Table setFooter(List<TableRow> footer) {
    this.footer = footer;
    return this;
  }

  public void unsetFooter() {
    this.footer = null;
  }

  /** Returns true if field footer is set (has been assigned a value) and false otherwise */
  public boolean isSetFooter() {
    return this.footer != null;
  }

  public void setFooterIsSet(boolean value) {
    if (!value) {
      this.footer = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case HEADER:
      if (value == null) {
        unsetHeader();
      } else {
        setHeader((List<TableRow>)value);
      }
      break;

    case BODY:
      if (value == null) {
        unsetBody();
      } else {
        setBody((List<TableRow>)value);
      }
      break;

    case FOOTER:
      if (value == null) {
        unsetFooter();
      } else {
        setFooter((List<TableRow>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TITLE:
      return getTitle();

    case HEADER:
      return getHeader();

    case BODY:
      return getBody();

    case FOOTER:
      return getFooter();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TITLE:
      return isSetTitle();
    case HEADER:
      return isSetHeader();
    case BODY:
      return isSetBody();
    case FOOTER:
      return isSetFooter();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Table)
      return this.equals((Table)that);
    return false;
  }

  public boolean equals(Table that) {
    if (that == null)
      return false;

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_header = true && this.isSetHeader();
    boolean that_present_header = true && that.isSetHeader();
    if (this_present_header || that_present_header) {
      if (!(this_present_header && that_present_header))
        return false;
      if (!this.header.equals(that.header))
        return false;
    }

    boolean this_present_body = true && this.isSetBody();
    boolean that_present_body = true && that.isSetBody();
    if (this_present_body || that_present_body) {
      if (!(this_present_body && that_present_body))
        return false;
      if (!this.body.equals(that.body))
        return false;
    }

    boolean this_present_footer = true && this.isSetFooter();
    boolean that_present_footer = true && that.isSetFooter();
    if (this_present_footer || that_present_footer) {
      if (!(this_present_footer && that_present_footer))
        return false;
      if (!this.footer.equals(that.footer))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_title = true && (isSetTitle());
    list.add(present_title);
    if (present_title)
      list.add(title);

    boolean present_header = true && (isSetHeader());
    list.add(present_header);
    if (present_header)
      list.add(header);

    boolean present_body = true && (isSetBody());
    list.add(present_body);
    if (present_body)
      list.add(body);

    boolean present_footer = true && (isSetFooter());
    list.add(present_footer);
    if (present_footer)
      list.add(footer);

    return list.hashCode();
  }

  @Override
  public int compareTo(Table other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetHeader()).compareTo(other.isSetHeader());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetHeader()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.header, other.header);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBody()).compareTo(other.isSetBody());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBody()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.body, other.body);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetFooter()).compareTo(other.isSetFooter());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetFooter()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.footer, other.footer);
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
    StringBuilder sb = new StringBuilder("Table(");
    boolean first = true;

    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("header:");
    if (this.header == null) {
      sb.append("null");
    } else {
      sb.append(this.header);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("body:");
    if (this.body == null) {
      sb.append("null");
    } else {
      sb.append(this.body);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("footer:");
    if (this.footer == null) {
      sb.append("null");
    } else {
      sb.append(this.footer);
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

  private static class TableStandardSchemeFactory implements SchemeFactory {
    public TableStandardScheme getScheme() {
      return new TableStandardScheme();
    }
  }

  private static class TableStandardScheme extends StandardScheme<Table> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Table struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // HEADER
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list56 = iprot.readListBegin();
                struct.header = new ArrayList<TableRow>(_list56.size);
                for (int _i57 = 0; _i57 < _list56.size; ++_i57)
                {
                  TableRow _elem58;
                  _elem58 = new TableRow();
                  _elem58.read(iprot);
                  struct.header.add(_elem58);
                }
                iprot.readListEnd();
              }
              struct.setHeaderIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // BODY
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list59 = iprot.readListBegin();
                struct.body = new ArrayList<TableRow>(_list59.size);
                for (int _i60 = 0; _i60 < _list59.size; ++_i60)
                {
                  TableRow _elem61;
                  _elem61 = new TableRow();
                  _elem61.read(iprot);
                  struct.body.add(_elem61);
                }
                iprot.readListEnd();
              }
              struct.setBodyIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // FOOTER
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list62 = iprot.readListBegin();
                struct.footer = new ArrayList<TableRow>(_list62.size);
                for (int _i63 = 0; _i63 < _list62.size; ++_i63)
                {
                  TableRow _elem64;
                  _elem64 = new TableRow();
                  _elem64.read(iprot);
                  struct.footer.add(_elem64);
                }
                iprot.readListEnd();
              }
              struct.setFooterIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Table struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.header != null) {
        oprot.writeFieldBegin(HEADER_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.header.size()));
          for (TableRow _iter65 : struct.header)
          {
            _iter65.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.body != null) {
        oprot.writeFieldBegin(BODY_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.body.size()));
          for (TableRow _iter66 : struct.body)
          {
            _iter66.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.footer != null) {
        oprot.writeFieldBegin(FOOTER_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.footer.size()));
          for (TableRow _iter67 : struct.footer)
          {
            _iter67.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TableTupleSchemeFactory implements SchemeFactory {
    public TableTupleScheme getScheme() {
      return new TableTupleScheme();
    }
  }

  private static class TableTupleScheme extends TupleScheme<Table> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Table struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTitle()) {
        optionals.set(0);
      }
      if (struct.isSetHeader()) {
        optionals.set(1);
      }
      if (struct.isSetBody()) {
        optionals.set(2);
      }
      if (struct.isSetFooter()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetHeader()) {
        {
          oprot.writeI32(struct.header.size());
          for (TableRow _iter68 : struct.header)
          {
            _iter68.write(oprot);
          }
        }
      }
      if (struct.isSetBody()) {
        {
          oprot.writeI32(struct.body.size());
          for (TableRow _iter69 : struct.body)
          {
            _iter69.write(oprot);
          }
        }
      }
      if (struct.isSetFooter()) {
        {
          oprot.writeI32(struct.footer.size());
          for (TableRow _iter70 : struct.footer)
          {
            _iter70.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Table struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list71 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.header = new ArrayList<TableRow>(_list71.size);
          for (int _i72 = 0; _i72 < _list71.size; ++_i72)
          {
            TableRow _elem73;
            _elem73 = new TableRow();
            _elem73.read(iprot);
            struct.header.add(_elem73);
          }
        }
        struct.setHeaderIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list74 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.body = new ArrayList<TableRow>(_list74.size);
          for (int _i75 = 0; _i75 < _list74.size; ++_i75)
          {
            TableRow _elem76;
            _elem76 = new TableRow();
            _elem76.read(iprot);
            struct.body.add(_elem76);
          }
        }
        struct.setBodyIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TList _list77 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.footer = new ArrayList<TableRow>(_list77.size);
          for (int _i78 = 0; _i78 < _list77.size; ++_i78)
          {
            TableRow _elem79;
            _elem79 = new TableRow();
            _elem79.read(iprot);
            struct.footer.add(_elem79);
          }
        }
        struct.setFooterIsSet(true);
      }
    }
  }

}

