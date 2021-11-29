package org.wikipedia.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \'2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\'B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0014J\u0006\u0010\f\u001a\u00020\rJ\b\u0010\u000e\u001a\u00020\nH\u0014J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011J\b\u0010\u0012\u001a\u00020\nH\u0016J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\nH\u0014J\b\u0010\u0017\u001a\u00020\nH\u0014J\u0010\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001aH\u0014J\b\u0010\u001b\u001a\u00020\nH\u0014J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\nH\u0016J\b\u0010$\u001a\u00020\nH\u0002J\u0010\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lorg/wikipedia/main/MainActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/main/MainFragment;", "Lorg/wikipedia/main/MainFragment$Callback;", "()V", "binding", "Lorg/wikipedia/databinding/ActivityMainBinding;", "controlNavTabInFragment", "", "clearToolbarElevation", "", "createFragment", "getToolbar", "Landroidx/appcompat/widget/Toolbar;", "inflateAndSetContentView", "isCurrentFragmentSelected", "f", "Landroidx/fragment/app/Fragment;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onGoOffline", "onGoOnline", "onNewIntent", "intent", "Landroid/content/Intent;", "onResume", "onSupportActionModeFinished", "mode", "Landroidx/appcompat/view/ActionMode;", "onSupportActionModeStarted", "onTabChanged", "tab", "Lorg/wikipedia/navtab/NavTab;", "onUnreadNotification", "setToolbarElevationDefault", "updateToolbarElevation", "elevate", "Companion", "app_alphaDebug"})
public final class MainActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.main.MainFragment> implements org.wikipedia.main.MainFragment.Callback {
    private org.wikipedia.databinding.ActivityMainBinding binding;
    private boolean controlNavTabInFragment = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.main.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void inflateAndSetContentView() {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.wikipedia.main.MainFragment createFragment() {
        return null;
    }
    
    @java.lang.Override()
    public void onTabChanged(@org.jetbrains.annotations.NotNull()
    org.wikipedia.navtab.NavTab tab) {
    }
    
    @java.lang.Override()
    public void onSupportActionModeStarted(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode) {
    }
    
    @java.lang.Override()
    public void onSupportActionModeFinished(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.view.ActionMode mode) {
    }
    
    @java.lang.Override()
    public void updateToolbarElevation(boolean elevate) {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    protected void onGoOffline() {
    }
    
    @java.lang.Override()
    protected void onGoOnline() {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    public final boolean isCurrentFragmentSelected(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment f) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    @java.lang.Override()
    public void onUnreadNotification() {
    }
    
    private final void setToolbarElevationDefault() {
    }
    
    private final void clearToolbarElevation() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/main/MainActivity$Companion;", "", "()V", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}