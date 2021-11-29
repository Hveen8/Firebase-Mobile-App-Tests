package org.wikipedia.feed.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 /2\u00020\u0001:\u0002./B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nJ\u0010\u0010\u0019\u001a\u00020\u00002\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0014\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u0010J\u0012\u0010!\u001a\u00020\u001b2\b\u0010\"\u001a\u0004\u0018\u00010\u0015H\u0007J\u000e\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017J\u0012\u0010\'\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u0012\u0010*\u001a\u00020\u001b2\b\u0010(\u001a\u0004\u0018\u00010)H\u0007J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020-H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n8G@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R$\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\t\u001a\u0004\u0018\u00010\u00108G@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u00060"}, d2 = {"Lorg/wikipedia/feed/view/ListCardItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ViewListCardItemBinding;", "<set-?>", "Lorg/wikipedia/feed/view/ListCardItemView$Callback;", "callback", "getCallback", "()Lorg/wikipedia/feed/view/ListCardItemView$Callback;", "card", "Lorg/wikipedia/feed/model/Card;", "Lorg/wikipedia/history/HistoryEntry;", "historyEntry", "getHistoryEntry", "()Lorg/wikipedia/history/HistoryEntry;", "getPageViewText", "", "pageViews", "", "setCallback", "setCard", "setGraphView", "", "viewHistories", "", "Lorg/wikipedia/dataclient/page/PageSummary$ViewHistory;", "setHistoryEntry", "entry", "setImage", "url", "setNumber", "number", "", "setPageViews", "setSubtitle", "text", "", "setTitle", "setViewsGreyedOut", "greyedOut", "", "Callback", "Companion", "app_alphaDebug"})
public final class ListCardItemView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final org.wikipedia.databinding.ViewListCardItemBinding binding = null;
    private org.wikipedia.feed.model.Card card;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.feed.view.ListCardItemView.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.history.HistoryEntry historyEntry;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.feed.view.ListCardItemView.Companion Companion = null;
    private static final int DEFAULT_VIEW_HISTORY_ITEMS = 5;
    
    @kotlin.jvm.JvmOverloads()
    public ListCardItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    @kotlin.jvm.JvmOverloads()
    public ListCardItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public final org.wikipedia.feed.view.ListCardItemView.Callback getCallback() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.VisibleForTesting()
    public final org.wikipedia.history.HistoryEntry getHistoryEntry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.ListCardItemView setCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.model.Card card) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.ListCardItemView setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.feed.view.ListCardItemView.Callback callback) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.feed.view.ListCardItemView setHistoryEntry(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setImage(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setSubtitle(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence text) {
    }
    
    public final void setNumber(int number) {
    }
    
    public final void setPageViews(long pageViews) {
    }
    
    public final void setGraphView(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.dataclient.page.PageSummary.ViewHistory> viewHistories) {
    }
    
    private final java.lang.String getPageViewText(long pageViews) {
        return null;
    }
    
    private final void setViewsGreyedOut(boolean greyedOut) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0005H&J7\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000fH&\u00a2\u0006\u0002\u0010\u0013J \u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0007H&\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/feed/view/ListCardItemView$Callback;", "", "onAddPageToList", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "addToDefault", "", "onMovePageToList", "sourceReadingListId", "", "onSelectPage", "card", "Lorg/wikipedia/feed/model/Card;", "sharedElements", "", "Landroidx/core/util/Pair;", "Landroid/view/View;", "", "(Lorg/wikipedia/feed/model/Card;Lorg/wikipedia/history/HistoryEntry;[Landroidx/core/util/Pair;)V", "openInNewBackgroundTab", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onSelectPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean openInNewBackgroundTab);
        
        public abstract void onSelectPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.feed.model.Card card, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, @org.jetbrains.annotations.NotNull()
        androidx.core.util.Pair<android.view.View, java.lang.String>[] sharedElements);
        
        public abstract void onAddPageToList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, boolean addToDefault);
        
        public abstract void onMovePageToList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/feed/view/ListCardItemView$Companion;", "", "()V", "DEFAULT_VIEW_HISTORY_ITEMS", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}