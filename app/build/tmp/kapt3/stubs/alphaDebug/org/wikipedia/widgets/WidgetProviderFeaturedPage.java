package org.wikipedia.widgets;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\u0018\u0000 \u00122\u00020\u0001:\u0002\u0011\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J \u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016\u00a8\u0006\u0013"}, d2 = {"Lorg/wikipedia/widgets/WidgetProviderFeaturedPage;", "Landroid/appwidget/AppWidgetProvider;", "()V", "findFeaturedArticleTitle", "", "pageLeadContent", "getFeaturedArticleInformation", "", "cb", "Lorg/wikipedia/widgets/WidgetProviderFeaturedPage$Callback;", "onUpdate", "context", "Landroid/content/Context;", "appWidgetManager", "Landroid/appwidget/AppWidgetManager;", "appWidgetIds", "", "Callback", "Companion", "app_alphaDebug"})
public final class WidgetProviderFeaturedPage extends android.appwidget.AppWidgetProvider {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.widgets.WidgetProviderFeaturedPage.Companion Companion = null;
    
    public WidgetProviderFeaturedPage() {
        super();
    }
    
    @java.lang.Override()
    public void onUpdate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.appwidget.AppWidgetManager appWidgetManager, @org.jetbrains.annotations.NotNull()
    int[] appWidgetIds) {
    }
    
    private final void getFeaturedArticleInformation(org.wikipedia.widgets.WidgetProviderFeaturedPage.Callback cb) {
    }
    
    private final java.lang.String findFeaturedArticleTitle(java.lang.String pageLeadContent) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void forceUpdateWidget(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\bb\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lorg/wikipedia/widgets/WidgetProviderFeaturedPage$Callback;", "", "onFeaturedArticleReceived", "", "pageTitle", "Lorg/wikipedia/page/PageTitle;", "widgetText", "", "app_alphaDebug"})
    static abstract interface Callback {
        
        public abstract void onFeaturedArticleReceived(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle pageTitle, @org.jetbrains.annotations.NotNull()
        java.lang.CharSequence widgetText);
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/widgets/WidgetProviderFeaturedPage$Companion;", "", "()V", "forceUpdateWidget", "", "context", "Landroid/content/Context;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @kotlin.jvm.JvmStatic()
        public final void forceUpdateWidget(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
        }
    }
}