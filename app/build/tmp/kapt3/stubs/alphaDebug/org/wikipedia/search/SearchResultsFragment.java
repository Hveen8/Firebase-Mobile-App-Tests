package org.wikipedia.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 T2\u00020\u0001:\u0006STUVWXB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010!\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016H\u0002J\u001e\u0010$\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f2\u0006\u0010%\u001a\u00020\rH\u0002J\n\u0010&\u001a\u0004\u0018\u00010\'H\u0002J\b\u0010(\u001a\u00020\"H\u0002J\u0012\u0010)\u001a\u00020\"2\b\b\u0002\u0010*\u001a\u00020\u0011H\u0002J\u0006\u0010+\u001a\u00020\"J\u0016\u0010,\u001a\u00020\"2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001fH\u0002J\u0016\u0010.\u001a\u00020\"2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170\u001fH\u0002J\u0010\u00100\u001a\u00020\u00172\u0006\u00101\u001a\u000202H\u0002J$\u00103\u001a\u00020\"2\b\u0010%\u001a\u0004\u0018\u00010\r2\b\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u00020\u0011H\u0002J\u0018\u00107\u001a\b\u0012\u0004\u0012\u00020\u0017082\b\u0010%\u001a\u0004\u0018\u00010\rH\u0002J\u0018\u00109\u001a\u00020\"2\u0006\u0010%\u001a\u00020\r2\u0006\u0010:\u001a\u00020\u0011H\u0002J&\u0010;\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00162\u0006\u0010%\u001a\u00020\r2\u0006\u00101\u001a\u000202H\u0002J\u0012\u0010<\u001a\u00020\"2\b\u0010=\u001a\u0004\u0018\u00010\rH\u0002J\u0006\u0010>\u001a\u00020\"J\u001e\u0010?\u001a\u00020\"2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001f2\u0006\u00101\u001a\u000202H\u0002J\u0018\u0010@\u001a\u00020\"2\u0006\u0010A\u001a\u00020\u00112\u0006\u00101\u001a\u000202H\u0002J$\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010J\u001a\u00020\"H\u0016J\b\u0010K\u001a\u00020\"H\u0002J\u000e\u0010L\u001a\u00020\"2\u0006\u0010M\u001a\u00020\rJ\u0006\u0010N\u001a\u00020\"J\u0018\u0010O\u001a\u00020\"2\b\u0010P\u001a\u0004\u0018\u00010\r2\u0006\u0010:\u001a\u00020\u0011J\u0010\u0010Q\u001a\u00020\"2\u0006\u0010R\u001a\u00020\u0011H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u00060\u0006R\u00020\u00008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u00118F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0012R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR \u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00160\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u001f0\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006Y"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentSearchResultsBinding;", "adapter", "Lorg/wikipedia/search/SearchResultsFragment$SearchResultAdapter;", "getAdapter", "()Lorg/wikipedia/search/SearchResultsFragment$SearchResultAdapter;", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentSearchResultsBinding;", "currentSearchTerm", "", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "isShowing", "", "()Z", "lastFullTextResults", "Lorg/wikipedia/search/SearchResults;", "resultsCountList", "", "", "searchLanguageCode", "getSearchLanguageCode", "()Ljava/lang/String;", "searchResultsCache", "Landroidx/collection/LruCache;", "Lorg/wikipedia/search/SearchResult;", "searchResultsCountCache", "", "totalResults", "addSearchResultsFromTabs", "", "resultList", "cache", "searchTerm", "callback", "Lorg/wikipedia/search/SearchResultsFragment$Callback;", "cancelSearchTask", "clearResults", "clearSuggestion", "clearSearchResultsCountCache", "displayResults", "results", "displayResultsCount", "list", "displayTime", "startTime", "", "doFullTextSearch", "continuation", "Lorg/wikipedia/dataclient/mwapi/MwQueryResponse$Continuation;", "clearOnSuccess", "doSearchResultsCountObservable", "Lio/reactivex/rxjava3/core/Observable;", "doTitlePrefixSearch", "force", "handleResults", "handleSuggestion", "suggestion", "hide", "log", "logError", "fullText", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onSuggestionClick", "setLayoutDirection", "langCode", "show", "startSearch", "term", "updateProgressBar", "enabled", "Callback", "Companion", "NoSearchResultItemViewHolder", "SearchResultAdapter", "SearchResultItemViewHolder", "SearchResultsFragmentLongPressHandler", "app_alphaDebug"})
public final class SearchResultsFragment extends androidx.fragment.app.Fragment {
    private org.wikipedia.databinding.FragmentSearchResultsBinding _binding;
    private final androidx.collection.LruCache<java.lang.String, java.util.List<org.wikipedia.search.SearchResult>> searchResultsCache = null;
    private final androidx.collection.LruCache<java.lang.String, java.util.List<java.lang.Integer>> searchResultsCountCache = null;
    private java.lang.String currentSearchTerm = "";
    private org.wikipedia.search.SearchResults lastFullTextResults;
    private final java.util.List<org.wikipedia.search.SearchResult> totalResults = null;
    private final java.util.List<java.lang.Integer> resultsCountList = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.search.SearchResultsFragment.Companion Companion = null;
    private static final int VIEW_TYPE_ITEM = 0;
    private static final int VIEW_TYPE_NO_RESULTS = 1;
    private static final int BATCH_SIZE = 20;
    private static final int DELAY_MILLIS = 300;
    private static final int MAX_CACHE_SIZE_SEARCH_RESULTS = 4;
    
