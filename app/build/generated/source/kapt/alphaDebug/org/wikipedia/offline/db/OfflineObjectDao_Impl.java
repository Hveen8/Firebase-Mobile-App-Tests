package org.wikipedia.offline.db;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class OfflineObjectDao_Impl implements OfflineObjectDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<OfflineObject> __insertionAdapterOfOfflineObject;

  private final EntityDeletionOrUpdateAdapter<OfflineObject> __deletionAdapterOfOfflineObject;

  private final EntityDeletionOrUpdateAdapter<OfflineObject> __updateAdapterOfOfflineObject;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  public OfflineObjectDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfOfflineObject = new EntityInsertionAdapter<OfflineObject>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `OfflineObject` (`id`,`url`,`lang`,`path`,`status`,`usedByStr`) VALUES (nullif(?, 0),?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OfflineObject value) {
        stmt.bindLong(1, value.getId());
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        if (value.getLang() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLang());
        }
        if (value.getPath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPath());
        }
        stmt.bindLong(5, value.getStatus());
        if (value.getUsedByStr() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUsedByStr());
        }
      }
    };
    this.__deletionAdapterOfOfflineObject = new EntityDeletionOrUpdateAdapter<OfflineObject>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `OfflineObject` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OfflineObject value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfOfflineObject = new EntityDeletionOrUpdateAdapter<OfflineObject>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `OfflineObject` SET `id` = ?,`url` = ?,`lang` = ?,`path` = ?,`status` = ?,`usedByStr` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, OfflineObject value) {
        stmt.bindLong(1, value.getId());
        if (value.getUrl() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getUrl());
        }
        if (value.getLang() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getLang());
        }
        if (value.getPath() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getPath());
        }
        stmt.bindLong(5, value.getStatus());
        if (value.getUsedByStr() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getUsedByStr());
        }
        stmt.bindLong(7, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM OfflineObject";
        return _query;
      }
    };
  }

  @Override
  public void insertOfflineObject(final OfflineObject obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfOfflineObject.insert(obj);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteOfflineObject(final OfflineObject obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfOfflineObject.handle(obj);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateOfflineObject(final OfflineObject obj) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfOfflineObject.handle(obj);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAll() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAll.release(_stmt);
    }
  }

  @Override
  public OfflineObject getOfflineObject(final String url, final String lang) {
    final String _sql = "SELECT * FROM OfflineObject WHERE url = ? AND lang = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (url == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, url);
    }
    _argIndex = 2;
    if (lang == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, lang);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfUsedByStr = CursorUtil.getColumnIndexOrThrow(_cursor, "usedByStr");
      final OfflineObject _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final int _tmpStatus;
        _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
        final String _tmpUsedByStr;
        if (_cursor.isNull(_cursorIndexOfUsedByStr)) {
          _tmpUsedByStr = null;
        } else {
          _tmpUsedByStr = _cursor.getString(_cursorIndexOfUsedByStr);
        }
        _result = new OfflineObject(_tmpId,_tmpUrl,_tmpLang,_tmpPath,_tmpStatus,_tmpUsedByStr);
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
  public OfflineObject getOfflineObject(final String url) {
    final String _sql = "SELECT * FROM OfflineObject WHERE url = ? LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (url == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, url);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfUsedByStr = CursorUtil.getColumnIndexOrThrow(_cursor, "usedByStr");
      final OfflineObject _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final int _tmpStatus;
        _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
        final String _tmpUsedByStr;
        if (_cursor.isNull(_cursorIndexOfUsedByStr)) {
          _tmpUsedByStr = null;
        } else {
          _tmpUsedByStr = _cursor.getString(_cursorIndexOfUsedByStr);
        }
        _result = new OfflineObject(_tmpId,_tmpUrl,_tmpLang,_tmpPath,_tmpStatus,_tmpUsedByStr);
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
  public OfflineObject searchForOfflineObject(final String urlFragment) {
    final String _sql = "SELECT * FROM OfflineObject WHERE url LIKE '%/' || ? || '/%' LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (urlFragment == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, urlFragment);
    }
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfUsedByStr = CursorUtil.getColumnIndexOrThrow(_cursor, "usedByStr");
      final OfflineObject _result;
      if(_cursor.moveToFirst()) {
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final int _tmpStatus;
        _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
        final String _tmpUsedByStr;
        if (_cursor.isNull(_cursorIndexOfUsedByStr)) {
          _tmpUsedByStr = null;
        } else {
          _tmpUsedByStr = _cursor.getString(_cursorIndexOfUsedByStr);
        }
        _result = new OfflineObject(_tmpId,_tmpUrl,_tmpLang,_tmpPath,_tmpStatus,_tmpUsedByStr);
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
  public List<OfflineObject> getFromUsedById(final long id) {
    final String _sql = "SELECT * FROM OfflineObject WHERE usedByStr LIKE '%|' || ? || '|%'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "url");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfPath = CursorUtil.getColumnIndexOrThrow(_cursor, "path");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfUsedByStr = CursorUtil.getColumnIndexOrThrow(_cursor, "usedByStr");
      final List<OfflineObject> _result = new ArrayList<OfflineObject>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final OfflineObject _item;
        final int _tmpId;
        _tmpId = _cursor.getInt(_cursorIndexOfId);
        final String _tmpUrl;
        if (_cursor.isNull(_cursorIndexOfUrl)) {
          _tmpUrl = null;
        } else {
          _tmpUrl = _cursor.getString(_cursorIndexOfUrl);
        }
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final String _tmpPath;
        if (_cursor.isNull(_cursorIndexOfPath)) {
          _tmpPath = null;
        } else {
          _tmpPath = _cursor.getString(_cursorIndexOfPath);
        }
        final int _tmpStatus;
        _tmpStatus = _cursor.getInt(_cursorIndexOfStatus);
        final String _tmpUsedByStr;
        if (_cursor.isNull(_cursorIndexOfUsedByStr)) {
          _tmpUsedByStr = null;
        } else {
          _tmpUsedByStr = _cursor.getString(_cursorIndexOfUsedByStr);
        }
        _item = new OfflineObject(_tmpId,_tmpUrl,_tmpLang,_tmpPath,_tmpStatus,_tmpUsedByStr);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public OfflineObject findObject(final String url, final String lang) {
    return OfflineObjectDao.DefaultImpls.findObject(OfflineObjectDao_Impl.this, url, lang);
  }

  @Override
  public void addObject(final String url, final String lang, final String path,
      final String pageTitle) {
    OfflineObjectDao.DefaultImpls.addObject(OfflineObjectDao_Impl.this, url, lang, path, pageTitle);
  }

  @Override
  public void deleteObjectsForPageId(final long id) {
    OfflineObjectDao.DefaultImpls.deleteObjectsForPageId(OfflineObjectDao_Impl.this, id);
  }

  @Override
  public long getTotalBytesForPageId(final long id) {
    return OfflineObjectDao.DefaultImpls.getTotalBytesForPageId(OfflineObjectDao_Impl.this, id);
  }

  @Override
  public void deleteFilesForObject(final OfflineObject obj) {
    OfflineObjectDao.DefaultImpls.deleteFilesForObject(OfflineObjectDao_Impl.this, obj);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
