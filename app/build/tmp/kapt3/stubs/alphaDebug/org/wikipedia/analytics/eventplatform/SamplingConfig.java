package org.wikipedia.analytics.eventplatform;

import java.lang.System;

/**
 * Represents the sampling config component of a stream configuration.
 *
 * The boxed Double type is used instead of the double primitive because its value may be null,
 * which denotes that the stream should always be *included*.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0003\u0018\u0019\u001aB\u0019\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B+\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u0006\u0010\u0010\u001a\u00020\u0005J!\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u00c7\u0001R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/SamplingConfig;", "", "rate", "", "identifier", "Lorg/wikipedia/analytics/eventplatform/SamplingConfig$Identifier;", "(DLorg/wikipedia/analytics/eventplatform/SamplingConfig$Identifier;)V", "seen1", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILorg/wikipedia/analytics/eventplatform/SamplingConfig$Identifier;DLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getRate", "()D", "setRate", "(D)V", "getIdentifier", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "Identifier", "app_alphaDebug"})
@kotlinx.serialization.Serializable()
public final class SamplingConfig {
    
    /**
     * Represents the sampling config component of a stream configuration.
     *
     * The boxed Double type is used instead of the double primitive because its value may be null,
     * which denotes that the stream should always be *included*.
     */
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.SamplingConfig.Companion Companion = null;
    private org.wikipedia.analytics.eventplatform.SamplingConfig.Identifier identifier;
    private double rate = 1.0;
    
    /**
     * Represents the sampling config component of a stream configuration.
     *
     * The boxed Double type is used instead of the double primitive because its value may be null,
     * which denotes that the stream should always be *included*.
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.SamplingConfig self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public final double getRate() {
        return 0.0;
    }
    
    public final void setRate(double p0) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public SamplingConfig(double rate, @org.jetbrains.annotations.Nullable()
    org.wikipedia.analytics.eventplatform.SamplingConfig.Identifier identifier) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.analytics.eventplatform.SamplingConfig.Identifier getIdentifier() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0087\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0006\u0007B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/SamplingConfig$Identifier;", "", "(Ljava/lang/String;I)V", "PAGEVIEW", "SESSION", "DEVICE", "$serializer", "Companion", "app_alphaDebug"})
    @kotlinx.serialization.Serializable()
    public static enum Identifier {
        @kotlinx.serialization.SerialName(value = "pageview")
        /*public static final*/ PAGEVIEW /* = new PAGEVIEW() */,
        @kotlinx.serialization.SerialName(value = "session")
        /*public static final*/ SESSION /* = new SESSION() */,
        @kotlinx.serialization.SerialName(value = "device")
        /*public static final*/ DEVICE /* = new DEVICE() */;
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.analytics.eventplatform.SamplingConfig.Identifier.Companion Companion = null;
        
        Identifier() {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/SamplingConfig$Identifier$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/analytics/eventplatform/SamplingConfig$Identifier;", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<org.wikipedia.analytics.eventplatform.SamplingConfig.Identifier> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/analytics/eventplatform/SamplingConfig.Identifier.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/analytics/eventplatform/SamplingConfig$Identifier;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.analytics.eventplatform.SamplingConfig.Identifier> {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.analytics.eventplatform.SamplingConfig.Identifier.$serializer INSTANCE = null;
            
            private $serializer() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.KSerializer<?>[] childSerializers() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public org.wikipedia.analytics.eventplatform.SamplingConfig.Identifier deserialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Decoder decoder) {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
                return null;
            }
            
            @java.lang.Override()
            public void serialize(@org.jetbrains.annotations.NotNull()
            kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
            org.wikipedia.analytics.eventplatform.SamplingConfig.Identifier value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    /**
     * Represents the sampling config component of a stream configuration.
     *
     * The boxed Double type is used instead of the double primitive because its value may be null,
     * which denotes that the stream should always be *included*.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/SamplingConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/analytics/eventplatform/SamplingConfig;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Represents the sampling config component of a stream configuration.
         *
         * The boxed Double type is used instead of the double primitive because its value may be null,
         * which denotes that the stream should always be *included*.
         */
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<org.wikipedia.analytics.eventplatform.SamplingConfig> serializer() {
            return null;
        }
    }
    
    /**
     * Represents the sampling config component of a stream configuration.
     *
     * The boxed Double type is used instead of the double primitive because its value may be null,
     * which denotes that the stream should always be *included*.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/analytics/eventplatform/SamplingConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/analytics/eventplatform/SamplingConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.analytics.eventplatform.SamplingConfig> {
        
        /**
         * Represents the sampling config component of a stream configuration.
         *
         * The boxed Double type is used instead of the double primitive because its value may be null,
         * which denotes that the stream should always be *included*.
         */
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.analytics.eventplatform.SamplingConfig.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * Represents the sampling config component of a stream configuration.
         *
         * The boxed Double type is used instead of the double primitive because its value may be null,
         * which denotes that the stream should always be *included*.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * Represents the sampling config component of a stream configuration.
         *
         * The boxed Double type is used instead of the double primitive because its value may be null,
         * which denotes that the stream should always be *included*.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.analytics.eventplatform.SamplingConfig deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * Represents the sampling config component of a stream configuration.
         *
         * The boxed Double type is used instead of the double primitive because its value may be null,
         * which denotes that the stream should always be *included*.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * Represents the sampling config component of a stream configuration.
         *
         * The boxed Double type is used instead of the double primitive because its value may be null,
         * which denotes that the stream should always be *included*.
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        org.wikipedia.analytics.eventplatform.SamplingConfig value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}