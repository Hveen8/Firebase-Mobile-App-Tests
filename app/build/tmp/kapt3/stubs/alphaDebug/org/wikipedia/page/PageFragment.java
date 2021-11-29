package org.wikipedia.page;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u00c0\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 \u0093\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\f\u0091\u0002\u0092\u0002\u0093\u0002\u0094\u0002\u0095\u0002\u0096\u0002B\u0005\u00a2\u0006\u0002\u0010\bJ\u0013\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u0097\u0001\u001a\u00020\u0015H\u0002J%\u0010\u0098\u0001\u001a\u00030\u0096\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u009b\u0001\u001a\u000200J\n\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u009d\u0001J\b\u0010\u009e\u0001\u001a\u00030\u0096\u0001J\n\u0010\u009f\u0001\u001a\u00030\u0096\u0001H\u0002J\u0016\u0010\u00a0\u0001\u001a\u00030\u0096\u00012\n\u0010\u00a1\u0001\u001a\u0005\u0018\u00010\u00a2\u0001H\u0002J\n\u0010\u00a3\u0001\u001a\u00030\u0096\u0001H\u0002J\u0013\u0010\u00a4\u0001\u001a\u00020}2\b\u0010\u00a5\u0001\u001a\u00030\u00a6\u0001H\u0002J\b\u0010\u00a7\u0001\u001a\u00030\u0096\u0001J\u0014\u0010\u00a8\u0001\u001a\u00030\u0096\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u0001H\u0002J\n\u0010\u00a9\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00aa\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00ab\u0001\u001a\u00030\u0096\u0001H\u0002J\u001b\u0010\u00ac\u0001\u001a\u00030\u0096\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u00ad\u0001\u001a\u000208J8\u0010\u00ac\u0001\u001a\u00030\u0096\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u00ad\u0001\u001a\u0002082\u0007\u0010\u00ae\u0001\u001a\u0002002\u0007\u0010\u00af\u0001\u001a\u0002002\t\b\u0002\u0010\u00b0\u0001\u001a\u000200J8\u0010\u00ac\u0001\u001a\u00030\u0096\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u00ad\u0001\u001a\u0002082\u0007\u0010\u00ae\u0001\u001a\u0002002\u0007\u0010\u00b1\u0001\u001a\u00020\u00152\t\b\u0002\u0010\u00b0\u0001\u001a\u000200J\n\u0010\u00b2\u0001\u001a\u00030\u0096\u0001H\u0002J.\u0010\u00b3\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u00b4\u0001\u001a\u00020e2\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0099\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u00b5\u0001\u001a\u000200J\u0012\u0010\u00b6\u0001\u001a\u00030\u0096\u00012\b\u0010\u00b7\u0001\u001a\u00030\u00b8\u0001J(\u0010\u00b9\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u00ba\u0001\u001a\u00020\u00152\u0007\u0010\u00bb\u0001\u001a\u00020\u00152\n\u0010\u00bc\u0001\u001a\u0005\u0018\u00010\u00bd\u0001H\u0016J\t\u0010\u00be\u0001\u001a\u000200H\u0016J\n\u0010\u00bf\u0001\u001a\u00030\u0096\u0001H\u0016J\u0014\u0010\u00c0\u0001\u001a\u00030\u0096\u00012\b\u0010\u00c1\u0001\u001a\u00030\u00c2\u0001H\u0016J,\u0010\u00c3\u0001\u001a\u00030\u00c4\u00012\b\u0010\u00c5\u0001\u001a\u00030\u00c6\u00012\n\u0010\u00c7\u0001\u001a\u0005\u0018\u00010\u00c8\u00012\n\u0010\u00c9\u0001\u001a\u0005\u0018\u00010\u00ca\u0001H\u0016J\n\u0010\u00cb\u0001\u001a\u00030\u0096\u0001H\u0016J\u0014\u0010\u00cc\u0001\u001a\u00030\u0096\u00012\b\u0010\u00cd\u0001\u001a\u00030\u00ce\u0001H\u0016J\u0012\u0010\u00cf\u0001\u001a\u00030\u0096\u00012\b\u0010\u00a1\u0001\u001a\u00030\u00a2\u0001J\b\u0010\u00d0\u0001\u001a\u00030\u0096\u0001J\n\u0010\u00d1\u0001\u001a\u00030\u0096\u0001H\u0002J\n\u0010\u00d2\u0001\u001a\u00030\u0096\u0001H\u0016J\n\u0010\u00d3\u0001\u001a\u00030\u0096\u0001H\u0016J\u0014\u0010\u00d4\u0001\u001a\u00030\u0096\u00012\b\u0010\u00d5\u0001\u001a\u00030\u00ca\u0001H\u0016J\n\u0010\u00d6\u0001\u001a\u00030\u0096\u0001H\u0016J \u0010\u00d7\u0001\u001a\u00030\u0096\u00012\b\u0010\u00d8\u0001\u001a\u00030\u00c4\u00012\n\u0010\u00c9\u0001\u001a\u0005\u0018\u00010\u00ca\u0001H\u0016J\u001b\u0010\u00d9\u0001\u001a\u00030\u0096\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u00ad\u0001\u001a\u000208J\u001b\u0010\u00da\u0001\u001a\u00030\u0096\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u00ad\u0001\u001a\u000208J\u001b\u0010\u00db\u0001\u001a\u00030\u0096\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u00ad\u0001\u001a\u000208J&\u0010\u00dc\u0001\u001a\u00030\u0096\u00012\b\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u00ad\u0001\u001a\u0002082\u0007\u0010\u00dd\u0001\u001a\u00020\u0015H\u0002J\u0013\u0010\u00de\u0001\u001a\u00030\u0096\u00012\t\b\u0002\u0010\u00b1\u0001\u001a\u00020\u0015J\b\u0010\u00df\u0001\u001a\u00030\u0096\u0001J\u0011\u0010\u00e0\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u00e1\u0001\u001a\u00020?J\u0013\u0010\u00e2\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u00e3\u0001\u001a\u000200H\u0002J\u001d\u0010\u00e4\u0001\u001a\u00030\u0096\u00012\b\u0010\u00e5\u0001\u001a\u00030\u00e6\u00012\u0007\u0010\u00e7\u0001\u001a\u000200H\u0002J\u0013\u0010\u00e8\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u00dd\u0001\u001a\u00020\u0015H\u0002J\n\u0010\u00e9\u0001\u001a\u00030\u0096\u0001H\u0002J\b\u0010\u00ea\u0001\u001a\u00030\u0096\u0001J\u0013\u0010\u00eb\u0001\u001a\u0002002\b\u0010\u00ec\u0001\u001a\u00030\u00ed\u0001H\u0002J\u0012\u0010\u00ee\u0001\u001a\u00030\u0096\u00012\b\u0010\u00ef\u0001\u001a\u00030\u00f0\u0001J\b\u0010\u00f1\u0001\u001a\u00030\u0096\u0001J-\u0010\u00f2\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u00f3\u0001\u001a\u00020?2\u000f\u0010\u00f4\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010?0`2\u0007\u0010\u00f5\u0001\u001a\u00020?H\u0002J\u001e\u0010\u00f6\u0001\u001a\u00030\u0096\u00012\b\u0010\u00cd\u0001\u001a\u00030\u00ce\u00012\b\u0010\u00f7\u0001\u001a\u00030\u00f8\u0001H\u0002J\u0013\u0010\u00f9\u0001\u001a\u00030\u0096\u00012\t\u0010\u00fa\u0001\u001a\u0004\u0018\u00010?J\u0013\u0010\u00fb\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u00fc\u0001\u001a\u00020?H\u0002J\n\u0010\u00fd\u0001\u001a\u00030\u0096\u0001H\u0002J\u0012\u0010\u00fe\u0001\u001a\u00030\u0096\u00012\b\u0010\u00ff\u0001\u001a\u00030\u0080\u0002J\u0014\u0010\u0081\u0002\u001a\u00030\u0096\u00012\b\u0010\u0082\u0002\u001a\u00030\u0081\u0001H\u0002J\n\u0010\u0083\u0002\u001a\u00030\u0096\u0001H\u0002J\b\u0010\u0084\u0002\u001a\u00030\u0096\u0001J\b\u0010\u0085\u0002\u001a\u00030\u0096\u0001J\b\u0010\u0086\u0002\u001a\u00030\u0096\u0001J\u0012\u0010\u0087\u0002\u001a\u00030\u0096\u00012\b\u0010\u0088\u0002\u001a\u00030\u0089\u0002J\u0013\u0010\u008a\u0002\u001a\u00030\u0096\u00012\u0007\u0010\u008b\u0002\u001a\u000200H\u0002J\u001b\u0010\u008c\u0002\u001a\u00030\u0096\u00012\b\u0010\u00cd\u0001\u001a\u00030\u00ce\u00012\u0007\u0010\u008d\u0002\u001a\u000200J\u0013\u0010\u008e\u0002\u001a\u00030\u0096\u00012\t\u0010\u00fa\u0001\u001a\u0004\u0018\u00010?J\u0013\u0010\u008f\u0002\u001a\u00030\u0096\u00012\u0007\u0010\u0090\u0002\u001a\u00020?H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0018\u00010\u0011R\u00020\u0000X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\n8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u001f\u001a\u00020 8F\u00a2\u0006\u0006\u001a\u0004\b!\u0010\"R\u0011\u0010#\u001a\u00020$8F\u00a2\u0006\u0006\u001a\u0004\b%\u0010&R\u000e\u0010\'\u001a\u00020(X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u00101\u001a\u00020\u00158BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b2\u0010\u0017R\u0011\u00103\u001a\u0002048F\u00a2\u0006\u0006\u001a\u0004\b5\u00106R\u0013\u00107\u001a\u0004\u0018\u0001088F\u00a2\u0006\u0006\u001a\u0004\b9\u0010:R\u0011\u0010;\u001a\u0002008F\u00a2\u0006\u0006\u001a\u0004\b;\u0010<R\u0014\u0010=\u001a\u0002008VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b=\u0010<R\u0013\u0010>\u001a\u0004\u0018\u00010?8F\u00a2\u0006\u0006\u001a\u0004\b@\u0010AR\u000e\u0010B\u001a\u00020CX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010D\u001a\u00020EX\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001a\u0010J\u001a\u00020KX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\u0013\u0010P\u001a\u0004\u0018\u00010Q8F\u00a2\u0006\u0006\u001a\u0004\bR\u0010SR\u0012\u0010T\u001a\u00060UR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020WX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020YX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010[\u001a\u0004\u0018\u00010\\X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010]\u001a\u0004\u0018\u00010^X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010_\u001a\n\u0012\u0004\u0012\u00020a\u0018\u00010`8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\u0012\u0010j\u001a\u00060kR\u00020\u0000X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010m\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010p\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\bq\u0010\u0017R\u001a\u0010r\u001a\u00020sX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\u0014\u0010x\u001a\u0002008BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\by\u0010<R\u000e\u0010z\u001a\u00020{X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010|\u001a\u00020}8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b~\u0010\u007fR\u0017\u0010\u0080\u0001\u001a\u0005\u0018\u00010\u0081\u00018F\u00a2\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R \u0010\u0084\u0001\u001a\u00030\u0085\u0001X\u0086.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\u00158VX\u0096\u0004\u00a2\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010\u0017R\u000f\u0010\u008c\u0001\u001a\u000200X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u008d\u0001\u001a\u00030\u008e\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u008f\u0001\u001a\u00030\u0090\u0001X\u0096.\u00a2\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001\u00a8\u0006\u0097\u0002"}, d2 = {"Lorg/wikipedia/page/PageFragment;", "Landroidx/fragment/app/Fragment;", "Lorg/wikipedia/BackPressedHandler;", "Lorg/wikipedia/bridge/CommunicationBridge$CommunicationBridgeListener;", "Lorg/wikipedia/theme/ThemeChooserDialog$Callback;", "Lorg/wikipedia/page/references/ReferenceDialog$Callback;", "Lorg/wikipedia/wiktionary/WiktionaryDialog$Callback;", "Lorg/wikipedia/watchlist/WatchlistExpiryDialog$Callback;", "()V", "_binding", "Lorg/wikipedia/databinding/FragmentPageBinding;", "activeTimer", "Lorg/wikipedia/util/ActiveTimer;", "app", "Lorg/wikipedia/WikipediaApp;", "kotlin.jvm.PlatformType", "avCallback", "Lorg/wikipedia/page/PageFragment$AvCallback;", "avPlayer", "Lorg/wikipedia/media/AvPlayer;", "backgroundTabPosition", "", "getBackgroundTabPosition", "()I", "binding", "getBinding", "()Lorg/wikipedia/databinding/FragmentPageBinding;", "bottomSheetPresenter", "Lorg/wikipedia/page/ExclusiveBottomSheetPresenter;", "bridge", "Lorg/wikipedia/bridge/CommunicationBridge;", "containerView", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "getContainerView", "()Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "currentTab", "Lorg/wikipedia/page/tabs/Tab;", "getCurrentTab", "()Lorg/wikipedia/page/tabs/Tab;", "disposables", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "editHandler", "Lorg/wikipedia/edit/EditHandler;", "getEditHandler", "()Lorg/wikipedia/edit/EditHandler;", "setEditHandler", "(Lorg/wikipedia/edit/EditHandler;)V", "errorState", "", "foregroundTabPosition", "getForegroundTabPosition", "headerView", "Lorg/wikipedia/page/leadimages/PageHeaderView;", "getHeaderView", "()Lorg/wikipedia/page/leadimages/PageHeaderView;", "historyEntry", "Lorg/wikipedia/history/HistoryEntry;", "getHistoryEntry", "()Lorg/wikipedia/history/HistoryEntry;", "isLoading", "()Z", "isPreview", "leadImageEditLang", "", "getLeadImageEditLang", "()Ljava/lang/String;", "leadImagesHandler", "Lorg/wikipedia/page/leadimages/LeadImagesHandler;", "linkHandler", "Lorg/wikipedia/page/LinkHandler;", "getLinkHandler", "()Lorg/wikipedia/page/LinkHandler;", "setLinkHandler", "(Lorg/wikipedia/page/LinkHandler;)V", "model", "Lorg/wikipedia/page/PageViewModel;", "getModel", "()Lorg/wikipedia/page/PageViewModel;", "setModel", "(Lorg/wikipedia/page/PageViewModel;)V", "page", "Lorg/wikipedia/page/Page;", "getPage", "()Lorg/wikipedia/page/Page;", "pageActionTabsCallback", "Lorg/wikipedia/page/PageFragment$PageActionTabCallback;", "pageFragmentLoadState", "Lorg/wikipedia/page/PageFragmentLoadState;", "pageRefreshListener", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;", "pageRefreshed", "pageScrollFunnel", "Lorg/wikipedia/analytics/PageScrollFunnel;", "references", "Lorg/wikipedia/page/references/PageReferences;", "referencesGroup", "", "Lorg/wikipedia/page/references/PageReferences$Reference;", "getReferencesGroup", "()Ljava/util/List;", "revision", "", "getRevision", "()J", "setRevision", "(J)V", "scrollTriggerListener", "Lorg/wikipedia/page/PageFragment$WebViewScrollTriggerListener;", "scrolledUpForThemeChange", "sections", "", "Lorg/wikipedia/page/Section;", "selectedReferenceIndex", "getSelectedReferenceIndex", "shareHandler", "Lorg/wikipedia/page/shareafact/ShareHandler;", "getShareHandler", "()Lorg/wikipedia/page/shareafact/ShareHandler;", "setShareHandler", "(Lorg/wikipedia/page/shareafact/ShareHandler;)V", "shouldCreateNewTab", "getShouldCreateNewTab", "tabFunnel", "Lorg/wikipedia/analytics/TabFunnel;", "tabLayoutOffsetParams", "Landroid/widget/LinearLayout$LayoutParams;", "getTabLayoutOffsetParams", "()Landroid/widget/LinearLayout$LayoutParams;", "title", "Lorg/wikipedia/page/PageTitle;", "getTitle", "()Lorg/wikipedia/page/PageTitle;", "tocHandler", "Lorg/wikipedia/page/ToCHandler;", "getTocHandler", "()Lorg/wikipedia/page/ToCHandler;", "setTocHandler", "(Lorg/wikipedia/page/ToCHandler;)V", "toolbarMargin", "getToolbarMargin", "watchlistExpiryChanged", "watchlistFunnel", "Lorg/wikipedia/analytics/WatchlistFunnel;", "webView", "Lorg/wikipedia/views/ObservableWebView;", "getWebView", "()Lorg/wikipedia/views/ObservableWebView;", "setWebView", "(Lorg/wikipedia/views/ObservableWebView;)V", "addTimeSpentReading", "", "timeSpentSec", "addToReadingList", "source", "Lorg/wikipedia/Constants$InvokeSource;", "addToDefault", "callback", "Lorg/wikipedia/page/PageFragment$Callback;", "clearActivityActionBarTitle", "closePageScrollFunnel", "disableActionTabs", "caught", "", "dismissBottomSheet", "getContentTopOffsetParams", "context", "Landroid/content/Context;", "goForward", "handleInternalLink", "hidePageContent", "initPageScrollFunnel", "initWebViewListeners", "loadPage", "entry", "pushBackStack", "squashBackstack", "isRefresh", "stagedScrollY", "maybeShowAnnouncement", "moveToReadingList", "sourceReadingListId", "showDefaultList", "onActionModeShown", "mode", "Landroid/view/ActionMode;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCancelThemeChooser", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onExpirySelect", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "onPageLoadError", "onPageMetadataLoaded", "onPageSetupEvent", "onPause", "onResume", "onSaveInstanceState", "outState", "onToggleDimImages", "onViewCreated", "view", "openFromExistingTab", "openInNewBackgroundTab", "openInNewForegroundTab", "openInNewTab", "position", "refreshPage", "reloadFromBackstack", "scrollToSection", "sectionAnchor", "setBookmarkIconForPageSavedState", "pageSaved", "setBottomBarButtonEnabled", "button", "Lorg/wikipedia/page/action/PageActionTab;", "enabled", "setCurrentTabAndReset", "setupMessageHandlers", "sharePageLink", "shouldLoadFromBackstack", "activity", "Landroid/app/Activity;", "showBottomSheet", "dialog", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "showFindInPage", "showFindReferenceInPage", "referenceAnchor", "backLinksList", "referenceText", "showWatchlistSnackbar", "watch", "Lorg/wikipedia/dataclient/watch/Watch;", "startDescriptionEditActivity", "text", "startGalleryActivity", "fileName", "startLangLinksActivity", "startSupportActionMode", "actionModeCallback", "Landroid/view/ActionMode$Callback;", "startTalkTopicActivity", "pageTitle", "trimTabCount", "updateBookmarkAndMenuOptions", "updateBookmarkAndMenuOptionsFromDao", "updateFontSize", "updateInsets", "insets", "Landroidx/core/graphics/Insets;", "updateProgressBar", "visible", "updateWatchlist", "unwatch", "verifyBeforeEditingDescription", "wiktionaryShowDialogForTerm", "term", "AvCallback", "Callback", "Companion", "FindReferenceInPageActionProvider", "PageActionTabCallback", "WebViewScrollTriggerListener", "app_alphaDebug"})
public final class PageFragment extends androidx.fragment.app.Fragment implements org.wikipedia.BackPressedHandler, org.wikipedia.bridge.CommunicationBridge.CommunicationBridgeListener, org.wikipedia.theme.ThemeChooserDialog.Callback, org.wikipedia.page.references.ReferenceDialog.Callback, org.wikipedia.wiktionary.WiktionaryDialog.Callback, org.wikipedia.watchlist.WatchlistExpiryDialog.Callback {
    private org.wikipedia.databinding.FragmentPageBinding _binding;
    private final org.wikipedia.util.ActiveTimer activeTimer = null;
    private final org.wikipedia.page.ExclusiveBottomSheetPresenter bottomSheetPresenter = null;
    private final io.reactivex.rxjava3.disposables.CompositeDisposable disposables = null;
    private final org.wikipedia.page.PageFragment.WebViewScrollTriggerListener scrollTriggerListener = null;
    private final org.wikipedia.analytics.TabFunnel tabFunnel = null;
    private final org.wikipedia.analytics.WatchlistFunnel watchlistFunnel = null;
    private final androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener pageRefreshListener = null;
    private final org.wikipedia.page.PageFragment.PageActionTabCallback pageActionTabsCallback = null;
    private org.wikipedia.bridge.CommunicationBridge bridge;
    private org.wikipedia.page.leadimages.LeadImagesHandler leadImagesHandler;
    private org.wikipedia.page.PageFragmentLoadState pageFragmentLoadState;
    private org.wikipedia.analytics.PageScrollFunnel pageScrollFunnel;
    private boolean pageRefreshed = false;
    private boolean errorState = false;
    private boolean watchlistExpiryChanged = false;
    private boolean scrolledUpForThemeChange = false;
    private org.wikipedia.page.references.PageReferences references;
    private org.wikipedia.media.AvPlayer avPlayer;
    private org.wikipedia.page.PageFragment.AvCallback avCallback;
    private java.util.List<org.wikipedia.page.Section> sections;
    private org.wikipedia.WikipediaApp app;
    public org.wikipedia.page.LinkHandler linkHandler;
    public org.wikipedia.views.ObservableWebView webView;
    @org.jetbrains.annotations.NotNull()
    private org.wikipedia.page.PageViewModel model;
    public org.wikipedia.page.ToCHandler tocHandler;
    public org.wikipedia.page.shareafact.ShareHandler shareHandler;
    public org.wikipedia.edit.EditHandler editHandler;
    private long revision = 0L;
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.page.PageFragment.Companion Companion = null;
    private static final java.lang.String ARG_THEME_CHANGE_SCROLLED = "themeChangeScrolled";
    private static final int REFRESH_SPINNER_ADDITIONAL_OFFSET = 0;
    
