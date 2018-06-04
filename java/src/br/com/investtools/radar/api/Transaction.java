/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked", "unused"})
public class Transaction extends org.apache.thrift.TUnion<Transaction, Transaction._Fields> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Transaction");
  private static final org.apache.thrift.protocol.TField STOCK_BUY_FIELD_DESC = new org.apache.thrift.protocol.TField("stock_buy", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField STOCK_SELL_FIELD_DESC = new org.apache.thrift.protocol.TField("stock_sell", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField SLB_FIELD_DESC = new org.apache.thrift.protocol.TField("slb", org.apache.thrift.protocol.TType.STRUCT, (short)3);
  private static final org.apache.thrift.protocol.TField SLBR_FIELD_DESC = new org.apache.thrift.protocol.TField("slbr", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField STOCK_COMMISSION_EXPENSE_FIELD_DESC = new org.apache.thrift.protocol.TField("stock_commission_expense", org.apache.thrift.protocol.TType.STRUCT, (short)5);
  private static final org.apache.thrift.protocol.TField STOCK_OPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("stock_option", org.apache.thrift.protocol.TType.STRUCT, (short)6);
  private static final org.apache.thrift.protocol.TField SUBSCRIPTION_FIELD_DESC = new org.apache.thrift.protocol.TField("subscription", org.apache.thrift.protocol.TType.STRUCT, (short)7);
  private static final org.apache.thrift.protocol.TField TRANSFER_FIELD_DESC = new org.apache.thrift.protocol.TField("transfer", org.apache.thrift.protocol.TType.STRUCT, (short)8);

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    STOCK_BUY((short)1, "stock_buy"),
    STOCK_SELL((short)2, "stock_sell"),
    SLB((short)3, "slb"),
    SLBR((short)4, "slbr"),
    STOCK_COMMISSION_EXPENSE((short)5, "stock_commission_expense"),
    STOCK_OPTION((short)6, "stock_option"),
    SUBSCRIPTION((short)7, "subscription"),
    TRANSFER((short)8, "transfer");

    private static final java.util.Map<java.lang.String, _Fields> byName = new java.util.HashMap<java.lang.String, _Fields>();

    static {
      for (_Fields field : java.util.EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // STOCK_BUY
          return STOCK_BUY;
        case 2: // STOCK_SELL
          return STOCK_SELL;
        case 3: // SLB
          return SLB;
        case 4: // SLBR
          return SLBR;
        case 5: // STOCK_COMMISSION_EXPENSE
          return STOCK_COMMISSION_EXPENSE;
        case 6: // STOCK_OPTION
          return STOCK_OPTION;
        case 7: // SUBSCRIPTION
          return SUBSCRIPTION;
        case 8: // TRANSFER
          return TRANSFER;
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

  public static final java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    java.util.Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new java.util.EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.STOCK_BUY, new org.apache.thrift.meta_data.FieldMetaData("stock_buy", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StockBuy.class)));
    tmpMap.put(_Fields.STOCK_SELL, new org.apache.thrift.meta_data.FieldMetaData("stock_sell", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StockSell.class)));
    tmpMap.put(_Fields.SLB, new org.apache.thrift.meta_data.FieldMetaData("slb", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SecurityLendingAndBorrowing.class)));
    tmpMap.put(_Fields.SLBR, new org.apache.thrift.meta_data.FieldMetaData("slbr", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, SecurityLendingAndBorrowingReturning.class)));
    tmpMap.put(_Fields.STOCK_COMMISSION_EXPENSE, new org.apache.thrift.meta_data.FieldMetaData("stock_commission_expense", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, CommissionExpense.class)));
    tmpMap.put(_Fields.STOCK_OPTION, new org.apache.thrift.meta_data.FieldMetaData("stock_option", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, StockOption.class)));
    tmpMap.put(_Fields.SUBSCRIPTION, new org.apache.thrift.meta_data.FieldMetaData("subscription", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Subscription.class)));
    tmpMap.put(_Fields.TRANSFER, new org.apache.thrift.meta_data.FieldMetaData("transfer", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, Transfer.class)));
    metaDataMap = java.util.Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Transaction.class, metaDataMap);
  }

  public Transaction() {
    super();
  }

  public Transaction(_Fields setField, java.lang.Object value) {
    super(setField, value);
  }

  public Transaction(Transaction other) {
    super(other);
  }
  public Transaction deepCopy() {
    return new Transaction(this);
  }

  public static Transaction stock_buy(StockBuy value) {
    Transaction x = new Transaction();
    x.setStock_buy(value);
    return x;
  }

  public static Transaction stock_sell(StockSell value) {
    Transaction x = new Transaction();
    x.setStock_sell(value);
    return x;
  }

  public static Transaction slb(SecurityLendingAndBorrowing value) {
    Transaction x = new Transaction();
    x.setSlb(value);
    return x;
  }

  public static Transaction slbr(SecurityLendingAndBorrowingReturning value) {
    Transaction x = new Transaction();
    x.setSlbr(value);
    return x;
  }

  public static Transaction stock_commission_expense(CommissionExpense value) {
    Transaction x = new Transaction();
    x.setStock_commission_expense(value);
    return x;
  }

  public static Transaction stock_option(StockOption value) {
    Transaction x = new Transaction();
    x.setStock_option(value);
    return x;
  }

  public static Transaction subscription(Subscription value) {
    Transaction x = new Transaction();
    x.setSubscription(value);
    return x;
  }

  public static Transaction transfer(Transfer value) {
    Transaction x = new Transaction();
    x.setTransfer(value);
    return x;
  }


  @Override
  protected void checkType(_Fields setField, java.lang.Object value) throws java.lang.ClassCastException {
    switch (setField) {
      case STOCK_BUY:
        if (value instanceof StockBuy) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type StockBuy for field 'stock_buy', but got " + value.getClass().getSimpleName());
      case STOCK_SELL:
        if (value instanceof StockSell) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type StockSell for field 'stock_sell', but got " + value.getClass().getSimpleName());
      case SLB:
        if (value instanceof SecurityLendingAndBorrowing) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type SecurityLendingAndBorrowing for field 'slb', but got " + value.getClass().getSimpleName());
      case SLBR:
        if (value instanceof SecurityLendingAndBorrowingReturning) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type SecurityLendingAndBorrowingReturning for field 'slbr', but got " + value.getClass().getSimpleName());
      case STOCK_COMMISSION_EXPENSE:
        if (value instanceof CommissionExpense) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type CommissionExpense for field 'stock_commission_expense', but got " + value.getClass().getSimpleName());
      case STOCK_OPTION:
        if (value instanceof StockOption) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type StockOption for field 'stock_option', but got " + value.getClass().getSimpleName());
      case SUBSCRIPTION:
        if (value instanceof Subscription) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type Subscription for field 'subscription', but got " + value.getClass().getSimpleName());
      case TRANSFER:
        if (value instanceof Transfer) {
          break;
        }
        throw new java.lang.ClassCastException("Was expecting value of type Transfer for field 'transfer', but got " + value.getClass().getSimpleName());
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected java.lang.Object standardSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TField field) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(field.id);
    if (setField != null) {
      switch (setField) {
        case STOCK_BUY:
          if (field.type == STOCK_BUY_FIELD_DESC.type) {
            StockBuy stock_buy;
            stock_buy = new StockBuy();
            stock_buy.read(iprot);
            return stock_buy;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STOCK_SELL:
          if (field.type == STOCK_SELL_FIELD_DESC.type) {
            StockSell stock_sell;
            stock_sell = new StockSell();
            stock_sell.read(iprot);
            return stock_sell;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SLB:
          if (field.type == SLB_FIELD_DESC.type) {
            SecurityLendingAndBorrowing slb;
            slb = new SecurityLendingAndBorrowing();
            slb.read(iprot);
            return slb;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SLBR:
          if (field.type == SLBR_FIELD_DESC.type) {
            SecurityLendingAndBorrowingReturning slbr;
            slbr = new SecurityLendingAndBorrowingReturning();
            slbr.read(iprot);
            return slbr;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STOCK_COMMISSION_EXPENSE:
          if (field.type == STOCK_COMMISSION_EXPENSE_FIELD_DESC.type) {
            CommissionExpense stock_commission_expense;
            stock_commission_expense = new CommissionExpense();
            stock_commission_expense.read(iprot);
            return stock_commission_expense;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case STOCK_OPTION:
          if (field.type == STOCK_OPTION_FIELD_DESC.type) {
            StockOption stock_option;
            stock_option = new StockOption();
            stock_option.read(iprot);
            return stock_option;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case SUBSCRIPTION:
          if (field.type == SUBSCRIPTION_FIELD_DESC.type) {
            Subscription subscription;
            subscription = new Subscription();
            subscription.read(iprot);
            return subscription;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        case TRANSFER:
          if (field.type == TRANSFER_FIELD_DESC.type) {
            Transfer transfer;
            transfer = new Transfer();
            transfer.read(iprot);
            return transfer;
          } else {
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
            return null;
          }
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      org.apache.thrift.protocol.TProtocolUtil.skip(iprot, field.type);
      return null;
    }
  }

  @Override
  protected void standardSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case STOCK_BUY:
        StockBuy stock_buy = (StockBuy)value_;
        stock_buy.write(oprot);
        return;
      case STOCK_SELL:
        StockSell stock_sell = (StockSell)value_;
        stock_sell.write(oprot);
        return;
      case SLB:
        SecurityLendingAndBorrowing slb = (SecurityLendingAndBorrowing)value_;
        slb.write(oprot);
        return;
      case SLBR:
        SecurityLendingAndBorrowingReturning slbr = (SecurityLendingAndBorrowingReturning)value_;
        slbr.write(oprot);
        return;
      case STOCK_COMMISSION_EXPENSE:
        CommissionExpense stock_commission_expense = (CommissionExpense)value_;
        stock_commission_expense.write(oprot);
        return;
      case STOCK_OPTION:
        StockOption stock_option = (StockOption)value_;
        stock_option.write(oprot);
        return;
      case SUBSCRIPTION:
        Subscription subscription = (Subscription)value_;
        subscription.write(oprot);
        return;
      case TRANSFER:
        Transfer transfer = (Transfer)value_;
        transfer.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected java.lang.Object tupleSchemeReadValue(org.apache.thrift.protocol.TProtocol iprot, short fieldID) throws org.apache.thrift.TException {
    _Fields setField = _Fields.findByThriftId(fieldID);
    if (setField != null) {
      switch (setField) {
        case STOCK_BUY:
          StockBuy stock_buy;
          stock_buy = new StockBuy();
          stock_buy.read(iprot);
          return stock_buy;
        case STOCK_SELL:
          StockSell stock_sell;
          stock_sell = new StockSell();
          stock_sell.read(iprot);
          return stock_sell;
        case SLB:
          SecurityLendingAndBorrowing slb;
          slb = new SecurityLendingAndBorrowing();
          slb.read(iprot);
          return slb;
        case SLBR:
          SecurityLendingAndBorrowingReturning slbr;
          slbr = new SecurityLendingAndBorrowingReturning();
          slbr.read(iprot);
          return slbr;
        case STOCK_COMMISSION_EXPENSE:
          CommissionExpense stock_commission_expense;
          stock_commission_expense = new CommissionExpense();
          stock_commission_expense.read(iprot);
          return stock_commission_expense;
        case STOCK_OPTION:
          StockOption stock_option;
          stock_option = new StockOption();
          stock_option.read(iprot);
          return stock_option;
        case SUBSCRIPTION:
          Subscription subscription;
          subscription = new Subscription();
          subscription.read(iprot);
          return subscription;
        case TRANSFER:
          Transfer transfer;
          transfer = new Transfer();
          transfer.read(iprot);
          return transfer;
        default:
          throw new java.lang.IllegalStateException("setField wasn't null, but didn't match any of the case statements!");
      }
    } else {
      throw new org.apache.thrift.protocol.TProtocolException("Couldn't find a field with field id " + fieldID);
    }
  }

  @Override
  protected void tupleSchemeWriteValue(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    switch (setField_) {
      case STOCK_BUY:
        StockBuy stock_buy = (StockBuy)value_;
        stock_buy.write(oprot);
        return;
      case STOCK_SELL:
        StockSell stock_sell = (StockSell)value_;
        stock_sell.write(oprot);
        return;
      case SLB:
        SecurityLendingAndBorrowing slb = (SecurityLendingAndBorrowing)value_;
        slb.write(oprot);
        return;
      case SLBR:
        SecurityLendingAndBorrowingReturning slbr = (SecurityLendingAndBorrowingReturning)value_;
        slbr.write(oprot);
        return;
      case STOCK_COMMISSION_EXPENSE:
        CommissionExpense stock_commission_expense = (CommissionExpense)value_;
        stock_commission_expense.write(oprot);
        return;
      case STOCK_OPTION:
        StockOption stock_option = (StockOption)value_;
        stock_option.write(oprot);
        return;
      case SUBSCRIPTION:
        Subscription subscription = (Subscription)value_;
        subscription.write(oprot);
        return;
      case TRANSFER:
        Transfer transfer = (Transfer)value_;
        transfer.write(oprot);
        return;
      default:
        throw new java.lang.IllegalStateException("Cannot write union with unknown field " + setField_);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TField getFieldDesc(_Fields setField) {
    switch (setField) {
      case STOCK_BUY:
        return STOCK_BUY_FIELD_DESC;
      case STOCK_SELL:
        return STOCK_SELL_FIELD_DESC;
      case SLB:
        return SLB_FIELD_DESC;
      case SLBR:
        return SLBR_FIELD_DESC;
      case STOCK_COMMISSION_EXPENSE:
        return STOCK_COMMISSION_EXPENSE_FIELD_DESC;
      case STOCK_OPTION:
        return STOCK_OPTION_FIELD_DESC;
      case SUBSCRIPTION:
        return SUBSCRIPTION_FIELD_DESC;
      case TRANSFER:
        return TRANSFER_FIELD_DESC;
      default:
        throw new java.lang.IllegalArgumentException("Unknown field id " + setField);
    }
  }

  @Override
  protected org.apache.thrift.protocol.TStruct getStructDesc() {
    return STRUCT_DESC;
  }

  @Override
  protected _Fields enumForId(short id) {
    return _Fields.findByThriftIdOrThrow(id);
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }


  public StockBuy getStock_buy() {
    if (getSetField() == _Fields.STOCK_BUY) {
      return (StockBuy)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'stock_buy' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStock_buy(StockBuy value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.STOCK_BUY;
    value_ = value;
  }

  public StockSell getStock_sell() {
    if (getSetField() == _Fields.STOCK_SELL) {
      return (StockSell)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'stock_sell' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStock_sell(StockSell value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.STOCK_SELL;
    value_ = value;
  }

  public SecurityLendingAndBorrowing getSlb() {
    if (getSetField() == _Fields.SLB) {
      return (SecurityLendingAndBorrowing)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'slb' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSlb(SecurityLendingAndBorrowing value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.SLB;
    value_ = value;
  }

  public SecurityLendingAndBorrowingReturning getSlbr() {
    if (getSetField() == _Fields.SLBR) {
      return (SecurityLendingAndBorrowingReturning)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'slbr' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSlbr(SecurityLendingAndBorrowingReturning value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.SLBR;
    value_ = value;
  }

  public CommissionExpense getStock_commission_expense() {
    if (getSetField() == _Fields.STOCK_COMMISSION_EXPENSE) {
      return (CommissionExpense)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'stock_commission_expense' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStock_commission_expense(CommissionExpense value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.STOCK_COMMISSION_EXPENSE;
    value_ = value;
  }

  public StockOption getStock_option() {
    if (getSetField() == _Fields.STOCK_OPTION) {
      return (StockOption)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'stock_option' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setStock_option(StockOption value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.STOCK_OPTION;
    value_ = value;
  }

  public Subscription getSubscription() {
    if (getSetField() == _Fields.SUBSCRIPTION) {
      return (Subscription)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'subscription' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setSubscription(Subscription value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.SUBSCRIPTION;
    value_ = value;
  }

  public Transfer getTransfer() {
    if (getSetField() == _Fields.TRANSFER) {
      return (Transfer)getFieldValue();
    } else {
      throw new java.lang.RuntimeException("Cannot get field 'transfer' because union is currently set to " + getFieldDesc(getSetField()).name);
    }
  }

  public void setTransfer(Transfer value) {
    if (value == null) throw new java.lang.NullPointerException();
    setField_ = _Fields.TRANSFER;
    value_ = value;
  }

  public boolean isSetStock_buy() {
    return setField_ == _Fields.STOCK_BUY;
  }


  public boolean isSetStock_sell() {
    return setField_ == _Fields.STOCK_SELL;
  }


  public boolean isSetSlb() {
    return setField_ == _Fields.SLB;
  }


  public boolean isSetSlbr() {
    return setField_ == _Fields.SLBR;
  }


  public boolean isSetStock_commission_expense() {
    return setField_ == _Fields.STOCK_COMMISSION_EXPENSE;
  }


  public boolean isSetStock_option() {
    return setField_ == _Fields.STOCK_OPTION;
  }


  public boolean isSetSubscription() {
    return setField_ == _Fields.SUBSCRIPTION;
  }


  public boolean isSetTransfer() {
    return setField_ == _Fields.TRANSFER;
  }


  public boolean equals(java.lang.Object other) {
    if (other instanceof Transaction) {
      return equals((Transaction)other);
    } else {
      return false;
    }
  }

  public boolean equals(Transaction other) {
    return other != null && getSetField() == other.getSetField() && getFieldValue().equals(other.getFieldValue());
  }

  @Override
  public int compareTo(Transaction other) {
    int lastComparison = org.apache.thrift.TBaseHelper.compareTo(getSetField(), other.getSetField());
    if (lastComparison == 0) {
      return org.apache.thrift.TBaseHelper.compareTo(getFieldValue(), other.getFieldValue());
    }
    return lastComparison;
  }


  @Override
  public int hashCode() {
    java.util.List<java.lang.Object> list = new java.util.ArrayList<java.lang.Object>();
    list.add(this.getClass().getName());
    org.apache.thrift.TFieldIdEnum setField = getSetField();
    if (setField != null) {
      list.add(setField.getThriftFieldId());
      java.lang.Object value = getFieldValue();
      if (value instanceof org.apache.thrift.TEnum) {
        list.add(((org.apache.thrift.TEnum)getFieldValue()).getValue());
      } else {
        list.add(value);
      }
    }
    return list.hashCode();
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
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }


}
