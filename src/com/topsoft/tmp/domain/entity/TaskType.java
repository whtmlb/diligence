package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

/**
 * ��������
 * <p>
 * һ��TaskType�������Ϊһ��ҵ�����࣬��ҵ�������һ��ҵ��ʵ���Ϊ�������һ������<br>
 * TaskType�����˸����͵������ڽ��й��������״̬���Ը�������ܽ��еĲ�����״̬Ǩ�ƹ���<br>
 * ���������ת�󶨵�����Լ���ͬ״̬����Щ��ݵ�չʾ��Ϊ�Ͳ�����Ϊ��
 * 
 * @author weichao
 */
public class TaskType implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	public int age;
	
	/**
	 * Ψһ��ʶ
	 */
	private Long id;
	
	/**
	 * �����������
	 */
	private String name;
	
	/**
	 * ��������ҵ����룬Ψһ��ʶ��һ��ҵ�����͡����벻ͬ���������Ͳ�ͬ��ͬһ�������͵Ĳ�ͬ�汾������ͬһ��ҵ����롣
	 */
	private String bizCode;
	
	/**
	 * �������Ͱ汾
	 */
	private String version;
	
	/**
	 * ��ǰ�汾��ʶ,Ϊtrueʱ������ſ������ݸð汾�Ķ�������������ʵ��
	 */
	private boolean current;
	
	/**
	 * ��Ч��ʶ
	 */
	private boolean valid;
	
	public TaskType() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}

}