    public PageFragment() {
        super();
    }
    
    private final org.wikipedia.databinding.FragmentPageBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.page.LinkHandler getLinkHandler() {
        return null;
    }
    
    public void setLinkHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.LinkHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.views.ObservableWebView getWebView() {
        return null;
    }
    
    public void setWebView(@org.jetbrains.annotations.NotNull()
    org.wikipedia.views.ObservableWebView p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wikipedia.page.PageViewModel getModel() {
        return null;
    }
    
    public void setModel(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageViewModel p0) {
    }
    
    @java.lang.Override()
    public int getToolbarMargin() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean isPreview() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.util.List<org.wikipedia.page.references.PageReferences.Reference> getReferencesGroup() {
        return null;
    }
    
    @java.lang.Override()
    public int getSelectedReferenceIndex() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.ToCHandler getTocHandler() {
        return null;
    }
    
    public final void setTocHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.ToCHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.shareafact.ShareHandler getShareHandler() {
        return null;
    }
    
    public final void setShareHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.shareafact.ShareHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.edit.EditHandler getEditHandler() {
        return null;
    }
    
    public final void setEditHandler(@org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.EditHandler p0) {
    }
    
    public final long getRevision() {
        return 0L;
    }
    
    public final void setRevision(long p0) {
    }
    
    private final boolean getShouldCreateNewTab() {
        return false;
    }
    
    private final int getBackgroundTabPosition() {
        return 0;
    }
    
    private final int getForegroundTabPosition() {
        return 0;
    }
    
    private final android.widget.LinearLayout.LayoutParams getTabLayoutOffsetParams() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.tabs.Tab getCurrentTab() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.PageTitle getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.Page getPage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.history.HistoryEntry getHistoryEntry() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.coordinatorlayout.widget.CoordinatorLayout getContainerView() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.page.leadimages.PageHeaderView getHeaderView() {
        return null;
    }
    
    public final boolean isLoading() {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLeadImageEditLang() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    @java.lang.Override()
    public void onDestroyView() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onConfigurationChanged(@org.jetbrains.annotations.NotNull()
    android.content.res.Configuration newConfig) {
    }
    
    @java.lang.Override()
    public boolean onBackPressed() {
        return false;
    }
    
    @java.lang.Override()
    public void onToggleDimImages() {
    }
    
    @java.lang.Override()
    public void onCancelThemeChooser() {
    }
    
    @java.lang.Override()
    public void wiktionaryShowDialogForTerm(@org.jetbrains.annotations.NotNull()
    java.lang.String term) {
    }
    
    @java.lang.Override()
    public void onExpirySelect(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry) {
    }
    
    private final boolean shouldLoadFromBackstack(android.app.Activity activity) {
        return false;
    }
    
    private final void initWebViewListeners() {
    }
    
    private final void onPageSetupEvent() {
    }
    
    private final void handleInternalLink(org.wikipedia.page.PageTitle title) {
    }
    
    private final void setCurrentTabAndReset(int position) {
    }
    
    private final void openInNewTab(org.wikipedia.page.PageTitle title, org.wikipedia.history.HistoryEntry entry, int position) {
    }
    
    private final void setBottomBarButtonEnabled(org.wikipedia.page.action.PageActionTab button, boolean enabled) {
    }
    
    private final void closePageScrollFunnel() {
    }
    
    private final void dismissBottomSheet() {
    }
    
    private final void updateProgressBar(boolean visible) {
    }
    
    private final void startLangLinksActivity() {
    }
    
    private final void trimTabCount() {
    }
    
    private final void addTimeSpentReading(int timeSpentSec) {
    }
    
    private final android.widget.LinearLayout.LayoutParams getContentTopOffsetParams(android.content.Context context) {
        return null;
    }
    
    private final void disableActionTabs(java.lang.Throwable caught) {
    }
    
    private final void setBookmarkIconForPageSavedState(boolean pageSaved) {
    }
    
    private final void startTalkTopicActivity(org.wikipedia.page.PageTitle pageTitle) {
    }
    
    private final void startGalleryActivity(java.lang.String fileName) {
    }
    
    private final void hidePageContent() {
    }
    
    private final void showWatchlistSnackbar(org.wikipedia.watchlist.WatchlistExpiry expiry, org.wikipedia.dataclient.watch.Watch watch) {
    }
    
    private final void maybeShowAnnouncement() {
    }
    
    private final void showFindReferenceInPage(java.lang.String referenceAnchor, java.util.List<java.lang.String> backLinksList, java.lang.String referenceText) {
    }
    
    private final void initPageScrollFunnel() {
    }
    
    private final void setupMessageHandlers() {
    }
    
    public final void reloadFromBackstack() {
    }
    
    public final void updateInsets(@org.jetbrains.annotations.NotNull()
    androidx.core.graphics.Insets insets) {
    }
    
    public final void onPageMetadataLoaded() {
    }
    
    public final void openInNewBackgroundTab(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void openInNewForegroundTab(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void openFromExistingTab(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void loadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean pushBackStack, boolean squashBackstack, boolean isRefresh) {
    }
    
    public final void loadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry, boolean pushBackStack, int stagedScrollY, boolean isRefresh) {
    }
    
    public final void updateFontSize() {
    }
    
    public final void updateBookmarkAndMenuOptions() {
    }
    
    public final void updateBookmarkAndMenuOptionsFromDao() {
    }
    
    public final void onActionModeShown(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode mode) {
    }
    
    public final void sharePageLink() {
    }
    
    public final void showFindInPage() {
    }
    
    public final void scrollToSection(@org.jetbrains.annotations.NotNull()
    java.lang.String sectionAnchor) {
    }
    
    public final void onPageLoadError(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable caught) {
    }
    
    public final void refreshPage(int stagedScrollY) {
    }
    
    public final void clearActivityActionBarTitle() {
    }
    
    public final void verifyBeforeEditingDescription(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void startDescriptionEditActivity(@org.jetbrains.annotations.Nullable()
    java.lang.String text) {
    }
    
    public final void goForward() {
    }
    
    public final void showBottomSheet(@org.jetbrains.annotations.NotNull()
    com.google.android.material.bottomsheet.BottomSheetDialogFragment dialog) {
    }
    
    public final void loadPage(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.history.HistoryEntry entry) {
    }
    
    public final void startSupportActionMode(@org.jetbrains.annotations.NotNull()
    android.view.ActionMode.Callback actionModeCallback) {
    }
    
    public final void addToReadingList(@org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source, boolean addToDefault) {
    }
    
    public final void moveToReadingList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
    org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
    org.wikipedia.Constants.InvokeSource source, boolean showDefaultList) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wikipedia.page.PageFragment.Callback callback() {
        return null;
    }
    
    public final void updateWatchlist(@org.jetbrains.annotations.NotNull()
    org.wikipedia.watchlist.WatchlistExpiry expiry, boolean unwatch) {
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0003H&J\b\u0010\t\u001a\u00020\u0003H&J\b\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\u0003H&J\u0010\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0010\u001a\u00020\u0003H&J\b\u0010\u0011\u001a\u00020\u0003H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H&J(\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0019H&J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0019H&J\u0010\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u001fH&J\u0010\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u0019H&J\u0010\u0010\"\u001a\u00020\u00032\u0006\u0010#\u001a\u00020$H&\u00a8\u0006%"}, d2 = {"Lorg/wikipedia/page/PageFragment$Callback;", "", "onPageAddToReadingList", "", "title", "Lorg/wikipedia/page/PageTitle;", "source", "Lorg/wikipedia/Constants$InvokeSource;", "onPageCloseActionMode", "onPageDismissBottomSheet", "onPageHideSoftKeyboard", "onPageInitWebView", "v", "Lorg/wikipedia/views/ObservableWebView;", "onPageLoadComplete", "onPageLoadError", "onPageLoadErrorBackPressed", "onPageLoadMainPageInForegroundTab", "onPageLoadPage", "entry", "Lorg/wikipedia/history/HistoryEntry;", "onPageMoveToReadingList", "sourceReadingListId", "", "showDefaultList", "", "onPageSetToolbarElevationEnabled", "enabled", "onPageShowLinkPreview", "onPageStartSupportActionMode", "callback", "Landroid/view/ActionMode$Callback;", "onPageUpdateProgressBar", "visible", "onPageWatchlistExpirySelect", "expiry", "Lorg/wikipedia/watchlist/WatchlistExpiry;", "app_alphaDebug"})
    public static abstract interface Callback {
        
        public abstract void onPageDismissBottomSheet();
        
        public abstract void onPageLoadComplete();
        
        public abstract void onPageLoadPage(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onPageInitWebView(@org.jetbrains.annotations.NotNull()
        org.wikipedia.views.ObservableWebView v);
        
        public abstract void onPageShowLinkPreview(@org.jetbrains.annotations.NotNull()
        org.wikipedia.history.HistoryEntry entry);
        
        public abstract void onPageLoadMainPageInForegroundTab();
        
        public abstract void onPageUpdateProgressBar(boolean visible);
        
        public abstract void onPageStartSupportActionMode(@org.jetbrains.annotations.NotNull()
        android.view.ActionMode.Callback callback);
        
        public abstract void onPageHideSoftKeyboard();
        
        public abstract void onPageAddToReadingList(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source);
        
        public abstract void onPageMoveToReadingList(long sourceReadingListId, @org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title, @org.jetbrains.annotations.NotNull()
        org.wikipedia.Constants.InvokeSource source, boolean showDefaultList);
        
        public abstract void onPageWatchlistExpirySelect(@org.jetbrains.annotations.NotNull()
        org.wikipedia.watchlist.WatchlistExpiry expiry);
        
        public abstract void onPageLoadError(@org.jetbrains.annotations.NotNull()
        org.wikipedia.page.PageTitle title);
        
        public abstract void onPageLoadErrorBackPressed();
        
        public abstract void onPageSetToolbarElevationEnabled(boolean enabled);
        
        public abstract void onPageCloseActionMode();
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/page/PageFragment$PageActionTabCallback;", "Lorg/wikipedia/page/action/PageActionTab$Callback;", "(Lorg/wikipedia/page/PageFragment;)V", "onAddToReadingListTabSelected", "", "onChooseLangTabSelected", "onFindInPageTabSelected", "onFontAndThemeTabSelected", "onViewToCTabSelected", "updateBookmark", "pageSaved", "", "app_alphaDebug"})
    final class PageActionTabCallback implements org.wikipedia.page.action.PageActionTab.Callback {
        
        public PageActionTabCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onAddToReadingListTabSelected() {
        }
        
        @java.lang.Override()
        public void onFindInPageTabSelected() {
        }
        
        @java.lang.Override()
        public void onChooseLangTabSelected() {
        }
        
        @java.lang.Override()
        public void onFontAndThemeTabSelected() {
        }
        
        @java.lang.Override()
        public void onViewToCTabSelected() {
        }
        
        @java.lang.Override()
        public void updateBookmark(boolean pageSaved) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016\u00a8\u0006\u0006"}, d2 = {"Lorg/wikipedia/page/PageFragment$AvCallback;", "Lorg/wikipedia/media/AvPlayer$Callback;", "(Lorg/wikipedia/page/PageFragment;)V", "onError", "", "onSuccess", "app_alphaDebug"})
    final class AvCallback implements org.wikipedia.media.AvPlayer.Callback {
        
        public AvCallback() {
            super();
        }
        
        @java.lang.Override()
        public void onSuccess() {
        }
        
        @java.lang.Override()
        public void onError() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\f"}, d2 = {"Lorg/wikipedia/page/PageFragment$WebViewScrollTriggerListener;", "Lorg/wikipedia/views/ObservableWebView$OnContentHeightChangedListener;", "(Lorg/wikipedia/page/PageFragment;)V", "stagedScrollY", "", "getStagedScrollY", "()I", "setStagedScrollY", "(I)V", "onContentHeightChanged", "", "contentHeight", "app_alphaDebug"})
    final class WebViewScrollTriggerListener implements org.wikipedia.views.ObservableWebView.OnContentHeightChangedListener {
        private int stagedScrollY = 0;
        
        public WebViewScrollTriggerListener() {
            super();
        }
        
        public final int getStagedScrollY() {
            return 0;
        }
        
        public final void setStagedScrollY(int p0) {
        }
        
        @java.lang.Override()
        public void onContentHeightChanged(int contentHeight) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B-\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\t\u00a2\u0006\u0002\u0010\nJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u000eH\u0002R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lorg/wikipedia/page/PageFragment$FindReferenceInPageActionProvider;", "Landroid/view/ActionProvider;", "Landroid/view/View$OnClickListener;", "context", "Landroid/content/Context;", "referenceAnchor", "", "referenceText", "backLinksList", "", "(Lorg/wikipedia/page/PageFragment;Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "binding", "Lorg/wikipedia/databinding/GroupFindReferencesInPageBinding;", "currentPos", "", "onClick", "", "v", "Landroid/view/View;", "onCreateActionView", "overridesItemVisibility", "", "scrollTo", "position", "app_alphaDebug"})
    final class FindReferenceInPageActionProvider extends android.view.ActionProvider implements android.view.View.OnClickListener {
        private final java.lang.String referenceAnchor = null;
        private final java.lang.String referenceText = null;
        private final java.util.List<java.lang.String> backLinksList = null;
        private final org.wikipedia.databinding.GroupFindReferencesInPageBinding binding = null;
        private int currentPos = 0;
        
        public FindReferenceInPageActionProvider(@org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        java.lang.String referenceAnchor, @org.jetbrains.annotations.NotNull()
        java.lang.String referenceText, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> backLinksList) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public android.view.View onCreateActionView() {
            return null;
        }
        
        @java.lang.Override()
        public boolean overridesItemVisibility() {
            return false;
        }
        
        @java.lang.Override()
        public void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View v) {
        }
        
        private final void scrollTo(int position) {
        }
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lorg/wikipedia/page/PageFragment$Companion;", "", "()V", "ARG_THEME_CHANGE_SCROLLED", "", "REFRESH_SPINNER_ADDITIONAL_OFFSET", "", "app_alphaDebug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}