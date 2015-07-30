package com.xc.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2015/7/30.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {


    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
