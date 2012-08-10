package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

/**
 * ����״̬ת������
 * <p>
 * ������������ {@link TaskType} �ϣ��������п��ܵ�����״̬Ǩ�ƹ���
 * �κ�һ��״̬ת��������һ������������𣬸ò����Ǹ��������͵Ĳ������е�һԱ��
 * ������������ͱ�����{@link TaskActionType}.CHANGE_STATE
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
	 * �����ʶ
	 */
	private Long id;
	
	/**
	 * ����id
	 */
	private Long actionId;
	
	/**
	 * ת��ǰ״̬�� id
	 */
	private Long fromState;
	
	/**
	 * ת����״̬�� id
	 */
	private Long toState;

	/**
	 * ������������id
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
