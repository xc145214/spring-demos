package com.xc.conf;

import com.xc.bean.SpellChecker;
import com.xc.bean.TextEditor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2015/7/30.
 */
@Configuration
public class TextEditorConfig {

    @Bean
    public SpellChecker spellChecker(){
        return new SpellChecker();
    }

    @Bean
    public TextEditor textEditor(){
        return  new TextEditor(spellChecker());
    }
}
