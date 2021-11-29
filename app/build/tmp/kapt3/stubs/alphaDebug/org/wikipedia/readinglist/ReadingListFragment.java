package org.wikipedia.readinglist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00d2\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b&\u0018\u0000 t2\u00020\u00012\u00020\u0002:\fstuvwxyz{|}~B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010;\u001a\u00020<H\u0002J\b\u0010=\u001a\u00020<H\u0002J\b\u0010>\u001a\u00020<H\u0002J\b\u0010?\u001a\u00020<H\u0002J\b\u0010@\u001a\u00020<H\u0002J\u0012\u0010A\u001a\u0004\u0018\u0001042\u0006\u0010B\u001a\u00020\'H\u0002J\u0010\u0010C\u001a\u00020/2\u0006\u0010D\u001a\u000204H\u0002J\b\u0010E\u001a\u00020<H\u0002J\u0010\u0010F\u001a\u00020<2\u0006\u0010G\u001a\u00020\'H\u0016J\u0018\u0010H\u001a\u00020<2\u0006\u0010I\u001a\u00020J2\u0006\u0010K\u001a\u00020LH\u0016J$\u0010M\u001a\u00020N2\u0006\u0010K\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010Q2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0010\u0010T\u001a\u00020<2\u0006\u0010G\u001a\u00020\'H\u0016J\b\u0010U\u001a\u00020<H\u0016J\u0010\u0010V\u001a\u00020<2\u0006\u0010G\u001a\u00020\'H\u0016J\u0010\u0010W\u001a\u00020\u00112\u0006\u0010X\u001a\u00020YH\u0016J\u0010\u0010Z\u001a\u00020<2\u0006\u0010I\u001a\u00020JH\u0016J\b\u0010[\u001a\u00020<H\u0016J\u0010\u0010\\\u001a\u00020<2\u0006\u0010G\u001a\u00020\'H\u0016J\u0010\u0010]\u001a\u00020<2\u0006\u0010G\u001a\u00020\'H\u0016J\u0010\u0010^\u001a\u00020<2\u0006\u0010G\u001a\u00020\'H\u0016J\u001a\u0010_\u001a\u00020<2\u0006\u0010`\u001a\u00020N2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\b\u0010a\u001a\u00020<H\u0002J\b\u0010b\u001a\u00020<H\u0002J\b\u0010c\u001a\u00020<H\u0002J\b\u0010d\u001a\u00020<H\u0002J\u0012\u0010d\u001a\u00020<2\b\u0010e\u001a\u0004\u0018\u00010\u0018H\u0002J\u0018\u0010f\u001a\u00020<2\u0006\u0010g\u001a\u00020/2\u0006\u0010h\u001a\u00020/H\u0002J\u0010\u0010i\u001a\u00020<2\u0006\u0010j\u001a\u00020\u0011H\u0002J\b\u0010k\u001a\u00020<H\u0002J\b\u0010l\u001a\u00020<H\u0002J\u0012\u0010m\u001a\u00020<2\b\u0010D\u001a\u0004\u0018\u000104H\u0002J\b\u0010n\u001a\u00020<H\u0002J\u0014\u0010o\u001a\u00020<2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%H\u0002J\u0012\u0010p\u001a\u00020<2\b\u0010q\u001a\u0004\u0018\u00010\u0018H\u0002J\b\u0010r\u001a\u00020<H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00060\tR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082.\u00a2\u0006\u0002\n\u0000R\u0012\u0010\"\u001a\u00060#R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\'X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010(\u001a\u00060)R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010*\u001a\u00060+R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010,\u001a\u00060-R\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020/8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00102\u001a\b\u0012\u0004\u0012\u000204038BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b5\u00106R\u000e\u00107\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u007f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/readinglist/ReadingListItemActionsDialog$Callback;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentReadingListBinding;", "actionMode", "Landroidx/appcompat/view/ActionMode;", "adapter", "Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListPageItemAdapter;", "appBarListener", "Lorg/wikipedia/readinglist/ReadingListFragment$AppBarListener;", "appCompatActivity", "Landroidx/appcompat/app/AppCompatActivity;", "getAppCompatActivity", "()Landroidx/appcompat/app/AppCompatActivity;", "articleLimitMessageShown", "", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentReadingListBinding;", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "currentSearchQuery", "", "displayedLists", "", "", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "funnel", "Lorg/wikipedia/analytics/ReadingListsFunnel;", "headerView", "Lorg/wikipedia/readinglist/ReadingListItemView;", "multiSelectActionModeCallback", "Lorg/wikipedia/readinglist/ReadingListFragment$MultiSelectCallback;", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "readingListId", "", "readingListItemCallback", "Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListItemCallback;", "readingListPageItemCallback", "Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListPageItemCallback;", "searchActionModeCallback", "Lorg/wikipedia/readinglist/ReadingListFragment$SearchCallback;", "selectedPageCount", "", "getSelectedPageCount", "()I", "selectedPages", "", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "getSelectedPages", "()Ljava/util/List;", "showOverflowMenu", "toolbarExpanded", "touchCallback", "Lorg/wikipedia/views/SwipeableItemTouchHelperCallback;", "addSelectedPagesToList", "", "beginMultiSelect", "delete", "deleteSelectedPages", "finishActionMode", "getPageById", "id", "getPagePositionInList", "page", "moveSelectedPagesToList", "onAddItemToOther", "pageId", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDeleteItem", "onDestroyView", "onMoveItemToOther", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPrepareOptionsMenu", "onResume", "onSelectItem", "onShareItem", "onToggleItemOffline", "onViewCreated", "view", "rename", "setHeaderView", "setRecyclerView", "setSearchQuery", "query", "setSortMode", "sortModeAsc", "sortModeDesc", "setStatusBarActionMode", "inActionMode", "setSwipeRefreshView", "setToolbar", "toggleSelectPage", "unselectAllPages", "update", "updateEmptyState", "searchQuery", "updateReadingListData", "AppBarListener", "Companion", "EventBusConsumer", "HeaderCallback", "MultiSelectCallback", "ReadingListHeaderHolder", "ReadingListItemCallback", "ReadingListItemHolder", "ReadingListPageItemAdapter", "ReadingListPageItemCallback", "ReadingListPageItemHolder", "SearchCallback", "app_alphaDebug"})
public final class ReadingListFragment extends androidx.fragment.app.Fragment implements org.wikipedia.readinglist.ReadingListItemActionsDialog.Callback {
    private org.wikipedia.databinding.FragmentReadingListBinding _binding;
    private org.wikipedia.views.SwipeableItemTouchHelperCallback touchCallback;
    private org.wikipedia.readinglist.ReadingListItemView headerView;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private org.wikipedia.readinglist.database.ReadingList readingList;
    private long readingListId = 0L;
    private final org.wikipedia.readinglist.ReadingListFragment.ReadingListPageItemAdapter adapter = null;
    private androidx.appcompat.view.ActionMode actionMode;
    private final org.wikipedia.readinglist.ReadingListFragment.AppBarListener appBarListener = null;
    private boolean showOverflowMenu = false;
    private final org.wikipedia.analytics.ReadingListsFunnel funnel = null;
    private final org.wikipedia.readinglist.ReadingListFragment.ReadingListItemCallback readingListItemCallback = null;
    private final org.wikipedia.readinglist.ReadingListFragment.ReadingListPageItemCallback readingListPageItemCallback = null;
    private final org.wikipedia.readinglist.ReadingListFragment.SearchCallback searchActionModeCallback = null;
    private final org.wikipedia.readinglist.ReadingListFragment.MultiSelectCallback multiSelectActionModeCallback = null;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    private boolean toolbarExpanded = true;
    private java.util.List<java.lang.Object> displayedLists;
    private java.lang.String currentSearchQuery;
    private boolean articleLimitMessageShown = false;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.readinglist.ReadingListFragment.Companion Companion = null;
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
    private static final int TYPE_PAGE_ITEM = 2;
    
