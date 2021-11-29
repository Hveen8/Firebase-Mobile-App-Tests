package org.wikipedia.readinglist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0017\u0018\u0000 R2\u00020\u00012\u00020\u00022\u00020\u0003:\tRSTUVWXYZB\u0005\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0002J\u0012\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020\"H\u0002J\b\u0010*\u001a\u00020\"H\u0002J\u0012\u0010+\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020(H\u0016J\u0012\u0010/\u001a\u00020\"2\b\u00100\u001a\u0004\u0018\u000101H\u0016J$\u00102\u001a\u0002032\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u0001072\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u00108\u001a\u00020\"2\u0006\u0010.\u001a\u00020(H\u0016J\b\u00109\u001a\u00020\"H\u0016J\u0010\u0010:\u001a\u00020\"2\u0006\u0010.\u001a\u00020(H\u0016J\u0010\u0010;\u001a\u00020$2\u0006\u0010<\u001a\u00020=H\u0016J\b\u0010>\u001a\u00020\"H\u0016J\b\u0010?\u001a\u00020\"H\u0016J\u0010\u0010@\u001a\u00020\"2\u0006\u0010.\u001a\u00020(H\u0016J\u0010\u0010A\u001a\u00020\"2\u0006\u0010.\u001a\u00020(H\u0016J\u0010\u0010B\u001a\u00020\"2\u0006\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\"2\u0006\u0010.\u001a\u00020(H\u0016J\u001a\u0010F\u001a\u00020\"2\u0006\u0010G\u001a\u0002032\b\u00100\u001a\u0004\u0018\u000101H\u0016J\u0010\u0010H\u001a\u00020\"2\u0006\u0010I\u001a\u00020$H\u0002J\b\u0010J\u001a\u00020\"H\u0002J\b\u0010K\u001a\u00020\"H\u0002J\b\u0010L\u001a\u00020\"H\u0002J\u0010\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u00020DH\u0002J\u0012\u0010O\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010\u0011H\u0002J\u0006\u0010P\u001a\u00020\"J\u001a\u0010P\u001a\u00020\"2\b\u0010,\u001a\u0004\u0018\u00010\u00112\u0006\u0010Q\u001a\u00020$H\u0002R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00060\nR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\u00068BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0019\u001a\u00060\u001aR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00060\u001cR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001d\u001a\u00060\u001eR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u00060 R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006["}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/readinglist/SortReadingListsDialog$Callback;", "Lorg/wikipedia/readinglist/ReadingListItemActionsDialog$Callback;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentReadingListsBinding;", "actionMode", "Landroidx/appcompat/view/ActionMode;", "adapter", "Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListAdapter;", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentReadingListsBinding;", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "currentSearchQuery", "", "displayedLists", "", "", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "funnel", "Lorg/wikipedia/analytics/ReadingListsFunnel;", "overflowCallback", "Lorg/wikipedia/readinglist/ReadingListsFragment$OverflowCallback;", "readingListItemCallback", "Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListItemCallback;", "readingListPageItemCallback", "Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListPageItemCallback;", "searchActionModeCallback", "Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListsSearchCallback;", "enableLayoutTransition", "", "enable", "", "getPageById", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "id", "", "maybeDeleteListFromIntent", "maybeShowListLimitMessage", "maybeShowOnboarding", "searchQuery", "onAddItemToOther", "pageId", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDeleteItem", "onDestroyView", "onMoveItemToOther", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onSelectItem", "onShareItem", "onSortOptionClick", "position", "", "onToggleItemOffline", "onViewCreated", "view", "setEmptyContainerVisibility", "visible", "setUpEmptyContainer", "setUpScrollListener", "showReadingListsSyncDialog", "sortListsBy", "option", "updateEmptyState", "updateLists", "forcedRefresh", "Companion", "EventBusConsumer", "OverflowCallback", "ReadingListAdapter", "ReadingListItemCallback", "ReadingListItemHolder", "ReadingListPageItemCallback", "ReadingListPageItemHolder", "ReadingListsSearchCallback", "app_alphaDebug"})
public final class ReadingListsFragment extends androidx.fragment.app.Fragment implements org.wikipedia.readinglist.SortReadingListsDialog.Callback, org.wikipedia.readinglist.ReadingListItemActionsDialog.Callback {
    private org.wikipedia.databinding.FragmentReadingListsBinding _binding;
    private java.util.List<? extends java.lang.Object> displayedLists;
    private final org.wikipedia.analytics.ReadingListsFunnel funnel = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private final org.wikipedia.readinglist.ReadingListsFragment.ReadingListAdapter adapter = null;
    private final org.wikipedia.readinglist.ReadingListsFragment.ReadingListItemCallback readingListItemCallback = null;
    private final org.wikipedia.readinglist.ReadingListsFragment.ReadingListPageItemCallback readingListPageItemCallback = null;
    private final org.wikipedia.readinglist.ReadingListsFragment.ReadingListsSearchCallback searchActionModeCallback = null;
    private androidx.appcompat.view.ActionMode actionMode;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    private final org.wikipedia.readinglist.ReadingListsFragment.OverflowCallback overflowCallback = null;
    private java.lang.String currentSearchQuery;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListsFragment.Companion Companion = null;
    private static final int VIEW_TYPE_ITEM = 0;
    private static final int VIEW_TYPE_PAGE_ITEM = 1;
    private static final int SAVE_COUNT_LIMIT = 3;
    public static final int ARTICLE_ITEM_IMAGE_DIMENSION = 57;
    
