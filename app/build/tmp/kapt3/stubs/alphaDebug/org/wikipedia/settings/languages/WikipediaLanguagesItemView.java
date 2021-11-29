package org.wikipedia.settings.languages;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001#B\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004B\u001b\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0002\u0010\u0007B#\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0017J \u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0013\u001a\u00020\tJ\u000e\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u0017J\u0012\u0010\u001f\u001a\u00020\u00152\b\u0010 \u001a\u0004\u0018\u00010!H\u0007J\b\u0010\"\u001a\u00020\u0015H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "binding", "Lorg/wikipedia/databinding/ItemWikipediaLanguageBinding;", "callback", "Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView$Callback;", "getCallback", "()Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView$Callback;", "setCallback", "(Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView$Callback;)V", "position", "setCheckBoxChecked", "", "checked", "", "setCheckBoxEnabled", "enabled", "setContents", "langCode", "", "languageLocalizedName", "setDragHandleEnabled", "setDragHandleTouchListener", "listener", "Landroid/view/View$OnTouchListener;", "updateBackgroundColor", "Callback", "app_alphaDebug"})
public final class WikipediaLanguagesItemView extends android.widget.LinearLayout {
    private org.wikipedia.databinding.ItemWikipediaLanguageBinding binding;
    private int position = 0;
    @org.jetbrains.annotations.Nullable()
    private org.wikipedia.settings.languages.WikipediaLanguagesItemView.Callback callback;
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.settings.languages.WikipediaLanguagesItemView.Callback getCallback() {
        return null;
    }
    
    public final void setCallback(@org.jetbrains.annotations.Nullable()
    org.wikipedia.settings.languages.WikipediaLanguagesItemView.Callback p0) {
    }
    
    public WikipediaLanguagesItemView(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super(null);
    }
    
    public WikipediaLanguagesItemView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
    
    public WikipediaLanguagesItemView(@org.jetbrains.annotations.Nullable()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs, int defStyleAttr) {
        super(null);
    }
    
    private final void updateBackgroundColor() {
    }
    
    public final void setContents(@org.jetbrains.annotations.NotNull()
    java.lang.String langCode, @org.jetbrains.annotations.Nullable()
    java.lang.String languageLocalizedName, int position) {
    }
    
    public final void setCheckBoxEnabled(boolean enabled) {
    }
    
    public final void setCheckBoxChecked(boolean checked) {
    }
    
    public final void setDragHandleEnabled(boolean enabled) {
    }
    
    @android.annotation.SuppressLint(value = {"ClickableViewAccessibility"})
    public final void setDragHandleTouchListener(@org.jetbrains.annotations.Nullable()
    android.view.View.OnTouchListener listener) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/settings/languages/WikipediaLanguagesItemView$Callback;", "", "onCheckedChanged", "", "position", "", "onLongPress", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onCheckedChanged(int position);
        
        public abstract void onLongPress(int position);
    }
}