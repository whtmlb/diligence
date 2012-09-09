package com.topsoft.msp;

import com.topsoft.msp.entity.Message;

/**
 * 孤儿消息处理接口
 * 
 * @author weichao
 *
 */
public interface OrphanMessageHandler {
    
    void handle(Message message);

}
