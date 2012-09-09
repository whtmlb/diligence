package com.topsoft.msp.entity;

import java.io.Serializable;

/**
 * 环节类型
 * 
 * 设计思路请参见 Phoenix/phDesign/设计模型/工商分析模型.mdl 中消息平台部分
 */
public class PhaseType implements Serializable {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String code;// 代码
    private String name;// 名称

	public String getCode()
	{
		return code;
	}

	public void setCode(String code)
	{
		this.code = code;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	@Override
	public int hashCode()
	{
		int result = 1;
		result = 31 * result + (getCode() == null ? 0 : getCode().hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		BusinessType other = (BusinessType) obj;

		return this.getCode() == other.getCode() || (this.getCode() != null && this.getCode().equals(other.getCode()));
	}

}
