package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

/**
 * 业务字段
 * <p>
 * 绑定在任务类型 {@link TaskType} 上的业务字段，只定义字段名称和字段说明
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
	 * 字段标识
	 */
	private Long id;
	
	/**
	 * 字段名称，如【 entType】
	 */
	private String name;
	
	/**
	 * 字段描述，如 【企业类型】
	 */
	private String description;
	
	/**
	 * 所属任务类型id
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
