package org.wikipedia.edit.summaries;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\fJ\u0016\u0010\u000e\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/edit/summaries/EditSummaryHandler;", "", "container", "Landroid/view/View;", "summaryEdit", "Landroid/widget/AutoCompleteTextView;", "title", "Lorg/wikipedia/page/PageTitle;", "(Landroid/view/View;Landroid/widget/AutoCompleteTextView;Lorg/wikipedia/page/PageTitle;)V", "handleBackPressed", "", "persistSummary", "", "show", "updateAutoCompleteList", "editSummaries", "", "Lorg/wikipedia/edit/db/EditSummary;", "app_alphaDebug"})
public final class EditSummaryHandler {
    private final android.view.View container = null;
    private final android.widget.AutoCompleteTextView summaryEdit = null;
    
    public EditSummaryHandler(@org.jetbrains.annotations.NotNull()
    android.view.View container, @org.jetbrains.annotations.NotNull()
    android.widget.AutoCompleteTextView summaryEdit, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
        super();
    }
    
    private final void updateAutoCompleteList(java.util.List<org.wikipedia.edit.db.EditSummary> editSummaries) {
    }
    
    public final void show() {
    }
    
    public final void persistSummary() {
    }
    
    public final boolean handleBackPressed() {
        return false;
    }
}