    public ReadingListFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentReadingListBinding getBinding() {
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
    public void onResume() {
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
    
    private final void setToolbar() {
    }
    
    private final void setHeaderView() {
    }
    
    private final void setRecyclerView() {
    }
    
    private final void setSwipeRefreshView() {
    }
    
    private final androidx.appcompat.app.AppCompatActivity getAppCompatActivity() {
        return null;
    }
    
    private final void update(org.wikipedia.readinglist.database.ReadingList readingList) {
    }
    
    private final void updateReadingListData() {
    }
    
    private final void setSearchQuery() {
    }
    
    private final void setSearchQuery(java.lang.String query) {
    }
    
    private final void updateEmptyState(java.lang.String searchQuery) {
    }
    
    private final void setSortMode(int sortModeAsc, int sortModeDesc) {
    }
    
    private final void rename() {
    }
    
    private final void finishActionMode() {
    }
    
    private final void beginMultiSelect() {
    }
    
    private final void toggleSelectPage(org.wikipedia.readinglist.database.ReadingListPage page) {
    }
    
    private final int getSelectedPageCount() {
        return 0;
    }
    
    private final void unselectAllPages() {
    }
    
    private final java.util.List<org.wikipedia.readinglist.database.ReadingListPage> getSelectedPages() {
        return null;
    }
    
    private final void deleteSelectedPages() {
    }
    
    private final void addSelectedPagesToList() {
    }
    
    private final void moveSelectedPagesToList() {
    }
    
    private final void delete() {
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
    
    private final void setStatusBarActionMode(boolean inActionMode) {
    }
    
    private final int getPagePositionInList(org.wikipedia.readinglist.database.ReadingListPage page) {
        return 0;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$AppBarListener;", "Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "onOffsetChanged", "", "appBarLayout", "Lcom/google/android/material/appbar/AppBarLayout;", "verticalOffset", "", "app_alphaDebug"})
    final class AppBarListener implements com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener {
        
        public AppBarListener() {
            super();
        }
        
        @java.lang.Override()
        public void onOffsetChanged(@org.jetbrains.annotations.NotNull()
        com.google.android.material.appbar.AppBarLayout appBarLayout, int verticalOffset) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0006\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Landroid/view/View;", "itemView", "Lorg/wikipedia/readinglist/ReadingListItemView;", "(Lorg/wikipedia/readinglist/ReadingListFragment;Lorg/wikipedia/readinglist/ReadingListItemView;)V", "view", "getView", "()Lorg/wikipedia/readinglist/ReadingListItemView;", "bindItem", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "app_alphaDebug"})
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00012\u00020\u0004B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0003J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0007\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\u0003X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListPageItemHolder;", "Lorg/wikipedia/views/DefaultViewHolder;", "Lorg/wikipedia/views/PageItemView;", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "Lorg/wikipedia/views/SwipeableItemTouchHelperCallback$Callback;", "itemView", "(Lorg/wikipedia/readinglist/ReadingListFragment;Lorg/wikipedia/views/PageItemView;)V", "imageDimension", "", "getImageDimension", "()I", "page", "bindItem", "", "onSwipe", "app_alphaDebug"})
    final class ReadingListPageItemHolder extends org.wikipedia.views.DefaultViewHolder<org.wikipedia.views.PageItemView<org.wikipedia.readinglist.database.ReadingListPage>> implements org.wikipedia.views.SwipeableItemTouchHelperCallback.Callback {
        private org.wikipedia.readinglist.database.ReadingListPage page;
        
        public ReadingListPageItemHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.PageItemView<org.wikipedia.readinglist.database.ReadingListPage> itemView) {
            super(null);
        }
        
        public final void bindItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingListPage page) {
        }
        
        @java.lang.Override()
        public void onSwipe() {
        }
        
        private final int getImageDimension() {
            return 0;
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListHeaderHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Lorg/wikipedia/readinglist/ReadingListFragment;Landroid/view/View;)V", "app_alphaDebug"})
    final class ReadingListHeaderHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public ReadingListHeaderHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016J\u0010\u0010\u0014\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListPageItemAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "headerCount", "", "getHeaderCount", "()I", "getItemCount", "getItemViewType", "position", "onBindViewHolder", "", "holder", "pos", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "type", "onViewAttachedToWindow", "onViewDetachedFromWindow", "app_alphaDebug"})
    final class ReadingListPageItemAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder> {
        
