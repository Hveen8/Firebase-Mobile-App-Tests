package org.wikipedia.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00ba\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\n\u0018\u0000 k2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001kB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0012\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0019H\u0002J\b\u00100\u001a\u00020.H\u0002J\b\u00101\u001a\u00020\u0017H\u0016J\u0010\u00102\u001a\u00020.2\u0006\u00103\u001a\u000204H\u0002J\b\u00105\u001a\u00020.H\u0002J\b\u00106\u001a\u00020.H\u0002J\u0012\u00107\u001a\u00020\u001d2\b\u00108\u001a\u0004\u0018\u00010\u0019H\u0002J \u00109\u001a\u00020.2\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020\u001d2\u0006\u0010=\u001a\u00020\tH\u0016J\"\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\t2\b\u0010A\u001a\u0004\u0018\u000104H\u0016J\b\u0010B\u001a\u00020.H\u0016J\u0012\u0010C\u001a\u00020.2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J$\u0010F\u001a\u00020G2\u0006\u0010H\u001a\u00020I2\b\u0010J\u001a\u0004\u0018\u00010K2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010L\u001a\u00020.H\u0016J\b\u0010M\u001a\u00020.H\u0002J\b\u0010N\u001a\u00020.H\u0016J\u0010\u0010O\u001a\u00020.2\u0006\u0010P\u001a\u00020\u0019H\u0016J\b\u0010Q\u001a\u00020.H\u0016J\u0018\u0010R\u001a\u00020.2\u0006\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020\u001dH\u0016J\b\u0010V\u001a\u00020.H\u0002J\u0018\u0010W\u001a\u00020.2\u0006\u0010X\u001a\u00020Y2\u0006\u0010S\u001a\u00020TH\u0016J\u0010\u0010Z\u001a\u00020.2\u0006\u0010[\u001a\u00020\u001dH\u0016J\b\u0010\\\u001a\u00020.H\u0016J\u001a\u0010]\u001a\u00020.2\u0006\u0010^\u001a\u00020G2\b\u0010D\u001a\u0004\u0018\u00010EH\u0016J\b\u0010_\u001a\u00020.H\u0002J\u0010\u0010`\u001a\u00020.2\u0006\u0010a\u001a\u00020bH\u0016J\u000e\u0010c\u001a\u00020.2\u0006\u0010=\u001a\u00020\tJ\b\u0010d\u001a\u00020.H\u0002J\u0010\u0010e\u001a\u00020.2\u0006\u0010f\u001a\u00020\tH\u0002J\u001a\u0010g\u001a\u00020.2\b\u0010h\u001a\u0004\u0018\u00010\u00192\u0006\u0010i\u001a\u00020\u001dH\u0002J\u0010\u0010j\u001a\u00020.2\u0006\u0010a\u001a\u00020\u0019H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u0019@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u000e\u0010(\u001a\u00020)X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006l"}, d2 = {"Lorg/wikipedia/search/SearchFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/search/SearchResultsFragment$Callback;", "Lorg/wikipedia/search/RecentSearchesFragment$Callback;", "Lorg/wikipedia/views/LanguageScrollView$Callback;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentSearchBinding;", "activePanel", "", "getActivePanel", "()I", "app", "Lorg/wikipedia/WikipediaApp;", "kotlin.jvm.PlatformType", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentSearchBinding;", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "funnel", "Lorg/wikipedia/analytics/SearchFunnel;", "initialLanguageList", "", "invokeSource", "Lorg/wikipedia/Constants$InvokeSource;", "isSearchActive", "", "langBtnClicked", "query", "recentSearchesFragment", "Lorg/wikipedia/search/RecentSearchesFragment;", "searchCloseListener", "Landroidx/appcompat/widget/SearchView$OnCloseListener;", "<set-?>", "searchLanguageCode", "getSearchLanguageCode", "()Ljava/lang/String;", "searchQueryListener", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "searchResultsFragment", "Lorg/wikipedia/search/SearchResultsFragment;", "tempLangCodeHolder", "addRecentSearch", "", "title", "closeSearch", "getFunnel", "handleIntent", "intent", "Landroid/content/Intent;", "initLangButton", "initSearchView", "isValidQuery", "queryText", "navigateToTitle", "item", "Lorg/wikipedia/page/PageTitle;", "inNewTab", "position", "onActivityResult", "requestCode", "resultCode", "data", "onAddLanguageClicked", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onLangButtonClick", "onLanguageButtonClicked", "onLanguageTabSelected", "selectedLanguageCode", "onPause", "onSearchAddPageToList", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "onSearchContainerClick", "onSearchMovePageToList", "sourceReadingListId", "", "onSearchProgressBar", "enabled", "onStart", "onViewCreated", "view", "openSearch", "setSearchText", "text", "", "setUpLanguageScroll", "showMultiLingualOnboarding", "showPanel", "panel", "startSearch", "term", "force", "switchToSearch", "Companion", "app_alphaDebug"})
public final class SearchFragment extends androidx.fragment.app.Fragment implements org.wikipedia.search.SearchResultsFragment.Callback, org.wikipedia.search.RecentSearchesFragment.Callback, org.wikipedia.views.LanguageScrollView.Callback {
    private org.wikipedia.databinding.FragmentSearchBinding _binding;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private org.wikipedia.WikipediaApp app;
    private java.lang.String tempLangCodeHolder;
    private boolean langBtnClicked = false;
    private boolean isSearchActive = false;
    private java.lang.String query;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    private org.wikipedia.search.RecentSearchesFragment recentSearchesFragment;
    private org.wikipedia.search.SearchResultsFragment searchResultsFragment;
    private org.wikipedia.analytics.SearchFunnel funnel;
    private org.wikipedia.Constants.InvokeSource invokeSource;
    private java.lang.String initialLanguageList;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String searchLanguageCode;
    private final androidx.appcompat.widget.SearchView.OnCloseListener searchCloseListener = null;
    private final androidx.appcompat.widget.SearchView.OnQueryTextListener searchQueryListener = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.search.SearchFragment.Companion Companion = null;
    private static final java.lang.String ARG_QUERY = "lastQuery";
    private static final int PANEL_RECENT_SEARCHES = 0;
    private static final int PANEL_SEARCH_RESULTS = 1;
    public static final int RESULT_LANG_CHANGED = 1;
    public static final int LANG_BUTTON_TEXT_SIZE_LARGER = 12;
    public static final int LANG_BUTTON_TEXT_SIZE_MEDIUM = 10;
    public static final int LANG_BUTTON_TEXT_SIZE_SMALLER = 8;
    
