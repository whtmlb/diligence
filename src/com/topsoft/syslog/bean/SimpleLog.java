package com.topsoft.syslog.bean;

import java.util.Date;

import com.topsoft.syslog.SysLog;

public class SimpleLog implements SysLog {
    
    private LogLevel level;

    private Class<?> clazz;
    
    private Date occurTime;
    
    private String detailMessage;

    public SimpleLog(LogLevel level, Class<?> clazz, Date occurTime, String detailMessage) {
        super();
        this.level = level;
        this.clazz = clazz;
        this.occurTime = occurTime;
        this.detailMessage = detailMessage;
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

    public String getDetailMessage() {
        return detailMessage;
    }
    
}
