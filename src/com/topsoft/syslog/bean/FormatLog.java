package com.topsoft.syslog.bean;

import java.util.Date;

import com.topsoft.syslog.SysLog;

public class FormatLog implements SysLog {
    
    private LogLevel level;
    
    private Class<?> clazz;
    
    private Date occurTime;
    
    private String format;
    
    private String[] args;

    public FormatLog(LogLevel level, Class<?> clazz, Date occurTime, String format,
            String[] args) {
        super();
        this.level = level;
        this.clazz = clazz;
        this.occurTime = occurTime;
        this.format = format;
        this.args = args;
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

    public String getFormat() {
        return format;
    }

    public String[] getArgs() {
        return args;
    }
    
}
