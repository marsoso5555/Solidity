package com.solidity.jetbrains;

import com.intellij.openapi.fileTypes.SingleLazyInstanceSyntaxHighlighterFactory;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import org.jetbrains.annotations.NotNull;

public class SoliditySyntaxHighlighterFactory extends SingleLazyInstanceSyntaxHighlighterFactory {
    @NotNull
    @Override
    protected SyntaxHighlighter createHighlighter() {
        return new SoliditySyntaxHighlighter();
    }
} 