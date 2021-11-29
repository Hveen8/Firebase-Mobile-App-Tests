package org.wikipedia.readinglist.db;

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
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ReadingListDao_Impl implements ReadingListDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ReadingList> __insertionAdapterOfReadingList;

  private final EntityDeletionOrUpdateAdapter<ReadingList> __deletionAdapterOfReadingList;

  private final EntityDeletionOrUpdateAdapter<ReadingList> __updateAdapterOfReadingList;

  private final SharedSQLiteStatement __preparedStmtOfMarkAllListsUnsynced;

  public ReadingListDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfReadingList = new EntityInsertionAdapter<ReadingList>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ReadingList` (`listTitle`,`description`,`mtime`,`atime`,`id`,`sizeBytes`,`dirty`,`remoteId`) VALUES (?,?,?,?,nullif(?, 0),?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ReadingList value) {
        if (value.getListTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getListTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        stmt.bindLong(3, value.getMtime());
        stmt.bindLong(4, value.getAtime());
        stmt.bindLong(5, value.getId());
        stmt.bindLong(6, value.getSizeBytes());
        final int _tmp;
        _tmp = value.getDirty() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        stmt.bindLong(8, value.getRemoteId());
      }
    };
    this.__deletionAdapterOfReadingList = new EntityDeletionOrUpdateAdapter<ReadingList>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `ReadingList` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ReadingList value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfReadingList = new EntityDeletionOrUpdateAdapter<ReadingList>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `ReadingList` SET `listTitle` = ?,`description` = ?,`mtime` = ?,`atime` = ?,`id` = ?,`sizeBytes` = ?,`dirty` = ?,`remoteId` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ReadingList value) {
        if (value.getListTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getListTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        stmt.bindLong(3, value.getMtime());
        stmt.bindLong(4, value.getAtime());
        stmt.bindLong(5, value.getId());
        stmt.bindLong(6, value.getSizeBytes());
        final int _tmp;
        _tmp = value.getDirty() ? 1 : 0;
        stmt.bindLong(7, _tmp);
        stmt.bindLong(8, value.getRemoteId());
        stmt.bindLong(9, value.getId());
      }
    };
    this.__preparedStmtOfMarkAllListsUnsynced = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE ReadingList SET remoteId = -1";
        return _query;
      }
    };
  }

  @Override
  public long insertReadingList(final ReadingList list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfReadingList.insertAndReturnId(list);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteReadingList(final ReadingList list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfReadingList.handle(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateReadingList(final ReadingList list) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfReadingList.handle(list);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void markAllListsUnsynced() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAllListsUnsynced.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMarkAllListsUnsynced.release(_stmt);
    }
  }

  @Override
  public List<ReadingList> getListsWithoutContents() {
    final String _sql = "SELECT * FROM ReadingList";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfListTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "listTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfDirty = CursorUtil.getColumnIndexOrThrow(_cursor, "dirty");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final List<ReadingList> _result = new ArrayList<ReadingList>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ReadingList _item;
        final String _tmpListTitle;
        if (_cursor.isNull(_cursorIndexOfListTitle)) {
          _tmpListTitle = null;
        } else {
          _tmpListTitle = _cursor.getString(_cursorIndexOfListTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final boolean _tmpDirty;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfDirty);
        _tmpDirty = _tmp != 0;
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _item = new ReadingList(_tmpListTitle,_tmpDescription,_tmpMtime,_tmpAtime,_tmpId,_tmpSizeBytes,_tmpDirty,_tmpRemoteId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ReadingList getListById(final long id) {
    final String _sql = "SELECT * FROM ReadingList WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfListTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "listTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfDirty = CursorUtil.getColumnIndexOrThrow(_cursor, "dirty");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final ReadingList _result;
      if(_cursor.moveToFirst()) {
        final String _tmpListTitle;
        if (_cursor.isNull(_cursorIndexOfListTitle)) {
          _tmpListTitle = null;
        } else {
          _tmpListTitle = _cursor.getString(_cursorIndexOfListTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final boolean _tmpDirty;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfDirty);
        _tmpDirty = _tmp != 0;
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _result = new ReadingList(_tmpListTitle,_tmpDescription,_tmpMtime,_tmpAtime,_tmpId,_tmpSizeBytes,_tmpDirty,_tmpRemoteId);
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
  public List<ReadingList> getAllLists() {
    return ReadingListDao.DefaultImpls.getAllLists(ReadingListDao_Impl.this);
  }

  @Override
  public ReadingList getListById(final long id, final boolean populatePages) {
    return ReadingListDao.DefaultImpls.getListById(ReadingListDao_Impl.this, id, populatePages);
  }

  @Override
  public List<ReadingList> getAllListsWithUnsyncedPages() {
    return ReadingListDao.DefaultImpls.getAllListsWithUnsyncedPages(ReadingListDao_Impl.this);
  }

  @Override
  public void updateList(final ReadingList list, final boolean queueForSync) {
    ReadingListDao.DefaultImpls.updateList(ReadingListDao_Impl.this, list, queueForSync);
  }

  @Override
  public void updateLists(final List<ReadingList> lists, final boolean queueForSync) {
    ReadingListDao.DefaultImpls.updateLists(ReadingListDao_Impl.this, lists, queueForSync);
  }

  @Override
  public void deleteList(final ReadingList list, final boolean queueForSync) {
    ReadingListDao.DefaultImpls.deleteList(ReadingListDao_Impl.this, list, queueForSync);
  }

  @Override
  public List<ReadingList> getListsFromPageOccurrences(final List<ReadingListPage> pages) {
    return ReadingListDao.DefaultImpls.getListsFromPageOccurrences(ReadingListDao_Impl.this, pages);
  }

  @Override
  public ReadingList createList(final String title, final String description) {
    return ReadingListDao.DefaultImpls.createList(ReadingListDao_Impl.this, title, description);
  }

  @Override
  public ReadingList getDefaultList() {
    return ReadingListDao.DefaultImpls.getDefaultList(ReadingListDao_Impl.this);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