    public SearchFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentSearchBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSearchLanguageCode() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
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
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    private final void handleIntent(android.content.Intent intent) {
    }
    
    public final void setUpLanguageScroll(int position) {
    }
    
    private final void showMultiLingualOnboarding() {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.analytics.SearchFunnel getFunnel() {
        return null;
    }
    
    @java.lang.Override()
    public void switchToSearch(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    @java.lang.Override()
    public void onAddLanguageClicked() {
    }
    
    @java.lang.Override()
    public void setSearchText(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text) {
    }
    
    @java.lang.Override()
    public void navigateToTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle item, boolean inNewTab, int position) {
    }
    
    @java.lang.Override()
    public void onSearchAddPageToList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean addToDefault) {
    }
    
    @java.lang.Override()
    public void onSearchMovePageToList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    @java.lang.Override()
    public void onSearchProgressBar(boolean enabled) {
    }
    
    private final void onSearchContainerClick() {
    }
    
    private final void onLangButtonClick() {
    }
    
    private final void startSearch(java.lang.String term, boolean force) {
    }
    
    private final void openSearch() {
    }
    
    private final void closeSearch() {
    }
    
    private final void showPanel(int panel) {
    }
    
    private final int getActivePanel() {
        return 0;
    }
    
    private final void initSearchView() {
    }
    
    private final void initLangButton() {
    }
    
    private final boolean isValidQuery(java.lang.String queryText) {
        return false;
    }
    
    private final void addRecentSearch(java.lang.String title) {
    }
    
    @java.lang.Override()
    public void onLanguageTabSelected(@org.jetbrains.annotations.NotNull()
    java.lang.String selectedLanguageCode) {
    }
    
    @java.lang.Override()
    public void onLanguageButtonClicked() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final org.wikipedia.search.SearchFragment newInstance(@org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source, @org.jetbrains.annotations.Nullable()
    java.lang.String query) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/search/SearchFragment$Companion;", "", "()V", "ARG_QUERY", "", "LANG_BUTTON_TEXT_SIZE_LARGER", "", "LANG_BUTTON_TEXT_SIZE_MEDIUM", "LANG_BUTTON_TEXT_SIZE_SMALLER", "PANEL_RECENT_SEARCHES", "PANEL_SEARCH_RESULTS", "RESULT_LANG_CHANGED", "newInstance", "Lorg/wikipedia/search/SearchFragment;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "query", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @kotlin.jvm.JvmStatic()
        public final org.wikipedia.search.SearchFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source, @org.jetbrains.annotations.Nullable()
        java.lang.String query) {
            return null;
        }
    }
}