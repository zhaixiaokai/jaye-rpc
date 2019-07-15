// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: RpcTransportResponse.proto

package com.personal.rpc.transport.protocol.protobuf;

public final class RpcTransportResponse {
  private RpcTransportResponse() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Response)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>required string uid = 1;</code>
     */
    boolean hasUid();
    /**
     * <code>required string uid = 1;</code>
     */
    java.lang.String getUid();
    /**
     * <code>required string uid = 1;</code>
     */
    com.google.protobuf.ByteString
        getUidBytes();

    /**
     * <code>required bool result = 2;</code>
     */
    boolean hasResult();
    /**
     * <code>required bool result = 2;</code>
     */
    boolean getResult();

    /**
     * <code>optional string errMessage = 3;</code>
     */
    boolean hasErrMessage();
    /**
     * <code>optional string errMessage = 3;</code>
     */
    java.lang.String getErrMessage();
    /**
     * <code>optional string errMessage = 3;</code>
     */
    com.google.protobuf.ByteString
        getErrMessageBytes();

    /**
     * <code>optional .google.protobuf.Any body = 4;</code>
     */
    boolean hasBody();
    /**
     * <code>optional .google.protobuf.Any body = 4;</code>
     */
    com.google.protobuf.Any getBody();
  }
  /**
   * Protobuf type {@code Response}
   */
  public  static final class Response extends
      com.google.protobuf.GeneratedMessageLite<
          Response, Response.Builder> implements
      // @@protoc_insertion_point(message_implements:Response)
      ResponseOrBuilder {
    private Response() {
      uid_ = "";
      errMessage_ = "";
    }
    private int bitField0_;
    public static final int UID_FIELD_NUMBER = 1;
    private java.lang.String uid_;
    /**
     * <code>required string uid = 1;</code>
     */
    @java.lang.Override
    public boolean hasUid() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>required string uid = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getUid() {
      return uid_;
    }
    /**
     * <code>required string uid = 1;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUidBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(uid_);
    }
    /**
     * <code>required string uid = 1;</code>
     */
    private void setUid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      uid_ = value;
    }
    /**
     * <code>required string uid = 1;</code>
     */
    private void clearUid() {
      bitField0_ = (bitField0_ & ~0x00000001);
      uid_ = getDefaultInstance().getUid();
    }
    /**
     * <code>required string uid = 1;</code>
     */
    private void setUidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
      uid_ = value.toStringUtf8();
    }

    public static final int RESULT_FIELD_NUMBER = 2;
    private boolean result_;
    /**
     * <code>required bool result = 2;</code>
     */
    @java.lang.Override
    public boolean hasResult() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>required bool result = 2;</code>
     */
    @java.lang.Override
    public boolean getResult() {
      return result_;
    }
    /**
     * <code>required bool result = 2;</code>
     */
    private void setResult(boolean value) {
      bitField0_ |= 0x00000002;
      result_ = value;
    }
    /**
     * <code>required bool result = 2;</code>
     */
    private void clearResult() {
      bitField0_ = (bitField0_ & ~0x00000002);
      result_ = false;
    }

    public static final int ERRMESSAGE_FIELD_NUMBER = 3;
    private java.lang.String errMessage_;
    /**
     * <code>optional string errMessage = 3;</code>
     */
    @java.lang.Override
    public boolean hasErrMessage() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string errMessage = 3;</code>
     */
    @java.lang.Override
    public java.lang.String getErrMessage() {
      return errMessage_;
    }
    /**
     * <code>optional string errMessage = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getErrMessageBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(errMessage_);
    }
    /**
     * <code>optional string errMessage = 3;</code>
     */
    private void setErrMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      errMessage_ = value;
    }
    /**
     * <code>optional string errMessage = 3;</code>
     */
    private void clearErrMessage() {
      bitField0_ = (bitField0_ & ~0x00000004);
      errMessage_ = getDefaultInstance().getErrMessage();
    }
    /**
     * <code>optional string errMessage = 3;</code>
     */
    private void setErrMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
      errMessage_ = value.toStringUtf8();
    }

    public static final int BODY_FIELD_NUMBER = 4;
    private com.google.protobuf.Any body_;
    /**
     * <code>optional .google.protobuf.Any body = 4;</code>
     */
    @java.lang.Override
    public boolean hasBody() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .google.protobuf.Any body = 4;</code>
     */
    @java.lang.Override
    public com.google.protobuf.Any getBody() {
      return body_ == null ? com.google.protobuf.Any.getDefaultInstance() : body_;
    }
    /**
     * <code>optional .google.protobuf.Any body = 4;</code>
     */
    private void setBody(com.google.protobuf.Any value) {
      if (value == null) {
        throw new NullPointerException();
      }
      body_ = value;
      bitField0_ |= 0x00000008;
      }
    /**
     * <code>optional .google.protobuf.Any body = 4;</code>
     */
    private void setBody(
        com.google.protobuf.Any.Builder builderForValue) {
      body_ = builderForValue.build();
      bitField0_ |= 0x00000008;
    }
    /**
     * <code>optional .google.protobuf.Any body = 4;</code>
     */
    @java.lang.SuppressWarnings({"ReferenceEquality"})
    private void mergeBody(com.google.protobuf.Any value) {
      if (value == null) {
        throw new NullPointerException();
      }
      if (body_ != null &&
          body_ != com.google.protobuf.Any.getDefaultInstance()) {
        body_ =
          com.google.protobuf.Any.newBuilder(body_).mergeFrom(value).buildPartial();
      } else {
        body_ = value;
      }
      bitField0_ |= 0x00000008;
    }
    /**
     * <code>optional .google.protobuf.Any body = 4;</code>
     */
    private void clearBody() {  body_ = null;
      bitField0_ = (bitField0_ & ~0x00000008);
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeString(1, getUid());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeBool(2, result_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        output.writeString(3, getErrMessage());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeMessage(4, getBody());
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
          .computeStringSize(1, getUid());
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(2, result_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getErrMessage());
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(4, getBody());
      }
      size += unknownFields.getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return (Builder) DEFAULT_INSTANCE.createBuilder();
    }
    public static Builder newBuilder(com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response prototype) {
      return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
    }

    /**
     * Protobuf type {@code Response}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response, Builder> implements
        // @@protoc_insertion_point(builder_implements:Response)
        com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.ResponseOrBuilder {
      // Construct using com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>required string uid = 1;</code>
       */
      @java.lang.Override
      public boolean hasUid() {
        return instance.hasUid();
      }
      /**
       * <code>required string uid = 1;</code>
       */
      @java.lang.Override
      public java.lang.String getUid() {
        return instance.getUid();
      }
      /**
       * <code>required string uid = 1;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getUidBytes() {
        return instance.getUidBytes();
      }
      /**
       * <code>required string uid = 1;</code>
       */
      public Builder setUid(
          java.lang.String value) {
        copyOnWrite();
        instance.setUid(value);
        return this;
      }
      /**
       * <code>required string uid = 1;</code>
       */
      public Builder clearUid() {
        copyOnWrite();
        instance.clearUid();
        return this;
      }
      /**
       * <code>required string uid = 1;</code>
       */
      public Builder setUidBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setUidBytes(value);
        return this;
      }

      /**
       * <code>required bool result = 2;</code>
       */
      @java.lang.Override
      public boolean hasResult() {
        return instance.hasResult();
      }
      /**
       * <code>required bool result = 2;</code>
       */
      @java.lang.Override
      public boolean getResult() {
        return instance.getResult();
      }
      /**
       * <code>required bool result = 2;</code>
       */
      public Builder setResult(boolean value) {
        copyOnWrite();
        instance.setResult(value);
        return this;
      }
      /**
       * <code>required bool result = 2;</code>
       */
      public Builder clearResult() {
        copyOnWrite();
        instance.clearResult();
        return this;
      }

      /**
       * <code>optional string errMessage = 3;</code>
       */
      @java.lang.Override
      public boolean hasErrMessage() {
        return instance.hasErrMessage();
      }
      /**
       * <code>optional string errMessage = 3;</code>
       */
      @java.lang.Override
      public java.lang.String getErrMessage() {
        return instance.getErrMessage();
      }
      /**
       * <code>optional string errMessage = 3;</code>
       */
      @java.lang.Override
      public com.google.protobuf.ByteString
          getErrMessageBytes() {
        return instance.getErrMessageBytes();
      }
      /**
       * <code>optional string errMessage = 3;</code>
       */
      public Builder setErrMessage(
          java.lang.String value) {
        copyOnWrite();
        instance.setErrMessage(value);
        return this;
      }
      /**
       * <code>optional string errMessage = 3;</code>
       */
      public Builder clearErrMessage() {
        copyOnWrite();
        instance.clearErrMessage();
        return this;
      }
      /**
       * <code>optional string errMessage = 3;</code>
       */
      public Builder setErrMessageBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setErrMessageBytes(value);
        return this;
      }

      /**
       * <code>optional .google.protobuf.Any body = 4;</code>
       */
      @java.lang.Override
      public boolean hasBody() {
        return instance.hasBody();
      }
      /**
       * <code>optional .google.protobuf.Any body = 4;</code>
       */
      @java.lang.Override
      public com.google.protobuf.Any getBody() {
        return instance.getBody();
      }
      /**
       * <code>optional .google.protobuf.Any body = 4;</code>
       */
      public Builder setBody(com.google.protobuf.Any value) {
        copyOnWrite();
        instance.setBody(value);
        return this;
        }
      /**
       * <code>optional .google.protobuf.Any body = 4;</code>
       */
      public Builder setBody(
          com.google.protobuf.Any.Builder builderForValue) {
        copyOnWrite();
        instance.setBody(builderForValue);
        return this;
      }
      /**
       * <code>optional .google.protobuf.Any body = 4;</code>
       */
      public Builder mergeBody(com.google.protobuf.Any value) {
        copyOnWrite();
        instance.mergeBody(value);
        return this;
      }
      /**
       * <code>optional .google.protobuf.Any body = 4;</code>
       */
      public Builder clearBody() {  copyOnWrite();
        instance.clearBody();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:Response)
    }
    private byte memoizedIsInitialized = 2;
    @java.lang.Override
    @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
    protected final java.lang.Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        java.lang.Object arg0, java.lang.Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response();
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case IS_INITIALIZED: {
          byte isInitialized = memoizedIsInitialized;
          if (isInitialized == 1) return DEFAULT_INSTANCE;
          if (isInitialized == 0) return null;

          boolean shouldMemoize = ((Boolean) arg0).booleanValue();
          if (!hasUid()) {
            return null;
          }
          if (!hasResult()) {
            return null;
          }
          return DEFAULT_INSTANCE;

        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response other = (com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response) arg1;
          uid_ = visitor.visitString(
              hasUid(), uid_,
              other.hasUid(), other.uid_);
          result_ = visitor.visitBoolean(
              hasResult(), result_,
              other.hasResult(), other.result_);
          errMessage_ = visitor.visitString(
              hasErrMessage(), errMessage_,
              other.hasErrMessage(), other.errMessage_);
          body_ = visitor.visitMessage(body_, other.body_);
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
                  uid_ = s;
                  break;
                }
                case 16: {
                  bitField0_ |= 0x00000002;
                  result_ = input.readBool();
                  break;
                }
                case 26: {
                  java.lang.String s = input.readString();
                  bitField0_ |= 0x00000004;
                  errMessage_ = s;
                  break;
                }
                case 34: {
                  com.google.protobuf.Any.Builder subBuilder = null;
                  if (((bitField0_ & 0x00000008) != 0)) {
                    subBuilder = body_.toBuilder();
                  }
                  body_ = input.readMessage(com.google.protobuf.Any.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(body_);
                    body_ = subBuilder.buildPartial();
                  }
                  bitField0_ |= 0x00000008;
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
          com.google.protobuf.Parser<com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response> parser = PARSER;
          if (parser == null) {
            synchronized (com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response.class) {
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


    // @@protoc_insertion_point(class_scope:Response)
    private static final com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response DEFAULT_INSTANCE;
    static {
      // New instances are implicitly immutable so no need to make
      // immutable.
      DEFAULT_INSTANCE = new Response();
    }

    public static com.personal.rpc.transport.protocol.protobuf.RpcTransportResponse.Response getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Response> PARSER;

    public static com.google.protobuf.Parser<Response> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