        public ReadingListPageItemAdapter() {
            super();
        }
        
        private final int getHeaderCount() {
            return 0;
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
        public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int type) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int pos) {
        }
        
        @java.lang.Override()
        public void onViewAttachedToWindow(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        }
        
        @java.lang.Override()
        public void onViewDetachedFromWindow(@org.jetbrains.annotations.NotNull()
        androidx.recyclerview.widget.RecyclerView.ViewHolder holder) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$HeaderCallback;", "Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "onClick", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onDelete", "onRemoveAllOffline", "onRename", "onSaveAllOffline", "app_alphaDebug"})
    final class HeaderCallback implements org.wikipedia.readinglist.ReadingListItemView.Callback {
        
        public HeaderCallback() {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListItemCallback;", "Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "onClick", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onDelete", "onRemoveAllOffline", "onRename", "onSaveAllOffline", "app_alphaDebug"})
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$ReadingListPageItemCallback;", "Lorg/wikipedia/views/PageItemView$Callback;", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "onActionClick", "", "item", "view", "Landroid/view/View;", "onClick", "onListChipClick", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onLongClick", "", "app_alphaDebug"})
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u0006H\u0014\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$SearchCallback;", "Lorg/wikipedia/history/SearchActionModeCallback;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "getParentContext", "Landroid/content/Context;", "getSearchHintString", "", "onCreateActionMode", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menu", "Landroid/view/Menu;", "onDestroyActionMode", "", "onQueryChange", "s", "app_alphaDebug"})
    final class SearchCallback extends org.wikipedia.history.SearchActionModeCallback {
        
