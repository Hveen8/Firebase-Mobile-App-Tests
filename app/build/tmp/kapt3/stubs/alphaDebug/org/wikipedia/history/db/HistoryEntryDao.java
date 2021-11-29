package org.wikipedia.history.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\'J*\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\nH\'J\"\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\'J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\nH\'J\u0016\u0010\u0011\u001a\u00020\u00032\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0013H\u0017J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0017\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/history/db/HistoryEntryDao;", "", "delete", "", "entry", "Lorg/wikipedia/history/HistoryEntry;", "deleteAll", "Lio/reactivex/rxjava3/core/Completable;", "deleteBy", "authority", "", "lang", "namespace", "apiTitle", "findEntryBy", "findEntryBySearchTerm", "term", "insert", "entries", "", "insertEntry", "upsertWithTimeSpent", "timeSpent", "", "app_alphaDebug"})
public abstract interface HistoryEntryDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertEntry(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM HistoryEntry WHERE UPPER(displayTitle) LIKE UPPER(:term) ESCAPE \'\\\'")
    public abstract org.wikipedia.history.HistoryEntry findEntryBySearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM HistoryEntry WHERE authority = :authority AND lang = :lang AND apiTitle = :apiTitle LIMIT 1")
    public abstract org.wikipedia.history.HistoryEntry findEntryBy(@org.jetbrains.annotations.NotNull()
    java.lang.String authority, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM HistoryEntry")
    public abstract io.reactivex.rxjava3.core.Completable deleteAll();
    
    @androidx.room.Query(value = "DELETE FROM HistoryEntry WHERE authority = :authority AND lang = :lang AND namespace = :namespace AND apiTitle = :apiTitle")
    public abstract void deleteBy(@org.jetbrains.annotations.NotNull()
    java.lang.String authority, @org.jetbrains.annotations.NotNull()
    java.lang.String lang, @org.jetbrains.annotations.Nullable()
    java.lang.String namespace, @org.jetbrains.annotations.NotNull()
    java.lang.String apiTitle);
    
    @androidx.room.Transaction()
    public abstract void insert(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.history.HistoryEntry> entries);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry);
    
    @androidx.room.Transaction()
    public abstract void upsertWithTimeSpent(@org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, int timeSpent);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @androidx.room.Transaction()
        public static void insert(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryDao $this, @org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.history.HistoryEntry> entries) {
        }
        
        public static void delete(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry) {
        }
        
        @androidx.room.Transaction()
        public static void upsertWithTimeSpent(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry, int timeSpent) {
        }
    }
}