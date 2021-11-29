package org.wikipedia.page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00f4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u0094\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\b\u0094\u0001\u0095\u0001\u0096\u0001\u0097\u0001B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\'\u001a\u00020(J\u0006\u0010)\u001a\u00020(J\u0010\u0010*\u001a\u00020(2\u0006\u0010+\u001a\u00020,H\u0002J\u0010\u0010-\u001a\u00020(2\u0006\u0010.\u001a\u00020\u0017H\u0002J\u0018\u0010/\u001a\u00020\u00192\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0002J\u0018\u00103\u001a\u00020\u00192\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0002J\u0006\u00104\u001a\u000201J\b\u00105\u001a\u00020(H\u0002J\u0010\u00106\u001a\u00020(2\u0006\u00107\u001a\u000208H\u0002J\u0010\u00109\u001a\u00020(2\u0006\u00102\u001a\u000201H\u0002J\b\u0010:\u001a\u00020(H\u0002J\b\u0010;\u001a\u00020(H\u0002J\u0010\u0010<\u001a\u00020(2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010?\u001a\u00020(H\u0002J\u0012\u0010@\u001a\u00020\u00192\b\u0010A\u001a\u0004\u0018\u00010BH\u0002J$\u0010C\u001a\u00020(2\b\u0010A\u001a\u0004\u0018\u00010B2\b\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010=\u001a\u00020>H\u0002J\b\u0010F\u001a\u00020(H\u0002J\b\u0010G\u001a\u00020(H\u0002J\u0010\u0010H\u001a\u00020(2\u0006\u0010I\u001a\u00020\u0013H\u0002J\u0018\u0010J\u001a\u00020\u00192\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u000201H\u0002J\u0010\u0010K\u001a\u00020(2\u0006\u0010I\u001a\u00020\u0013H\u0016J\u0010\u0010L\u001a\u00020(2\u0006\u0010I\u001a\u00020\u0013H\u0016J\"\u0010M\u001a\u00020(2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\b\u0010N\u001a\u0004\u0018\u000108H\u0014J\b\u0010O\u001a\u00020(H\u0016J\u0012\u0010P\u001a\u00020(2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\b\u0010S\u001a\u00020(H\u0014J\u0018\u0010T\u001a\u00020\u00192\u0006\u0010U\u001a\u0002012\u0006\u0010V\u001a\u00020WH\u0016J\u0010\u0010X\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010Y\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0016J \u0010Z\u001a\u00020(2\u0006\u0010A\u001a\u00020B2\u0006\u0010D\u001a\u00020E2\u0006\u0010[\u001a\u00020\u0019H\u0016J\u0010\u0010\\\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0016J\u0010\u0010]\u001a\u00020(2\u0006\u0010^\u001a\u000201H\u0016J\u0010\u0010_\u001a\u00020(2\u0006\u00107\u001a\u000208H\u0014J\u0010\u0010`\u001a\u00020\u00192\u0006\u0010a\u001a\u00020bH\u0016J\u0018\u0010c\u001a\u00020(2\u0006\u0010A\u001a\u00020B2\u0006\u0010d\u001a\u00020eH\u0016J\b\u0010f\u001a\u00020(H\u0016J\b\u0010g\u001a\u00020(H\u0016J\b\u0010h\u001a\u00020(H\u0016J\u0010\u0010i\u001a\u00020(2\u0006\u0010j\u001a\u00020kH\u0016J\b\u0010l\u001a\u00020(H\u0016J\u0010\u0010m\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0016J\b\u0010n\u001a\u00020(H\u0016J\b\u0010o\u001a\u00020(H\u0016J\u0018\u0010p\u001a\u00020(2\u0006\u0010A\u001a\u00020B2\u0006\u0010D\u001a\u00020EH\u0016J(\u0010q\u001a\u00020(2\u0006\u0010r\u001a\u00020s2\u0006\u0010A\u001a\u00020B2\u0006\u0010d\u001a\u00020e2\u0006\u0010t\u001a\u00020\u0019H\u0016J\u0010\u0010u\u001a\u00020(2\u0006\u0010v\u001a\u00020\u0019H\u0016J\u0010\u0010w\u001a\u00020(2\u0006\u0010D\u001a\u00020EH\u0016J\u0010\u0010x\u001a\u00020(2\u0006\u0010y\u001a\u00020zH\u0016J\u0010\u0010{\u001a\u00020(2\u0006\u0010|\u001a\u00020\u0019H\u0016J\u0010\u0010}\u001a\u00020(2\u0006\u0010~\u001a\u00020\u007fH\u0016J\t\u0010\u0080\u0001\u001a\u00020(H\u0014J\u0013\u0010\u0081\u0001\u001a\u00020\u00192\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0016J\t\u0010\u0084\u0001\u001a\u00020(H\u0014J\u0012\u0010\u0085\u0001\u001a\u00020(2\u0007\u0010\u0086\u0001\u001a\u00020RH\u0014J\t\u0010\u0087\u0001\u001a\u00020(H\u0016J\t\u0010\u0088\u0001\u001a\u00020(H\u0002J\u0019\u0010\u0089\u0001\u001a\u00020(2\u0006\u0010A\u001a\u00020B2\u0006\u0010d\u001a\u00020eH\u0002J\t\u0010\u008a\u0001\u001a\u00020(H\u0002J\u0012\u0010\u008b\u0001\u001a\u00020(2\u0007\u0010\u008c\u0001\u001a\u00020,H\u0002J)\u0010\u008d\u0001\u001a\u00020(2\u0006\u0010r\u001a\u00020s2\u0006\u0010A\u001a\u00020B2\u0006\u0010d\u001a\u00020e2\u0006\u0010t\u001a\u00020\u0019H\u0002J\u0013\u0010\u008e\u0001\u001a\u00020(2\b\u0010\u008f\u0001\u001a\u00030\u0090\u0001H\u0002J\u0012\u0010\u0091\u0001\u001a\u00020(2\u0007\u0010\u0092\u0001\u001a\u00020\u0019H\u0002J\u0011\u0010\u0093\u0001\u001a\u00020(2\u0006\u0010|\u001a\u00020\u0019H\u0002R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\u00020\u00198BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001e\u001a\u00060\u001fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0098\u0001"}, d2 = {"Lorg/wikipedia/page/PageActivity;", "Lorg/wikipedia/activity/BaseActivity;", "Lorg/wikipedia/page/PageFragment$Callback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$Callback;", "Lorg/wikipedia/views/FrameLayoutNavMenuTriggerer$Callback;", "()V", "app", "Lorg/wikipedia/WikipediaApp;", "kotlin.jvm.PlatformType", "binding", "Lorg/wikipedia/databinding/ActivityPageBinding;", "getBinding", "()Lorg/wikipedia/databinding/ActivityPageBinding;", "setBinding", "(Lorg/wikipedia/databinding/ActivityPageBinding;)V", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "currentActionModes", "", "Landroid/view/ActionMode;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "exclusiveTooltipRunnable", "Ljava/lang/Runnable;", "hasTransitionAnimation", "", "isCabOpen", "()Z", "listDialogDismissListener", "Landroid/content/DialogInterface$OnDismissListener;", "overflowCallback", "Lorg/wikipedia/page/PageActivity$OverflowCallback;", "pageFragment", "Lorg/wikipedia/page/PageFragment;", "toolbarHideHandler", "Lorg/wikipedia/page/ViewHideHandler;", "wasTransitionShown", "watchlistFunnel", "Lorg/wikipedia/analytics/WatchlistFunnel;", "animateTabsButton", "", "clearActionBarTitle", "copyLink", "url", "", "enqueueTooltip", "runnable", "galleryImageEdited", "requestCode", "", "resultCode", "galleryPageSelected", "getToolbarMargin", "goToMainTab", "handleIntent", "intent", "Landroid/content/Intent;", "handleSettingsActivityResult", "hideLinkPreview", "loadFilePageFromBackStackIfNeeded", "loadMainPage", "position", "Lorg/wikipedia/page/PageActivity$TabPosition;", "loadNewLanguageMainPage", "loadNonArticlePageIfNeeded", "title", "Lorg/wikipedia/page/PageTitle;", "loadPage", "entry", "Lorg/wikipedia/history/HistoryEntry;", "maybeShowNotificationTooltip", "maybeShowWatchlistTooltip", "modifyMenu", "mode", "newArticleLanguageSelected", "onActionModeFinished", "onActionModeStarted", "onActivityResult", "data", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onKeyDown", "keyCode", "event", "Landroid/view/KeyEvent;", "onLinkPreviewAddToList", "onLinkPreviewCopyLink", "onLinkPreviewLoadPage", "inNewTab", "onLinkPreviewShareLink", "onNavMenuSwipeRequest", "gravity", "onNewIntent", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPageAddToReadingList", "source", "Lorg/wikipedia/Constants$InvokeSource;", "onPageCloseActionMode", "onPageDismissBottomSheet", "onPageHideSoftKeyboard", "onPageInitWebView", "v", "Lorg/wikipedia/views/ObservableWebView;", "onPageLoadComplete", "onPageLoadError", "onPageLoadErrorBackPressed", "onPageLoadMainPageInForegroundTab", "onPageLoadPage", "onPageMoveToReadingList", "sourceReadingListId", "", "showDefaultList", "onPageSetToolbarElevationEnabled", "enabled", "onPageShowLinkPreview", "onPageStartSupportActionMode", "callback", "Landroid/view/ActionMode$Callback;", "onPageUpdateProgressBar", "visible", "onPageWatchlistExpirySelect", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "onPause", "onPrepareOptionsMenu", "menu", "Landroid/view/Menu;", "onResume", "onSaveInstanceState", "outState", "onUnreadNotification", "removeTransitionAnimState", "showAddToListDialog", "showCopySuccessMessage", "showDescriptionEditRevertDialog", "qNumber", "showMoveToListDialog", "showOverflowMenu", "anchor", "Landroid/view/View;", "updateNotificationsButton", "animate", "updateProgressBar", "Companion", "EventBusConsumer", "OverflowCallback", "TabPosition", "app_alphaDebug"})
public final class PageActivity extends org.wikipedia.activity.BaseActivity implements org.wikipedia.page.PageFragment.Callback, org.wikipedia.page.linkpreview.LinkPreviewDialog.Callback, org.wikipedia.views.FrameLayoutNavMenuTriggerer.Callback {
    public org.wikipedia.databinding.ActivityPageBinding binding;
    private org.wikipedia.page.ViewHideHandler toolbarHideHandler;
    private org.wikipedia.page.PageFragment pageFragment;
    private org.wikipedia.WikipediaApp app;
    private boolean hasTransitionAnimation = false;
    private boolean wasTransitionShown = false;
    private final java.util.Set<android.view.ActionMode> currentActionModes = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private final org.wikipedia.page.PageActivity.OverflowCallback overflowCallback = null;
    private final org.wikipedia.analytics.WatchlistFunnel watchlistFunnel = null;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    private final android.content.DialogInterface.OnDismissListener listDialogDismissListener = null;
    private java.lang.Runnable exclusiveTooltipRunnable;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.PageActivity.Companion Companion = null;
    private static final java.lang.String LANGUAGE_CODE_BUNDLE_KEY = "language";
    private static final java.lang.String EXCEPTION_MESSAGE_WEBVIEW = "webview";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOAD_IN_NEW_TAB = "org.wikipedia.load_in_new_tab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOAD_IN_CURRENT_TAB = "org.wikipedia.load_in_current_tab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOAD_IN_CURRENT_TAB_SQUASH = "org.wikipedia.load_in_current_tab_squash";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_LOAD_FROM_EXISTING_TAB = "org.wikipedia.load_from_existing_tab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_CREATE_NEW_TAB = "org.wikipedia.create_new_tab";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ACTION_RESUME_READING = "org.wikipedia.resume_reading";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_PAGETITLE = "org.wikipedia.pagetitle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_HISTORYENTRY = "org.wikipedia.history.historyentry";
    
