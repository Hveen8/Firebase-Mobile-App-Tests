package org.wikipedia.descriptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0002\u001d\u001eB\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\u0002H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\n2\b\b\u0001\u0010\u001a\u001a\u00020\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/descriptions/DescriptionEditFragment;", "Lorg/wikipedia/descriptions/DescriptionEditFragment$Callback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$Callback;", "()V", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "createFragment", "onBackPressed", "", "onBottomBarContainerClicked", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "onDescriptionEditSuccess", "onLinkPreviewAddToList", "title", "Lorg/wikipedia/page/PageTitle;", "onLinkPreviewCopyLink", "onLinkPreviewLoadPage", "entry", "Lorg/wikipedia/history/HistoryEntry;", "inNewTab", "", "onLinkPreviewShareLink", "updateNavigationBarColor", "color", "", "updateStatusBarColor", "Action", "Companion", "app_alphaDebug"})
public final class DescriptionEditActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.descriptions.DescriptionEditFragment> implements org.wikipedia.descriptions.DescriptionEditFragment.Callback, org.wikipedia.page.linkpreview.LinkPreviewDialog.Callback {
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditActivity.Companion Companion = null;
    private static final java.lang.String EXTRA_TITLE = "title";
    private static final java.lang.String EXTRA_HIGHLIGHT_TEXT = "highlightText";
    private static final java.lang.String EXTRA_SOURCE_SUMMARY = "sourceSummary";
    private static final java.lang.String EXTRA_TARGET_SUMMARY = "targetSummary";
    
    public DescriptionEditActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.descriptions.DescriptionEditFragment createFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public void onDescriptionEditSuccess() {
    }
    
    @java.lang.Override()
    public void onBottomBarContainerClicked(@org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewLoadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean inNewTab) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewCopyLink(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewAddToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    @java.lang.Override()
    public void onLinkPreviewShareLink(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    public final void updateStatusBarColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    public final void updateNavigationBarColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.Nullable()
    java.lang.String highlightText, @org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.PageSummaryForEdit sourceSummary, @org.jetbrains.annotations.Nullable()
    org.wikipedia.suggestededits.PageSummaryForEdit targetSummary, @org.jetbrains.annotations.NotNull()
    org.wikipedia.descriptions.DescriptionEditActivity.Action action, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource invokeSource) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "", "(Ljava/lang/String;I)V", "ADD_DESCRIPTION", "TRANSLATE_DESCRIPTION", "ADD_CAPTION", "TRANSLATE_CAPTION", "ADD_IMAGE_TAGS", "app_alphaDebug"})
    public static enum Action {
        /*public static final*/ ADD_DESCRIPTION /* = new ADD_DESCRIPTION() */,
        /*public static final*/ TRANSLATE_DESCRIPTION /* = new TRANSLATE_DESCRIPTION() */,
        /*public static final*/ ADD_CAPTION /* = new ADD_CAPTION() */,
        /*public static final*/ TRANSLATE_CAPTION /* = new TRANSLATE_CAPTION() */,
        /*public static final*/ ADD_IMAGE_TAGS /* = new ADD_IMAGE_TAGS() */;
        
        Action() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002JF\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditActivity$Companion;", "", "()V", "EXTRA_HIGHLIGHT_TEXT", "", "EXTRA_SOURCE_SUMMARY", "EXTRA_TARGET_SUMMARY", "EXTRA_TITLE", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "title", "Lorg/wikipedia/page/PageTitle;", "highlightText", "sourceSummary", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "targetSummary", "action", "Lorg/wikipedia/descriptions/DescriptionEditActivity$Action;", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.Nullable()
        java.lang.String highlightText, @org.jetbrains.annotations.Nullable()
        org.wikipedia.suggestededits.PageSummaryForEdit sourceSummary, @org.jetbrains.annotations.Nullable()
        org.wikipedia.suggestededits.PageSummaryForEdit targetSummary, @org.jetbrains.annotations.NotNull()
        org.wikipedia.descriptions.DescriptionEditActivity.Action action, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource invokeSource) {
            return null;
        }
    }
}