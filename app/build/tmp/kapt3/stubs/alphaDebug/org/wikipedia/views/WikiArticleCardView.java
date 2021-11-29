package org.wikipedia.views;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\u000b\u001a\u00020\fJ\u001d\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e\u00a2\u0006\u0002\u0010\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0010\u0010\u0017\u001a\u00020\u00142\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011J\u0018\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u001cJ\u001a\u0010\u001d\u001a\u00020\u00142\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006#"}, d2 = {"Lorg/wikipedia/views/WikiArticleCardView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ViewWikiArticleCardBinding;", "getBinding", "()Lorg/wikipedia/databinding/ViewWikiArticleCardBinding;", "getImageView", "Lorg/wikipedia/views/FaceAndColorDetectImageView;", "getSharedElements", "", "Landroidx/core/util/Pair;", "Landroid/view/View;", "", "()[Landroidx/core/util/Pair;", "prepareForTransition", "", "title", "Lorg/wikipedia/page/PageTitle;", "setDescription", "description", "setExtract", "extract", "maxLines", "", "setImageUri", "uri", "Landroid/net/Uri;", "hideInLandscape", "", "setTitle", "app_alphaDebug"})
public final class WikiArticleCardView extends androidx.constraintlayout.widget.ConstraintLayout {
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.databinding.ViewWikiArticleCardBinding binding = null;
    
    public WikiArticleCardView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.databinding.ViewWikiArticleCardBinding getBinding() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String description) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.views.FaceAndColorDetectImageView getImageView() {
        return null;
    }
    
    public final void setExtract(@org.jetbrains.annotations.Nullable()
    java.lang.String extract, int maxLines) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.core.util.Pair<android.view.View, java.lang.String>[] getSharedElements() {
        return null;
    }
    
    public final void setImageUri(@org.jetbrains.annotations.Nullable()
    android.net.Uri uri, boolean hideInLandscape) {
    }
    
    public final void prepareForTransition(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title) {
    }
}