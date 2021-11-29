package org.wikipedia.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00fe\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0017\u0018\u0000 \u008e\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\n\u008d\u0001\u008e\u0001\u008f\u0001\u0090\u0001\u0091\u0001B\u0005\u00a2\u0006\u0002\u0010\u0007J\n\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0010\u0010&\u001a\u00020\'2\u0006\u0010(\u001a\u00020)H\u0002J\u0010\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020\u001fH\u0002J\u0010\u0010,\u001a\u00020\'2\u0006\u0010-\u001a\u00020\u0019H\u0002J\u0010\u0010.\u001a\u00020\'2\u0006\u0010/\u001a\u000200H\u0002J\u000e\u00101\u001a\u00020\'2\u0006\u00102\u001a\u000203J\u0010\u00104\u001a\u00020!2\u0006\u00105\u001a\u000206H\u0002J\b\u00107\u001a\u00020\'H\u0016J\b\u00108\u001a\u00020\'H\u0002J\b\u00109\u001a\u00020\'H\u0002J\"\u0010:\u001a\u00020\'2\u0006\u0010;\u001a\u0002062\u0006\u0010<\u001a\u0002062\b\u0010=\u001a\u0004\u0018\u000103H\u0016J\b\u0010>\u001a\u00020!H\u0016J\u0018\u0010?\u001a\u00020\'2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020CH\u0016J$\u0010D\u001a\u00020E2\u0006\u0010B\u001a\u00020F2\b\u0010G\u001a\u0004\u0018\u00010H2\b\u0010I\u001a\u0004\u0018\u00010JH\u0016J\b\u0010K\u001a\u00020\'H\u0016J\u0010\u0010L\u001a\u00020\'2\u0006\u0010M\u001a\u00020NH\u0016J\u0018\u0010O\u001a\u00020\'2\u0006\u0010P\u001a\u00020Q2\u0006\u0010R\u001a\u00020!H\u0016J\u0010\u0010S\u001a\u00020\'2\u0006\u0010+\u001a\u00020\u001fH\u0016J\u0018\u0010T\u001a\u00020\'2\u0006\u0010U\u001a\u00020V2\u0006\u0010P\u001a\u00020QH\u0016J\u0018\u0010W\u001a\u00020\'2\u0006\u0010M\u001a\u00020X2\u0006\u0010Y\u001a\u00020ZH\u0016J\b\u0010[\u001a\u00020\'H\u0016J\u0010\u0010\\\u001a\u00020\'2\u0006\u0010Y\u001a\u00020EH\u0016J\u0018\u0010]\u001a\u00020\'2\u0006\u0010P\u001a\u00020Q2\u0006\u0010^\u001a\u00020!H\u0016J/\u0010_\u001a\u00020\'2\u0006\u0010P\u001a\u00020Q2\u0018\u0010`\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020E\u0012\u0004\u0012\u00020)0b0aH\u0016\u00a2\u0006\u0002\u0010cJ\u0010\u0010d\u001a\u00020\'2\u0006\u0010M\u001a\u00020NH\u0016J\b\u0010e\u001a\u00020\'H\u0016J\u0006\u0010f\u001a\u00020\'J\u0006\u0010g\u001a\u00020\'J\u0010\u0010h\u001a\u00020\'2\u0006\u0010i\u001a\u00020jH\u0016J\u0010\u0010k\u001a\u00020\'2\u0006\u0010i\u001a\u00020jH\u0016J \u0010l\u001a\u00020\'2\u0006\u0010i\u001a\u00020j2\u0006\u0010P\u001a\u00020Q2\u0006\u0010m\u001a\u00020!H\u0016J\u0010\u0010n\u001a\u00020\'2\u0006\u0010i\u001a\u00020jH\u0016J\u0010\u0010o\u001a\u00020\'2\u0006\u0010P\u001a\u00020QH\u0016J\b\u0010p\u001a\u00020\'H\u0016J\b\u0010q\u001a\u00020\'H\u0016J\u0010\u0010r\u001a\u00020\'2\u0006\u0010@\u001a\u00020AH\u0016J+\u0010s\u001a\u00020\'2\u0006\u0010;\u001a\u0002062\f\u0010t\u001a\b\u0012\u0004\u0012\u00020)0a2\u0006\u0010u\u001a\u00020vH\u0016\u00a2\u0006\u0002\u0010wJ\b\u0010x\u001a\u00020\'H\u0016J\"\u0010y\u001a\u00020\'2\u0006\u0010z\u001a\u00020{2\b\u0010|\u001a\u0004\u0018\u00010)2\b\u0010}\u001a\u0004\u0018\u00010EJ\b\u0010~\u001a\u00020\'H\u0002J\u0006\u0010\u007f\u001a\u00020\'J\t\u0010\u0080\u0001\u001a\u00020\'H\u0002J\u0010\u0010\u0081\u0001\u001a\u00020\'2\u0007\u0010\u0082\u0001\u001a\u00020!J\u0013\u0010\u0083\u0001\u001a\u00020\'2\b\u0010+\u001a\u0004\u0018\u00010\u001fH\u0002J\t\u0010\u0084\u0001\u001a\u00020\'H\u0016J\t\u0010\u0085\u0001\u001a\u00020\'H\u0016J\t\u0010\u0086\u0001\u001a\u00020\'H\u0002J\u0010\u0010\u0087\u0001\u001a\u00020\'2\u0007\u0010\u0088\u0001\u001a\u00020!J\u0012\u0010\u0089\u0001\u001a\u00020\'2\u0007\u0010\u008a\u0001\u001a\u00020!H\u0016J\t\u0010\u008b\u0001\u001a\u00020\'H\u0016J\t\u0010\u008c\u0001\u001a\u00020\'H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u00018F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0016\u001a\u00060\u0017R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u00060\u001dR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0092\u0001"}, d2 = {"Lorg/wikipedia/main/MainFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/BackPressedHandler;", "Lorg/wikipedia/feed/FeedFragment$Callback;", "Lorg/wikipedia/history/HistoryFragment$Callback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$Callback;", "Lorg/wikipedia/navtab/MenuNavTabDialog$Callback;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentMainBinding;", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentMainBinding;", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "currentFragment", "getCurrentFragment", "()Landroidx/fragment/app/Fragment;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "downloadReceiver", "Lorg/wikipedia/gallery/MediaDownloadReceiver;", "downloadReceiverCallback", "Lorg/wikipedia/main/MainFragment$MediaDownloadReceiverCallback;", "exclusiveTooltipRunnable", "Ljava/lang/Runnable;", "notificationButtonView", "Lorg/wikipedia/views/NotificationButtonView;", "pageChangeCallback", "Lorg/wikipedia/main/MainFragment$PageChangeCallback;", "pendingDownloadImage", "Lorg/wikipedia/feed/image/FeaturedImage;", "showTabCountsAnimation", "", "tabCountsView", "Lorg/wikipedia/views/TabCountsView;", "callback", "Lorg/wikipedia/main/MainFragment$Callback;", "copyLink", "", "url", "", "download", "image", "enqueueTooltip", "runnable", "goToTab", "tab", "Lorg/wikipedia/navtab/NavTab;", "handleIntent", "intent", "Landroid/content/Intent;", "lastPageViewedWithin", "days", "", "loginClick", "maybeShowEditsTooltip", "maybeShowWatchlistTooltip", "onActivityResult", "requestCode", "resultCode", "data", "onBackPressed", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onFeaturedImageSelected", "card", "Lorg/wikipedia/feed/image/FeaturedImageCard;", "onFeedAddPageToList", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "onFeedDownloadImage", "onFeedMovePageToList", "sourceReadingListId", "", "onFeedNewsItemSelected", "Lorg/wikipedia/feed/news/NewsCard;", "view", "Lorg/wikipedia/feed/news/NewsItemView;", "onFeedSeCardFooterClicked", "onFeedSearchRequested", "onFeedSelectPage", "openInNewBackgroundTab", "onFeedSelectPageWithAnimation", "sharedElements", "", "Landroidx/core/util/Pair;", "(Lorg/wikipedia/history/HistoryEntry;[Landroidx/core/util/Pair;)V", "onFeedShareImage", "onFeedVoiceSearchRequested", "onGoOffline", "onGoOnline", "onLinkPreviewAddToList", "title", "Lorg/wikipedia/page/PageTitle;", "onLinkPreviewCopyLink", "onLinkPreviewLoadPage", "inNewTab", "onLinkPreviewShareLink", "onLoadPage", "onLoginRequested", "onPause", "onPrepareOptionsMenu", "onRequestPermissionsResult", "permissions", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onResume", "openSearchActivity", "source", "Lorg/wikipedia/Constants$InvokeSource;", "query", "transitionView", "refreshContents", "requestUpdateToolbarElevation", "requestWriteExternalStoragePermission", "setBottomNavVisible", "visible", "setPendingDownload", "settingsClick", "talkClick", "updateFeedHiddenCards", "updateNotificationDot", "animate", "updateToolbarElevation", "elevate", "usernameClick", "watchlistClick", "Callback", "Companion", "EventBusConsumer", "MediaDownloadReceiverCallback", "PageChangeCallback", "app_alphaDebug"})
public final class MainFragment extends androidx.fragment.app.Fragment implements org.wikipedia.BackPressedHandler, org.wikipedia.feed.FeedFragment.Callback, org.wikipedia.history.HistoryFragment.Callback, org.wikipedia.page.linkpreview.LinkPreviewDialog.Callback, org.wikipedia.navtab.MenuNavTabDialog.Callback {
    private org.wikipedia.databinding.FragmentMainBinding _binding;
    private org.wikipedia.views.NotificationButtonView notificationButtonView;
    private org.wikipedia.views.TabCountsView tabCountsView;
    private boolean showTabCountsAnimation = false;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    private final org.wikipedia.gallery.MediaDownloadReceiver downloadReceiver = null;
    private final org.wikipedia.main.MainFragment.MediaDownloadReceiverCallback downloadReceiverCallback = null;
    private final org.wikipedia.main.MainFragment.PageChangeCallback pageChangeCallback = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private java.lang.Runnable exclusiveTooltipRunnable;
    private org.wikipedia.feed.image.FeaturedImage pendingDownloadImage;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.main.MainFragment.Companion Companion = null;
    private static final int SHOW_EDITS_SNACKBAR_COUNT = 2;
    