        public SearchCallback() {
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
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0014J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$MultiSelectCallback;", "Lorg/wikipedia/views/MultiSelectActionModeCallback;", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "onActionItemClicked", "", "mode", "Landroidx/appcompat/view/ActionMode;", "menuItem", "Landroid/view/MenuItem;", "onCreateActionMode", "menu", "Landroid/view/Menu;", "onDeleteSelected", "", "onDestroyActionMode", "app_alphaDebug"})
    final class MultiSelectCallback extends org.wikipedia.views.MultiSelectActionModeCallback {
        
        public MultiSelectCallback() {
            super();
        }
        
        @java.lang.Override()
        public boolean onCreateActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.Menu menu) {
            return false;
        }
        
        @java.lang.Override()
        public boolean onActionItemClicked(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode, @org.jetbrains.annotations.NotNull()
        android.view.MenuItem menuItem) {
            return false;
        }
        
        @java.lang.Override()
        protected void onDeleteSelected() {
        }
        
        @java.lang.Override()
        public void onDestroyActionMode(@org.jetbrains.annotations.NotNull()
        androidx.appcompat.view.ActionMode mode) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0002H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$EventBusConsumer;", "Lio/reactivex/rxjava3/functions/Consumer;", "", "(Lorg/wikipedia/readinglist/ReadingListFragment;)V", "accept", "", "event", "app_alphaDebug"})
    final class EventBusConsumer implements io.reactivex.rxjava3.functions.Consumer<java.lang.Object> {
        
        public EventBusConsumer() {
            super();
        }
        
        @java.lang.Override()
        public void accept(@org.jetbrains.annotations.NotNull()
        java.lang.Object event) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListFragment$Companion;", "", "()V", "TYPE_HEADER", "", "TYPE_ITEM", "TYPE_PAGE_ITEM", "newInstance", "Lorg/wikipedia/readinglist/ReadingListFragment;", "listId", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.readinglist.ReadingListFragment newInstance(long listId) {
            return null;
        }
    }
}