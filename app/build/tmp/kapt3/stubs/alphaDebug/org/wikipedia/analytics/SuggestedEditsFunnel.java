package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0003\u001f !B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0011J\u000e\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u001a\u001a\u00020\u0011J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u001dH\u0014J\u000e\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/analytics/SuggestedEditsFunnel;", "Lorg/wikipedia/analytics/TimedFunnel;", "app", "Lorg/wikipedia/WikipediaApp;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "(Lorg/wikipedia/WikipediaApp;Lorg/wikipedia/Constants$InvokeSource;)V", "contributionsOpenedCount", "", "helpOpenedCount", "parentSessionToken", "", "statsCollection", "Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStatsCollection;", "uniqueTitles", "", "cancel", "", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "click", "title", "contributionsOpened", "failure", "helpOpened", "impression", "log", "preprocessSessionToken", "eventData", "Lorg/json/JSONObject;", "success", "Companion", "SuggestedEditStats", "SuggestedEditStatsCollection", "app_alphaDebug"})
public final class SuggestedEditsFunnel extends org.wikipedia.analytics.TimedFunnel {
    private final org.wikipedia.Constants.InvokeSource invokeSource = null;
    private final java.lang.String parentSessionToken = null;
    private int helpOpenedCount = 0;
    private int contributionsOpenedCount = 0;
    private final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStatsCollection statsCollection = null;
    private final java.util.List<java.lang.String> uniqueTitles = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.SuggestedEditsFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppSuggestedEdits";
    private static final int REV_ID = 18949003;
    private static final java.lang.String SUGGESTED_EDITS_UI_VERSION = "1.0";
    private static final java.lang.String SUGGESTED_EDITS_API_VERSION = "1.0";
    private static org.wikipedia.analytics.SuggestedEditsFunnel INSTANCE;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUGGESTED_EDITS_ADD_COMMENT = "#suggestededit-add 1.0";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUGGESTED_EDITS_TRANSLATE_COMMENT = "#suggestededit-translate 1.0";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUGGESTED_EDITS_IMAGE_TAG_AUTO_COMMENT = "#suggestededit-imgtag-auto 1.0";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SUGGESTED_EDITS_IMAGE_TAG_CUSTOM_COMMENT = "#suggestededit-imgtag-custom 1.0";
    
    private SuggestedEditsFunnel(org.wikipedia.WikipediaApp app, org.wikipedia.Constants.InvokeSource invokeSource) {
        super(null, null, 0, 0, null);
    }
    
    @java.lang.Override()
    protected void preprocessSessionToken(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
    }
    
    public final void impression(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    public final void click(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    public final void cancel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    public final void success(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    public final void failure(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    public final void helpOpened() {
    }
    
    public final void contributionsOpened() {
    }
    
    public final void log() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u0000 !2\u00020\u0001:\u0002 !BU\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\fB\u0005\u00a2\u0006\u0002\u0010\rJ!\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u00c7\u0001R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\r\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\r\u001a\u0004\b\u0012\u0010\u0010R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0010R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\r\u001a\u0004\b\u0018\u0010\u0010\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStatsCollection;", "", "seen1", "", "addDescriptionStats", "Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStats;", "translateDescriptionStats", "addCaptionStats", "translateCaptionStats", "imageTagStats", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStats;Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStats;Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStats;Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStats;Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStats;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getAddCaptionStats$annotations", "getAddCaptionStats", "()Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStats;", "getAddDescriptionStats$annotations", "getAddDescriptionStats", "getImageTagStats$annotations", "getImageTagStats", "getTranslateCaptionStats$annotations", "getTranslateCaptionStats", "getTranslateDescriptionStats$annotations", "getTranslateDescriptionStats", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_alphaDebug"})
    @kotlinx.serialization.Serializable()
    static final class SuggestedEditStatsCollection {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStatsCollection.Companion Companion = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats addDescriptionStats = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats translateDescriptionStats = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats addCaptionStats = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats translateCaptionStats = null;
        @org.jetbrains.annotations.NotNull()
        private final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats imageTagStats = null;
        
        public SuggestedEditStatsCollection() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStatsCollection self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats getAddDescriptionStats() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "a-d")
        @java.lang.Deprecated()
        public static void getAddDescriptionStats$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats getTranslateDescriptionStats() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "t-d")
        @java.lang.Deprecated()
        public static void getTranslateDescriptionStats$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats getAddCaptionStats() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "a-c")
        @java.lang.Deprecated()
        public static void getAddCaptionStats$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats getTranslateCaptionStats() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "t-c")
        @java.lang.Deprecated()
        public static void getTranslateCaptionStats$annotations() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats getImageTagStats() {
            return null;
        }
        
        @kotlinx.serialization.SerialName(value = "i-t")
        @java.lang.Deprecated()
        public static void getImageTagStats$annotations() {
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStatsCollection$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStatsCollection;", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStatsCollection> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/analytics/SuggestedEditsFunnel.SuggestedEditStatsCollection.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStatsCollection;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStatsCollection> {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStatsCollection.$serializer INSTANCE = null;
            
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
            public org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStatsCollection deserialize(@org.jetbrains.annotations.NotNull()
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
            org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStatsCollection value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u0000 -2\u00020\u0001:\u0002,-B]\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\u0003\u0012\b\b\u0001\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eB\u0005\u00a2\u0006\u0002\u0010\u000fJ!\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020\u00002\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u00c7\u0001R$\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R$\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0018\u0010\u000f\u001a\u0004\b\u0019\u0010\u0012\"\u0004\b\u001a\u0010\u0014R$\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0012\"\u0004\b\u001d\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u001eR$\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0012\"\u0004\b!\u0010\u0014R$\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\"\u0010\u000f\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010\u0014\u00a8\u0006."}, d2 = {"Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStats;", "", "seen1", "", "impressions", "clicks", "suggestionsClicked", "cancels", "successes", "failures", "isEmpty", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IIIIIIIZLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getCancels$annotations", "getCancels", "()I", "setCancels", "(I)V", "getClicks$annotations", "getClicks", "setClicks", "getFailures$annotations", "getFailures", "setFailures", "getImpressions$annotations", "getImpressions", "setImpressions", "()Z", "getSuccesses$annotations", "getSuccesses", "setSuccesses", "getSuggestionsClicked$annotations", "getSuggestionsClicked", "setSuggestionsClicked", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_alphaDebug"})
    @kotlinx.serialization.Serializable()
    static final class SuggestedEditStats {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats.Companion Companion = null;
        private int impressions = 0;
        private int clicks = 0;
        private int suggestionsClicked = 0;
        private int cancels = 0;
        private int successes = 0;
        private int failures = 0;
        private final boolean isEmpty = false;
        
