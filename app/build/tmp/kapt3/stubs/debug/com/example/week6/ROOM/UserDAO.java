package com.example.week6.ROOM;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\'J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\'J\'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0013\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0005H\'\u00a8\u0006\u0017"}, d2 = {"Lcom/example/week6/ROOM/UserDAO;", "", "delete", "", "todo", "Lcom/example/week6/ROOM/User;", "deleteAllUser", "findById", "id", "", "findByName", "name", "", "getAll", "", "insert", "", "obj", "insertAll", "", "([Lcom/example/week6/ROOM/User;)Ljava/util/List;", "update", "Task", "app_debug"})
public abstract interface UserDAO {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM User")
    public abstract java.util.List<com.example.week6.ROOM.User> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT *FROM User WHERE name LIKE :name")
    public abstract com.example.week6.ROOM.User findByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM task WHERE id =:id")
    public abstract com.example.week6.ROOM.User findById(int id);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Insert()
    public abstract java.util.List<java.lang.Long> insertAll(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.User... todo);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.IGNORE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.User obj);
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.User todo);
    
    @android.arch.persistence.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.User Task);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM User")
    public abstract void deleteAllUser();
}