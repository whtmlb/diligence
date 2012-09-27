package com.topsoft.syslog;

import java.util.concurrent.ConcurrentLinkedQueue;

import com.topsoft.syslog.bean.FormatLog;
import com.topsoft.syslog.bean.SimpleFormatLog;
import com.topsoft.syslog.bean.SimpleLog;
import com.topsoft.syslog.bean.ThrowableLog;

/**
 * 系统日志管理
 * 
 * @author weichao
 *
 */
public class SystemLogManager {
    
    private static final ConcurrentLinkedQueue<SysLog> logQueue = new ConcurrentLinkedQueue<SysLog>();
    
    void simpleLogEnQueue(SimpleLog simpleLog) {
        logQueue.offer(simpleLog);
    }
    
    void simpleFormatLogEnQueue(SimpleFormatLog simpleFormatLog) {
        logQueue.offer(simpleFormatLog);
    }
    
    void formatLogEnQueue(FormatLog formatLog) {
        logQueue.offer(formatLog);
    }
    
    void throwableLogEnQueue(ThrowableLog throwableLog) {
        logQueue.offer(throwableLog);
    }
    
    protected SysLog pollOutLog() {
        return logQueue.poll();
    }

}
