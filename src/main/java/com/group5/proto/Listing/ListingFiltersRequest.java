// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Listing.proto

package com.group5.proto.Listing;

/**
 * Protobuf type {@code com.group5.proto.Listing.ListingFiltersRequest}
 */
public final class ListingFiltersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.group5.proto.Listing.ListingFiltersRequest)
    ListingFiltersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListingFiltersRequest.newBuilder() to construct.
  private ListingFiltersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListingFiltersRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListingFiltersRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListingFiltersRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 8: {
            bitField0_ |= 0x00000001;
            postNumber_ = input.readInt64();
            break;
          }
          case 16: {
            bitField0_ |= 0x00000002;
            maxPrice_ = input.readInt64();
            break;
          }
          case 24: {
            bitField0_ |= 0x00000004;
            minArea_ = input.readInt64();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.group5.proto.Listing.Listing.internal_static_com_group5_proto_Listing_ListingFiltersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.group5.proto.Listing.Listing.internal_static_com_group5_proto_Listing_ListingFiltersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.group5.proto.Listing.ListingFiltersRequest.class, com.group5.proto.Listing.ListingFiltersRequest.Builder.class);
  }

  private int bitField0_;
  public static final int POSTNUMBER_FIELD_NUMBER = 1;
  private long postNumber_;
  /**
   * <code>optional int64 postNumber = 1;</code>
   * @return Whether the postNumber field is set.
   */
  @java.lang.Override
  public boolean hasPostNumber() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 postNumber = 1;</code>
   * @return The postNumber.
   */
  @java.lang.Override
  public long getPostNumber() {
    return postNumber_;
  }

  public static final int MAXPRICE_FIELD_NUMBER = 2;
  private long maxPrice_;
  /**
   * <code>optional int64 maxPrice = 2;</code>
   * @return Whether the maxPrice field is set.
   */
  @java.lang.Override
  public boolean hasMaxPrice() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int64 maxPrice = 2;</code>
   * @return The maxPrice.
   */
  @java.lang.Override
  public long getMaxPrice() {
    return maxPrice_;
  }

  public static final int MINAREA_FIELD_NUMBER = 3;
  private long minArea_;
  /**
   * <code>optional int64 minArea = 3;</code>
   * @return Whether the minArea field is set.
   */
  @java.lang.Override
  public boolean hasMinArea() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   * <code>optional int64 minArea = 3;</code>
   * @return The minArea.
   */
  @java.lang.Override
  public long getMinArea() {
    return minArea_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(1, postNumber_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(2, maxPrice_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeInt64(3, minArea_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, postNumber_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, maxPrice_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, minArea_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.group5.proto.Listing.ListingFiltersRequest)) {
      return super.equals(obj);
    }
    com.group5.proto.Listing.ListingFiltersRequest other = (com.group5.proto.Listing.ListingFiltersRequest) obj;

    if (hasPostNumber() != other.hasPostNumber()) return false;
    if (hasPostNumber()) {
      if (getPostNumber()
          != other.getPostNumber()) return false;
    }
    if (hasMaxPrice() != other.hasMaxPrice()) return false;
    if (hasMaxPrice()) {
      if (getMaxPrice()
          != other.getMaxPrice()) return false;
    }
    if (hasMinArea() != other.hasMinArea()) return false;
    if (hasMinArea()) {
      if (getMinArea()
          != other.getMinArea()) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasPostNumber()) {
      hash = (37 * hash) + POSTNUMBER_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPostNumber());
    }
    if (hasMaxPrice()) {
      hash = (37 * hash) + MAXPRICE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMaxPrice());
    }
    if (hasMinArea()) {
      hash = (37 * hash) + MINAREA_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMinArea());
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.group5.proto.Listing.ListingFiltersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.group5.proto.Listing.ListingFiltersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.group5.proto.Listing.ListingFiltersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.group5.proto.Listing.ListingFiltersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.group5.proto.Listing.ListingFiltersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.group5.proto.Listing.ListingFiltersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.group5.proto.Listing.ListingFiltersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.group5.proto.Listing.ListingFiltersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.group5.proto.Listing.ListingFiltersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.group5.proto.Listing.ListingFiltersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.group5.proto.Listing.ListingFiltersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.group5.proto.Listing.ListingFiltersRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.group5.proto.Listing.ListingFiltersRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code com.group5.proto.Listing.ListingFiltersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.group5.proto.Listing.ListingFiltersRequest)
      com.group5.proto.Listing.ListingFiltersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.group5.proto.Listing.Listing.internal_static_com_group5_proto_Listing_ListingFiltersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.group5.proto.Listing.Listing.internal_static_com_group5_proto_Listing_ListingFiltersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.group5.proto.Listing.ListingFiltersRequest.class, com.group5.proto.Listing.ListingFiltersRequest.Builder.class);
    }

    // Construct using com.group5.proto.Listing.ListingFiltersRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      postNumber_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000001);
      maxPrice_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000002);
      minArea_ = 0L;
      bitField0_ = (bitField0_ & ~0x00000004);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.group5.proto.Listing.Listing.internal_static_com_group5_proto_Listing_ListingFiltersRequest_descriptor;
    }

    @java.lang.Override
    public com.group5.proto.Listing.ListingFiltersRequest getDefaultInstanceForType() {
      return com.group5.proto.Listing.ListingFiltersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.group5.proto.Listing.ListingFiltersRequest build() {
      com.group5.proto.Listing.ListingFiltersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.group5.proto.Listing.ListingFiltersRequest buildPartial() {
      com.group5.proto.Listing.ListingFiltersRequest result = new com.group5.proto.Listing.ListingFiltersRequest(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.postNumber_ = postNumber_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxPrice_ = maxPrice_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.minArea_ = minArea_;
        to_bitField0_ |= 0x00000004;
      }
      result.bitField0_ = to_bitField0_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.group5.proto.Listing.ListingFiltersRequest) {
        return mergeFrom((com.group5.proto.Listing.ListingFiltersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.group5.proto.Listing.ListingFiltersRequest other) {
      if (other == com.group5.proto.Listing.ListingFiltersRequest.getDefaultInstance()) return this;
      if (other.hasPostNumber()) {
        setPostNumber(other.getPostNumber());
      }
      if (other.hasMaxPrice()) {
        setMaxPrice(other.getMaxPrice());
      }
      if (other.hasMinArea()) {
        setMinArea(other.getMinArea());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.group5.proto.Listing.ListingFiltersRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.group5.proto.Listing.ListingFiltersRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private long postNumber_ ;
    /**
     * <code>optional int64 postNumber = 1;</code>
     * @return Whether the postNumber field is set.
     */
    @java.lang.Override
    public boolean hasPostNumber() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 postNumber = 1;</code>
     * @return The postNumber.
     */
    @java.lang.Override
    public long getPostNumber() {
      return postNumber_;
    }
    /**
     * <code>optional int64 postNumber = 1;</code>
     * @param value The postNumber to set.
     * @return This builder for chaining.
     */
    public Builder setPostNumber(long value) {
      bitField0_ |= 0x00000001;
      postNumber_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 postNumber = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPostNumber() {
      bitField0_ = (bitField0_ & ~0x00000001);
      postNumber_ = 0L;
      onChanged();
      return this;
    }

    private long maxPrice_ ;
    /**
     * <code>optional int64 maxPrice = 2;</code>
     * @return Whether the maxPrice field is set.
     */
    @java.lang.Override
    public boolean hasMaxPrice() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int64 maxPrice = 2;</code>
     * @return The maxPrice.
     */
    @java.lang.Override
    public long getMaxPrice() {
      return maxPrice_;
    }
    /**
     * <code>optional int64 maxPrice = 2;</code>
     * @param value The maxPrice to set.
     * @return This builder for chaining.
     */
    public Builder setMaxPrice(long value) {
      bitField0_ |= 0x00000002;
      maxPrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 maxPrice = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxPrice() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxPrice_ = 0L;
      onChanged();
      return this;
    }

    private long minArea_ ;
    /**
     * <code>optional int64 minArea = 3;</code>
     * @return Whether the minArea field is set.
     */
    @java.lang.Override
    public boolean hasMinArea() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int64 minArea = 3;</code>
     * @return The minArea.
     */
    @java.lang.Override
    public long getMinArea() {
      return minArea_;
    }
    /**
     * <code>optional int64 minArea = 3;</code>
     * @param value The minArea to set.
     * @return This builder for chaining.
     */
    public Builder setMinArea(long value) {
      bitField0_ |= 0x00000004;
      minArea_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 minArea = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinArea() {
      bitField0_ = (bitField0_ & ~0x00000004);
      minArea_ = 0L;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:com.group5.proto.Listing.ListingFiltersRequest)
  }

  // @@protoc_insertion_point(class_scope:com.group5.proto.Listing.ListingFiltersRequest)
  private static final com.group5.proto.Listing.ListingFiltersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.group5.proto.Listing.ListingFiltersRequest();
  }

  public static com.group5.proto.Listing.ListingFiltersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListingFiltersRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListingFiltersRequest>() {
    @java.lang.Override
    public ListingFiltersRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListingFiltersRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListingFiltersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListingFiltersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.group5.proto.Listing.ListingFiltersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

