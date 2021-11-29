package org.wikipedia.notifications.db;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.flow.Flow;
import org.wikipedia.database.NotificationTypeConverters;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NotificationDao_Impl implements NotificationDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Notification> __insertionAdapterOfNotification;

  private final NotificationTypeConverters __notificationTypeConverters = new NotificationTypeConverters();

  private final EntityDeletionOrUpdateAdapter<Notification> __deletionAdapterOfNotification;

  private final EntityDeletionOrUpdateAdapter<Notification> __updateAdapterOfNotification;

  public NotificationDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfNotification = new EntityInsertionAdapter<Notification>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `Notification` (`id`,`wiki`,`read`,`category`,`type`,`revid`,`title`,`agent`,`timestamp`,`contents`) VALUES (?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Notification value) {
        stmt.bindLong(1, value.getId());
        if (value.getWiki() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getWiki());
        }
        if (value.getRead() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRead());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCategory());
        }
        if (value.getType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getType());
        }
        stmt.bindLong(6, value.getRevid());
        final String _tmp;
        _tmp = __notificationTypeConverters.titleToString(value.getTitle());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __notificationTypeConverters.agentToString(value.getAgent());
        if (_tmp_1 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __notificationTypeConverters.timestampToString(value.getTimestamp());
        if (_tmp_2 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = __notificationTypeConverters.contentsToString(value.getContents());
        if (_tmp_3 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_3);
        }
      }
    };
    this.__deletionAdapterOfNotification = new EntityDeletionOrUpdateAdapter<Notification>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Notification` WHERE `id` = ? AND `wiki` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Notification value) {
        stmt.bindLong(1, value.getId());
        if (value.getWiki() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getWiki());
        }
      }
    };
    this.__updateAdapterOfNotification = new EntityDeletionOrUpdateAdapter<Notification>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `Notification` SET `id` = ?,`wiki` = ?,`read` = ?,`category` = ?,`type` = ?,`revid` = ?,`title` = ?,`agent` = ?,`timestamp` = ?,`contents` = ? WHERE `id` = ? AND `wiki` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Notification value) {
        stmt.bindLong(1, value.getId());
        if (value.getWiki() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getWiki());
        }
        if (value.getRead() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getRead());
        }
        if (value.getCategory() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getCategory());
        }
        if (value.getType() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getType());
        }
        stmt.bindLong(6, value.getRevid());
        final String _tmp;
        _tmp = __notificationTypeConverters.titleToString(value.getTitle());
        if (_tmp == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __notificationTypeConverters.agentToString(value.getAgent());
        if (_tmp_1 == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __notificationTypeConverters.timestampToString(value.getTimestamp());
        if (_tmp_2 == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp_2);
        }
        final String _tmp_3;
        _tmp_3 = __notificationTypeConverters.contentsToString(value.getContents());
        if (_tmp_3 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_3);
        }
        stmt.bindLong(11, value.getId());
        if (value.getWiki() == null) {
          stmt.bindNull(12);
        } else {
          stmt.bindString(12, value.getWiki());
        }
      }
    };
  }

  @Override
  public void insertNotifications(final List<Notification> notifications) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfNotification.insert(notifications);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteNotification(final Notification notification) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfNotification.handle(notification);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateNotification(final Notification notification) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfNotification.handle(notification);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public Flow<List<Notification>> getAllNotifications() {
    final String _sql = "SELECT * FROM Notification";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Notification"}, new Callable<List<Notification>>() {
      @Override
      public List<Notification> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
          final int _cursorIndexOfRead = CursorUtil.getColumnIndexOrThrow(_cursor, "read");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfRevid = CursorUtil.getColumnIndexOrThrow(_cursor, "revid");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "agent");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfContents = CursorUtil.getColumnIndexOrThrow(_cursor, "contents");
          final List<Notification> _result = new ArrayList<Notification>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Notification _item;
            _item = new Notification();
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item.setId(_tmpId);
            final String _tmpWiki;
            if (_cursor.isNull(_cursorIndexOfWiki)) {
              _tmpWiki = null;
            } else {
              _tmpWiki = _cursor.getString(_cursorIndexOfWiki);
            }
            _item.setWiki(_tmpWiki);
            final String _tmpRead;
            if (_cursor.isNull(_cursorIndexOfRead)) {
              _tmpRead = null;
            } else {
              _tmpRead = _cursor.getString(_cursorIndexOfRead);
            }
            _item.setRead(_tmpRead);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            _item.setCategory(_tmpCategory);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _item.setType(_tmpType);
            final long _tmpRevid;
            _tmpRevid = _cursor.getLong(_cursorIndexOfRevid);
            _item.setRevid(_tmpRevid);
            final Notification.Title _tmpTitle;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfTitle);
            }
            _tmpTitle = __notificationTypeConverters.stringToTitle(_tmp);
            _item.setTitle(_tmpTitle);
            final Notification.Agent _tmpAgent;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfAgent)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfAgent);
            }
            _tmpAgent = __notificationTypeConverters.stringToAgent(_tmp_1);
            _item.setAgent(_tmpAgent);
            final Notification.Timestamp _tmpTimestamp;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfTimestamp);
            }
            _tmpTimestamp = __notificationTypeConverters.stringToTimestamp(_tmp_2);
            _item.setTimestamp(_tmpTimestamp);
            final Notification.Contents _tmpContents;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfContents)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfContents);
            }
            _tmpContents = __notificationTypeConverters.stringToContents(_tmp_3);
            _item.setContents(_tmpContents);
            _result.add(_item);
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
  public Flow<List<Notification>> getNotificationsByWiki(final List<String> wiki) {
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("SELECT * FROM Notification WHERE `wiki` IN (");
    final int _inputSize = wiki.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final int _argCount = 0 + _inputSize;
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, _argCount);
    int _argIndex = 1;
    for (String _item : wiki) {
      if (_item == null) {
        _statement.bindNull(_argIndex);
      } else {
        _statement.bindString(_argIndex, _item);
      }
      _argIndex ++;
    }
    return CoroutinesRoom.createFlow(__db, false, new String[]{"Notification"}, new Callable<List<Notification>>() {
      @Override
      public List<Notification> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfWiki = CursorUtil.getColumnIndexOrThrow(_cursor, "wiki");
          final int _cursorIndexOfRead = CursorUtil.getColumnIndexOrThrow(_cursor, "read");
          final int _cursorIndexOfCategory = CursorUtil.getColumnIndexOrThrow(_cursor, "category");
          final int _cursorIndexOfType = CursorUtil.getColumnIndexOrThrow(_cursor, "type");
          final int _cursorIndexOfRevid = CursorUtil.getColumnIndexOrThrow(_cursor, "revid");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfAgent = CursorUtil.getColumnIndexOrThrow(_cursor, "agent");
          final int _cursorIndexOfTimestamp = CursorUtil.getColumnIndexOrThrow(_cursor, "timestamp");
          final int _cursorIndexOfContents = CursorUtil.getColumnIndexOrThrow(_cursor, "contents");
          final List<Notification> _result = new ArrayList<Notification>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Notification _item_1;
            _item_1 = new Notification();
            final long _tmpId;
            _tmpId = _cursor.getLong(_cursorIndexOfId);
            _item_1.setId(_tmpId);
            final String _tmpWiki;
            if (_cursor.isNull(_cursorIndexOfWiki)) {
              _tmpWiki = null;
            } else {
              _tmpWiki = _cursor.getString(_cursorIndexOfWiki);
            }
            _item_1.setWiki(_tmpWiki);
            final String _tmpRead;
            if (_cursor.isNull(_cursorIndexOfRead)) {
              _tmpRead = null;
            } else {
              _tmpRead = _cursor.getString(_cursorIndexOfRead);
            }
            _item_1.setRead(_tmpRead);
            final String _tmpCategory;
            if (_cursor.isNull(_cursorIndexOfCategory)) {
              _tmpCategory = null;
            } else {
              _tmpCategory = _cursor.getString(_cursorIndexOfCategory);
            }
            _item_1.setCategory(_tmpCategory);
            final String _tmpType;
            if (_cursor.isNull(_cursorIndexOfType)) {
              _tmpType = null;
            } else {
              _tmpType = _cursor.getString(_cursorIndexOfType);
            }
            _item_1.setType(_tmpType);
            final long _tmpRevid;
            _tmpRevid = _cursor.getLong(_cursorIndexOfRevid);
            _item_1.setRevid(_tmpRevid);
            final Notification.Title _tmpTitle;
            final String _tmp;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmp = null;
            } else {
              _tmp = _cursor.getString(_cursorIndexOfTitle);
            }
            _tmpTitle = __notificationTypeConverters.stringToTitle(_tmp);
            _item_1.setTitle(_tmpTitle);
            final Notification.Agent _tmpAgent;
            final String _tmp_1;
            if (_cursor.isNull(_cursorIndexOfAgent)) {
              _tmp_1 = null;
            } else {
              _tmp_1 = _cursor.getString(_cursorIndexOfAgent);
            }
            _tmpAgent = __notificationTypeConverters.stringToAgent(_tmp_1);
            _item_1.setAgent(_tmpAgent);
            final Notification.Timestamp _tmpTimestamp;
            final String _tmp_2;
            if (_cursor.isNull(_cursorIndexOfTimestamp)) {
              _tmp_2 = null;
            } else {
              _tmp_2 = _cursor.getString(_cursorIndexOfTimestamp);
            }
            _tmpTimestamp = __notificationTypeConverters.stringToTimestamp(_tmp_2);
            _item_1.setTimestamp(_tmpTimestamp);
            final Notification.Contents _tmpContents;
            final String _tmp_3;
            if (_cursor.isNull(_cursorIndexOfContents)) {
              _tmp_3 = null;
            } else {
              _tmp_3 = _cursor.getString(_cursorIndexOfContents);
            }
            _tmpContents = __notificationTypeConverters.stringToContents(_tmp_3);
            _item_1.setContents(_tmpContents);
            _result.add(_item_1);
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
