package org.wikipedia.analytics.eventplatform;

import java.lang.System;

/**
 * Event Platform intake service interface.
 *
 * To match the existing event logging behavior, we send hastily, i.e., we ask the service to
 * respond immediately, before events are processed and regardless of whether they are
 * ultimately processed successfully.
 *
 * TODO: In the future, consider updating to wait for processing and handle partial-success and
 * failure responses.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J)\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0013\b\u0001\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\b\tH\'J)\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\u0013\b\u0001\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\b\tH\'\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/analytics/eventplatform/EventService;", "", "postEvents", "Lio/reactivex/rxjava3/core/Observable;", "Lretrofit2/Response;", "Lorg/wikipedia/analytics/eventplatform/EventServiceResponse;", "events", "", "Lorg/wikipedia/analytics/eventplatform/Event;", "Lkotlin/jvm/JvmSuppressWildcards;", "postEventsHasty", "", "app_alphaDebug"})
public abstract interface EventService {
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/v1/events?hasty=true")
    public abstract io.reactivex.rxjava3.core.Observable<retrofit2.Response<kotlin.Unit>> postEventsHasty(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.List<org.wikipedia.analytics.eventplatform.Event> events);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "/v1/events")
    public abstract io.reactivex.rxjava3.core.Observable<retrofit2.Response<org.wikipedia.analytics.eventplatform.EventServiceResponse>> postEvents(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Body()
    java.util.List<org.wikipedia.analytics.eventplatform.Event> events);
}