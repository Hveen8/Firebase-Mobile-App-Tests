package org.wikipedia.feed.topread;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u00192\u00020\u0001:\u0003\u0018\u0019\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J$\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentMostReadBinding;", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getAppCompatActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentMostReadBinding;", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "Callback", "Companion", "RecyclerAdapter", "app_alphaDebug"})
public final class TopReadFragment extends androidx.fragment.app.Fragment {
    private org.wikipedia.databinding.FragmentMostReadBinding _binding;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.topread.TopReadFragment.Companion Companion = null;
    
    public TopReadFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentMostReadBinding getBinding() {
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
    
    private final androidx.appcompat.app.AppCompatActivity getAppCompatActivity() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u0012\n\u0010\u0006\u001a\u00060\u0007R\u00020\b\u00a2\u0006\u0002\u0010\tJ\u001e\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000fH\u0016R\u0012\u0010\u0006\u001a\u00060\u0007R\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadFragment$RecyclerAdapter;", "Lorg/wikipedia/views/DefaultRecyclerAdapter;", "Lorg/wikipedia/feed/topread/TopReadItemCard;", "Lorg/wikipedia/feed/view/ListCardItemView;", "items", "", "callback", "Lorg/wikipedia/feed/topread/TopReadFragment$Callback;", "Lorg/wikipedia/feed/topread/TopReadFragment;", "(Ljava/util/List;Lorg/wikipedia/feed/topread/TopReadFragment$Callback;)V", "onBindViewHolder", "", "holder", "Lorg/wikipedia/views/DefaultViewHolder;", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_alphaDebug"})
    static final class RecyclerAdapter extends org.wikipedia.views.DefaultRecyclerAdapter<org.wikipedia.feed.topread.TopReadItemCard, org.wikipedia.feed.view.ListCardItemView> {
        private final org.wikipedia.feed.topread.TopReadFragment.Callback callback = null;
        
        public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.feed.topread.TopReadItemCard> items, @org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.topread.TopReadFragment.Callback callback) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.views.DefaultViewHolder<org.wikipedia.feed.view.ListCardItemView> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<org.wikipedia.feed.view.ListCardItemView> holder, int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J7\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00110\u0010H\u0016\u00a2\u0006\u0002\u0010\u0014J \u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\bH\u0016\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadFragment$Callback;", "Lorg/wikipedia/feed/view/ListCardItemView$Callback;", "(Lorg/wikipedia/feed/topread/TopReadFragment;)V", "onAddPageToList", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "", "onMovePageToList", "sourceReadingListId", "", "onSelectPage", "card", "Lorg/wikipedia/feed/model/Card;", "sharedElements", "", "Landroidx/core/util/Pair;", "Landroid/view/View;", "", "(Lorg/wikipedia/feed/model/Card;Lorg/wikipedia/history/HistoryEntry;[Landroidx/core/util/Pair;)V", "openInNewBackgroundTab", "app_alphaDebug"})
    final class Callback implements org.wikipedia.feed.view.ListCardItemView.Callback {
        
        public Callback() {
            super();
        }
        
        @java.lang.Override()
        public void onSelectPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean openInNewBackgroundTab) {
        }
        
        @java.lang.Override()
        public void onSelectPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        androidx.core.util.Pair<android.view.View, java.lang.String>[] sharedElements) {
        }
        
        @java.lang.Override()
        public void onAddPageToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean addToDefault) {
        }
        
        @java.lang.Override()
        public void onMovePageToList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/feed/topread/TopReadFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/feed/topread/TopReadFragment;", "card", "Lorg/wikipedia/feed/topread/TopReadListCard;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.feed.topread.TopReadFragment newInstance(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.topread.TopReadListCard card) {
            return null;
        }
    }
}