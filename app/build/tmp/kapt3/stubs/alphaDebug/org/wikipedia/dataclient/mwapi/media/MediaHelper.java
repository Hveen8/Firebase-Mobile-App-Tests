package org.wikipedia.dataclient.mwapi.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00070\u00062\u0006\u0010\b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lorg/wikipedia/dataclient/mwapi/media/MediaHelper;", "", "()V", "COMMONS_DB_NAME", "", "getImageCaptions", "Lio/reactivex/rxjava3/core/Observable;", "", "fileName", "app_alphaDebug"})
public final class MediaHelper {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.mwapi.media.MediaHelper INSTANCE = null;
    private static final java.lang.String COMMONS_DB_NAME = "commonswiki";
    
    private MediaHelper() {
        super();
    }
    
    /**
     * Returns a map of "language":"caption" combinations for a particular file on Commons.
     */
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Observable<java.util.Map<java.lang.String, java.lang.String>> getImageCaptions(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName) {
        return null;
    }
}