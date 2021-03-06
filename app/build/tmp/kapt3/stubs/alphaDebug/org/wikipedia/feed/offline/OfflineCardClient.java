package org.wikipedia.feed.offline;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/feed/offline/OfflineCardClient;", "Lorg/wikipedia/feed/dataclient/DummyClient;", "()V", "getNewCard", "Lorg/wikipedia/feed/model/Card;", "wiki", "Lorg/wikipedia/dataclient/WikiSite;", "app_alphaDebug"})
public final class OfflineCardClient extends org.wikipedia.feed.dataclient.DummyClient {
    
    public OfflineCardClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.feed.model.Card getNewCard(@org.jetbrains.annotations.Nullable()
    org.wikipedia.dataclient.WikiSite wiki) {
        return null;
    }
}