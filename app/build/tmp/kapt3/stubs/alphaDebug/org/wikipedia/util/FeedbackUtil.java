package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002JF\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u00042\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u0016J:\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0001\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J \u0010\u001c\u001a\u00020\u001d2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u0004H\u0007J!\u0010\u001f\u001a\u00020 2\u0012\u0010!\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\"\"\u00020\fH\u0007\u00a2\u0006\u0002\u0010#J\u0010\u0010$\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010%\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010&\u001a\u00020\u0004H\u0007J\u0010\u0010\'\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u0010(\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u001a\u0010)\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010*\u001a\u0004\u0018\u00010+H\u0007J\"\u0010,\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u001e\u001a\u00020\u0004H\u0007J\u001a\u0010,\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010-\u001a\u00020\u0004H\u0007J \u0010,\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010-\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u0004J\u001a\u0010,\u001a\u00020 2\u0006\u0010.\u001a\u00020/2\b\b\u0001\u0010\u0013\u001a\u00020\u0004H\u0007J\u0018\u0010,\u001a\u00020 2\u0006\u0010.\u001a\u00020/2\u0006\u0010\u0013\u001a\u000200H\u0007J\u0018\u00101\u001a\u00020 2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00102\u001a\u00020\u0014H\u0007J\u0010\u00103\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\u0010\u00104\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J \u00105\u001a\u0002062\u0006\u00107\u001a\u00020\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001e\u001a\u00020\u0004JD\u00108\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00042\b\b\u0002\u0010\u0018\u001a\u00020\u0004H\u0007JB\u00108\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u00109\u001a\u00020\f2\b\b\u0001\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016H\u0007J0\u00108\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010:\u001a\u00020\u00102\u0006\u00109\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u001e\u0010;\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010<\u001a\u0002002\u0006\u0010=\u001a\u000200J\u001e\u0010>\u001a\u00020 2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010<\u001a\u0002002\u0006\u0010=\u001a\u000200R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006?"}, d2 = {"Lorg/wikipedia/util/FeedbackUtil;", "", "()V", "LENGTH_DEFAULT", "", "LENGTH_LONG", "getLENGTH_LONG", "()I", "LENGTH_MEDIUM", "TOOLBAR_LONG_CLICK_LISTENER", "Landroid/view/View$OnLongClickListener;", "findBestView", "Landroid/view/View;", "activity", "Landroid/app/Activity;", "getTooltip", "Lcom/skydoves/balloon/Balloon;", "context", "Landroid/content/Context;", "text", "", "autoDismiss", "", "arrowAnchorPadding", "topOrBottomMargin", "aboveOrBelow", "showDismissButton", "layoutRes", "makeSnackbar", "Lcom/google/android/material/snackbar/Snackbar;", "duration", "setButtonLongPressToast", "", "views", "", "([Landroid/view/View;)V", "showAboutWikipedia", "showAndroidAppEditingFAQ", "urlStr", "showAndroidAppFAQ", "showAndroidAppRequestAnAccount", "showError", "e", "", "showMessage", "resId", "fragment", "Landroidx/fragment/app/Fragment;", "", "showMessageAsPlainText", "possibleHtml", "showOfflineReadingAndData", "showPrivacyPolicy", "showToastOverView", "Landroid/widget/Toast;", "view", "showTooltip", "anchor", "balloon", "showUserContributionsPage", "username", "languageCode", "showUserProfilePage", "app_alphaDebug"})
public final class FeedbackUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.FeedbackUtil INSTANCE = null;
    @kotlin.jvm.JvmField()
    public static final int LENGTH_DEFAULT = 0;
    @kotlin.jvm.JvmField()
    public static final int LENGTH_MEDIUM = 0;
    private static final int LENGTH_LONG = 0;
    private static final android.view.View.OnLongClickListener TOOLBAR_LONG_CLICK_LISTENER = null;
    
    private FeedbackUtil() {
        super();
    }
    
    public final int getLENGTH_LONG() {
        return 0;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showError(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.Throwable e) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showMessageAsPlainText(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence possibleHtml) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showMessage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @androidx.annotation.StringRes()
    int text) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showMessage(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showMessage(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @androidx.annotation.StringRes()
    int resId) {
    }
    
    public final void showMessage(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @androidx.annotation.StringRes()
    int resId, int duration) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void showMessage(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void showMessage(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int duration) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showPrivacyPolicy(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showOfflineReadingAndData(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showAboutWikipedia(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showAndroidAppFAQ(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void showAndroidAppRequestAnAccount(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void showUserContributionsPage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
    }
    
    public final void showUserProfilePage(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String languageCode) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void showAndroidAppEditingFAQ(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final void showAndroidAppEditingFAQ(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @androidx.annotation.StringRes()
    int urlStr) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void setButtonLongPressToast(@org.jetbrains.annotations.NotNull()
    android.view.View... views) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.google.android.material.snackbar.Snackbar makeSnackbar(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.widget.Toast showToastOverView(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text, int duration) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.skydoves.balloon.Balloon showTooltip(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.view.View anchor, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, boolean aboveOrBelow, boolean autoDismiss, int arrowAnchorPadding, int topOrBottomMargin) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final com.skydoves.balloon.Balloon showTooltip(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.NotNull()
    android.view.View anchor, @androidx.annotation.LayoutRes()
    int layoutRes, int arrowAnchorPadding, int topOrBottomMargin, boolean aboveOrBelow, boolean autoDismiss) {
        return null;
    }
    
    private final com.skydoves.balloon.Balloon showTooltip(android.app.Activity activity, com.skydoves.balloon.Balloon balloon, android.view.View anchor, boolean aboveOrBelow, boolean autoDismiss) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.skydoves.balloon.Balloon getTooltip(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, boolean autoDismiss, int arrowAnchorPadding, int topOrBottomMargin, boolean aboveOrBelow, boolean showDismissButton) {
        return null;
    }
    
    private final com.skydoves.balloon.Balloon getTooltip(android.content.Context context, @androidx.annotation.LayoutRes()
    int layoutRes, int arrowAnchorPadding, int topOrBottomMargin, boolean aboveOrBelow, boolean autoDismiss) {
        return null;
    }
    
    private final android.view.View findBestView(android.app.Activity activity) {
        return null;
    }
}