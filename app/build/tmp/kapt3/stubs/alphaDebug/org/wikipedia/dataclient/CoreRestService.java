package org.wikipedia.dataclient;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\'\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/CoreRestService;", "", "getDiff", "Lio/reactivex/rxjava3/core/Observable;", "Lorg/wikipedia/dataclient/restbase/DiffResponse;", "oldRev", "", "newRev", "Companion", "app_alphaDebug"})
public abstract interface CoreRestService {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.CoreRestService.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CORE_REST_API_PREFIX = "w/rest.php/v1/";
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "revision/{oldRev}/compare/{newRev}")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.restbase.DiffResponse> getDiff(@retrofit2.http.Path(value = "oldRev")
    long oldRev, @retrofit2.http.Path(value = "newRev")
    long newRev);
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/dataclient/CoreRestService$Companion;", "", "()V", "CORE_REST_API_PREFIX", "", "app_alphaDebug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String CORE_REST_API_PREFIX = "w/rest.php/v1/";
        
        private Companion() {
            super();
        }
    }
}