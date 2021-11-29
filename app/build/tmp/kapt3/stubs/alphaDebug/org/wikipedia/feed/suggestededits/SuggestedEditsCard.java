package org.wikipedia.feed.suggestededits;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lorg/wikipedia/feed/suggestededits/SuggestedEditsCard;", "Lorg/wikipedia/feed/model/WikiSiteCard;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "age", "", "(Lorg/wikipedia/dataclient/WikiSite;I)V", "getAge", "()I", "footerActionText", "", "subtitle", "title", "type", "Lorg/wikipedia/feed/model/CardType;", "app_alphaDebug"})
public final class SuggestedEditsCard extends org.wikipedia.feed.model.WikiSiteCard {
    private final int age = 0;
    
    public SuggestedEditsCard(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite wiki, int age) {
        super(null);
    }
    
    public final int getAge() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.feed.model.CardType type() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String title() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String subtitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String footerActionText() {
        return null;
    }
}