package org.wikipedia.analytics.eventplatform;

import java.lang.System;

/**
 * POJO representing a response body from the Event Platform's intake API (EventGate).
 *
 * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
 * body. In the case of partial or total failure, failing events will be returned in the "invalid"
 * or "error" arrays in the response body.
 *
 * N.B. The response body will always be empty when sending events hastily. This class is provided
 * in anticipation of adding retry behavior for failed events in the future.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B=\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0001\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\u0002\u0010\nB\u0005\u00a2\u0006\u0002\u0010\u000bJ!\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u00c7\u0001R\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\u000b\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EventServiceResponse;", "", "seen1", "", "invalidEvents", "", "Lorg/wikipedia/analytics/eventplatform/Event;", "errorEvents", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getErrorEvents$annotations", "getErrorEvents", "()Ljava/util/List;", "getInvalidEvents$annotations", "getInvalidEvents", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_alphaDebug"})
@kotlinx.serialization.Serializable()
public final class EventServiceResponse {
    
    /**
     * POJO representing a response body from the Event Platform's intake API (EventGate).
     *
     * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
     * body. In the case of partial or total failure, failing events will be returned in the "invalid"
     * or "error" arrays in the response body.
     *
     * N.B. The response body will always be empty when sending events hastily. This class is provided
     * in anticipation of adding retry behavior for failed events in the future.
     */
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.eventplatform.EventServiceResponse.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.analytics.eventplatform.Event> invalidEvents = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<org.wikipedia.analytics.eventplatform.Event> errorEvents = null;
    
    public EventServiceResponse() {
        super();
    }
    
    /**
     * POJO representing a response body from the Event Platform's intake API (EventGate).
     *
     * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
     * body. In the case of partial or total failure, failing events will be returned in the "invalid"
     * or "error" arrays in the response body.
     *
     * N.B. The response body will always be empty when sending events hastily. This class is provided
     * in anticipation of adding retry behavior for failed events in the future.
     */
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.eventplatform.EventServiceResponse self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.analytics.eventplatform.Event> getInvalidEvents() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "invalid")
    @java.lang.Deprecated()
    public static void getInvalidEvents$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.analytics.eventplatform.Event> getErrorEvents() {
        return null;
    }
    
    @kotlinx.serialization.SerialName(value = "error")
    @java.lang.Deprecated()
    public static void getErrorEvents$annotations() {
    }
    
    /**
     * POJO representing a response body from the Event Platform's intake API (EventGate).
     *
     * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
     * body. In the case of partial or total failure, failing events will be returned in the "invalid"
     * or "error" arrays in the response body.
     *
     * N.B. The response body will always be empty when sending events hastily. This class is provided
     * in anticipation of adding retry behavior for failed events in the future.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EventServiceResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/analytics/eventplatform/EventServiceResponse;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * POJO representing a response body from the Event Platform's intake API (EventGate).
         *
         * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
         * body. In the case of partial or total failure, failing events will be returned in the "invalid"
         * or "error" arrays in the response body.
         *
         * N.B. The response body will always be empty when sending events hastily. This class is provided
         * in anticipation of adding retry behavior for failed events in the future.
         */
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<org.wikipedia.analytics.eventplatform.EventServiceResponse> serializer() {
            return null;
        }
    }
    
    /**
     * POJO representing a response body from the Event Platform's intake API (EventGate).
     *
     * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
     * body. In the case of partial or total failure, failing events will be returned in the "invalid"
     * or "error" arrays in the response body.
     *
     * N.B. The response body will always be empty when sending events hastily. This class is provided
     * in anticipation of adding retry behavior for failed events in the future.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/analytics/eventplatform/EventServiceResponse.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/analytics/eventplatform/EventServiceResponse;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.analytics.eventplatform.EventServiceResponse> {
        
        /**
         * POJO representing a response body from the Event Platform's intake API (EventGate).
         *
         * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
         * body. In the case of partial or total failure, failing events will be returned in the "invalid"
         * or "error" arrays in the response body.
         *
         * N.B. The response body will always be empty when sending events hastily. This class is provided
         * in anticipation of adding retry behavior for failed events in the future.
         */
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.analytics.eventplatform.EventServiceResponse.$serializer INSTANCE = null;
        
        private $serializer() {
            super();
        }
        
        /**
         * POJO representing a response body from the Event Platform's intake API (EventGate).
         *
         * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
         * body. In the case of partial or total failure, failing events will be returned in the "invalid"
         * or "error" arrays in the response body.
         *
         * N.B. The response body will always be empty when sending events hastily. This class is provided
         * in anticipation of adding retry behavior for failed events in the future.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.KSerializer<?>[] childSerializers() {
            return null;
        }
        
        /**
         * POJO representing a response body from the Event Platform's intake API (EventGate).
         *
         * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
         * body. In the case of partial or total failure, failing events will be returned in the "invalid"
         * or "error" arrays in the response body.
         *
         * N.B. The response body will always be empty when sending events hastily. This class is provided
         * in anticipation of adding retry behavior for failed events in the future.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.analytics.eventplatform.EventServiceResponse deserialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Decoder decoder) {
            return null;
        }
        
        /**
         * POJO representing a response body from the Event Platform's intake API (EventGate).
         *
         * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
         * body. In the case of partial or total failure, failing events will be returned in the "invalid"
         * or "error" arrays in the response body.
         *
         * N.B. The response body will always be empty when sending events hastily. This class is provided
         * in anticipation of adding retry behavior for failed events in the future.
         */
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public kotlinx.serialization.descriptors.SerialDescriptor getDescriptor() {
            return null;
        }
        
        /**
         * POJO representing a response body from the Event Platform's intake API (EventGate).
         *
         * In case of success, a 201 (Success) or 202 (Hasty success) response will be returned with no
         * body. In the case of partial or total failure, failing events will be returned in the "invalid"
         * or "error" arrays in the response body.
         *
         * N.B. The response body will always be empty when sending events hastily. This class is provided
         * in anticipation of adding retry behavior for failed events in the future.
         */
        @java.lang.Override()
        public void serialize(@org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.Encoder encoder, @org.jetbrains.annotations.NotNull()
        org.wikipedia.analytics.eventplatform.EventServiceResponse value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}