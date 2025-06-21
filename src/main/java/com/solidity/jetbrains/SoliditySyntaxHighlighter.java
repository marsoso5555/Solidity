package com.solidity.jetbrains;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class SoliditySyntaxHighlighter implements SyntaxHighlighter {
    public static final TextAttributesKey KEYWORD = TextAttributesKey.createTextAttributesKey("SOLIDITY_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey TYPE = TextAttributesKey.createTextAttributesKey("SOLIDITY_TYPE", DefaultLanguageHighlighterColors.CLASS_NAME);
    public static final TextAttributesKey COMMENT = TextAttributesKey.createTextAttributesKey("SOLIDITY_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey STRING = TextAttributesKey.createTextAttributesKey("SOLIDITY_STRING", DefaultLanguageHighlighterColors.STRING);
    public static final TextAttributesKey NUMBER = TextAttributesKey.createTextAttributesKey("SOLIDITY_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey BAD_CHARACTER = TextAttributesKey.createTextAttributesKey("SOLIDITY_BAD_CHARACTER", DefaultLanguageHighlighterColors.INVALID_STRING_ESCAPE);

    private static final Map<IElementType, TextAttributesKey> keys;
    static {
        keys = new HashMap<>();
        // TODO: Fill with actual token types after lexer/parser is added
    }

    @NotNull
    @Override
    public Lexer getHighlightingLexer() {
        return new SolidityLexerAdapter();
    }

    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
        return keys.getOrDefault(tokenType, null) == null ? TextAttributesKey.EMPTY_ARRAY : new TextAttributesKey[]{keys.get(tokenType)};
    }
} 