    public ReadingListsFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentReadingListsBinding getBinding() {
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
    
    private final void setUpScrollListener() {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onToggleItemOffline(long pageId) {
    }
    
    @java.lang.Override()
    public void onShareItem(long pageId) {
    }
    
    @java.lang.Override()
    public void onAddItemToOther(long pageId) {
    }
    
    @java.lang.Override()
    public void onMoveItemToOther(long pageId) {
    }
    
    @java.lang.Override()
    public void onSelectItem(long pageId) {
    }
    
    @java.lang.Override()
    public void onDeleteItem(long pageId) {
    }
    
    private final org.wikipedia.readinglist.database.ReadingListPage getPageById(long id) {
        return null;
    }
    
    private final void sortListsBy(int option) {
    }
    
    private final void enableLayoutTransition(boolean enable) {
    }
    
    public final void updateLists() {
    }
    
    private final void updateLists(java.lang.String searchQuery, boolean forcedRefresh) {
    }
    
    private final void maybeShowListLimitMessage() {
    }
    
    private final void updateEmptyState(java.lang.String searchQuery) {
    }
    
    private final void setEmptyContainerVisibility(boolean visible) {
    }
    
    private final void setUpEmptyContainer() {
    }
    
    @java.lang.Override()
    public void onSortOptionClick(int position) {
    }
    
    private final void maybeDeleteListFromIntent() {
    }
    
    private final void showReadingListsSyncDialog() {
    }
    
    private final void maybeShowOnboarding(java.lang.String searchQuery) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$OverflowCallback;", "Lorg/wikipedia/views/ReadingListsOverflowView$Callback;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "createNewListClick", "", "refreshClick", "sortByClick", "app_alphaDebug"})
    final class OverflowCallback implements org.wikipedia.views.ReadingListsOverflowView.Callback {
        
        public OverflowCallback() {
            super();
        }
        
        @java.lang.Override()
        public void sortByClick() {
        }
        
        @java.lang.Override()
        public void createNewListClick() {
        }
        
