package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 E2\u00020\u0001:\u0002DEBy\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0013B\u0005\u00a2\u0006\u0002\u0010\u0014J\u000e\u00106\u001a\u0002072\u0006\u0010\u0019\u001a\u00020\u0005J\u0006\u00108\u001a\u000207J\u000e\u00109\u001a\u0002072\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u000207J\u0006\u0010=\u001a\u00020\u0005J!\u0010>\u001a\u0002072\u0006\u0010?\u001a\u00020\u00002\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u00c7\u0001R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u001a8\u0002X\u0083\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u001b\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001d\"\u0004\b!\u0010\u001fR\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001fR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001d\"\u0004\b\'\u0010\u001fR\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001d\"\u0004\b)\u0010\u001fR\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u001d\"\u0004\b-\u0010\u001fR\u001a\u0010\u0010\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u001d\"\u0004\b/\u0010\u001fR\u001a\u0010\u000f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u001d\"\u0004\b1\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0016\"\u0004\b3\u0010\u0018R\u0011\u00104\u001a\u00020\u00038F\u00a2\u0006\u0006\u001a\u0004\b5\u0010\u001d\u00a8\u0006F"}, d2 = {"Lorg/wikipedia/analytics/SessionData;", "", "seen1", "", "startTime", "", "lastTouchTime", "pagesFromSearch", "pagesFromRandom", "pagesFromLangLink", "pagesFromInternal", "pagesFromExternal", "pagesFromHistory", "pagesFromReadingList", "pagesFromBack", "pagesWithNoDescription", "pagesFromSuggestedEdits", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJJIIIIIIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "()V", "getLastTouchTime", "()J", "setLastTouchTime", "(J)V", "leadLatency", "Lorg/wikipedia/util/MathUtil$Averaged;", "getLeadLatency$annotations", "getPagesFromBack", "()I", "setPagesFromBack", "(I)V", "getPagesFromExternal", "setPagesFromExternal", "getPagesFromHistory", "setPagesFromHistory", "getPagesFromInternal", "setPagesFromInternal", "getPagesFromLangLink", "setPagesFromLangLink", "getPagesFromRandom", "setPagesFromRandom", "getPagesFromReadingList", "setPagesFromReadingList", "getPagesFromSearch", "setPagesFromSearch", "getPagesFromSuggestedEdits", "setPagesFromSuggestedEdits", "getPagesWithNoDescription", "setPagesWithNoDescription", "getStartTime", "setStartTime", "totalPages", "getTotalPages", "addLeadLatency", "", "addPageFromBack", "addPageViewed", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addPageWithNoDescription", "getLeadLatency", "write$Self", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "$serializer", "Companion", "app_alphaDebug"})
@kotlinx.serialization.Serializable()
public final class SessionData {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.SessionData.Companion Companion = null;
    private final org.wikipedia.util.MathUtil.Averaged<java.lang.Long> leadLatency = null;
    private long startTime;
    private long lastTouchTime;
    private int pagesFromSearch = 0;
    private int pagesFromRandom = 0;
    private int pagesFromLangLink = 0;
    private int pagesFromInternal = 0;
    private int pagesFromExternal = 0;
    private int pagesFromHistory = 0;
    private int pagesFromReadingList = 0;
    private int pagesFromBack = 0;
    private int pagesWithNoDescription = 0;
    private int pagesFromSuggestedEdits = 0;
    
    public SessionData() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void write$Self(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.SessionData self, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.encoding.CompositeEncoder output, @org.jetbrains.annotations.NotNull()
    kotlinx.serialization.descriptors.SerialDescriptor serialDesc) {
    }
    
    @kotlinx.serialization.Transient()
    @java.lang.Deprecated()
    private static void getLeadLatency$annotations() {
    }
    
    public final long getStartTime() {
        return 0L;
    }
    
    public final void setStartTime(long p0) {
    }
    
    public final long getLastTouchTime() {
        return 0L;
    }
    
    public final void setLastTouchTime(long p0) {
    }
    
    public final int getPagesFromSearch() {
        return 0;
    }
    
    public final void setPagesFromSearch(int p0) {
    }
    
    public final int getPagesFromRandom() {
        return 0;
    }
    
    public final void setPagesFromRandom(int p0) {
    }
    
    public final int getPagesFromLangLink() {
        return 0;
    }
    
    public final void setPagesFromLangLink(int p0) {
    }
    
    public final int getPagesFromInternal() {
        return 0;
    }
    
    public final void setPagesFromInternal(int p0) {
    }
    
    public final int getPagesFromExternal() {
        return 0;
    }
    
    public final void setPagesFromExternal(int p0) {
    }
    
    public final int getPagesFromHistory() {
        return 0;
    }
    
    public final void setPagesFromHistory(int p0) {
    }
    
    public final int getPagesFromReadingList() {
        return 0;
    }
    
    public final void setPagesFromReadingList(int p0) {
    }
    
    public final int getPagesFromBack() {
        return 0;
    }
    
    public final void setPagesFromBack(int p0) {
    }
    
    public final int getPagesWithNoDescription() {
        return 0;
    }
    
    public final void setPagesWithNoDescription(int p0) {
    }
    
    public final int getPagesFromSuggestedEdits() {
        return 0;
    }
    
    public final void setPagesFromSuggestedEdits(int p0) {
    }
    
    public final void addPageViewed(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final long getLeadLatency() {
        return 0L;
    }
    
    public final void addLeadLatency(long leadLatency) {
    }
    
    public final void addPageFromBack() {
    }
    
    public final void addPageWithNoDescription() {
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0001\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/analytics/SessionData$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lorg/wikipedia/analytics/SessionData;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final kotlinx.serialization.KSerializer<org.wikipedia.analytics.SessionData> serializer() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\n0\tH\u00d6\u0001\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\u0019\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0002H\u00d6\u0001R\u0014\u0010\u0004\u001a\u00020\u00058VX\u00d6\u0005\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0014"}, d2 = {"org/wikipedia/analytics/SessionData.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lorg/wikipedia/analytics/SessionData;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "app_alphaDebug"})
    @java.lang.Deprecated()
    public static final class $serializer implements kotlinx.serialization.internal.GeneratedSerializer<org.wikipedia.analytics.SessionData> {
        @org.jetbrains.annotations.NotNull()
        public static final org.wikipedia.analytics.SessionData.$serializer INSTANCE = null;
        
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
        public org.wikipedia.analytics.SessionData deserialize(@org.jetbrains.annotations.NotNull()
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
        org.wikipedia.analytics.SessionData value) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public kotlinx.serialization.KSerializer<?>[] typeParametersSerializers() {
            return null;
        }
    }
}