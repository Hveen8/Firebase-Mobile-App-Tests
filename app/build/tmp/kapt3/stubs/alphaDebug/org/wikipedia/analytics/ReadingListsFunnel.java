package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\r\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0014\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/analytics/ReadingListsFunnel;", "Lorg/wikipedia/analytics/Funnel;", "()V", "logAddClick", "", "source", "Lorg/wikipedia/Constants$InvokeSource;", "logAddToList", "list", "Lorg/wikipedia/readinglist/database/ReadingList;", "listCount", "", "logDeleteItem", "logDeleteList", "logModifyList", "logMoveClick", "logMoveToList", "preprocessData", "Lorg/json/JSONObject;", "eventData", "preprocessSessionToken", "Companion", "app_alphaDebug"})
public final class ReadingListsFunnel extends org.wikipedia.analytics.Funnel {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.ReadingListsFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppReadingLists";
    private static final int REV_ID = 20339451;
    
    public ReadingListsFunnel() {
        super(null, null, 0, null);
    }
    
    public final void logAddClick(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
    }
    
    public final void logAddToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, int listCount, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
    }
    
    public final void logMoveClick(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
    }
    
    public final void logMoveToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, int listCount, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
    }
    
    public final void logModifyList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, int listCount) {
    }
    
    public final void logDeleteList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, int listCount) {
    }
    
    public final void logDeleteItem(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, int listCount) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.json.JSONObject preprocessData(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
        return null;
    }
    
    @java.lang.Override()
    protected void preprocessSessionToken(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/analytics/ReadingListsFunnel$Companion;", "", "()V", "REV_ID", "", "SCHEMA_NAME", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}