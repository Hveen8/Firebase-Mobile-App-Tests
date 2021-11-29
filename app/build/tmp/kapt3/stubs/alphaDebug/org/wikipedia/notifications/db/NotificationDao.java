package org.wikipedia.notifications.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0014\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u0007H\'J\"\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\b0\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bH\'J\u0016\u0010\f\u001a\u00020\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/notifications/db/NotificationDao;", "", "deleteNotification", "", "notification", "Lorg/wikipedia/notifications/db/Notification;", "getAllNotifications", "Lkotlinx/coroutines/flow/Flow;", "", "getNotificationsByWiki", "wiki", "", "insertNotifications", "notifications", "updateNotification", "app_alphaDebug"})
public abstract interface NotificationDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertNotifications(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.notifications.db.Notification> notifications);
    
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void updateNotification(@org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.Notification notification);
    
    @androidx.room.Delete()
    public abstract void deleteNotification(@org.jetbrains.annotations.NotNull()
    org.wikipedia.notifications.db.Notification notification);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Notification")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<org.wikipedia.notifications.db.Notification>> getAllNotifications();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM Notification WHERE `wiki` IN (:wiki)")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<org.wikipedia.notifications.db.Notification>> getNotificationsByWiki(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> wiki);
}