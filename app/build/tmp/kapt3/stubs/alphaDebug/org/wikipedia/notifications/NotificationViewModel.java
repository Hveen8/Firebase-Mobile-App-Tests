package org.wikipedia.notifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00015B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0011\u0010#\u001a\u00020$H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\b\u0010&\u001a\u00020\rH\u0002J\u0006\u0010\'\u001a\u00020\u0007J\u0006\u0010(\u001a\u00020$J\u001c\u0010)\u001a\u00020$2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020,0+2\u0006\u0010-\u001a\u00020.J\u001c\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u001c0+H\u0002J\u0010\u00101\u001a\u00020$2\b\u00102\u001a\u0004\u0018\u00010\rJ\u000e\u00103\u001a\u00020$2\u0006\u00104\u001a\u00020\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r@BX\u0086\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u00066"}, d2 = {"Lorg/wikipedia/notifications/NotificationViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_uiState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lorg/wikipedia/notifications/NotificationViewModel$UiState;", "allUnreadCount", "", "getAllUnreadCount", "()I", "setAllUnreadCount", "(I)V", "currentContinueStr", "", "<set-?>", "currentSearchQuery", "getCurrentSearchQuery", "()Ljava/lang/String;", "dbNameMap", "", "Lorg/wikipedia/dataclient/WikiSite;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "mentionsUnreadCount", "getMentionsUnreadCount", "setMentionsUnreadCount", "notificationList", "", "Lorg/wikipedia/notifications/db/Notification;", "notificationRepository", "Lorg/wikipedia/notifications/NotificationRepository;", "selectedFilterTab", "uiState", "getUiState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "collectionNotifications", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delimitedWikiList", "excludedFiltersCount", "fetchAndSave", "markItemsAsRead", "items", "", "Lorg/wikipedia/notifications/NotificationListItemContainer;", "markUnread", "", "processList", "list", "updateSearchQuery", "query", "updateTabSelection", "position", "UiState", "app_alphaDebug"})
public final class NotificationViewModel extends androidx.lifecycle.ViewModel {
    private final org.wikipedia.notifications.NotificationRepository notificationRepository = null;
    private final kotlinx.coroutines.CoroutineExceptionHandler handler = null;
    private final java.util.List<org.wikipedia.notifications.db.Notification> notificationList = null;
    private java.util.Map<java.lang.String, org.wikipedia.dataclient.WikiSite> dbNameMap;
    private int selectedFilterTab = 0;
    private java.lang.String currentContinueStr;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String currentSearchQuery;
    private int mentionsUnreadCount = 0;
    private int allUnreadCount = 0;
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.notifications.NotificationViewModel.UiState> _uiState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.notifications.NotificationViewModel.UiState> uiState = null;
    
    public NotificationViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCurrentSearchQuery() {
        return null;
    }
    
    public final int getMentionsUnreadCount() {
        return 0;
    }
    
    public final void setMentionsUnreadCount(int p0) {
    }
    
    public final int getAllUnreadCount() {
        return 0;
    }
    
    public final void setAllUnreadCount(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<org.wikipedia.notifications.NotificationViewModel.UiState> getUiState() {
        return null;
    }
    
    private final java.lang.Object collectionNotifications(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.util.List<org.wikipedia.notifications.NotificationListItemContainer> processList(java.util.List<org.wikipedia.notifications.db.Notification> list) {
        return null;
    }
    
    private final java.lang.String delimitedWikiList() {
        return null;
    }
    
    public final int excludedFiltersCount() {
        return 0;
    }
    
    public final void fetchAndSave() {
    }
    
    public final void updateSearchQuery(@org.jetbrains.annotations.Nullable()
    java.lang.String query) {
    }
    
    public final void updateTabSelection(int position) {
    }
    
    public final void markItemsAsRead(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.notifications.NotificationListItemContainer> items, boolean markUnread) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/notifications/NotificationViewModel$UiState;", "", "()V", "Error", "Success", "app_alphaDebug"})
    public static class UiState {
        
        public UiState() {
            super();
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0006H\u00c6\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0015H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lorg/wikipedia/notifications/NotificationViewModel$UiState$Success;", "Lorg/wikipedia/notifications/NotificationViewModel$UiState;", "notifications", "", "Lorg/wikipedia/notifications/NotificationListItemContainer;", "fromContinuation", "", "(Ljava/util/List;Z)V", "getFromContinuation", "()Z", "getNotifications", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "app_alphaDebug"})
        public static final class Success extends org.wikipedia.notifications.NotificationViewModel.UiState {
            @org.jetbrains.annotations.NotNull()
            private final java.util.List<org.wikipedia.notifications.NotificationListItemContainer> notifications = null;
            private final boolean fromContinuation = false;
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.notifications.NotificationViewModel.UiState.Success copy(@org.jetbrains.annotations.NotNull()
            java.util.List<org.wikipedia.notifications.NotificationListItemContainer> notifications, boolean fromContinuation) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Success(@org.jetbrains.annotations.NotNull()
            java.util.List<org.wikipedia.notifications.NotificationListItemContainer> notifications, boolean fromContinuation) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<org.wikipedia.notifications.NotificationListItemContainer> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.util.List<org.wikipedia.notifications.NotificationListItemContainer> getNotifications() {
                return null;
            }
            
            public final boolean component2() {
                return false;
            }
            
            public final boolean getFromContinuation() {
                return false;
            }
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/notifications/NotificationViewModel$UiState$Error;", "Lorg/wikipedia/notifications/NotificationViewModel$UiState;", "throwable", "", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_alphaDebug"})
        public static final class Error extends org.wikipedia.notifications.NotificationViewModel.UiState {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.Throwable throwable = null;
            
            @org.jetbrains.annotations.NotNull()
            public final org.wikipedia.notifications.NotificationViewModel.UiState.Error copy(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                return null;
            }
            
            @java.lang.Override()
            public boolean equals(@org.jetbrains.annotations.Nullable()
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override()
            public int hashCode() {
                return 0;
            }
            
            @org.jetbrains.annotations.NotNull()
            @java.lang.Override()
            public java.lang.String toString() {
                return null;
            }
            
            public Error(@org.jetbrains.annotations.NotNull()
            java.lang.Throwable throwable) {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable component1() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull()
            public final java.lang.Throwable getThrowable() {
                return null;
            }
        }
    }
}