package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

/**
 * 任务状态
 * <p>
 * 绑定在任务类型 {@link TaskType} 上，定义该类型的任务可能存在的状态
 * 
 * @author weichao
 *
 */
public class TaskState implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 所有任务类型的状态集中都必须有一个特殊的任务状态：已提交。任何类型的新建任务都处于此状态。
	 */
	public static final String TASKSTATE_SUBMITTED = "已提交";
	
	/**
	 * 状态标识
	 */
	private Long id;
	
	/**
	 * 状态名称,一个任务类型的状态集中，不应该存在两个名称相同的状态
	 */
	private String name;
	
	/**
	 * 所属任务类型id
	 */
	private Long taskTypeId;
	
	public TaskState() {
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

	public Long getTaskTypeId() {
		return taskTypeId;
	}

	public void setTaskTypeId(Long taskTypeId) {
		this.taskTypeId = taskTypeId;
	}
}
