// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: UseItemRsp.proto

package emu.grasscutter.net.proto;

public final class UseItemRspOuterClass {
  private UseItemRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface UseItemRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:UseItemRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>uint64 guid = 3;</code>
     * @return The guid.
     */
    long getGuid();

    /**
     * <code>uint32 option_idx = 5;</code>
     * @return The optionIdx.
     */
    int getOptionIdx();

    /**
     * <code>uint32 item_id = 13;</code>
     * @return The itemId.
     */
    int getItemId();

    /**
     * <code>uint64 target_guid = 15;</code>
     * @return The targetGuid.
     */
    long getTargetGuid();
  }
  /**
   * <pre>
   * 4.6.0
   * CmdId: 3305
   * </pre>
   *
   * Protobuf type {@code UseItemRsp}
   */
  public static final class UseItemRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:UseItemRsp)
      UseItemRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use UseItemRsp.newBuilder() to construct.
    private UseItemRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private UseItemRsp() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new UseItemRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private UseItemRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 16: {

              retcode_ = input.readInt32();
              break;
            }
            case 24: {

              guid_ = input.readUInt64();
              break;
            }
            case 40: {

              optionIdx_ = input.readUInt32();
              break;
            }
            case 104: {

              itemId_ = input.readUInt32();
              break;
            }
            case 120: {

              targetGuid_ = input.readUInt64();
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
      return emu.grasscutter.net.proto.UseItemRspOuterClass.internal_static_UseItemRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.UseItemRspOuterClass.internal_static_UseItemRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.class, emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.Builder.class);
    }

    public static final int RETCODE_FIELD_NUMBER = 2;
    private int retcode_;
    /**
     * <code>int32 retcode = 2;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int GUID_FIELD_NUMBER = 3;
    private long guid_;
    /**
     * <code>uint64 guid = 3;</code>
     * @return The guid.
     */
    @java.lang.Override
    public long getGuid() {
      return guid_;
    }

    public static final int OPTION_IDX_FIELD_NUMBER = 5;
    private int optionIdx_;
    /**
     * <code>uint32 option_idx = 5;</code>
     * @return The optionIdx.
     */
    @java.lang.Override
    public int getOptionIdx() {
      return optionIdx_;
    }

    public static final int ITEM_ID_FIELD_NUMBER = 13;
    private int itemId_;
    /**
     * <code>uint32 item_id = 13;</code>
     * @return The itemId.
     */
    @java.lang.Override
    public int getItemId() {
      return itemId_;
    }

    public static final int TARGET_GUID_FIELD_NUMBER = 15;
    private long targetGuid_;
    /**
     * <code>uint64 target_guid = 15;</code>
     * @return The targetGuid.
     */
    @java.lang.Override
    public long getTargetGuid() {
      return targetGuid_;
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
      if (retcode_ != 0) {
        output.writeInt32(2, retcode_);
      }
      if (guid_ != 0L) {
        output.writeUInt64(3, guid_);
      }
      if (optionIdx_ != 0) {
        output.writeUInt32(5, optionIdx_);
      }
      if (itemId_ != 0) {
        output.writeUInt32(13, itemId_);
      }
      if (targetGuid_ != 0L) {
        output.writeUInt64(15, targetGuid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, retcode_);
      }
      if (guid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, guid_);
      }
      if (optionIdx_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, optionIdx_);
      }
      if (itemId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(13, itemId_);
      }
      if (targetGuid_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(15, targetGuid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp other = (emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (getGuid()
          != other.getGuid()) return false;
      if (getOptionIdx()
          != other.getOptionIdx()) return false;
      if (getItemId()
          != other.getItemId()) return false;
      if (getTargetGuid()
          != other.getTargetGuid()) return false;
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getGuid());
      hash = (37 * hash) + OPTION_IDX_FIELD_NUMBER;
      hash = (53 * hash) + getOptionIdx();
      hash = (37 * hash) + ITEM_ID_FIELD_NUMBER;
      hash = (53 * hash) + getItemId();
      hash = (37 * hash) + TARGET_GUID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getTargetGuid());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp prototype) {
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
     * <pre>
     * 4.6.0
     * CmdId: 3305
     * </pre>
     *
     * Protobuf type {@code UseItemRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:UseItemRsp)
        emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.UseItemRspOuterClass.internal_static_UseItemRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.UseItemRspOuterClass.internal_static_UseItemRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.class, emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.newBuilder()
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
        retcode_ = 0;

        guid_ = 0L;

        optionIdx_ = 0;

        itemId_ = 0;

        targetGuid_ = 0L;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.UseItemRspOuterClass.internal_static_UseItemRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp build() {
        emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp buildPartial() {
        emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp result = new emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp(this);
        result.retcode_ = retcode_;
        result.guid_ = guid_;
        result.optionIdx_ = optionIdx_;
        result.itemId_ = itemId_;
        result.targetGuid_ = targetGuid_;
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
        if (other instanceof emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp) {
          return mergeFrom((emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp other) {
        if (other == emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.getGuid() != 0L) {
          setGuid(other.getGuid());
        }
        if (other.getOptionIdx() != 0) {
          setOptionIdx(other.getOptionIdx());
        }
        if (other.getItemId() != 0) {
          setItemId(other.getItemId());
        }
        if (other.getTargetGuid() != 0L) {
          setTargetGuid(other.getTargetGuid());
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
        emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 2;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private long guid_ ;
      /**
       * <code>uint64 guid = 3;</code>
       * @return The guid.
       */
      @java.lang.Override
      public long getGuid() {
        return guid_;
      }
      /**
       * <code>uint64 guid = 3;</code>
       * @param value The guid to set.
       * @return This builder for chaining.
       */
      public Builder setGuid(long value) {
        
        guid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 guid = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearGuid() {
        
        guid_ = 0L;
        onChanged();
        return this;
      }

      private int optionIdx_ ;
      /**
       * <code>uint32 option_idx = 5;</code>
       * @return The optionIdx.
       */
      @java.lang.Override
      public int getOptionIdx() {
        return optionIdx_;
      }
      /**
       * <code>uint32 option_idx = 5;</code>
       * @param value The optionIdx to set.
       * @return This builder for chaining.
       */
      public Builder setOptionIdx(int value) {
        
        optionIdx_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 option_idx = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearOptionIdx() {
        
        optionIdx_ = 0;
        onChanged();
        return this;
      }

      private int itemId_ ;
      /**
       * <code>uint32 item_id = 13;</code>
       * @return The itemId.
       */
      @java.lang.Override
      public int getItemId() {
        return itemId_;
      }
      /**
       * <code>uint32 item_id = 13;</code>
       * @param value The itemId to set.
       * @return This builder for chaining.
       */
      public Builder setItemId(int value) {
        
        itemId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 item_id = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearItemId() {
        
        itemId_ = 0;
        onChanged();
        return this;
      }

      private long targetGuid_ ;
      /**
       * <code>uint64 target_guid = 15;</code>
       * @return The targetGuid.
       */
      @java.lang.Override
      public long getTargetGuid() {
        return targetGuid_;
      }
      /**
       * <code>uint64 target_guid = 15;</code>
       * @param value The targetGuid to set.
       * @return This builder for chaining.
       */
      public Builder setTargetGuid(long value) {
        
        targetGuid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 target_guid = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearTargetGuid() {
        
        targetGuid_ = 0L;
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


      // @@protoc_insertion_point(builder_scope:UseItemRsp)
    }

    // @@protoc_insertion_point(class_scope:UseItemRsp)
    private static final emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp();
    }

    public static emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<UseItemRsp>
        PARSER = new com.google.protobuf.AbstractParser<UseItemRsp>() {
      @java.lang.Override
      public UseItemRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new UseItemRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<UseItemRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<UseItemRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.UseItemRspOuterClass.UseItemRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_UseItemRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_UseItemRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020UseItemRsp.proto\"e\n\nUseItemRsp\022\017\n\007retc" +
      "ode\030\002 \001(\005\022\014\n\004guid\030\003 \001(\004\022\022\n\noption_idx\030\005 " +
      "\001(\r\022\017\n\007item_id\030\r \001(\r\022\023\n\013target_guid\030\017 \001(" +
      "\004B\033\n\031emu.grasscutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_UseItemRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_UseItemRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_UseItemRsp_descriptor,
        new java.lang.String[] { "Retcode", "Guid", "OptionIdx", "ItemId", "TargetGuid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
