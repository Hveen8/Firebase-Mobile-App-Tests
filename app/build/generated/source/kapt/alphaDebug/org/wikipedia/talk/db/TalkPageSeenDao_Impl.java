package org.wikipedia.talk.db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.rxjava3.core.Completable;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class TalkPageSeenDao_Impl implements TalkPageSeenDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<TalkPageSeen> __insertionAdapterOfTalkPageSeen;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public TalkPageSeenDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTalkPageSeen = new EntityInsertionAdapter<TalkPageSeen>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `TalkPageSeen` (`sha`) VALUES (?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, TalkPageSeen value) {
        if (value.getSha() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSha());
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM TalkPageSeen";
        return _query;
      }
    };
  }

  @Override
  public void insertTalkPageSeen(final TalkPageSeen talkPageSeen) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfTalkPageSeen.insert(talkPageSeen);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Completable deleteAll() {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    });
  }

  @Override
  public TalkPageSeen getTalkPageSeen(final String sha) {
    final String _sql = "SELECT * FROM TalkPageSeen WHERE sha = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (sha == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, sha);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSha = CursorUtil.getColumnIndexOrThrow(_cursor, "sha");
      final TalkPageSeen _result;
      if(_cursor.moveToFirst()) {
        final String _tmpSha;
        if (_cursor.isNull(_cursorIndexOfSha)) {
          _tmpSha = null;
        } else {
          _tmpSha = _cursor.getString(_cursorIndexOfSha);
        }
        _result = new TalkPageSeen(_tmpSha);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<TalkPageSeen> getAll() {
    final String _sql = "SELECT * FROM TalkPageSeen";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfSha = CursorUtil.getColumnIndexOrThrow(_cursor, "sha");
      final List<TalkPageSeen> _result = new ArrayList<TalkPageSeen>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final TalkPageSeen _item;
        final String _tmpSha;
        if (_cursor.isNull(_cursorIndexOfSha)) {
          _tmpSha = null;
        } else {
          _tmpSha = _cursor.getString(_cursorIndexOfSha);
        }
        _item = new TalkPageSeen(_tmpSha);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
