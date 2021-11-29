package org.wikipedia.page.tabs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 42\u00020\u0001:\u000245B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0013H\u0014J\b\u0010\u001f\u001a\u00020\u0013H\u0014J\b\u0010 \u001a\u00020\u0013H\u0016J\b\u0010!\u001a\u00020\u0013H\u0002J\b\u0010\"\u001a\u00020\u0013H\u0002J)\u0010#\u001a\u00020\u00132\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\f\u0010\'\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002\u00a2\u0006\u0002\u0010*J(\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020.H\u0002J\b\u00101\u001a\u00020\nH\u0002J\u0010\u00102\u001a\u00020\u00132\u0006\u00103\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00066"}, d2 = {"Lorg/wikipedia/page/tabs/TabActivity;", "Lorg/wikipedia/activity/BaseActivity;", "()V", "app", "Lorg/wikipedia/WikipediaApp;", "binding", "Lorg/wikipedia/databinding/ActivityTabsBinding;", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "cancelled", "", "funnel", "Lorg/wikipedia/analytics/TabFunnel;", "launchedFromPageActivity", "tabListener", "Lorg/wikipedia/page/tabs/TabActivity$TabListener;", "tabUpdatedTimeMillis", "", "goToMainTab", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "onDestroy", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onUnreadNotification", "openNewTab", "saveTabsToList", "showUndoAllSnackbar", "tabs", "", "Lde/mrapp/android/tabswitcher/Tab;", "appTabs", "", "Lorg/wikipedia/page/tabs/Tab;", "([Lde/mrapp/android/tabswitcher/Tab;Ljava/util/List;)V", "showUndoSnackbar", "tab", "index", "", "appTab", "appTabIndex", "topTabLeadImageEnabled", "updateNotificationsButton", "animate", "Companion", "TabListener", "app_alphaDebug"})
public final class TabActivity extends org.wikipedia.activity.BaseActivity {
    private org.wikipedia.databinding.ActivityTabsBinding binding;
    private final org.wikipedia.WikipediaApp app = null;
    private final org.wikipedia.page.tabs.TabActivity.TabListener tabListener = null;
    private final org.wikipedia.analytics.TabFunnel funnel = null;
    private boolean launchedFromPageActivity = false;
    private boolean cancelled = true;
    private long tabUpdatedTimeMillis = 0L;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.tabs.TabActivity.Companion Companion = null;
    private static final java.lang.String LAUNCHED_FROM_PAGE_ACTIVITY = "launchedFromPageActivity";
    private static final int MAX_CACHED_BMP_SIZE = 800;
    private static android.graphics.Bitmap FIRST_TAB_BITMAP;
    public static final int RESULT_LOAD_FROM_BACKSTACK = 10;
    public static final int RESULT_NEW_TAB = 11;
    
    public TabActivity() {
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
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onUnreadNotification() {
    }
    
    private final void saveTabsToList() {
    }
    
    private final boolean topTabLeadImageEnabled() {
        return false;
    }
    
    private final void openNewTab() {
    }
    
    private final void showUndoSnackbar(de.mrapp.android.tabswitcher.Tab tab, int index, org.wikipedia.page.tabs.Tab appTab, int appTabIndex) {
    }
    
    private final void showUndoAllSnackbar(de.mrapp.android.tabswitcher.Tab[] tabs, java.util.List<org.wikipedia.page.tabs.Tab> appTabs) {
    }
    
    private final void goToMainTab() {
    }
    
    private final void updateNotificationsButton(boolean animate) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void captureFirstTabBitmap(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent newIntentFromPageActivity(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J+\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a2\u0006\u0002\u0010\fJ\"\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J(\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J(\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/page/tabs/TabActivity$TabListener;", "Lde/mrapp/android/tabswitcher/TabSwitcherListener;", "(Lorg/wikipedia/page/tabs/TabActivity;)V", "onAllTabsRemoved", "", "tabSwitcher", "Lde/mrapp/android/tabswitcher/TabSwitcher;", "tabs", "", "Lde/mrapp/android/tabswitcher/Tab;", "animation", "Lde/mrapp/android/tabswitcher/Animation;", "(Lde/mrapp/android/tabswitcher/TabSwitcher;[Lde/mrapp/android/tabswitcher/Tab;Lde/mrapp/android/tabswitcher/Animation;)V", "onSelectionChanged", "index", "", "selectedTab", "onSwitcherHidden", "onSwitcherShown", "onTabAdded", "tab", "onTabRemoved", "app_alphaDebug"})
    final class TabListener implements de.mrapp.android.tabswitcher.TabSwitcherListener {
        
        public TabListener() {
            super();
        }
        
        @java.lang.Override()
        public void onSwitcherShown(@org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.TabSwitcher tabSwitcher) {
        }
        
        @java.lang.Override()
        public void onSwitcherHidden(@org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.TabSwitcher tabSwitcher) {
        }
        
        @java.lang.Override()
        public void onSelectionChanged(@org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.TabSwitcher tabSwitcher, int index, @org.jetbrains.annotations.Nullable()
        de.mrapp.android.tabswitcher.Tab selectedTab) {
        }
        
        @java.lang.Override()
        public void onTabAdded(@org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.TabSwitcher tabSwitcher, int index, @org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.Tab tab, @org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.Animation animation) {
        }
        
        @java.lang.Override()
        public void onTabRemoved(@org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.TabSwitcher tabSwitcher, int index, @org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.Tab tab, @org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.Animation animation) {
        }
        
        @java.lang.Override()
        public void onAllTabsRemoved(@org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.TabSwitcher tabSwitcher, @org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.Tab[] tabs, @org.jetbrains.annotations.NotNull()
        de.mrapp.android.tabswitcher.Animation animation) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\b\u0010\u000f\u001a\u00020\fH\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/page/tabs/TabActivity$Companion;", "", "()V", "FIRST_TAB_BITMAP", "Landroid/graphics/Bitmap;", "LAUNCHED_FROM_PAGE_ACTIVITY", "", "MAX_CACHED_BMP_SIZE", "", "RESULT_LOAD_FROM_BACKSTACK", "RESULT_NEW_TAB", "captureFirstTabBitmap", "", "view", "Landroid/view/View;", "clearFirstTabBitmap", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "newIntentFromPageActivity", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void captureFirstTabBitmap(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        private final void clearFirstTabBitmap() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent newIntentFromPageActivity(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}