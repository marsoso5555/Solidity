package com.solidity.jetbrains;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class SolidityFileType extends LanguageFileType {
    public static final SolidityFileType INSTANCE = new SolidityFileType();

    private SolidityFileType() {
        super(SolidityLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Solidity File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Solidity language file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "sol";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return SolidityIcons.FILE;
    }
} 