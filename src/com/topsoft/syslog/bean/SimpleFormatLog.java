package com.topsoft.syslog.bean;

import java.util.Date;

import com.topsoft.syslog.SysLog;

public class SimpleFormatLog implements SysLog {
    
    private LogLevel level;
    
    private Class<?> clazz;
    
    private Date occurTime;
    
    private String format;
    
    private String arg;

    public SimpleFormatLog(LogLevel level, Class<?> clazz, Date occurTime, String format,
            String arg) {
        super();
        this.level = level;
        this.clazz = clazz;
        this.occurTime = occurTime;
        this.format = format;
        this.arg = arg;
    }
    
    @Override
    public LogLevel getLevel() {
        return level;
    }

    @Override
    public Class<?> getClazz() {
        return clazz;
    }

    public Date getOccurTime() {
        return occurTime;
    }

    public String getFormat() {
        return format;
    }

    public String getArg() {
        return arg;
    }
    
}
