// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TowerDailyRewardProgressChangeNotify.proto

package emu.grasscutter.net.proto;

public final class TowerDailyRewardProgressChangeNotifyOuterClass {
  private TowerDailyRewardProgressChangeNotifyOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TowerDailyRewardProgressChangeNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TowerDailyRewardProgressChangeNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 MICBOPDAEFN = 3;</code>
     * @return The mICBOPDAEFN.
     */
    int getMICBOPDAEFN();

    /**
     * <code>uint32 NNIGLOKAEAI = 10;</code>
     * @return The nNIGLOKAEAI.
     */
    int getNNIGLOKAEAI();
  }
  /**
   * <pre>
   * 4.6.0
   * CmdId: 26940
   * </pre>
   *
   * Protobuf type {@code TowerDailyRewardProgressChangeNotify}
   */
  public static final class TowerDailyRewardProgressChangeNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:TowerDailyRewardProgressChangeNotify)
      TowerDailyRewardProgressChangeNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TowerDailyRewardProgressChangeNotify.newBuilder() to construct.
    private TowerDailyRewardProgressChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private TowerDailyRewardProgressChangeNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new TowerDailyRewardProgressChangeNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TowerDailyRewardProgressChangeNotify(
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
            case 24: {

              mICBOPDAEFN_ = input.readUInt32();
              break;
            }
            case 80: {

              nNIGLOKAEAI_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.class, emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.Builder.class);
    }

    public static final int MICBOPDAEFN_FIELD_NUMBER = 3;
    private int mICBOPDAEFN_;
    /**
     * <code>uint32 MICBOPDAEFN = 3;</code>
     * @return The mICBOPDAEFN.
     */
    @java.lang.Override
    public int getMICBOPDAEFN() {
      return mICBOPDAEFN_;
    }

    public static final int NNIGLOKAEAI_FIELD_NUMBER = 10;
    private int nNIGLOKAEAI_;
    /**
     * <code>uint32 NNIGLOKAEAI = 10;</code>
     * @return The nNIGLOKAEAI.
     */
    @java.lang.Override
    public int getNNIGLOKAEAI() {
      return nNIGLOKAEAI_;
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
      if (mICBOPDAEFN_ != 0) {
        output.writeUInt32(3, mICBOPDAEFN_);
      }
      if (nNIGLOKAEAI_ != 0) {
        output.writeUInt32(10, nNIGLOKAEAI_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mICBOPDAEFN_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(3, mICBOPDAEFN_);
      }
      if (nNIGLOKAEAI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, nNIGLOKAEAI_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify other = (emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify) obj;

      if (getMICBOPDAEFN()
          != other.getMICBOPDAEFN()) return false;
      if (getNNIGLOKAEAI()
          != other.getNNIGLOKAEAI()) return false;
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
      hash = (37 * hash) + MICBOPDAEFN_FIELD_NUMBER;
      hash = (53 * hash) + getMICBOPDAEFN();
      hash = (37 * hash) + NNIGLOKAEAI_FIELD_NUMBER;
      hash = (53 * hash) + getNNIGLOKAEAI();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify prototype) {
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
     * CmdId: 26940
     * </pre>
     *
     * Protobuf type {@code TowerDailyRewardProgressChangeNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TowerDailyRewardProgressChangeNotify)
        emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.class, emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.newBuilder()
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
        mICBOPDAEFN_ = 0;

        nNIGLOKAEAI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.internal_static_TowerDailyRewardProgressChangeNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify build() {
        emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify buildPartial() {
        emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify result = new emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify(this);
        result.mICBOPDAEFN_ = mICBOPDAEFN_;
        result.nNIGLOKAEAI_ = nNIGLOKAEAI_;
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
        if (other instanceof emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify) {
          return mergeFrom((emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify other) {
        if (other == emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify.getDefaultInstance()) return this;
        if (other.getMICBOPDAEFN() != 0) {
          setMICBOPDAEFN(other.getMICBOPDAEFN());
        }
        if (other.getNNIGLOKAEAI() != 0) {
          setNNIGLOKAEAI(other.getNNIGLOKAEAI());
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
        emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int mICBOPDAEFN_ ;
      /**
       * <code>uint32 MICBOPDAEFN = 3;</code>
       * @return The mICBOPDAEFN.
       */
      @java.lang.Override
      public int getMICBOPDAEFN() {
        return mICBOPDAEFN_;
      }
      /**
       * <code>uint32 MICBOPDAEFN = 3;</code>
       * @param value The mICBOPDAEFN to set.
       * @return This builder for chaining.
       */
      public Builder setMICBOPDAEFN(int value) {
        
        mICBOPDAEFN_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 MICBOPDAEFN = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearMICBOPDAEFN() {
        
        mICBOPDAEFN_ = 0;
        onChanged();
        return this;
      }

      private int nNIGLOKAEAI_ ;
      /**
       * <code>uint32 NNIGLOKAEAI = 10;</code>
       * @return The nNIGLOKAEAI.
       */
      @java.lang.Override
      public int getNNIGLOKAEAI() {
        return nNIGLOKAEAI_;
      }
      /**
       * <code>uint32 NNIGLOKAEAI = 10;</code>
       * @param value The nNIGLOKAEAI to set.
       * @return This builder for chaining.
       */
      public Builder setNNIGLOKAEAI(int value) {
        
        nNIGLOKAEAI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 NNIGLOKAEAI = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearNNIGLOKAEAI() {
        
        nNIGLOKAEAI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:TowerDailyRewardProgressChangeNotify)
    }

    // @@protoc_insertion_point(class_scope:TowerDailyRewardProgressChangeNotify)
    private static final emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify();
    }

    public static emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TowerDailyRewardProgressChangeNotify>
        PARSER = new com.google.protobuf.AbstractParser<TowerDailyRewardProgressChangeNotify>() {
      @java.lang.Override
      public TowerDailyRewardProgressChangeNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new TowerDailyRewardProgressChangeNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TowerDailyRewardProgressChangeNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TowerDailyRewardProgressChangeNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.TowerDailyRewardProgressChangeNotifyOuterClass.TowerDailyRewardProgressChangeNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TowerDailyRewardProgressChangeNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TowerDailyRewardProgressChangeNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*TowerDailyRewardProgressChangeNotify.p" +
      "roto\"P\n$TowerDailyRewardProgressChangeNo" +
      "tify\022\023\n\013MICBOPDAEFN\030\003 \001(\r\022\023\n\013NNIGLOKAEAI" +
      "\030\n \001(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_TowerDailyRewardProgressChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TowerDailyRewardProgressChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TowerDailyRewardProgressChangeNotify_descriptor,
        new java.lang.String[] { "MICBOPDAEFN", "NNIGLOKAEAI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
