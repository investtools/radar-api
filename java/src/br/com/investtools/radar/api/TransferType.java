/**
 * Autogenerated by Thrift Compiler (0.10.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package br.com.investtools.radar.api;


import java.util.Map;
import java.util.HashMap;
import org.apache.thrift.TEnum;

public enum TransferType implements org.apache.thrift.TEnum {
  IN(1),
  OUT(2);

  private final int value;

  private TransferType(int value) {
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
  public static TransferType findByValue(int value) { 
    switch (value) {
      case 1:
        return IN;
      case 2:
        return OUT;
      default:
        return null;
    }
  }
}
