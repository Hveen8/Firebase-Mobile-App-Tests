package org.wikipedia.search.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0007H\'J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u000f0\u000eH\'J\u0010\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/search/db/RecentSearchDao;", "", "delete", "", "recentSearch", "Lorg/wikipedia/search/db/RecentSearch;", "deleteAll", "Lio/reactivex/rxjava3/core/Completable;", "deleteBy", "text", "", "timestamp", "Ljava/util/Date;", "getRecentSearches", "Lio/reactivex/rxjava3/core/Single;", "", "insertRecentSearch", "app_alphaDebug"})
public abstract interface RecentSearchDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.rxjava3.core.Completable insertRecentSearch(@org.jetbrains.annotations.NotNull()
    org.wikipedia.search.db.RecentSearch recentSearch);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM RecentSearch ORDER BY timestamp DESC")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<org.wikipedia.search.db.RecentSearch>> getRecentSearches();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM RecentSearch")
    public abstract io.reactivex.rxjava3.core.Completable deleteAll();
    
    @androidx.room.Query(value = "DELETE FROM RecentSearch WHERE text = :text AND timestamp = :timestamp")
    public abstract void deleteBy(@org.jetbrains.annotations.NotNull()
    java.lang.String text, @org.jetbrains.annotations.NotNull()
    java.util.Date timestamp);
    
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    org.wikipedia.search.db.RecentSearch recentSearch);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 3)
    public final class DefaultImpls {
        
        public static void delete(@org.jetbrains.annotations.NotNull()
        org.wikipedia.search.db.RecentSearchDao $this, @org.jetbrains.annotations.NotNull()
        org.wikipedia.search.db.RecentSearch recentSearch) {
        }
    }
}