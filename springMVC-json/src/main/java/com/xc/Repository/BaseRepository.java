package com.xc.Repository;

import java.io.Serializable;

/**
 * Created by Administrator on 2015/8/3.
 */
public abstract class BaseRepository<M extends Serializable> {
    public void save(M m) {
        System.out.println("=====repository save:" + m);
    }
}
