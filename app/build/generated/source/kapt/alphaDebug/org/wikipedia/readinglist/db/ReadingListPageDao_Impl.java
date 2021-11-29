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
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.wikipedia.database.NamespaceTypeConverter;
import org.wikipedia.database.WikiSiteTypeConverter;
import org.wikipedia.dataclient.WikiSite;
import org.wikipedia.page.Namespace;
import org.wikipedia.page.PageTitle;
import org.wikipedia.readinglist.database.ReadingList;
import org.wikipedia.readinglist.database.ReadingListPage;
import org.wikipedia.search.SearchResults;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ReadingListPageDao_Impl implements ReadingListPageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<ReadingListPage> __insertionAdapterOfReadingListPage;

  private final WikiSiteTypeConverter __wikiSiteTypeConverter = new WikiSiteTypeConverter();

  private final NamespaceTypeConverter __namespaceTypeConverter = new NamespaceTypeConverter();

  private final EntityDeletionOrUpdateAdapter<ReadingListPage> __updateAdapterOfReadingListPage;

  private final SharedSQLiteStatement __preparedStmtOfUpdateThumbAndDescriptionByName;

  private final SharedSQLiteStatement __preparedStmtOfUpdateStatus;

  private final SharedSQLiteStatement __preparedStmtOfDeletePagesByStatus;

  private final SharedSQLiteStatement __preparedStmtOfMarkAllPagesUnsynced;

  public ReadingListPageDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfReadingListPage = new EntityInsertionAdapter<ReadingListPage>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `ReadingListPage` (`wiki`,`namespace`,`displayTitle`,`apiTitle`,`description`,`thumbUrl`,`listId`,`id`,`mtime`,`atime`,`offline`,`status`,`sizeBytes`,`lang`,`revId`,`remoteId`) VALUES (?,?,?,?,?,?,?,nullif(?, 0),?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ReadingListPage value) {
        final String _tmp;
        _tmp = __wikiSiteTypeConverter.wikiSiteToString(value.getWiki());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        final Integer _tmp_1;
        _tmp_1 = __namespaceTypeConverter.namespaceToInt(value.getNamespace());
        if (_tmp_1 == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp_1);
        }
        if (value.getDisplayTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDisplayTitle());
        }
        if (value.getApiTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getApiTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getThumbUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getThumbUrl());
        }
        stmt.bindLong(7, value.getListId());
        stmt.bindLong(8, value.getId());
        stmt.bindLong(9, value.getMtime());
        stmt.bindLong(10, value.getAtime());
        final int _tmp_2;
        _tmp_2 = value.getOffline() ? 1 : 0;
        stmt.bindLong(11, _tmp_2);
        stmt.bindLong(12, value.getStatus());
        stmt.bindLong(13, value.getSizeBytes());
        if (value.getLang() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getLang());
        }
        stmt.bindLong(15, value.getRevId());
        stmt.bindLong(16, value.getRemoteId());
      }
    };
    this.__updateAdapterOfReadingListPage = new EntityDeletionOrUpdateAdapter<ReadingListPage>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `ReadingListPage` SET `wiki` = ?,`namespace` = ?,`displayTitle` = ?,`apiTitle` = ?,`description` = ?,`thumbUrl` = ?,`listId` = ?,`id` = ?,`mtime` = ?,`atime` = ?,`offline` = ?,`status` = ?,`sizeBytes` = ?,`lang` = ?,`revId` = ?,`remoteId` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, ReadingListPage value) {
        final String _tmp;
        _tmp = __wikiSiteTypeConverter.wikiSiteToString(value.getWiki());
        if (_tmp == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, _tmp);
        }
        final Integer _tmp_1;
        _tmp_1 = __namespaceTypeConverter.namespaceToInt(value.getNamespace());
        if (_tmp_1 == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindLong(2, _tmp_1);
        }
        if (value.getDisplayTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getDisplayTitle());
        }
        if (value.getApiTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getApiTitle());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getDescription());
        }
        if (value.getThumbUrl() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getThumbUrl());
        }
        stmt.bindLong(7, value.getListId());
        stmt.bindLong(8, value.getId());
        stmt.bindLong(9, value.getMtime());
        stmt.bindLong(10, value.getAtime());
        final int _tmp_2;
        _tmp_2 = value.getOffline() ? 1 : 0;
        stmt.bindLong(11, _tmp_2);
        stmt.bindLong(12, value.getStatus());
        stmt.bindLong(13, value.getSizeBytes());
        if (value.getLang() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getLang());
        }
        stmt.bindLong(15, value.getRevId());
        stmt.bindLong(16, value.getRemoteId());
        stmt.bindLong(17, value.getId());
      }
    };
    this.__preparedStmtOfUpdateThumbAndDescriptionByName = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE ReadingListPage SET thumbUrl = ?, description = ? WHERE lang = ? AND displayTitle = ? AND apiTitle = ?";
        return _query;
      }
    };
    this.__preparedStmtOfUpdateStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE ReadingListPage SET status = ? WHERE status = ? AND offline = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeletePagesByStatus = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM ReadingListPage WHERE status = ?";
        return _query;
      }
    };
    this.__preparedStmtOfMarkAllPagesUnsynced = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE ReadingListPage SET remoteId = -1";
        return _query;
      }
    };
  }

  @Override
  public long insertReadingListPage(final ReadingListPage page) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfReadingListPage.insertAndReturnId(page);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateReadingListPage(final ReadingListPage page) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfReadingListPage.handle(page);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<String> addPagesToListIfNotExist(final ReadingList list,
      final List<PageTitle> titles) {
    __db.beginTransaction();
    try {
      List<String> _result = ReadingListPageDao.DefaultImpls.addPagesToListIfNotExist(ReadingListPageDao_Impl.this, list, titles);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updatePages(final List<ReadingListPage> pages) {
    __db.beginTransaction();
    try {
      ReadingListPageDao.DefaultImpls.updatePages(ReadingListPageDao_Impl.this, pages);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void markPagesForDeletion(final ReadingList list, final List<ReadingListPage> pages,
      final boolean queueForSync) {
    __db.beginTransaction();
    try {
      ReadingListPageDao.DefaultImpls.markPagesForDeletion(ReadingListPageDao_Impl.this, list, pages, queueForSync);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void markPagesForOffline(final List<ReadingListPage> pages, final boolean offline,
      final boolean forcedSave) {
    __db.beginTransaction();
    try {
      ReadingListPageDao.DefaultImpls.markPagesForOffline(ReadingListPageDao_Impl.this, pages, offline, forcedSave);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<String> movePagesToListAndDeleteSourcePages(final ReadingList sourceList,
      final ReadingList destList, final List<PageTitle> titles) {
    __db.beginTransaction();
    try {
      List<String> _result = ReadingListPageDao.DefaultImpls.movePagesToListAndDeleteSourcePages(ReadingListPageDao_Impl.this, sourceList, destList, titles);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void addPageToLists(final List<ReadingList> lists, final ReadingListPage page,
      final boolean queueForSync) {
    __db.beginTransaction();
    try {
      ReadingListPageDao.DefaultImpls.addPageToLists(ReadingListPageDao_Impl.this, lists, page, queueForSync);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateThumbAndDescriptionByName(final String lang, final String displayTitle,
      final String apiTitle, final String thumbUrl, final String description) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateThumbAndDescriptionByName.acquire();
    int _argIndex = 1;
    if (thumbUrl == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, thumbUrl);
    }
    _argIndex = 2;
    if (description == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, description);
    }
    _argIndex = 3;
    if (lang == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, lang);
    }
    _argIndex = 4;
    if (displayTitle == null) {
      _stmt.bindNull(_argIndex);
    } else {
      _stmt.bindString(_argIndex, displayTitle);
    }
    _argIndex = 5;
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
      __preparedStmtOfUpdateThumbAndDescriptionByName.release(_stmt);
    }
  }

  @Override
  public void updateStatus(final long oldStatus, final long newStatus, final boolean offline) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateStatus.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, newStatus);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, oldStatus);
    _argIndex = 3;
    final int _tmp;
    _tmp = offline ? 1 : 0;
    _stmt.bindLong(_argIndex, _tmp);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateStatus.release(_stmt);
    }
  }

  @Override
  public void deletePagesByStatus(final long status) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeletePagesByStatus.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, status);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeletePagesByStatus.release(_stmt);
    }
  }

  @Override
  public void markAllPagesUnsynced() {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfMarkAllPagesUnsynced.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfMarkAllPagesUnsynced.release(_stmt);
    }
  }

  @Override
  public List<ReadingListPage> getAllPages() {
    final String _sql = "SELECT * FROM ReadingListPage";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfThumbUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbUrl");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "listId");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfOffline = CursorUtil.getColumnIndexOrThrow(_cursor, "offline");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfRevId = CursorUtil.getColumnIndexOrThrow(_cursor, "revId");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final List<ReadingListPage> _result = new ArrayList<ReadingListPage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ReadingListPage _item;
        final WikiSite _tmpWiki;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfWiki)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfWiki);
        }
        _tmpWiki = __wikiSiteTypeConverter.stringToWikiSite(_tmp);
        final Namespace _tmpNamespace;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfNamespace);
        }
        _tmpNamespace = __namespaceTypeConverter.intToNamespace(_tmp_1);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpThumbUrl;
        if (_cursor.isNull(_cursorIndexOfThumbUrl)) {
          _tmpThumbUrl = null;
        } else {
          _tmpThumbUrl = _cursor.getString(_cursorIndexOfThumbUrl);
        }
        final long _tmpListId;
        _tmpListId = _cursor.getLong(_cursorIndexOfListId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final boolean _tmpOffline;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOffline);
        _tmpOffline = _tmp_2 != 0;
        final long _tmpStatus;
        _tmpStatus = _cursor.getLong(_cursorIndexOfStatus);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final long _tmpRevId;
        _tmpRevId = _cursor.getLong(_cursorIndexOfRevId);
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _item = new ReadingListPage(_tmpWiki,_tmpNamespace,_tmpDisplayTitle,_tmpApiTitle,_tmpDescription,_tmpThumbUrl,_tmpListId,_tmpId,_tmpMtime,_tmpAtime,_tmpOffline,_tmpStatus,_tmpSizeBytes,_tmpLang,_tmpRevId,_tmpRemoteId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ReadingListPage getPageById(final long id) {
    final String _sql = "SELECT * FROM ReadingListPage WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfThumbUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbUrl");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "listId");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfOffline = CursorUtil.getColumnIndexOrThrow(_cursor, "offline");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfRevId = CursorUtil.getColumnIndexOrThrow(_cursor, "revId");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final ReadingListPage _result;
      if(_cursor.moveToFirst()) {
        final WikiSite _tmpWiki;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfWiki)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfWiki);
        }
        _tmpWiki = __wikiSiteTypeConverter.stringToWikiSite(_tmp);
        final Namespace _tmpNamespace;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfNamespace);
        }
        _tmpNamespace = __namespaceTypeConverter.intToNamespace(_tmp_1);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpThumbUrl;
        if (_cursor.isNull(_cursorIndexOfThumbUrl)) {
          _tmpThumbUrl = null;
        } else {
          _tmpThumbUrl = _cursor.getString(_cursorIndexOfThumbUrl);
        }
        final long _tmpListId;
        _tmpListId = _cursor.getLong(_cursorIndexOfListId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final boolean _tmpOffline;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOffline);
        _tmpOffline = _tmp_2 != 0;
        final long _tmpStatus;
        _tmpStatus = _cursor.getLong(_cursorIndexOfStatus);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final long _tmpRevId;
        _tmpRevId = _cursor.getLong(_cursorIndexOfRevId);
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _result = new ReadingListPage(_tmpWiki,_tmpNamespace,_tmpDisplayTitle,_tmpApiTitle,_tmpDescription,_tmpThumbUrl,_tmpListId,_tmpId,_tmpMtime,_tmpAtime,_tmpOffline,_tmpStatus,_tmpSizeBytes,_tmpLang,_tmpRevId,_tmpRemoteId);
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
  public List<ReadingListPage> getPagesByStatus(final long status, final boolean offline) {
    final String _sql = "SELECT * FROM ReadingListPage WHERE status = ? AND offline = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, status);
    _argIndex = 2;
    final int _tmp;
    _tmp = offline ? 1 : 0;
    _statement.bindLong(_argIndex, _tmp);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfThumbUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbUrl");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "listId");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfOffline = CursorUtil.getColumnIndexOrThrow(_cursor, "offline");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfRevId = CursorUtil.getColumnIndexOrThrow(_cursor, "revId");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final List<ReadingListPage> _result = new ArrayList<ReadingListPage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ReadingListPage _item;
        final WikiSite _tmpWiki;
        final String _tmp_1;
        if (_cursor.isNull(_cursorIndexOfWiki)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getString(_cursorIndexOfWiki);
        }
        _tmpWiki = __wikiSiteTypeConverter.stringToWikiSite(_tmp_1);
        final Namespace _tmpNamespace;
        final Integer _tmp_2;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getInt(_cursorIndexOfNamespace);
        }
        _tmpNamespace = __namespaceTypeConverter.intToNamespace(_tmp_2);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpThumbUrl;
        if (_cursor.isNull(_cursorIndexOfThumbUrl)) {
          _tmpThumbUrl = null;
        } else {
          _tmpThumbUrl = _cursor.getString(_cursorIndexOfThumbUrl);
        }
        final long _tmpListId;
        _tmpListId = _cursor.getLong(_cursorIndexOfListId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final boolean _tmpOffline;
        final int _tmp_3;
        _tmp_3 = _cursor.getInt(_cursorIndexOfOffline);
        _tmpOffline = _tmp_3 != 0;
        final long _tmpStatus;
        _tmpStatus = _cursor.getLong(_cursorIndexOfStatus);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final long _tmpRevId;
        _tmpRevId = _cursor.getLong(_cursorIndexOfRevId);
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _item = new ReadingListPage(_tmpWiki,_tmpNamespace,_tmpDisplayTitle,_tmpApiTitle,_tmpDescription,_tmpThumbUrl,_tmpListId,_tmpId,_tmpMtime,_tmpAtime,_tmpOffline,_tmpStatus,_tmpSizeBytes,_tmpLang,_tmpRevId,_tmpRemoteId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ReadingListPage> getPagesByStatus(final long status) {
    final String _sql = "SELECT * FROM ReadingListPage WHERE status = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, status);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfThumbUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbUrl");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "listId");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfOffline = CursorUtil.getColumnIndexOrThrow(_cursor, "offline");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfRevId = CursorUtil.getColumnIndexOrThrow(_cursor, "revId");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final List<ReadingListPage> _result = new ArrayList<ReadingListPage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ReadingListPage _item;
        final WikiSite _tmpWiki;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfWiki)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfWiki);
        }
        _tmpWiki = __wikiSiteTypeConverter.stringToWikiSite(_tmp);
        final Namespace _tmpNamespace;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfNamespace);
        }
        _tmpNamespace = __namespaceTypeConverter.intToNamespace(_tmp_1);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpThumbUrl;
        if (_cursor.isNull(_cursorIndexOfThumbUrl)) {
          _tmpThumbUrl = null;
        } else {
          _tmpThumbUrl = _cursor.getString(_cursorIndexOfThumbUrl);
        }
        final long _tmpListId;
        _tmpListId = _cursor.getLong(_cursorIndexOfListId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final boolean _tmpOffline;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOffline);
        _tmpOffline = _tmp_2 != 0;
        final long _tmpStatus;
        _tmpStatus = _cursor.getLong(_cursorIndexOfStatus);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final long _tmpRevId;
        _tmpRevId = _cursor.getLong(_cursorIndexOfRevId);
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _item = new ReadingListPage(_tmpWiki,_tmpNamespace,_tmpDisplayTitle,_tmpApiTitle,_tmpDescription,_tmpThumbUrl,_tmpListId,_tmpId,_tmpMtime,_tmpAtime,_tmpOffline,_tmpStatus,_tmpSizeBytes,_tmpLang,_tmpRevId,_tmpRemoteId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ReadingListPage getPageByParams(final WikiSite wiki, final String lang, final Namespace ns,
      final String displayTitle, final String apiTitle, final long listId,
      final long excludedStatus) {
    final String _sql = "SELECT * FROM ReadingListPage WHERE wiki = ? AND lang = ? AND namespace = ? AND displayTitle = ? AND apiTitle = ? AND listId = ? AND status != ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 7);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __wikiSiteTypeConverter.wikiSiteToString(wiki);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 2;
    if (lang == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, lang);
    }
    _argIndex = 3;
    final Integer _tmp_1;
    _tmp_1 = __namespaceTypeConverter.namespaceToInt(ns);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    _argIndex = 4;
    if (displayTitle == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, displayTitle);
    }
    _argIndex = 5;
    if (apiTitle == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, apiTitle);
    }
    _argIndex = 6;
    _statement.bindLong(_argIndex, listId);
    _argIndex = 7;
    _statement.bindLong(_argIndex, excludedStatus);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfThumbUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbUrl");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "listId");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfOffline = CursorUtil.getColumnIndexOrThrow(_cursor, "offline");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfRevId = CursorUtil.getColumnIndexOrThrow(_cursor, "revId");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final ReadingListPage _result;
      if(_cursor.moveToFirst()) {
        final WikiSite _tmpWiki;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfWiki)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfWiki);
        }
        _tmpWiki = __wikiSiteTypeConverter.stringToWikiSite(_tmp_2);
        final Namespace _tmpNamespace;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfNamespace);
        }
        _tmpNamespace = __namespaceTypeConverter.intToNamespace(_tmp_3);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpThumbUrl;
        if (_cursor.isNull(_cursorIndexOfThumbUrl)) {
          _tmpThumbUrl = null;
        } else {
          _tmpThumbUrl = _cursor.getString(_cursorIndexOfThumbUrl);
        }
        final long _tmpListId;
        _tmpListId = _cursor.getLong(_cursorIndexOfListId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final boolean _tmpOffline;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOffline);
        _tmpOffline = _tmp_4 != 0;
        final long _tmpStatus;
        _tmpStatus = _cursor.getLong(_cursorIndexOfStatus);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final long _tmpRevId;
        _tmpRevId = _cursor.getLong(_cursorIndexOfRevId);
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _result = new ReadingListPage(_tmpWiki,_tmpNamespace,_tmpDisplayTitle,_tmpApiTitle,_tmpDescription,_tmpThumbUrl,_tmpListId,_tmpId,_tmpMtime,_tmpAtime,_tmpOffline,_tmpStatus,_tmpSizeBytes,_tmpLang,_tmpRevId,_tmpRemoteId);
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
  public ReadingListPage getPageByParams(final WikiSite wiki, final String lang, final Namespace ns,
      final String displayTitle, final String apiTitle, final long excludedStatus) {
    final String _sql = "SELECT * FROM ReadingListPage WHERE wiki = ? AND lang = ? AND namespace = ? AND displayTitle = ? AND apiTitle = ? AND status != ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 6);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __wikiSiteTypeConverter.wikiSiteToString(wiki);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 2;
    if (lang == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, lang);
    }
    _argIndex = 3;
    final Integer _tmp_1;
    _tmp_1 = __namespaceTypeConverter.namespaceToInt(ns);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    _argIndex = 4;
    if (displayTitle == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, displayTitle);
    }
    _argIndex = 5;
    if (apiTitle == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, apiTitle);
    }
    _argIndex = 6;
    _statement.bindLong(_argIndex, excludedStatus);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfThumbUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbUrl");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "listId");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfOffline = CursorUtil.getColumnIndexOrThrow(_cursor, "offline");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfRevId = CursorUtil.getColumnIndexOrThrow(_cursor, "revId");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final ReadingListPage _result;
      if(_cursor.moveToFirst()) {
        final WikiSite _tmpWiki;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfWiki)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfWiki);
        }
        _tmpWiki = __wikiSiteTypeConverter.stringToWikiSite(_tmp_2);
        final Namespace _tmpNamespace;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfNamespace);
        }
        _tmpNamespace = __namespaceTypeConverter.intToNamespace(_tmp_3);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpThumbUrl;
        if (_cursor.isNull(_cursorIndexOfThumbUrl)) {
          _tmpThumbUrl = null;
        } else {
          _tmpThumbUrl = _cursor.getString(_cursorIndexOfThumbUrl);
        }
        final long _tmpListId;
        _tmpListId = _cursor.getLong(_cursorIndexOfListId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final boolean _tmpOffline;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOffline);
        _tmpOffline = _tmp_4 != 0;
        final long _tmpStatus;
        _tmpStatus = _cursor.getLong(_cursorIndexOfStatus);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final long _tmpRevId;
        _tmpRevId = _cursor.getLong(_cursorIndexOfRevId);
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _result = new ReadingListPage(_tmpWiki,_tmpNamespace,_tmpDisplayTitle,_tmpApiTitle,_tmpDescription,_tmpThumbUrl,_tmpListId,_tmpId,_tmpMtime,_tmpAtime,_tmpOffline,_tmpStatus,_tmpSizeBytes,_tmpLang,_tmpRevId,_tmpRemoteId);
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
  public List<ReadingListPage> getPagesByParams(final WikiSite wiki, final String lang,
      final Namespace ns, final String displayTitle, final String apiTitle,
      final long excludedStatus) {
    final String _sql = "SELECT * FROM ReadingListPage WHERE wiki = ? AND lang = ? AND namespace = ? AND displayTitle = ? AND apiTitle = ? AND status != ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 6);
    int _argIndex = 1;
    final String _tmp;
    _tmp = __wikiSiteTypeConverter.wikiSiteToString(wiki);
    if (_tmp == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, _tmp);
    }
    _argIndex = 2;
    if (lang == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, lang);
    }
    _argIndex = 3;
    final Integer _tmp_1;
    _tmp_1 = __namespaceTypeConverter.namespaceToInt(ns);
    if (_tmp_1 == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindLong(_argIndex, _tmp_1);
    }
    _argIndex = 4;
    if (displayTitle == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, displayTitle);
    }
    _argIndex = 5;
    if (apiTitle == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, apiTitle);
    }
    _argIndex = 6;
    _statement.bindLong(_argIndex, excludedStatus);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfThumbUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbUrl");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "listId");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfOffline = CursorUtil.getColumnIndexOrThrow(_cursor, "offline");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfRevId = CursorUtil.getColumnIndexOrThrow(_cursor, "revId");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final List<ReadingListPage> _result = new ArrayList<ReadingListPage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ReadingListPage _item;
        final WikiSite _tmpWiki;
        final String _tmp_2;
        if (_cursor.isNull(_cursorIndexOfWiki)) {
          _tmp_2 = null;
        } else {
          _tmp_2 = _cursor.getString(_cursorIndexOfWiki);
        }
        _tmpWiki = __wikiSiteTypeConverter.stringToWikiSite(_tmp_2);
        final Namespace _tmpNamespace;
        final Integer _tmp_3;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmp_3 = null;
        } else {
          _tmp_3 = _cursor.getInt(_cursorIndexOfNamespace);
        }
        _tmpNamespace = __namespaceTypeConverter.intToNamespace(_tmp_3);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpThumbUrl;
        if (_cursor.isNull(_cursorIndexOfThumbUrl)) {
          _tmpThumbUrl = null;
        } else {
          _tmpThumbUrl = _cursor.getString(_cursorIndexOfThumbUrl);
        }
        final long _tmpListId;
        _tmpListId = _cursor.getLong(_cursorIndexOfListId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final boolean _tmpOffline;
        final int _tmp_4;
        _tmp_4 = _cursor.getInt(_cursorIndexOfOffline);
        _tmpOffline = _tmp_4 != 0;
        final long _tmpStatus;
        _tmpStatus = _cursor.getLong(_cursorIndexOfStatus);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final long _tmpRevId;
        _tmpRevId = _cursor.getLong(_cursorIndexOfRevId);
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _item = new ReadingListPage(_tmpWiki,_tmpNamespace,_tmpDisplayTitle,_tmpApiTitle,_tmpDescription,_tmpThumbUrl,_tmpListId,_tmpId,_tmpMtime,_tmpAtime,_tmpOffline,_tmpStatus,_tmpSizeBytes,_tmpLang,_tmpRevId,_tmpRemoteId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ReadingListPage> getPagesByListId(final long listId, final long excludedStatus) {
    final String _sql = "SELECT * FROM ReadingListPage WHERE listId = ? AND status != ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, listId);
    _argIndex = 2;
    _statement.bindLong(_argIndex, excludedStatus);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfThumbUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbUrl");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "listId");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfOffline = CursorUtil.getColumnIndexOrThrow(_cursor, "offline");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfRevId = CursorUtil.getColumnIndexOrThrow(_cursor, "revId");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final List<ReadingListPage> _result = new ArrayList<ReadingListPage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ReadingListPage _item;
        final WikiSite _tmpWiki;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfWiki)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfWiki);
        }
        _tmpWiki = __wikiSiteTypeConverter.stringToWikiSite(_tmp);
        final Namespace _tmpNamespace;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfNamespace);
        }
        _tmpNamespace = __namespaceTypeConverter.intToNamespace(_tmp_1);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpThumbUrl;
        if (_cursor.isNull(_cursorIndexOfThumbUrl)) {
          _tmpThumbUrl = null;
        } else {
          _tmpThumbUrl = _cursor.getString(_cursorIndexOfThumbUrl);
        }
        final long _tmpListId;
        _tmpListId = _cursor.getLong(_cursorIndexOfListId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final boolean _tmpOffline;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOffline);
        _tmpOffline = _tmp_2 != 0;
        final long _tmpStatus;
        _tmpStatus = _cursor.getLong(_cursorIndexOfStatus);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final long _tmpRevId;
        _tmpRevId = _cursor.getLong(_cursorIndexOfRevId);
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _item = new ReadingListPage(_tmpWiki,_tmpNamespace,_tmpDisplayTitle,_tmpApiTitle,_tmpDescription,_tmpThumbUrl,_tmpListId,_tmpId,_tmpMtime,_tmpAtime,_tmpOffline,_tmpStatus,_tmpSizeBytes,_tmpLang,_tmpRevId,_tmpRemoteId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public ReadingListPage getRandomPage() {
    final String _sql = "SELECT * FROM ReadingListPage ORDER BY RANDOM() LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfThumbUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbUrl");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "listId");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfOffline = CursorUtil.getColumnIndexOrThrow(_cursor, "offline");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfRevId = CursorUtil.getColumnIndexOrThrow(_cursor, "revId");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final ReadingListPage _result;
      if(_cursor.moveToFirst()) {
        final WikiSite _tmpWiki;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfWiki)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfWiki);
        }
        _tmpWiki = __wikiSiteTypeConverter.stringToWikiSite(_tmp);
        final Namespace _tmpNamespace;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfNamespace);
        }
        _tmpNamespace = __namespaceTypeConverter.intToNamespace(_tmp_1);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpThumbUrl;
        if (_cursor.isNull(_cursorIndexOfThumbUrl)) {
          _tmpThumbUrl = null;
        } else {
          _tmpThumbUrl = _cursor.getString(_cursorIndexOfThumbUrl);
        }
        final long _tmpListId;
        _tmpListId = _cursor.getLong(_cursorIndexOfListId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final boolean _tmpOffline;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOffline);
        _tmpOffline = _tmp_2 != 0;
        final long _tmpStatus;
        _tmpStatus = _cursor.getLong(_cursorIndexOfStatus);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final long _tmpRevId;
        _tmpRevId = _cursor.getLong(_cursorIndexOfRevId);
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _result = new ReadingListPage(_tmpWiki,_tmpNamespace,_tmpDisplayTitle,_tmpApiTitle,_tmpDescription,_tmpThumbUrl,_tmpListId,_tmpId,_tmpMtime,_tmpAtime,_tmpOffline,_tmpStatus,_tmpSizeBytes,_tmpLang,_tmpRevId,_tmpRemoteId);
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
  public List<ReadingListPage> findPageBySearchTerm(final String term) {
    final String _sql = "SELECT * FROM ReadingListPage WHERE UPPER(displayTitle) LIKE UPPER(?) ESCAPE '\\'";
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
      final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfThumbUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbUrl");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "listId");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfOffline = CursorUtil.getColumnIndexOrThrow(_cursor, "offline");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfRevId = CursorUtil.getColumnIndexOrThrow(_cursor, "revId");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final List<ReadingListPage> _result = new ArrayList<ReadingListPage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ReadingListPage _item;
        final WikiSite _tmpWiki;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfWiki)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfWiki);
        }
        _tmpWiki = __wikiSiteTypeConverter.stringToWikiSite(_tmp);
        final Namespace _tmpNamespace;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfNamespace);
        }
        _tmpNamespace = __namespaceTypeConverter.intToNamespace(_tmp_1);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpThumbUrl;
        if (_cursor.isNull(_cursorIndexOfThumbUrl)) {
          _tmpThumbUrl = null;
        } else {
          _tmpThumbUrl = _cursor.getString(_cursorIndexOfThumbUrl);
        }
        final long _tmpListId;
        _tmpListId = _cursor.getLong(_cursorIndexOfListId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final boolean _tmpOffline;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOffline);
        _tmpOffline = _tmp_2 != 0;
        final long _tmpStatus;
        _tmpStatus = _cursor.getLong(_cursorIndexOfStatus);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final long _tmpRevId;
        _tmpRevId = _cursor.getLong(_cursorIndexOfRevId);
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _item = new ReadingListPage(_tmpWiki,_tmpNamespace,_tmpDisplayTitle,_tmpApiTitle,_tmpDescription,_tmpThumbUrl,_tmpListId,_tmpId,_tmpMtime,_tmpAtime,_tmpOffline,_tmpStatus,_tmpSizeBytes,_tmpLang,_tmpRevId,_tmpRemoteId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ReadingListPage> getAllPagesToBeSynced() {
    final String _sql = "SELECT * FROM ReadingListPage WHERE remoteId < 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfDisplayTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "displayTitle");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfThumbUrl = CursorUtil.getColumnIndexOrThrow(_cursor, "thumbUrl");
      final int _cursorIndexOfListId = CursorUtil.getColumnIndexOrThrow(_cursor, "listId");
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfMtime = CursorUtil.getColumnIndexOrThrow(_cursor, "mtime");
      final int _cursorIndexOfAtime = CursorUtil.getColumnIndexOrThrow(_cursor, "atime");
      final int _cursorIndexOfOffline = CursorUtil.getColumnIndexOrThrow(_cursor, "offline");
      final int _cursorIndexOfStatus = CursorUtil.getColumnIndexOrThrow(_cursor, "status");
      final int _cursorIndexOfSizeBytes = CursorUtil.getColumnIndexOrThrow(_cursor, "sizeBytes");
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfRevId = CursorUtil.getColumnIndexOrThrow(_cursor, "revId");
      final int _cursorIndexOfRemoteId = CursorUtil.getColumnIndexOrThrow(_cursor, "remoteId");
      final List<ReadingListPage> _result = new ArrayList<ReadingListPage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final ReadingListPage _item;
        final WikiSite _tmpWiki;
        final String _tmp;
        if (_cursor.isNull(_cursorIndexOfWiki)) {
          _tmp = null;
        } else {
          _tmp = _cursor.getString(_cursorIndexOfWiki);
        }
        _tmpWiki = __wikiSiteTypeConverter.stringToWikiSite(_tmp);
        final Namespace _tmpNamespace;
        final Integer _tmp_1;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmp_1 = null;
        } else {
          _tmp_1 = _cursor.getInt(_cursorIndexOfNamespace);
        }
        _tmpNamespace = __namespaceTypeConverter.intToNamespace(_tmp_1);
        final String _tmpDisplayTitle;
        if (_cursor.isNull(_cursorIndexOfDisplayTitle)) {
          _tmpDisplayTitle = null;
        } else {
          _tmpDisplayTitle = _cursor.getString(_cursorIndexOfDisplayTitle);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpDescription;
        if (_cursor.isNull(_cursorIndexOfDescription)) {
          _tmpDescription = null;
        } else {
          _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        }
        final String _tmpThumbUrl;
        if (_cursor.isNull(_cursorIndexOfThumbUrl)) {
          _tmpThumbUrl = null;
        } else {
          _tmpThumbUrl = _cursor.getString(_cursorIndexOfThumbUrl);
        }
        final long _tmpListId;
        _tmpListId = _cursor.getLong(_cursorIndexOfListId);
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final long _tmpMtime;
        _tmpMtime = _cursor.getLong(_cursorIndexOfMtime);
        final long _tmpAtime;
        _tmpAtime = _cursor.getLong(_cursorIndexOfAtime);
        final boolean _tmpOffline;
        final int _tmp_2;
        _tmp_2 = _cursor.getInt(_cursorIndexOfOffline);
        _tmpOffline = _tmp_2 != 0;
        final long _tmpStatus;
        _tmpStatus = _cursor.getLong(_cursorIndexOfStatus);
        final long _tmpSizeBytes;
        _tmpSizeBytes = _cursor.getLong(_cursorIndexOfSizeBytes);
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final long _tmpRevId;
        _tmpRevId = _cursor.getLong(_cursorIndexOfRevId);
        final long _tmpRemoteId;
        _tmpRemoteId = _cursor.getLong(_cursorIndexOfRemoteId);
        _item = new ReadingListPage(_tmpWiki,_tmpNamespace,_tmpDisplayTitle,_tmpApiTitle,_tmpDescription,_tmpThumbUrl,_tmpListId,_tmpId,_tmpMtime,_tmpAtime,_tmpOffline,_tmpStatus,_tmpSizeBytes,_tmpLang,_tmpRevId,_tmpRemoteId);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public List<ReadingListPage> getAllPagesToBeSaved() {
    return ReadingListPageDao.DefaultImpls.getAllPagesToBeSaved(ReadingListPageDao_Impl.this);
  }

  @Override
  public List<ReadingListPage> getAllPagesToBeForcedSave() {
    return ReadingListPageDao.DefaultImpls.getAllPagesToBeForcedSave(ReadingListPageDao_Impl.this);
  }

  @Override
  public List<ReadingListPage> getAllPagesToBeUnsaved() {
    return ReadingListPageDao.DefaultImpls.getAllPagesToBeUnsaved(ReadingListPageDao_Impl.this);
  }

  @Override
  public List<ReadingListPage> getAllPagesToBeDeleted() {
    return ReadingListPageDao.DefaultImpls.getAllPagesToBeDeleted(ReadingListPageDao_Impl.this);
  }

  @Override
  public void populateListPages(final ReadingList list) {
    ReadingListPageDao.DefaultImpls.populateListPages(ReadingListPageDao_Impl.this, list);
  }

  @Override
  public void addPagesToList(final ReadingList list, final List<ReadingListPage> pages,
      final boolean queueForSync) {
    ReadingListPageDao.DefaultImpls.addPagesToList(ReadingListPageDao_Impl.this, list, pages, queueForSync);
  }

  @Override
  public void updateMetadataByTitle(final ReadingListPage pageProto, final String description,
      final String thumbUrl) {
    ReadingListPageDao.DefaultImpls.updateMetadataByTitle(ReadingListPageDao_Impl.this, pageProto, description, thumbUrl);
  }

  @Override
  public ReadingListPage findPageInAnyList(final PageTitle title) {
    return ReadingListPageDao.DefaultImpls.findPageInAnyList(ReadingListPageDao_Impl.this, title);
  }

  @Override
  public SearchResults findPageForSearchQueryInAnyList(final String searchQuery) {
    return ReadingListPageDao.DefaultImpls.findPageForSearchQueryInAnyList(ReadingListPageDao_Impl.this, searchQuery);
  }

  @Override
  public boolean pageExistsInList(final ReadingList list, final PageTitle title) {
    return ReadingListPageDao.DefaultImpls.pageExistsInList(ReadingListPageDao_Impl.this, list, title);
  }

  @Override
  public void resetUnsavedPageStatus() {
    ReadingListPageDao.DefaultImpls.resetUnsavedPageStatus(ReadingListPageDao_Impl.this);
  }

  @Override
  public void markPageForOffline(final ReadingListPage page, final boolean offline,
      final boolean forcedSave) {
    ReadingListPageDao.DefaultImpls.markPageForOffline(ReadingListPageDao_Impl.this, page, offline, forcedSave);
  }

  @Override
  public void purgeDeletedPages() {
    ReadingListPageDao.DefaultImpls.purgeDeletedPages(ReadingListPageDao_Impl.this);
  }

  @Override
  public ReadingListPage getPageByTitle(final ReadingList list, final PageTitle title) {
    return ReadingListPageDao.DefaultImpls.getPageByTitle(ReadingListPageDao_Impl.this, list, title);
  }

  @Override
  public void addPageToList(final ReadingList list, final PageTitle title,
      final boolean queueForSync) {
    ReadingListPageDao.DefaultImpls.addPageToList(ReadingListPageDao_Impl.this, list, title, queueForSync);
  }

  @Override
  public List<ReadingListPage> getAllPageOccurrences(final PageTitle title) {
    return ReadingListPageDao.DefaultImpls.getAllPageOccurrences(ReadingListPageDao_Impl.this, title);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
