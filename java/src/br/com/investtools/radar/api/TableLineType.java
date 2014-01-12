/**
 * Autogenerated by Thrift Compiler (1.0.0-dev)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TableLineType implements org.apache.thrift.TEnum {
  HEADER(0),
  BODY(1),
  FOOTER(2);

  private final int value;

  private TableLineType(int value) {
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
  public static TableLineType findByValue(int value) { 
    switch (value) {
      case 0:
        return HEADER;
      case 1:
        return BODY;
      case 2:
        return FOOTER;
      default:
        return null;
    }
  }
}
