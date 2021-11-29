package org.wikipedia.media;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u0016\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\tR\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0003\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lorg/wikipedia/media/AvPlayer;", "", "()V", "isPlaying", "", "()Z", "player", "Lorg/wikipedia/media/MediaPlayerImplementation;", "deinit", "", "pause", "play", "path", "", "callback", "Lorg/wikipedia/media/AvPlayer$Callback;", "stop", "Callback", "app_alphaDebug"})
public final class AvPlayer {
    private final org.wikipedia.media.MediaPlayerImplementation player = null;
    
    public AvPlayer() {
        super();
    }
    
    public final boolean isPlaying() {
        return false;
    }
    
    public final void deinit() {
    }
    
    public final void play(@org.jetbrains.annotations.NotNull()
    java.lang.String path, @org.jetbrains.annotations.NotNull()
    org.wikipedia.media.AvPlayer.Callback callback) {
    }
    
    public final void pause() {
    }
    
    public final void stop() {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lorg/wikipedia/media/AvPlayer$Callback;", "", "onError", "", "onSuccess", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onSuccess();
        
        public abstract void onError();
    }
}