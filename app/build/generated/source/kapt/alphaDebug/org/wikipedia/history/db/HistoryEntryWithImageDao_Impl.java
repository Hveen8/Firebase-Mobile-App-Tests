package org.wikipedia.history.db;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import java.lang.Class;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import org.wikipedia.database.DateTypeConverter;
import org.wikipedia.history.HistoryEntry;
import org.wikipedia.search.SearchResults;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HistoryEntryWithImageDao_Impl implements HistoryEntryWithImageDao {
  private final RoomDatabase __db;

  private final DateTypeConverter __dateTypeConverter = new DateTypeConverter();

  public HistoryEntryWithImageDao_Impl(RoomDatabase __db) {
    this.__db = __db;
  }

  @Override
  public List<HistoryEntryWithImage> findEntriesBySearchTerm(final String term) {
    final String _sql = "SELECT `authority`, `lang`, `apiTitle`, `displayTitle`, `namespace`, `timestamp`, `source`, `timeSpentSec`, `imageName` FROM (SELECT HistoryEntry.*, PageImage.imageName FROM HistoryEntry LEFT OUTER JOIN PageImage ON (HistoryEntry.namespace = PageImage.namespace AND HistoryEntry.apiTitle = PageImage.apiTitle AND HistoryEntry.lang = PageImage.lang) WHERE UPPER(HistoryEntry.displayTitle) LIKE UPPER(?) ESCAPE '\\' ORDER BY timestamp DESC)";
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
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
      final int _cursorIndexOfTimeSpentSec = CursorUtil.getColumnIndexOrThrow(_cursor, "timeSpentSec");
      final int _cursorIndexOfImageName = CursorUtil.getColumnIndexOrThrow(_cursor, "imageName");
      final List<HistoryEntryWithImage> _result = new ArrayList<HistoryEntryWithImage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HistoryEntryWithImage _item;
        final String _tmpAuthority;
        if (_cursor.isNull(_cursorIndexOfAuthority)) {
          _tmpAuthority = null;
        } else {
          _tmpAuthority = _cursor.getString(_cursorIndexOfAuthority);
        }
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpNamespace;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmpNamespace = null;
        } else {
          _tmpNamespace = _cursor.getString(_cursorIndexOfNamespace);
        }
        final Date _tmpTimestamp;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTimestamp)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTimestamp);
        }
        _tmpTimestamp = __dateTypeConverter.fromTimestamp(_tmp);
        final int _tmpSource;
        _tmpSource = _cursor.getInt(_cursorIndexOfSource);
        final int _tmpTimeSpentSec;
        _tmpTimeSpentSec = _cursor.getInt(_cursorIndexOfTimeSpentSec);
        final String _tmpImageName;
        if (_cursor.isNull(_cursorIndexOfImageName)) {
          _tmpImageName = null;
        } else {
          _tmpImageName = _cursor.getString(_cursorIndexOfImageName);
        }
        _item = new HistoryEntryWithImage(_tmpAuthority,_tmpLang,_tmpApiTitle,_tmpDisplayTitle,_tmpNamespace,_tmpTimestamp,_tmpSource,_tmpTimeSpentSec,_tmpImageName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<HistoryEntryWithImage> findEntriesBy(final int excludeSource1,
      final int excludeSource2, final int excludeSource3, final int minTimeSpent, final int limit) {
    final String _sql = "SELECT `authority`, `lang`, `apiTitle`, `displayTitle`, `namespace`, `timestamp`, `source`, `timeSpentSec`, `imageName` FROM (SELECT HistoryEntry.*, PageImage.imageName FROM HistoryEntry LEFT OUTER JOIN PageImage ON (HistoryEntry.namespace = PageImage.namespace AND HistoryEntry.apiTitle = PageImage.apiTitle AND HistoryEntry.lang = PageImage.lang) WHERE source != ? AND source != ? AND source != ? AND timeSpentSec >= ? ORDER BY timestamp DESC LIMIT ?)";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 5);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, excludeSource1);
    _argIndex = 2;
    _statement.bindLong(_argIndex, excludeSource2);
    _argIndex = 3;
    _statement.bindLong(_argIndex, excludeSource3);
    _argIndex = 4;
    _statement.bindLong(_argIndex, minTimeSpent);
    _argIndex = 5;
    _statement.bindLong(_argIndex, limit);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfAuthority = CursorUtil.getColumnIndexOrThrow(_cursor, "authority");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
      final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
      final int _cursorIndexOfTimeSpentSec = CursorUtil.getColumnIndexOrThrow(_cursor, "timeSpentSec");
      final int _cursorIndexOfImageName = CursorUtil.getColumnIndexOrThrow(_cursor, "imageName");
      final List<HistoryEntryWithImage> _result = new ArrayList<HistoryEntryWithImage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HistoryEntryWithImage _item;
        final String _tmpAuthority;
        if (_cursor.isNull(_cursorIndexOfAuthority)) {
          _tmpAuthority = null;
        } else {
          _tmpAuthority = _cursor.getString(_cursorIndexOfAuthority);
        }
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpNamespace;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmpNamespace = null;
        } else {
          _tmpNamespace = _cursor.getString(_cursorIndexOfNamespace);
        }
        final Date _tmpTimestamp;
        final Long _tmp;
        if (_cursor.isNull(_cursorIndexOfTimestamp)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getLong(_cursorIndexOfTimestamp);
        }
        _tmpTimestamp = __dateTypeConverter.fromTimestamp(_tmp);
        final int _tmpSource;
        _tmpSource = _cursor.getInt(_cursorIndexOfSource);
        final int _tmpTimeSpentSec;
        _tmpTimeSpentSec = _cursor.getInt(_cursorIndexOfTimeSpentSec);
        final String _tmpImageName;
        if (_cursor.isNull(_cursorIndexOfImageName)) {
          _tmpImageName = null;
        } else {
          _tmpImageName = _cursor.getString(_cursorIndexOfImageName);
        }
        _item = new HistoryEntryWithImage(_tmpAuthority,_tmpLang,_tmpApiTitle,_tmpDisplayTitle,_tmpNamespace,_tmpTimestamp,_tmpSource,_tmpTimeSpentSec,_tmpImageName);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public SearchResults findHistoryItem(final String searchQuery) {
    return HistoryEntryWithImageDao.DefaultImpls.findHistoryItem(HistoryEntryWithImageDao_Impl.this, searchQuery);
  }

  @Override
  public List<Object> filterHistoryItems(final String searchQuery) {
    return HistoryEntryWithImageDao.DefaultImpls.filterHistoryItems(HistoryEntryWithImageDao_Impl.this, searchQuery);
  }

  @Override
  public List<HistoryEntry> findEntryForReadMore(final int age, final int minTimeSpent) {
    return HistoryEntryWithImageDao.DefaultImpls.findEntryForReadMore(HistoryEntryWithImageDao_Impl.this, age, minTimeSpent);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
