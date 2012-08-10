package com.topsoft.tmp.domain.bean;

/**
 * ����״̬ת������DTO
 * 
 * @author weichao
 *
 */
public class TaskStateTransferRuleDTO {
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
	
	private TaskStateTransferRuleDTO(Long id, Long actionId, Long fromState,
			Long toState) {
		super();
		this.id = id;
		this.actionId = actionId;
		this.fromState = fromState;
		this.toState = toState;
	}

	public Long getId() {
		return id;
	}

	public Long getActionId() {
		return actionId;
	}

	public Long getFromState() {
		return fromState;
	}

	public Long getToState() {
		return toState;
	}
}
