/*
 * Copyright 2004-present Facebook. All Rights Reserved.
 */
package com.facebook.swift;

import java.util.List;
import java.util.Map;
import java.util.Set;

@ThriftStruct
public class OneOfEverything {
  @ThriftField(id = 1)
  public boolean aBoolean;
  @ThriftField(id = 2)
  public byte aByte;
  @ThriftField(id = 3)
  public short aShort;
  @ThriftField(id = 4)
  public int aInt;
  @ThriftField(id = 5)
  public long aLong;
  @ThriftField(id = 6)
  public double aDouble;
  @ThriftField(id = 7)
  public String aString;
  @ThriftField(id = 8)
  public BonkField aStruct;

  @ThriftField(id = 11)
  public Set<Boolean> aBooleanSet;
  @ThriftField(id = 12)
  public Set<Byte> aByteSet;
  @ThriftField(id = 13)
  public Set<Short> aShortSet;
  @ThriftField(id = 14)
  public Set<Integer> aIntegerSet;
  @ThriftField(id = 15)
  public Set<Long> aLongSet;
  @ThriftField(id = 16)
  public Set<Double> aDoubleSet;
  @ThriftField(id = 17)
  public Set<String> aStringSet;
  @ThriftField(id = 18)
  public Set<BonkField> aStructSet;

  @ThriftField(id = 21)
  public List<Boolean> aBooleanList;
  @ThriftField(id = 22)
  public List<Byte> aByteList;
  @ThriftField(id = 23)
  public List<Short> aShortList;
  @ThriftField(id = 24)
  public List<Integer> aIntegerList;
  @ThriftField(id = 25)
  public List<Long> aLongList;
  @ThriftField(id = 26)
  public List<Double> aDoubleList;
  @ThriftField(id = 27)
  public List<String> aStringList;
  @ThriftField(id = 28)
  public List<BonkField> aStructList;

  @ThriftField(id = 31)
  public Map<String, Boolean> aBooleanValueMap;
  @ThriftField(id = 32)
  public Map<String, Byte> aByteValueMap;
  @ThriftField(id = 33)
  public Map<String, Short> aShortValueMap;
  @ThriftField(id = 34)
  public Map<String, Integer> aIntegerValueMap;
  @ThriftField(id = 35)
  public Map<String, Long> aLongValueMap;
  @ThriftField(id = 36)
  public Map<String, Double> aDoubleValueMap;
  @ThriftField(id = 37)
  public Map<String, String> aStringValueMap;
  @ThriftField(id = 38)
  public Map<String, BonkField> aStructValueMap;

  @ThriftField(id = 41)
  public Map<Boolean, String> aBooleanKeyMap;
  @ThriftField(id = 42)
  public Map<Byte, String> aByteKeyMap;
  @ThriftField(id = 43)
  public Map<Short, String> aShortKeyMap;
  @ThriftField(id = 44)
  public Map<Integer, String> aIntegerKeyMap;
  @ThriftField(id = 45)
  public Map<Long, String> aLongKeyMap;
  @ThriftField(id = 46)
  public Map<Double, String> aDoubleKeyMap;
  @ThriftField(id = 47)
  public Map<String, String> aStringKeyMap;
  @ThriftField(id = 48)
  public Map<BonkField, String> aStructKeyMap;

  @ThriftField(id = 100)
  public Set<List<Map<String, BonkField>>> aSetOfListsOfMaps;
  @ThriftField(id = 101)
  public Map<List<String>, Set<BonkField>> aMapOfListToSet;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    final OneOfEverything that = (OneOfEverything) o;