        public SuggestedEditStats() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public static final void write$Self(@org.jetbrains.annotations.NotNull()
        org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats self, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
        kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
        }
        
        public final int getImpressions() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "imp")
        @java.lang.Deprecated()
        public static void getImpressions$annotations() {
        }
        
        public final void setImpressions(int p0) {
        }
        
        public final int getClicks() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "clk")
        @java.lang.Deprecated()
        public static void getClicks$annotations() {
        }
        
        public final void setClicks(int p0) {
        }
        
        public final int getSuggestionsClicked() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "sg")
        @java.lang.Deprecated()
        public static void getSuggestionsClicked$annotations() {
        }
        
        public final void setSuggestionsClicked(int p0) {
        }
        
        public final int getCancels() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "cxl")
        @java.lang.Deprecated()
        public static void getCancels$annotations() {
        }
        
        public final void setCancels(int p0) {
        }
        
        public final int getSuccesses() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "suc")
        @java.lang.Deprecated()
        public static void getSuccesses$annotations() {
        }
        
        public final void setSuccesses(int p0) {
        }
        
        public final int getFailures() {
            return 0;
        }
        
        @kotlinx.serialization.SerialName(value = "fl")
        @java.lang.Deprecated()
        public static void getFailures$annotations() {
        }
        
        public final void setFailures(int p0) {
        }
        
        public final boolean isEmpty() {
            return false;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStats$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStats;", "app_alphaDebug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final kotlinx.serialization.KSerializer<org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats> serializer() {
                return null;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/analytics/SuggestedEditsFunnel.SuggestedEditStats.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/analytics/SuggestedEditsFunnel$SuggestedEditStats;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
        @java.lang.Deprecated()
        public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats> {
            @org.jetbrains.annotations.NotNull()
            public static final org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats.$serializer INSTANCE = null;
            
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
            public org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats deserialize(@org.jetbrains.annotations.NotNull()
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
            org.wikipedia.analytics.SuggestedEditsFunnel.SuggestedEditStats value) {
            }
            
            @org.jetbrains.annotations.NotNull()
            public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000f\u001a\u00020\u0004J\u0011\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0086\u0002J\u0006\u0010\u0012\u001a\u00020\u0013R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/analytics/SuggestedEditsFunnel$Companion;", "", "()V", "INSTANCE", "Lorg/wikipedia/analytics/SuggestedEditsFunnel;", "REV_ID", "", "SCHEMA_NAME", "", "SUGGESTED_EDITS_ADD_COMMENT", "SUGGESTED_EDITS_API_VERSION", "SUGGESTED_EDITS_IMAGE_TAG_AUTO_COMMENT", "SUGGESTED_EDITS_IMAGE_TAG_CUSTOM_COMMENT", "SUGGESTED_EDITS_TRANSLATE_COMMENT", "SUGGESTED_EDITS_UI_VERSION", "get", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "reset", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.analytics.SuggestedEditsFunnel get(@org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.analytics.SuggestedEditsFunnel get() {
            return null;
        }
        
        public final void reset() {
        }
    }
}