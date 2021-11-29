package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0003\"#$B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\b\u0010\u001a\u001a\u00020\u0018H\u0002J\b\u0010\u001b\u001a\u00020\u0018H\u0002J\b\u0010\u001c\u001a\u00020\u0018H\u0002J\u0016\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\b\u0010!\u001a\u00020\u0018H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\n \u0010*\u0004\u0018\u00010\u000f0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/views/CustomDatePicker;", "Landroidx/fragment/app/DialogFragment;", "()V", "_binding", "Lorg/wikipedia/databinding/DatePickerDialogBinding;", "binding", "getBinding", "()Lorg/wikipedia/databinding/DatePickerDialogBinding;", "callback", "Lorg/wikipedia/views/CustomDatePicker$Callback;", "getCallback", "()Lorg/wikipedia/views/CustomDatePicker$Callback;", "setCallback", "(Lorg/wikipedia/views/CustomDatePicker$Callback;)V", "callbackDay", "Ljava/util/Calendar;", "kotlin.jvm.PlatformType", "selectedDay", "today", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "", "setDayString", "setMonthString", "setNextMonthClickListener", "setPreviousMonthClickListener", "setSelectedDay", "month", "", "day", "setUpMonthGrid", "Callback", "Companion", "CustomCalendarAdapter", "app_alphaDebug"})
public final class CustomDatePicker extends androidx.fragment.app.DialogFragment {
    private org.wikipedia.databinding.DatePickerDialogBinding _binding;
    private final java.util.Calendar today = null;
    private final java.util.Calendar selectedDay = null;
    private final java.util.Calendar callbackDay = null;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.views.CustomDatePicker.Callback callback;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.views.CustomDatePicker.Companion Companion = null;
    private static final int MAX_COLUMN_SPAN = 7;
    public static final int LEAP_YEAR = 2016;
    
    public CustomDatePicker() {
        super();
    }
    
    private final org.wikipedia.databinding.DatePickerDialogBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.views.CustomDatePicker.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.views.CustomDatePicker.Callback p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.app.Dialog onCreateDialog(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void setPreviousMonthClickListener() {
    }
    
    private final void setNextMonthClickListener() {
    }
    
    private final void setUpMonthGrid() {
    }
    
    private final void setMonthString() {
    }
    
    private final void setDayString() {
    }
    
    public final void setSelectedDay(int month, int day) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/views/CustomDatePicker$Callback;", "", "onDatePicked", "", "month", "", "day", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onDatePicked(int month, int day);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u0010\u0012\f\u0012\n0\u0002R\u00060\u0000R\u00020\u00030\u0001:\u0001\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J \u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\n\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\n0\u0002R\u00060\u0000R\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/views/CustomDatePicker$CustomCalendarAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wikipedia/views/CustomDatePicker$CustomCalendarAdapter$ViewHolder;", "Lorg/wikipedia/views/CustomDatePicker;", "(Lorg/wikipedia/views/CustomDatePicker;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_alphaDebug"})
    public final class CustomCalendarAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wikipedia.views.CustomDatePicker.CustomCalendarAdapter.ViewHolder> {
        
        public CustomCalendarAdapter() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.views.CustomDatePicker.CustomCalendarAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.CustomDatePicker.CustomCalendarAdapter.ViewHolder holder, int position) {
        }
        
        @java.lang.Override()
        public int getItemCount() {
            return 0;
        }
        
        @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/views/CustomDatePicker$CustomCalendarAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lorg/wikipedia/databinding/ViewCustomCalendarDayBinding;", "(Lorg/wikipedia/views/CustomDatePicker$CustomCalendarAdapter;Lorg/wikipedia/databinding/ViewCustomCalendarDayBinding;)V", "setFields", "", "position", "", "app_alphaDebug"})
        public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
            private final org.wikipedia.databinding.ViewCustomCalendarDayBinding binding = null;
            
            public ViewHolder(@org.jetbrains.annotations.NotNull()
            org.wikipedia.databinding.ViewCustomCalendarDayBinding binding) {
                super(null);
            }
            
            public final void setFields(int position) {
            }
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/views/CustomDatePicker$Companion;", "", "()V", "LEAP_YEAR", "", "MAX_COLUMN_SPAN", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}