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

public enum Event implements org.apache.thrift.TEnum {
  EACH_DAY(0),
  EACH_MONTH(1),
  CASH_FLOW(2),
  FINISH(3);

  private final int value;

  private Event(int value) {
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
  public static Event findByValue(int value) { 
    switch (value) {
      case 0:
        return EACH_DAY;
      case 1:
        return EACH_MONTH;
      case 2:
        return CASH_FLOW;
      case 3:
        return FINISH;
      default:
        return null;
    }
  }
}
