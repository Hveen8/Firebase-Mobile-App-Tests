package org.wikipedia.edit.richtext;

import java.lang.System;

/**
 * Represents a single syntax highlighting rule.
 *
 * example:   [[ lorem ipsum ]]
 *            |       |      |
 *       startSymbol  |      |
 *                    |  endSymbol
 *                    |
 *                spanStyle
 */
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lorg/wikipedia/edit/richtext/SyntaxRule;", "", "startSymbol", "", "endSymbol", "spanStyle", "Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "(Ljava/lang/String;Ljava/lang/String;Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;)V", "getEndSymbol", "()Ljava/lang/String;", "isStartEndSame", "", "()Z", "getSpanStyle", "()Lorg/wikipedia/edit/richtext/SyntaxRuleStyle;", "getStartSymbol", "app_alphaDebug"})
public final class SyntaxRule {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String startSymbol = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String endSymbol = null;
    @org.jetbrains.annotations.NotNull()
    private final org.wikipedia.edit.richtext.SyntaxRuleStyle spanStyle = null;
    
    /**
     * Whether the start symbol is the same as the end symbol
     * (for faster processing)
     */
    private final boolean isStartEndSame = false;
    
    public SyntaxRule(@org.jetbrains.annotations.NotNull()
    java.lang.String startSymbol, @org.jetbrains.annotations.NotNull()
    java.lang.String endSymbol, @org.jetbrains.annotations.NotNull()
    org.wikipedia.edit.richtext.SyntaxRuleStyle spanStyle) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStartSymbol() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEndSymbol() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wikipedia.edit.richtext.SyntaxRuleStyle getSpanStyle() {
        return null;
    }
    
    public final boolean isStartEndSame() {
        return false;
    }
}