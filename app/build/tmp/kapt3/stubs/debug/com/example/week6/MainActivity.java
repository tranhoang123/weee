package com.example.week6;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 32\u00020\u0001:\u00013B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010%\u001a\u00020&2\u0006\u0010\'\u001a\u00020(H\u0002J\b\u0010\u001f\u001a\u00020)H\u0002J\b\u0010*\u001a\u00020)H\u0002J\u0012\u0010+\u001a\u00020)2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020)H\u0002J\u0010\u0010/\u001a\u00020)2\u0006\u00100\u001a\u000201H\u0002J\b\u00102\u001a\u00020)H\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00100\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/example/week6/MainActivity;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "dao", "Lcom/example/week6/ROOM/TaskDAO;", "getDao", "()Lcom/example/week6/ROOM/TaskDAO;", "setDao", "(Lcom/example/week6/ROOM/TaskDAO;)V", "db", "Lcom/example/week6/ROOM/AppDatabase;", "getDb", "()Lcom/example/week6/ROOM/AppDatabase;", "setDb", "(Lcom/example/week6/ROOM/AppDatabase;)V", "task", "Lcom/example/week6/ROOM/Task;", "getTask", "()Lcom/example/week6/ROOM/Task;", "setTask", "(Lcom/example/week6/ROOM/Task;)V", "taskAdapter", "Lcom/example/week6/TaskAdapter;", "getTaskAdapter", "()Lcom/example/week6/TaskAdapter;", "setTaskAdapter", "(Lcom/example/week6/TaskAdapter;)V", "taskItemClickListener", "Lcom/example/week6/TaskItemClickListener;", "tasks", "Ljava/util/ArrayList;", "getTasks", "()Ljava/util/ArrayList;", "setTasks", "(Ljava/util/ArrayList;)V", "toUserScreen", "Landroid/view/View$OnClickListener;", "detectTaskAvailable", "", "description", "", "", "initRoomDatabase", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "radioGroupProccess", "removeItem", "position", "", "setupRecycleview", "Companion", "app_debug"})
public final class MainActivity extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.week6.ROOM.Task> tasks;
    @org.jetbrains.annotations.NotNull()
    public com.example.week6.TaskAdapter taskAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.example.week6.ROOM.TaskDAO dao;
    @org.jetbrains.annotations.NotNull()
    private com.example.week6.ROOM.Task task;
    @org.jetbrains.annotations.NotNull()
    public com.example.week6.ROOM.AppDatabase db;
    private final android.view.View.OnClickListener toUserScreen = null;
    private final com.example.week6.TaskItemClickListener taskItemClickListener = null;
    public static final int REQUEST_SETTING_USER_SCREEN = 1099;
    public static final com.example.week6.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.week6.ROOM.Task> getTasks() {
        return null;
    }
    
    public final void setTasks(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.week6.ROOM.Task> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.week6.TaskAdapter getTaskAdapter() {
        return null;
    }
    
    public final void setTaskAdapter(@org.jetbrains.annotations.NotNull()
    com.example.week6.TaskAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.week6.ROOM.TaskDAO getDao() {
        return null;
    }
    
    public final void setDao(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.TaskDAO p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.week6.ROOM.Task getTask() {
        return null;
    }
    
    public final void setTask(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.Task p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.week6.ROOM.AppDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.AppDatabase p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void radioGroupProccess() {
    }
    
    private final void initRoomDatabase() {
    }
    
    private final void setupRecycleview() {
    }
    
    private final void getTasks() {
    }
    
    private final void removeItem(int position) {
    }
    
    private final boolean detectTaskAvailable(java.lang.String description) {
        return false;
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/week6/MainActivity$Companion;", "", "()V", "REQUEST_SETTING_USER_SCREEN", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}