    public PageActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.databinding.ActivityPageBinding getBinding() {
        return null;
    }
    
    public final void setBinding(@org.jetbrains.annotations.NotNull()
    org.wikipedia.databinding.ActivityPageBinding p0) {
    }
    
    private final boolean isCabOpen() {
        return false;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public boolean onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onActionModeStarted(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode) {
    }
    
    @java.lang.Override()
    public void onActionModeFinished(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onNewIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    @java.lang.Override()
    public boolean onKeyDown(int keyCode, @org.jetbrains.annotations.NotNull()
    android.view.KeyEvent event) {
        return false;
    }
    
    @java.lang.Override()
    public void onNavMenuSwipeRequest(int gravity) {
    }
    
    @java.lang.Override()
    public void onPageLoadComplete() {
    }
    
    @java.lang.Override()
    public void onPageDismissBottomSheet() {
    }
    
    @java.lang.Override()
    public void onPageInitWebView(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView v) {
    }
    
    @java.lang.Override()
    public void onPageLoadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    public void onPageShowLinkPreview(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    public void onPageLoadMainPageInForegroundTab() {
    }
    
    @java.lang.Override()
    public void onPageUpdateProgressBar(boolean visible) {
    }
    
    @java.lang.Override()
    public void onPageStartSupportActionMode(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode.Callback callback) {
    }
    
    @java.lang.Override()
    public void onPageHideSoftKeyboard() {
    }
    
    @java.lang.Override()
    public void onPageAddToReadingList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source) {
    }
    
    @java.lang.Override()
    public void onPageMoveToReadingList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source, boolean showDefaultList) {
    }
    
    @java.lang.Override()
    public void onPageWatchlistExpirySelect(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry) {
    }
    
    @java.lang.Override()
    public void onPageLoadError(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
    
    @java.lang.Override()
    public void onPageLoadErrorBackPressed() {
    }
    
    @java.lang.Override()
    public void onPageSetToolbarElevationEnabled(boolean enabled) {
    }
    
    @java.lang.Override()
    public void onPageCloseActionMode() {
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
    
    private final void handleIntent(android.content.Intent intent) {
    }
    
    /**
     * Load a new page, and put it on top of the backstack, optionally allowing state loss of the
     * fragment manager. Useful for when this function is called from an AsyncTask result.
     * @param title Title of the page to load.
     * @param entry HistoryEntry associated with this page.
     * @param position Whether to open this page in the current tab, a new background tab, or new
     * foreground tab.
     */
    private final void loadPage(org.wikipedia.page.PageTitle title, org.wikipedia.history.HistoryEntry entry, org.wikipedia.page.PageActivity.TabPosition position) {
    }
    
    private final void goToMainTab() {
    }
    
    private final void loadMainPage(org.wikipedia.page.PageActivity.TabPosition position) {
    }
    
    private final void loadFilePageFromBackStackIfNeeded() {
    }
    
    private final boolean loadNonArticlePageIfNeeded(org.wikipedia.page.PageTitle title) {
        return false;
    }
    
    private final void updateProgressBar(boolean visible) {
    }
    
    private final void hideLinkPreview() {
    }
    
    private final void showAddToListDialog(org.wikipedia.page.PageTitle title, org.wikipedia.Constants.InvokeSource source) {
    }
    
    private final void showMoveToListDialog(long sourceReadingListId, org.wikipedia.page.PageTitle title, org.wikipedia.Constants.InvokeSource source, boolean showDefaultList) {
    }
    
    private final void removeTransitionAnimState() {
    }
    
    private final void copyLink(java.lang.String url) {
    }
    
    private final void showCopySuccessMessage() {
    }
    
    private final void showOverflowMenu(android.view.View anchor) {
    }
    
    private final void modifyMenu(android.view.ActionMode mode) {
    }
    
    private final void handleSettingsActivityResult(int resultCode) {
    }
    
    private final void loadNewLanguageMainPage() {
    }
    
    private final boolean newArticleLanguageSelected(int requestCode, int resultCode) {
        return false;
    }
    
    private final boolean galleryPageSelected(int requestCode, int resultCode) {
        return false;
    }
    
    private final boolean galleryImageEdited(int requestCode, int resultCode) {
        return false;
    }
    
    private final void showDescriptionEditRevertDialog(java.lang.String qNumber) {
    }
    
    private final void maybeShowWatchlistTooltip() {
    }
    
    private final void maybeShowNotificationTooltip() {
    }
    
    private final void enqueueTooltip(java.lang.Runnable runnable) {
    }
    
    public final void animateTabsButton() {
    }
    
    private final void updateNotificationsButton(boolean animate) {
    }
    
    public final void clearActionBarTitle() {
    }
    
    public final int getToolbarMargin() {
        return 0;
    }
    
    @java.lang.Override()
    public void onUnreadNotification() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent newIntentForNewTab(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent newIntentForCurrentTab(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmOverloads()
    @kotlin.jvm.JvmStatic()
    public static final android.content.Intent newIntentForCurrentTab(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, boolean squashBackstack) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/page/PageActivity$TabPosition;", "", "(Ljava/lang/String;I)V", "CURRENT_TAB", "CURRENT_TAB_SQUASH", "NEW_TAB_BACKGROUND", "NEW_TAB_FOREGROUND", "EXISTING_TAB", "app_alphaDebug"})
    public static enum TabPosition {
        /*public static final*/ CURRENT_TAB /* = new CURRENT_TAB() */,
        /*public static final*/ CURRENT_TAB_SQUASH /* = new CURRENT_TAB_SQUASH() */,
        /*public static final*/ NEW_TAB_BACKGROUND /* = new NEW_TAB_BACKGROUND() */,
        /*public static final*/ NEW_TAB_FOREGROUND /* = new NEW_TAB_FOREGROUND() */,
        /*public static final*/ EXISTING_TAB /* = new EXISTING_TAB() */;
        
        TabPosition() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\u0016\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/page/PageActivity$OverflowCallback;", "Lorg/wikipedia/views/PageActionOverflowView$Callback;", "(Lorg/wikipedia/page/PageActivity;)V", "editHistoryClick", "", "feedClick", "forwardClick", "newTabClick", "shareClick", "talkClick", "watchlistClick", "isWatched", "", "app_alphaDebug"})
    final class OverflowCallback implements org.wikipedia.views.PageActionOverflowView.Callback {
        
        public OverflowCallback() {
            super();
        }
        
        @java.lang.Override()
        public void forwardClick() {
        }
        
        @java.lang.Override()
        public void watchlistClick(boolean isWatched) {
        }
        
        @java.lang.Override()
        public void shareClick() {
        }
        
        @java.lang.Override()
        public void newTabClick() {
        }
        
        @java.lang.Override()
        public void feedClick() {
        }
        
        @java.lang.Override()
        public void talkClick() {
        }
        
        @java.lang.Override()
        public void editHistoryClick() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/PageActivity$EventBusConsumer;", "Lio/reactivex/rxjava3/functions/Consumer;", "", "(Lorg/wikipedia/page/PageActivity;)V", "accept", "", "event", "app_alphaDebug"})
    final class EventBusConsumer implements io.reactivex.rxjava3.functions.Consumer<java.lang.Object> {
        
        public EventBusConsumer() {
            super();
        }
        
        @java.lang.Override()
        public void accept(@org.jetbrains.annotations.Nullable()
        java.lang.Object event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J*\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0007J\u001e\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/page/PageActivity$Companion;", "", "()V", "ACTION_CREATE_NEW_TAB", "", "ACTION_LOAD_FROM_EXISTING_TAB", "ACTION_LOAD_IN_CURRENT_TAB", "ACTION_LOAD_IN_CURRENT_TAB_SQUASH", "ACTION_LOAD_IN_NEW_TAB", "ACTION_RESUME_READING", "EXCEPTION_MESSAGE_WEBVIEW", "EXTRA_HISTORYENTRY", "EXTRA_PAGETITLE", "LANGUAGE_CODE_BUNDLE_KEY", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "newIntentForCurrentTab", "entry", "Lorg/wikipedia/history/HistoryEntry;", "title", "Lorg/wikipedia/page/PageTitle;", "squashBackstack", "", "newIntentForExistingTab", "newIntentForNewTab", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntentForNewTab(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent newIntentForNewTab(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent newIntentForCurrentTab(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmOverloads()
        @kotlin.jvm.JvmStatic()
        public final android.content.Intent newIntentForCurrentTab(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, boolean squashBackstack) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntentForExistingTab(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title) {
            return null;
        }
    }
}