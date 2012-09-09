package com.topsoft.msp;

import com.topsoft.msp.entity.Subscriber;

/**
 * 发布订阅者
 * 
 * @author weichao
 *
 */
public interface SubscriberPublisher
{
    /**
     * 发布同步消息订阅者
     * 
     * @param subscriber 同步消息订阅者
     * @return 订阅者发布是否成功
     */
    boolean pubSyncMessageSubscriber(Subscriber subscriber);
    
    /**
     * 发布异步消息订阅者
     * 
     * @param subscriber 异步消息订阅者 
     * @return 订阅者发布是否成功
     */
    boolean pubAsyncMessageSubscriber(Subscriber subscriber);
}