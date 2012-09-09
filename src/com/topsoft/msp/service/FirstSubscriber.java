package com.topsoft.msp.service;

import com.topsoft.msp.MessageDeliver;
import com.topsoft.msp.entity.Message;

public class FirstSubscriber implements MessageDeliver {
    
    public FirstSubscriber() {
        super();
        System.out.println("FirstSubscriber is constracted");
    }

    @Override
    public boolean deliver(Message message) {
        System.out.println("FirstSubscriber deliverd a message...");
        return true;
    }

    @Override
    public String getMessageDeliverName() {
        return FirstSubscriber.class.getSimpleName();
    }

}
