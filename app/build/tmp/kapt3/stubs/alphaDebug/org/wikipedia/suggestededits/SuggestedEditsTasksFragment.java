package org.wikipedia.suggestededits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 K2\u00020\u0001:\u0003KLMB\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010 \u001a\u00020!2\b\b\u0002\u0010\"\u001a\u00020\u0015H\u0002J\b\u0010#\u001a\u00020!H\u0002J\u0016\u0010$\u001a\u00020\u00192\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\'0&H\u0002J\b\u0010(\u001a\u00020\u0015H\u0002J\u0012\u0010)\u001a\u00020!2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\"\u0010,\u001a\u00020!2\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u00192\b\u0010/\u001a\u0004\u0018\u000100H\u0016J$\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u0001062\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u00107\u001a\u00020!H\u0016J\b\u00108\u001a\u00020!H\u0016J\b\u00109\u001a\u00020!H\u0016J\u001a\u0010:\u001a\u00020!2\u0006\u0010;\u001a\u0002022\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0006\u0010<\u001a\u00020!J\b\u0010=\u001a\u00020!H\u0002J\b\u0010>\u001a\u00020!H\u0002J\b\u0010?\u001a\u00020!H\u0002J\b\u0010@\u001a\u00020!H\u0002J\b\u0010A\u001a\u00020!H\u0002J\b\u0010B\u001a\u00020!H\u0002J\u0010\u0010C\u001a\u00020!2\u0006\u0010D\u001a\u00020EH\u0002J\b\u0010F\u001a\u00020!H\u0002J\u0014\u0010G\u001a\u00020!*\u00020H2\u0006\u0010I\u001a\u00020JH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006N"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentSuggestedEditsTasksBinding;", "addDescriptionsTask", "Lorg/wikipedia/suggestededits/SuggestedEditsTask;", "addImageCaptionsTask", "addImageTagsTask", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentSuggestedEditsTasksBinding;", "blockMessage", "", "callback", "Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment$TaskViewCallback;", "displayedTasks", "Ljava/util/ArrayList;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "isPausedOrDisabled", "", "latestEditDate", "Ljava/util/Date;", "latestEditStreak", "", "revertSeverity", "sequentialTooltipRunnable", "Ljava/lang/Runnable;", "totalContributions", "totalPageviews", "", "clearContents", "", "shouldScrollToTop", "fetchUserContributions", "getEditStreak", "contributions", "", "Lorg/wikipedia/dataclient/mwapi/UserContribution;", "maybeSetPausedOrDisabled", "onActivityCreated", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onPause", "onResume", "onViewCreated", "view", "refreshContents", "setFinalUIState", "setIPBlockedStatus", "setRequiredLoginStatus", "setUpTasks", "setUserStatsViewsAndTooltips", "setupTestingButtons", "showError", "t", "", "showOneTimeSequentialUserStatsTooltips", "addOnClickListener", "Landroidx/constraintlayout/widget/Group;", "listener", "Landroid/view/View$OnClickListener;", "Companion", "RecyclerAdapter", "TaskViewCallback", "app_alphaDebug"})
public final class SuggestedEditsTasksFragment extends androidx.fragment.app.Fragment {
    private org.wikipedia.databinding.FragmentSuggestedEditsTasksBinding _binding;
    private org.wikipedia.suggestededits.SuggestedEditsTask addDescriptionsTask;
    private org.wikipedia.suggestededits.SuggestedEditsTask addImageCaptionsTask;
    private org.wikipedia.suggestededits.SuggestedEditsTask addImageTagsTask;
    private final java.util.ArrayList<org.wikipedia.suggestededits.SuggestedEditsTask> displayedTasks = null;
    private final org.wikipedia.suggestededits.SuggestedEditsTasksFragment.TaskViewCallback callback = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private java.lang.String blockMessage;
    private boolean isPausedOrDisabled = false;
    private long totalPageviews = 0L;
    private int totalContributions = 0;
    private java.util.Date latestEditDate;
    private int latestEditStreak = 0;
    private int revertSeverity = 0;
    private final java.lang.Runnable sequentialTooltipRunnable = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.suggestededits.SuggestedEditsTasksFragment.Companion Companion = null;
    
    public SuggestedEditsTasksFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentSuggestedEditsTasksBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addOnClickListener(androidx.constraintlayout.widget.Group $this$addOnClickListener, android.view.View.OnClickListener listener) {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onActivityCreated(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    private final void fetchUserContributions() {
    }
    
    public final void refreshContents() {
    }
    
    private final void clearContents(boolean shouldScrollToTop) {
    }
    
    private final void showError(java.lang.Throwable t) {
    }
    
    private final void setFinalUIState() {
    }
    
    private final void setUserStatsViewsAndTooltips() {
    }
    
    private final void showOneTimeSequentialUserStatsTooltips() {
    }
    
    private final void setIPBlockedStatus() {
    }
    
    private final void setRequiredLoginStatus() {
    }
    
    private final boolean maybeSetPausedOrDisabled() {
        return false;
    }
    
    private final int getEditStreak(java.util.List<org.wikipedia.dataclient.mwapi.UserContribution> contributions) {
        return 0;
    }
    
    private final void setupTestingButtons() {
    }
    
    private final void setUpTasks() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment$TaskViewCallback;", "Lorg/wikipedia/suggestededits/SuggestedEditsTaskView$Callback;", "(Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment;)V", "onViewClick", "", "task", "Lorg/wikipedia/suggestededits/SuggestedEditsTask;", "secondary", "", "app_alphaDebug"})
    final class TaskViewCallback implements org.wikipedia.suggestededits.SuggestedEditsTaskView.Callback {
        
        public TaskViewCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onViewClick(@org.jetbrains.annotations.NotNull()
        org.wikipedia.suggestededits.SuggestedEditsTask task, boolean secondary) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001e\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u001e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\fH\u0016\u00a8\u0006\u0011"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment$RecyclerAdapter;", "Lorg/wikipedia/views/DefaultRecyclerAdapter;", "Lorg/wikipedia/suggestededits/SuggestedEditsTask;", "Lorg/wikipedia/suggestededits/SuggestedEditsTaskView;", "tasks", "", "(Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment;Ljava/util/List;)V", "onBindViewHolder", "", "holder", "Lorg/wikipedia/views/DefaultViewHolder;", "i", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "app_alphaDebug"})
    public final class RecyclerAdapter extends org.wikipedia.views.DefaultRecyclerAdapter<org.wikipedia.suggestededits.SuggestedEditsTask, org.wikipedia.suggestededits.SuggestedEditsTaskView> {
        
        public RecyclerAdapter(@org.jetbrains.annotations.NotNull()
        java.util.List<org.wikipedia.suggestededits.SuggestedEditsTask> tasks) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public org.wikipedia.views.DefaultViewHolder<org.wikipedia.suggestededits.SuggestedEditsTaskView> onCreateViewHolder(@org.jetbrains.annotations.NotNull()
        android.view.ViewGroup parent, int viewType) {
            return null;
        }
        
        @java.lang.Override()
        public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.DefaultViewHolder<org.wikipedia.suggestededits.SuggestedEditsTaskView> holder, int i) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment$Companion;", "", "()V", "newInstance", "Lorg/wikipedia/suggestededits/SuggestedEditsTasksFragment;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.wikipedia.suggestededits.SuggestedEditsTasksFragment newInstance() {
            return null;
        }
    }
}