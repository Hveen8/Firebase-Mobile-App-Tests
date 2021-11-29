package org.wikipedia.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003,-.B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0019\u001a\u00020\u001aJ\b\u0010\u001b\u001a\u00020\u001aH\u0002J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\b\u0010$\u001a\u00020\u001aH\u0016J\u001a\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u001d2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0016J\u0006\u0010\'\u001a\u00020\u001aJ\u0006\u0010(\u001a\u00020\u001aJ\u0010\u0010)\u001a\u00020\u001a2\u0006\u0010*\u001a\u00020+H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006/"}, d2 = {"Lorg/wikipedia/search/RecentSearchesFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentSearchRecentBinding;", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentSearchRecentBinding;", "callback", "Lorg/wikipedia/search/RecentSearchesFragment$Callback;", "getCallback", "()Lorg/wikipedia/search/RecentSearchesFragment$Callback;", "setCallback", "(Lorg/wikipedia/search/RecentSearchesFragment$Callback;)V", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "getDisposables", "()Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "recentSearchList", "", "Lorg/wikipedia/search/db/RecentSearch;", "getRecentSearchList", "()Ljava/util/List;", "setRecentSearchList", "(Ljava/util/List;)V", "hide", "", "onAddLangButtonClick", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "show", "updateList", "updateSearchEmptyView", "searchesEmpty", "", "Callback", "RecentSearchAdapter", "RecentSearchItemViewHolder", "app_alphaDebug"})
public final class RecentSearchesFragment extends androidx.fragment.app.Fragment {
    private org.wikipedia.databinding.FragmentSearchRecentBinding _binding;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.search.RecentSearchesFragment.Callback callback;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.search.db.RecentSearch> recentSearchList;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    
    public RecentSearchesFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentSearchRecentBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.search.RecentSearchesFragment.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.search.RecentSearchesFragment.Callback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.search.db.RecentSearch> getRecentSearchList() {
        return null;
    }
    
    public final void setRecentSearchList(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.search.db.RecentSearch> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.disposables.CompositeDisposable getDisposables() {
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
    
    public final void show() {
    }
    
    public final void hide() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void updateSearchEmptyView(boolean searchesEmpty) {
    }
    
    private final void onAddLangButtonClick() {
    }
    
    public final void updateList() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/search/RecentSearchesFragment$Callback;", "", "onAddLanguageClicked", "", "switchToSearch", "text", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void switchToSearch(@org.jetbrains.annotations.NotNull()
        java.lang.String text);
        
        public abstract void onAddLanguageClicked();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/search/RecentSearchesFragment$RecentSearchItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "Landroid/view/View$OnClickListener;", "Lorg/wikipedia/views/SwipeableItemTouchHelperCallback$Callback;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/search/RecentSearchesFragment;Landroid/view/View;)V", "recentSearch", "Lorg/wikipedia/search/db/RecentSearch;", "bindItem", "", "position", "", "onClick", "v", "onSwipe", "app_alphaDebug"})
    final class RecentSearchItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder implements android.view.View.OnClickListener, org.wikipedia.views.SwipeableItemTouchHelperCallback.Callback {
        private org.wikipedia.search.db.RecentSearch recentSearch;
        
        public RecentSearchItemViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
        
        public final void bindItem(int position) {
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        @java.lang.Override()
        public void onSwipe() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\u001c\u0010\u0007\u001a\u00020\b2\n\u0010\t\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J\u001c\u0010\u000b\u001a\u00060\u0002R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/search/RecentSearchesFragment$RecentSearchAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/search/RecentSearchesFragment$RecentSearchItemViewHolder;", "Lorg/wikipedia/search/RecentSearchesFragment;", "(Lorg/wikipedia/search/RecentSearchesFragment;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_alphaDebug"})
    final class RecentSearchAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.search.RecentSearchesFragment.RecentSearchItemViewHolder> {
        
        public RecentSearchAdapter() {
            super();
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.search.RecentSearchesFragment.RecentSearchItemViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.search.RecentSearchesFragment.RecentSearchItemViewHolder holder, int pos) {
        }
    }
}