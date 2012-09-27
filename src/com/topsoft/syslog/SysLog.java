package com.topsoft.syslog;

import java.util.Date;

import com.topsoft.syslog.bean.LogLevel;

/**
 * 系统日志
 * 
 * @author weichao
 *
 */
public interface SysLog {
    
    LogLevel getLevel();
    
    Class<?> getClazz();
    
    Date getOccurTime();
    
}
