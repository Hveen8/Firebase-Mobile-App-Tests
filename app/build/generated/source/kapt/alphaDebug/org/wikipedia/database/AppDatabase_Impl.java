package org.wikipedia.database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.wikipedia.edit.db.EditSummaryDao;
import org.wikipedia.edit.db.EditSummaryDao_Impl;
import org.wikipedia.history.db.HistoryEntryDao;
import org.wikipedia.history.db.HistoryEntryDao_Impl;
import org.wikipedia.history.db.HistoryEntryWithImageDao;
import org.wikipedia.history.db.HistoryEntryWithImageDao_Impl;
import org.wikipedia.notifications.db.NotificationDao;
import org.wikipedia.notifications.db.NotificationDao_Impl;
import org.wikipedia.offline.db.OfflineObjectDao;
import org.wikipedia.offline.db.OfflineObjectDao_Impl;
import org.wikipedia.pageimages.db.PageImageDao;
import org.wikipedia.pageimages.db.PageImageDao_Impl;
import org.wikipedia.readinglist.db.ReadingListDao;
import org.wikipedia.readinglist.db.ReadingListDao_Impl;
import org.wikipedia.readinglist.db.ReadingListPageDao;
import org.wikipedia.readinglist.db.ReadingListPageDao_Impl;
import org.wikipedia.search.db.RecentSearchDao;
import org.wikipedia.search.db.RecentSearchDao_Impl;
import org.wikipedia.talk.db.TalkPageSeenDao;
import org.wikipedia.talk.db.TalkPageSeenDao_Impl;

@SuppressWarnings({"unchecked", "deprecation"})
public final class AppDatabase_Impl extends AppDatabase {
  private volatile HistoryEntryDao _historyEntryDao;

  private volatile HistoryEntryWithImageDao _historyEntryWithImageDao;

  private volatile PageImageDao _pageImageDao;

  private volatile RecentSearchDao _recentSearchDao;

  private volatile TalkPageSeenDao _talkPageSeenDao;

  private volatile EditSummaryDao _editSummaryDao;

  private volatile OfflineObjectDao _offlineObjectDao;

  private volatile ReadingListDao _readingListDao;

  private volatile ReadingListPageDao _readingListPageDao;

