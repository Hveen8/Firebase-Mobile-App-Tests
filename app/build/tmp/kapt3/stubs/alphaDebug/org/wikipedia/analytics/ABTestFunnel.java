package org.wikipedia.analytics;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014R\u0011\u0010\u0007\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/analytics/ABTestFunnel;", "Lorg/wikipedia/analytics/Funnel;", "abTestName", "", "abTestGroupCount", "", "(Ljava/lang/String;I)V", "aBTestGroup", "getABTestGroup", "()I", "isEnrolled", "", "logGroupEvent", "", "groupEventId", "preprocessSessionToken", "eventData", "Lorg/json/JSONObject;", "Companion", "app_alphaDebug"})
public final class ABTestFunnel extends org.wikipedia.analytics.Funnel {
    private final java.lang.String abTestName = null;
    private final int abTestGroupCount = 0;
    private final boolean isEnrolled = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.analytics.ABTestFunnel.Companion Companion = null;
    private static final java.lang.String SCHEMA_NAME = "MobileWikiAppABTest";
    private static final int REV_ID = 19990870;
    private static final java.lang.String AB_TEST_KEY_PREFIX = "ab_test_";
    public static final int GROUP_SIZE_2 = 2;
    public static final int GROUP_SIZE_3 = 3;
    public static final int GROUP_1 = 0;
    public static final int GROUP_2 = 1;
    public static final int GROUP_3 = 2;
    
    public ABTestFunnel(@org.jetbrains.annotations.NotNull()
    java.lang.String abTestName, int abTestGroupCount) {
        super(null, null, 0, null);
    }
    
    public final int getABTestGroup() {
        return 0;
    }
    
    @java.lang.Override()
    protected void preprocessSessionToken(@org.jetbrains.annotations.NotNull()
    org.json.JSONObject eventData) {
    }
    
    public final void logGroupEvent(@org.jetbrains.annotations.NotNull()
    java.lang.String groupEventId) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/analytics/ABTestFunnel$Companion;", "", "()V", "AB_TEST_KEY_PREFIX", "", "GROUP_1", "", "GROUP_2", "GROUP_3", "GROUP_SIZE_2", "GROUP_SIZE_3", "REV_ID", "SCHEMA_NAME", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}