    public SearchResultsFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentSearchResultsBinding getBinding() {
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
    public void onDestroyView() {
    }
    
    private final void onSuggestionClick() {
    }
    
    public final void show() {
    }
    
    public final void hide() {
    }
    
    public final boolean isShowing() {
        return false;
    }
    
    public final void setLayoutDirection(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode) {
    }
    
    public final void startSearch(@org.jetbrains.annotations.Nullable()
    java.lang.String term, boolean force) {
    }
    
    public final void clearSearchResultsCountCache() {
    }
    
    private final void doTitlePrefixSearch(java.lang.String searchTerm, boolean force) {
    }
    
    private final void addSearchResultsFromTabs(java.util.List<org.wikipedia.search.SearchResult> resultList) {
    }
    
    private final void handleResults(java.util.List<org.wikipedia.search.SearchResult> resultList, java.lang.String searchTerm, long startTime) {
    }
    
    private final void handleSuggestion(java.lang.String suggestion) {
    }
    
    private final void cancelSearchTask() {
    }
    
    private final void doFullTextSearch(java.lang.String searchTerm, org.wikipedia.dataclient.mwapi.MwQueryResponse.Continuation continuation, boolean clearOnSuccess) {
    }
    
    private final io.reactivex.rxjava3.core.Observable<java.lang.Integer> doSearchResultsCountObservable(java.lang.String searchTerm) {
        return null;
    }
    
    private final void updateProgressBar(boolean enabled) {
    }
    
    private final void clearResults(boolean clearSuggestion) {
    }
    
    private final org.wikipedia.search.SearchResultsFragment.SearchResultAdapter getAdapter() {
        return null;
    }
    
    private final void displayResults(java.util.List<org.wikipedia.search.SearchResult> results) {
    }
    
    private final void displayResultsCount(java.util.List<java.lang.Integer> list) {
    }
    
    private final void cache(java.util.List<org.wikipedia.search.SearchResult> resultList, java.lang.String searchTerm) {
    }
    
    private final void log(java.util.List<org.wikipedia.search.SearchResult> resultList, long startTime) {
    }
    
    private final void logError(boolean fullText, long startTime) {
    }
    
    private final int displayTime(long startTime) {
        return 0;
    }
    
    private final org.wikipedia.search.SearchResultsFragment.Callback callback() {
        return null;
    }
    
    private final java.lang.String getSearchLanguageCode() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\r\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH&J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH&J\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\tH&J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H&\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$Callback;", "", "getFunnel", "Lorg/wikipedia/analytics/SearchFunnel;", "navigateToTitle", "", "item", "Lorg/wikipedia/page/PageTitle;", "inNewTab", "", "position", "", "onSearchAddPageToList", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "onSearchMovePageToList", "sourceReadingListId", "", "onSearchProgressBar", "enabled", "setSearchText", "text", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onSearchAddPageToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean addToDefault);
        
        public abstract void onSearchMovePageToList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onSearchProgressBar(boolean enabled);
        
        public abstract void navigateToTitle(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle item, boolean inNewTab, int position);
        
        public abstract void setSearchText(@org.jetbrains.annotations.NotNull()
        java.lang.CharSequence text);
        
        @org.jetbrains.annotations.NotNull()
        public abstract org.wikipedia.analytics.SearchFunnel getFunnel();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$SearchResultsFragmentLongPressHandler;", "Lorg/wikipedia/readinglist/LongPressMenu$Callback;", "lastPositionRequested", "", "(Lorg/wikipedia/search/SearchResultsFragment;I)V", "onAddRequest", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "", "onMoveRequest", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "onOpenInNewTab", "onOpenLink", "app_alphaDebug"})
    final class SearchResultsFragmentLongPressHandler implements org.wikipedia.readinglist.LongPressMenu.Callback {
        private final int lastPositionRequested = 0;
        
        public SearchResultsFragmentLongPressHandler(int lastPositionRequested) {
            super();
        }
        
        @java.lang.Override()
        public void onOpenLink(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry) {
        }
        
        @java.lang.Override()
        public void onOpenInNewTab(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry) {
        }
        
        @java.lang.Override()
        public void onAddRequest(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean addToDefault) {
        }
        
        @java.lang.Override()
        public void onMoveRequest(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingListPage page, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u001e\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0016\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$SearchResultAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "(Lorg/wikipedia/search/SearchResultsFragment;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_alphaDebug"})
    final class SearchResultAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.DefaultViewHolder<android.view.View>> {
        
        public SearchResultAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.views.DefaultViewHolder<android.view.View> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<android.view.View> holder, int pos) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$NoSearchResultItemViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/search/SearchResultsFragment;Landroid/view/View;)V", "accentColorStateList", "Landroid/content/res/ColorStateList;", "secondaryColorStateList", "bindItem", "", "position", "", "app_alphaDebug"})
    final class NoSearchResultItemViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        private final android.content.res.ColorStateList accentColorStateList = null;
        private final android.content.res.ColorStateList secondaryColorStateList = null;
        
        public NoSearchResultItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$SearchResultItemViewHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "(Lorg/wikipedia/search/SearchResultsFragment;Landroid/view/View;)V", "bindItem", "", "position", "", "app_alphaDebug"})
    final class SearchResultItemViewHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        
        public SearchResultItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/search/SearchResultsFragment$Companion;", "", "()V", "BATCH_SIZE", "", "DELAY_MILLIS", "MAX_CACHE_SIZE_SEARCH_RESULTS", "VIEW_TYPE_ITEM", "VIEW_TYPE_NO_RESULTS", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}