package org.wikipedia.readinglist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0003-./B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\tJ\u0016\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010 \u001a\u00020!J\u0010\u0010\"\u001a\u00020\u001c2\b\u0010#\u001a\u0004\u0018\u00010\u0019J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&J\u0010\u0010\'\u001a\u00020\u001c2\b\b\u0001\u0010(\u001a\u00020\tJ\u0010\u0010)\u001a\u00020*2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010+\u001a\u00020\u001cH\u0002J\b\u0010,\u001a\u00020\u001cH\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00060"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lorg/wikipedia/databinding/ItemReadingListBinding;", "callback", "Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "getCallback", "()Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "setCallback", "(Lorg/wikipedia/readinglist/ReadingListItemView$Callback;)V", "imageViews", "", "Landroid/widget/ImageView;", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "buildStatisticalDetailText", "", "buildStatisticalSummaryText", "clearThumbnails", "", "setOverflowViewVisibility", "visibility", "setReadingList", "description", "Lorg/wikipedia/readinglist/ReadingListItemView$Description;", "setSearchQuery", "searchQuery", "setThumbnailVisible", "visible", "", "setTitleTextAppearance", "id", "statsTextListSize", "", "updateDetails", "updateThumbnails", "Callback", "Description", "OverflowMenuClickListener", "app_alphaDebug"})
public final class ReadingListItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final org.wikipedia.databinding.ItemReadingListBinding binding = null;
    private org.wikipedia.readinglist.database.ReadingList readingList;
    private final java.util.List<android.widget.ImageView> imageViews = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.readinglist.ReadingListItemView.Callback callback;
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.readinglist.ReadingListItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.readinglist.ReadingListItemView.Callback p0) {
    }
    
    public ReadingListItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ReadingListItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public ReadingListItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    public final void setReadingList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList readingList, @org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.ReadingListItemView.Description description) {
    }
    
    public final void setThumbnailVisible(boolean visible) {
    }
    
    public final void setTitleTextAppearance(@androidx.annotation.StyleRes()
    int id) {
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
    }
    
    public final void setOverflowViewVisibility(int visibility) {
    }
    
    private final void updateDetails() {
    }
    
    private final void clearThumbnails() {
    }
    
    private final void updateThumbnails() {
    }
    
    private final java.lang.String buildStatisticalSummaryText(org.wikipedia.readinglist.database.ReadingList readingList) {
        return null;
    }
    
    private final java.lang.String buildStatisticalDetailText(org.wikipedia.readinglist.database.ReadingList readingList) {
        return null;
    }
    
    private final float statsTextListSize(org.wikipedia.readinglist.database.ReadingList readingList) {
        return 0.0F;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemView$Callback;", "", "onClick", "", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onDelete", "onRemoveAllOffline", "onRename", "onSaveAllOffline", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onRename(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onDelete(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onSaveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
        
        public abstract void onRemoveAllOffline(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemView$Description;", "", "(Ljava/lang/String;I)V", "DETAIL", "SUMMARY", "app_alphaDebug"})
    public static enum Description {
        /*public static final*/ DETAIL /* = new DETAIL() */,
        /*public static final*/ SUMMARY /* = new SUMMARY() */;
        
        Description() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/readinglist/ReadingListItemView$OverflowMenuClickListener;", "Landroidx/appcompat/widget/PopupMenu$OnMenuItemClickListener;", "list", "Lorg/wikipedia/readinglist/database/ReadingList;", "(Lorg/wikipedia/readinglist/ReadingListItemView;Lorg/wikipedia/readinglist/database/ReadingList;)V", "onMenuItemClick", "", "item", "Landroid/view/MenuItem;", "app_alphaDebug"})
    final class OverflowMenuClickListener implements androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener {
        private final org.wikipedia.readinglist.database.ReadingList list = null;
        
        public OverflowMenuClickListener(@org.jetbrains.annotations.Nullable()
        org.wikipedia.readinglist.database.ReadingList list) {
            super();
        }
        
        @java.lang.Override()
        public boolean onMenuItemClick(@org.jetbrains.annotations.NotNull()
        android.view.MenuItem item) {
            return false;
        }
    }
}