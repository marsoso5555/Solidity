package com.solidity.jetbrains;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;

public class SolidityLexer implements FlexLexer {
    public SolidityLexer(CharSequence buffer) {
        // Placeholder constructor
    }

    @Override
    public void yybegin(int state) {
        // Placeholder method
    }

    @Override
    public int yystate() {
        return 0; // Placeholder
    }

    @Override
    public int getTokenStart() {
        return 0; // Placeholder
    }

    @Override
    public int getTokenEnd() {
        return 0; // Placeholder
    }

    @Override
    public IElementType advance() {
        return null; // Placeholder
    }

    @Override
    public void reset(CharSequence buffer, int start, int end, int initialState) {
        // Placeholder method
    }
} 