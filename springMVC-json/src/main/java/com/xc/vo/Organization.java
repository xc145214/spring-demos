package com.xc.vo;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/8/3.
 */
public class Organization implements Serializable {
    private Long id;
    private String name;

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
}
