/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum StockBuyTransactionType implements org.apache.thrift.TEnum {
  REGULAR(1),
  IPO(2);

  private final int value;

  private StockBuyTransactionType(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static StockBuyTransactionType findByValue(int value) { 
    switch (value) {
      case 1:
        return REGULAR;
      case 2:
        return IPO;
      default:
        return null;
    }
  }
}
