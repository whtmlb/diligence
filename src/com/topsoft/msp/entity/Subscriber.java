package com.topsoft.msp.entity;

import com.topsoft.msp.MessageDeliver;

/**
 * 订阅者
 * 
 * @author weichao
 *
 */
public class Subscriber {

    private String businessTypeCode;
    
    private String phaseTypeCode;
    
    private MessageDeliver deliver;

    public String getBusinessTypeCode() {
        return businessTypeCode;
    }

    public void setBusinessTypeCode(String businessTypeCode) {
        this.businessTypeCode = businessTypeCode;
    }

    public String getPhaseTypeCode() {
        return phaseTypeCode;
    }

    public void setPhaseTypeCode(String phaseTypeCode) {
        this.phaseTypeCode = phaseTypeCode;
    }

    public MessageDeliver getDeliver() {
        return deliver;
    }

    public void setDeliver(MessageDeliver deliver) {
        this.deliver = deliver;
    }
    
}
