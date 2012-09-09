package com.topsoft.msp;

import java.util.List;

/**
 * 订阅者查询接口
 * 
 * @author weichao
 *
 */
public interface SubscriberQuery {
    
    /**
     * 获取同步订阅者集合
     * 
     * @param businessTypeCode
     * @param phaseTypeCode
     * @return
     */
    List<MessageDeliver> findSynchronousSubscribers(String businessTypeCode, String phaseTypeCode);

    /**
     * 获取异步订阅者集合
     * 
     * @param businessTypeCode
     * @param phaseTypeCode
     * @return
     */
    List<MessageDeliver> findAsynchronousSubscribers(String businessTypeCode, String phaseTypeCode);
    
    /**
     * 判断是否存在指定业务类型和环节类型的同步订阅者
     * 
     * @param businessTypeCode
     * @param phaseTypeCode
     * @return
     */
    boolean containsSyncSubscriber(String businessTypeCode, String phaseTypeCode);
    
    /**
     * 判断是否存在指定业务类型和环节类型的异步订阅者
     * 
     * @param businessTypeCode
     * @param phaseTypeCode
     * @return
     */
    boolean containsAsyncSubscriber(String businessTypeCode, String phaseTypeCode);
}
