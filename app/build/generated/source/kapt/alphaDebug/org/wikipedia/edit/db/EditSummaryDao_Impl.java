package org.wikipedia.edit.db;

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
public final class EditSummaryDao_Impl implements EditSummaryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<EditSummary> __insertionAdapterOfEditSummary;

  private final DateTypeConverter __dateTypeConverter = new DateTypeConverter();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public EditSummaryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfEditSummary = new EntityInsertionAdapter<EditSummary>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `EditSummary` (`summary`,`lastUsed`) VALUES (?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, EditSummary value) {
        if (value.getSummary() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getSummary());
        }
        final Long _tmp;
        _tmp = __dateTypeConverter.dateToTimestamp(value.getLastUsed());
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
        final String _query = "DELETE FROM EditSummary";
        return _query;
      }
    };
  }

  @Override
  public Completable insertEditSummary(final EditSummary summary) {
    return Completable.fromCallable(new Callable<Void>() {
      @Override
      public Void call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfEditSummary.insert(summary);
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
  public Single<List<EditSummary>> getEditSummaries() {
    final String _sql = "SELECT * FROM EditSummary ORDER BY lastUsed DESC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return RxRoom.createSingle(new Callable<List<EditSummary>>() {
      @Override
      public List<EditSummary> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfSummary = CursorUtil.getColumnIndexOrThrow(_cursor, "summary");
          final int _cursorIndexOfLastUsed = CursorUtil.getColumnIndexOrThrow(_cursor, "lastUsed");
          final List<EditSummary> _result = new ArrayList<EditSummary>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final EditSummary _item;
            final String _tmpSummary;
            if (_cursor.isNull(_cursorIndexOfSummary)) {
              _tmpSummary = null;
            } else {
              _tmpSummary = _cursor.getString(_cursorIndexOfSummary);
            }
            final Date _tmpLastUsed;
            final Long _tmp;
            if (_cursor.isNull(_cursorIndexOfLastUsed)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getLong(_cursorIndexOfLastUsed);
            }
            _tmpLastUsed = __dateTypeConverter.fromTimestamp(_tmp);
            _item = new EditSummary(_tmpSummary,_tmpLastUsed);
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

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
