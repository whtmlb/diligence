package com.topsoft.msp.service;

import com.topsoft.msp.MessageDeliver;
import com.topsoft.msp.entity.Message;

public class SecondSubscriber implements MessageDeliver {

    public SecondSubscriber() {
        super();
        System.out.println("SecondSubscriber is constracted");
    }

    @Override
    public boolean deliver(Message message) {
        System.out.println("SecondSubscriber deliverd a message...");
        return true;
    }

    @Override
    public String getMessageDeliverName() {
        return this.getClass().getSimpleName();
    }

}
