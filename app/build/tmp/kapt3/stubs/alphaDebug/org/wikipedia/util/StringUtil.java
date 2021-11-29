package org.wikipedia.util;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\"\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0004H\u0007J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0018\u001a\u00020\u00042\b\b\u0001\u0010\u0019\u001a\u00020\u001aH\u0007J(\u0010\u001b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001aJ \u0010 \u001a\u00020\b2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0007J\u001a\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\'\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u001aH\u0007J\u0018\u0010)\u001a\u00020\u00042\u000e\u0010*\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000eH\u0007J\u0010\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u0004H\u0007J\u001c\u0010-\u001a\u00020\u001e2\b\u0010.\u001a\u0004\u0018\u00010\u00042\b\u0010/\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u00100\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0012\u00101\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u00102\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0012\u00103\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u00104\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007J\u0012\u00105\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u00106\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u0004H\u0007J\u0012\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u000109H\u0007J\u0016\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u00042\u0006\u0010>\u001a\u00020?R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006@"}, d2 = {"Lorg/wikipedia/util/StringUtil;", "", "()V", "CSV_DELIMITER", "", "addUnderscores", "text", "boldenKeywordText", "", "textView", "Landroid/widget/TextView;", "parentText", "searchQuery", "csvToList", "", "csv", "dbNameToLangCode", "wikiDbName", "delimiterStringToList", "delimitedString", "delimiter", "fromHtml", "Landroid/text/Spanned;", "source", "getBase26String", "number", "", "highlightAndBoldenText", "input", "shouldBolden", "", "highlightColor", "highlightEditText", "editText", "Landroid/widget/EditText;", "highlightText", "indexOf", "original", "search", "intToHexStr", "i", "listToCsv", "list", "md5string", "s", "normalizedEquals", "str1", "str2", "removeCiteMarkup", "removeHTMLTags", "removeNamespace", "removeSectionAnchor", "removeStyleTags", "removeUnderscores", "sanitizeAbuseFilterCode", "code", "strip", "", "str", "userPageTitleFromName", "Lorg/wikipedia/page/PageTitle;", "userName", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "app_alphaDebug"})
public final class StringUtil {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.util.StringUtil INSTANCE = null;
    private static final java.lang.String CSV_DELIMITER = ",";
    
    private StringUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String listToCsv(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> list) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.List<java.lang.String> csvToList(@org.jetbrains.annotations.NotNull()
    java.lang.String csv) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.util.List<java.lang.String> delimiterStringToList(@org.jetbrains.annotations.NotNull()
    java.lang.String delimitedString, @org.jetbrains.annotations.NotNull()
    java.lang.String delimiter) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String md5string(@org.jetbrains.annotations.NotNull()
    java.lang.String s) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.CharSequence strip(@org.jetbrains.annotations.Nullable()
    java.lang.CharSequence str) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String intToHexStr(int i) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String addUnderscores(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String removeUnderscores(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String dbNameToLangCode(@org.jetbrains.annotations.NotNull()
    java.lang.String wikiDbName) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String removeSectionAnchor(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String removeNamespace(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String removeHTMLTags(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String removeStyleTags(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String removeCiteMarkup(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String sanitizeAbuseFilterCode(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final boolean normalizedEquals(@org.jetbrains.annotations.Nullable()
    java.lang.String str1, @org.jetbrains.annotations.Nullable()
    java.lang.String str2) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final android.text.Spanned fromHtml(@org.jetbrains.annotations.Nullable()
    java.lang.String source) {
        return null;
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void highlightEditText(@org.jetbrains.annotations.NotNull()
    android.widget.EditText editText, @org.jetbrains.annotations.NotNull()
    java.lang.String parentText, @org.jetbrains.annotations.NotNull()
    java.lang.String highlightText) {
    }
    
    @kotlin.jvm.JvmStatic()
    public static final void boldenKeywordText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.NotNull()
    java.lang.String parentText, @org.jetbrains.annotations.Nullable()
    java.lang.String searchQuery) {
    }
    
    public final void highlightAndBoldenText(@org.jetbrains.annotations.NotNull()
    android.widget.TextView textView, @org.jetbrains.annotations.Nullable()
    java.lang.String input, boolean shouldBolden, int highlightColor) {
    }
    
    private final int indexOf(java.lang.String original, java.lang.String search) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @kotlin.jvm.JvmStatic()
    public static final java.lang.String getBase26String(@androidx.annotation.IntRange(from = 1L)
    int number) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle userPageTitleFromName(@org.jetbrains.annotations.NotNull()
    java.lang.String userName, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
}