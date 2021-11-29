package org.wikipedia.concurrency;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0001J\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0007R<\u0010\u0003\u001a0\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001 \u0005*\u0017\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\u0004\u00a2\u0006\u0002\b\u00060\u0004\u00a2\u0006\u0002\b\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R<\u0010\u0007\u001a0\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001 \u0005*\u0017\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00010\u0001\u0018\u00010\b\u00a2\u0006\u0002\b\u00060\b\u00a2\u0006\u0002\b\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/concurrency/RxBus;", "", "()V", "bus", "Lio/reactivex/rxjava3/subjects/Subject;", "kotlin.jvm.PlatformType", "Lio/reactivex/rxjava3/annotations/NonNull;", "observable", "Lio/reactivex/rxjava3/core/Observable;", "post", "", "o", "subscribe", "Lio/reactivex/rxjava3/disposables/Disposable;", "consumer", "Lio/reactivex/rxjava3/functions/Consumer;", "app_alphaDebug"})
public final class RxBus {
    private final io.reactivex.rxjava3.subjects.Subject<java.lang.Object> bus = null;
    private final io.reactivex.rxjava3.core.Observable<java.lang.Object> observable = null;
    
    public RxBus() {
        super();
    }
    
    public final void post(@org.jetbrains.annotations.NotNull()
    java.lang.Object o) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @io.reactivex.rxjava3.annotations.CheckReturnValue()
    public final io.reactivex.rxjava3.disposables.Disposable subscribe(@org.jetbrains.annotations.NotNull()
    io.reactivex.rxjava3.functions.Consumer<java.lang.Object> consumer) {
        return null;
    }
}