/**
 * Autogenerated by Thrift Compiler (0.12.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class OptionExercise implements org.apache.thrift.TBase<OptionExercise, OptionExercise._Fields>, java.io.Serializable, Cloneable, Comparable<OptionExercise> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("OptionExercise");

  private static final org.apache.thrift.protocol.TField DATE_FIELD_DESC = new org.apache.thrift.protocol.TField("date", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField OPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("option", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SHARES_FIELD_DESC = new org.apache.thrift.protocol.TField("shares", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField STRIKE_FIELD_DESC = new org.apache.thrift.protocol.TField("strike", org.apache.thrift.protocol.TType.DOUBLE, (short)4);

  private static final org.apache.thrift.scheme.SchemeFactory STANDARD_SCHEME_FACTORY = new OptionExerciseStandardSchemeFactory();
  private static final org.apache.thrift.scheme.SchemeFactory TUPLE_SCHEME_FACTORY = new OptionExerciseTupleSchemeFactory();

  public long date; // required
  public @org.apache.thrift.annotation.Nullable br.com.investtools.radar.api.EquityId option; // required
  public int shares; // required
  public double strike; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    DATE((short)1, "date"),
    OPTION((short)2, "option"),
    SHARES((short)3, "shares"),
    STRIKE((short)4, "strike");

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
        case 1: // DATE
          return DATE;
        case 2: // OPTION
          return OPTION;
        case 3: // SHARES
          return SHARES;
        case 4: // STRIKE
          return STRIKE;
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
  private static final int __DATE_ISSET_ID = 0;
  private static final int __SHARES_ISSET_ID = 1;
  private static final int __STRIKE_ISSET_ID = 2;
  private byte __isset_bitfield = 0;
  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.DATE, new org.apache.thrift.meta_data.FieldMetaData("date", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64        , "Date")));
    tmpMap.put(_Fields.OPTION, new org.apache.thrift.meta_data.FieldMetaData("option", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, br.com.investtools.radar.api.EquityId.class)));
    tmpMap.put(_Fields.SHARES, new org.apache.thrift.meta_data.FieldMetaData("shares", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.STRIKE, new org.apache.thrift.meta_data.FieldMetaData("strike", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(OptionExercise.class, metaDataMap);
  }

  public OptionExercise() {
  }

  public OptionExercise(
    long date,
    br.com.investtools.radar.api.EquityId option,
    int shares,
    double strike)
  {
    this();
    this.date = date;
    setDateIsSet(true);
    this.option = option;
    this.shares = shares;
    setSharesIsSet(true);
    this.strike = strike;
    setStrikeIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public OptionExercise(OptionExercise other) {
    __isset_bitfield = other.__isset_bitfield;
    this.date = other.date;
    if (other.isSetOption()) {
      this.option = new br.com.investtools.radar.api.EquityId(other.option);
    }
    this.shares = other.shares;
    this.strike = other.strike;
  }

  public OptionExercise deepCopy() {
    return new OptionExercise(this);
  }

  @Override
  public void clear() {
    setDateIsSet(false);
    this.date = 0;
    this.option = null;
    setSharesIsSet(false);
    this.shares = 0;
    setStrikeIsSet(false);
    this.strike = 0.0;
  }

  public long getDate() {
    return this.date;
  }

  public OptionExercise setDate(long date) {
    this.date = date;
    setDateIsSet(true);
    return this;
  }

  public void unsetDate() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __DATE_ISSET_ID);
  }

  /** Returns true if field date is set (has been assigned a value) and false otherwise */
  public boolean isSetDate() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __DATE_ISSET_ID);
  }

  public void setDateIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __DATE_ISSET_ID, value);
  }

  @org.apache.thrift.annotation.Nullable
  public br.com.investtools.radar.api.EquityId getOption() {
    return this.option;
  }

  public OptionExercise setOption(@org.apache.thrift.annotation.Nullable br.com.investtools.radar.api.EquityId option) {
    this.option = option;
    return this;
  }

  public void unsetOption() {
    this.option = null;
  }

  /** Returns true if field option is set (has been assigned a value) and false otherwise */
  public boolean isSetOption() {
    return this.option != null;
  }

  public void setOptionIsSet(boolean value) {
    if (!value) {
      this.option = null;
    }
  }

  public int getShares() {
    return this.shares;
  }

  public OptionExercise setShares(int shares) {
    this.shares = shares;
    setSharesIsSet(true);
    return this;
  }

  public void unsetShares() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __SHARES_ISSET_ID);
  }

  /** Returns true if field shares is set (has been assigned a value) and false otherwise */
  public boolean isSetShares() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __SHARES_ISSET_ID);
  }

  public void setSharesIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __SHARES_ISSET_ID, value);
  }

  public double getStrike() {
    return this.strike;
  }

  public OptionExercise setStrike(double strike) {
    this.strike = strike;
    setStrikeIsSet(true);
    return this;
  }

  public void unsetStrike() {
    __isset_bitfield = org.apache.thrift.EncodingUtils.clearBit(__isset_bitfield, __STRIKE_ISSET_ID);
  }

  /** Returns true if field strike is set (has been assigned a value) and false otherwise */
  public boolean isSetStrike() {
    return org.apache.thrift.EncodingUtils.testBit(__isset_bitfield, __STRIKE_ISSET_ID);
  }

  public void setStrikeIsSet(boolean value) {
    __isset_bitfield = org.apache.thrift.EncodingUtils.setBit(__isset_bitfield, __STRIKE_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, @org.apache.thrift.annotation.Nullable java.lang.Object value) {
    switch (field) {
    case DATE:
      if (value == null) {
        unsetDate();
      } else {
        setDate((java.lang.Long)value);
      }
      break;

    case OPTION:
      if (value == null) {
        unsetOption();
      } else {
        setOption((br.com.investtools.radar.api.EquityId)value);
      }
      break;

    case SHARES:
      if (value == null) {
        unsetShares();
      } else {
        setShares((java.lang.Integer)value);
      }
      break;

    case STRIKE:
      if (value == null) {
        unsetStrike();
      } else {
        setStrike((java.lang.Double)value);
      }
      break;

    }
  }

  @org.apache.thrift.annotation.Nullable
  public java.lang.Object getFieldValue(_Fields field) {
    switch (field) {
    case DATE:
      return getDate();

    case OPTION:
      return getOption();

    case SHARES:
      return getShares();

    case STRIKE:
      return getStrike();

    }
    throw new java.lang.IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new java.lang.IllegalArgumentException();
    }

    switch (field) {
    case DATE:
      return isSetDate();
    case OPTION:
      return isSetOption();
    case SHARES:
      return isSetShares();
    case STRIKE:
      return isSetStrike();
    }
    throw new java.lang.IllegalStateException();
  }

  @Override
  public boolean equals(java.lang.Object that) {
    if (that == null)
      return false;
    if (that instanceof OptionExercise)
      return this.equals((OptionExercise)that);
    return false;
  }

  public boolean equals(OptionExercise that) {
    if (that == null)
      return false;
    if (this == that)
      return true;

    boolean this_present_date = true;
    boolean that_present_date = true;
    if (this_present_date || that_present_date) {
      if (!(this_present_date && that_present_date))
        return false;
      if (this.date != that.date)
        return false;
    }

    boolean this_present_option = true && this.isSetOption();
    boolean that_present_option = true && that.isSetOption();
    if (this_present_option || that_present_option) {
      if (!(this_present_option && that_present_option))
        return false;
      if (!this.option.equals(that.option))
        return false;
    }

    boolean this_present_shares = true;
    boolean that_present_shares = true;
    if (this_present_shares || that_present_shares) {
      if (!(this_present_shares && that_present_shares))
        return false;
      if (this.shares != that.shares)
        return false;
    }

    boolean this_present_strike = true;
    boolean that_present_strike = true;
    if (this_present_strike || that_present_strike) {
      if (!(this_present_strike && that_present_strike))
        return false;
      if (this.strike != that.strike)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int hashCode = 1;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(date);

    hashCode = hashCode * 8191 + ((isSetOption()) ? 131071 : 524287);
    if (isSetOption())
      hashCode = hashCode * 8191 + option.hashCode();

    hashCode = hashCode * 8191 + shares;

    hashCode = hashCode * 8191 + org.apache.thrift.TBaseHelper.hashCode(strike);

    return hashCode;
  }

  @Override
  public int compareTo(OptionExercise other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = java.lang.Boolean.valueOf(isSetDate()).compareTo(other.isSetDate());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDate()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.date, other.date);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetOption()).compareTo(other.isSetOption());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetOption()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.option, other.option);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetShares()).compareTo(other.isSetShares());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetShares()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.shares, other.shares);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = java.lang.Boolean.valueOf(isSetStrike()).compareTo(other.isSetStrike());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStrike()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.strike, other.strike);
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
    java.lang.StringBuilder sb = new java.lang.StringBuilder("OptionExercise(");
    boolean first = true;

    sb.append("date:");
    sb.append(this.date);
    first = false;
    if (!first) sb.append(", ");
    sb.append("option:");
    if (this.option == null) {
      sb.append("null");
    } else {
      sb.append(this.option);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("shares:");
    sb.append(this.shares);
    first = false;
    if (!first) sb.append(", ");
    sb.append("strike:");
    sb.append(this.strike);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (option != null) {
      option.validate();
    }
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

  private static class OptionExerciseStandardSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OptionExerciseStandardScheme getScheme() {
      return new OptionExerciseStandardScheme();
    }
  }

  private static class OptionExerciseStandardScheme extends org.apache.thrift.scheme.StandardScheme<OptionExercise> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, OptionExercise struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // DATE
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.date = iprot.readI64();
              struct.setDateIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // OPTION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.option = new br.com.investtools.radar.api.EquityId();
              struct.option.read(iprot);
              struct.setOptionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // SHARES
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.shares = iprot.readI32();
              struct.setSharesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // STRIKE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.strike = iprot.readDouble();
              struct.setStrikeIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, OptionExercise struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(DATE_FIELD_DESC);
      oprot.writeI64(struct.date);
      oprot.writeFieldEnd();
      if (struct.option != null) {
        oprot.writeFieldBegin(OPTION_FIELD_DESC);
        struct.option.write(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(SHARES_FIELD_DESC);
      oprot.writeI32(struct.shares);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(STRIKE_FIELD_DESC);
      oprot.writeDouble(struct.strike);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class OptionExerciseTupleSchemeFactory implements org.apache.thrift.scheme.SchemeFactory {
    public OptionExerciseTupleScheme getScheme() {
      return new OptionExerciseTupleScheme();
    }
  }

  private static class OptionExerciseTupleScheme extends org.apache.thrift.scheme.TupleScheme<OptionExercise> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, OptionExercise struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol oprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet optionals = new java.util.BitSet();
      if (struct.isSetDate()) {
        optionals.set(0);
      }
      if (struct.isSetOption()) {
        optionals.set(1);
      }
      if (struct.isSetShares()) {
        optionals.set(2);
      }
      if (struct.isSetStrike()) {
        optionals.set(3);
      }
      oprot.writeBitSet(optionals, 4);
      if (struct.isSetDate()) {
        oprot.writeI64(struct.date);
      }
      if (struct.isSetOption()) {
        struct.option.write(oprot);
      }
      if (struct.isSetShares()) {
        oprot.writeI32(struct.shares);
      }
      if (struct.isSetStrike()) {
        oprot.writeDouble(struct.strike);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, OptionExercise struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TTupleProtocol iprot = (org.apache.thrift.protocol.TTupleProtocol) prot;
      java.util.BitSet incoming = iprot.readBitSet(4);
      if (incoming.get(0)) {
        struct.date = iprot.readI64();
        struct.setDateIsSet(true);
      }
      if (incoming.get(1)) {
        struct.option = new br.com.investtools.radar.api.EquityId();
        struct.option.read(iprot);
        struct.setOptionIsSet(true);
      }
      if (incoming.get(2)) {
        struct.shares = iprot.readI32();
        struct.setSharesIsSet(true);
      }
      if (incoming.get(3)) {
        struct.strike = iprot.readDouble();
        struct.setStrikeIsSet(true);
      }
    }
  }

  private static <S extends org.apache.thrift.scheme.IScheme> S scheme(org.apache.thrift.protocol.TProtocol proto) {
    return (org.apache.thrift.scheme.StandardScheme.class.equals(proto.getScheme()) ? STANDARD_SCHEME_FACTORY : TUPLE_SCHEME_FACTORY).getScheme();
  }
}

