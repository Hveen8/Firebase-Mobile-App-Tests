package org.wikipedia.analytics.eventplatform;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 92\u00020\u0001:\u000289B#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bB\u007f\b\u0017\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u000b\u001a\u00020\f\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\u0002\u0010\u0014J!\u00101\u001a\u0002022\u0006\u00103\u001a\u00020\u00002\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u00c7\u0001R$\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u00020\u00038\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010!R&\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\u000e\u001a\u00020\u00038\u0006X\u0087D\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\'\u0010\u0016\u001a\u0004\b(\u0010!R$\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b)\u0010\u0016\u001a\u0004\b*\u0010!\"\u0004\b+\u0010,R\"\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00108\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0016\u001a\u0004\b.\u0010/R\u0017\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010/\u00a8\u0006:"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/StreamConfig;", "", "streamName", "", "samplingConfig", "Lorg/wikipedia/analytics/eventplatform/SamplingConfig;", "destinationEventService", "Lorg/wikipedia/analytics/eventplatform/DestinationEventService;", "(Ljava/lang/String;Lorg/wikipedia/analytics/eventplatform/SamplingConfig;Lorg/wikipedia/analytics/eventplatform/DestinationEventService;)V", "seen1", "", "canaryEventsEnabled", "", "destinationEventServiceKey", "schemaTitle", "topicPrefixes", "", "topics", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ZLjava/lang/String;Lorg/wikipedia/analytics/eventplatform/DestinationEventService;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lorg/wikipedia/analytics/eventplatform/SamplingConfig;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getCanaryEventsEnabled$annotations", "()V", "getCanaryEventsEnabled", "()Z", "setCanaryEventsEnabled", "(Z)V", "getDestinationEventService", "()Lorg/wikipedia/analytics/eventplatform/DestinationEventService;", "setDestinationEventService", "(Lorg/wikipedia/analytics/eventplatform/DestinationEventService;)V", "getDestinationEventServiceKey$annotations", "getDestinationEventServiceKey", "()Ljava/lang/String;", "getSamplingConfig$annotations", "getSamplingConfig", "()Lorg/wikipedia/analytics/eventplatform/SamplingConfig;", "setSamplingConfig", "(Lorg/wikipedia/analytics/eventplatform/SamplingConfig;)V", "getSchemaTitle$annotations", "getSchemaTitle", "getStreamName$annotations", "getStreamName", "setStreamName", "(Ljava/lang/String;)V", "getTopicPrefixes$annotations", "getTopicPrefixes", "()Ljava/util/List;", "getTopics", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_alphaDebug"})
@kotlinx.serialization.Serializable()
public final class StreamConfig {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.StreamConfig.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String streamName = "";
    private boolean canaryEventsEnabled = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String destinationEventServiceKey = "eventgate-analytics-external";
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.analytics.eventplatform.DestinationEventService destinationEventService = org.wikipedia.analytics.eventplatform.DestinationEventService.ANALYTICS;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String schemaTitle = "";
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> topicPrefixes = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> topics = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.analytics.eventplatform.SamplingConfig samplingConfig;
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.StreamConfig self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    public StreamConfig(@org.jetbrains.annotations.NotNull()
    java.lang.String streamName, @org.jetbrains.annotations.Nullable()
    org.wikipedia.analytics.eventplatform.SamplingConfig samplingConfig, @org.jetbrains.annotations.Nullable()
    org.wikipedia.analytics.eventplatform.DestinationEventService destinationEventService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStreamName() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "stream")
    @java.lang.Deprecated()
    public static void getStreamName$annotations() {
    }
    
    public final void setStreamName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getCanaryEventsEnabled() {
        return false;
    }
    
    @kotlinx.serialization.SerialName(value = "canary_events_enabled")
    @java.lang.Deprecated()
    public static void getCanaryEventsEnabled$annotations() {
    }
    
    public final void setCanaryEventsEnabled(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDestinationEventServiceKey() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "destination_event_service")
    @java.lang.Deprecated()
    public static void getDestinationEventServiceKey$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.analytics.eventplatform.DestinationEventService getDestinationEventService() {
        return null;
    }
    
    public final void setDestinationEventService(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.DestinationEventService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSchemaTitle() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "schema_title")
    @java.lang.Deprecated()
    public static void getSchemaTitle$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTopicPrefixes() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "topic_prefixes")
    @java.lang.Deprecated()
    public static void getTopicPrefixes$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getTopics() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.analytics.eventplatform.SamplingConfig getSamplingConfig() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "sampling")
    @java.lang.Deprecated()
    public static void getSamplingConfig$annotations() {
    }
    
    public final void setSamplingConfig(@org.jetbrains.annotations.Nullable()
    org.wikipedia.analytics.eventplatform.SamplingConfig p0) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/StreamConfig$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/analytics/eventplatform/StreamConfig;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<org.wikipedia.analytics.eventplatform.StreamConfig> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/analytics/eventplatform/StreamConfig.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/analytics/eventplatform/StreamConfig;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.analytics.eventplatform.StreamConfig> {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.analytics.eventplatform.StreamConfig.$serializer INSTANCE = null;
        
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
        public org.wikipedia.analytics.eventplatform.StreamConfig deserialize(@org.jetbrains.annotations.NotNull()
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
        org.wikipedia.analytics.eventplatform.StreamConfig value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}