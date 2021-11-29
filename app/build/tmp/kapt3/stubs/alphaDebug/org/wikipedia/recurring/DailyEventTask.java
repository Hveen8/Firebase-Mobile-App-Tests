package org.wikipedia.recurring;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0094\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/recurring/DailyEventTask;", "Lorg/wikipedia/recurring/RecurringTask;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "name", "", "getName", "()Ljava/lang/String;", "isDailyEventDue", "", "lastRun", "Ljava/util/Date;", "logDailyEventReport", "", "onDailyEvent", "run", "shouldRun", "timeSinceLastDailyEvent", "", "app_alphaDebug"})
public final class DailyEventTask extends org.wikipedia.recurring.RecurringTask {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    
    public DailyEventTask(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    protected boolean shouldRun(@org.jetbrains.annotations.NotNull()
    java.util.Date lastRun) {
        return false;
    }
    
    @java.lang.Override()
    protected void run(@org.jetbrains.annotations.NotNull()
    java.util.Date lastRun) {
    }
    
    private final void onDailyEvent() {
    }
    
    private final void logDailyEventReport() {
    }
    
    private final boolean isDailyEventDue(java.util.Date lastRun) {
        return false;
    }
    
    private final long timeSinceLastDailyEvent(java.util.Date lastRun) {
        return 0L;
    }
}