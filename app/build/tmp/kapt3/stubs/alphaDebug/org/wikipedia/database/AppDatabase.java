package org.wikipedia.database;

import java.lang.System;

@androidx.room.TypeConverters(value = {org.wikipedia.database.DateTypeConverter.class, org.wikipedia.database.WikiSiteTypeConverter.class, org.wikipedia.database.NamespaceTypeConverter.class, org.wikipedia.database.NotificationTypeConverters.class})
@androidx.room.Database(entities = {org.wikipedia.history.HistoryEntry.class, org.wikipedia.pageimages.db.PageImage.class, org.wikipedia.search.db.RecentSearch.class, org.wikipedia.talk.db.TalkPageSeen.class, org.wikipedia.edit.db.EditSummary.class, org.wikipedia.offline.db.OfflineObject.class, org.wikipedia.readinglist.database.ReadingList.class, org.wikipedia.readinglist.database.ReadingListPage.class, org.wikipedia.notifications.db.Notification.class}, version = 24)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u0012H&J\b\u0010\u0013\u001a\u00020\u0014H&J\b\u0010\u0015\u001a\u00020\u0016H&\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/database/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "editSummaryDao", "Lorg/wikipedia/edit/db/EditSummaryDao;", "historyEntryDao", "Lorg/wikipedia/history/db/HistoryEntryDao;", "historyEntryWithImageDao", "Lorg/wikipedia/history/db/HistoryEntryWithImageDao;", "notificationDao", "Lorg/wikipedia/notifications/db/NotificationDao;", "offlineObjectDao", "Lorg/wikipedia/offline/db/OfflineObjectDao;", "pageImagesDao", "Lorg/wikipedia/pageimages/db/PageImageDao;", "readingListDao", "Lorg/wikipedia/readinglist/db/ReadingListDao;", "readingListPageDao", "Lorg/wikipedia/readinglist/db/ReadingListPageDao;", "recentSearchDao", "Lorg/wikipedia/search/db/RecentSearchDao;", "talkPageSeenDao", "Lorg/wikipedia/talk/db/TalkPageSeenDao;", "Companion", "app_alphaDebug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.database.AppDatabase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_19_20 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_20_21 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_21_22 = null;
    @org.jetbrains.annotations.NotNull()
    private static final androidx.room.migration.Migration MIGRATION_22_23 = null;
    private static final androidx.room.migration.Migration MIGRATION_23_24 = null;
    @kotlin.jvm.Volatile()
    private static volatile org.wikipedia.database.AppDatabase instance;
    
    public AppDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.history.db.HistoryEntryDao historyEntryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.history.db.HistoryEntryWithImageDao historyEntryWithImageDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.pageimages.db.PageImageDao pageImagesDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.search.db.RecentSearchDao recentSearchDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.talk.db.TalkPageSeenDao talkPageSeenDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.edit.db.EditSummaryDao editSummaryDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.offline.db.OfflineObjectDao offlineObjectDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.readinglist.db.ReadingListDao readingListDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.readinglist.db.ReadingListPageDao readingListPageDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.notifications.db.NotificationDao notificationDao();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u000fR\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/database/AppDatabase$Companion;", "", "()V", "MIGRATION_19_20", "Landroidx/room/migration/Migration;", "getMIGRATION_19_20", "()Landroidx/room/migration/Migration;", "MIGRATION_20_21", "getMIGRATION_20_21", "MIGRATION_21_22", "getMIGRATION_21_22", "MIGRATION_22_23", "getMIGRATION_22_23", "MIGRATION_23_24", "instance", "Lorg/wikipedia/database/AppDatabase;", "getAppDatabase", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_19_20() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_20_21() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_21_22() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final androidx.room.migration.Migration getMIGRATION_22_23() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.database.AppDatabase getAppDatabase() {
            return null;
        }
    }
}