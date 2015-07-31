package com.xc.exception;

/**
 * Created by Administrator on 2015/7/31.
 */
public class SpringException extends RuntimeException {
    private String exceptionMsg;

    public SpringException(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }

    public String getExceptionMsg() {
        return this.exceptionMsg;
    }

    public void setExceptionMsg(String exceptionMsg) {
        this.exceptionMsg = exceptionMsg;
    }
}
