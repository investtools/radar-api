/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
/**
 * Criado na versão 0.2.1
 */
public class Provision implements org.apache.thrift.TBase<Provision, Provision._Fields>, java.io.Serializable, Cloneable, Comparable<Provision> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Provision");

  private static final org.apache.thrift.protocol.TField VALUE_FIELD_DESC = new org.apache.thrift.protocol.TField("value", org.apache.thrift.protocol.TType.DOUBLE, (short)1);
  private static final org.apache.thrift.protocol.TField DESCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("description", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField SETTLEMENT_FIELD_DESC = new org.apache.thrift.protocol.TField("settlement", org.apache.thrift.protocol.TType.STRUCT, (short)3);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new ProvisionStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new ProvisionTupleSchemeFactory();

  public double value; // required
  public @org.apache.thrift.annotation.Nullable java.lang.String description; // required
  public @org.apache.thrift.annotation.Nullable Settlement settlement; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    VALUE((short)1, "value"),
    DESCRIPTION((short)2, "description"),
    SETTLEMENT((short)3, "settlement");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // VALUE
          return VALUE;
        case 2: // DESCRIPTION
          return DESCRIPTION;
        case 3: // SETTLEMENT
          return SETTLEMENT;
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
      if (fields == null) throw new java.lang.IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    @org.apache.thrift.annotation.Nullable
    public static _Fields findByName(java.lang.String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final java.lang.String _fieldName;

    _Fields(short thriftId, java.lang.String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public java.lang.String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __VALUE_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.VALUE, new org.apache.thrift.meta_data.FieldMetaData("value", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.DESCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("description", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.SETTLEMENT, new org.apache.thrift.meta_data.FieldMetaData("settlement", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Settlement.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Provision.class, metaDataMap);
  }

  public Provision() {
  }

  public Provision(
    double value,
    java.lang.String description,
    Settlement settlement)
  {
    this();
    this.value = value;
    setValueIsSet(true);
    this.description = description;
    this.settlement = settlement;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Provision(Provision other) {
    __isset_bitfield = other.__isset_bitfield;
    this.value = other.value;
    if (other.isSetDescription()) {
      this.description = other.description;
    }
    if (other.isSetSettlement()) {
      this.settlement = new Settlement(other.settlement);
    }
  }

  public Provision deepCopy() {
    return new Provision(this);
  }

  @Override
  public void clear() {
    setValueIsSet(false);
    this.value = 0.0;
    this.description = null;
    this.settlement = null;
  }

  public double getValue() {
    return this.value;
  }

  public Provision setValue(double value) {
    this.value = value;
    setValueIsSet(true);
    return this;
  }

  public void unsetValue() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  /** Returns true if field value is set (has been assigned a value) and false otherwise */
  public boolean isSetValue() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __VALUE_ISSET_ID);
  }

  public void setValueIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __VALUE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.String getDescription() {
    return this.description;
  }

  public Provision setDescription(@org.apache.thrift.annotation.Nullable java.lang.String description) {
    this.description = description;
    return this;
  }

  public void unsetDescription() {
    this.description = null;
  }

  /** Returns true if field description is set (has been assigned a value) and false otherwise */
  public boolean isSetDescription() {
    return this.description != null;
  }

  public void setDescriptionIsSet(boolean value) {
    if (!value) {
      this.description = null;
    }
  }

  @org.apache.thrift.annotation.Nullable
  public Settlement getSettlement() {
    return this.settlement;
  }

  public Provision setSettlement(@org.apache.thrift.annotation.Nullable Settlement settlement) {
    this.settlement = settlement;
    return this;
  }

  public void unsetSettlement() {
    this.settlement = null;
  }

  /** Returns true if field settlement is set (has been assigned a value) and false otherwise */
  public boolean isSetSettlement() {
    return this.settlement != null;
  }

  public void setSettlementIsSet(boolean value) {
    if (!value) {
      this.settlement = null;
    }
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case VALUE:
      if (value == null) {
        unsetValue();
      } else {
        setValue((java.lang.Double)value);
      }
      break;

    case DESCRIPTION:
      if (value == null) {
        unsetDescription();
      } else {
        setDescription((java.lang.String)value);
      }
      break;

    case SETTLEMENT:
      if (value == null) {
        unsetSettlement();
      } else {
        setSettlement((Settlement)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case VALUE:
      return getValue();

    case DESCRIPTION:
      return getDescription();

    case SETTLEMENT:
      return getSettlement();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case VALUE:
      return isSetValue();
    case DESCRIPTION:
      return isSetDescription();
    case SETTLEMENT:
      return isSetSettlement();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof Provision)
      return this.equals((Provision)that);
    return false;
  }

  public boolean equals(Provision that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_value = true;
    boolean that_present_value = true;
    if (this_present_value || that_present_value) {
      if (!(this_present_value && that_present_value))
        return false;
      if (this.value != that.value)
        return false;
    }

    boolean this_present_description = true && this.isSetDescription();
    boolean that_present_description = true && that.isSetDescription();
    if (this_present_description || that_present_description) {
      if (!(this_present_description && that_present_description))
        return false;
      if (!this.description.equals(that.description))
        return false;
    }

    boolean this_present_settlement = true && this.isSetSettlement();
    boolean that_present_settlement = true && that.isSetSettlement();
    if (this_present_settlement || that_present_settlement) {
      if (!(this_present_settlement && that_present_settlement))
        return false;
      if (!this.settlement.equals(that.settlement))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(value);

    hashCode = hashCode * 8191 + ((isSetDescription()) ? 131071 : 524287);
    if (isSetDescription())
      hashCode = hashCode * 8191 + description.hashCode();

    hashCode = hashCode * 8191 + ((isSetSettlement()) ? 131071 : 524287);
    if (isSetSettlement())
      hashCode = hashCode * 8191 + settlement.hashCode();

    return hashCode;
  }

  @Override
  public int compareTo(Provision other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetValue()).compareTo(other.isSetValue());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetValue()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.value, other.value);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetDescription()).compareTo(other.isSetDescription());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDescription()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.description, other.description);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetSettlement()).compareTo(other.isSetSettlement());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSettlement()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.settlement, other.settlement);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  @org.apache.thrift.annotation.Nullable
  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    scheme(iprot).read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    scheme(oprot).write(oprot, this);
  }

  @Override
  public java.lang.String toString() {
    java.lang.StringBuilder sb = new java.lang.StringBuilder("Provision(");
    boolean first = true;

    sb.append("value:");
    sb.append(this.value);
    first = false;
    if (!first) sb.append(", ");
    sb.append("description:");
    if (this.description == null) {
      sb.append("null");
    } else {
      sb.append(this.description);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("settlement:");
    if (this.settlement == null) {
      sb.append("null");
    } else {
      sb.append(this.settlement);
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

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, java.lang.ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class ProvisionStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProvisionStandardScheme getScheme() {
      return new ProvisionStandardScheme();
    }
  }

  private static class ProvisionStandardScheme extends org.apache.thrift.scheme.StandardScheme<Provision> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Provision struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // VALUE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.value = iprot.readDouble();
              struct.setValueIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DESCRIPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.description = iprot.readString();
              struct.setDescriptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SETTLEMENT
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.settlement = new Settlement();
              struct.settlement.read(iprot);
              struct.setSettlementIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Provision struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(VALUE_FIELD_DESC);
      oprot.writeDouble(struct.value);
      oprot.writeFieldEnd();
      if (struct.description != null) {
        oprot.writeFieldBegin(DESCRIPTION_FIELD_DESC);
        oprot.writeString(struct.description);
        oprot.writeFieldEnd();
      }
      if (struct.settlement != null) {
        oprot.writeFieldBegin(SETTLEMENT_FIELD_DESC);
        struct.settlement.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class ProvisionTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public ProvisionTupleScheme getScheme() {
      return new ProvisionTupleScheme();
    }
  }

  private static class ProvisionTupleScheme extends org.apache.thrift.scheme.TupleScheme<Provision> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Provision struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetValue()) {
        optionals.set(0);
      }
      if (struct.isSetDescription()) {
        optionals.set(1);
      }
      if (struct.isSetSettlement()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetValue()) {
        oprot.writeDouble(struct.value);
      }
      if (struct.isSetDescription()) {
        oprot.writeString(struct.description);
      }
      if (struct.isSetSettlement()) {
        struct.settlement.write(oprot);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Provision struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.value = iprot.readDouble();
        struct.setValueIsSet(true);
      }
      if (incoming.get(1)) {
        struct.description = iprot.readString();
        struct.setDescriptionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.settlement = new Settlement();
        struct.settlement.read(iprot);
        struct.setSettlementIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

