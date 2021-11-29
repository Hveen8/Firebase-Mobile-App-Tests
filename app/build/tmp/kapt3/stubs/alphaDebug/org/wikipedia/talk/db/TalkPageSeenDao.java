package org.wikipedia.talk.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\'J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0006H\'\u00a8\u0006\r"}, d2 = {"Lorg/wikipedia/talk/db/TalkPageSeenDao;", "", "deleteAll", "Lio/reactivex/rxjava3/core/Completable;", "getAll", "", "Lorg/wikipedia/talk/db/TalkPageSeen;", "getTalkPageSeen", "sha", "", "insertTalkPageSeen", "", "talkPageSeen", "app_alphaDebug"})
public abstract interface TalkPageSeenDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertTalkPageSeen(@org.jetbrains.annotations.NotNull()
    org.wikipedia.talk.db.TalkPageSeen talkPageSeen);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM TalkPageSeen WHERE sha = :sha LIMIT 1")
    public abstract org.wikipedia.talk.db.TalkPageSeen getTalkPageSeen(@org.jetbrains.annotations.NotNull()
    java.lang.String sha);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM TalkPageSeen")
    public abstract java.util.List<org.wikipedia.talk.db.TalkPageSeen> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "DELETE FROM TalkPageSeen")
    public abstract io.reactivex.rxjava3.core.Completable deleteAll();
}