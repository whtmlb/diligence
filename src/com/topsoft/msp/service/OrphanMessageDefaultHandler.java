package com.topsoft.msp.service;

import com.topsoft.msp.OrphanMessageHandler;
import com.topsoft.msp.entity.Message;

/**
 * 孤儿消息处理接口默认实现
 * 
 * @author weichao
 *
 */
public class OrphanMessageDefaultHandler implements OrphanMessageHandler {

    @Override
    public void handle(Message message) {
        System.out.println("new Orphan come, bizCode【"+message.getBusinessTypeCode()
                +"】, phaseCode【"+message.getPhasesTypeCode()+"】");
        //TODO 调用日志组件接口来记录日志
    }

}
