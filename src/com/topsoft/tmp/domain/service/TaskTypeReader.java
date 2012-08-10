package com.topsoft.tmp.domain.service;

import java.util.List;

import com.topsoft.tmp.domain.entity.TaskAction;
import com.topsoft.tmp.domain.entity.TaskBusinessProperty;
import com.topsoft.tmp.domain.entity.TaskState;
import com.topsoft.tmp.domain.entity.TaskStateTransferRule;
import com.topsoft.tmp.domain.entity.TaskType;

/**
 * �������Ͷ�ȡ
 * <p>
 * �Ӵ洢������ݿ��ж�ȡ��������
 * 
 * @author weichao
 *
 */
public interface TaskTypeReader {
	
	/**
	 * ������������id��ȡ��������
	 * 
	 * @param taskTypeId ��������id
	 * @return ��������
	 */
	TaskType findTaskTypeById(Long taskTypeId);
	
	/**	
	 * ����ҵ�����Ͱ汾�Ż�ȡ��������
	 * 
	 * @param bizCode ҵ�����
	 * @param version �汾��
	 * @return ��������
	 */
	TaskType findTaskTypeByBizCodeAndVersion(String bizCode, String version);
	
	/**
	 * ����ҵ������ѯ��ȡ��������
	 * 
	 * @param bizCode ҵ�����
	 * @return �������ͼ���
	 */
	List<TaskType> findTaskTypesByBizCode(String bizCode);
	
	/**
	 * ��ȡ���е�ǰ��Ч����������
	 * 
	 * @return �������ͼ���
	 */
	List<TaskType> loadAllValidTaskTypes();
	
	/**
	 * ��ȡ������������
	 * 
	 * @return �������ͼ���
	 */
	List<TaskType> loadAllTaskTypes();
	
	TaskState findTaskStateById(Long taskStateId);
	
	TaskState findTaskStateByTaskTypeIdAndStateName(Long taskTypeId, String stateName);
	
	List<TaskState> findTaskStatesByTaskTypeId(Long taskTypeId);
	
	TaskAction findTaskActionById(Long taskActionId);
	
	TaskAction findTaskActionByTaskTypeIdAndActionName(Long taskTypeId, String actionName);
	
	List<TaskAction> findTaskActionsByTaskTypeId(Long taskTypeId);
	
	List<TaskBusinessProperty> findTaskBusinessProertiesByTaskTypeId(Long taskTypeId);
	
	TaskStateTransferRule findStateTransferRuleById(Long stateTransferRuleId);
	
	List<TaskStateTransferRule> findStateTransferRuleByTaskActionId(Long taskActionId);
}
