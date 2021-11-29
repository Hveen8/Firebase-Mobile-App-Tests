package org.wikipedia.userprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0017J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00172\u0006\u0010\u001b\u001a\u00020\u0018J\u0006\u0010\u001c\u001a\u00020\u0004J\u0006\u0010\u001d\u001a\u00020\u001eJ\b\u0010\u001f\u001a\u0004\u0018\u00010 J\u0006\u0010!\u001a\u00020\"R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\t\"\u0004\b\u0012\u0010\u000bR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000b\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/userprofile/UserContributionsStats;", "", "()V", "PAUSE_DURATION_DAYS", "", "REVERT_SEVERITY_DISABLE_THRESHOLD", "REVERT_SEVERITY_PAUSE_THRESHOLD", "totalDescriptionEdits", "getTotalDescriptionEdits", "()I", "setTotalDescriptionEdits", "(I)V", "totalEdits", "totalImageCaptionEdits", "getTotalImageCaptionEdits", "setTotalImageCaptionEdits", "totalImageTagEdits", "getTotalImageTagEdits", "setTotalImageTagEdits", "totalReverts", "getTotalReverts", "setTotalReverts", "getEditCountsObservable", "Lio/reactivex/rxjava3/core/Observable;", "Lorg/wikipedia/dataclient/mwapi/MwQueryResponse;", "getPageViewsObservable", "", "response", "getRevertSeverity", "isDisabled", "", "maybePauseAndGetEndDate", "Ljava/util/Date;", "updateStatsInBackground", "", "app_alphaDebug"})
public final class UserContributionsStats {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.userprofile.UserContributionsStats INSTANCE = null;
    private static final int REVERT_SEVERITY_PAUSE_THRESHOLD = 5;
    private static final int REVERT_SEVERITY_DISABLE_THRESHOLD = 7;
    private static final int PAUSE_DURATION_DAYS = 7;
    private static int totalEdits = 0;
    private static int totalReverts = 0;
    private static int totalDescriptionEdits = 0;
    private static int totalImageCaptionEdits = 0;
    private static int totalImageTagEdits = 0;
    
    private UserContributionsStats() {
        super();
    }
    
    public final int getTotalReverts() {
        return 0;
    }
    
    public final void setTotalReverts(int p0) {
    }
    
    public final int getTotalDescriptionEdits() {
        return 0;
    }
    
    public final void setTotalDescriptionEdits(int p0) {
    }
    
    public final int getTotalImageCaptionEdits() {
        return 0;
    }
    
    public final void setTotalImageCaptionEdits(int p0) {
    }
    
    public final int getTotalImageTagEdits() {
        return 0;
    }
    
    public final void setTotalImageTagEdits(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getEditCountsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<java.lang.Long> getPageViewsObservable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<java.lang.Long> getPageViewsObservable(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryResponse response) {
        return null;
    }
    
    public final void updateStatsInBackground() {
    }
    
    public final int getRevertSeverity() {
        return 0;
    }
    
    public final boolean isDisabled() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.Date maybePauseAndGetEndDate() {
        return null;
    }
}