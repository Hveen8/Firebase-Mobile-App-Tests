package org.wikipedia.userprofile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001&B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u001d\u001a\u00020\u001eJ\u0010\u0010\u001f\u001a\u00020\u00182\b\u0010 \u001a\u0004\u0018\u00010\u001aJ\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020#J\u0010\u0010$\u001a\u00020\u00182\b\u0010%\u001a\u0004\u0018\u00010\u001aR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lorg/wikipedia/userprofile/ContributionsItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "binding", "Lorg/wikipedia/databinding/ItemSuggestedEditsContributionsBinding;", "callback", "Lorg/wikipedia/userprofile/ContributionsItemView$Callback;", "getCallback", "()Lorg/wikipedia/userprofile/ContributionsItemView$Callback;", "setCallback", "(Lorg/wikipedia/userprofile/ContributionsItemView$Callback;)V", "contribution", "Lorg/wikipedia/userprofile/Contribution;", "getContribution", "()Lorg/wikipedia/userprofile/Contribution;", "setContribution", "(Lorg/wikipedia/userprofile/Contribution;)V", "numFormat", "Ljava/text/DecimalFormat;", "setDescription", "", "contributionDescription", "", "setDiffCountText", "setIcon", "contributionType", "", "setImageUrl", "url", "setPageViewCountText", "pageViewCount", "", "setTitle", "contributionTitle", "Callback", "app_alphaDebug"})
public final class ContributionsItemView extends android.widget.LinearLayout {
    private final org.wikipedia.databinding.ItemSuggestedEditsContributionsBinding binding = null;
    private java.text.DecimalFormat numFormat;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.userprofile.ContributionsItemView.Callback callback;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.userprofile.Contribution contribution;
    
    public ContributionsItemView(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.userprofile.ContributionsItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.userprofile.ContributionsItemView.Callback p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.userprofile.Contribution getContribution() {
        return null;
    }
    
    public final void setContribution(@org.jetbrains.annotations.Nullable()
    org.wikipedia.userprofile.Contribution p0) {
    }
    
    public final void setTitle(@org.jetbrains.annotations.Nullable()
    java.lang.String contributionTitle) {
    }
    
    public final void setDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String contributionDescription) {
    }
    
    public final void setPageViewCountText(long pageViewCount) {
    }
    
    public final void setIcon(int contributionType) {
    }
    
    public final void setImageUrl(@org.jetbrains.annotations.Nullable()
    java.lang.String url) {
    }
    
    public final void setDiffCountText(@org.jetbrains.annotations.NotNull()
    org.wikipedia.userprofile.Contribution contribution) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/userprofile/ContributionsItemView$Callback;", "", "onClick", "", "context", "Landroid/content/Context;", "contribution", "Lorg/wikipedia/userprofile/Contribution;", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        org.wikipedia.userprofile.Contribution contribution);
    }
}