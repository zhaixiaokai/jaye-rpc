// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PayInfo.proto

package com.xxxx.entity.pb;

public final class PayInfo {
  private PayInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface TestPayInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TestPayInfo)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <pre>
     * 支付相关的字段信息
     * </pre>
     *
     * <code>required string payid = 1;</code>
     */
    boolean hasPayid();
    /**
     * <pre>
     * 支付相关的字段信息
     * </pre>
     *
     * <code>required string payid = 1;</code>
     */
    java.lang.String getPayid();
    /**
     * <pre>
     * 支付相关的字段信息
     * </pre>
     *
     * <code>required string payid = 1;</code>
     */
    com.google.protobuf.ByteString
        getPayidBytes();

    /**
     * <pre>
     * optional 为可选参数
     * </pre>
     *
     * <code>optional string goodinfo = 2;</code>
     */
    boolean hasGoodinfo();
    /**
     * <pre>
     * optional 为可选参数
     * </pre>
     *
     * <code>optional string goodinfo = 2;</code>
     */
    java.lang.String getGoodinfo();
    /**
     * <pre>
     * optional 为可选参数
     * </pre>
     *
     * <code>optional string goodinfo = 2;</code>
     */
    com.google.protobuf.ByteString
        getGoodinfoBytes();

    /**
     * <pre>
     * required为必填参数
     * </pre>
     *
     * <code>required string prepayid = 3;</code>
     */
    boolean hasPrepayid();
    /**
     * <pre>
     * required为必填参数
     * </pre>
     *
     * <code>required string prepayid = 3;</code>
     */
    java.lang.String getPrepayid();
    /**
     * <pre>
     * required为必填参数
     * </pre>
     *
     * <code>required string prepayid = 3;</code>
     */
    com.google.protobuf.ByteString
        getPrepayidBytes();

    /**
     * <code>optional string mode = 4;</code>
     */
    boolean hasMode();
    /**
     * <code>optional string mode = 4;</code>
     */
    java.lang.String getMode();
    /**
     * <code>optional string mode = 4;</code>
     */
    com.google.protobuf.ByteString
        getModeBytes();

    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    java.util.List<java.lang.String>
        getExtraList();
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    int getExtraCount();
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    java.lang.String getExtra(int index);
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    com.google.protobuf.ByteString
        getExtraBytes(int index);
  }
  /**
   * Protobuf type {@code TestPayInfo}
   */
  public  static final class TestPayInfo extends
      com.google.protobuf.GeneratedMessageLite<
          TestPayInfo, TestPayInfo.Builder> implements
      // @@protoc_insertion_point(message_implements:TestPayInfo)
      TestPayInfoOrBuilder {
    private TestPayInfo() {
      payid_ = "";
      goodinfo_ = "";
      prepayid_ = "";
      mode_ = "";
      extra_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }
    private int bitField0_;
    public static final int PAYID_FIELD_NUMBER = 1;
    private java.lang.String payid_;
    /**
     * <pre>
     * 支付相关的字段信息
     * </pre>
     *
     * <code>required string payid = 1;</code>
     */
    @java.lang.Override
    public boolean hasPayid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * 支付相关的字段信息
     * </pre>
     *
     * <code>required string payid = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getPayid() {
      return payid_;
    }
    /**
     * <pre>
     * 支付相关的字段信息
     * </pre>
     *
     * <code>required string payid = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPayidBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(payid_);
    }
    /**
     * <pre>
     * 支付相关的字段信息
     * </pre>
     *
     * <code>required string payid = 1;</code>
     */
    private void setPayid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      payid_ = value;
    }
    /**
     * <pre>
     * 支付相关的字段信息
     * </pre>
     *
     * <code>required string payid = 1;</code>
     */
    private void clearPayid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      payid_ = getDefaultInstance().getPayid();
    }
    /**
     * <pre>
     * 支付相关的字段信息
     * </pre>
     *
     * <code>required string payid = 1;</code>
     */
    private void setPayidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      payid_ = value.toStringUtf8();
    }

    public static final int GOODINFO_FIELD_NUMBER = 2;
    private java.lang.String goodinfo_;
    /**
     * <pre>
     * optional 为可选参数
     * </pre>
     *
     * <code>optional string goodinfo = 2;</code>
     */
    @java.lang.Override
    public boolean hasGoodinfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * optional 为可选参数
     * </pre>
     *
     * <code>optional string goodinfo = 2;</code>
     */
    @java.lang.Override
    public java.lang.String getGoodinfo() {
      return goodinfo_;
    }
    /**
     * <pre>
     * optional 为可选参数
     * </pre>
     *
     * <code>optional string goodinfo = 2;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getGoodinfoBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(goodinfo_);
    }
    /**
     * <pre>
     * optional 为可选参数
     * </pre>
     *
     * <code>optional string goodinfo = 2;</code>
     */
    private void setGoodinfo(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      goodinfo_ = value;
    }
    /**
     * <pre>
     * optional 为可选参数
     * </pre>
     *
     * <code>optional string goodinfo = 2;</code>
     */
    private void clearGoodinfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      goodinfo_ = getDefaultInstance().getGoodinfo();
    }
    /**
     * <pre>
     * optional 为可选参数
     * </pre>
     *
     * <code>optional string goodinfo = 2;</code>
     */
    private void setGoodinfoBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
      goodinfo_ = value.toStringUtf8();
    }

    public static final int PREPAYID_FIELD_NUMBER = 3;
    private java.lang.String prepayid_;
    /**
     * <pre>
     * required为必填参数
     * </pre>
     *
     * <code>required string prepayid = 3;</code>
     */
    @java.lang.Override
    public boolean hasPrepayid() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * required为必填参数
     * </pre>
     *
     * <code>required string prepayid = 3;</code>
     */
    @java.lang.Override
    public java.lang.String getPrepayid() {
      return prepayid_;
    }
    /**
     * <pre>
     * required为必填参数
     * </pre>
     *
     * <code>required string prepayid = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getPrepayidBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(prepayid_);
    }
    /**
     * <pre>
     * required为必填参数
     * </pre>
     *
     * <code>required string prepayid = 3;</code>
     */
    private void setPrepayid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      prepayid_ = value;
    }
    /**
     * <pre>
     * required为必填参数
     * </pre>
     *
     * <code>required string prepayid = 3;</code>
     */
    private void clearPrepayid() {
      bitField0_ = (bitField0_ & ~0x00000004);
      prepayid_ = getDefaultInstance().getPrepayid();
    }
    /**
     * <pre>
     * required为必填参数
     * </pre>
     *
     * <code>required string prepayid = 3;</code>
     */
    private void setPrepayidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      prepayid_ = value.toStringUtf8();
    }

    public static final int MODE_FIELD_NUMBER = 4;
    private java.lang.String mode_;
    /**
     * <code>optional string mode = 4;</code>
     */
    @java.lang.Override
    public boolean hasMode() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional string mode = 4;</code>
     */
    @java.lang.Override
    public java.lang.String getMode() {
      return mode_;
    }
    /**
     * <code>optional string mode = 4;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getModeBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(mode_);
    }
    /**
     * <code>optional string mode = 4;</code>
     */
    private void setMode(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      mode_ = value;
    }
    /**
     * <code>optional string mode = 4;</code>
     */
    private void clearMode() {
      bitField0_ = (bitField0_ & ~0x00000008);
      mode_ = getDefaultInstance().getMode();
    }
    /**
     * <code>optional string mode = 4;</code>
     */
    private void setModeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
      mode_ = value.toStringUtf8();
    }

    public static final int EXTRA_FIELD_NUMBER = 5;
    private com.google.protobuf.Internal.ProtobufList<java.lang.String> extra_;
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    @java.lang.Override
    public java.util.List<java.lang.String> getExtraList() {
      return extra_;
    }
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    @java.lang.Override
    public int getExtraCount() {
      return extra_.size();
    }
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    @java.lang.Override
    public java.lang.String getExtra(int index) {
      return extra_.get(index);
    }
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getExtraBytes(int index) {
      return com.google.protobuf.ByteString.copyFromUtf8(
          extra_.get(index));
    }
    private void ensureExtraIsMutable() {
      if (!extra_.isModifiable()) {
        extra_ =
            com.google.protobuf.GeneratedMessageLite.mutableCopy(extra_);
       }
    }
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    private void setExtra(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureExtraIsMutable();
      extra_.set(index, value);
    }
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    private void addExtra(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureExtraIsMutable();
      extra_.add(value);
    }
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    private void addAllExtra(
        java.lang.Iterable<java.lang.String> values) {
      ensureExtraIsMutable();
      com.google.protobuf.AbstractMessageLite.addAll(
          values, extra_);
    }
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    private void clearExtra() {
      extra_ = com.google.protobuf.GeneratedMessageLite.emptyProtobufList();
    }
    /**
     * <pre>
     *	optional int  userid = 5;
     * </pre>
     *
     * <code>repeated string extra = 5;</code>
     */
    private void addExtraBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureExtraIsMutable();
      extra_.add(value.toStringUtf8());
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeString(1, getPayid());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeString(2, getGoodinfo());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeString(3, getPrepayid());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeString(4, getMode());
      }
      for (int i = 0; i < extra_.size(); i++) {
        output.writeString(5, extra_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getPayid());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getGoodinfo());
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getPrepayid());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getMode());
      }
      {
        int dataSize = 0;
        for (int i = 0; i < extra_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeStringSizeNoTag(extra_.get(i));
        }
        size += dataSize;
        size += 1 * getExtraList().size();
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.xxxx.entity.pb.PayInfo.TestPayInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.xxxx.entity.pb.PayInfo.TestPayInfo prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code TestPayInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.xxxx.entity.pb.PayInfo.TestPayInfo, Builder> implements
        // @@protoc_insertion_point(builder_implements:TestPayInfo)
        com.xxxx.entity.pb.PayInfo.TestPayInfoOrBuilder {
      // Construct using com.xxxx.entity.pb.PayInfo.TestPayInfo.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <pre>
       * 支付相关的字段信息
       * </pre>
       *
       * <code>required string payid = 1;</code>
       */
      @java.lang.Override
      public boolean hasPayid() {
        return instance.hasPayid();
      }
      /**
       * <pre>
       * 支付相关的字段信息
       * </pre>
       *
       * <code>required string payid = 1;</code>
       */
      @java.lang.Override
      public java.lang.String getPayid() {
        return instance.getPayid();
      }
      /**
       * <pre>
       * 支付相关的字段信息
       * </pre>
       *
       * <code>required string payid = 1;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getPayidBytes() {
        return instance.getPayidBytes();
      }
      /**
       * <pre>
       * 支付相关的字段信息
       * </pre>
       *
       * <code>required string payid = 1;</code>
       */
      public Builder setPayid(
          java.lang.String value) {
        copyOnWrite();
        instance.setPayid(value);
        return this;
      }
      /**
       * <pre>
       * 支付相关的字段信息
       * </pre>
       *
       * <code>required string payid = 1;</code>
       */
      public Builder clearPayid() {
        copyOnWrite();
        instance.clearPayid();
        return this;
      }
      /**
       * <pre>
       * 支付相关的字段信息
       * </pre>
       *
       * <code>required string payid = 1;</code>
       */
      public Builder setPayidBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPayidBytes(value);
        return this;
      }

      /**
       * <pre>
       * optional 为可选参数
       * </pre>
       *
       * <code>optional string goodinfo = 2;</code>
       */
      @java.lang.Override
      public boolean hasGoodinfo() {
        return instance.hasGoodinfo();
      }
      /**
       * <pre>
       * optional 为可选参数
       * </pre>
       *
       * <code>optional string goodinfo = 2;</code>
       */
      @java.lang.Override
      public java.lang.String getGoodinfo() {
        return instance.getGoodinfo();
      }
      /**
       * <pre>
       * optional 为可选参数
       * </pre>
       *
       * <code>optional string goodinfo = 2;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getGoodinfoBytes() {
        return instance.getGoodinfoBytes();
      }
      /**
       * <pre>
       * optional 为可选参数
       * </pre>
       *
       * <code>optional string goodinfo = 2;</code>
       */
      public Builder setGoodinfo(
          java.lang.String value) {
        copyOnWrite();
        instance.setGoodinfo(value);
        return this;
      }
      /**
       * <pre>
       * optional 为可选参数
       * </pre>
       *
       * <code>optional string goodinfo = 2;</code>
       */
      public Builder clearGoodinfo() {
        copyOnWrite();
        instance.clearGoodinfo();
        return this;
      }
      /**
       * <pre>
       * optional 为可选参数
       * </pre>
       *
       * <code>optional string goodinfo = 2;</code>
       */
      public Builder setGoodinfoBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setGoodinfoBytes(value);
        return this;
      }

      /**
       * <pre>
       * required为必填参数
       * </pre>
       *
       * <code>required string prepayid = 3;</code>
       */
      @java.lang.Override
      public boolean hasPrepayid() {
        return instance.hasPrepayid();
      }
      /**
       * <pre>
       * required为必填参数
       * </pre>
       *
       * <code>required string prepayid = 3;</code>
       */
      @java.lang.Override
      public java.lang.String getPrepayid() {
        return instance.getPrepayid();
      }
      /**
       * <pre>
       * required为必填参数
       * </pre>
       *
       * <code>required string prepayid = 3;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getPrepayidBytes() {
        return instance.getPrepayidBytes();
      }
      /**
       * <pre>
       * required为必填参数
       * </pre>
       *
       * <code>required string prepayid = 3;</code>
       */
      public Builder setPrepayid(
          java.lang.String value) {
        copyOnWrite();
        instance.setPrepayid(value);
        return this;
      }
      /**
       * <pre>
       * required为必填参数
       * </pre>
       *
       * <code>required string prepayid = 3;</code>
       */
      public Builder clearPrepayid() {
        copyOnWrite();
        instance.clearPrepayid();
        return this;
      }
      /**
       * <pre>
       * required为必填参数
       * </pre>
       *
       * <code>required string prepayid = 3;</code>
       */
      public Builder setPrepayidBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPrepayidBytes(value);
        return this;
      }

      /**
       * <code>optional string mode = 4;</code>
       */
      @java.lang.Override
      public boolean hasMode() {
        return instance.hasMode();
      }
      /**
       * <code>optional string mode = 4;</code>
       */
      @java.lang.Override
      public java.lang.String getMode() {
        return instance.getMode();
      }
      /**
       * <code>optional string mode = 4;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getModeBytes() {
        return instance.getModeBytes();
      }
      /**
       * <code>optional string mode = 4;</code>
       */
      public Builder setMode(
          java.lang.String value) {
        copyOnWrite();
        instance.setMode(value);
        return this;
      }
      /**
       * <code>optional string mode = 4;</code>
       */
      public Builder clearMode() {
        copyOnWrite();
        instance.clearMode();
        return this;
      }
      /**
       * <code>optional string mode = 4;</code>
       */
      public Builder setModeBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setModeBytes(value);
        return this;
      }

      /**
       * <pre>
       *	optional int  userid = 5;
       * </pre>
       *
       * <code>repeated string extra = 5;</code>
       */
      @java.lang.Override
      public java.util.List<java.lang.String>
          getExtraList() {
        return java.util.Collections.unmodifiableList(
            instance.getExtraList());
      }
      /**
       * <pre>
       *	optional int  userid = 5;
       * </pre>
       *
       * <code>repeated string extra = 5;</code>
       */
      @java.lang.Override
      public int getExtraCount() {
        return instance.getExtraCount();
      }
      /**
       * <pre>
       *	optional int  userid = 5;
       * </pre>
       *
       * <code>repeated string extra = 5;</code>
       */
      @java.lang.Override
      public java.lang.String getExtra(int index) {
        return instance.getExtra(index);
      }
      /**
       * <pre>
       *	optional int  userid = 5;
       * </pre>
       *
       * <code>repeated string extra = 5;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getExtraBytes(int index) {
        return instance.getExtraBytes(index);
      }
      /**
       * <pre>
       *	optional int  userid = 5;
       * </pre>
       *
       * <code>repeated string extra = 5;</code>
       */
      public Builder setExtra(
          int index, java.lang.String value) {
        copyOnWrite();
        instance.setExtra(index, value);
        return this;
      }
      /**
       * <pre>
       *	optional int  userid = 5;
       * </pre>
       *
       * <code>repeated string extra = 5;</code>
       */
      public Builder addExtra(
          java.lang.String value) {
        copyOnWrite();
        instance.addExtra(value);
        return this;
      }
      /**
       * <pre>
       *	optional int  userid = 5;
       * </pre>
       *
       * <code>repeated string extra = 5;</code>
       */
      public Builder addAllExtra(
          java.lang.Iterable<java.lang.String> values) {
        copyOnWrite();
        instance.addAllExtra(values);
        return this;
      }
      /**
       * <pre>
       *	optional int  userid = 5;
       * </pre>
       *
       * <code>repeated string extra = 5;</code>
       */
      public Builder clearExtra() {
        copyOnWrite();
        instance.clearExtra();
        return this;
      }
      /**
       * <pre>
       *	optional int  userid = 5;
       * </pre>
       *
       * <code>repeated string extra = 5;</code>
       */
      public Builder addExtraBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.addExtraBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:TestPayInfo)
    }
    private byte memoizedIsInitialized = 2;
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.xxxx.entity.pb.PayInfo.TestPayInfo();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case IS_INITIALIZED: {
          byte isInitialized = memoizedIsInitialized;
          if (isInitialized == 1) return DEFAULT_INSTANCE;
          if (isInitialized == 0) return null;

          boolean shouldMemoize = ((Boolean) arg0).booleanValue();
          if (!hasPayid()) {
            return null;
          }
          if (!hasPrepayid()) {
            return null;
          }
          return DEFAULT_INSTANCE;

        }
        case MAKE_IMMUTABLE: {
          extra_.makeImmutable();
          return null;
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.xxxx.entity.pb.PayInfo.TestPayInfo other = (com.xxxx.entity.pb.PayInfo.TestPayInfo) arg1;
          payid_ = visitor.visitString(
              hasPayid(), payid_,
              other.hasPayid(), other.payid_);
          goodinfo_ = visitor.visitString(
              hasGoodinfo(), goodinfo_,
              other.hasGoodinfo(), other.goodinfo_);
          prepayid_ = visitor.visitString(
              hasPrepayid(), prepayid_,
              other.hasPrepayid(), other.prepayid_);
          mode_ = visitor.visitString(
              hasMode(), mode_,
              other.hasMode(), other.mode_);
          extra_= visitor.visitList(extra_, other.extra_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
            bitField0_ |= other.bitField0_;
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
          if (extensionRegistry == null) {
            throw new java.lang.NullPointerException();
          }
          try {
            boolean done = false;
            while (!done) {
              int tag = input.readTag();
              switch (tag) {
                case 0:
                  done = true;
                  break;
                case 10: {
                  java.lang.String s = input.readString();
                  bitField0_ |= 0x00000001;
                  payid_ = s;
                  break;
                }
                case 18: {
                  java.lang.String s = input.readString();
                  bitField0_ |= 0x00000002;
                  goodinfo_ = s;
                  break;
                }
                case 26: {
                  java.lang.String s = input.readString();
                  bitField0_ |= 0x00000004;
                  prepayid_ = s;
                  break;
                }
                case 34: {
                  java.lang.String s = input.readString();
                  bitField0_ |= 0x00000008;
                  mode_ = s;
                  break;
                }
                case 42: {
                  java.lang.String s = input.readString();
                  if (!extra_.isModifiable()) {
                    extra_ =
                        com.google.protobuf.GeneratedMessageLite.mutableCopy(extra_);
                  }
                  extra_.add(s);
                  break;
                }
                default: {
                  if (!parseUnknownField(tag, input)) {
                    done = true;
                  }
                  break;
                }
              }
            }
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw new RuntimeException(e.setUnfinishedMessage(this));
          } catch (java.io.IOException e) {
            throw new RuntimeException(
                new com.google.protobuf.InvalidProtocolBufferException(
                    e.getMessage()).setUnfinishedMessage(this));
          } finally {
          }
        }
        // fall through
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          com.google.protobuf.Parser<com.xxxx.entity.pb.PayInfo.TestPayInfo> parser = PARSER;
          if (parser == null) {
            synchronized (com.xxxx.entity.pb.PayInfo.TestPayInfo.class) {
              parser = PARSER;
              if (parser == null) {
                parser = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                PARSER = parser;
              }
            }
          }
          return parser;
      }
      case GET_MEMOIZED_IS_INITIALIZED: {
        return memoizedIsInitialized;
      }
      case SET_MEMOIZED_IS_INITIALIZED: {
        memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
        return null;
      }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:TestPayInfo)
    private static final com.xxxx.entity.pb.PayInfo.TestPayInfo DEFAULT_INSTANCE;
    static {
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = new TestPayInfo();
    }

    public static com.xxxx.entity.pb.PayInfo.TestPayInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<TestPayInfo> PARSER;

    public static com.google.protobuf.Parser<TestPayInfo> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}