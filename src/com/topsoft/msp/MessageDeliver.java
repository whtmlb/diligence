package com.topsoft.msp;

import com.topsoft.msp.entity.Message;

/**
 * 消息传递接口
 * 
 * @author weichao
 *
 */
public interface MessageDeliver {

    /**
     * 消息传递
     * 
     * @param message 消息
     * @return 是否传递成功
     */
    boolean deliver(Message message);
    
    /**
     * 获取消息传递者的名称
     * 
     * @return 消息传递者的名称
     */
    String getMessageDeliverName();
}
