package org.wikipedia.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u001aB\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0002J\u0012\u0010\u0016\u001a\u00020\u00172\n\u0010\u000f\u001a\u00060\u0010R\u00020\u0011J\u000e\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0013R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\b\u0018\u00010\u0010R\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lorg/wikipedia/notifications/NotificationFilterItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ItemNotificationFilterBinding;", "callback", "Lorg/wikipedia/notifications/NotificationFilterItemView$Callback;", "getCallback", "()Lorg/wikipedia/notifications/NotificationFilterItemView$Callback;", "setCallback", "(Lorg/wikipedia/notifications/NotificationFilterItemView$Callback;)V", "filter", "Lorg/wikipedia/notifications/NotificationFilterActivity$Filter;", "Lorg/wikipedia/notifications/NotificationFilterActivity;", "getTitleCodeFor", "", "filterCode", "getTitleFor", "setContents", "", "setSingleLabel", "text", "Callback", "app_alphaDebug"})
public final class NotificationFilterItemView extends android.widget.LinearLayout {
    private org.wikipedia.databinding.ItemNotificationFilterBinding binding;
    private org.wikipedia.notifications.NotificationFilterActivity.Filter filter;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.notifications.NotificationFilterItemView.Callback callback;
    
    public NotificationFilterItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.notifications.NotificationFilterItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.notifications.NotificationFilterItemView.Callback p0) {
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.NotificationFilterActivity.Filter filter) {
    }
    
    public final void setSingleLabel(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    private final java.lang.String getTitleCodeFor(java.lang.String filterCode) {
        return null;
    }
    
    private final java.lang.String getTitleFor(java.lang.String filterCode) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0018\u00010\u0005R\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/notifications/NotificationFilterItemView$Callback;", "", "onCheckedChanged", "", "filter", "Lorg/wikipedia/notifications/NotificationFilterActivity$Filter;", "Lorg/wikipedia/notifications/NotificationFilterActivity;", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onCheckedChanged(@org.jetbrains.annotations.Nullable()
        org.wikipedia.notifications.NotificationFilterActivity.Filter filter);
    }
}