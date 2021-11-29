package org.wikipedia.recurring;

import java.lang.System;

/**
 * Represents a task that needs to be run periodically.
 *
 * Usually an expensive task, that is run Async. Do not do anything
 * that requires access to the UI thread on these tasks.
 *
 * Since it is an expensive task, there's a separate method that detects
 * if the task should be run or not, and then runs it if necessary. The
 * last run times are tracked automatically by the base class.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\bH$J\u0006\u0010\u0012\u001a\u00020\u0010J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\bH$R\u0014\u0010\u0003\u001a\u00020\u00048DX\u0084\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/recurring/RecurringTask;", "", "()V", "absoluteTime", "", "getAbsoluteTime", "()J", "lastRunDate", "Ljava/util/Date;", "getLastRunDate", "()Ljava/util/Date;", "name", "", "getName", "()Ljava/lang/String;", "run", "", "lastRun", "runIfNecessary", "shouldRun", "", "app_alphaDebug"})
public abstract class RecurringTask {
    
    public RecurringTask() {
        super();
    }
    
    public final void runIfNecessary() {
    }
    
    protected abstract boolean shouldRun(@org.jetbrains.annotations.NotNull()
    java.util.Date lastRun);
    
    protected abstract void run(@org.jetbrains.annotations.NotNull()
    java.util.Date lastRun);
    
    @org.jetbrains.annotations.NotNull()
    protected abstract java.lang.String getName();
    
    protected final long getAbsoluteTime() {
        return 0L;
    }
    
    private final java.util.Date getLastRunDate() {
        return null;
    }
}