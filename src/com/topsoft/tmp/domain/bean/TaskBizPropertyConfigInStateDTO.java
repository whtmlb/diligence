package com.topsoft.tmp.domain.bean;

/**
 * ҵ���ֶ���ĳ״̬�е���ʾ�Ͳ�����������DTO
 * 
 * @author weichao
 *
 */
public class TaskBizPropertyConfigInStateDTO {
	
	/**
	 * �ֶ����ƣ��硾 entType��
	 */
	private String name;
	
	/**
	 * �ֶ��������� ����ҵ���͡�
	 */
	private String description;
	
	/**
	 * �Ƿ�չʾ
	 */
	private boolean show;
	
	/**
	 * �Ƿ�ֻ��
	 */
	private boolean readonly;
	
	/**
	 * �Ƿ����
	 */
	private boolean mandatory;

	public TaskBizPropertyConfigInStateDTO(String name, String description,
			boolean show, boolean readonly, boolean mandatory) {
		super();
		this.name = name;
		this.description = description;
		this.show = show;
		this.readonly = readonly;
		this.mandatory = mandatory;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isShow() {
		return show;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public boolean isMandatory() {
		return mandatory;
	}
}
