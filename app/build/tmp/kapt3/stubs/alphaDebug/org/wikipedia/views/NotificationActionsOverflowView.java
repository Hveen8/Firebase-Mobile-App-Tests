package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J6\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0003\u0010\u0018\u001a\u00020\u00192\b\b\u0003\u0010\u001a\u001a\u00020\u00192\b\b\u0003\u0010\u001b\u001a\u00020\u0019H\u0002J\u001e\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/views/NotificationActionsOverflowView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "actionClickListener", "Landroid/view/View$OnClickListener;", "binding", "Lorg/wikipedia/databinding/ViewNotificationActionsOverflowBinding;", "callback", "Lorg/wikipedia/views/NotificationActionsOverflowView$Callback;", "container", "Lorg/wikipedia/notifications/NotificationListItemContainer;", "linkHandler", "Lorg/wikipedia/notifications/NotificationLinkHandler;", "popupWindowHost", "Landroid/widget/PopupWindow;", "dismiss", "", "setUpViewForLink", "textView", "Landroid/widget/TextView;", "link", "Lorg/wikipedia/notifications/db/Notification$Link;", "customIcon", "", "customIconColor", "customTextColor", "show", "anchorView", "Landroid/view/View;", "Callback", "app_alphaDebug"})
public final class NotificationActionsOverflowView extends android.widget.FrameLayout {
    private org.wikipedia.databinding.ViewNotificationActionsOverflowBinding binding;
    private org.wikipedia.notifications.NotificationListItemContainer container;
    private org.wikipedia.notifications.NotificationLinkHandler linkHandler;
    private org.wikipedia.views.NotificationActionsOverflowView.Callback callback;
    private android.widget.PopupWindow popupWindowHost;
    private android.view.View.OnClickListener actionClickListener;
    
    public NotificationActionsOverflowView(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public final void show(@org.jetbrains.annotations.NotNull()
    android.view.View anchorView, @org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.NotificationListItemContainer container, @org.jetbrains.annotations.NotNull()
    org.wikipedia.views.NotificationActionsOverflowView.Callback callback) {
    }
    
    public final void dismiss() {
    }
    
    private final void setUpViewForLink(android.widget.TextView textView, org.wikipedia.notifications.db.Notification.Link link, @androidx.annotation.DrawableRes()
    int customIcon, @androidx.annotation.ColorInt()
    int customIconColor, @androidx.annotation.ColorInt()
    int customTextColor) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00e6\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/views/NotificationActionsOverflowView$Callback;", "", "markAsReadClick", "", "container", "Lorg/wikipedia/notifications/NotificationListItemContainer;", "markRead", "", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void markAsReadClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.notifications.NotificationListItemContainer container, boolean markRead);
    }
}