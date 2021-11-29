package org.wikipedia.activity;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0015\b&\u0018\u0000 :2\u00020\u0001:\u0004:;<=B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\b\u0010\u0018\u001a\u00020\u0010H\u0002J\u0012\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001c\u001a\u00020\u0010H\u0014J\b\u0010\u001d\u001a\u00020\u0010H\u0014J\b\u0010\u001e\u001a\u00020\u0010H\u0014J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020!H\u0016J+\u0010\"\u001a\u00020\u00102\u0006\u0010#\u001a\u00020$2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&2\u0006\u0010(\u001a\u00020)H\u0016\u00a2\u0006\u0002\u0010*J\b\u0010+\u001a\u00020\u0010H\u0014J\b\u0010,\u001a\u00020\u0010H\u0014J\b\u0010-\u001a\u00020\u0010H\u0016J\b\u0010.\u001a\u00020\u0010H\u0002J\b\u0010/\u001a\u00020\u0010H\u0002J\u000e\u00100\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0004J\u0006\u00102\u001a\u00020\u0010J\u0012\u00103\u001a\u00020\u00102\b\b\u0001\u00104\u001a\u00020$H\u0004J\u0012\u00105\u001a\u00020\u00102\b\b\u0001\u00104\u001a\u00020$H\u0004J\b\u00106\u001a\u00020\u0010H\u0014J\b\u00107\u001a\u00020\u0010H\u0002J\b\u00108\u001a\u00020\u0010H\u0002J\b\u00109\u001a\u00020\u0010H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0007\u001a\u00060\bR\u00020\u0000X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00060\fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006>"}, d2 = {"Lorg/wikipedia/activity/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "currentTooltip", "Lcom/skydoves/balloon/Balloon;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "exclusiveBusMethods", "Lorg/wikipedia/activity/BaseActivity$ExclusiveBusConsumer;", "imageZoomHelper", "Lorg/wikipedia/views/ImageZoomHelper;", "networkStateReceiver", "Lorg/wikipedia/activity/BaseActivity$NetworkStateReceiver;", "previousNetworkState", "", "applyOverrideConfiguration", "", "configuration", "Landroid/content/res/Configuration;", "dismissCurrentTooltip", "dispatchTouchEvent", "event", "Landroid/view/MotionEvent;", "goToSystemAppSettings", "maybeShowLoggedOutInBackgroundDialog", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onGoOffline", "onGoOnline", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onRequestPermissionsResult", "requestCode", "", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "onStop", "onUnreadNotification", "removeSplashBackground", "requestStoragePermission", "setCurrentTooltip", "tooltip", "setImageZoomHelper", "setNavigationBarColor", "color", "setStatusBarColor", "setTheme", "showAppSettingSnackbar", "showStoragePermissionSnackbar", "unregisterExclusiveBusMethods", "Companion", "ExclusiveBusConsumer", "NetworkStateReceiver", "NonExclusiveBusConsumer", "app_alphaDebug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity {
    private org.wikipedia.activity.BaseActivity.ExclusiveBusConsumer exclusiveBusMethods;
    private final org.wikipedia.activity.BaseActivity.NetworkStateReceiver networkStateReceiver = null;
    private boolean previousNetworkState;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private com.skydoves.balloon.Balloon currentTooltip;
    private org.wikipedia.views.ImageZoomHelper imageZoomHelper;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.activity.BaseActivity.Companion Companion = null;
    private static org.wikipedia.activity.BaseActivity.ExclusiveBusConsumer EXCLUSIVE_BUS_METHODS;
    private static io.reactivex.rxjava3.disposables.Disposable EXCLUSIVE_DISPOSABLE;
    
    public BaseActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onStop() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public void applyOverrideConfiguration(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration configuration) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public boolean dispatchTouchEvent(@org.jetbrains.annotations.NotNull()
    android.view.MotionEvent event) {
        return false;
    }
    
    protected final void setStatusBarColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    protected final void setNavigationBarColor(@androidx.annotation.ColorInt()
    int color) {
    }
    
    protected void setTheme() {
    }
    
    protected void onGoOffline() {
    }
    
    protected void onGoOnline() {
    }
    
    private final void requestStoragePermission() {
    }
    
    private final void showStoragePermissionSnackbar() {
    }
    
    private final void showAppSettingSnackbar() {
    }
    
    private final void goToSystemAppSettings() {
    }
    
    private final void removeSplashBackground() {
    }
    
    private final void unregisterExclusiveBusMethods() {
    }
    
    private final void maybeShowLoggedOutInBackgroundDialog() {
    }
    
    private final void dismissCurrentTooltip() {
    }
    
    public final void setCurrentTooltip(@org.jetbrains.annotations.NotNull()
    com.skydoves.balloon.Balloon tooltip) {
    }
    
    public final void setImageZoomHelper() {
    }
    
    public void onUnreadNotification() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/activity/BaseActivity$NetworkStateReceiver;", "Landroid/content/BroadcastReceiver;", "(Lorg/wikipedia/activity/BaseActivity;)V", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_alphaDebug"})
    final class NetworkStateReceiver extends android.content.BroadcastReceiver {
        
        public NetworkStateReceiver() {
            super();
        }
        
        @java.lang.Override()
        public void onReceive(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        android.content.Intent intent) {
        }
    }
    
    /**
     * Bus consumer that should be registered by all created activities.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/activity/BaseActivity$NonExclusiveBusConsumer;", "Lio/reactivex/rxjava3/functions/Consumer;", "", "(Lorg/wikipedia/activity/BaseActivity;)V", "accept", "", "event", "app_alphaDebug"})
    final class NonExclusiveBusConsumer implements io.reactivex.rxjava3.functions.Consumer<java.lang.Object> {
        
        public NonExclusiveBusConsumer() {
            super();
        }
        
        @java.lang.Override()
        public void accept(@org.jetbrains.annotations.NotNull()
        java.lang.Object event) {
        }
    }
    
    /**
     * Bus methods that should be caught only by the topmost activity.
     */
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/activity/BaseActivity$ExclusiveBusConsumer;", "Lio/reactivex/rxjava3/functions/Consumer;", "", "(Lorg/wikipedia/activity/BaseActivity;)V", "accept", "", "event", "app_alphaDebug"})
    final class ExclusiveBusConsumer implements io.reactivex.rxjava3.functions.Consumer<java.lang.Object> {
        
        public ExclusiveBusConsumer() {
            super();
        }
        
        @java.lang.Override()
        public void accept(@org.jetbrains.annotations.NotNull()
        java.lang.Object event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\b\u0018\u00010\u0004R\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/activity/BaseActivity$Companion;", "", "()V", "EXCLUSIVE_BUS_METHODS", "Lorg/wikipedia/activity/BaseActivity$ExclusiveBusConsumer;", "Lorg/wikipedia/activity/BaseActivity;", "EXCLUSIVE_DISPOSABLE", "Lio/reactivex/rxjava3/disposables/Disposable;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}