package org.wikipedia.history.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J6\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\u0006\u0010\u000f\u001a\u00020\u0005H\'J\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00032\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0007H\u0002\u00a8\u0006\u001a"}, d2 = {"Lorg/wikipedia/history/db/HistoryEntryWithImageDao;", "", "filterHistoryItems", "", "searchQuery", "", "findEntriesBy", "Lorg/wikipedia/history/db/HistoryEntryWithImage;", "excludeSource1", "", "excludeSource2", "excludeSource3", "minTimeSpent", "limit", "findEntriesBySearchTerm", "term", "findEntryForReadMore", "Lorg/wikipedia/history/HistoryEntry;", "age", "findHistoryItem", "Lorg/wikipedia/search/SearchResults;", "getDateString", "date", "Ljava/util/Date;", "toHistoryEntry", "entryWithImage", "app_alphaDebug"})
public abstract interface HistoryEntryWithImageDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RewriteQueriesToDropUnusedColumns()
    @androidx.room.Query(value = "SELECT HistoryEntry.*, PageImage.imageName FROM HistoryEntry LEFT OUTER JOIN PageImage ON (HistoryEntry.namespace = PageImage.namespace AND HistoryEntry.apiTitle = PageImage.apiTitle AND HistoryEntry.lang = PageImage.lang) WHERE UPPER(HistoryEntry.displayTitle) LIKE UPPER(:term) ESCAPE \'\\\' ORDER BY timestamp DESC")
    public abstract java.util.List<org.wikipedia.history.db.HistoryEntryWithImage> findEntriesBySearchTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.RewriteQueriesToDropUnusedColumns()
    @androidx.room.Query(value = "SELECT HistoryEntry.*, PageImage.imageName FROM HistoryEntry LEFT OUTER JOIN PageImage ON (HistoryEntry.namespace = PageImage.namespace AND HistoryEntry.apiTitle = PageImage.apiTitle AND HistoryEntry.lang = PageImage.lang) WHERE source != :excludeSource1 AND source != :excludeSource2 AND source != :excludeSource3 AND timeSpentSec >= :minTimeSpent ORDER BY timestamp DESC LIMIT :limit")
    public abstract java.util.List<org.wikipedia.history.db.HistoryEntryWithImage> findEntriesBy(int excludeSource1, int excludeSource2, int excludeSource3, int minTimeSpent, int limit);
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wikipedia.search.SearchResults findHistoryItem(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.Object> filterHistoryItems(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wikipedia.history.HistoryEntry> findEntryForReadMore(int age, int minTimeSpent);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        @org.jetbrains.annotations.NotNull()
        public static org.wikipedia.search.SearchResults findHistoryItem(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryWithImageDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<java.lang.Object> filterHistoryItems(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryWithImageDao $this, @org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public static java.util.List<org.wikipedia.history.HistoryEntry> findEntryForReadMore(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.db.HistoryEntryWithImageDao $this, int age, int minTimeSpent) {
            return null;
        }
        
        private static org.wikipedia.history.HistoryEntry toHistoryEntry(org.wikipedia.history.db.HistoryEntryWithImageDao $this, org.wikipedia.history.db.HistoryEntryWithImage entryWithImage) {
            return null;
        }
        
        private static java.lang.String getDateString(org.wikipedia.history.db.HistoryEntryWithImageDao $this, java.util.Date date) {
            return null;
        }
    }
}