    public MainFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.databinding.FragmentMainBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final androidx.fragment.app.Fragment getCurrentFragment() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    public final void handleIntent(@org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void onFeedSearchRequested(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void onFeedVoiceSearchRequested() {
    }
    
    @java.lang.Override()
    public void onFeedSelectPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean openInNewBackgroundTab) {
    }
    
    @java.lang.Override()
    public void onFeedSelectPageWithAnimation(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
    androidx.core.util.Pair<android.view.View, java.lang.String>[] sharedElements) {
    }
    
    @java.lang.Override()
    public void onFeedAddPageToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean addToDefault) {
    }
    
    @java.lang.Override()
    public void onFeedMovePageToList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    public void onFeedNewsItemSelected(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.news.NewsCard card, @org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.news.NewsItemView view) {
    }
    
    @java.lang.Override()
    public void onFeedSeCardFooterClicked() {
    }
    
    @java.lang.Override()
    public void onFeedShareImage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.image.FeaturedImageCard card) {
    }
    
    @java.lang.Override()
    public void onFeedDownloadImage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.image.FeaturedImage image) {
    }
    
    @java.lang.Override()
    public void onFeaturedImageSelected(@org.jetbrains.annotations.NotNull()
    org.wikipedia.feed.image.FeaturedImageCard card) {
    }
    
    @java.lang.Override()
    public void onLoginRequested() {
    }
    
    @java.lang.Override()
    public void updateToolbarElevation(boolean elevate) {
    }
    
    public final void requestUpdateToolbarElevation() {
    }
    
    @java.lang.Override()
    public void onLoadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
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
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void usernameClick() {
    }
    
    @java.lang.Override()
    public void loginClick() {
    }
    
    @java.lang.Override()
    public void talkClick() {
    }
    
    @java.lang.Override()
    public void settingsClick() {
    }
    
    @java.lang.Override()
    public void watchlistClick() {
    }
    
    public final void setBottomNavVisible(boolean visible) {
    }
    
    public final void onGoOffline() {
    }
    
    public final void onGoOnline() {
    }
    
    public final void updateNotificationDot(boolean animate) {
    }
    
    private final void copyLink(java.lang.String url) {
    }
    
    @kotlin.Suppress(names = {"SameParameterValue"})
    private final boolean lastPageViewedWithin(int days) {
        return false;
    }
    
    private final void download(org.wikipedia.feed.image.FeaturedImage image) {
    }
    
    private final void setPendingDownload(org.wikipedia.feed.image.FeaturedImage image) {
    }
    
    private final void requestWriteExternalStoragePermission() {
    }
    
    public final void openSearchActivity(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source, @org.jetbrains.annotations.Nullable()
    java.lang.String query, @org.jetbrains.annotations.Nullable()
    android.view.View transitionView) {
    }
    
    private final void goToTab(org.wikipedia.navtab.NavTab tab) {
    }
    
    private final void refreshContents() {
    }
    
    private final void updateFeedHiddenCards() {
    }
    
    private final void maybeShowEditsTooltip() {
    }
    
    private final void maybeShowWatchlistTooltip() {
    }
    
    private final void enqueueTooltip(java.lang.Runnable runnable) {
    }
    
    private final org.wikipedia.main.MainFragment.Callback callback() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/main/MainFragment$Callback;", "", "onTabChanged", "", "tab", "Lorg/wikipedia/navtab/NavTab;", "updateToolbarElevation", "elevate", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onTabChanged(@org.jetbrains.annotations.NotNull()
        org.wikipedia.navtab.NavTab tab);
        
        public abstract void updateToolbarElevation(boolean elevate);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/main/MainFragment$PageChangeCallback;", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "(Lorg/wikipedia/main/MainFragment;)V", "onPageSelected", "", "position", "", "app_alphaDebug"})
    final class PageChangeCallback extends androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback {
        
        public PageChangeCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onPageSelected(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/main/MainFragment$MediaDownloadReceiverCallback;", "Lorg/wikipedia/gallery/MediaDownloadReceiver$Callback;", "(Lorg/wikipedia/main/MainFragment;)V", "onSuccess", "", "app_alphaDebug"})
    final class MediaDownloadReceiverCallback implements org.wikipedia.gallery.MediaDownloadReceiver.Callback {
        
        public MediaDownloadReceiverCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onSuccess() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/main/MainFragment$EventBusConsumer;", "Lio/reactivex/rxjava3/functions/Consumer;", "", "(Lorg/wikipedia/main/MainFragment;)V", "accept", "", "event", "app_alphaDebug"})
    final class EventBusConsumer implements io.reactivex.rxjava3.functions.Consumer<java.lang.Object> {
        
        public EventBusConsumer() {
            super();
        }
        
        @java.lang.Override()
        public void accept(@org.jetbrains.annotations.NotNull()
        java.lang.Object event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0005\u001a\u00020\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/main/MainFragment$Companion;", "", "()V", "SHOW_EDITS_SNACKBAR_COUNT", "", "newInstance", "Lorg/wikipedia/main/MainFragment;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.main.MainFragment newInstance() {
            return null;
        }
    }
}