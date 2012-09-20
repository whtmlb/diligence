package com.topsoft.msp.entity;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

/**
 * 消息基类
 * 
 * 设计思路请参见 Phoenix/phDesign/设计模型/工商分析模型.mdl 中消息平台部分
 */
public class Message implements Serializable, Cloneable {

    /**
	 * 
	 */
    private static final long serialVersionUID = 1L;

    private String name; // 名称
    private Date currentTime;// 当前时间
    private String clientAddress;// 客户端地址
    private Long currentOrgId;// 当前机关标识
    private String currentOrgName;// 当前机关名称
    private Long currentOperatorId;// 当前操作员标识
    private String currentOperatorName;// 当前操作员姓名
    private String businessTypeCode;// 业务类型代码
    private Long bussinessTradeId;// 业务交易标识
    private String phaseTypeCode;// 环节类型代码
    private Long phaseTradeId;// 环节交易标识
    private String operateTypeCode;// 操作类型代码
    private String detailData;
    private String memo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public Long getCurrentOrgId() {
        return currentOrgId;
    }

    public void setCurrentOrgId(Long currentOrgId) {
        this.currentOrgId = currentOrgId;
    }

    public String getCurrentOrgName() {
        return currentOrgName;
    }

    public void setCurrentOrgName(String currentOrgName) {
        this.currentOrgName = currentOrgName;
    }

    public Long getCurrentOperatorId() {
        return currentOperatorId;
    }

    public void setCurrentOperatorId(Long currentOperatorId) {
        this.currentOperatorId = currentOperatorId;
    }

    public String getBusinessTypeCode() {
        return businessTypeCode;
    }

    public void setBusinessTypeCode(String businessTypeCode) {
        this.businessTypeCode = businessTypeCode;
    }

    public Long getBussinessTradeId() {
        return bussinessTradeId;
    }

    public void setBussinessTradeId(Long bussinessTradeId) {
        this.bussinessTradeId = bussinessTradeId;
    }

    public String getPhasesTypeCode() {
        return phaseTypeCode;
    }

    public void setPhasesTypeCode(String phasesTypeCode) {
        this.phaseTypeCode = phasesTypeCode;
    }

    public Long getPhasesTradeId() {
        return phaseTradeId;
    }

    public void setPhasesTradeId(Long phasesTradeId) {
        this.phaseTradeId = phasesTradeId;
    }

    public String getCurrentOperatorName() {
        return currentOperatorName;
    }

    public void setCurrentOperatorName(String currentOperatorName) {
        this.currentOperatorName = currentOperatorName;
    }

    public String getOperateTypeCode() {
        return operateTypeCode;
    }

    public void setOperateTypeCode(String operateTypeCode) {
        this.operateTypeCode = operateTypeCode;
    }

    public String getDetailData() {
        return detailData;
    }

    public void setDetailData(String detailData) {
        this.detailData = detailData;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Message{");
        builder.append("name").append('=').append(name).append(", ");
        builder.append("currentTime").append('=').append(currentTime).append(", ");
        builder.append("clientAddress").append('=').append(clientAddress).append(", ");
        builder.append("currentOrgName").append('=').append(currentOrgName).append(", ");
        builder.append("currentOperatorName").append('=').append(currentOperatorName).append(", ");
        builder.append("businessTypeCode").append('=').append(businessTypeCode).append(", ");
        builder.append("bussinessTradeId").append('=').append(bussinessTradeId).append(", ");
        builder.append("phasesTypeCode").append('=').append(phaseTypeCode).append(", ");
        builder.append("phasesTradeId").append('=').append(phaseTradeId).append('}');
        builder.append("operateTypeCode").append('=').append(phaseTradeId).append('}');
        return builder.toString();
    }

    @Override
    public Message clone() {
        ByteArrayOutputStream bo = new ByteArrayOutputStream();
        Message newMessage = null;
        try {
            ObjectOutputStream oo = new ObjectOutputStream(bo);
            oo.writeObject(this);
            ByteArrayInputStream bi = new ByteArrayInputStream(bo.toByteArray());
            ObjectInputStream oi = new ObjectInputStream(bi);
            newMessage = (Message) oi.readObject();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return newMessage;
    }
}
