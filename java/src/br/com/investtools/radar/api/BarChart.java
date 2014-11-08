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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-11-8")
public class BarChart implements org.apache.thrift.TBase<BarChart, BarChart._Fields>, java.io.Serializable, Cloneable, Comparable<BarChart> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BarChart");

  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)1);
  private static final org.apache.thrift.protocol.TField SERIES_FIELD_DESC = new org.apache.thrift.protocol.TField("series", org.apache.thrift.protocol.TType.LIST, (short)2);
  private static final org.apache.thrift.protocol.TField CATEGORIES_FIELD_DESC = new org.apache.thrift.protocol.TField("categories", org.apache.thrift.protocol.TType.LIST, (short)3);
  private static final org.apache.thrift.protocol.TField OPTIONS_FIELD_DESC = new org.apache.thrift.protocol.TField("options", org.apache.thrift.protocol.TType.STRUCT, (short)4);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BarChartStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BarChartTupleSchemeFactory());
  }

  public String title; // required
  public List<BarSeries> series; // required
  public List<String> categories; // required
  /**
   * Criado na versão 0.2.2.
   */
  public BarChartOptions options; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TITLE((short)1, "title"),
    SERIES((short)2, "series"),
    CATEGORIES((short)3, "categories"),
    /**
     * Criado na versão 0.2.2.
     */
    OPTIONS((short)4, "options");

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
        case 2: // SERIES
          return SERIES;
        case 3: // CATEGORIES
          return CATEGORIES;
        case 4: // OPTIONS
          return OPTIONS;
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
    tmpMap.put(_Fields.SERIES, new org.apache.thrift.meta_data.FieldMetaData("series", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BarSeries.class))));
    tmpMap.put(_Fields.CATEGORIES, new org.apache.thrift.meta_data.FieldMetaData("categories", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.OPTIONS, new org.apache.thrift.meta_data.FieldMetaData("options", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BarChartOptions.class)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BarChart.class, metaDataMap);
  }

  public BarChart() {
  }

  public BarChart(
    String title,
    List<BarSeries> series,
    List<String> categories,
    BarChartOptions options)
  {
    this();
    this.title = title;
    this.series = series;
    this.categories = categories;
    this.options = options;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BarChart(BarChart other) {
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetSeries()) {
      List<BarSeries> __this__series = new ArrayList<BarSeries>(other.series.size());
      for (BarSeries other_element : other.series) {
        __this__series.add(new BarSeries(other_element));
      }
      this.series = __this__series;
    }
    if (other.isSetCategories()) {
      List<String> __this__categories = new ArrayList<String>(other.categories);
      this.categories = __this__categories;
    }
    if (other.isSetOptions()) {
      this.options = new BarChartOptions(other.options);
    }
  }

  public BarChart deepCopy() {
    return new BarChart(this);
  }

  @Override
  public void clear() {
    this.title = null;
    this.series = null;
    this.categories = null;
    this.options = null;
  }

  public String getTitle() {
    return this.title;
  }

  public BarChart setTitle(String title) {
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

  public int getSeriesSize() {
    return (this.series == null) ? 0 : this.series.size();
  }

  public java.util.Iterator<BarSeries> getSeriesIterator() {
    return (this.series == null) ? null : this.series.iterator();
  }

  public void addToSeries(BarSeries elem) {
    if (this.series == null) {
      this.series = new ArrayList<BarSeries>();
    }
    this.series.add(elem);
  }

  public List<BarSeries> getSeries() {
    return this.series;
  }

  public BarChart setSeries(List<BarSeries> series) {
    this.series = series;
    return this;
  }

  public void unsetSeries() {
    this.series = null;
  }

  /** Returns true if field series is set (has been assigned a value) and false otherwise */
  public boolean isSetSeries() {
    return this.series != null;
  }

  public void setSeriesIsSet(boolean value) {
    if (!value) {
      this.series = null;
    }
  }

  public int getCategoriesSize() {
    return (this.categories == null) ? 0 : this.categories.size();
  }

  public java.util.Iterator<String> getCategoriesIterator() {
    return (this.categories == null) ? null : this.categories.iterator();
  }

  public void addToCategories(String elem) {
    if (this.categories == null) {
      this.categories = new ArrayList<String>();
    }
    this.categories.add(elem);
  }

  public List<String> getCategories() {
    return this.categories;
  }

  public BarChart setCategories(List<String> categories) {
    this.categories = categories;
    return this;
  }

  public void unsetCategories() {
    this.categories = null;
  }

  /** Returns true if field categories is set (has been assigned a value) and false otherwise */
  public boolean isSetCategories() {
    return this.categories != null;
  }

  public void setCategoriesIsSet(boolean value) {
    if (!value) {
      this.categories = null;
    }
  }

  /**
   * Criado na versão 0.2.2.
   */
  public BarChartOptions getOptions() {
    return this.options;
  }

  /**
   * Criado na versão 0.2.2.
   */
  public BarChart setOptions(BarChartOptions options) {
    this.options = options;
    return this;
  }

  public void unsetOptions() {
    this.options = null;
  }

  /** Returns true if field options is set (has been assigned a value) and false otherwise */
  public boolean isSetOptions() {
    return this.options != null;
  }

  public void setOptionsIsSet(boolean value) {
    if (!value) {
      this.options = null;
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

    case SERIES:
      if (value == null) {
        unsetSeries();
      } else {
        setSeries((List<BarSeries>)value);
      }
      break;

    case CATEGORIES:
      if (value == null) {
        unsetCategories();
      } else {
        setCategories((List<String>)value);
      }
      break;

    case OPTIONS:
      if (value == null) {
        unsetOptions();
      } else {
        setOptions((BarChartOptions)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TITLE:
      return getTitle();

    case SERIES:
      return getSeries();

    case CATEGORIES:
      return getCategories();

    case OPTIONS:
      return getOptions();

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
    case SERIES:
      return isSetSeries();
    case CATEGORIES:
      return isSetCategories();
    case OPTIONS:
      return isSetOptions();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BarChart)
      return this.equals((BarChart)that);
    return false;
  }

  public boolean equals(BarChart that) {
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

    boolean this_present_series = true && this.isSetSeries();
    boolean that_present_series = true && that.isSetSeries();
    if (this_present_series || that_present_series) {
      if (!(this_present_series && that_present_series))
        return false;
      if (!this.series.equals(that.series))
        return false;
    }

    boolean this_present_categories = true && this.isSetCategories();
    boolean that_present_categories = true && that.isSetCategories();
    if (this_present_categories || that_present_categories) {
      if (!(this_present_categories && that_present_categories))
        return false;
      if (!this.categories.equals(that.categories))
        return false;
    }

    boolean this_present_options = true && this.isSetOptions();
    boolean that_present_options = true && that.isSetOptions();
    if (this_present_options || that_present_options) {
      if (!(this_present_options && that_present_options))
        return false;
      if (!this.options.equals(that.options))
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

    boolean present_series = true && (isSetSeries());
    list.add(present_series);
    if (present_series)
      list.add(series);

    boolean present_categories = true && (isSetCategories());
    list.add(present_categories);
    if (present_categories)
      list.add(categories);

    boolean present_options = true && (isSetOptions());
    list.add(present_options);
    if (present_options)
      list.add(options);

    return list.hashCode();
  }

  @Override
  public int compareTo(BarChart other) {
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
    lastComparison = Boolean.valueOf(isSetSeries()).compareTo(other.isSetSeries());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSeries()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.series, other.series);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCategories()).compareTo(other.isSetCategories());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCategories()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.categories, other.categories);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetOptions()).compareTo(other.isSetOptions());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOptions()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.options, other.options);
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
    StringBuilder sb = new StringBuilder("BarChart(");
    boolean first = true;

    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("series:");
    if (this.series == null) {
      sb.append("null");
    } else {
      sb.append(this.series);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("categories:");
    if (this.categories == null) {
      sb.append("null");
    } else {
      sb.append(this.categories);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("options:");
    if (this.options == null) {
      sb.append("null");
    } else {
      sb.append(this.options);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (options != null) {
      options.validate();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BarChartStandardSchemeFactory implements SchemeFactory {
    public BarChartStandardScheme getScheme() {
      return new BarChartStandardScheme();
    }
  }

  private static class BarChartStandardScheme extends StandardScheme<BarChart> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BarChart struct) throws org.apache.thrift.TException {
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
          case 2: // SERIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list32 = iprot.readListBegin();
                struct.series = new ArrayList<BarSeries>(_list32.size);
                for (int _i33 = 0; _i33 < _list32.size; ++_i33)
                {
                  BarSeries _elem34;
                  _elem34 = new BarSeries();
                  _elem34.read(iprot);
                  struct.series.add(_elem34);
                }
                iprot.readListEnd();
              }
              struct.setSeriesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CATEGORIES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list35 = iprot.readListBegin();
                struct.categories = new ArrayList<String>(_list35.size);
                for (int _i36 = 0; _i36 < _list35.size; ++_i36)
                {
                  String _elem37;
                  _elem37 = iprot.readString();
                  struct.categories.add(_elem37);
                }
                iprot.readListEnd();
              }
              struct.setCategoriesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // OPTIONS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.options = new BarChartOptions();
              struct.options.read(iprot);
              struct.setOptionsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, BarChart struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.series != null) {
        oprot.writeFieldBegin(SERIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.series.size()));
          for (BarSeries _iter38 : struct.series)
          {
            _iter38.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.categories != null) {
        oprot.writeFieldBegin(CATEGORIES_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, struct.categories.size()));
          for (String _iter39 : struct.categories)
          {
            oprot.writeString(_iter39);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.options != null) {
        oprot.writeFieldBegin(OPTIONS_FIELD_DESC);
        struct.options.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BarChartTupleSchemeFactory implements SchemeFactory {
    public BarChartTupleScheme getScheme() {
      return new BarChartTupleScheme();
    }
  }

  private static class BarChartTupleScheme extends TupleScheme<BarChart> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BarChart struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTitle()) {
        optionals.set(0);
      }
      if (struct.isSetSeries()) {
        optionals.set(1);
      }
      if (struct.isSetCategories()) {
        optionals.set(2);
      }
      if (struct.isSetOptions()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetSeries()) {
        {
          oprot.writeI32(struct.series.size());
          for (BarSeries _iter40 : struct.series)
          {
            _iter40.write(oprot);
          }
        }
      }
      if (struct.isSetCategories()) {
        {
          oprot.writeI32(struct.categories.size());
          for (String _iter41 : struct.categories)
          {
            oprot.writeString(_iter41);
          }
        }
      }
      if (struct.isSetOptions()) {
        struct.options.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BarChart struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(1)) {
        {
          org.apache.thrift.protocol.TList _list42 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.series = new ArrayList<BarSeries>(_list42.size);
          for (int _i43 = 0; _i43 < _list42.size; ++_i43)
          {
            BarSeries _elem44;
            _elem44 = new BarSeries();
            _elem44.read(iprot);
            struct.series.add(_elem44);
          }
        }
        struct.setSeriesIsSet(true);
      }
      if (incoming.get(2)) {
        {
          org.apache.thrift.protocol.TList _list45 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.categories = new ArrayList<String>(_list45.size);
          for (int _i46 = 0; _i46 < _list45.size; ++_i46)
          {
            String _elem47;
            _elem47 = iprot.readString();
            struct.categories.add(_elem47);
          }
        }
        struct.setCategoriesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.options = new BarChartOptions();
        struct.options.read(iprot);
        struct.setOptionsIsSet(true);
      }
    }
  }

}

