// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HousingSite.proto

package com.group5;

public final class HousingSite {
  private HousingSite() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_GetUserByIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_GetUserByIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_GetUserByIdResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_GetUserByIdResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_PostHouseListingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_PostHouseListingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_group5_PostHouseListingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_group5_PostHouseListingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021HousingSite.proto\022\ncom.group5\"$\n\022GetUs" +
      "erByIdRequest\022\016\n\006userId\030\001 \001(\003\"O\n\023GetUser" +
      "ByIdResponse\022\n\n\002id\030\001 \001(\003\022\014\n\004name\030\002 \001(\t\022\017" +
      "\n\007surname\030\003 \001(\t\022\r\n\005email\030\004 \001(\t\"\255\002\n\027PostH" +
      "ouseListingRequest\022\n\n\002id\030\001 \001(\003\022\016\n\006street" +
      "\030\002 \001(\t\022\022\n\npostNumber\030\003 \001(\003\022\014\n\004city\030\004 \001(\t" +
      "\022\017\n\007houseNo\030\005 \001(\003\022\027\n\017constructorYear\030\006 \001" +
      "(\003\022\023\n\013lastRebuilt\030\007 \001(\003\022\025\n\rhasInspection" +
      "\030\010 \001(\010\022\022\n\ngroundArea\030\t \001(\001\022\021\n\tfloorArea\030" +
      "\n \001(\001\022\027\n\017imageBase64Data\030\013 \001(\t\022\030\n\020imageC" +
      "ontentType\030\014 \001(\t\022\025\n\rimageFileName\030\r \001(\t\022" +
      "\r\n\005price\030\016 \001(\001\"&\n\030PostHouseListingRespon" +
      "se\022\n\n\002id\030\001 \001(\0032q\n\020PostHouseListing\022]\n\020po" +
      "stHouseListing\022#.com.group5.PostHouseLis" +
      "tingRequest\032$.com.group5.PostHouseListin" +
      "gResponse2]\n\013UserService\022N\n\013getUserById\022" +
      "\036.com.group5.GetUserByIdRequest\032\037.com.gr" +
      "oup5.GetUserByIdResponseB\002P\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_com_group5_GetUserByIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_group5_GetUserByIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_GetUserByIdRequest_descriptor,
        new java.lang.String[] { "UserId", });
    internal_static_com_group5_GetUserByIdResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_group5_GetUserByIdResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_GetUserByIdResponse_descriptor,
        new java.lang.String[] { "Id", "Name", "Surname", "Email", });
    internal_static_com_group5_PostHouseListingRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_group5_PostHouseListingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_PostHouseListingRequest_descriptor,
        new java.lang.String[] { "Id", "Street", "PostNumber", "City", "HouseNo", "ConstructorYear", "LastRebuilt", "HasInspection", "GroundArea", "FloorArea", "ImageBase64Data", "ImageContentType", "ImageFileName", "Price", });
    internal_static_com_group5_PostHouseListingResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_com_group5_PostHouseListingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_group5_PostHouseListingResponse_descriptor,
        new java.lang.String[] { "Id", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
