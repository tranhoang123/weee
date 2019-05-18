package com.example.week6;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u0012\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u0019H\u0002R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001f"}, d2 = {"Lcom/example/week6/UserScreen;", "Landroid/support/v7/app/AppCompatActivity;", "()V", "Users", "Ljava/util/ArrayList;", "Lcom/example/week6/ROOM/User;", "getUsers", "()Ljava/util/ArrayList;", "setUsers", "(Ljava/util/ArrayList;)V", "btRemove", "Lcom/example/week6/ItemClickListener;", "dao", "Lcom/example/week6/ROOM/UserDAO;", "getDao", "()Lcom/example/week6/ROOM/UserDAO;", "setDao", "(Lcom/example/week6/ROOM/UserDAO;)V", "userAdapter", "Lcom/example/week6/UserAdapter;", "getUserAdapter", "()Lcom/example/week6/UserAdapter;", "setUserAdapter", "(Lcom/example/week6/UserAdapter;)V", "getUser", "", "initRoomDatabase", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setupRecyclerView", "app_debug"})
public final class UserScreen extends android.support.v7.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.week6.ROOM.User> Users;
    @org.jetbrains.annotations.NotNull()
    public com.example.week6.UserAdapter userAdapter;
    @org.jetbrains.annotations.NotNull()
    public com.example.week6.ROOM.UserDAO dao;
    private final com.example.week6.ItemClickListener btRemove = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.week6.ROOM.User> getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.week6.ROOM.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.week6.UserAdapter getUserAdapter() {
        return null;
    }
    
    public final void setUserAdapter(@org.jetbrains.annotations.NotNull()
    com.example.week6.UserAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.week6.ROOM.UserDAO getDao() {
        return null;
    }
    
    public final void setDao(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.UserDAO p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initRoomDatabase() {
    }
    
    private final void setupRecyclerView() {
    }
    
    private final void getUser() {
    }
    
    public UserScreen() {
        super();
    }
}