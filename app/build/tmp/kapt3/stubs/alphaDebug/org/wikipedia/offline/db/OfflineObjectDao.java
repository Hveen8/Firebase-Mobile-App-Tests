package org.wikipedia.offline.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\bg\u0018\u00002\u00020\u0001J(\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0003H\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00132\u0006\u0010\u000e\u001a\u00020\u000fH\'J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\'J\u0010\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\'J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0018\u001a\u00020\u0005H\'J\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/offline/db/OfflineObjectDao;", "", "addObject", "", "url", "", "lang", "path", "pageTitle", "deleteAll", "deleteFilesForObject", "obj", "Lorg/wikipedia/offline/db/OfflineObject;", "deleteObjectsForPageId", "id", "", "deleteOfflineObject", "findObject", "getFromUsedById", "", "getOfflineObject", "getTotalBytesForPageId", "insertOfflineObject", "searchForOfflineObject", "urlFragment", "updateOfflineObject", "app_alphaDebug"})
public abstract interface OfflineObjectDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertOfflineObject(@org.jetbrains.annotations.NotNull()
    org.wikipedia.offline.db.OfflineObject obj);
    
    @androidx.room.Update(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void updateOfflineObject(@org.jetbrains.annotations.NotNull()
    org.wikipedia.offline.db.OfflineObject obj);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM OfflineObject WHERE url = :url AND lang = :lang LIMIT 1")
    public abstract org.wikipedia.offline.db.OfflineObject getOfflineObject(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String lang);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM OfflineObject WHERE url = :url LIMIT 1")
    public abstract org.wikipedia.offline.db.OfflineObject getOfflineObject(@org.jetbrains.annotations.NotNull()
    java.lang.String url);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM OfflineObject WHERE url LIKE \'%/\' || :urlFragment || \'/%\' LIMIT 1")
    public abstract org.wikipedia.offline.db.OfflineObject searchForOfflineObject(@org.jetbrains.annotations.NotNull()
    java.lang.String urlFragment);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM OfflineObject WHERE usedByStr LIKE \'%|\' || :id || \'|%\'")
    public abstract java.util.List<org.wikipedia.offline.db.OfflineObject> getFromUsedById(long id);
    
    @androidx.room.Delete()
    public abstract void deleteOfflineObject(@org.jetbrains.annotations.NotNull()
    org.wikipedia.offline.db.OfflineObject obj);
    
    @androidx.room.Query(value = "DELETE FROM OfflineObject")
    public abstract void deleteAll();
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wikipedia.offline.db.OfflineObject findObject(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String lang);
    
    public abstract void addObject(@org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    java.lang.String pageTitle);
    
    public abstract void deleteObjectsForPageId(long id);
    
    public abstract long getTotalBytesForPageId(long id);
    
    public abstract void deleteFilesForObject(@org.jetbrains.annotations.NotNull()
    org.wikipedia.offline.db.OfflineObject obj);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.Nullable()
        public static org.wikipedia.offline.db.OfflineObject findObject(@org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObjectDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.Nullable()
        java.lang.String lang) {
            return null;
        }
        
        public static void addObject(@org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObjectDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String url, @org.jetbrains.annotations.NotNull()
        java.lang.String lang, @org.jetbrains.annotations.NotNull()
        java.lang.String path, @org.jetbrains.annotations.NotNull()
        java.lang.String pageTitle) {
        }
        
        public static void deleteObjectsForPageId(@org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObjectDao $this, long id) {
        }
        
        public static long getTotalBytesForPageId(@org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObjectDao $this, long id) {
            return 0L;
        }
        
        public static void deleteFilesForObject(@org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObjectDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.offline.db.OfflineObject obj) {
        }
    }
}