package org.wikipedia.diff;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00de\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001mB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0018H\u0002J\u0016\u0010$\u001a\u00020%2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020(0\'H\u0002J\b\u0010)\u001a\u00020\"H\u0002J\b\u0010*\u001a\u00020\"H\u0002J\b\u0010+\u001a\u00020\"H\u0002J\u0018\u0010,\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015H\u0003J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020\u0015H\u0002J\b\u0010/\u001a\u00020\"H\u0002J\u0012\u00100\u001a\u00020\"2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\u0018\u00103\u001a\u00020\"2\u0006\u00104\u001a\u0002052\u0006\u00106\u001a\u000207H\u0016J$\u00108\u001a\u0002092\u0006\u00106\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u0010=\u001a\u00020\"H\u0016J\u0010\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020\"2\u0006\u0010B\u001a\u00020\bH\u0016J\u0010\u0010C\u001a\u00020\"2\u0006\u0010B\u001a\u00020\bH\u0016J \u0010D\u001a\u00020\"2\u0006\u0010B\u001a\u00020\b2\u0006\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020\u0015H\u0016J\u0010\u0010H\u001a\u00020\"2\u0006\u0010B\u001a\u00020\bH\u0016J\u0010\u0010I\u001a\u00020\u00152\u0006\u0010J\u001a\u00020KH\u0016J\u0010\u0010L\u001a\u00020\"2\u0006\u00104\u001a\u000205H\u0016J\u001a\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u0002092\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u0010O\u001a\u00020\"H\u0002J\u0018\u0010P\u001a\u00020\"2\u0006\u0010N\u001a\u00020Q2\u0006\u0010R\u001a\u00020\u0011H\u0002J\u0018\u0010S\u001a\u00020\"2\u0006\u0010N\u001a\u00020T2\u0006\u0010U\u001a\u00020\u0015H\u0002J\u0010\u0010V\u001a\u00020\"2\u0006\u0010W\u001a\u00020XH\u0002J\b\u0010Y\u001a\u00020\"H\u0002J\b\u0010Z\u001a\u00020\"H\u0002J\b\u0010[\u001a\u00020\"H\u0002J\u0018\u0010\\\u001a\u00020\"2\u0006\u0010?\u001a\u00020@2\u0006\u0010]\u001a\u00020^H\u0002J\u0010\u0010_\u001a\u00020\"2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J(\u0010`\u001a\u00020\"2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u00020\u00152\u0006\u0010d\u001a\u00020\u00112\u0006\u0010e\u001a\u00020\u0011H\u0002J\b\u0010f\u001a\u00020\"H\u0002J\b\u0010g\u001a\u00020\"H\u0002J\u0010\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0018H\u0002J\u0018\u0010k\u001a\u00020\"2\u0006\u0010?\u001a\u00020@2\u0006\u0010l\u001a\u00020\u0015H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006n"}, d2 = {"Lorg/wikipedia/diff/ArticleEditDetailsFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/watchlist/WatchlistExpiryDialog$Callback;", "Lorg/wikipedia/page/linkpreview/LinkPreviewDialog$Callback;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentArticleEditDetailsBinding;", "articlePageTitle", "Lorg/wikipedia/page/PageTitle;", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentArticleEditDetailsBinding;", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "currentRevision", "Lorg/wikipedia/dataclient/mwapi/MwQueryPage$Revision;", "diffSize", "", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "hasWatchlistExpiry", "", "isWatched", "languageCode", "", "newerRevisionId", "", "olderRevisionId", "revisionId", "username", "watchlistExpiryChanged", "watchlistFunnel", "Lorg/wikipedia/analytics/WatchlistFunnel;", "copyLink", "", "uri", "createSpannable", "", "diffs", "", "Lorg/wikipedia/dataclient/restbase/DiffResponse$DiffItem;", "fetchDiffText", "fetchEditDetails", "getWatchedStatus", "getWatchlistIcon", "hideOrShowViews", "isLoading", "maybeHideThankButton", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onExpirySelect", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "onLinkPreviewAddToList", "title", "onLinkPreviewCopyLink", "onLinkPreviewLoadPage", "entry", "Lorg/wikipedia/history/HistoryEntry;", "inNewTab", "onLinkPreviewShareLink", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onViewCreated", "view", "sendThanks", "setButtonTextAndIconColor", "Lcom/google/android/material/button/MaterialButton;", "themedColor", "setEnableDisableTint", "Landroidx/appcompat/widget/AppCompatImageView;", "isDisabled", "setErrorState", "t", "", "setUpInitialUI", "setUpListeners", "showThankDialog", "showWatchlistSnackbar", "watch", "Lorg/wikipedia/dataclient/watch/Watch;", "updateDiffCharCountView", "updateDiffTextDecor", "spannableText", "Landroid/text/SpannableStringBuilder;", "isAddition", "start", "end", "updateUI", "updateWatchlistButtonUI", "utf8Indices", "", "s", "watchOrUnwatchTitle", "unwatch", "Companion", "app_alphaDebug"})
public final class ArticleEditDetailsFragment extends androidx.fragment.app.Fragment implements org.wikipedia.watchlist.WatchlistExpiryDialog.Callback, org.wikipedia.page.linkpreview.LinkPreviewDialog.Callback {
    private org.wikipedia.databinding.FragmentArticleEditDetailsBinding _binding;
    private org.wikipedia.page.PageTitle articlePageTitle;
    private java.lang.String languageCode;
    private long revisionId = 0L;
    private int diffSize = 0;
    private java.lang.String username;
    private long newerRevisionId = 0L;
    private long olderRevisionId = 0L;
    private org.wikipedia.dataclient.mwapi.MwQueryPage.Revision currentRevision;
    private boolean watchlistExpiryChanged = false;
    private boolean isWatched = false;
    private boolean hasWatchlistExpiry = false;
    private final org.wikipedia.analytics.WatchlistFunnel watchlistFunnel = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.diff.ArticleEditDetailsFragment.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ARTICLE_TITLE = "articleTitle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_EDIT_REVISION_ID = "revisionId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_EDIT_LANGUAGE_CODE = "languageCode";
    
    public ArticleEditDetailsFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentArticleEditDetailsBinding getBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setUpListeners() {
    }
    
    private final void setErrorState(java.lang.Throwable t) {
    }
    
    private final void setUpInitialUI() {
    }
    
    private final void updateDiffCharCountView(int diffSize) {
    }
    
    private final void getWatchedStatus() {
    }
    
    private final void fetchEditDetails() {
    }
    
    private final void hideOrShowViews(boolean isLoading) {
    }
    
    private final void updateUI() {
    }
    
    private final void maybeHideThankButton() {
    }
    
    private final void setEnableDisableTint(androidx.appcompat.widget.AppCompatImageView view, boolean isDisabled) {
    }
    
    private final void setButtonTextAndIconColor(com.google.android.material.button.MaterialButton view, int themedColor) {
    }
    
    private final void watchOrUnwatchTitle(org.wikipedia.watchlist.WatchlistExpiry expiry, boolean unwatch) {
    }
    
    private final void updateWatchlistButtonUI() {
    }
    
    @androidx.annotation.DrawableRes()
    private final int getWatchlistIcon(boolean isWatched, boolean hasWatchlistExpiry) {
        return 0;
    }
    
    private final void showWatchlistSnackbar(org.wikipedia.watchlist.WatchlistExpiry expiry, org.wikipedia.dataclient.watch.Watch watch) {
    }
    
    private final void showThankDialog() {
    }
    
    private final void sendThanks() {
    }
    
    private final void fetchDiffText() {
    }
    
    private final java.lang.CharSequence createSpannable(java.util.List<org.wikipedia.dataclient.restbase.DiffResponse.DiffItem> diffs) {
        return null;
    }
    
    private final void updateDiffTextDecor(android.text.SpannableStringBuilder spannableText, boolean isAddition, int start, int end) {
    }
    
    private final int[] utf8Indices(java.lang.String s) {
        return null;
    }
    
    @java.lang.Override()
    public void onPrepareOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
    }
    
    @java.lang.Override()
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu, @org.jetbrains.annotations.NotNull()
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onExpirySelect(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
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
    
    private final void copyLink(java.lang.String uri) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/diff/ArticleEditDetailsFragment$Companion;", "", "()V", "EXTRA_ARTICLE_TITLE", "", "EXTRA_EDIT_LANGUAGE_CODE", "EXTRA_EDIT_REVISION_ID", "newInstance", "Lorg/wikipedia/diff/ArticleEditDetailsFragment;", "articleTitle", "revisionId", "", "languageCode", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.diff.ArticleEditDetailsFragment newInstance(@org.jetbrains.annotations.NotNull()
        java.lang.String articleTitle, long revisionId, @org.jetbrains.annotations.NotNull()
        java.lang.String languageCode) {
            return null;
        }
    }
}