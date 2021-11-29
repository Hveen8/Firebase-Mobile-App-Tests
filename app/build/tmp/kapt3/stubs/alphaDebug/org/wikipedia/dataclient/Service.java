package org.wikipedia.dataclient;

import java.lang.System;

/**
 * Retrofit service layer for all API interactions, including regular MediaWiki and RESTBase.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00b2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u0000 \u00b1\u00012\u00020\u0001:\u0002\u00b1\u0001J<\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010)\u001a\u0004\u0018\u00010*2\b\b\u0001\u0010+\u001a\u00020,2\n\b\u0001\u0010-\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010.\u001a\u0004\u0018\u00010*H\'J5\u0010/\u001a\u00020\u00042\n\b\u0001\u00100\u001a\u0004\u0018\u00010*2\n\b\u0001\u00101\u001a\u0004\u0018\u00010*2\n\b\u0001\u00102\u001a\u0004\u0018\u00010*H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J5\u00104\u001a\u00020\u00042\n\b\u0001\u00100\u001a\u0004\u0018\u00010*2\n\b\u0001\u00101\u001a\u0004\u0018\u00010*2\n\b\u0001\u00102\u001a\u0004\u0018\u00010*H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00103J\u0018\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00106\u001a\u00020*H\'J$\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00108\u001a\u00020*2\n\b\u0001\u00102\u001a\u0004\u0018\u00010*H\'J$\u00109\u001a\b\u0012\u0004\u0012\u00020:0\u00032\b\b\u0001\u0010;\u001a\u00020*2\n\b\u0001\u0010<\u001a\u0004\u0018\u00010*H\'J\u0018\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00106\u001a\u00020*H\'J\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010?\u001a\u00020*H\'J\"\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010A\u001a\u00020*2\b\b\u0001\u0010?\u001a\u00020*H\'J\"\u0010B\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u00106\u001a\u00020*2\b\b\u0001\u0010D\u001a\u00020*H\'J\"\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00106\u001a\u00020*2\b\b\u0001\u0010F\u001a\u00020*H\'J\u0018\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010F\u001a\u00020*H\'J\u0018\u0010H\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010I\u001a\u00020*H\'J\u0018\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00108\u001a\u00020*H\'J\u0018\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00106\u001a\u00020*H\'J\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00106\u001a\u00020*H\'J\u0018\u0010M\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00106\u001a\u00020*H\'J\u0018\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00106\u001a\u00020*H\'J\"\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00106\u001a\u00020*2\b\b\u0001\u0010P\u001a\u00020QH\'J\u0011\u0010\u001e\u001a\u00020\u001dH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010RJ.\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010T\u001a\u00020*2\b\b\u0001\u0010U\u001a\u00020,2\n\b\u0001\u0010V\u001a\u0004\u0018\u00010*H\'J\u0018\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010X\u001a\u00020*H\'J\"\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00106\u001a\u00020*2\b\b\u0001\u0010F\u001a\u00020*H\'J\u0018\u0010Z\u001a\b\u0012\u0004\u0012\u00020[0\u00032\b\b\u0001\u0010\\\u001a\u00020*H\'J\u0018\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00106\u001a\u00020*H\'J\"\u0010^\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00108\u001a\u00020*2\b\b\u0001\u0010_\u001a\u00020,H\'J\"\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u00108\u001a\u00020*2\b\b\u0001\u0010_\u001a\u00020,H\'J\"\u0010a\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u0010b\u001a\u00020*2\b\b\u0001\u0010c\u001a\u00020*H\'J\u0018\u0010d\u001a\b\u0012\u0004\u0012\u00020C0\u00032\b\b\u0001\u0010b\u001a\u00020*H\'J\u0011\u0010e\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010RJ0\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010g\u001a\u00020*2\n\b\u0001\u0010h\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010i\u001a\u0004\u0018\u00010*H\'J\u0018\u0010j\u001a\b\u0012\u0004\u0012\u00020k0\u00032\b\b\u0001\u0010l\u001a\u00020*H\'J\u0018\u0010m\u001a\b\u0012\u0004\u0012\u00020k0\u00032\b\b\u0001\u0010n\u001a\u00020*H\'J\u0018\u0010o\u001a\b\u0012\u0004\u0012\u00020k0\u00032\b\b\u0001\u0010p\u001a\u00020*H\'Jd\u0010q\u001a\b\u0012\u0004\u0012\u00020r0\u00032\b\b\u0001\u0010s\u001a\u00020*2\b\b\u0001\u0010t\u001a\u00020*2\b\b\u0001\u0010u\u001a\u00020*2\b\b\u0001\u0010g\u001a\u00020*2\b\b\u0001\u0010v\u001a\u00020*2\n\b\u0001\u0010w\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010x\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010y\u001a\u0004\u0018\u00010*H\'Jc\u0010z\u001a\b\u0012\u0004\u0012\u00020{0\u00032\b\b\u0001\u0010|\u001a\u00020*2\b\b\u0001\u0010}\u001a\u00020*2\b\b\u0001\u0010~\u001a\u00020*2\b\b\u0001\u00108\u001a\u00020*2\b\b\u0001\u0010\u007f\u001a\u00020*2\u000b\b\u0001\u0010\u0080\u0001\u001a\u0004\u0018\u00010*2\b\b\u0001\u0010g\u001a\u00020*2\n\b\u0001\u0010s\u001a\u0004\u0018\u00010*H\'JK\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020{0\u00032\t\b\u0001\u0010\u0082\u0001\u001a\u00020*2\b\b\u0001\u0010g\u001a\u00020*2\u000b\b\u0001\u0010\u0083\u0001\u001a\u0004\u0018\u00010*2\u000b\b\u0001\u0010\u0080\u0001\u001a\u0004\u0018\u00010*2\u000b\b\u0001\u0010\u0084\u0001\u001a\u0004\u0018\u00010*H\'J\u008e\u0001\u0010\u0085\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010\u00032\b\b\u0001\u00108\u001a\u00020*2\b\b\u0001\u0010_\u001a\u00020*2\u000b\b\u0001\u0010\u0087\u0001\u001a\u0004\u0018\u00010*2\t\b\u0001\u0010\u0080\u0001\u001a\u00020*2\n\b\u0001\u0010s\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010n\u001a\u0004\u0018\u00010*2\u000b\b\u0001\u0010\u0088\u0001\u001a\u0004\u0018\u00010*2\t\b\u0001\u0010\u0089\u0001\u001a\u00020Q2\b\b\u0001\u0010g\u001a\u00020*2\n\b\u0001\u0010x\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010y\u001a\u0004\u0018\u00010*H\'Jd\u0010\u008a\u0001\u001a\b\u0012\u0004\u0012\u00020{0\u00032\b\b\u0001\u0010|\u001a\u00020*2\b\b\u0001\u0010}\u001a\u00020*2\b\b\u0001\u0010~\u001a\u00020*2\b\b\u0001\u00108\u001a\u00020*2\b\b\u0001\u0010\u007f\u001a\u00020*2\u000b\b\u0001\u0010\u0080\u0001\u001a\u0004\u0018\u00010*2\b\b\u0001\u0010g\u001a\u00020*2\n\b\u0001\u0010s\u001a\u0004\u0018\u00010*H\'JA\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\u00032\n\b\u0001\u0010s\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010t\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010g\u001a\u0004\u0018\u00010*2\u000b\b\u0001\u0010\u008d\u0001\u001a\u0004\u0018\u00010*H\'JZ\u0010\u008b\u0001\u001a\t\u0012\u0005\u0012\u00030\u008c\u00010\u00032\n\b\u0001\u0010s\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010t\u001a\u0004\u0018\u00010*2\u000b\b\u0001\u0010\u008e\u0001\u001a\u0004\u0018\u00010*2\u000b\b\u0001\u0010\u008f\u0001\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010g\u001a\u0004\u0018\u00010*2\n\b\u0001\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\'J\u001a\u0010\u0092\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010\u00032\b\b\u0001\u0010g\u001a\u00020*H\'J0\u0010\u0094\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010\u00032\t\b\u0001\u0010\u0095\u0001\u001a\u00020*2\b\b\u0001\u0010g\u001a\u00020*2\t\b\u0001\u0010\u0096\u0001\u001a\u00020*H\'J?\u0010\u0097\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010\u00032\t\b\u0001\u0010\u0098\u0001\u001a\u00020*2\b\b\u0001\u0010g\u001a\u00020*2\u000b\b\u0001\u0010\u0080\u0001\u001a\u0004\u0018\u00010*2\u000b\b\u0001\u0010\u0084\u0001\u001a\u0004\u0018\u00010*H\'J%\u0010\u0099\u0001\u001a\t\u0012\u0005\u0012\u00030\u0093\u00010\u00032\t\b\u0001\u0010\u009a\u0001\u001a\u00020*2\b\b\u0001\u0010g\u001a\u00020*H\'J$\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020{0\u00032\t\b\u0001\u0010\u009c\u0001\u001a\u00020Q2\b\b\u0001\u0010g\u001a\u00020*H\'J/\u0010\u009d\u0001\u001a\t\u0012\u0005\u0012\u00030\u0086\u00010\u00032\b\b\u0001\u00108\u001a\u00020*2\t\b\u0001\u0010\u009e\u0001\u001a\u00020Q2\b\b\u0001\u0010g\u001a\u00020*H\'JR\u0010\u009f\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a0\u00010\u00032\u000b\b\u0001\u0010\u00a1\u0001\u001a\u0004\u0018\u00010,2\n\b\u0001\u0010I\u001a\u0004\u0018\u00010*2\n\b\u0001\u00106\u001a\u0004\u0018\u00010*2\u000b\b\u0001\u0010\u00a2\u0001\u001a\u0004\u0018\u00010*2\b\b\u0001\u0010g\u001a\u00020*H\'\u00a2\u0006\u0003\u0010\u00a3\u0001J4\u0010\u00a4\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a5\u00010\u00032\n\b\u0001\u00108\u001a\u0004\u0018\u00010*2\t\b\u0001\u0010\u00a6\u0001\u001a\u00020,2\u000b\b\u0001\u0010\u00a7\u0001\u001a\u0004\u0018\u00010*H\'J0\u0010\u00a8\u0001\u001a\t\u0012\u0005\u0012\u00030\u00a9\u00010\u00032\b\b\u0001\u0010)\u001a\u00020*2\t\b\u0001\u0010\u00aa\u0001\u001a\u00020*2\t\b\u0001\u0010\u00ab\u0001\u001a\u00020*H\'J$\u0010\u00ac\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020*2\t\b\u0001\u0010\u00ad\u0001\u001a\u00020*H\'J\u0012\u0010\u00ae\u0001\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010RJ\u0012\u0010\u00af\u0001\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010RJ$\u0010\u00b0\u0001\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020*2\t\b\u0001\u0010\u00ad\u0001\u001a\u00020*H\'R\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u001c\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n8gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0006R\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0006R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0006R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0006R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u0006R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001b\u0010\u0006R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0006R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b!\u0010\u0006R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b#\u0010\u0006R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b%\u0010\u0006R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038gX\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\'\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u00b2\u0001"}, d2 = {"Lorg/wikipedia/dataclient/Service;", "", "authManagerInfo", "Lio/reactivex/rxjava3/core/Observable;", "Lorg/wikipedia/dataclient/mwapi/MwQueryResponse;", "getAuthManagerInfo", "()Lio/reactivex/rxjava3/core/Observable;", "csrfToken", "getCsrfToken", "csrfTokenCall", "Lretrofit2/Call;", "getCsrfTokenCall", "()Lretrofit2/Call;", "editorTaskCounts", "getEditorTaskCounts", "loginToken", "getLoginToken", "newCaptcha", "Lorg/wikipedia/captcha/Captcha;", "getNewCaptcha", "randomWithImageInfo", "getRandomWithImageInfo", "randomWithImageLabels", "getRandomWithImageLabels", "randomWithPageProps", "getRandomWithPageProps", "siteInfo", "getSiteInfo", "siteMatrix", "Lorg/wikipedia/dataclient/mwapi/SiteMatrix;", "getSiteMatrix", "streamConfigs", "Lorg/wikipedia/dataclient/mwapi/MwStreamConfigsResponse;", "getStreamConfigs", "userInfo", "getUserInfo", "watchToken", "getWatchToken", "watchlist", "getWatchlist", "fullTextSearch", "searchTerm", "", "gsrLimit", "", "cont", "gsrOffset", "getAllNotifications", "wikiList", "filter", "continueStr", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllNotificationsKT", "getCategories", "titles", "getCategoryMembers", "title", "getClaims", "Lorg/wikipedia/dataclient/wikidata/Claims;", "entity", "property", "getDescription", "getEditorTaskMissingDescriptions", "targetLanguage", "getEditorTaskTranslatableDescriptions", "sourceLanguage", "getEntitiesByTitle", "Lorg/wikipedia/dataclient/wikidata/Entities;", "sites", "getImageInfo", "lang", "getImagesWithUnreviewedLabels", "getInfoByPageId", "pageIds", "getLangLinks", "getLastModified", "getPageImages", "getPageViewsForTitles", "getProtectionInfo", "getRevisionDetails", "revisionStartId", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserContributions", "username", "maxCount", "uccontinue", "getUserList", "userNames", "getVideoInfo", "getVisualEditorMetadata", "Lorg/wikipedia/dataclient/mwapi/MwVisualEditorResponse;", "page", "getWatchedInfo", "getWikiTextForSection", "section", "getWikiTextForSectionWithInfo", "getWikidataLabels", "idList", "langList", "getWikidataLabelsAndDescriptions", "lastUnreadNotification", "markRead", "token", "readList", "unreadList", "parsePage", "Lorg/wikipedia/dataclient/mwapi/MwParseResponse;", "pageTitle", "parseText", "text", "parseTextForMainPage", "mainPageTitle", "postCreateAccount", "Lorg/wikipedia/dataclient/mwapi/CreateAccountResponse;", "user", "pass", "retype", "returnurl", "email", "captchaId", "captchaWord", "postDescriptionEdit", "Lorg/wikipedia/dataclient/wikidata/EntityPostResponse;", "language", "useLang", "site", "newDescription", "summary", "postEditEntity", "id", "data", "tags", "postEditSubmit", "Lorg/wikipedia/edit/Edit;", "newSectionTitle", "appendText", "baseRevId", "postLabelEdit", "postLogIn", "Lorg/wikipedia/login/LoginClient$LoginResponse;", "url", "retypedPass", "twoFactorCode", "loginContinue", "", "postLogout", "Lorg/wikipedia/dataclient/mwapi/MwPostResponse;", "postReviewImageLabels", "fileName", "batchLabels", "postSetClaim", "claim", "postSetOptions", "change", "postThanksToRevision", "revisionId", "postUndoEdit", "revision", "postWatch", "Lorg/wikipedia/dataclient/watch/WatchPostResponse;", "unwatch", "expiry", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/reactivex/rxjava3/core/Observable;", "prefixSearch", "Lorg/wikipedia/search/PrefixSearchResponse;", "maxResults", "repeat", "searchEntities", "Lorg/wikipedia/dataclient/wikidata/Search;", "searchLang", "resultLang", "subscribePush", "providerToken", "unreadNotificationWikis", "unreadNotificationWikisKT", "unsubscribePush", "Companion", "app_alphaDebug"})
public abstract interface Service {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.dataclient.Service.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIKIPEDIA_URL = "https://wikipedia.org/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String WIKIDATA_URL = "https://www.wikidata.org/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String COMMONS_URL = "https://commons.wikimedia.org/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String URL_FRAGMENT_FROM_COMMONS = "/wikipedia/commons/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String MW_API_PREFIX = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&";
    public static final int PREFERRED_THUMB_SIZE = 320;
    public static final int SITE_INFO_MAXAGE = 86400;
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=pageimages&piprop=thumbnail&converttitles=&pilicense=any&pithumbsize=320")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getPageImages(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String titles);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&redirects=&converttitles=&prop=description|pageimages|info&piprop=thumbnail&pilicense=any&generator=prefixsearch&gpsnamespace=0&list=search&srnamespace=0&inprop=varianttitles&srwhat=text&srinfo=suggestion&srprop=&sroffset=0&srlimit=1&pithumbsize=320")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.search.PrefixSearchResponse> prefixSearch(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "gpssearch")
    java.lang.String title, @retrofit2.http.Query(value = "gpslimit")
    int maxResults, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "srsearch")
    java.lang.String repeat);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&converttitles=&prop=description|pageimages|pageprops|info&ppprop=mainpage|disambiguation&generator=search&gsrnamespace=0&gsrwhat=text&inprop=varianttitles&gsrinfo=&gsrprop=redirecttitle&piprop=thumbnail&pilicense=any&pithumbsize=320")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> fullTextSearch(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "gsrsearch")
    java.lang.String searchTerm, @retrofit2.http.Query(value = "gsrlimit")
    int gsrLimit, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "continue")
    java.lang.String cont, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "gsroffset")
    java.lang.String gsrOffset);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=fancycaptchareload")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.captcha.Captcha> getNewCaptcha();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=langlinks&lllimit=500&redirects=&converttitles=")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getLangLinks(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String title);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=description&redirects=1")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getDescription(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String titles);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info|description&inprop=varianttitles&redirects=1")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getInfoByPageId(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "pageids")
    java.lang.String pageIds);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=imageinfo|imagelabels&iiprop=timestamp|user|url|mime|extmetadata&iiurlwidth=320")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getImageInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "iiextmetadatalanguage")
    java.lang.String lang);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=videoinfo|imagelabels&viprop=timestamp|user|url|mime|extmetadata|derivatives&viurlwidth=320")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getVideoInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "viextmetadatalanguage")
    java.lang.String lang);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=userinfo&prop=info&inprop=protection&uiprop=groups")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getProtectionInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String titles);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=sitematrix&smtype=language&smlangprop=code|name|localname&maxage=86400&smaxage=86400")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.SiteMatrix> getSiteMatrix();
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=sitematrix&smtype=language&smlangprop=code|name|localname&maxage=86400&smaxage=86400")
    public abstract java.lang.Object getSiteMatrix(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.SiteMatrix> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=siteinfo&maxage=86400&smaxage=86400")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getSiteInfo();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=parse&prop=text&mobileformat=1")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwParseResponse> parsePage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String pageTitle);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=parse&prop=text&mobileformat=1")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwParseResponse> parseText(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "text")
    java.lang.String text);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=parse&prop=text&mobileformat=1&mainpage=1")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwParseResponse> parseTextForMainPage(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String mainPageTitle);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=random&redirects=1&grnnamespace=0&grnlimit=50&prop=pageprops|description")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getRandomWithPageProps();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=random&redirects=1&grnnamespace=6&grnlimit=100&prop=imagelabels")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getRandomWithImageLabels();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=categories&clprop=hidden&cllimit=500")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getCategories(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String titles);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=categorymembers&cmlimit=500")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getCategoryMembers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "cmtitle")
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "cmcontinue")
    java.lang.String continueStr);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=random&redirects=1&grnnamespace=6&grnlimit=10&prop=description|imageinfo|revisions&rvprop=ids|timestamp|flags|comment|user|content&rvslots=mediainfo&iiprop=timestamp|user|url|mime|extmetadata&iiurlwidth=320")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getRandomWithImageInfo();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=unreviewedimagelabels&guillimit=10&prop=imagelabels|imageinfo&iiprop=timestamp|user|url|mime|extmetadata&iiurlwidth=320")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getImagesWithUnreviewedLabels(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "uselang")
    java.lang.String lang);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=options")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwPostResponse> postSetOptions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "change")
    java.lang.String change, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=streamconfigs&format=json&constraints=destination_event_service=eventgate-analytics-external")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwStreamConfigsResponse> getStreamConfigs();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=tokens&type=csrf")
    public abstract retrofit2.Call<org.wikipedia.dataclient.mwapi.MwQueryResponse> getCsrfTokenCall();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=tokens&type=csrf")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getCsrfToken();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=createaccount&createmessageformat=html")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.CreateAccountResponse> postCreateAccount(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "username")
    java.lang.String user, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "password")
    java.lang.String pass, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "retype")
    java.lang.String retype, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "createtoken")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "createreturnurl")
    java.lang.String returnurl, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "email")
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "captchaId")
    java.lang.String captchaId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "captchaWord")
    java.lang.String captchaWord);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=tokens&type=login")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getLoginToken();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=clientlogin&rememberMe=")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.login.LoginClient.LoginResponse> postLogIn(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "username")
    java.lang.String user, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "password")
    java.lang.String pass, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "logintoken")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "loginreturnurl")
    java.lang.String url);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=clientlogin&rememberMe=")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.login.LoginClient.LoginResponse> postLogIn(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "username")
    java.lang.String user, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "password")
    java.lang.String pass, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "retype")
    java.lang.String retypedPass, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "OATHToken")
    java.lang.String twoFactorCode, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "logintoken")
    java.lang.String token, @retrofit2.http.Field(value = "logincontinue")
    boolean loginContinue);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=logout")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwPostResponse> postLogout(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=authmanagerinfo|tokens&amirequestsfor=create&type=createaccount")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getAuthManagerInfo();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=userinfo&uiprop=groups|blockinfo|editcount|latestcontrib")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getUserInfo();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=users&usprop=groups|cancreate")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getUserList(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ususers")
    java.lang.String userNames);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=notifications&notformat=model&notlimit=max")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract java.lang.Object getAllNotifications(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "notwikis")
    java.lang.String wikiList, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "notfilter")
    java.lang.String filter, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "notcontinue")
    java.lang.String continueStr, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=notifications&notformat=model&notlimit=max")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract java.lang.Object getAllNotificationsKT(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "notwikis")
    java.lang.String wikiList, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "notfilter")
    java.lang.String filter, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "notcontinue")
    java.lang.String continueStr, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=echomarkread")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> markRead(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "list")
    java.lang.String readList, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "unreadlist")
    java.lang.String unreadList);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=notifications&notwikis=*&notprop=list&notfilter=!read&notlimit=1")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract java.lang.Object lastUnreadNotification(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=unreadnotificationpages&unplimit=max&unpwikis=*")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract java.lang.Object unreadNotificationWikis(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=unreadnotificationpages&unplimit=max&unpwikis=*")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract java.lang.Object unreadNotificationWikisKT(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super org.wikipedia.dataclient.mwapi.MwQueryResponse> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=echopushsubscriptions&command=create&provider=fcm")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> subscribePush(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String csrfToken, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "providertoken")
    java.lang.String providerToken);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=echopushsubscriptions&command=delete&provider=fcm")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> unsubscribePush(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String csrfToken, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "providertoken")
    java.lang.String providerToken);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=revisions&rvprop=content|timestamp|ids&rvlimit=1&converttitles=")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getWikiTextForSection(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String title, @retrofit2.http.Query(value = "rvsection")
    int section);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=revisions|info&rvprop=content|timestamp|ids&rvlimit=1&converttitles=&intestactions=edit&intestactionsdetail=full")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getWikiTextForSectionWithInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String title, @retrofit2.http.Query(value = "rvsection")
    int section);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=edit")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.edit.Edit> postUndoEdit(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "title")
    java.lang.String title, @retrofit2.http.Field(value = "undo")
    long revision, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=edit")
    @retrofit2.http.FormUrlEncoded()
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.edit.Edit> postEditSubmit(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "title")
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "section")
    java.lang.String section, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "sectiontitle")
    java.lang.String newSectionTitle, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "summary")
    java.lang.String summary, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "assert")
    java.lang.String user, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "text")
    java.lang.String text, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "appendtext")
    java.lang.String appendText, @retrofit2.http.Field(value = "baserevid")
    long baseRevId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "captchaid")
    java.lang.String captchaId, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "captchaword")
    java.lang.String captchaWord);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=usercontribs&ucprop=ids|title|timestamp|comment|size|flags|sizediff|tags&meta=userinfo&uiprop=groups|blockinfo|editcount|latestcontrib")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getUserContributions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ucuser")
    java.lang.String username, @retrofit2.http.Query(value = "uclimit")
    int maxCount, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "uccontinue")
    java.lang.String uccontinue);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=pageviews")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getPageViewsForTitles(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String titles);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=wikimediaeditortaskscounts|userinfo&uiprop=groups|blockinfo|editcount|latestcontrib")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getEditorTaskCounts();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=wikimediaeditortaskssuggestions&prop=pageprops&gwetstask=missingdescriptions&gwetslimit=3")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getEditorTaskMissingDescriptions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "gwetstarget")
    java.lang.String targetLanguage);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&generator=wikimediaeditortaskssuggestions&prop=pageprops&gwetstask=descriptiontranslations&gwetslimit=3")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getEditorTaskTranslatableDescriptions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "gwetssource")
    java.lang.String sourceLanguage, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "gwetstarget")
    java.lang.String targetLanguage);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbgetentities")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.wikidata.Entities> getEntitiesByTitle(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String titles, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "sites")
    java.lang.String sites);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbsearchentities&type=item&limit=20")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.wikidata.Search> searchEntities(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "search")
    java.lang.String searchTerm, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "language")
    java.lang.String searchLang, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "uselang")
    java.lang.String resultLang);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbgetentities&props=labels&languagefallback=1")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.wikidata.Entities> getWikidataLabels(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ids")
    java.lang.String idList, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "languages")
    java.lang.String langList);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbgetclaims")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.wikidata.Claims> getClaims(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "entity")
    java.lang.String entity, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Query(value = "property")
    java.lang.String property);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbgetentities&props=descriptions|labels|sitelinks")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.wikidata.Entities> getWikidataLabelsAndDescriptions(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "ids")
    java.lang.String idList);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbsetclaim&errorlang=uselang")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwPostResponse> postSetClaim(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "claim")
    java.lang.String claim, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "summary")
    java.lang.String summary, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "tags")
    java.lang.String tags);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbsetdescription&errorlang=uselang")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.wikidata.EntityPostResponse> postDescriptionEdit(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "uselang")
    java.lang.String useLang, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "site")
    java.lang.String site, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "title")
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "value")
    java.lang.String newDescription, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "summary")
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "assert")
    java.lang.String user);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbsetlabel&errorlang=uselang")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.wikidata.EntityPostResponse> postLabelEdit(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "language")
    java.lang.String language, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "uselang")
    java.lang.String useLang, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "site")
    java.lang.String site, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "title")
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "value")
    java.lang.String newDescription, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "summary")
    java.lang.String summary, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "assert")
    java.lang.String user);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=wbeditentity&errorlang=uselang")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.wikidata.EntityPostResponse> postEditEntity(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "id")
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "data")
    java.lang.String data, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "summary")
    java.lang.String summary, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "tags")
    java.lang.String tags);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=reviewimagelabels")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwPostResponse> postReviewImageLabels(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "filename")
    java.lang.String fileName, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "batch")
    java.lang.String batchLabels);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=visualeditor&paction=metadata")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwVisualEditorResponse> getVisualEditorMetadata(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=info&converttitles=&redirects=&inprop=watched")
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getWatchedInfo(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String titles);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&list=watchlist&wllimit=500&wlallrev=1&wlprop=ids|title|flags|comment|parsedcomment|timestamp|sizes|user|loginfo")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getWatchlist();
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=revisions&rvprop=timestamp|user|ids|comment|tags")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getLastModified(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String titles);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&prop=revisions&rvprop=ids|timestamp|flags|comment|user&rvlimit=2&rvdir=newer")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getRevisionDetails(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "titles")
    java.lang.String titles, @retrofit2.http.Query(value = "rvstartid")
    long revisionStartId);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=thank")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.wikidata.EntityPostResponse> postThanksToRevision(@retrofit2.http.Field(value = "rev")
    long revisionId, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.FormUrlEncoded()
    @retrofit2.http.POST(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=watch&converttitles=&redirects=")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.watch.WatchPostResponse> postWatch(@org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "unwatch")
    java.lang.Integer unwatch, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "pageids")
    java.lang.String pageIds, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "titles")
    java.lang.String titles, @org.jetbrains.annotations.Nullable()
    @retrofit2.http.Field(value = "expiry")
    java.lang.String expiry, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Field(value = "token")
    java.lang.String token);
    
    @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Headers(value = {"Cache-Control: no-cache"})
    @retrofit2.http.GET(value = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&action=query&meta=tokens&type=watch")
    public abstract io.reactivex.rxjava3.core.Observable<org.wikipedia.dataclient.mwapi.MwQueryResponse> getWatchToken();
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/dataclient/Service$Companion;", "", "()V", "COMMONS_URL", "", "MW_API_PREFIX", "PREFERRED_THUMB_SIZE", "", "SITE_INFO_MAXAGE", "URL_FRAGMENT_FROM_COMMONS", "WIKIDATA_URL", "WIKIPEDIA_URL", "app_alphaDebug"})
    public static final class Companion {
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WIKIPEDIA_URL = "https://wikipedia.org/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String WIKIDATA_URL = "https://www.wikidata.org/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String COMMONS_URL = "https://commons.wikimedia.org/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String URL_FRAGMENT_FROM_COMMONS = "/wikipedia/commons/";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String MW_API_PREFIX = "w/api.php?format=json&formatversion=2&errorformat=html&errorsuselocal=1&";
        public static final int PREFERRED_THUMB_SIZE = 320;
        public static final int SITE_INFO_MAXAGE = 86400;
        
        private Companion() {
            super();
        }
    }
}