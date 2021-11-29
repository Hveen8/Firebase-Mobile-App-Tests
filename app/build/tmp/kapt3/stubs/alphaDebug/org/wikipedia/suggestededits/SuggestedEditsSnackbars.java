package org.wikipedia.suggestededits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002JF\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0007J\u001a\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00040\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsSnackbars;", "", "()V", "MAX_SHOW_PER_SESSION", "", "snackbarSessionMap", "", "", "getMapKey", "activity", "Landroid/app/Activity;", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "getSessionCount", "incrementSessionMap", "", "show", "sequentialSnackbar", "", "targetLanguageCode", "enableViewAction", "listener", "Lorg/wikipedia/suggestededits/SuggestedEditsSnackbars$OpenPageListener;", "showFeedLinkSnackbar", "OpenPageListener", "app_alphaDebug"})
public final class SuggestedEditsSnackbars {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsSnackbars INSTANCE = null;
    private static final int MAX_SHOW_PER_SESSION = 2;
    private static final java.util.Map<java.lang.String, java.lang.Integer> snackbarSessionMap = null;
    
    private SuggestedEditsSnackbars() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void show(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action, boolean sequentialSnackbar, @org.jetbrains.annotations.Nullable()
    java.lang.String targetLanguageCode, boolean enableViewAction, @org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.SuggestedEditsSnackbars.OpenPageListener listener) {
    }
    
    private final void showFeedLinkSnackbar(android.app.Activity activity, org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    private final void incrementSessionMap(android.app.Activity activity, org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    private final int getSessionCount(android.app.Activity activity, org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
        return 0;
    }
    
    private final java.lang.String getMapKey(android.app.Activity activity, org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&\u00a8\u0006\u0004"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsSnackbars$OpenPageListener;", "", "open", "", "app_alphaDebug"})
    public static abstract interface OpenPageListener {
        
        public abstract void open();
    }
}