  private volatile NotificationDao _notificationDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(24) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `HistoryEntry` (`authority` TEXT NOT NULL, `lang` TEXT NOT NULL, `apiTitle` TEXT NOT NULL, `displayTitle` TEXT NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `namespace` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `source` INTEGER NOT NULL, `timeSpentSec` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `PageImage` (`lang` TEXT NOT NULL, `namespace` TEXT NOT NULL, `apiTitle` TEXT NOT NULL, `imageName` TEXT, PRIMARY KEY(`lang`, `namespace`, `apiTitle`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `RecentSearch` (`text` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, PRIMARY KEY(`text`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `TalkPageSeen` (`sha` TEXT NOT NULL, PRIMARY KEY(`sha`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `EditSummary` (`summary` TEXT NOT NULL, `lastUsed` INTEGER NOT NULL, PRIMARY KEY(`summary`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `OfflineObject` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `url` TEXT NOT NULL, `lang` TEXT NOT NULL, `path` TEXT NOT NULL, `status` INTEGER NOT NULL, `usedByStr` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ReadingList` (`listTitle` TEXT NOT NULL, `description` TEXT, `mtime` INTEGER NOT NULL, `atime` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `sizeBytes` INTEGER NOT NULL, `dirty` INTEGER NOT NULL, `remoteId` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `ReadingListPage` (`wiki` TEXT NOT NULL, `namespace` INTEGER NOT NULL, `displayTitle` TEXT NOT NULL, `apiTitle` TEXT NOT NULL, `description` TEXT, `thumbUrl` TEXT, `listId` INTEGER NOT NULL, `id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `mtime` INTEGER NOT NULL, `atime` INTEGER NOT NULL, `offline` INTEGER NOT NULL, `status` INTEGER NOT NULL, `sizeBytes` INTEGER NOT NULL, `lang` TEXT NOT NULL, `revId` INTEGER NOT NULL, `remoteId` INTEGER NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Notification` (`id` INTEGER NOT NULL, `wiki` TEXT NOT NULL, `read` TEXT, `category` TEXT NOT NULL, `type` TEXT NOT NULL, `revid` INTEGER NOT NULL, `title` TEXT, `agent` TEXT, `timestamp` TEXT, `contents` TEXT, PRIMARY KEY(`id`, `wiki`))");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '308e1291f52345d4f6a1824ae5c8cd86')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `HistoryEntry`");
        _db.execSQL("DROP TABLE IF EXISTS `PageImage`");
        _db.execSQL("DROP TABLE IF EXISTS `RecentSearch`");
        _db.execSQL("DROP TABLE IF EXISTS `TalkPageSeen`");
        _db.execSQL("DROP TABLE IF EXISTS `EditSummary`");
        _db.execSQL("DROP TABLE IF EXISTS `OfflineObject`");
        _db.execSQL("DROP TABLE IF EXISTS `ReadingList`");
        _db.execSQL("DROP TABLE IF EXISTS `ReadingListPage`");
        _db.execSQL("DROP TABLE IF EXISTS `Notification`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsHistoryEntry = new HashMap<String, TableInfo.Column>(9);
        _columnsHistoryEntry.put("authority", new TableInfo.Column("authority", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntry.put("lang", new TableInfo.Column("lang", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntry.put("apiTitle", new TableInfo.Column("apiTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntry.put("displayTitle", new TableInfo.Column("displayTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntry.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntry.put("namespace", new TableInfo.Column("namespace", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntry.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntry.put("source", new TableInfo.Column("source", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsHistoryEntry.put("timeSpentSec", new TableInfo.Column("timeSpentSec", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHistoryEntry = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHistoryEntry = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHistoryEntry = new TableInfo("HistoryEntry", _columnsHistoryEntry, _foreignKeysHistoryEntry, _indicesHistoryEntry);
        final TableInfo _existingHistoryEntry = TableInfo.read(_db, "HistoryEntry");
        if (! _infoHistoryEntry.equals(_existingHistoryEntry)) {
          return new RoomOpenHelper.ValidationResult(false, "HistoryEntry(org.wikipedia.history.HistoryEntry).\n"
                  + " Expected:\n" + _infoHistoryEntry + "\n"
                  + " Found:\n" + _existingHistoryEntry);
        }
        final HashMap<String, TableInfo.Column> _columnsPageImage = new HashMap<String, TableInfo.Column>(4);
        _columnsPageImage.put("lang", new TableInfo.Column("lang", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPageImage.put("namespace", new TableInfo.Column("namespace", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPageImage.put("apiTitle", new TableInfo.Column("apiTitle", "TEXT", true, 3, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsPageImage.put("imageName", new TableInfo.Column("imageName", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysPageImage = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesPageImage = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoPageImage = new TableInfo("PageImage", _columnsPageImage, _foreignKeysPageImage, _indicesPageImage);
        final TableInfo _existingPageImage = TableInfo.read(_db, "PageImage");
        if (! _infoPageImage.equals(_existingPageImage)) {
          return new RoomOpenHelper.ValidationResult(false, "PageImage(org.wikipedia.pageimages.db.PageImage).\n"
                  + " Expected:\n" + _infoPageImage + "\n"
                  + " Found:\n" + _existingPageImage);
        }
        final HashMap<String, TableInfo.Column> _columnsRecentSearch = new HashMap<String, TableInfo.Column>(2);
        _columnsRecentSearch.put("text", new TableInfo.Column("text", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsRecentSearch.put("timestamp", new TableInfo.Column("timestamp", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysRecentSearch = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesRecentSearch = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoRecentSearch = new TableInfo("RecentSearch", _columnsRecentSearch, _foreignKeysRecentSearch, _indicesRecentSearch);
        final TableInfo _existingRecentSearch = TableInfo.read(_db, "RecentSearch");
        if (! _infoRecentSearch.equals(_existingRecentSearch)) {
          return new RoomOpenHelper.ValidationResult(false, "RecentSearch(org.wikipedia.search.db.RecentSearch).\n"
                  + " Expected:\n" + _infoRecentSearch + "\n"
                  + " Found:\n" + _existingRecentSearch);
        }
        final HashMap<String, TableInfo.Column> _columnsTalkPageSeen = new HashMap<String, TableInfo.Column>(1);
        _columnsTalkPageSeen.put("sha", new TableInfo.Column("sha", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysTalkPageSeen = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesTalkPageSeen = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoTalkPageSeen = new TableInfo("TalkPageSeen", _columnsTalkPageSeen, _foreignKeysTalkPageSeen, _indicesTalkPageSeen);
        final TableInfo _existingTalkPageSeen = TableInfo.read(_db, "TalkPageSeen");
        if (! _infoTalkPageSeen.equals(_existingTalkPageSeen)) {
          return new RoomOpenHelper.ValidationResult(false, "TalkPageSeen(org.wikipedia.talk.db.TalkPageSeen).\n"
                  + " Expected:\n" + _infoTalkPageSeen + "\n"
                  + " Found:\n" + _existingTalkPageSeen);
        }
        final HashMap<String, TableInfo.Column> _columnsEditSummary = new HashMap<String, TableInfo.Column>(2);
        _columnsEditSummary.put("summary", new TableInfo.Column("summary", "TEXT", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsEditSummary.put("lastUsed", new TableInfo.Column("lastUsed", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysEditSummary = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesEditSummary = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoEditSummary = new TableInfo("EditSummary", _columnsEditSummary, _foreignKeysEditSummary, _indicesEditSummary);
        final TableInfo _existingEditSummary = TableInfo.read(_db, "EditSummary");
        if (! _infoEditSummary.equals(_existingEditSummary)) {
          return new RoomOpenHelper.ValidationResult(false, "EditSummary(org.wikipedia.edit.db.EditSummary).\n"
                  + " Expected:\n" + _infoEditSummary + "\n"
                  + " Found:\n" + _existingEditSummary);
        }
        final HashMap<String, TableInfo.Column> _columnsOfflineObject = new HashMap<String, TableInfo.Column>(6);
        _columnsOfflineObject.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOfflineObject.put("url", new TableInfo.Column("url", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOfflineObject.put("lang", new TableInfo.Column("lang", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOfflineObject.put("path", new TableInfo.Column("path", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOfflineObject.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsOfflineObject.put("usedByStr", new TableInfo.Column("usedByStr", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysOfflineObject = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesOfflineObject = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoOfflineObject = new TableInfo("OfflineObject", _columnsOfflineObject, _foreignKeysOfflineObject, _indicesOfflineObject);
        final TableInfo _existingOfflineObject = TableInfo.read(_db, "OfflineObject");
        if (! _infoOfflineObject.equals(_existingOfflineObject)) {
          return new RoomOpenHelper.ValidationResult(false, "OfflineObject(org.wikipedia.offline.db.OfflineObject).\n"
                  + " Expected:\n" + _infoOfflineObject + "\n"
                  + " Found:\n" + _existingOfflineObject);
        }
        final HashMap<String, TableInfo.Column> _columnsReadingList = new HashMap<String, TableInfo.Column>(8);
        _columnsReadingList.put("listTitle", new TableInfo.Column("listTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingList.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingList.put("mtime", new TableInfo.Column("mtime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingList.put("atime", new TableInfo.Column("atime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingList.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingList.put("sizeBytes", new TableInfo.Column("sizeBytes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingList.put("dirty", new TableInfo.Column("dirty", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingList.put("remoteId", new TableInfo.Column("remoteId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysReadingList = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesReadingList = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoReadingList = new TableInfo("ReadingList", _columnsReadingList, _foreignKeysReadingList, _indicesReadingList);
        final TableInfo _existingReadingList = TableInfo.read(_db, "ReadingList");
        if (! _infoReadingList.equals(_existingReadingList)) {
          return new RoomOpenHelper.ValidationResult(false, "ReadingList(org.wikipedia.readinglist.database.ReadingList).\n"
                  + " Expected:\n" + _infoReadingList + "\n"
                  + " Found:\n" + _existingReadingList);
        }
        final HashMap<String, TableInfo.Column> _columnsReadingListPage = new HashMap<String, TableInfo.Column>(16);
        _columnsReadingListPage.put("wiki", new TableInfo.Column("wiki", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("namespace", new TableInfo.Column("namespace", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("displayTitle", new TableInfo.Column("displayTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("apiTitle", new TableInfo.Column("apiTitle", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("description", new TableInfo.Column("description", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("thumbUrl", new TableInfo.Column("thumbUrl", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("listId", new TableInfo.Column("listId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("mtime", new TableInfo.Column("mtime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("atime", new TableInfo.Column("atime", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("offline", new TableInfo.Column("offline", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("status", new TableInfo.Column("status", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("sizeBytes", new TableInfo.Column("sizeBytes", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("lang", new TableInfo.Column("lang", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("revId", new TableInfo.Column("revId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsReadingListPage.put("remoteId", new TableInfo.Column("remoteId", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysReadingListPage = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesReadingListPage = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoReadingListPage = new TableInfo("ReadingListPage", _columnsReadingListPage, _foreignKeysReadingListPage, _indicesReadingListPage);
        final TableInfo _existingReadingListPage = TableInfo.read(_db, "ReadingListPage");
        if (! _infoReadingListPage.equals(_existingReadingListPage)) {
          return new RoomOpenHelper.ValidationResult(false, "ReadingListPage(org.wikipedia.readinglist.database.ReadingListPage).\n"
                  + " Expected:\n" + _infoReadingListPage + "\n"
                  + " Found:\n" + _existingReadingListPage);
        }
        final HashMap<String, TableInfo.Column> _columnsNotification = new HashMap<String, TableInfo.Column>(10);
        _columnsNotification.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("wiki", new TableInfo.Column("wiki", "TEXT", true, 2, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("read", new TableInfo.Column("read", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("category", new TableInfo.Column("category", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("type", new TableInfo.Column("type", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("revid", new TableInfo.Column("revid", "INTEGER", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("title", new TableInfo.Column("title", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("agent", new TableInfo.Column("agent", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("timestamp", new TableInfo.Column("timestamp", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsNotification.put("contents", new TableInfo.Column("contents", "TEXT", false, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysNotification = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesNotification = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoNotification = new TableInfo("Notification", _columnsNotification, _foreignKeysNotification, _indicesNotification);
        final TableInfo _existingNotification = TableInfo.read(_db, "Notification");
        if (! _infoNotification.equals(_existingNotification)) {
          return new RoomOpenHelper.ValidationResult(false, "Notification(org.wikipedia.notifications.db.Notification).\n"
                  + " Expected:\n" + _infoNotification + "\n"
                  + " Found:\n" + _existingNotification);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "308e1291f52345d4f6a1824ae5c8cd86", "08a076a007a3db395c7197ddda6580d6");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "HistoryEntry","PageImage","RecentSearch","TalkPageSeen","EditSummary","OfflineObject","ReadingList","ReadingListPage","Notification");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `HistoryEntry`");
      _db.execSQL("DELETE FROM `PageImage`");
      _db.execSQL("DELETE FROM `RecentSearch`");
      _db.execSQL("DELETE FROM `TalkPageSeen`");
      _db.execSQL("DELETE FROM `EditSummary`");
      _db.execSQL("DELETE FROM `OfflineObject`");
      _db.execSQL("DELETE FROM `ReadingList`");
      _db.execSQL("DELETE FROM `ReadingListPage`");
      _db.execSQL("DELETE FROM `Notification`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(HistoryEntryDao.class, HistoryEntryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(HistoryEntryWithImageDao.class, HistoryEntryWithImageDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(PageImageDao.class, PageImageDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(RecentSearchDao.class, RecentSearchDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(TalkPageSeenDao.class, TalkPageSeenDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(EditSummaryDao.class, EditSummaryDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(OfflineObjectDao.class, OfflineObjectDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ReadingListDao.class, ReadingListDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(ReadingListPageDao.class, ReadingListPageDao_Impl.getRequiredConverters());
    _typeConvertersMap.put(NotificationDao.class, NotificationDao_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public HistoryEntryDao historyEntryDao() {
    if (_historyEntryDao != null) {
      return _historyEntryDao;
    } else {
      synchronized(this) {
        if(_historyEntryDao == null) {
          _historyEntryDao = new HistoryEntryDao_Impl(this);
        }
        return _historyEntryDao;
      }
    }
  }

  @Override
  public HistoryEntryWithImageDao historyEntryWithImageDao() {
    if (_historyEntryWithImageDao != null) {
      return _historyEntryWithImageDao;
    } else {
      synchronized(this) {
        if(_historyEntryWithImageDao == null) {
          _historyEntryWithImageDao = new HistoryEntryWithImageDao_Impl(this);
        }
        return _historyEntryWithImageDao;
      }
    }
  }

  @Override
  public PageImageDao pageImagesDao() {
    if (_pageImageDao != null) {
      return _pageImageDao;
    } else {
      synchronized(this) {
        if(_pageImageDao == null) {
          _pageImageDao = new PageImageDao_Impl(this);
        }
        return _pageImageDao;
      }
    }
  }

  @Override
  public RecentSearchDao recentSearchDao() {
    if (_recentSearchDao != null) {
      return _recentSearchDao;
    } else {
      synchronized(this) {
        if(_recentSearchDao == null) {
          _recentSearchDao = new RecentSearchDao_Impl(this);
        }
        return _recentSearchDao;
      }
    }
  }

  @Override
  public TalkPageSeenDao talkPageSeenDao() {
    if (_talkPageSeenDao != null) {
      return _talkPageSeenDao;
    } else {
      synchronized(this) {
        if(_talkPageSeenDao == null) {
          _talkPageSeenDao = new TalkPageSeenDao_Impl(this);
        }
        return _talkPageSeenDao;
      }
    }
  }

  @Override
  public EditSummaryDao editSummaryDao() {
    if (_editSummaryDao != null) {
      return _editSummaryDao;
    } else {
      synchronized(this) {
        if(_editSummaryDao == null) {
          _editSummaryDao = new EditSummaryDao_Impl(this);
        }
        return _editSummaryDao;
      }
    }
  }

  @Override
  public OfflineObjectDao offlineObjectDao() {
    if (_offlineObjectDao != null) {
      return _offlineObjectDao;
    } else {
      synchronized(this) {
        if(_offlineObjectDao == null) {
          _offlineObjectDao = new OfflineObjectDao_Impl(this);
        }
        return _offlineObjectDao;
      }
    }
  }

  @Override
  public ReadingListDao readingListDao() {
    if (_readingListDao != null) {
      return _readingListDao;
    } else {
      synchronized(this) {
        if(_readingListDao == null) {
          _readingListDao = new ReadingListDao_Impl(this);
        }
        return _readingListDao;
      }
    }
  }

  @Override
  public ReadingListPageDao readingListPageDao() {
    if (_readingListPageDao != null) {
      return _readingListPageDao;
    } else {
      synchronized(this) {
        if(_readingListPageDao == null) {
          _readingListPageDao = new ReadingListPageDao_Impl(this);
        }
        return _readingListPageDao;
      }
    }
  }

  @Override
  public NotificationDao notificationDao() {
    if (_notificationDao != null) {
      return _notificationDao;
    } else {
      synchronized(this) {
        if(_notificationDao == null) {
          _notificationDao = new NotificationDao_Impl(this);
        }
        return _notificationDao;
      }
    }
  }
}
