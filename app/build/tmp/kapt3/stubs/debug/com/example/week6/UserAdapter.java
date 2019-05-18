package com.example.week6;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001aH\u0016J\u0016\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u001aJ\u000e\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\'"}, d2 = {"Lcom/example/week6/UserAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/example/week6/UserViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/example/week6/ROOM/User;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "mListener", "Lcom/example/week6/ItemClickListener;", "getMListener", "()Lcom/example/week6/ItemClickListener;", "setMListener", "(Lcom/example/week6/ItemClickListener;)V", "appenData", "", "newUserAdded", "getItemCount", "", "onBindViewHolder", "userViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "p1", "removeItem", "userRemove", "i", "setListener", "listener", "app_debug"})
public final class UserAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.example.week6.UserViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public com.example.week6.ItemClickListener mListener;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.week6.ROOM.User> items;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.week6.ItemClickListener getMListener() {
        return null;
    }
    
    public final void setMListener(@org.jetbrains.annotations.NotNull()
    com.example.week6.ItemClickListener p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.week6.UserViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.week6.UserViewHolder userViewHolder, int position) {
    }
    
    public final void appenData(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.User newUserAdded) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.example.week6.ItemClickListener listener) {
    }
    
    public final void removeItem(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.User userRemove, int i) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.week6.ROOM.User> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.week6.ROOM.User> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public UserAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.week6.ROOM.User> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}