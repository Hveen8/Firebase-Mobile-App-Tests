package org.wikipedia.readinglist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\tJ\b\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00122\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010\u0014\u001a\u00020\u0012H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00108\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"}, d2 = {"Lorg/wikipedia/readinglist/LongPressMenu;", "", "anchorView", "Landroid/view/View;", "callback", "Lorg/wikipedia/readinglist/LongPressMenu$Callback;", "(Landroid/view/View;Lorg/wikipedia/readinglist/LongPressMenu$Callback;)V", "existsInAnyList", "", "(Landroid/view/View;ZLorg/wikipedia/readinglist/LongPressMenu$Callback;)V", "entry", "Lorg/wikipedia/history/HistoryEntry;", "listsContainingPage", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "menuRes", "", "deleteOrShowDialog", "", "show", "showMenu", "Callback", "PageSaveMenuClickListener", "app_alphaDebug"})
public final class LongPressMenu {
    private final android.view.View anchorView = null;
    private final boolean existsInAnyList = false;
    private final org.wikipedia.readinglist.LongPressMenu.Callback callback = null;
    @androidx.annotation.MenuRes()
    private final int menuRes = 0;
    private java.util.List<org.wikipedia.readinglist.database.ReadingList> listsContainingPage;
    private org.wikipedia.history.HistoryEntry entry;
    
    public LongPressMenu(@org.jetbrains.annotations.NotNull()
    android.view.View anchorView, boolean existsInAnyList, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.LongPressMenu.Callback callback) {
        super();
    }
    
    public LongPressMenu(@org.jetbrains.annotations.NotNull()
    android.view.View anchorView, @org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.LongPressMenu.Callback callback) {
        super();
    }
    
    public final void show(@org.jetbrains.annotations.Nullable()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    private final void showMenu() {
    }
    
    private final void deleteOrShowDialog() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/readinglist/LongPressMenu$Callback;", "", "onAddRequest", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "", "onMoveRequest", "page", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "onOpenInNewTab", "onOpenLink", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onOpenLink(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onOpenInNewTab(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onAddRequest(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean addToDefault);
        
        public abstract void onMoveRequest(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingListPage page, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/readinglist/LongPressMenu$PageSaveMenuClickListener;", "Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;", "(Lorg/wikipedia/readinglist/LongPressMenu;)V", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app_alphaDebug"})
    final class PageSaveMenuClickListener implements androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener {
        
        public PageSaveMenuClickListener() {
            super();
        }
        
        @java.lang.Override()
        public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
}