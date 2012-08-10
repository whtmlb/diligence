package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

/**
 * 任务状态转换规则
 * <p>
 * 绑定在任务类型 {@link TaskType} 上，描述所有可能的任务状态迁移规则，
 * 任何一次状态转换都是由一次任务操作发起，该操作是该任务类型的操作集中的一员，
 * 而且其操作类型必须是{@link TaskActionType}.CHANGE_STATE
 * 
 * @author weichao
 *
 */
public class TaskStateTransferRule implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 规则标识
	 */
	private Long id;
	
	/**
	 * 操作id
	 */
	private Long actionId;
	
	/**
	 * 转换前状态的 id
	 */
	private Long fromState;
	
	/**
	 * 转换后状态的 id
	 */
	private Long toState;

	/**
	 * 所属任务类型id
	 */
	private Long taskTypeId;
	
	public TaskStateTransferRule() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getActionId() {
		return actionId;
	}

	public void setActionId(Long actionId) {
		this.actionId = actionId;
	}

	public Long getFromState() {
		return fromState;
	}

	public void setFromState(Long fromState) {
		this.fromState = fromState;
	}

	public Long getToState() {
		return toState;
	}

	public void setToState(Long toState) {
		this.toState = toState;
	}

	public Long getTaskTypeId() {
		return taskTypeId;
	}

	public void setTaskTypeId(Long taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

}
