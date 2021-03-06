package org.wikipedia.richtext;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\nH\u0002J(\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\f2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J+\u0010\u0011\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u00122\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0002J \u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ#\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012H\u0002\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fJ#\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0012H\u0002\u00a2\u0006\u0002\u0010\u001dJ\u000e\u0010 \u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001fJ\u0010\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\"J\u001e\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f\u00a8\u0006&"}, d2 = {"Lorg/wikipedia/richtext/RichTextUtil;", "", "()V", "copySpans", "", "src", "Landroid/text/Spanned;", "dst", "Landroid/text/Spannable;", "spans", "", "getComposingSpans", "", "spanned", "start", "", "end", "getSpans", "", "(Landroid/text/Spanned;II)[Ljava/lang/Object;", "isComposingSpan", "", "span", "remove", "", "text", "removeUnderlinesFromLinks", "spannable", "Landroid/text/style/URLSpan;", "(Landroid/text/Spannable;[Landroid/text/style/URLSpan;)V", "textView", "Landroid/widget/TextView;", "removeUnderlinesFromLinksAndMakeBold", "stripHtml", "", "html", "stripRichText", "str", "app_alphaDebug"})
public final class RichTextUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.richtext.RichTextUtil INSTANCE = null;
    
    private RichTextUtil() {
        super();
    }
    
    /**
     * Apply only the spans from src to dst specific by spans.
     *
     * @see {@link android.text.TextUtils.copySpansFrom}
     */
    private final void copySpans(android.text.Spanned src, android.text.Spannable dst, java.util.Collection<? extends java.lang.Object> spans) {
    }
    
    /**
     * Strips all rich text except spans used to provide compositional hints.
     */
    @org.jetbrains.annotations.NotNull()
    public final java.lang.CharSequence stripRichText(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence str, int start, int end) {
        return null;
    }
    
    /**
     * @return Temporary spans, often applied by the keyboard to provide hints such as typos.
     *
     * @see {@link android.view.inputmethod.BaseInputConnection.removeComposingSpans}
     */
    private final java.util.List<java.lang.Object> getComposingSpans(android.text.Spanned spanned, int start, int end) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object[] getSpans(@org.jetbrains.annotations.NotNull()
    android.text.Spanned spanned, int start, int end) {
        return null;
    }
    
    private final boolean isComposingSpan(android.text.Spanned spanned, java.lang.Object span) {
        return false;
    }
    
    public final void removeUnderlinesFromLinks(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView) {
    }
    
    private final void removeUnderlinesFromLinks(android.text.Spannable spannable, android.text.style.URLSpan[] spans) {
    }
    
    public final void removeUnderlinesFromLinksAndMakeBold(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView) {
    }
    
    private final void removeUnderlinesFromLinksAndMakeBold(android.text.Spannable spannable, android.text.style.URLSpan[] spans) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String stripHtml(@org.jetbrains.annotations.Nullable()
    java.lang.String html) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.CharSequence remove(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence text, @androidx.annotation.IntRange(from = 1L)
    int start, int end) {
        return null;
    }
}