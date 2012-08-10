package com.topsoft.tmp.domain.bean;

/**
 * 任务状态转换规则DTO
 * 
 * @author weichao
 *
 */
public class TaskStateTransferRuleDTO {
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
