package org.wikipedia.diff;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0002H\u0014\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/diff/ArticleEditDetailsActivity;", "Lorg/wikipedia/activity/SingleFragmentActivity;", "Lorg/wikipedia/diff/ArticleEditDetailsFragment;", "()V", "createFragment", "Companion", "app_alphaDebug"})
public final class ArticleEditDetailsActivity extends org.wikipedia.activity.SingleFragmentActivity<org.wikipedia.diff.ArticleEditDetailsFragment> {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.diff.ArticleEditDetailsActivity.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_ARTICLE_TITLE = "articleTitle";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_EDIT_REVISION_ID = "revisionId";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_EDIT_LANGUAGE_CODE = "languageCode";
    
    public ArticleEditDetailsActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected org.wikipedia.diff.ArticleEditDetailsFragment createFragment() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/diff/ArticleEditDetailsActivity$Companion;", "", "()V", "EXTRA_ARTICLE_TITLE", "", "EXTRA_EDIT_LANGUAGE_CODE", "EXTRA_EDIT_REVISION_ID", "newIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "articleTitle", "revisionId", "", "languageCode", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent newIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String articleTitle, long revisionId, @org.jetbrains.annotations.NotNull()
        java.lang.String languageCode) {
            return null;
        }
    }
}