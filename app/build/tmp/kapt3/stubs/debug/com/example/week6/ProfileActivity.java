package com.example.week6;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010&\u001a\u00020\'H\u0002J\b\u0010\u0018\u001a\u00020\'H\u0002J\b\u0010(\u001a\u00020\'H\u0002J\u0012\u0010)\u001a\u00020\'2\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J,\u0010,\u001a\u00020\'2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0016J\u0014\u00105\u001a\u00020\'2\n\u0010-\u001a\u0006\u0012\u0002\b\u00030.H\u0016J\b\u00106\u001a\u00020\'H\u0002R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010\u001b\u00a8\u00067"}, d2 = {"Lcom/example/week6/ProfileActivity;", "Landroid/support/v7/app/AppCompatActivity;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "()V", "dao", "Lcom/example/week6/ROOM/TaskDAO;", "getDao", "()Lcom/example/week6/ROOM/TaskDAO;", "setDao", "(Lcom/example/week6/ROOM/TaskDAO;)V", "daoUser", "Lcom/example/week6/ROOM/UserDAO;", "getDaoUser", "()Lcom/example/week6/ROOM/UserDAO;", "setDaoUser", "(Lcom/example/week6/ROOM/UserDAO;)V", "task", "Lcom/example/week6/ROOM/Task;", "getTask", "()Lcom/example/week6/ROOM/Task;", "setTask", "(Lcom/example/week6/ROOM/Task;)V", "tasks", "Ljava/util/ArrayList;", "getTasks", "()Ljava/util/ArrayList;", "setTasks", "(Ljava/util/ArrayList;)V", "user", "Lcom/example/week6/ROOM/User;", "getUser", "()Lcom/example/week6/ROOM/User;", "setUser", "(Lcom/example/week6/ROOM/User;)V", "username", "", "getUsername", "setUsername", "getAndPutData", "", "initRoomDatabase", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onItemSelected", "arg0", "Landroid/widget/AdapterView;", "arg1", "Landroid/view/View;", "position", "", "id", "", "onNothingSelected", "setupSpiner", "app_debug"})
public final class ProfileActivity extends android.support.v7.app.AppCompatActivity implements android.widget.AdapterView.OnItemSelectedListener {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.week6.ROOM.Task> tasks;
    @org.jetbrains.annotations.NotNull()
    public com.example.week6.ROOM.TaskDAO dao;
    @org.jetbrains.annotations.NotNull()
    private com.example.week6.ROOM.Task task;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> username;
    @org.jetbrains.annotations.NotNull()
    public com.example.week6.ROOM.UserDAO daoUser;
    @org.jetbrains.annotations.NotNull()
    private com.example.week6.ROOM.User user;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.week6.ROOM.Task> getTasks() {
        return null;
    }
    
    public final void setTasks(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.week6.ROOM.Task> p0) {
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
    public final java.util.ArrayList<java.lang.String> getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.week6.ROOM.UserDAO getDaoUser() {
        return null;
    }
    
    public final void setDaoUser(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.UserDAO p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.week6.ROOM.User getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.User p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRoomDatabase() {
    }
    
    private final void getTasks() {
    }
    
    private final void getAndPutData() {
    }
    
    private final void setupSpiner() {
    }
    
    @java.lang.Override()
    public void onItemSelected(@org.jetbrains.annotations.NotNull()
    android.widget.AdapterView<?> arg0, @org.jetbrains.annotations.NotNull()
    android.view.View arg1, int position, long id) {
    }
    
    @java.lang.Override()
    public void onNothingSelected(@org.jetbrains.annotations.NotNull()
    android.widget.AdapterView<?> arg0) {
    }
    
    public ProfileActivity() {
        super();
    }
}