package org.wikipedia.history.db;

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
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.lang.Void;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import org.wikipedia.database.DateTypeConverter;
import org.wikipedia.history.HistoryEntry;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HistoryEntryDao_Impl implements HistoryEntryDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<HistoryEntry> __insertionAdapterOfHistoryEntry;

  private final DateTypeConverter __dateTypeConverter = new DateTypeConverter();

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDeleteBy;

  public HistoryEntryDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHistoryEntry = new EntityInsertionAdapter<HistoryEntry>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `HistoryEntry` (`authority`,`lang`,`apiTitle`,`displayTitle`,`id`,`namespace`,`timestamp`,`source`,`timeSpentSec`) VALUES (?,?,?,?,nullif(?, 0),?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HistoryEntry value) {
        if (value.getAuthority() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getAuthority());
        }
        if (value.getLang() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getLang());
        }
        if (value.getApiTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getApiTitle());
        }
        if (value.getDisplayTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDisplayTitle());
        }
        stmt.bindLong(5, value.getId());
        if (value.getNamespace() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getNamespace());
        }
        final Long _tmp;
        _tmp = __dateTypeConverter.dateToTimestamp(value.getTimestamp());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindLong(7, _tmp);
        }
        stmt.bindLong(8, value.getSource());
        stmt.bindLong(9, value.getTimeSpentSec());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM HistoryEntry";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteBy = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM HistoryEntry WHERE authority = ? AND lang = ? AND namespace = ? AND apiTitle = ?";
        return _query;
      }
    };
  }

  @Override
  public void insertEntry(final HistoryEntry entry) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHistoryEntry.insert(entry);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void insert(final List<HistoryEntry> entries) {
    __db.beginTransaction();
    try {
      HistoryEntryDao.DefaultImpls.insert(HistoryEntryDao_Impl.this, entries);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void upsertWithTimeSpent(final HistoryEntry entry, final int timeSpent) {
    __db.beginTransaction();
    try {
      HistoryEntryDao.DefaultImpls.upsertWithTimeSpent(HistoryEntryDao_Impl.this, entry, timeSpent);
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
  public void deleteBy(final String authority, final String lang, final String namespace,
      final String apiTitle) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteBy.acquire();
    int _argIndex = 1;
    if (authority == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, authority);
    }
    _argIndex = 2;
    if (lang == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, lang);
    }
    _argIndex = 3;
    if (namespace == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, namespace);
    }
    _argIndex = 4;
    if (apiTitle == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, apiTitle);
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
  public HistoryEntry findEntryBySearchTerm(final String term) {
    final String _sql = "SELECT * FROM HistoryEntry WHERE UPPER(displayTitle) LIKE UPPER(?) ESCAPE '\\'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (term == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, term);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAuthority = CursorUtil.getColumnIndexOrThrow(_cursor, "authority");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
      final int _cursorIndexOfTimeSpentSec = CursorUtil.getColumnIndexOrThrow(_cursor, "timeSpentSec");
      final HistoryEntry _result;
      if(_cursor.moveToFirst()) {
        _result = new HistoryEntry();
        final String _tmpAuthority;
        if (_cursor.isNull(_cursorIndexOfAuthority)) {
          _tmpAuthority = null;
        } else {
          _tmpAuthority = _cursor.getString(_cursorIndexOfAuthority);
        }
        _result.setAuthority(_tmpAuthority);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        _result.setLang(_tmpLang);
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        _result.setApiTitle(_tmpApiTitle);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        _result.setDisplayTitle(_tmpDisplayTitle);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpNamespace;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmpNamespace = null;
        } else {
          _tmpNamespace = _cursor.getString(_cursorIndexOfNamespace);
        }
        _result.setNamespace(_tmpNamespace);
        final Date _tmpTimestamp;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTimestamp)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTimestamp);
        }
        _tmpTimestamp = __dateTypeConverter.fromTimestamp(_tmp);
        _result.setTimestamp(_tmpTimestamp);
        final int _tmpSource;
        _tmpSource = _cursor.getInt(_cursorIndexOfSource);
        _result.setSource(_tmpSource);
        final int _tmpTimeSpentSec;
        _tmpTimeSpentSec = _cursor.getInt(_cursorIndexOfTimeSpentSec);
        _result.setTimeSpentSec(_tmpTimeSpentSec);
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
  public HistoryEntry findEntryBy(final String authority, final String lang,
      final String apiTitle) {
    final String _sql = "SELECT * FROM HistoryEntry WHERE authority = ? AND lang = ? AND apiTitle = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 3);
    int _argIndex = 1;
    if (authority == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, authority);
    }
    _argIndex = 2;
    if (lang == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, lang);
    }
    _argIndex = 3;
    if (apiTitle == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, apiTitle);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAuthority = CursorUtil.getColumnIndexOrThrow(_cursor, "authority");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
      final int _cursorIndexOfTimeSpentSec = CursorUtil.getColumnIndexOrThrow(_cursor, "timeSpentSec");
      final HistoryEntry _result;
      if(_cursor.moveToFirst()) {
        _result = new HistoryEntry();
        final String _tmpAuthority;
        if (_cursor.isNull(_cursorIndexOfAuthority)) {
          _tmpAuthority = null;
        } else {
          _tmpAuthority = _cursor.getString(_cursorIndexOfAuthority);
        }
        _result.setAuthority(_tmpAuthority);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        _result.setLang(_tmpLang);
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        _result.setApiTitle(_tmpApiTitle);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        _result.setDisplayTitle(_tmpDisplayTitle);
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        _result.setId(_tmpId);
        final String _tmpNamespace;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmpNamespace = null;
        } else {
          _tmpNamespace = _cursor.getString(_cursorIndexOfNamespace);
        }
        _result.setNamespace(_tmpNamespace);
        final Date _tmpTimestamp;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTimestamp)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTimestamp);
        }
        _tmpTimestamp = __dateTypeConverter.fromTimestamp(_tmp);
        _result.setTimestamp(_tmpTimestamp);
        final int _tmpSource;
        _tmpSource = _cursor.getInt(_cursorIndexOfSource);
        _result.setSource(_tmpSource);
        final int _tmpTimeSpentSec;
        _tmpTimeSpentSec = _cursor.getInt(_cursorIndexOfTimeSpentSec);
        _result.setTimeSpentSec(_tmpTimeSpentSec);
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
  public void delete(final HistoryEntry entry) {
    HistoryEntryDao.DefaultImpls.delete(HistoryEntryDao_Impl.this, entry);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
