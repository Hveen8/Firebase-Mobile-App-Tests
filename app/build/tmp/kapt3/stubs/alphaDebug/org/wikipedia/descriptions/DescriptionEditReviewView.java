package org.wikipedia.descriptions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u001e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\nJ\u0006\u0010\u0016\u001a\u00020\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditReviewView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ViewDescriptionEditReviewBinding;", "isShowing", "", "()Z", "hide", "", "setDescriptionReviewView", "summaryForEdit", "Lorg/wikipedia/suggestededits/PageSummaryForEdit;", "description", "", "setGalleryReviewView", "setSummary", "captionReview", "show", "Companion", "app_alphaDebug"})
public final class DescriptionEditReviewView extends androidx.constraintlayout.widget.ConstraintLayout {
    private final org.wikipedia.databinding.ViewDescriptionEditReviewBinding binding = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.descriptions.DescriptionEditReviewView.Companion Companion = null;
    public static final int ARTICLE_EXTRACT_MAX_LINE_WITH_IMAGE = 5;
    public static final int ARTICLE_EXTRACT_MAX_LINE_WITHOUT_IMAGE = 15;
    
    public DescriptionEditReviewView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public final boolean isShowing() {
        return false;
    }
    
    public final void show() {
    }
    
    public final void hide() {
    }
    
    public final void setSummary(@org.jetbrains.annotations.NotNull()
    org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean captionReview) {
    }
    
    private final void setDescriptionReviewView(org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit, java.lang.String description) {
    }
    
    private final void setGalleryReviewView(org.wikipedia.suggestededits.PageSummaryForEdit summaryForEdit, java.lang.String description) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/descriptions/DescriptionEditReviewView$Companion;", "", "()V", "ARTICLE_EXTRACT_MAX_LINE_WITHOUT_IMAGE", "", "ARTICLE_EXTRACT_MAX_LINE_WITH_IMAGE", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}