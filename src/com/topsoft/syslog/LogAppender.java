package com.topsoft.syslog;

import java.text.SimpleDateFormat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.topsoft.syslog.bean.FormatLog;
import com.topsoft.syslog.bean.LogLevel;
import com.topsoft.syslog.bean.SimpleFormatLog;
import com.topsoft.syslog.bean.SimpleLog;
import com.topsoft.syslog.bean.ThrowableLog;

/**
 * log记录器
 * 
 * @author weichao
 *
 */
public class LogAppender implements Runnable {
    
    private SystemLogManager systemLogManager;
    
    private static final String BIZOCCURTIME = "业务发生时间";
    
    private ThreadLocal<SimpleDateFormat> simpleDateFormat = new ThreadLocal<SimpleDateFormat>(){
        protected SimpleDateFormat initialValue() {
            return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        }
    };
    
    private Thread appender;
    
    public LogAppender() {
        super();
    }
    
    public void startLogging() {
        appender = new Thread(this);
        appender.run();
    }

    @Override
    public void run() {
        SysLog sysLog;
        SimpleDateFormat dateFormat = simpleDateFormat.get();
        while (true) {
            sysLog = systemLogManager.pollOutLog();
            if(sysLog == null) {
                try {
                    wait(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                continue;
            }
            Logger logger = LoggerFactory.getLogger(sysLog.getClazz());
            LogLevel level = sysLog.getLevel();
            String occurTime = BIZOCCURTIME + "[" +dateFormat.format(sysLog.getOccurTime()) + "],";
            if (sysLog instanceof SimpleLog) {
                SimpleLog simple = (SimpleLog) sysLog;
                switch (level) {
                case INFO : {
                    logger.info(occurTime + simple.getDetailMessage());
                    break;
                }
                case DEBUG : {
                    logger.debug(occurTime + simple.getDetailMessage());
                    break;
                }
                case WARN : {
                    logger.warn(occurTime + simple.getDetailMessage());
                    break;
                }
                case ERROR : {
                    logger.error(occurTime + simple.getDetailMessage());
                    break;
                }
                }
            } else if (sysLog instanceof SimpleFormatLog) {
                SimpleFormatLog simpleFormat = (SimpleFormatLog) sysLog;
                switch (level) {
                case INFO : {
                    logger.info(occurTime + simpleFormat.getFormat(), simpleFormat.getArg());
                    break;
                }
                case DEBUG : {
                    logger.debug(occurTime + simpleFormat.getFormat(), simpleFormat.getArg());
                    break;
                }
                case WARN : {
                    logger.warn(occurTime + simpleFormat.getFormat(), simpleFormat.getArg());
                    break;
                }
                case ERROR : {
                    logger.error(occurTime + simpleFormat.getFormat(), simpleFormat.getArg());
                    break;
                }
                }
            } else if (sysLog instanceof FormatLog) {
                ThrowableLog throwableLog = (ThrowableLog) sysLog;
                switch (level) {
                case INFO : {
                    logger.info(occurTime + throwableLog.getMessage(), throwableLog.getT());
                    break;
                }
                case DEBUG : {
                    logger.debug(occurTime + throwableLog.getMessage(), throwableLog.getT());
                    break;
                }
                case WARN : {
                    logger.warn(occurTime + throwableLog.getMessage(), throwableLog.getT());
                    break;
                }
                case ERROR : {
                    logger.error(occurTime + throwableLog.getMessage(), throwableLog.getT());
                    break;
                }
                }
            } else if (sysLog instanceof SimpleFormatLog) {
                SimpleFormatLog simpleFormat = (SimpleFormatLog) sysLog;
                switch (level) {
                case INFO : {
                    logger.info(occurTime + simpleFormat.getFormat(),simpleFormat.getArg());
                    break;
                }
                case DEBUG : {
                    logger.debug(occurTime + simpleFormat.getFormat(),simpleFormat.getArg());
                    break;
                }
                case WARN : {
                    logger.warn(occurTime + simpleFormat.getFormat(),simpleFormat.getArg());
                    break;
                }
                case ERROR : {
                    logger.error(occurTime + simpleFormat.getFormat(),simpleFormat.getArg());
                    break;
                }
                }
            }
        }
    }
    
}
