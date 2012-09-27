package com.topsoft.syslog.bean;

import java.util.Date;

import com.topsoft.syslog.SysLog;

public class ThrowableLog implements SysLog {
    
    private LogLevel level;
    
    private Class<?> clazz;
    
    private Date occurTime;
    
    private String message;
    
    private Throwable t;

    public ThrowableLog(LogLevel level, Class<?> clazz, Date occurTime, String message,
            Throwable t) {
        super();
        this.level = level;
        this.clazz = clazz;
        this.occurTime = occurTime;
        this.message = message;
        this.t = t;
    }
    
    public LogLevel getLevel() {
        return level;
    }

    public Class<?> getClazz() {
        return clazz;
    }

    public Date getOccurTime() {
        return occurTime;
    }

    public String getMessage() {
        return message;
    }

    public Throwable getT() {
        return t;
    }
    
}
