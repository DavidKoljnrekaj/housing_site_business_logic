// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Listing.proto

package com.group5.proto.Listing;

public interface CreateHouseListingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.group5.proto.Listing.CreateHouseListingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string street = 1;</code>
   * @return The street.
   */
  java.lang.String getStreet();
  /**
   * <code>string street = 1;</code>
   * @return The bytes for street.
   */
  com.google.protobuf.ByteString
      getStreetBytes();

  /**
   * <code>int32 postNumber = 2;</code>
   * @return The postNumber.
   */
  int getPostNumber();

  /**
   * <code>string city = 3;</code>
   * @return The city.
   */
  java.lang.String getCity();
  /**
   * <code>string city = 3;</code>
   * @return The bytes for city.
   */
  com.google.protobuf.ByteString
      getCityBytes();

  /**
   * <code>int32 houseNo = 4;</code>
   * @return The houseNo.
   */
  int getHouseNo();

  /**
   * <code>int32 constructionYear = 5;</code>
   * @return The constructionYear.
   */
  int getConstructionYear();

  /**
   * <code>int32 lastRebuilt = 6;</code>
   * @return The lastRebuilt.
   */
  int getLastRebuilt();

  /**
   * <code>bool hasInspection = 7;</code>
   * @return The hasInspection.
   */
  boolean getHasInspection();

  /**
   * <code>double groundArea = 8;</code>
   * @return The groundArea.
   */
  double getGroundArea();

  /**
   * <code>double floorArea = 9;</code>
   * @return The floorArea.
   */
  double getFloorArea();

  /**
   * <code>repeated string imageBase64Data = 10;</code>
   * @return A list containing the imageBase64Data.
   */
  java.util.List<java.lang.String>
      getImageBase64DataList();
  /**
   * <code>repeated string imageBase64Data = 10;</code>
   * @return The count of imageBase64Data.
   */
  int getImageBase64DataCount();
  /**
   * <code>repeated string imageBase64Data = 10;</code>
   * @param index The index of the element to return.
   * @return The imageBase64Data at the given index.
   */
  java.lang.String getImageBase64Data(int index);
  /**
   * <code>repeated string imageBase64Data = 10;</code>
   * @param index The index of the value to return.
   * @return The bytes of the imageBase64Data at the given index.
   */
  com.google.protobuf.ByteString
      getImageBase64DataBytes(int index);

  /**
   * <code>repeated string imageContentType = 11;</code>
   * @return A list containing the imageContentType.
   */
  java.util.List<java.lang.String>
      getImageContentTypeList();
  /**
   * <code>repeated string imageContentType = 11;</code>
   * @return The count of imageContentType.
   */
  int getImageContentTypeCount();
  /**
   * <code>repeated string imageContentType = 11;</code>
   * @param index The index of the element to return.
   * @return The imageContentType at the given index.
   */
  java.lang.String getImageContentType(int index);
  /**
   * <code>repeated string imageContentType = 11;</code>
   * @param index The index of the value to return.
   * @return The bytes of the imageContentType at the given index.
   */
  com.google.protobuf.ByteString
      getImageContentTypeBytes(int index);

  /**
   * <code>repeated string imageFileName = 12;</code>
   * @return A list containing the imageFileName.
   */
  java.util.List<java.lang.String>
      getImageFileNameList();
  /**
   * <code>repeated string imageFileName = 12;</code>
   * @return The count of imageFileName.
   */
  int getImageFileNameCount();
  /**
   * <code>repeated string imageFileName = 12;</code>
   * @param index The index of the element to return.
   * @return The imageFileName at the given index.
   */
  java.lang.String getImageFileName(int index);
  /**
   * <code>repeated string imageFileName = 12;</code>
   * @param index The index of the value to return.
   * @return The bytes of the imageFileName at the given index.
   */
  com.google.protobuf.ByteString
      getImageFileNameBytes(int index);

  /**
   * <code>double price = 13;</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>string userEmail = 14;</code>
   * @return The userEmail.
   */
  java.lang.String getUserEmail();
  /**
   * <code>string userEmail = 14;</code>
   * @return The bytes for userEmail.
   */
  com.google.protobuf.ByteString
      getUserEmailBytes();
}
