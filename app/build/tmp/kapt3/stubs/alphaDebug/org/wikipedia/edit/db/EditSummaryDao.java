package org.wikipedia.edit.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0014\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0005H\'J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0007H\'\u00a8\u0006\n"}, d2 = {"Lorg/wikipedia/edit/db/EditSummaryDao;", "", "deleteAll", "Lio/reactivex/rxjava3/core/Completable;", "getEditSummaries", "Lio/reactivex/rxjava3/core/Single;", "", "Lorg/wikipedia/edit/db/EditSummary;", "insertEditSummary", "summary", "app_alphaDebug"})
public abstract interface EditSummaryDao {
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract io.reactivex.rxjava3.core.Completable insertEditSummary(@org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.db.EditSummary summary);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM EditSummary ORDER BY lastUsed DESC")
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<org.wikipedia.edit.db.EditSummary>> getEditSummaries();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM EditSummary")
    public abstract io.reactivex.rxjava3.core.Completable deleteAll();
}