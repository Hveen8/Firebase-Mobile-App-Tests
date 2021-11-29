package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0015\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001<B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0006\u0010\u0018\u001a\u00020\u0019J\u0010\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u0017J\u0010\u0010\u001f\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010!J\u0006\u0010\"\u001a\u00020\u0019J\u000e\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001cJ\u0010\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u000fJ\u0016\u0010\'\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\u001cJ\b\u0010*\u001a\u00020\u0019H\u0002J\u000e\u0010+\u001a\u00020\u00192\u0006\u0010,\u001a\u00020\u001cJ\u0010\u0010-\u001a\u00020\u00192\b\u0010.\u001a\u0004\u0018\u00010\u000fJ\u0018\u0010/\u001a\u00020\u00192\b\b\u0001\u0010\u001b\u001a\u00020\u001c2\u0006\u00100\u001a\u00020\u0017J\u0010\u00101\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u00102\u001a\u00020\u00192\b\u0010 \u001a\u0004\u0018\u00010\u000fJ\u0006\u00103\u001a\u00020\u0019J\u000e\u00104\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001cJ\u0014\u00105\u001a\u00020\u00192\f\u00106\u001a\b\u0012\u0004\u0012\u00020807J\u000e\u00109\u001a\u00020\u00192\u0006\u0010:\u001a\u00020\u0017J\b\u0010;\u001a\u00020\u0019H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0004\u0018\u00018\u0000X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006="}, d2 = {"Lorg/wikipedia/views/PageItemView;", "T", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "binding", "Lorg/wikipedia/databinding/ItemPageListEntryBinding;", "callback", "Lorg/wikipedia/views/PageItemView$Callback;", "getCallback", "()Lorg/wikipedia/views/PageItemView$Callback;", "setCallback", "(Lorg/wikipedia/views/PageItemView$Callback;)V", "imageUrl", "", "item", "getItem", "()Ljava/lang/Object;", "setItem", "(Ljava/lang/Object;)V", "Ljava/lang/Object;", "selected", "", "hideChipGroup", "", "setActionHint", "id", "", "setCircularProgressVisibility", "visible", "setDescription", "text", "", "setDescriptionEllipsis", "setDescriptionMaxLines", "linesCount", "setImageUrl", "url", "setListItemImageDimensions", "width", "height", "setOnClickListeners", "setProgress", "progress", "setSearchQuery", "searchQuery", "setSecondaryActionIcon", "show", "setSelected", "setTitle", "setTitleEllipsis", "setTitleMaxLines", "setUpChipGroup", "readingLists", "", "Lorg/wikipedia/readinglist/database/ReadingList;", "setViewsGreyedOut", "greyedOut", "updateSelectedState", "Callback", "app_alphaDebug"})
public final class PageItemView<T extends java.lang.Object> extends androidx.constraintlayout.widget.ConstraintLayout {
    private final org.wikipedia.databinding.ItemPageListEntryBinding binding = null;
    private java.lang.String imageUrl;
    private boolean selected = false;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.PageItemView.Callback<T> callback;
    @org.jetbrains.annotations.Nullable()
    private T item;
    
    public PageItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.views.PageItemView.Callback<T> getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.PageItemView.Callback<T> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getItem() {
        return null;
    }
    
    public final void setItem(@org.jetbrains.annotations.Nullable()
    T p0) {
    }
    
    @java.lang.Override()
    public void setSelected(boolean selected) {
    }
    
    private final void setOnClickListeners() {
    }
    
    private final void updateSelectedState() {
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void setTitleMaxLines(int linesCount) {
    }
    
    public final void setTitleEllipsis() {
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    public final void setDescriptionMaxLines(int linesCount) {
    }
    
    public final void setDescriptionEllipsis() {
    }
    
    public final void setImageUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    public final void setSecondaryActionIcon(@androidx.annotation.DrawableRes()
    int id, boolean show) {
    }
    
    public final void setProgress(int progress) {
    }
    
    public final void setCircularProgressVisibility(boolean visible) {
    }
    
    public final void setActionHint(@androidx.annotation.StringRes()
    int id) {
    }
    
    public final void setListItemImageDimensions(int width, int height) {
    }
    
    public final void setUpChipGroup(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> readingLists) {
    }
    
    public final void hideChipGroup() {
    }
    
    public final void setSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
    }
    
    public final void setViewsGreyedOut(boolean greyedOut) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u0000*\u0004\b\u0001\u0010\u00012\u00020\u0002J\u001f\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a2\u0006\u0002\u0010\bJ\u0017\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001H&\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH&J\u0017\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0005\u001a\u0004\u0018\u00018\u0001H&\u00a2\u0006\u0002\u0010\u0010\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/views/PageItemView$Callback;", "T", "", "onActionClick", "", "item", "view", "Landroid/view/View;", "(Ljava/lang/Object;Landroid/view/View;)V", "onClick", "(Ljava/lang/Object;)V", "onListChipClick", "readingList", "Lorg/wikipedia/readinglist/database/ReadingList;", "onLongClick", "", "(Ljava/lang/Object;)Z", "app_alphaDebug"})
    public static abstract interface Callback<T extends java.lang.Object> {
        
        public abstract void onClick(@org.jetbrains.annotations.Nullable()
        T item);
        
        public abstract boolean onLongClick(@org.jetbrains.annotations.Nullable()
        T item);
        
        public abstract void onActionClick(@org.jetbrains.annotations.Nullable()
        T item, @org.jetbrains.annotations.NotNull()
        android.view.View view);
        
        public abstract void onListChipClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList readingList);
    }
}