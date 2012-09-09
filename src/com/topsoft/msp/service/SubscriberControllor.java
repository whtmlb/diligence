package com.topsoft.msp.service;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.collect.Maps.newConcurrentMap;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.topsoft.msp.MessageDeliver;
import com.topsoft.msp.SubscriberPublisher;
import com.topsoft.msp.SubscriberQuery;
import com.topsoft.msp.entity.Subscriber;

/**
 * 消息订阅者控制,支持并发访问
 * 
 * @author weichao
 *
 */
public class SubscriberControllor implements SubscriberPublisher, SubscriberQuery {
    
    private final Table<String, String, List<MessageDeliver>> sync_subscribers = Tables.newCustomTable(
            Maps.<String, Map<String, List<MessageDeliver>>> newConcurrentMap(),
            new Supplier<Map<String, List<MessageDeliver>>>() {

                public Map<String, List<MessageDeliver>> get()
                {
                    return newConcurrentMap();
                }
            });
    
    private final Table<String, String, List<MessageDeliver>> async_subscribers = Tables.newCustomTable(
            Maps.<String, Map<String, List<MessageDeliver>>> newConcurrentMap(),
            new Supplier<Map<String, List<MessageDeliver>>>() {

                public Map<String, List<MessageDeliver>> get()
                {
                    return newConcurrentMap();
                }
            });

    @Override
    public List<MessageDeliver> findSynchronousSubscribers(
            String businessTypeCode, String phaseTypeCode) {
        checkArgument(businessTypeCode != null, "businessTypeCode为空，获取同步消息订阅者失败");
        checkArgument(phaseTypeCode != null, "phaseTypeCode为空，获取同步消息订阅者失败");
        return sync_subscribers.get(businessTypeCode, phaseTypeCode);
    }

    @Override
    public List<MessageDeliver> findAsynchronousSubscribers(
            String businessTypeCode, String phaseTypeCode) {
        checkArgument(businessTypeCode != null, "businessTypeCode为空，获取异步消息订阅者失败");
        checkArgument(phaseTypeCode != null, "phaseTypeCode为空，获取异步消息订阅者失败");
        return async_subscribers.get(businessTypeCode, phaseTypeCode);
    }

    @Override
    public boolean pubSyncMessageSubscriber(Subscriber subscriber) {
        checkNotNull(subscriber, "消息订阅者不能为空");
        checkNotNull(subscriber.getDeliver(), "消息订阅者不能为空");
        checkArgument(subscriber.getBusinessTypeCode() != null && subscriber.getPhaseTypeCode() != null,
                "同步消息订阅者【"+subscriber.getDeliver().getMessageDeliverName()+"】的业务类型代码或者业务环节代码为空，发布失败");
        
        List<MessageDeliver> delivers = sync_subscribers.get(subscriber.getBusinessTypeCode(), subscriber.getPhaseTypeCode());
        if (delivers == null) {
            delivers = new CopyOnWriteArrayList<MessageDeliver>();
            sync_subscribers.put(subscriber.getBusinessTypeCode(), subscriber.getPhaseTypeCode(), delivers);
        }
        return delivers.add(subscriber.getDeliver());
    }

    @Override
    public boolean pubAsyncMessageSubscriber(Subscriber subscriber) {
        checkNotNull(subscriber, "消息订阅者不能为空");
        checkNotNull(subscriber.getDeliver(), "消息订阅者不能为空");
        checkArgument(subscriber.getBusinessTypeCode() != null && subscriber.getPhaseTypeCode() != null,
                "异步消息订阅者【"+subscriber.getDeliver().getMessageDeliverName()+"】的业务类型代码或者业务环节代码为空，发布失败");
        
        List<MessageDeliver> delivers = async_subscribers.get(subscriber.getBusinessTypeCode(), subscriber.getPhaseTypeCode());
        if (delivers == null) {
            delivers = new CopyOnWriteArrayList<MessageDeliver>();
            async_subscribers.put(subscriber.getBusinessTypeCode(), subscriber.getPhaseTypeCode(), delivers);
        }
        return delivers.add(subscriber.getDeliver());
    }

    @Override
    public boolean containsSyncSubscriber(String businessTypeCode,
            String phaseTypeCode) {
        checkArgument(businessTypeCode != null, "businessTypeCode为空，无法判断是否存在相应的同步消息订阅者");
        checkArgument(phaseTypeCode != null, "phaseTypeCode为空，无法判断是否存在相应的同步消息订阅者");
        return sync_subscribers.contains(businessTypeCode, phaseTypeCode);
    }

    @Override
    public boolean containsAsyncSubscriber(String businessTypeCode,
            String phaseTypeCode) {
        checkArgument(businessTypeCode != null, "businessTypeCode为空，无法判断是否存在相应的异步消息订阅者");
        checkArgument(phaseTypeCode != null, "phaseTypeCode为空，无法判断是否存在相应的异步消息订阅者");
        return async_subscribers.contains(businessTypeCode, phaseTypeCode);
    }

}
