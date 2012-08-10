package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

/**
 * ҵ���ֶ�
 * <p>
 * ������������ {@link TaskType} �ϵ�ҵ���ֶΣ�ֻ�����ֶ����ƺ��ֶ�˵��
 * 
 * @author weichao
 *
 */
public class TaskBusinessProperty implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * �ֶα�ʶ
	 */
	private Long id;
	
	/**
	 * �ֶ����ƣ��硾 entType��
	 */
	private String name;
	
	/**
	 * �ֶ��������� ����ҵ���͡�
	 */
	private String description;
	
	/**
	 * ������������id
	 */
	private Long taskTypeId;
	
	public TaskBusinessProperty() {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getTaskTypeId() {
		return taskTypeId;
	}

	public void setTaskTypeId(Long taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

}
