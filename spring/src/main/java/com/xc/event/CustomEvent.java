package com.xc.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2015/7/30.
 */
public class CustomEvent extends ApplicationEvent {
    public CustomEvent(Object source) {
        super(source);
    }
    public String toString(){
        return "My Custom Event";
    }
}
