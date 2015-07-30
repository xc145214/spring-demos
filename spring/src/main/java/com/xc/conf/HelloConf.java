package com.xc.conf;


import com.xc.bean.Hello;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

/**
 * Created by Administrator on 2015/7/30.
 */
@Configurable
public class HelloConf {

    @Bean
    public Hello hello() {
        return new Hello();
    }
}
