package com.xc.bean;

/**
 * Created by Administrator on 2015/7/30.
 */
public class TextEditor2 {
    private SpellChecker spellChecker;
    private String name;

    public TextEditor2(SpellChecker spellChecker, String name) {
        this.spellChecker = spellChecker;
        this.name = name;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public String getName() {
        return name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
