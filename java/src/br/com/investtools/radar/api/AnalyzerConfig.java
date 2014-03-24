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
@Generated(value = "Autogenerated by Thrift Compiler (1.0.0-dev)", date = "2014-3-24")
public class AnalyzerConfig implements org.apache.thrift.TBase<AnalyzerConfig, AnalyzerConfig._Fields>, java.io.Serializable, Cloneable, Comparable<AnalyzerConfig> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("AnalyzerConfig");

  private static final org.apache.thrift.protocol.TField RESULT_TYPE_FIELD_DESC = new org.apache.thrift.protocol.TField("result_type", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField ACCEPTED_EVENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("accepted_events", org.apache.thrift.protocol.TType.SET, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new AnalyzerConfigStandardSchemeFactory());
    schemes.put(TupleScheme.class, new AnalyzerConfigTupleSchemeFactory());
  }

  /**
   * 
   * @see ResultType
   */
  public ResultType result_type; // required
  public Set<Event> accepted_events; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    /**
     * 
     * @see ResultType
     */
    RESULT_TYPE((short)1, "result_type"),
    ACCEPTED_EVENTS((short)2, "accepted_events");

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
        case 1: // RESULT_TYPE
          return RESULT_TYPE;
        case 2: // ACCEPTED_EVENTS
          return ACCEPTED_EVENTS;
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
    tmpMap.put(_Fields.RESULT_TYPE, new org.apache.thrift.meta_data.FieldMetaData("result_type", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ResultType.class)));
    tmpMap.put(_Fields.ACCEPTED_EVENTS, new org.apache.thrift.meta_data.FieldMetaData("accepted_events", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.SetMetaData(org.apache.thrift.protocol.TType.SET, 
            new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, Event.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(AnalyzerConfig.class, metaDataMap);
  }

  public AnalyzerConfig() {
  }

  public AnalyzerConfig(
    ResultType result_type,
    Set<Event> accepted_events)
  {
    this();
    this.result_type = result_type;
    this.accepted_events = accepted_events;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public AnalyzerConfig(AnalyzerConfig other) {
    if (other.isSetResult_type()) {
      this.result_type = other.result_type;
    }
    if (other.isSetAccepted_events()) {
      Set<Event> __this__accepted_events = new HashSet<Event>(other.accepted_events.size());
      for (Event other_element : other.accepted_events) {
        __this__accepted_events.add(other_element);
      }
      this.accepted_events = __this__accepted_events;
    }
  }

  public AnalyzerConfig deepCopy() {
    return new AnalyzerConfig(this);
  }

  @Override
  public void clear() {
    this.result_type = null;
    this.accepted_events = null;
  }

  /**
   * 
   * @see ResultType
   */
  public ResultType getResult_type() {
    return this.result_type;
  }

  /**
   * 
   * @see ResultType
   */
  public AnalyzerConfig setResult_type(ResultType result_type) {
    this.result_type = result_type;
    return this;
  }

  public void unsetResult_type() {
    this.result_type = null;
  }

  /** Returns true if field result_type is set (has been assigned a value) and false otherwise */
  public boolean isSetResult_type() {
    return this.result_type != null;
  }

  public void setResult_typeIsSet(boolean value) {
    if (!value) {
      this.result_type = null;
    }
  }

  public int getAccepted_eventsSize() {
    return (this.accepted_events == null) ? 0 : this.accepted_events.size();
  }

  public java.util.Iterator<Event> getAccepted_eventsIterator() {
    return (this.accepted_events == null) ? null : this.accepted_events.iterator();
  }

  public void addToAccepted_events(Event elem) {
    if (this.accepted_events == null) {
      this.accepted_events = new HashSet<Event>();
    }
    this.accepted_events.add(elem);
  }

  public Set<Event> getAccepted_events() {
    return this.accepted_events;
  }

  public AnalyzerConfig setAccepted_events(Set<Event> accepted_events) {
    this.accepted_events = accepted_events;
    return this;
  }

  public void unsetAccepted_events() {
    this.accepted_events = null;
  }

  /** Returns true if field accepted_events is set (has been assigned a value) and false otherwise */
  public boolean isSetAccepted_events() {
    return this.accepted_events != null;
  }

  public void setAccepted_eventsIsSet(boolean value) {
    if (!value) {
      this.accepted_events = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case RESULT_TYPE:
      if (value == null) {
        unsetResult_type();
      } else {
        setResult_type((ResultType)value);
      }
      break;

    case ACCEPTED_EVENTS:
      if (value == null) {
        unsetAccepted_events();
      } else {
        setAccepted_events((Set<Event>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case RESULT_TYPE:
      return getResult_type();

    case ACCEPTED_EVENTS:
      return getAccepted_events();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case RESULT_TYPE:
      return isSetResult_type();
    case ACCEPTED_EVENTS:
      return isSetAccepted_events();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof AnalyzerConfig)
      return this.equals((AnalyzerConfig)that);
    return false;
  }

  public boolean equals(AnalyzerConfig that) {
    if (that == null)
      return false;

    boolean this_present_result_type = true && this.isSetResult_type();
    boolean that_present_result_type = true && that.isSetResult_type();
    if (this_present_result_type || that_present_result_type) {
      if (!(this_present_result_type && that_present_result_type))
        return false;
      if (!this.result_type.equals(that.result_type))
        return false;
    }

    boolean this_present_accepted_events = true && this.isSetAccepted_events();
    boolean that_present_accepted_events = true && that.isSetAccepted_events();
    if (this_present_accepted_events || that_present_accepted_events) {
      if (!(this_present_accepted_events && that_present_accepted_events))
        return false;
      if (!this.accepted_events.equals(that.accepted_events))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_result_type = true && (isSetResult_type());
    list.add(present_result_type);
    if (present_result_type)
      list.add(result_type.getValue());

    boolean present_accepted_events = true && (isSetAccepted_events());
    list.add(present_accepted_events);
    if (present_accepted_events)
      list.add(accepted_events);

    return list.hashCode();
  }

  @Override
  public int compareTo(AnalyzerConfig other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetResult_type()).compareTo(other.isSetResult_type());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetResult_type()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.result_type, other.result_type);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAccepted_events()).compareTo(other.isSetAccepted_events());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAccepted_events()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.accepted_events, other.accepted_events);
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
    StringBuilder sb = new StringBuilder("AnalyzerConfig(");
    boolean first = true;

    sb.append("result_type:");
    if (this.result_type == null) {
      sb.append("null");
    } else {
      sb.append(this.result_type);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("accepted_events:");
    if (this.accepted_events == null) {
      sb.append("null");
    } else {
      sb.append(this.accepted_events);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (result_type == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'result_type' was not present! Struct: " + toString());
    }
    if (accepted_events == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'accepted_events' was not present! Struct: " + toString());
    }
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

  private static class AnalyzerConfigStandardSchemeFactory implements SchemeFactory {
    public AnalyzerConfigStandardScheme getScheme() {
      return new AnalyzerConfigStandardScheme();
    }
  }

  private static class AnalyzerConfigStandardScheme extends StandardScheme<AnalyzerConfig> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, AnalyzerConfig struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // RESULT_TYPE
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.result_type = ResultType.findByValue(iprot.readI32());
              struct.setResult_typeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // ACCEPTED_EVENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.SET) {
              {
                org.apache.thrift.protocol.TSet _set90 = iprot.readSetBegin();
                struct.accepted_events = new HashSet<Event>(2*_set90.size);
                for (int _i91 = 0; _i91 < _set90.size; ++_i91)
                {
                  Event _elem92;
                  _elem92 = Event.findByValue(iprot.readI32());
                  struct.accepted_events.add(_elem92);
                }
                iprot.readSetEnd();
              }
              struct.setAccepted_eventsIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, AnalyzerConfig struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.result_type != null) {
        oprot.writeFieldBegin(RESULT_TYPE_FIELD_DESC);
        oprot.writeI32(struct.result_type.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.accepted_events != null) {
        oprot.writeFieldBegin(ACCEPTED_EVENTS_FIELD_DESC);
        {
          oprot.writeSetBegin(new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, struct.accepted_events.size()));
          for (Event _iter93 : struct.accepted_events)
          {
            oprot.writeI32(_iter93.getValue());
          }
          oprot.writeSetEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class AnalyzerConfigTupleSchemeFactory implements SchemeFactory {
    public AnalyzerConfigTupleScheme getScheme() {
      return new AnalyzerConfigTupleScheme();
    }
  }

  private static class AnalyzerConfigTupleScheme extends TupleScheme<AnalyzerConfig> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, AnalyzerConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.result_type.getValue());
      {
        oprot.writeI32(struct.accepted_events.size());
        for (Event _iter94 : struct.accepted_events)
        {
          oprot.writeI32(_iter94.getValue());
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, AnalyzerConfig struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.result_type = ResultType.findByValue(iprot.readI32());
      struct.setResult_typeIsSet(true);
      {
        org.apache.thrift.protocol.TSet _set95 = new org.apache.thrift.protocol.TSet(org.apache.thrift.protocol.TType.I32, iprot.readI32());
        struct.accepted_events = new HashSet<Event>(2*_set95.size);
        for (int _i96 = 0; _i96 < _set95.size; ++_i96)
        {
          Event _elem97;
          _elem97 = Event.findByValue(iprot.readI32());
          struct.accepted_events.add(_elem97);
        }
      }
      struct.setAccepted_eventsIsSet(true);
    }
  }

}

