package com.xc.bean;

/**
 * Created by Administrator on 2015/7/30.
 */
public class TextEditor1 {
    private SpellChecker spellChecker;
    private String name;

    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public SpellChecker getSpellChecker() {
        return spellChecker;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