    if (aBoolean != that.aBoolean) {
      return false;
    }
    if (aByte != that.aByte) {
      return false;
    }
    if (Double.compare(that.aDouble, aDouble) != 0) {
      return false;
    }
    if (aInt != that.aInt) {
      return false;
    }
    if (aLong != that.aLong) {
      return false;
    }
    if (aShort != that.aShort) {
      return false;
    }
    if (aBooleanKeyMap != null ? !aBooleanKeyMap.equals(that.aBooleanKeyMap) : that.aBooleanKeyMap != null) {
      return false;
    }
    if (aBooleanList != null ? !aBooleanList.equals(that.aBooleanList) : that.aBooleanList != null) {
      return false;
    }
    if (aBooleanSet != null ? !aBooleanSet.equals(that.aBooleanSet) : that.aBooleanSet != null) {
      return false;
    }
    if (aBooleanValueMap != null ? !aBooleanValueMap.equals(that.aBooleanValueMap) : that.aBooleanValueMap != null) {
      return false;
    }
    if (aByteKeyMap != null ? !aByteKeyMap.equals(that.aByteKeyMap) : that.aByteKeyMap != null) {
      return false;
    }
    if (aByteList != null ? !aByteList.equals(that.aByteList) : that.aByteList != null) {
      return false;
    }
    if (aByteSet != null ? !aByteSet.equals(that.aByteSet) : that.aByteSet != null) {
      return false;
    }
    if (aByteValueMap != null ? !aByteValueMap.equals(that.aByteValueMap) : that.aByteValueMap != null) {
      return false;
    }
    if (aDoubleKeyMap != null ? !aDoubleKeyMap.equals(that.aDoubleKeyMap) : that.aDoubleKeyMap != null) {
      return false;
    }
    if (aDoubleList != null ? !aDoubleList.equals(that.aDoubleList) : that.aDoubleList != null) {
      return false;
    }
    if (aDoubleSet != null ? !aDoubleSet.equals(that.aDoubleSet) : that.aDoubleSet != null) {
      return false;
    }
    if (aDoubleValueMap != null ? !aDoubleValueMap.equals(that.aDoubleValueMap) : that.aDoubleValueMap != null) {
      return false;
    }
    if (aIntegerKeyMap != null ? !aIntegerKeyMap.equals(that.aIntegerKeyMap) : that.aIntegerKeyMap != null) {
      return false;
    }
    if (aIntegerList != null ? !aIntegerList.equals(that.aIntegerList) : that.aIntegerList != null) {
      return false;
    }
    if (aIntegerSet != null ? !aIntegerSet.equals(that.aIntegerSet) : that.aIntegerSet != null) {
      return false;
    }
    if (aIntegerValueMap != null ? !aIntegerValueMap.equals(that.aIntegerValueMap) : that.aIntegerValueMap != null) {
      return false;
    }
    if (aLongKeyMap != null ? !aLongKeyMap.equals(that.aLongKeyMap) : that.aLongKeyMap != null) {
      return false;
    }
    if (aLongList != null ? !aLongList.equals(that.aLongList) : that.aLongList != null) {
      return false;
    }
    if (aLongSet != null ? !aLongSet.equals(that.aLongSet) : that.aLongSet != null) {
      return false;
    }
    if (aLongValueMap != null ? !aLongValueMap.equals(that.aLongValueMap) : that.aLongValueMap != null) {
      return false;
    }
    if (aMapOfListToSet != null ? !aMapOfListToSet.equals(that.aMapOfListToSet) : that.aMapOfListToSet != null) {
      return false;
    }
    if (aSetOfListsOfMaps != null ? !aSetOfListsOfMaps.equals(that.aSetOfListsOfMaps) : that.aSetOfListsOfMaps != null) {
      return false;
    }
    if (aShortKeyMap != null ? !aShortKeyMap.equals(that.aShortKeyMap) : that.aShortKeyMap != null) {
      return false;
    }
    if (aShortList != null ? !aShortList.equals(that.aShortList) : that.aShortList != null) {
      return false;
    }
    if (aShortSet != null ? !aShortSet.equals(that.aShortSet) : that.aShortSet != null) {
      return false;
    }
    if (aShortValueMap != null ? !aShortValueMap.equals(that.aShortValueMap) : that.aShortValueMap != null) {
      return false;
    }
    if (aString != null ? !aString.equals(that.aString) : that.aString != null) {
      return false;
    }
    if (aStringKeyMap != null ? !aStringKeyMap.equals(that.aStringKeyMap) : that.aStringKeyMap != null) {
      return false;
    }
    if (aStringList != null ? !aStringList.equals(that.aStringList) : that.aStringList != null) {
      return false;
    }
    if (aStringSet != null ? !aStringSet.equals(that.aStringSet) : that.aStringSet != null) {
      return false;
    }
    if (aStringValueMap != null ? !aStringValueMap.equals(that.aStringValueMap) : that.aStringValueMap != null) {
      return false;
    }
    if (aStruct != null ? !aStruct.equals(that.aStruct) : that.aStruct != null) {
      return false;
    }
    if (aStructKeyMap != null ? !aStructKeyMap.equals(that.aStructKeyMap) : that.aStructKeyMap != null) {
      return false;
    }
    if (aStructList != null ? !aStructList.equals(that.aStructList) : that.aStructList != null) {
      return false;
    }
    if (aStructSet != null ? !aStructSet.equals(that.aStructSet) : that.aStructSet != null) {
      return false;
    }
    if (aStructValueMap != null ? !aStructValueMap.equals(that.aStructValueMap) : that.aStructValueMap != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result;
    long temp;
    result = (aBoolean ? 1 : 0);
    result = 31 * result + (int) aByte;
    result = 31 * result + (int) aShort;
    result = 31 * result + aInt;
    result = 31 * result + (int) (aLong ^ (aLong >>> 32));
    temp = aDouble != +0.0d ? Double.doubleToLongBits(aDouble) : 0L;
    result = 31 * result + (int) (temp ^ (temp >>> 32));
    result = 31 * result + (aString != null ? aString.hashCode() : 0);
    result = 31 * result + (aStruct != null ? aStruct.hashCode() : 0);
    result = 31 * result + (aBooleanSet != null ? aBooleanSet.hashCode() : 0);
    result = 31 * result + (aByteSet != null ? aByteSet.hashCode() : 0);
    result = 31 * result + (aShortSet != null ? aShortSet.hashCode() : 0);
    result = 31 * result + (aIntegerSet != null ? aIntegerSet.hashCode() : 0);
    result = 31 * result + (aLongSet != null ? aLongSet.hashCode() : 0);
    result = 31 * result + (aDoubleSet != null ? aDoubleSet.hashCode() : 0);
    result = 31 * result + (aStringSet != null ? aStringSet.hashCode() : 0);
    result = 31 * result + (aStructSet != null ? aStructSet.hashCode() : 0);
    result = 31 * result + (aBooleanList != null ? aBooleanList.hashCode() : 0);
    result = 31 * result + (aByteList != null ? aByteList.hashCode() : 0);
    result = 31 * result + (aShortList != null ? aShortList.hashCode() : 0);
    result = 31 * result + (aIntegerList != null ? aIntegerList.hashCode() : 0);
    result = 31 * result + (aLongList != null ? aLongList.hashCode() : 0);
    result = 31 * result + (aDoubleList != null ? aDoubleList.hashCode() : 0);
    result = 31 * result + (aStringList != null ? aStringList.hashCode() : 0);
    result = 31 * result + (aStructList != null ? aStructList.hashCode() : 0);
    result = 31 * result + (aBooleanValueMap != null ? aBooleanValueMap.hashCode() : 0);
    result = 31 * result + (aByteValueMap != null ? aByteValueMap.hashCode() : 0);
    result = 31 * result + (aShortValueMap != null ? aShortValueMap.hashCode() : 0);
    result = 31 * result + (aIntegerValueMap != null ? aIntegerValueMap.hashCode() : 0);
    result = 31 * result + (aLongValueMap != null ? aLongValueMap.hashCode() : 0);
    result = 31 * result + (aDoubleValueMap != null ? aDoubleValueMap.hashCode() : 0);
    result = 31 * result + (aStringValueMap != null ? aStringValueMap.hashCode() : 0);
    result = 31 * result + (aStructValueMap != null ? aStructValueMap.hashCode() : 0);
    result = 31 * result + (aBooleanKeyMap != null ? aBooleanKeyMap.hashCode() : 0);
    result = 31 * result + (aByteKeyMap != null ? aByteKeyMap.hashCode() : 0);
    result = 31 * result + (aShortKeyMap != null ? aShortKeyMap.hashCode() : 0);
    result = 31 * result + (aIntegerKeyMap != null ? aIntegerKeyMap.hashCode() : 0);
    result = 31 * result + (aLongKeyMap != null ? aLongKeyMap.hashCode() : 0);
    result = 31 * result + (aDoubleKeyMap != null ? aDoubleKeyMap.hashCode() : 0);
    result = 31 * result + (aStringKeyMap != null ? aStringKeyMap.hashCode() : 0);
    result = 31 * result + (aStructKeyMap != null ? aStructKeyMap.hashCode() : 0);
    result = 31 * result + (aSetOfListsOfMaps != null ? aSetOfListsOfMaps.hashCode() : 0);
    result = 31 * result + (aMapOfListToSet != null ? aMapOfListToSet.hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append("OneOfEverything");
    sb.append("{aBoolean=").append(aBoolean);
    sb.append(", aByte=").append(aByte);
    sb.append(", aShort=").append(aShort);
    sb.append(", aInt=").append(aInt);
    sb.append(", aLong=").append(aLong);
    sb.append(", aDouble=").append(aDouble);
    sb.append(", aString='").append(aString).append('\'');
    sb.append(", aStruct=").append(aStruct);
    sb.append(", aBooleanSet=").append(aBooleanSet);
    sb.append(", aByteSet=").append(aByteSet);
    sb.append(", aShortSet=").append(aShortSet);
    sb.append(", aIntegerSet=").append(aIntegerSet);
    sb.append(", aLongSet=").append(aLongSet);
    sb.append(", aDoubleSet=").append(aDoubleSet);
    sb.append(", aStringSet=").append(aStringSet);
    sb.append(", aStructSet=").append(aStructSet);
    sb.append(", aBooleanList=").append(aBooleanList);
    sb.append(", aByteList=").append(aByteList);
    sb.append(", aShortList=").append(aShortList);
    sb.append(", aIntegerList=").append(aIntegerList);
    sb.append(", aLongList=").append(aLongList);
    sb.append(", aDoubleList=").append(aDoubleList);
    sb.append(", aStringList=").append(aStringList);
    sb.append(", aStructList=").append(aStructList);
    sb.append(", aBooleanValueMap=").append(aBooleanValueMap);
    sb.append(", aByteValueMap=").append(aByteValueMap);
    sb.append(", aShortValueMap=").append(aShortValueMap);
    sb.append(", aIntegerValueMap=").append(aIntegerValueMap);
    sb.append(", aLongValueMap=").append(aLongValueMap);
    sb.append(", aDoubleValueMap=").append(aDoubleValueMap);
    sb.append(", aStringValueMap=").append(aStringValueMap);
    sb.append(", aStructValueMap=").append(aStructValueMap);
    sb.append(", aBooleanKeyMap=").append(aBooleanKeyMap);
    sb.append(", aByteKeyMap=").append(aByteKeyMap);
    sb.append(", aShortKeyMap=").append(aShortKeyMap);
    sb.append(", aIntegerKeyMap=").append(aIntegerKeyMap);
    sb.append(", aLongKeyMap=").append(aLongKeyMap);
    sb.append(", aDoubleKeyMap=").append(aDoubleKeyMap);
    sb.append(", aStringKeyMap=").append(aStringKeyMap);
    sb.append(", aStructKeyMap=").append(aStructKeyMap);
    sb.append(", aSetOfListsOfMaps=").append(aSetOfListsOfMaps);
    sb.append(", aMapOfListToSet=").append(aMapOfListToSet);
    sb.append('}');
    return sb.toString();
  }
}