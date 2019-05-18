package com.example.week6.ROOM;

import android.arch.persistence.db.SupportSQLiteStatement;
import android.arch.persistence.room.EntityDeletionOrUpdateAdapter;
import android.arch.persistence.room.EntityInsertionAdapter;
import android.arch.persistence.room.RoomDatabase;
import android.arch.persistence.room.RoomSQLiteQuery;
import android.arch.persistence.room.SharedSQLiteStatement;
import android.database.Cursor;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unchecked")
public class TaskDAO_Impl implements TaskDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfTask;

  private final EntityInsertionAdapter __insertionAdapterOfTask_1;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfTask;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfTask;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAllTask;

  public TaskDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfTask = new EntityInsertionAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `task`(`id`,`description`,`completed`,`user_uid`,`username`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        final int _tmp;
        _tmp = value.getCompleted() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getUser_uid() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getUser_uid());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUsername());
        }
      }
    };
    this.__insertionAdapterOfTask_1 = new EntityInsertionAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `task`(`id`,`description`,`completed`,`user_uid`,`username`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        final int _tmp;
        _tmp = value.getCompleted() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getUser_uid() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getUser_uid());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUsername());
        }
      }
    };
    this.__deletionAdapterOfTask = new EntityDeletionOrUpdateAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `task` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
    this.__updateAdapterOfTask = new EntityDeletionOrUpdateAdapter<Task>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `task` SET `id` = ?,`description` = ?,`completed` = ?,`user_uid` = ?,`username` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Task value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getDescription());
        }
        final int _tmp;
        _tmp = value.getCompleted() ? 1 : 0;
        stmt.bindLong(3, _tmp);
        if (value.getUser_uid() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindLong(4, value.getUser_uid());
        }
        if (value.getUsername() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUsername());
        }
        if (value.getId() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindLong(6, value.getId());
        }
      }
    };
    this.__preparedStmtOfDeleteAllTask = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM task";
        return _query;
      }
    };
  }

  @Override
  public List<Long> insertAll(Task... todo) {
    __db.beginTransaction();
    try {
      List<Long> _result = __insertionAdapterOfTask.insertAndReturnIdsList(todo);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public long insert(Task obj) {
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfTask_1.insertAndReturnId(obj);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void delete(Task toto) {
    __db.beginTransaction();
    try {
      __deletionAdapterOfTask.handle(toto);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(Task task) {
    __db.beginTransaction();
    try {
      __updateAdapterOfTask.handle(task);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteAllTask() {
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAllTask.acquire();
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteAllTask.release(_stmt);
    }
  }

  @Override
  public List<Task> getAll() {
    final String _sql = "SELECT * FROM task";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfCompleted = _cursor.getColumnIndexOrThrow("completed");
      final int _cursorIndexOfUserUid = _cursor.getColumnIndexOrThrow("user_uid");
      final int _cursorIndexOfUsername = _cursor.getColumnIndexOrThrow("username");
      final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Task _item;
        _item = new Task();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item.setDescription(_tmpDescription);
        final boolean _tmpCompleted;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCompleted);
        _tmpCompleted = _tmp != 0;
        _item.setCompleted(_tmpCompleted);
        final Integer _tmpUser_uid;
        if (_cursor.isNull(_cursorIndexOfUserUid)) {
          _tmpUser_uid = null;
        } else {
          _tmpUser_uid = _cursor.getInt(_cursorIndexOfUserUid);
        }
        _item.setUser_uid(_tmpUser_uid);
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        _item.setUsername(_tmpUsername);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public Task findById(int id) {
    final String _sql = "SELECT * FROM task WHERE id=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfCompleted = _cursor.getColumnIndexOrThrow("completed");
      final int _cursorIndexOfUserUid = _cursor.getColumnIndexOrThrow("user_uid");
      final int _cursorIndexOfUsername = _cursor.getColumnIndexOrThrow("username");
      final Task _result;
      if(_cursor.moveToFirst()) {
        _result = new Task();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _result.setDescription(_tmpDescription);
        final boolean _tmpCompleted;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCompleted);
        _tmpCompleted = _tmp != 0;
        _result.setCompleted(_tmpCompleted);
        final Integer _tmpUser_uid;
        if (_cursor.isNull(_cursorIndexOfUserUid)) {
          _tmpUser_uid = null;
        } else {
          _tmpUser_uid = _cursor.getInt(_cursorIndexOfUserUid);
        }
        _result.setUser_uid(_tmpUser_uid);
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        _result.setUsername(_tmpUsername);
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
  public Task findByDecription(String description) {
    final String _sql = "SELECT * FROM task WHERE description=?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    if (description == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, description);
    }
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfCompleted = _cursor.getColumnIndexOrThrow("completed");
      final int _cursorIndexOfUserUid = _cursor.getColumnIndexOrThrow("user_uid");
      final int _cursorIndexOfUsername = _cursor.getColumnIndexOrThrow("username");
      final Task _result;
      if(_cursor.moveToFirst()) {
        _result = new Task();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _result.setId(_tmpId);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _result.setDescription(_tmpDescription);
        final boolean _tmpCompleted;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCompleted);
        _tmpCompleted = _tmp != 0;
        _result.setCompleted(_tmpCompleted);
        final Integer _tmpUser_uid;
        if (_cursor.isNull(_cursorIndexOfUserUid)) {
          _tmpUser_uid = null;
        } else {
          _tmpUser_uid = _cursor.getInt(_cursorIndexOfUserUid);
        }
        _result.setUser_uid(_tmpUser_uid);
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        _result.setUsername(_tmpUsername);
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
  public List<Task> finByCompleted() {
    final String _sql = "SELECT * FROM task WHERE task.completed LIKE '1'";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final Cursor _cursor = __db.query(_statement);
    try {
      final int _cursorIndexOfId = _cursor.getColumnIndexOrThrow("id");
      final int _cursorIndexOfDescription = _cursor.getColumnIndexOrThrow("description");
      final int _cursorIndexOfCompleted = _cursor.getColumnIndexOrThrow("completed");
      final int _cursorIndexOfUserUid = _cursor.getColumnIndexOrThrow("user_uid");
      final int _cursorIndexOfUsername = _cursor.getColumnIndexOrThrow("username");
      final List<Task> _result = new ArrayList<Task>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Task _item;
        _item = new Task();
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        _item.setId(_tmpId);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        _item.setDescription(_tmpDescription);
        final boolean _tmpCompleted;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfCompleted);
        _tmpCompleted = _tmp != 0;
        _item.setCompleted(_tmpCompleted);
        final Integer _tmpUser_uid;
        if (_cursor.isNull(_cursorIndexOfUserUid)) {
          _tmpUser_uid = null;
        } else {
          _tmpUser_uid = _cursor.getInt(_cursorIndexOfUserUid);
        }
        _item.setUser_uid(_tmpUser_uid);
        final String _tmpUsername;
        _tmpUsername = _cursor.getString(_cursorIndexOfUsername);
        _item.setUsername(_tmpUsername);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
