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

public enum LineSeriesType implements org.apache.thrift.TEnum {
  LINE(0),
  AREA(1);

  private final int value;

  private LineSeriesType(int value) {
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
  public static LineSeriesType findByValue(int value) { 
    switch (value) {
      case 0:
        return LINE;
      case 1:
        return AREA;
      default:
        return null;
    }
  }
}
