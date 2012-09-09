package com.topsoft.msp.entity;

import java.io.Serializable;

/**
 * 操作类型
 * 
 * 参见 Phoenix/phDesign/设计模型/工商分析模型.mdl 中消息平台部分
 * @author weichao
 *
 */
public class OperateType implements Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    
    private String code;// 代码
    private String name;// 名称
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
