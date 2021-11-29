package org.wikipedia.search.db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.rxjava3.EmptyResultSetException;
import androidx.room.rxjava3.RxRoom;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import org.wikipedia.database.DateTypeConverter;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RecentSearchDao_Impl implements RecentSearchDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<RecentSearch> __insertionAdapterOfRecentSearch;

  private final DateTypeConverter __dateTypeConverter = new DateTypeConverter();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteBy;

  public RecentSearchDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRecentSearch = new EntityInsertionAdapter<RecentSearch>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `RecentSearch` (`text`,`timestamp`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, RecentSearch value) {
        if (value.getText() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getText());
        }
        final Long _tmp;
        _tmp = __dateTypeConverter.dateToTimestamp(value.getTimestamp());
        if (_tmp == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp);
        }
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM RecentSearch";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteBy = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM RecentSearch WHERE text = ? AND timestamp = ?";
        return _query;
      }
    };
  }

  @Override
  public Completable insertRecentSearch(final RecentSearch recentSearch) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfRecentSearch.insert(recentSearch);
          __db.setTransactionSuccessful();
          return null;
        } finally {
          __db.endTransaction();
        }
      }
    });
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
  public void deleteBy(final String text, final Date timestamp) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteBy.acquire();
    int _argIndex = 1;
    if (text == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, text);
    }
    _argIndex = 2;
    final Long _tmp;
    _tmp = __dateTypeConverter.dateToTimestamp(timestamp);
    if (_tmp == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindLong(_argIndex, _tmp);
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteBy.release(_stmt);
    }
  }

  @Override
  public Single<List<RecentSearch>> getRecentSearches() {
    final String _sql = "SELECT * FROM RecentSearch ORDER BY timestamp DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<RecentSearch>>() {
      @Override
      public List<RecentSearch> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfText = CursorUtil.getColumnIndexOrThrow(_cursor, "text");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final List<RecentSearch> _result = new ArrayList<RecentSearch>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final RecentSearch _item;
            final String _tmpText;
            if (_cursor.isNull(_cursorIndexOfText)) {
              _tmpText = null;
            } else {
              _tmpText = _cursor.getString(_cursorIndexOfText);
            }
            final Date _tmpTimestamp;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfTimestamp);
            }
            _tmpTimestamp = __dateTypeConverter.fromTimestamp(_tmp);
            _item = new RecentSearch(_tmpText,_tmpTimestamp);
            _result.add(_item);
          }
          if(_result == null) {
            throw new EmptyResultSetException("Query returned empty result set: " + _statement.getSql());
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public void delete(final RecentSearch recentSearch) {
    RecentSearchDao.DefaultImpls.delete(RecentSearchDao_Impl.this, recentSearch);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
