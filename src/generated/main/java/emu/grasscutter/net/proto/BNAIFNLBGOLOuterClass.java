// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: BNAIFNLBGOL.proto

package emu.grasscutter.net.proto;

public final class BNAIFNLBGOLOuterClass {
  private BNAIFNLBGOLOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface BNAIFNLBGOLOrBuilder extends
      // @@protoc_insertion_point(interface_extends:BNAIFNLBGOL)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool is_success = 1;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 DPNNPLCCDEL = 7;</code>
     * @return The dPNNPLCCDEL.
     */
    int getDPNNPLCCDEL();

    /**
     * <code>uint32 DPEBFHMKICN = 12;</code>
     * @return The dPEBFHMKICN.
     */
    int getDPEBFHMKICN();
  }
  /**
   * <pre>
   * Version: 4.6.0
   * Obfs: BNAIFNLBGOL
   * </pre>
   *
   * Protobuf type {@code BNAIFNLBGOL}
   */
  public static final class BNAIFNLBGOL extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:BNAIFNLBGOL)
      BNAIFNLBGOLOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use BNAIFNLBGOL.newBuilder() to construct.
    private BNAIFNLBGOL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private BNAIFNLBGOL() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new BNAIFNLBGOL();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private BNAIFNLBGOL(
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
            case 8: {

              isSuccess_ = input.readBool();
              break;
            }
            case 56: {

              dPNNPLCCDEL_ = input.readUInt32();
              break;
            }
            case 96: {

              dPEBFHMKICN_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.internal_static_BNAIFNLBGOL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.internal_static_BNAIFNLBGOL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL.class, emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL.Builder.class);
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 1;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 1;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int DPNNPLCCDEL_FIELD_NUMBER = 7;
    private int dPNNPLCCDEL_;
    /**
     * <code>uint32 DPNNPLCCDEL = 7;</code>
     * @return The dPNNPLCCDEL.
     */
    @java.lang.Override
    public int getDPNNPLCCDEL() {
      return dPNNPLCCDEL_;
    }

    public static final int DPEBFHMKICN_FIELD_NUMBER = 12;
    private int dPEBFHMKICN_;
    /**
     * <code>uint32 DPEBFHMKICN = 12;</code>
     * @return The dPEBFHMKICN.
     */
    @java.lang.Override
    public int getDPEBFHMKICN() {
      return dPEBFHMKICN_;
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
      if (isSuccess_ != false) {
        output.writeBool(1, isSuccess_);
      }
      if (dPNNPLCCDEL_ != 0) {
        output.writeUInt32(7, dPNNPLCCDEL_);
      }
      if (dPEBFHMKICN_ != 0) {
        output.writeUInt32(12, dPEBFHMKICN_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isSuccess_);
      }
      if (dPNNPLCCDEL_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(7, dPNNPLCCDEL_);
      }
      if (dPEBFHMKICN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, dPEBFHMKICN_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL other = (emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL) obj;

      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getDPNNPLCCDEL()
          != other.getDPNNPLCCDEL()) return false;
      if (getDPEBFHMKICN()
          != other.getDPEBFHMKICN()) return false;
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
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + DPNNPLCCDEL_FIELD_NUMBER;
      hash = (53 * hash) + getDPNNPLCCDEL();
      hash = (37 * hash) + DPEBFHMKICN_FIELD_NUMBER;
      hash = (53 * hash) + getDPEBFHMKICN();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL prototype) {
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
     * Version: 4.6.0
     * Obfs: BNAIFNLBGOL
     * </pre>
     *
     * Protobuf type {@code BNAIFNLBGOL}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:BNAIFNLBGOL)
        emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOLOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.internal_static_BNAIFNLBGOL_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.internal_static_BNAIFNLBGOL_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL.class, emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL.newBuilder()
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
        isSuccess_ = false;

        dPNNPLCCDEL_ = 0;

        dPEBFHMKICN_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.internal_static_BNAIFNLBGOL_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL build() {
        emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL buildPartial() {
        emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL result = new emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL(this);
        result.isSuccess_ = isSuccess_;
        result.dPNNPLCCDEL_ = dPNNPLCCDEL_;
        result.dPEBFHMKICN_ = dPEBFHMKICN_;
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
        if (other instanceof emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL) {
          return mergeFrom((emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL other) {
        if (other == emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL.getDefaultInstance()) return this;
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getDPNNPLCCDEL() != 0) {
          setDPNNPLCCDEL(other.getDPNNPLCCDEL());
        }
        if (other.getDPEBFHMKICN() != 0) {
          setDPEBFHMKICN(other.getDPEBFHMKICN());
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
        emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 1;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 1;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int dPNNPLCCDEL_ ;
      /**
       * <code>uint32 DPNNPLCCDEL = 7;</code>
       * @return The dPNNPLCCDEL.
       */
      @java.lang.Override
      public int getDPNNPLCCDEL() {
        return dPNNPLCCDEL_;
      }
      /**
       * <code>uint32 DPNNPLCCDEL = 7;</code>
       * @param value The dPNNPLCCDEL to set.
       * @return This builder for chaining.
       */
      public Builder setDPNNPLCCDEL(int value) {
        
        dPNNPLCCDEL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DPNNPLCCDEL = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearDPNNPLCCDEL() {
        
        dPNNPLCCDEL_ = 0;
        onChanged();
        return this;
      }

      private int dPEBFHMKICN_ ;
      /**
       * <code>uint32 DPEBFHMKICN = 12;</code>
       * @return The dPEBFHMKICN.
       */
      @java.lang.Override
      public int getDPEBFHMKICN() {
        return dPEBFHMKICN_;
      }
      /**
       * <code>uint32 DPEBFHMKICN = 12;</code>
       * @param value The dPEBFHMKICN to set.
       * @return This builder for chaining.
       */
      public Builder setDPEBFHMKICN(int value) {
        
        dPEBFHMKICN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 DPEBFHMKICN = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearDPEBFHMKICN() {
        
        dPEBFHMKICN_ = 0;
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


      // @@protoc_insertion_point(builder_scope:BNAIFNLBGOL)
    }

    // @@protoc_insertion_point(class_scope:BNAIFNLBGOL)
    private static final emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL();
    }

    public static emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<BNAIFNLBGOL>
        PARSER = new com.google.protobuf.AbstractParser<BNAIFNLBGOL>() {
      @java.lang.Override
      public BNAIFNLBGOL parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new BNAIFNLBGOL(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<BNAIFNLBGOL> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<BNAIFNLBGOL> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.BNAIFNLBGOLOuterClass.BNAIFNLBGOL getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_BNAIFNLBGOL_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_BNAIFNLBGOL_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021BNAIFNLBGOL.proto\"K\n\013BNAIFNLBGOL\022\022\n\nis" +
      "_success\030\001 \001(\010\022\023\n\013DPNNPLCCDEL\030\007 \001(\r\022\023\n\013D" +
      "PEBFHMKICN\030\014 \001(\rB\033\n\031emu.grasscutter.net." +
      "protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_BNAIFNLBGOL_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_BNAIFNLBGOL_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_BNAIFNLBGOL_descriptor,
        new java.lang.String[] { "IsSuccess", "DPNNPLCCDEL", "DPEBFHMKICN", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
