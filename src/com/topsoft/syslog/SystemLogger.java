package com.topsoft.syslog;

import java.util.Date;

import com.topsoft.syslog.bean.FormatLog;
import com.topsoft.syslog.bean.LogLevel;
import com.topsoft.syslog.bean.SimpleFormatLog;
import com.topsoft.syslog.bean.SimpleLog;
import com.topsoft.syslog.bean.ThrowableLog;

/**
 * 系统日志记录器
 * 
 * @author weichao
 *
 */
public class SystemLogger implements SysLogger{

    private SystemLogManager logManager;
    
    @Override
    public void info(Class<?> clazz, Date occurTime, String detailMessage) {
        logManager.simpleLogEnQueue(new SimpleLog(LogLevel.INFO, clazz, occurTime, detailMessage));
    }

    @Override
    public void info(Class<?> clazz, Date occurTime, String format, String arg) {
        logManager.simpleFormatLogEnQueue(new SimpleFormatLog(LogLevel.INFO, clazz, occurTime, format, arg));
    }

    @Override
    public void info(Class<?> clazz, Date occurTime, String format,
            String[] args) {
        logManager.formatLogEnQueue(new FormatLog(LogLevel.INFO, clazz, occurTime, format, args));        
    }

    @Override
    public void info(Class<?> clazz, Date occurTime, String message, Throwable t) {
        logManager.throwableLogEnQueue(new ThrowableLog(LogLevel.INFO, clazz, occurTime, message, t));        
    }

    @Override
    public void debug(Class<?> clazz, Date occurTime, String detailMessage) {
        logManager.simpleLogEnQueue(new SimpleLog(LogLevel.DEBUG, clazz, occurTime, detailMessage));
    }

    @Override
    public void debug(Class<?> clazz, Date occurTime, String format, String arg) {
        logManager.simpleFormatLogEnQueue(new SimpleFormatLog(LogLevel.DEBUG, clazz, occurTime, format, arg));        
    }

    @Override
    public void debug(Class<?> clazz, Date occurTime, String format,
            String[] args) {
        logManager.formatLogEnQueue(new FormatLog(LogLevel.DEBUG, clazz, occurTime, format, args));        
    }

    @Override
    public void indebugfo(Class<?> clazz, Date occurTime, String message,
            Throwable t) {
        logManager.throwableLogEnQueue(new ThrowableLog(LogLevel.DEBUG, clazz, occurTime, message, t));        
    }

    @Override
    public void warn(Class<?> clazz, Date occurTime, String detailMessage) {
        logManager.simpleLogEnQueue(new SimpleLog(LogLevel.WARN, clazz, occurTime, detailMessage));        
    }

    @Override
    public void warn(Class<?> clazz, Date occurTime, String format, String arg) {
        logManager.simpleFormatLogEnQueue(new SimpleFormatLog(LogLevel.WARN, clazz, occurTime, format, arg));        
    }

    @Override
    public void warn(Class<?> clazz, Date occurTime, String format,
            String[] args) {
        logManager.formatLogEnQueue(new FormatLog(LogLevel.WARN, clazz, occurTime, format, args));        
    }

    @Override
    public void warn(Class<?> clazz, Date occurTime, String message, Throwable t) {
        logManager.throwableLogEnQueue(new ThrowableLog(LogLevel.WARN, clazz, occurTime, message, t));        
    }

    @Override
    public void error(Class<?> clazz, Date occurTime, String detailMessage) {
        logManager.simpleLogEnQueue(new SimpleLog(LogLevel.ERROR, clazz, occurTime, detailMessage));        
    }

    @Override
    public void error(Class<?> clazz, Date occurTime, String format, String arg) {
        logManager.simpleFormatLogEnQueue(new SimpleFormatLog(LogLevel.ERROR, clazz, occurTime, format, arg));        
    }

    @Override
    public void error(Class<?> clazz, Date occurTime, String format,
            String[] args) {
        logManager.formatLogEnQueue(new FormatLog(LogLevel.ERROR, clazz, occurTime, format, args));        
    }

    @Override
    public void error(Class<?> clazz, Date occurTime, String message,
            Throwable t) {
        logManager.throwableLogEnQueue(new ThrowableLog(LogLevel.ERROR, clazz, occurTime, message, t));        
    }

}
