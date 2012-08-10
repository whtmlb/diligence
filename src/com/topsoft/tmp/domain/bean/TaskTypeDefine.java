package com.topsoft.tmp.domain.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.topsoft.tmp.domain.exception.UndefinedTaskStateException;

/**
 * �������Ͷ���
 * 
 * @author weichao
 *
 */
public class TaskTypeDefine {
	
	/**
	 * Ψһ��ʶ
	 */
	private Long id;
	
	/**
	 * ������������
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
	 * ��Ч��ʶ��ֻ��Ϊ true ʱ������ʵ���������͵�����
	 */
	private boolean valid;
	
	/**
	 * ��ǰ�汾��ʶ,Ϊtrueʱ������ſ������ݸð汾�Ķ�������������ʵ��
	 */
	private boolean current;
	
	/**
	 * ״̬map:K-״̬id,V-״̬
	 */
	private Map<Long, TaskStateDTO> states;
	
	/**
	 * ����map:K-����id,V-����
	 */
	private Map<Long, TaskActionDTO> actions;
	
	/**
	 * ״̬ת������map:K-����id,V-����
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
	 * ����ָ��������״̬����ȡ��״̬�¿��ܽ��еĲ�������
	 * 
	 * Ӧ�ó�����һ����������ǰ����״̬id����ȡ�ܹ�չʾ��ҳ��Ĳ������ϣ�
	 * 			�û��Ƿ��ܹ�����ĳ�����������Ҫ���û������Ȩ�޼����Ƿ�����ò�����ָ����Ȩ��
	 * 		     �����������񼴽��ﵽ��״̬id,��ȡ��һ�����ܵĲ������ϣ�
	 * 			�˷����ķ���ֵ����Ҫ��ϻ��������Ϣ����ԱȨ����Ϣ��һ����������˭������
	 * 
	 * @param taskStateId ���񼴽��ﵽ��״̬id
	 * @return һ�²����ܽ��еĲ�������
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
