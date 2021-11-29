package org.wikipedia.watchlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 A2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005ABCDEB\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0012\u0010\u001d\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\u0018\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J$\u0010%\u001a\u00020&2\u0006\u0010#\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010*\u001a\u00020\u001aH\u0016J\u0010\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u0018H\u0016J\b\u00100\u001a\u00020\u001aH\u0016J\u0010\u00101\u001a\u00020\u001c2\u0006\u0010/\u001a\u000202H\u0016J\u0010\u00103\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u00104\u001a\u00020\u001aH\u0016J\b\u00105\u001a\u00020\u001aH\u0016J\b\u00106\u001a\u00020\u001aH\u0016J\b\u00107\u001a\u00020\u001aH\u0016J\u0016\u00108\u001a\u00020\u001a2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0002J\u0016\u0010:\u001a\u00020\u001a2\f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00180\fH\u0002J\u0010\u0010;\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\u0018H\u0016J\u001a\u0010<\u001a\u00020\u001a2\u0006\u0010=\u001a\u00020&2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0016J\b\u0010>\u001a\u00020\u001aH\u0002J\u000e\u0010?\u001a\u00020\u001a2\u0006\u0010@\u001a\u00020\u001cR\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00078BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006F"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/watchlist/WatchlistHeaderView$Callback;", "Lorg/wikipedia/watchlist/WatchlistItemView$Callback;", "Lorg/wikipedia/watchlist/WatchlistLanguagePopupView$Callback;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentWatchlistBinding;", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentWatchlistBinding;", "displayLanguages", "", "", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "filterMode", "", "funnel", "Lorg/wikipedia/analytics/WatchlistFunnel;", "notificationButtonView", "Lorg/wikipedia/views/NotificationButtonView;", "totalItems", "Ljava/util/ArrayList;", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$WatchlistItem;", "fetchWatchlist", "", "refreshing", "", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onError", "t", "", "onItemClick", "item", "onLanguageChanged", "onOptionsItemSelected", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onSelectFilterAll", "onSelectFilterOther", "onSelectFilterPages", "onSelectFilterTalk", "onSuccess", "watchlistItems", "onUpdateList", "onUserClick", "onViewCreated", "view", "updateDisplayLanguages", "updateNotificationDot", "animate", "Companion", "RecyclerAdapter", "WatchlistDateViewHolder", "WatchlistHeaderViewHolder", "WatchlistItemViewHolder", "app_alphaDebug"})
public final class WatchlistFragment extends androidx.fragment.app.Fragment implements org.wikipedia.watchlist.WatchlistHeaderView.Callback, org.wikipedia.watchlist.WatchlistItemView.Callback, org.wikipedia.watchlist.WatchlistLanguagePopupView.Callback {
    private org.wikipedia.databinding.FragmentWatchlistBinding _binding;
    private org.wikipedia.views.NotificationButtonView notificationButtonView;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private final java.util.ArrayList<org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem> totalItems = null;
    private int filterMode = 0;
    private java.util.List<java.lang.String> displayLanguages;
    private final org.wikipedia.analytics.WatchlistFunnel funnel = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.watchlist.WatchlistFragment.Companion Companion = null;
    public static final int FILTER_MODE_ALL = 0;
    public static final int FILTER_MODE_TALK = 1;
    public static final int FILTER_MODE_PAGES = 2;
    public static final int FILTER_MODE_OTHER = 3;
    public static final int VIEW_TYPE_HEADER = 0;
    public static final int VIEW_TYPE_DATE = 1;
    public static final int VIEW_TYPE_ITEM = 2;
    
    public WatchlistFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentWatchlistBinding getBinding() {
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
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
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
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public final void updateNotificationDot(boolean animate) {
    }
    
    private final void updateDisplayLanguages() {
    }
    
    private final void fetchWatchlist(boolean refreshing) {
    }
    
    private final void onSuccess(java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem> watchlistItems) {
    }
    
    private final void onError(java.lang.Throwable t) {
    }
    
    private final void onUpdateList(java.util.List<org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem> watchlistItems) {
    }
    
    @java.lang.Override()
    public void onSelectFilterAll() {
    }
    
    @java.lang.Override()
    public void onSelectFilterTalk() {
    }
    
    @java.lang.Override()
    public void onSelectFilterPages() {
    }
    
    @java.lang.Override()
    public void onSelectFilterOther() {
    }
    
    @java.lang.Override()
    public void onLanguageChanged() {
    }
    
    @java.lang.Override()
    public void onItemClick(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem item) {
    }
    
    @java.lang.Override()
    public void onUserClick(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem item) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistFragment$WatchlistItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lorg/wikipedia/watchlist/WatchlistFragment;Landroid/view/View;)V", "bindItem", "", "item", "Lorg/wikipedia/dataclient/mwapi/MwQueryResult$WatchlistItem;", "app_alphaDebug"})
    public final class WatchlistItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public WatchlistItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.dataclient.mwapi.MwQueryResult.WatchlistItem item) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistFragment$WatchlistDateViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lorg/wikipedia/watchlist/WatchlistFragment;Landroid/view/View;)V", "bindItem", "", "date", "Ljava/util/Date;", "app_alphaDebug"})
    public final class WatchlistDateViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public WatchlistDateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        java.util.Date date) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0080\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistFragment$WatchlistHeaderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Lorg/wikipedia/watchlist/WatchlistHeaderView;", "(Lorg/wikipedia/watchlist/WatchlistFragment;Lorg/wikipedia/watchlist/WatchlistHeaderView;)V", "bindItem", "", "app_alphaDebug"})
    public final class WatchlistHeaderViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public WatchlistHeaderViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.watchlist.WatchlistHeaderView view) {
            super(null);
        }
        
        public final void bindItem() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\b\u0016\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\tH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\tH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistFragment$RecyclerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "items", "", "", "(Lorg/wikipedia/watchlist/WatchlistFragment;Ljava/util/List;)V", "(Lorg/wikipedia/watchlist/WatchlistFragment;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_alphaDebug"})
    public final class RecyclerAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        private java.util.List<? extends java.lang.Object> items;
        
        public RecyclerAdapter() {
            super();
        }
        
        public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<? extends java.lang.Object> items) {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @java.lang.Override()
        public int getItemViewType(int position) {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/watchlist/WatchlistFragment$Companion;", "", "()V", "FILTER_MODE_ALL", "", "FILTER_MODE_OTHER", "FILTER_MODE_PAGES", "FILTER_MODE_TALK", "VIEW_TYPE_DATE", "VIEW_TYPE_HEADER", "VIEW_TYPE_ITEM", "newInstance", "Lorg/wikipedia/watchlist/WatchlistFragment;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.watchlist.WatchlistFragment newInstance() {
            return null;
        }
    }
}