package org.wikipedia.readinglist.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u001a\u0010\n\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\'J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\u0016J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u0016H\'J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000fH\u0016J\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0012H\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0012H\'J\u0010\u0010\u001c\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\u0003H\'J\b\u0010\u001d\u001a\u00020\fH\'J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001e\u0010\u001f\u001a\u00020\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010!\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0003H\'R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\""}, d2 = {"Lorg/wikipedia/readinglist/db/ReadingListDao;", "", "defaultList", "Lorg/wikipedia/readinglist/database/ReadingList;", "getDefaultList", "()Lorg/wikipedia/readinglist/database/ReadingList;", "createList", "title", "", "description", "createNewList", "deleteList", "", "list", "queueForSync", "", "deleteReadingList", "getAllLists", "", "getAllListsWithUnsyncedPages", "getListById", "id", "", "populatePages", "getListsFromPageOccurrences", "pages", "Lorg/wikipedia/readinglist/database/ReadingListPage;", "getListsWithoutContents", "insertReadingList", "markAllListsUnsynced", "updateList", "updateLists", "lists", "updateReadingList", "app_alphaDebug"})
public abstract interface ReadingListDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract long insertReadingList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list);
    
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void updateReadingList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list);
    
    @androidx.room.Delete()
    public abstract void deleteReadingList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM ReadingList")
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingList> getListsWithoutContents();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM ReadingList WHERE id = :id")
    public abstract org.wikipedia.readinglist.database.ReadingList getListById(long id);
    
    @androidx.room.Query(value = "UPDATE ReadingList SET remoteId = -1")
    public abstract void markAllListsUnsynced();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingList> getAllLists();
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.readinglist.database.ReadingList getListById(long id, boolean populatePages);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingList> getAllListsWithUnsyncedPages();
    
    public abstract void updateList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, boolean queueForSync);
    
    public abstract void updateLists(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, boolean queueForSync);
    
    public abstract void deleteList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.readinglist.database.ReadingList list, boolean queueForSync);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.readinglist.database.ReadingList> getListsFromPageOccurrences(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.readinglist.database.ReadingList createList(@org.jetbrains.annotations.NotNull()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String description);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.readinglist.database.ReadingList getDefaultList();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingList> getAllLists(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public static org.wikipedia.readinglist.database.ReadingList getListById(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, long id, boolean populatePages) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingList> getAllListsWithUnsyncedPages(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this) {
            return null;
        }
        
        public static void updateList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, boolean queueForSync) {
        }
        
        public static void updateLists(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingList> lists, boolean queueForSync) {
        }
        
        public static void deleteList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.database.ReadingList list, boolean queueForSync) {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.readinglist.database.ReadingList> getListsFromPageOccurrences(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.readinglist.database.ReadingListPage> pages) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.wikipedia.readinglist.database.ReadingList createList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String title, @org.jetbrains.annotations.Nullable()
        java.lang.String description) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static org.wikipedia.readinglist.database.ReadingList getDefaultList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.readinglist.db.ReadingListDao $this) {
            return null;
        }
        
        private static org.wikipedia.readinglist.database.ReadingList createNewList(org.wikipedia.readinglist.db.ReadingListDao $this, java.lang.String title, java.lang.String description) {
            return null;
        }
    }
}