        @java.lang.Override()
        public void refreshClick() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "Lorg/wikipedia/readinglist/ReadingListItemView;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;Lorg/wikipedia/readinglist/ReadingListItemView;)V", "view", "getView", "()Lorg/wikipedia/readinglist/ReadingListItemView;", "bindItem", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "app_alphaDebug"})
    final class ReadingListItemHolder extends org.wikipedia.views.DefaultViewHolder<android.view.View> {
        
        public ReadingListItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.ReadingListItemView itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.readinglist.ReadingListItemView getView() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListPageItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/views/PageItemView;", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "itemView", "(Lorg/wikipedia/readinglist/ReadingListsFragment;Lorg/wikipedia/views/PageItemView;)V", "bindItem", "", "page", "app_alphaDebug"})
    final class ReadingListPageItemHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.views.PageItemView<org.wikipedia.readinglist.database.ReadingListPage>> {
        
        public ReadingListPageItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.PageItemView<org.wikipedia.readinglist.database.ReadingListPage> itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage page) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0016J\u001c\u0010\b\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016J\u001c\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0016J\u0014\u0010\u0010\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016J\u0014\u0010\u0011\u001a\u00020\t2\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/DefaultViewHolder;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "getItemCount", "", "getItemViewType", "position", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "onViewAttachedToWindow", "onViewDetachedFromWindow", "app_alphaDebug"})
    final class ReadingListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.DefaultViewHolder<?>> {
        
        public ReadingListAdapter() {
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
        public org.wikipedia.views.DefaultViewHolder<?> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<?> holder, int pos) {
        }
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<?> holder) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<?> holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListItemCallback;", "Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "onClick", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onDelete", "onRemoveAllOffline", "onRename", "onSaveAllOffline", "app_alphaDebug"})
    final class ReadingListItemCallback implements org.wikipedia.readinglist.ReadingListItemView.Callback {
        
        public ReadingListItemCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onRename(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onDelete(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onSaveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
        
        @java.lang.Override()
        public void onRemoveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListPageItemCallback;", "Lorg/wikipedia/views/PageItemView$Callback;", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "onActionClick", "", "item", "view", "Landroid/view/View;", "onClick", "onListChipClick", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onLongClick", "", "app_alphaDebug"})
    final class ReadingListPageItemCallback implements org.wikipedia.views.PageItemView.Callback<org.wikipedia.readinglist.database.ReadingListPage> {
        
        public ReadingListPageItemCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingListPage item) {
        }
        
        @java.lang.Override()
        public boolean onLongClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingListPage item) {
            return false;
        }
        
        @java.lang.Override()
        public void onActionClick(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingListPage item, @org.jetbrains.annotations.NotNull()
        android.view.View view) {
        }
        
        @java.lang.Override()
        public void onListChipClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0014\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$ReadingListsSearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "app_alphaDebug"})
    final class ReadingListsSearchCallback extends org.wikipedia.history.SearchActionModeCallback {
        
        public ReadingListsSearchCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.Menu menu) {
            return false;
        }
        
        @java.lang.Override()
        protected void onQueryChange(@org.jetbrains.annotations.NotNull()
        java.lang.String s) {
        }
        
        @java.lang.Override()
        public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected java.lang.String getSearchHintString() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        protected android.content.Context getParentContext() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$EventBusConsumer;", "Lio/reactivex/rxjava3/functions/Consumer;", "", "(Lorg/wikipedia/readinglist/ReadingListsFragment;)V", "accept", "", "event", "app_alphaDebug"})
    final class EventBusConsumer implements io.reactivex.rxjava3.functions.Consumer<java.lang.Object> {
        
        public EventBusConsumer() {
            super();
        }
        
        @java.lang.Override()
        public void accept(@org.jetbrains.annotations.NotNull()
        java.lang.Object event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListsFragment$Companion;", "", "()V", "ARTICLE_ITEM_IMAGE_DIMENSION", "", "SAVE_COUNT_LIMIT", "VIEW_TYPE_ITEM", "VIEW_TYPE_PAGE_ITEM", "newInstance", "Lorg/wikipedia/readinglist/ReadingListsFragment;", "refreshSync", "", "fragment", "Landroidx/fragment/app/Fragment;", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.ReadingListsFragment newInstance() {
            return null;
        }
        
        public final void refreshSync(@org.jetbrains.annotations.NotNull()
        androidx.fragment.app.Fragment fragment, @org.jetbrains.annotations.NotNull()
        androidx.swiperefreshlayout.widget.SwipeRefreshLayout swipeRefreshLayout) {
        }
    }
}