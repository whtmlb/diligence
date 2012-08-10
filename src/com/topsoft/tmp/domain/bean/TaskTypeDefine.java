package com.topsoft.tmp.domain.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.topsoft.tmp.domain.exception.UndefinedTaskStateException;

/**
 * 任务类型定义
 * 
 * @author weichao
 *
 */
public class TaskTypeDefine {
	
	/**
	 * 唯一标识
	 */
	private Long id;
	
	/**
	 * 任务类型名称
	 */
	private String name;
	
	/**
	 * 任务类型业务编码，唯一标识了一个业务类型。编码不同则任务类型不同，同一任务类型的不同版本，共享同一个业务编码。
	 */
	private String bizCode;
	
	/**
	 * 任务类型版本
	 */
	private String version;
	
	/**
	 * 有效标识，只有为 true 时，才能实例化该类型的任务
	 */
	private boolean valid;
	
	/**
	 * 当前版本标识,为true时，引擎才可以依据该版本的定义来创建任务实例
	 */
	private boolean current;
	
	/**
	 * 状态map:K-状态id,V-状态
	 */
	private Map<Long, TaskStateDTO> states;
	
	/**
	 * 操作map:K-操作id,V-操作
	 */
	private Map<Long, TaskActionDTO> actions;
	
	/**
	 * 状态转换规则map:K-规则id,V-规则
	 */
	private Map<Long, TaskStateTransferRuleDTO> stateTransferRules;
	
	public TaskTypeDefine(Long id, String name, String bizCode,
			String version, boolean valid, boolean current,
			Map<Long, TaskStateDTO> states, Map<Long, TaskActionDTO> actions,
			Map<Long, TaskStateTransferRuleDTO> stateTransferRules) {
		super();
		this.id = id;
		this.name = name;
		this.bizCode = bizCode;
		this.version = version;
		this.valid = valid;
		this.current = current;
		this.states = states;
		this.actions = actions;
		this.stateTransferRules = stateTransferRules;
	}
	
	/**
	 * 根据指定的任务状态，获取该状态下可能进行的操作集合
	 * 
	 * 应用场景：一、传入任务当前所处状态id，获取能够展示到页面的操作集合，
	 * 			用户是否能够进行某项操作，还需要看用户自身的权限集里是否包含该操作中指定的权限
	 * 		     二、传入任务即将达到的状态id,获取下一步可能的操作集合，
	 * 			此方法的返回值，需要结合机构相关信息和人员权限信息，一起来决定给谁发待办
	 * 
	 * @param taskStateId 任务即将达到的状态id
	 * @return 一下步可能进行的操作集合
	 */
	public List<TaskActionDTO> findAvailableActions(Long taskStateId) {
		if(states.containsKey(taskStateId)){
			List<TaskActionDTO> result = new ArrayList<TaskActionDTO>();
			for(TaskStateTransferRuleDTO rule : stateTransferRules.values()) {
				if(rule.getFromState().equals(taskStateId)) {
					result.add(actions.get(rule.getActionId()));
				}
			}
			return result;
		} else {
			throw new UndefinedTaskStateException();
		}
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBizCode() {
		return bizCode;
	}

	public String getVersion() {
		return version;
	}

	public boolean isValid() {
		return valid;
	}

	public boolean isCurrent() {
		return current;
	}

	public Map<Long, TaskStateDTO> getStates() {
		return states;
	}

	public Map<Long, TaskActionDTO> getActions() {
		return actions;
	}

	public Map<Long, TaskStateTransferRuleDTO> getStateTransferRules() {
		return stateTransferRules;
	}

}
