package com.topsoft.msp.service;

import java.util.List;

import com.topsoft.msp.MessageDeliver;
import com.topsoft.msp.SubscriberQuery;
import com.topsoft.msp.entity.Message;

/**
 * 消息分发器
 * 
 * @author weichao
 * 
 */
public class MessageDistributor {

    private SubscriberQuery subscriberController;

    public MessageDistributor() {
    }

    public void synchronousDistribute(Message message) {
        List<MessageDeliver> delivers = subscriberController
                .findSynchronousSubscribers(message.getBusinessTypeCode(), message.getPhasesTypeCode());
        if (delivers != null) {
            for (MessageDeliver messageDeliver : delivers) {
                messageDeliver.deliver(message.clone());
            }
        }
    }
    
    public void asynchronousDistribute(Message message) {
        List<MessageDeliver> delivers = subscriberController
                .findAsynchronousSubscribers(message.getBusinessTypeCode(), message.getPhasesTypeCode());
        if (delivers != null) {
            //TODO 异步分发消息
        }
    }

    static class MessageWithSubscriber {
        final Message message;
        final MessageDeliver subscriber;

        public MessageWithSubscriber(Message message, MessageDeliver subscriber) {
            this.message = message;
            this.subscriber = subscriber;
        }

    }
}
