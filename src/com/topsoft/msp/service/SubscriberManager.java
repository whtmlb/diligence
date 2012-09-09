package com.topsoft.msp.service;

import java.util.List;

import com.topsoft.msp.SubscriberPublisher;
import com.topsoft.msp.entity.Subscriber;

/**
 * 消息订阅者管理器
 * 
 * <p>负责读取消息订阅者注册信息，实例化订阅者并发布到消息订阅者控制器
 * 
 * @author weichao
 *
 */
public class SubscriberManager {
    
    private List<Subscriber> sycnDelivers;
    
    private List<Subscriber> asycnDelivers;
    
    private SubscriberPublisher subscriberController;
    
    //初始化方法
    public void init() {
        
        for(Subscriber subscriber : sycnDelivers) {
            subscriberController.pubSyncMessageSubscriber(subscriber);
        }
        
        for(Subscriber subscriber : asycnDelivers) {
            subscriberController.pubAsyncMessageSubscriber(subscriber);
        }
    }

    public void setSycnDelivers(List<Subscriber> sycnDelivers) {
        this.sycnDelivers = sycnDelivers;
    }

    public void setAsycnDelivers(List<Subscriber> asycnDelivers) {
        this.asycnDelivers = asycnDelivers;
    }

    public void setSubscriberController(SubscriberPublisher subscriberController) {
        this.subscriberController = subscriberController;
    }
    
}
