package com.topsoft.tmp.domain.service;

import java.util.List;

import com.topsoft.tmp.domain.entity.TaskAction;
import com.topsoft.tmp.domain.entity.TaskBusinessProperty;
import com.topsoft.tmp.domain.entity.TaskState;
import com.topsoft.tmp.domain.entity.TaskStateTransferRule;
import com.topsoft.tmp.domain.entity.TaskType;

/**
 * 任务类型读取
 * <p>
 * 从存储库或数据库中读取任务类型
 * 
 * @author weichao
 *
 */
public interface TaskTypeReader {
	
	/**
	 * 根据任务类型id获取任务类型
	 * 
	 * @param taskTypeId 任务类型id
	 * @return 任务类型
	 */
	TaskType findTaskTypeById(Long taskTypeId);
	
	/**	
	 * 根据业务编码和版本号获取任务类型
	 * 
	 * @param bizCode 业务编码
	 * @param version 版本号
	 * @return 任务类型
	 */
	TaskType findTaskTypeByBizCodeAndVersion(String bizCode, String version);
	
	/**
	 * 根据业务编码查询获取任务类型
	 * 
	 * @param bizCode 业务编码
	 * @return 任务类型集合
	 */
	List<TaskType> findTaskTypesByBizCode(String bizCode);
	
	/**
	 * 获取所有当前有效的任务类型
	 * 
	 * @return 任务类型集合
	 */
	List<TaskType> loadAllValidTaskTypes();
	
	/**
	 * 获取所有任务类型
	 * 
	 * @return 任务类型集合
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
