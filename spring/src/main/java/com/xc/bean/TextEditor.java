package com.xc.bean;

/**
 * Created by Administrator on 2015/7/30.
 */
public class TextEditor {

    public SpellChecker spellChecker;

    /**
     * ���캯��ע��
     * @param spellChecker
     */
    public TextEditor(SpellChecker spellChecker) {
        System.out.println("Inside TextEditor constructor.");
        this.spellChecker = spellChecker;
    }

    public void spellCheck() {
        spellChecker.checkSpelling();
    }
}
