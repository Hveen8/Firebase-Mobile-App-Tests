package org.wikipedia.settings;

import java.lang.System;

/**
 * Shared preferences utility for convenient POJO access.
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\bo\n\u0002\u0010\t\n\u0002\bQ\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0016\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0017\u0010\u00c3\u0002\u001a\u00030\u00c4\u00022\r\u0010\u00d3\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0018\u0010\u00c5\u0002\u001a\u00030\u00c4\u00022\u000e\u0010\u00d3\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\u0004J\u0010\u0010\u00c6\u0002\u001a\u00020\"2\u0007\u0010\u00c7\u0002\u001a\u00020\u0005J\b\u0010\u00c8\u0002\u001a\u00030\u00c4\u0002J\u0011\u0010\u00c9\u0002\u001a\u00030\u009b\u00012\u0007\u0010\u00ca\u0002\u001a\u00020\u0005J\u0012\u0010\u00cb\u0002\u001a\u00020\u00052\u0007\u0010\u00ca\u0002\u001a\u00020\u0005H\u0002J\u0010\u0010\u00cc\u0002\u001a\u00020\u000f2\u0007\u0010\u00cd\u0002\u001a\u00020\u000fJ\u0010\u0010\u00ce\u0002\u001a\u00020\u000f2\u0007\u0010\u00cd\u0002\u001a\u00020\u000fJ\b\u0010\u00cf\u0002\u001a\u00030\u00c4\u0002J\b\u0010\u00d0\u0002\u001a\u00030\u00c4\u0002J\u0007\u0010\u00d1\u0002\u001a\u00020\"J\b\u0010\u00d2\u0002\u001a\u00030\u00c4\u0002J\b\u0010\u00d3\u0002\u001a\u00030\u00c4\u0002J\u0011\u0010\u00d4\u0002\u001a\u00030\u00c4\u00022\u0007\u0010\u00c7\u0002\u001a\u00020\u0005J\u001b\u0010\u00d5\u0002\u001a\u00030\u00c4\u00022\u0007\u0010\u00ca\u0002\u001a\u00020\u00052\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001J\u0011\u0010\u00d6\u0002\u001a\u00030\u00c4\u00022\u0007\u0010\u00d7\u0002\u001a\u00020\u000fJ\u0011\u0010\u00d8\u0002\u001a\u00030\u00c4\u00022\u0007\u0010\u00d7\u0002\u001a\u00020\u000fJ\u0007\u0010\u00d9\u0002\u001a\u00020\"R0\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\u0004\u0018\u00010\u00052\b\u0010\u0012\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\rR(\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001b\u0010\r\"\u0004\b\u001c\u0010\u0016R(\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u0016R$\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010\'RH\u0010,\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)2\u0018\u0010(\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020+0*0)8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R$\u00102\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b3\u0010\u0011\"\u0004\b4\u00105R$\u00106\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b7\u0010%\"\u0004\b8\u0010\'R$\u0010:\u001a\u00020\u000f2\u0006\u00109\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b;\u0010\u0011\"\u0004\b<\u00105R\u0011\u0010=\u001a\u00020\u00058F\u00a2\u0006\u0006\u001a\u0004\b>\u0010\rR(\u0010@\u001a\u0004\u0018\u00010\u00052\b\u0010?\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bA\u0010\r\"\u0004\bB\u0010\u0016R\u0011\u0010C\u001a\u00020\u000f8F\u00a2\u0006\u0006\u001a\u0004\bD\u0010\u0011R0\u0010F\u001a\b\u0012\u0004\u0012\u00020\"0*2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\"0*8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JRH\u0010L\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050*0)2\u0018\u0010K\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050*0)8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bM\u0010.\"\u0004\bN\u00100RH\u0010P\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050*0)2\u0018\u0010O\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050*0)8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bQ\u0010.\"\u0004\bR\u00100R0\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000f0*2\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u000f0*8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bU\u0010H\"\u0004\bV\u0010JR$\u0010W\u001a\u00020\u00052\u0006\u0010W\u001a\u00020\u00058F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bX\u0010\r\"\u0004\bY\u0010\u0016R\u0011\u0010Z\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\b[\u0010%R$\u0010\\\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b]\u0010%\"\u0004\b^\u0010\'R0\u0010`\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010_\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\ba\u0010\b\"\u0004\bb\u0010\nR\u0011\u0010c\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\bd\u0010%R\u0011\u0010e\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\bf\u0010%R$\u0010h\u001a\u00020\u000f2\u0006\u0010g\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bi\u0010\u0011\"\u0004\bj\u00105R\u0011\u0010k\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\bk\u0010%R$\u0010m\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bm\u0010%\"\u0004\bn\u0010\'R\u0011\u0010o\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\bo\u0010%R\u0011\u0010p\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\bp\u0010%R$\u0010q\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bq\u0010%\"\u0004\br\u0010\'R$\u0010s\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bs\u0010%\"\u0004\bt\u0010\'R\u0011\u0010u\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\bu\u0010%R$\u0010v\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bv\u0010%\"\u0004\bw\u0010\'R\u0011\u0010x\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\bx\u0010%R\u0011\u0010y\u001a\u00020\"8F\u00a2\u0006\u0006\u001a\u0004\by\u0010%R$\u0010z\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\bz\u0010%\"\u0004\b{\u0010\'R$\u0010|\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\f\u001a\u0004\b|\u0010%\"\u0004\b}\u0010\'R%\u0010\u007f\u001a\u00020\"2\u0006\u0010~\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\r\u001a\u0004\b\u007f\u0010%\"\u0005\b\u0080\u0001\u0010\'R\'\u0010\u0081\u0001\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0081\u0001\u0010%\"\u0005\b\u0082\u0001\u0010\'R\'\u0010\u0083\u0001\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0083\u0001\u0010%\"\u0005\b\u0084\u0001\u0010\'R\'\u0010\u0085\u0001\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0085\u0001\u0010%\"\u0005\b\u0086\u0001\u0010\'R\'\u0010\u0087\u0001\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0087\u0001\u0010%\"\u0005\b\u0088\u0001\u0010\'R(\u0010\u008a\u0001\u001a\u00020\"2\u0007\u0010\u0089\u0001\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008a\u0001\u0010%\"\u0005\b\u008b\u0001\u0010\'R(\u0010\u008c\u0001\u001a\u00020\"2\u0007\u0010\u0089\u0001\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008c\u0001\u0010%\"\u0005\b\u008d\u0001\u0010\'R\'\u0010\u008e\u0001\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008e\u0001\u0010%\"\u0005\b\u008f\u0001\u0010\'R\'\u0010\u0090\u0001\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0090\u0001\u0010%\"\u0005\b\u0091\u0001\u0010\'R(\u0010\u0093\u0001\u001a\u00020\"2\u0007\u0010\u0092\u0001\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0093\u0001\u0010%\"\u0005\b\u0094\u0001\u0010\'R\u0013\u0010\u0095\u0001\u001a\u00020\"8F\u00a2\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010%R\'\u0010\u0096\u0001\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0096\u0001\u0010%\"\u0005\b\u0097\u0001\u0010\'R\'\u0010\u0098\u0001\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0098\u0001\u0010%\"\u0005\b\u0099\u0001\u0010\'R,\u0010\u009c\u0001\u001a\u00030\u009b\u00012\b\u0010\u009a\u0001\u001a\u00030\u009b\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010\u00a0\u0001R,\u0010\u00a2\u0001\u001a\u0004\u0018\u00010\u00052\t\u0010\u00a1\u0001\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a3\u0001\u0010\r\"\u0005\b\u00a4\u0001\u0010\u0016R6\u0010\u00a6\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010*2\u000e\u0010\u00a5\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010*8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a7\u0001\u0010H\"\u0005\b\u00a8\u0001\u0010JR\'\u0010\u00a9\u0001\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00aa\u0001\u0010\u0011\"\u0005\b\u00ab\u0001\u00105R\'\u0010\u00ac\u0001\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ad\u0001\u0010%\"\u0005\b\u00ae\u0001\u0010\'R\u0013\u0010\u00af\u0001\u001a\u00020\"8F\u00a2\u0006\u0007\u001a\u0005\b\u00b0\u0001\u0010%R\u0013\u0010\u00b1\u0001\u001a\u00020\u00058F\u00a2\u0006\u0007\u001a\u0005\b\u00b2\u0001\u0010\rR+\u0010\u00b3\u0001\u001a\u0004\u0018\u00010\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b4\u0001\u0010\r\"\u0005\b\u00b5\u0001\u0010\u0016R4\u0010\u00b7\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\r\u0010\u00b6\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b8\u0001\u0010\b\"\u0005\b\u00b9\u0001\u0010\nR4\u0010\u00bb\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\r\u0010\u00ba\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00bc\u0001\u0010\b\"\u0005\b\u00bd\u0001\u0010\nR(\u0010\u00bf\u0001\u001a\u00020\u000f2\u0007\u0010\u00be\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c0\u0001\u0010\u0011\"\u0005\b\u00c1\u0001\u00105R\u0013\u0010\u00c2\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00c3\u0001\u0010\u0011R\u0013\u0010\u00c4\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00c5\u0001\u0010\u0011R+\u0010\u00c6\u0001\u001a\u00030\u009b\u00012\u0007\u0010!\u001a\u00030\u009b\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00c7\u0001\u0010\u009e\u0001\"\u0006\b\u00c8\u0001\u0010\u00a0\u0001R\'\u0010\u00c9\u0001\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ca\u0001\u0010\u0011\"\u0005\b\u00cb\u0001\u00105R(\u0010\u00cd\u0001\u001a\u00020\u00052\u0007\u0010\u00cc\u0001\u001a\u00020\u00058F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ce\u0001\u0010\r\"\u0005\b\u00cf\u0001\u0010\u0016R(\u0010\u00d0\u0001\u001a\u00020\u00052\u0007\u0010\u00cc\u0001\u001a\u00020\u00058F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d1\u0001\u0010\r\"\u0005\b\u00d2\u0001\u0010\u0016R4\u0010\u00d4\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\r\u0010\u00d3\u0001\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d5\u0001\u0010\b\"\u0005\b\u00d6\u0001\u0010\nR6\u0010\u00d7\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\u00042\u000e\u0010\u00d3\u0001\u001a\t\u0012\u0005\u0012\u00030\u009b\u00010\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00d8\u0001\u0010\b\"\u0005\b\u00d9\u0001\u0010\nR,\u0010\u00db\u0001\u001a\u0004\u0018\u00010\u00052\t\u0010\u00da\u0001\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00dc\u0001\u0010\r\"\u0005\b\u00dd\u0001\u0010\u0016R(\u0010\u00df\u0001\u001a\u00020\u000f2\u0007\u0010\u00de\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e0\u0001\u0010\u0011\"\u0005\b\u00e1\u0001\u00105R(\u0010\u00e3\u0001\u001a\u00020\u00052\u0007\u0010\u00e2\u0001\u001a\u00020\u00058F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e4\u0001\u0010\r\"\u0005\b\u00e5\u0001\u0010\u0016R(\u0010\u00e7\u0001\u001a\u00020\u00052\u0007\u0010\u00e6\u0001\u001a\u00020\u00058F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00e8\u0001\u0010\r\"\u0005\b\u00e9\u0001\u0010\u0016R\u0013\u0010\u00ea\u0001\u001a\u00020\u00058F\u00a2\u0006\u0007\u001a\u0005\b\u00eb\u0001\u0010\rR\u0015\u0010\u00ec\u0001\u001a\u00030\u00ed\u00018F\u00a2\u0006\b\u001a\u0006\b\u00ee\u0001\u0010\u00ef\u0001R(\u0010\u00f1\u0001\u001a\u00020\u000f2\u0007\u0010\u00f0\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00f2\u0001\u0010\u0011\"\u0005\b\u00f3\u0001\u00105R,\u0010\u00f6\u0001\u001a\u00030\u00f5\u00012\b\u0010\u00f4\u0001\u001a\u00030\u00f5\u00018F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00f7\u0001\u0010\u00f8\u0001\"\u0006\b\u00f9\u0001\u0010\u00fa\u0001R\u0013\u0010\u00fb\u0001\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00fc\u0001\u0010\u0011R\'\u0010\u00fd\u0001\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00fe\u0001\u0010%\"\u0005\b\u00ff\u0001\u0010\'R\'\u0010\u0080\u0002\u001a\u00020\"2\u0006\u0010l\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0081\u0002\u0010%\"\u0005\b\u0082\u0002\u0010\'R\'\u0010\u0083\u0002\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0084\u0002\u0010%\"\u0005\b\u0085\u0002\u0010\'R\'\u0010\u0086\u0002\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0087\u0002\u0010%\"\u0005\b\u0088\u0002\u0010\'R\'\u0010\u0089\u0002\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008a\u0002\u0010%\"\u0005\b\u008b\u0002\u0010\'R\'\u0010\u008c\u0002\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u008d\u0002\u0010%\"\u0005\b\u008e\u0002\u0010\'R\'\u0010\u008f\u0002\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0090\u0002\u0010%\"\u0005\b\u0091\u0002\u0010\'R\'\u0010\u0092\u0002\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0093\u0002\u0010%\"\u0005\b\u0094\u0002\u0010\'R\'\u0010\u0095\u0002\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0096\u0002\u0010%\"\u0005\b\u0097\u0002\u0010\'R\'\u0010\u0098\u0002\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u0099\u0002\u0010%\"\u0005\b\u009a\u0002\u0010\'R\'\u0010\u009b\u0002\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u009c\u0002\u0010%\"\u0005\b\u009d\u0002\u0010\'RA\u0010\u009f\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0005\u0012\u00030\u009e\u00020)2\u0013\u0010!\u001a\u000f\u0012\u0004\u0012\u00020\u0005\u0012\u0005\u0012\u00030\u009e\u00020)8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a0\u0002\u0010.\"\u0005\b\u00a1\u0002\u00100R(\u0010\u00a2\u0002\u001a\u00020\u000f2\u0007\u0010\u00be\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00a3\u0002\u0010\u0011\"\u0005\b\u00a4\u0002\u00105R,\u0010\u00a7\u0002\u001a\u00030\u00a6\u00022\b\u0010\u00a5\u0002\u001a\u00030\u00a6\u00028F@FX\u0086\u000e\u00a2\u0006\u0010\u001a\u0006\b\u00a8\u0002\u0010\u00a9\u0002\"\u0006\b\u00aa\u0002\u0010\u00ab\u0002R(\u0010\u00ac\u0002\u001a\u00020\u000f2\u0007\u0010\u00be\u0001\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00ad\u0002\u0010\u0011\"\u0005\b\u00ae\u0002\u00105R\'\u0010\u00af\u0002\u001a\u00020\"2\u0006\u0010!\u001a\u00020\"8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b0\u0002\u0010%\"\u0005\b\u00b1\u0002\u0010\'R6\u0010\u00b2\u0002\u001a\t\u0012\u0005\u0012\u00030\u00b3\u00020*2\u000e\u0010\u00b2\u0002\u001a\t\u0012\u0005\u0012\u00030\u00b3\u00020*8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b4\u0002\u0010H\"\u0005\b\u00b5\u0002\u0010JR+\u0010\u00b6\u0002\u001a\u0004\u0018\u00010\u00052\b\u0010!\u001a\u0004\u0018\u00010\u00058F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00b7\u0002\u0010\r\"\u0005\b\u00b8\u0002\u0010\u0016R(\u0010\u00ba\u0002\u001a\u00020\u000f2\u0007\u0010\u00b9\u0002\u001a\u00020\u000f8F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00bb\u0002\u0010\u0011\"\u0005\b\u00bc\u0002\u00105R\u0013\u0010\u00bd\u0002\u001a\u00020\u000f8F\u00a2\u0006\u0007\u001a\u0005\b\u00be\u0002\u0010\u0011R4\u0010\u00c0\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\r\u0010\u00bf\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048F@FX\u0086\u000e\u00a2\u0006\u000e\u001a\u0005\b\u00c1\u0002\u0010\b\"\u0005\b\u00c2\u0002\u0010\n\u00a8\u0006\u00da\u0002"}, d2 = {"Lorg/wikipedia/settings/Prefs;", "", "()V", "newAnnouncementIds", "", "", "announcementShownDialogs", "getAnnouncementShownDialogs", "()Ljava/util/Set;", "setAnnouncementShownDialogs", "(Ljava/util/Set;)V", "announcementsCountryOverride", "getAnnouncementsCountryOverride", "()Ljava/lang/String;", "announcementsVersionCode", "", "getAnnouncementsVersionCode", "()I", "channel", "appChannel", "getAppChannel", "setAppChannel", "(Ljava/lang/String;)V", "appChannelKey", "getAppChannelKey", "id", "appInstallId", "getAppInstallId", "setAppInstallId", "csv", "appLanguageCodeCsv", "getAppLanguageCodeCsv", "setAppLanguageCodeCsv", "value", "", "autoShowEditNotices", "getAutoShowEditNotices", "()Z", "setAutoShowEditNotices", "(Z)V", "cookieMap", "", "", "Lokhttp3/Cookie;", "cookies", "getCookies", "()Ljava/util/Map;", "setCookies", "(Ljava/util/Map;)V", "theme", "currentThemeId", "getCurrentThemeId", "setCurrentThemeId", "(I)V", "dimDarkModeImages", "getDimDarkModeImages", "setDimDarkModeImages", "extra", "editingTextSizeExtra", "getEditingTextSizeExtra", "setEditingTextSizeExtra", "eventPlatformIntakeUriOverride", "getEventPlatformIntakeUriOverride", "sessionId", "eventPlatformSessionId", "getEventPlatformSessionId", "setEventPlatformSessionId", "exploreFeedVisitCount", "getExploreFeedVisitCount", "enabledList", "feedCardsEnabled", "getFeedCardsEnabled", "()Ljava/util/List;", "setFeedCardsEnabled", "(Ljava/util/List;)V", "langDisabledMap", "feedCardsLangDisabled", "getFeedCardsLangDisabled", "setFeedCardsLangDisabled", "langSupportedMap", "feedCardsLangSupported", "getFeedCardsLangSupported", "setFeedCardsLangSupported", "orderList", "feedCardsOrder", "getFeedCardsOrder", "setFeedCardsOrder", "fontFamily", "getFontFamily", "setFontFamily", "hasTabs", "getHasTabs", "hasVisitedArticlePage", "getHasVisitedArticlePage", "setHasVisitedArticlePage", "cards", "hiddenCards", "getHiddenCards", "setHiddenCards", "hideReadNotificationsEnabled", "getHideReadNotificationsEnabled", "ignoreDateForAnnouncements", "getIgnoreDateForAnnouncements", "attempts", "installReferrerAttempts", "getInstallReferrerAttempts", "setInstallReferrerAttempts", "isCollapseTablesEnabled", "enabled", "isDescriptionEditTutorialEnabled", "setDescriptionEditTutorialEnabled", "isDownloadOnlyOverWiFiEnabled", "isDownloadingReadingListArticlesEnabled", "isEditNoticesTooltipShown", "setEditNoticesTooltipShown", "isEventLoggingEnabled", "setEventLoggingEnabled", "isImageDownloadEnabled", "isInitialOnboardingEnabled", "setInitialOnboardingEnabled", "isLinkPreviewEnabled", "isMemoryLeakTestEnabled", "isMultilingualSearchTutorialEnabled", "setMultilingualSearchTutorialEnabled", "isPageNotificationTooltipShown", "setPageNotificationTooltipShown", "subscribed", "isPushNotificationTokenSubscribed", "setPushNotificationTokenSubscribed", "isReadingListLoginReminderEnabled", "setReadingListLoginReminderEnabled", "isReadingListSyncEnabled", "setReadingListSyncEnabled", "isReadingListSyncReminderEnabled", "setReadingListSyncReminderEnabled", "isReadingListsFirstTimeSync", "setReadingListsFirstTimeSync", "pending", "isReadingListsRemoteDeletePending", "setReadingListsRemoteDeletePending", "isReadingListsRemoteSetupPending", "setReadingListsRemoteSetupPending", "isShowDeveloperSettingsEnabled", "setShowDeveloperSettingsEnabled", "isSuggestedEditsHighestPriorityEnabled", "setSuggestedEditsHighestPriorityEnabled", "pass", "isSuggestedEditsReactivationPassStageOne", "setSuggestedEditsReactivationPassStageOne", "isSuggestedEditsReactivationTestEnabled", "isWatchlistMainOnboardingTooltipShown", "setWatchlistMainOnboardingTooltipShown", "isWatchlistPageOnboardingTooltipShown", "setWatchlistPageOnboardingTooltipShown", "time", "", "lastDescriptionEditTime", "getLastDescriptionEditTime", "()J", "setLastDescriptionEditTime", "(J)V", "className", "localClassName", "getLocalClassName", "setLocalClassName", "list", "locallyKnownNotifications", "getLocallyKnownNotifications", "setLocallyKnownNotifications", "loggedInPageActivityVisitCount", "getLoggedInPageActivityVisitCount", "setLoggedInPageActivityVisitCount", "loggedOutInBackground", "getLoggedOutInBackground", "setLoggedOutInBackground", "mediaWikiBaseUriSupportsLangCode", "getMediaWikiBaseUriSupportsLangCode", "mediaWikiBaseUrl", "getMediaWikiBaseUrl", "mruLanguageCodeCsv", "getMruLanguageCodeCsv", "setMruLanguageCodeCsv", "types", "notificationExcludedTypeCodes", "getNotificationExcludedTypeCodes", "setNotificationExcludedTypeCodes", "wikis", "notificationExcludedWikiCodes", "getNotificationExcludedWikiCodes", "setNotificationExcludedWikiCodes", "count", "notificationUnreadCount", "getNotificationUnreadCount", "setNotificationUnreadCount", "overrideSuggestedEditCount", "getOverrideSuggestedEditCount", "overrideSuggestedRevertCount", "getOverrideSuggestedRevertCount", "pageLastShown", "getPageLastShown", "setPageLastShown", "previousThemeId", "getPreviousThemeId", "setPreviousThemeId", "token", "pushNotificationToken", "getPushNotificationToken", "setPushNotificationToken", "pushNotificationTokenOld", "getPushNotificationTokenOld", "setPushNotificationTokenOld", "set", "readingListPagesDeletedIds", "getReadingListPagesDeletedIds", "setReadingListPagesDeletedIds", "readingListsDeletedIds", "getReadingListsDeletedIds", "setReadingListsDeletedIds", "timeStr", "readingListsLastSyncTime", "getReadingListsLastSyncTime", "setReadingListsLastSyncTime", "saveCount", "readingListsPageSaveCount", "getReadingListsPageSaveCount", "setReadingListsPageSaveCount", "json", "remoteConfigJson", "getRemoteConfigJson", "setRemoteConfigJson", "seenTime", "remoteNotificationsSeenTime", "getRemoteNotificationsSeenTime", "setRemoteNotificationsSeenTime", "restbaseUriFormat", "getRestbaseUriFormat", "retrofitLogLevel", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getRetrofitLogLevel", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "position", "selectedLanguagePositionInSearch", "getSelectedLanguagePositionInSearch", "setSelectedLanguagePositionInSearch", "data", "Lorg/wikipedia/analytics/SessionData;", "sessionData", "getSessionData", "()Lorg/wikipedia/analytics/SessionData;", "setSessionData", "(Lorg/wikipedia/analytics/SessionData;)V", "sessionTimeout", "getSessionTimeout", "shouldMatchSystemTheme", "getShouldMatchSystemTheme", "setShouldMatchSystemTheme", "shouldShowRemoveChineseVariantPrompt", "getShouldShowRemoveChineseVariantPrompt", "setShouldShowRemoveChineseVariantPrompt", "showDescriptionEditSuccessPrompt", "getShowDescriptionEditSuccessPrompt", "setShowDescriptionEditSuccessPrompt", "showHistoryOfflineArticlesToast", "getShowHistoryOfflineArticlesToast", "setShowHistoryOfflineArticlesToast", "showImageTagsOnboarding", "getShowImageTagsOnboarding", "setShowImageTagsOnboarding", "showImageZoomTooltip", "getShowImageZoomTooltip", "setShowImageZoomTooltip", "showOneTimeSequentialUserStatsTooltip", "getShowOneTimeSequentialUserStatsTooltip", "setShowOneTimeSequentialUserStatsTooltip", "showReadingListSyncEnablePrompt", "getShowReadingListSyncEnablePrompt", "setShowReadingListSyncEnablePrompt", "showSearchTabTooltip", "getShowSearchTabTooltip", "setShowSearchTabTooltip", "showSuggestedEditsSurvey", "getShowSuggestedEditsSurvey", "setShowSuggestedEditsSurvey", "showSuggestedEditsTooltip", "getShowSuggestedEditsTooltip", "setShowSuggestedEditsTooltip", "Lorg/wikipedia/analytics/eventplatform/StreamConfig;", "streamConfigs", "getStreamConfigs", "setStreamConfigs", "suggestedEditsCountForSurvey", "getSuggestedEditsCountForSurvey", "setSuggestedEditsCountForSurvey", "date", "Ljava/util/Date;", "suggestedEditsPauseDate", "getSuggestedEditsPauseDate", "()Ljava/util/Date;", "setSuggestedEditsPauseDate", "(Ljava/util/Date;)V", "suggestedEditsPauseReverts", "getSuggestedEditsPauseReverts", "setSuggestedEditsPauseReverts", "suggestedEditsSurveyClicked", "getSuggestedEditsSurveyClicked", "setSuggestedEditsSurveyClicked", "tabs", "Lorg/wikipedia/page/tabs/Tab;", "getTabs", "setTabs", "temporaryWikitext", "getTemporaryWikitext", "setTemporaryWikitext", "multiplier", "textSizeMultiplier", "getTextSizeMultiplier", "setTextSizeMultiplier", "totalAnonDescriptionsEdited", "getTotalAnonDescriptionsEdited", "langCodes", "watchlistDisabledLanguages", "getWatchlistDisabledLanguages", "setWatchlistDisabledLanguages", "addReadingListPagesDeletedIds", "", "addReadingListsDeletedIds", "askedForPermissionOnce", "permission", "clearTabs", "getLastRunTime", "task", "getLastRunTimeKey", "getReadingListPageSortMode", "defaultValue", "getReadingListSortMode", "incrementExploreFeedVisitCount", "incrementTotalAnonDescriptionsEdited", "preferOfflineContent", "resetAnnouncementShownDialogs", "resetFeedCustomizations", "setAskedForPermissionOnce", "setLastRunTime", "setReadingListPageSortMode", "sortMode", "setReadingListSortMode", "shouldOverrideSuggestedEditCounts", "app_alphaDebug"})
public final class Prefs {
    @org.jetbrains.annotations.NotNull()
    public static final org.wikipedia.settings.Prefs INSTANCE = null;
    
    private Prefs() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppChannel() {
        return null;
    }
    
    public final void setAppChannel(@org.jetbrains.annotations.Nullable()
    java.lang.String channel) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAppChannelKey() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppInstallId() {
        return null;
    }
    
    public final void setAppInstallId(@org.jetbrains.annotations.Nullable()
    java.lang.String id) {
    }
    
    public final int getCurrentThemeId() {
        return 0;
    }
    
    public final void setCurrentThemeId(int theme) {
    }
    
    public final int getPreviousThemeId() {
        return 0;
    }
    
    public final void setPreviousThemeId(int theme) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFontFamily() {
        return null;
    }
    
    public final void setFontFamily(@org.jetbrains.annotations.NotNull()
    java.lang.String fontFamily) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.util.List<okhttp3.Cookie>> getCookies() {
        return null;
    }
    
    public final void setCookies(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, ? extends java.util.List<okhttp3.Cookie>> cookieMap) {
    }
    
    public final boolean isShowDeveloperSettingsEnabled() {
        return false;
    }
    
    public final void setShowDeveloperSettingsEnabled(boolean enabled) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMruLanguageCodeCsv() {
        return null;
    }
    
    public final void setMruLanguageCodeCsv(@org.jetbrains.annotations.Nullable()
    java.lang.String csv) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAppLanguageCodeCsv() {
        return null;
    }
    
    public final void setAppLanguageCodeCsv(@org.jetbrains.annotations.Nullable()
    java.lang.String csv) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemoteConfigJson() {
        return null;
    }
    
    public final void setRemoteConfigJson(@org.jetbrains.annotations.NotNull()
    java.lang.String json) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wikipedia.page.tabs.Tab> getTabs() {
        return null;
    }
    
    public final void setTabs(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wikipedia.page.tabs.Tab> tabs) {
    }
    
    public final boolean getHasTabs() {
        return false;
    }
    
    public final void clearTabs() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getHiddenCards() {
        return null;
    }
    
    public final void setHiddenCards(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> cards) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.analytics.SessionData getSessionData() {
        return null;
    }
    
    public final void setSessionData(@org.jetbrains.annotations.NotNull()
    org.wikipedia.analytics.SessionData data) {
    }
    
    public final int getSessionTimeout() {
        return 0;
    }
    
    public final int getTextSizeMultiplier() {
        return 0;
    }
    
    public final void setTextSizeMultiplier(int multiplier) {
    }
    
    public final boolean isEventLoggingEnabled() {
        return false;
    }
    
    public final void setEventLoggingEnabled(boolean enabled) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAnnouncementsCountryOverride() {
        return null;
    }
    
    public final boolean getIgnoreDateForAnnouncements() {
        return false;
    }
    
    public final int getAnnouncementsVersionCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.logging.HttpLoggingInterceptor.Level getRetrofitLogLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRestbaseUriFormat() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMediaWikiBaseUrl() {
        return null;
    }
    
    public final boolean getMediaWikiBaseUriSupportsLangCode() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEventPlatformIntakeUriOverride() {
        return null;
    }
    
    public final long getLastRunTime(@org.jetbrains.annotations.NotNull()
    java.lang.String task) {
        return 0L;
    }
    
    public final void setLastRunTime(@org.jetbrains.annotations.NotNull()
    java.lang.String task, long time) {
    }
    
    private final java.lang.String getLastRunTimeKey(java.lang.String task) {
        return null;
    }
    
    public final long getPageLastShown() {
        return 0L;
    }
    
    public final void setPageLastShown(long value) {
    }
    
    public final boolean isImageDownloadEnabled() {
        return false;
    }
    
    public final boolean isDownloadOnlyOverWiFiEnabled() {
        return false;
    }
    
    public final boolean isDownloadingReadingListArticlesEnabled() {
        return false;
    }
    
    public final boolean isLinkPreviewEnabled() {
        return false;
    }
    
    public final boolean isCollapseTablesEnabled() {
        return false;
    }
    
    public final int getReadingListSortMode(int defaultValue) {
        return 0;
    }
    
    public final void setReadingListSortMode(int sortMode) {
    }
    
    public final int getReadingListsPageSaveCount() {
        return 0;
    }
    
    public final void setReadingListsPageSaveCount(int saveCount) {
    }
    
    public final int getReadingListPageSortMode(int defaultValue) {
        return 0;
    }
    
    public final void setReadingListPageSortMode(int sortMode) {
    }
    
    public final boolean isMemoryLeakTestEnabled() {
        return false;
    }
    
    public final boolean isDescriptionEditTutorialEnabled() {
        return false;
    }
    
    public final void setDescriptionEditTutorialEnabled(boolean enabled) {
    }
    
    public final long getLastDescriptionEditTime() {
        return 0L;
    }
    
    public final void setLastDescriptionEditTime(long time) {
    }
    
    public final int getTotalAnonDescriptionsEdited() {
        return 0;
    }
    
    public final void incrementTotalAnonDescriptionsEdited() {
    }
    
    public final boolean isReadingListSyncEnabled() {
        return false;
    }
    
    public final void setReadingListSyncEnabled(boolean enabled) {
    }
    
    public final boolean isReadingListSyncReminderEnabled() {
        return false;
    }
    
    public final void setReadingListSyncReminderEnabled(boolean enabled) {
    }
    
    public final boolean isReadingListLoginReminderEnabled() {
        return false;
    }
    
    public final void setReadingListLoginReminderEnabled(boolean enabled) {
    }
    
    public final boolean isReadingListsRemoteDeletePending() {
        return false;
    }
    
    public final void setReadingListsRemoteDeletePending(boolean pending) {
    }
    
    public final boolean isReadingListsRemoteSetupPending() {
        return false;
    }
    
    public final void setReadingListsRemoteSetupPending(boolean pending) {
    }
    
    public final boolean isInitialOnboardingEnabled() {
        return false;
    }
    
    public final void setInitialOnboardingEnabled(boolean enabled) {
    }
    
    public final boolean askedForPermissionOnce(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    public final void setAskedForPermissionOnce(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
    }
    
    public final boolean getDimDarkModeImages() {
        return false;
    }
    
    public final void setDimDarkModeImages(boolean value) {
    }
    
    public final int getNotificationUnreadCount() {
        return 0;
    }
    
    public final void setNotificationUnreadCount(int count) {
    }
    
    public final boolean preferOfflineContent() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Boolean> getFeedCardsEnabled() {
        return null;
    }
    
    public final void setFeedCardsEnabled(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Boolean> enabledList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Integer> getFeedCardsOrder() {
        return null;
    }
    
    public final void setFeedCardsOrder(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Integer> orderList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> getFeedCardsLangSupported() {
        return null;
    }
    
    public final void setFeedCardsLangSupported(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends java.util.List<java.lang.String>> langSupportedMap) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, java.util.List<java.lang.String>> getFeedCardsLangDisabled() {
        return null;
    }
    
    public final void setFeedCardsLangDisabled(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends java.util.List<java.lang.String>> langDisabledMap) {
    }
    
    public final void resetFeedCustomizations() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReadingListsLastSyncTime() {
        return null;
    }
    
    public final void setReadingListsLastSyncTime(@org.jetbrains.annotations.Nullable()
    java.lang.String timeStr) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.Long> getReadingListsDeletedIds() {
        return null;
    }
    
    public final void setReadingListsDeletedIds(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> set) {
    }
    
    public final void addReadingListsDeletedIds(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.Long> set) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getReadingListPagesDeletedIds() {
        return null;
    }
    
    public final void setReadingListPagesDeletedIds(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> set) {
    }
    
    public final void addReadingListPagesDeletedIds(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> set) {
    }
    
    public final boolean getShowReadingListSyncEnablePrompt() {
        return false;
    }
    
    public final void setShowReadingListSyncEnablePrompt(boolean value) {
    }
    
    public final boolean isReadingListsFirstTimeSync() {
        return false;
    }
    
    public final void setReadingListsFirstTimeSync(boolean value) {
    }
    
    public final int getEditingTextSizeExtra() {
        return 0;
    }
    
    public final void setEditingTextSizeExtra(int extra) {
    }
    
    public final boolean isMultilingualSearchTutorialEnabled() {
        return false;
    }
    
    public final void setMultilingualSearchTutorialEnabled(boolean enabled) {
    }
    
    public final boolean getShouldShowRemoveChineseVariantPrompt() {
        return false;
    }
    
    public final void setShouldShowRemoveChineseVariantPrompt(boolean enabled) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Long> getLocallyKnownNotifications() {
        return null;
    }
    
    public final void setLocallyKnownNotifications(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.Long> list) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRemoteNotificationsSeenTime() {
        return null;
    }
    
    public final void setRemoteNotificationsSeenTime(@org.jetbrains.annotations.NotNull()
    java.lang.String seenTime) {
    }
    
    public final boolean getShowHistoryOfflineArticlesToast() {
        return false;
    }
    
    public final void setShowHistoryOfflineArticlesToast(boolean value) {
    }
    
    public final boolean getLoggedOutInBackground() {
        return false;
    }
    
    public final void setLoggedOutInBackground(boolean value) {
    }
    
    public final boolean getShowDescriptionEditSuccessPrompt() {
        return false;
    }
    
    public final void setShowDescriptionEditSuccessPrompt(boolean value) {
    }
    
    public final int getSuggestedEditsCountForSurvey() {
        return 0;
    }
    
    public final void setSuggestedEditsCountForSurvey(int count) {
    }
    
    public final boolean getSuggestedEditsSurveyClicked() {
        return false;
    }
    
    public final void setSuggestedEditsSurveyClicked(boolean value) {
    }
    
    public final boolean getShowSuggestedEditsSurvey() {
        return false;
    }
    
    public final void setShowSuggestedEditsSurvey(boolean value) {
    }
    
    public final boolean getShowSuggestedEditsTooltip() {
        return false;
    }
    
    public final void setShowSuggestedEditsTooltip(boolean value) {
    }
    
    public final boolean getHasVisitedArticlePage() {
        return false;
    }
    
    public final void setHasVisitedArticlePage(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getAnnouncementShownDialogs() {
        return null;
    }
    
    public final void setAnnouncementShownDialogs(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> newAnnouncementIds) {
    }
    
    public final void resetAnnouncementShownDialogs() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getWatchlistDisabledLanguages() {
        return null;
    }
    
    public final void setWatchlistDisabledLanguages(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> langCodes) {
    }
    
    public final boolean getShouldMatchSystemTheme() {
        return false;
    }
    
    public final void setShouldMatchSystemTheme(boolean value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Date getSuggestedEditsPauseDate() {
        return null;
    }
    
    public final void setSuggestedEditsPauseDate(@org.jetbrains.annotations.NotNull()
    java.util.Date date) {
    }
    
    public final int getSuggestedEditsPauseReverts() {
        return 0;
    }
    
    public final void setSuggestedEditsPauseReverts(int count) {
    }
    
    public final boolean shouldOverrideSuggestedEditCounts() {
        return false;
    }
    
    public final int getOverrideSuggestedEditCount() {
        return 0;
    }
    
    public final int getOverrideSuggestedRevertCount() {
        return 0;
    }
    
    public final int getInstallReferrerAttempts() {
        return 0;
    }
    
    public final void setInstallReferrerAttempts(int attempts) {
    }
    
    public final boolean getShowImageTagsOnboarding() {
        return false;
    }
    
    public final void setShowImageTagsOnboarding(boolean value) {
    }
    
    public final boolean getShowImageZoomTooltip() {
        return false;
    }
    
    public final void setShowImageZoomTooltip(boolean value) {
    }
    
    public final boolean isSuggestedEditsReactivationPassStageOne() {
        return false;
    }
    
    public final void setSuggestedEditsReactivationPassStageOne(boolean pass) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTemporaryWikitext() {
        return null;
    }
    
    public final void setTemporaryWikitext(@org.jetbrains.annotations.Nullable()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPushNotificationToken() {
        return null;
    }
    
    public final void setPushNotificationToken(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPushNotificationTokenOld() {
        return null;
    }
    
    public final void setPushNotificationTokenOld(@org.jetbrains.annotations.NotNull()
    java.lang.String token) {
    }
    
    public final boolean isPushNotificationTokenSubscribed() {
        return false;
    }
    
    public final void setPushNotificationTokenSubscribed(boolean subscribed) {
    }
    
    public final boolean isSuggestedEditsReactivationTestEnabled() {
        return false;
    }
    
    public final boolean isSuggestedEditsHighestPriorityEnabled() {
        return false;
    }
    
    public final void setSuggestedEditsHighestPriorityEnabled(boolean enabled) {
    }
    
    public final void incrementExploreFeedVisitCount() {
    }
    
    public final int getExploreFeedVisitCount() {
        return 0;
    }
    
    public final int getLoggedInPageActivityVisitCount() {
        return 0;
    }
    
    public final void setLoggedInPageActivityVisitCount(int value) {
    }
    
    public final int getSelectedLanguagePositionInSearch() {
        return 0;
    }
    
    public final void setSelectedLanguagePositionInSearch(int position) {
    }
    
    public final boolean getShowOneTimeSequentialUserStatsTooltip() {
        return false;
    }
    
    public final void setShowOneTimeSequentialUserStatsTooltip(boolean value) {
    }
    
    public final boolean getShowSearchTabTooltip() {
        return false;
    }
    
    public final void setShowSearchTabTooltip(boolean value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEventPlatformSessionId() {
        return null;
    }
    
    public final void setEventPlatformSessionId(@org.jetbrains.annotations.Nullable()
    java.lang.String sessionId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getNotificationExcludedWikiCodes() {
        return null;
    }
    
    public final void setNotificationExcludedWikiCodes(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> wikis) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Set<java.lang.String> getNotificationExcludedTypeCodes() {
        return null;
    }
    
    public final void setNotificationExcludedTypeCodes(@org.jetbrains.annotations.NotNull()
    java.util.Set<java.lang.String> types) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, org.wikipedia.analytics.eventplatform.StreamConfig> getStreamConfigs() {
        return null;
    }
    
    public final void setStreamConfigs(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, org.wikipedia.analytics.eventplatform.StreamConfig> value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocalClassName() {
        return null;
    }
    
    public final void setLocalClassName(@org.jetbrains.annotations.Nullable()
    java.lang.String className) {
    }
    
    public final boolean isWatchlistPageOnboardingTooltipShown() {
        return false;
    }
    
    public final void setWatchlistPageOnboardingTooltipShown(boolean enabled) {
    }
    
    public final boolean isWatchlistMainOnboardingTooltipShown() {
        return false;
    }
    
    public final void setWatchlistMainOnboardingTooltipShown(boolean enabled) {
    }
    
    public final boolean isPageNotificationTooltipShown() {
        return false;
    }
    
    public final void setPageNotificationTooltipShown(boolean enabled) {
    }
    
    public final boolean getAutoShowEditNotices() {
        return false;
    }
    
    public final void setAutoShowEditNotices(boolean value) {
    }
    
    public final boolean isEditNoticesTooltipShown() {
        return false;
    }
    
    public final void setEditNoticesTooltipShown(boolean value) {
    }
    
    public final boolean getHideReadNotificationsEnabled() {
        return false;
    }
}