package com.example.week6.ROOM;

import java.lang.System;

@android.arch.persistence.room.Dao()
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eH\'J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0005H\'J\'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\b2\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0015\"\u00020\u0005H\'\u00a2\u0006\u0002\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u0005H\'\u00a8\u0006\u0019"}, d2 = {"Lcom/example/week6/ROOM/TaskDAO;", "", "delete", "", "toto", "Lcom/example/week6/ROOM/Task;", "deleteAllTask", "finByCompleted", "", "findByDecription", "description", "", "findById", "id", "", "getAll", "insert", "", "obj", "insertAll", "todo", "", "([Lcom/example/week6/ROOM/Task;)Ljava/util/List;", "update", "task", "app_debug"})
public abstract interface TaskDAO {
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM task")
    public abstract java.util.List<com.example.week6.ROOM.Task> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM task WHERE id=:id")
    public abstract com.example.week6.ROOM.Task findById(int id);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM task WHERE description=:description")
    public abstract com.example.week6.ROOM.Task findByDecription(@org.jetbrains.annotations.NotNull()
    java.lang.String description);
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Query(value = "SELECT * FROM task WHERE task.completed LIKE \'1\'")
    public abstract java.util.List<com.example.week6.ROOM.Task> finByCompleted();
    
    @org.jetbrains.annotations.NotNull()
    @android.arch.persistence.room.Insert()
    public abstract java.util.List<java.lang.Long> insertAll(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.Task... todo);
    
    @android.arch.persistence.room.Insert(onConflict = android.arch.persistence.room.OnConflictStrategy.IGNORE)
    public abstract long insert(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.Task obj);
    
    @android.arch.persistence.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.Task toto);
    
    @android.arch.persistence.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.Task task);
    
    @android.arch.persistence.room.Query(value = "DELETE FROM task")
    public abstract void deleteAllTask();
}