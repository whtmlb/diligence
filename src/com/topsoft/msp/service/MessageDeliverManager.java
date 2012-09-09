package com.topsoft.msp.service;

import com.topsoft.msp.MessageDeliver;
import com.topsoft.msp.OrphanMessageHandler;
import com.topsoft.msp.SubscriberQuery;
import com.topsoft.msp.entity.Message;

/**
 * 消息传递管理
 * 
 * @author weichao
 *
 */
public class MessageDeliverManager implements MessageDeliver {
    
    private MessageDistributor messageDistributor;
    
    private SubscriberQuery subscriberController;
    
    private OrphanMessageHandler orphanMessageDefaultHandler;

    public MessageDeliverManager() {
    }

    @Override
    public boolean deliver(Message message) {
        if (!subscriberController.containsSyncSubscriber(message.getBusinessTypeCode(), message.getPhasesTypeCode()) && 
                !subscriberController.containsAsyncSubscriber(message.getBusinessTypeCode(), message.getPhasesTypeCode())) {
            orphanMessageDefaultHandler.handle(message);
            return true;
        }
        //处理同步分发
        messageDistributor.synchronousDistribute(message);
        //处理异步分发
        handleAsyncSubscribers(message.clone());
        writeSystemLog(message);
        return true;
    }

    @Override
    public String getMessageDeliverName() {
        return MessageDeliverManager.class.getName();
    }
    
    private void handleAsyncSubscribers(Message message) {
        if (subscriberController.containsAsyncSubscriber(message.getBusinessTypeCode(), message.getPhasesTypeCode())) {
            //TODO 如果有异步订阅者，把消息加入异步消息队列
        }
    }
    
    private void writeSystemLog(Message message) {
        //TODO 调用日志组件的系统日志相关功能
    }

}
