package com.example.week6;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B%\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u0018\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001aH\u0016J\u000e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u001aJ\u001e\u0010\"\u001a\u00020\u00172\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006J\u000e\u0010#\u001a\u00020\u00172\u0006\u0010$\u001a\u00020\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006%"}, d2 = {"Lcom/example/week6/TaskAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/example/week6/TaskViewHolder;", "items", "Ljava/util/ArrayList;", "Lcom/example/week6/ROOM/Task;", "Lkotlin/collections/ArrayList;", "context", "Landroid/content/Context;", "(Ljava/util/ArrayList;Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "mListener", "Lcom/example/week6/TaskItemClickListener;", "getMListener", "()Lcom/example/week6/TaskItemClickListener;", "setMListener", "(Lcom/example/week6/TaskItemClickListener;)V", "appenData", "", "new", "getItemCount", "", "onBindViewHolder", "p0", "p1", "onCreateViewHolder", "Landroid/view/ViewGroup;", "removeData", "position", "setData", "setListener", "listener", "app_debug"})
public final class TaskAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.example.week6.TaskViewHolder> {
    @org.jetbrains.annotations.NotNull()
    public com.example.week6.TaskItemClickListener mListener;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.example.week6.ROOM.Task> items;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.week6.TaskItemClickListener getMListener() {
        return null;
    }
    
    public final void setMListener(@org.jetbrains.annotations.NotNull()
    com.example.week6.TaskItemClickListener p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.week6.TaskViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup p0, int p1) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.week6.TaskViewHolder p0, int p1) {
    }
    
    public final void setListener(@org.jetbrains.annotations.NotNull()
    com.example.week6.TaskItemClickListener listener) {
    }
    
    public final void appenData(@org.jetbrains.annotations.NotNull()
    com.example.week6.ROOM.Task p0_54480) {
    }
    
    public final void removeData(int position) {
    }
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.week6.ROOM.Task> items) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.example.week6.ROOM.Task> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.week6.ROOM.Task> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public TaskAdapter(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.example.week6.ROOM.Task> items, @org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}