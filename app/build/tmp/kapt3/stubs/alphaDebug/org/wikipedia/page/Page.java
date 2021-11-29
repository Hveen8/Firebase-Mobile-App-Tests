package org.wikipedia.page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0013\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f\u00a8\u0006 "}, d2 = {"Lorg/wikipedia/page/Page;", "", "title", "Lorg/wikipedia/page/PageTitle;", "pageProperties", "Lorg/wikipedia/page/PageProperties;", "(Lorg/wikipedia/page/PageTitle;Lorg/wikipedia/page/PageProperties;)V", "sections", "", "Lorg/wikipedia/page/Section;", "(Lorg/wikipedia/page/PageTitle;Ljava/util/List;Lorg/wikipedia/page/PageProperties;)V", "displayTitle", "", "getDisplayTitle", "()Ljava/lang/String;", "isArticle", "", "()Z", "isMainPage", "isProtected", "getPageProperties", "()Lorg/wikipedia/page/PageProperties;", "setPageProperties", "(Lorg/wikipedia/page/PageProperties;)V", "getSections", "()Ljava/util/List;", "setSections", "(Ljava/util/List;)V", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "setTitle", "(Lorg/wikipedia/page/PageTitle;)V", "app_alphaDebug"})
public final class Page {
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageTitle title;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wikipedia.page.Section> sections;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageProperties pageProperties;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String displayTitle = null;
    private final boolean isMainPage = false;
    private final boolean isArticle = false;
    private final boolean isProtected = false;
    
    public Page(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.Section> sections, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageProperties pageProperties) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.page.Section> getSections() {
        return null;
    }
    
    public final void setSections(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.Section> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.PageProperties getPageProperties() {
        return null;
    }
    
    public final void setPageProperties(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageProperties p0) {
    }
    
    public Page(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageProperties pageProperties) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayTitle() {
        return null;
    }
    
    public final boolean isMainPage() {
        return false;
    }
    
    public final boolean isArticle() {
        return false;
    }
    
    public final boolean isProtected() {
        return false;
    }
}