package com.xc.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/8/3.
 */
public class User implements Serializable {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
