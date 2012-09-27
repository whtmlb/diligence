package com.topsoft.syslog;

import java.util.Date;

/**
 * 系统日志接口
 * 
 * @author weichao
 *
 */
public interface SysLogger {
    void info(Class<?> clazz, Date occurTime, String detailMessage);
    void info(Class<?> clazz, Date occurTime, String format, String arg);
    void info(Class<?> clazz, Date occurTime, String format, String[] args);
    void info(Class<?> clazz, Date occurTime, String message, Throwable t);
    
    void debug(Class<?> clazz, Date occurTime, String detailMessage);
    void debug(Class<?> clazz, Date occurTime, String format, String arg);
    void debug(Class<?> clazz, Date occurTime, String format, String[] args);
    void indebugfo(Class<?> clazz, Date occurTime, String message, Throwable t);
    
    void warn(Class<?> clazz, Date occurTime, String detailMessage);
    void warn(Class<?> clazz, Date occurTime, String format, String arg);
    void warn(Class<?> clazz, Date occurTime, String format, String[] args);
    void warn(Class<?> clazz, Date occurTime, String message, Throwable t);
    
    void error(Class<?> clazz, Date occurTime, String detailMessage);
    void error(Class<?> clazz, Date occurTime, String format, String arg);
    void error(Class<?> clazz, Date occurTime, String format, String[] args);
    void error(Class<?> clazz, Date occurTime, String message, Throwable t);
}
