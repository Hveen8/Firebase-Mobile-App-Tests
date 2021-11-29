package org.wikipedia.pageimages.db;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
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
public final class PageImageDao_Impl implements PageImageDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<PageImage> __insertionAdapterOfPageImage;

  public PageImageDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfPageImage = new EntityInsertionAdapter<PageImage>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `PageImage` (`lang`,`namespace`,`apiTitle`,`imageName`) VALUES (?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, PageImage value) {
        if (value.getLang() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getLang());
        }
        if (value.getNamespace() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNamespace());
        }
        if (value.getApiTitle() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getApiTitle());
        }
        if (value.getImageName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getImageName());
        }
      }
    };
  }

  @Override
  public void insertPageImage(final PageImage pageImage) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfPageImage.insert(pageImage);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<PageImage> getAllPageImages() {
    final String _sql = "SELECT * FROM PageImage";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfLang = CursorUtil.getColumnIndexOrThrow(_cursor, "lang");
      final int _cursorIndexOfNamespace = CursorUtil.getColumnIndexOrThrow(_cursor, "namespace");
      final int _cursorIndexOfApiTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "apiTitle");
      final int _cursorIndexOfImageName = CursorUtil.getColumnIndexOrThrow(_cursor, "imageName");
      final List<PageImage> _result = new ArrayList<PageImage>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final PageImage _item;
        final String _tmpLang;
        if (_cursor.isNull(_cursorIndexOfLang)) {
          _tmpLang = null;
        } else {
          _tmpLang = _cursor.getString(_cursorIndexOfLang);
        }
        final String _tmpNamespace;
        if (_cursor.isNull(_cursorIndexOfNamespace)) {
          _tmpNamespace = null;
        } else {
          _tmpNamespace = _cursor.getString(_cursorIndexOfNamespace);
        }
        final String _tmpApiTitle;
        if (_cursor.isNull(_cursorIndexOfApiTitle)) {
          _tmpApiTitle = null;
        } else {
          _tmpApiTitle = _cursor.getString(_cursorIndexOfApiTitle);
        }
        final String _tmpImageName;
        if (_cursor.isNull(_cursorIndexOfImageName)) {
          _tmpImageName = null;
        } else {
          _tmpImageName = _cursor.getString(_cursorIndexOfImageName);
        }
        _item = new PageImage(_tmpLang,_tmpNamespace,_tmpApiTitle,_tmpImageName);
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
