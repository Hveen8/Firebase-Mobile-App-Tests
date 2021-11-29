package org.wikipedia.csrf;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0015"}, d2 = {"Lorg/wikipedia/csrf/CsrfTokenClient;", "", "site", "Lorg/wikipedia/dataclient/WikiSite;", "(Lorg/wikipedia/dataclient/WikiSite;)V", "csrfWikiSite", "loginWikiSite", "(Lorg/wikipedia/dataclient/WikiSite;Lorg/wikipedia/dataclient/WikiSite;)V", "numRetries", "", "csrfService", "Lorg/wikipedia/dataclient/Service;", "(Lorg/wikipedia/dataclient/WikiSite;ILorg/wikipedia/dataclient/Service;)V", "token", "Lio/reactivex/rxjava3/core/Observable;", "", "getToken", "()Lio/reactivex/rxjava3/core/Observable;", "bailWithLogout", "", "Companion", "app_alphaDebug"})
public final class CsrfTokenClient {
    private final org.wikipedia.dataclient.WikiSite loginWikiSite = null;
    private final int numRetries = 0;
    private final org.wikipedia.dataclient.Service csrfService = null;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.csrf.CsrfTokenClient.Companion Companion = null;
    private static final java.util.concurrent.Semaphore MUTEX = null;
    private static final java.lang.String ANON_TOKEN = "+\\";
    private static final int MAX_RETRIES = 3;
    
    public CsrfTokenClient(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite loginWikiSite, int numRetries, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.Service csrfService) {
        super();
    }
    
    public CsrfTokenClient(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite site) {
        super();
    }
    
    public CsrfTokenClient(@org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite csrfWikiSite, @org.jetbrains.annotations.NotNull()
    org.wikipedia.dataclient.WikiSite loginWikiSite) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<java.lang.String> getToken() {
        return null;
    }
    
    private final void bailWithLogout() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/csrf/CsrfTokenClient$Companion;", "", "()V", "ANON_TOKEN", "", "MAX_RETRIES", "", "MUTEX", "Ljava/util/concurrent/Semaphore;", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}