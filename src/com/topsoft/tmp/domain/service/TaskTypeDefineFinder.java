package com.topsoft.tmp.domain.service;

import java.util.Map;

import com.topsoft.tmp.domain.bean.TaskBizPropertyConfigInStateDTO;
import com.topsoft.tmp.domain.bean.TaskTypeDefine;

/**
 * 任务类型定义查询服务
 * <p>
 * 面向外部调用
 * 
 * @author weichao
 *
 */
public interface TaskTypeDefineFinder {
	
	/**
	 * 根据任务类型编码获取“当前版本”的任务类型定义
	 * 
	 * @param bizCode 任务类型编码
	 * @return 任务类型定义
	 */
	TaskTypeDefine findCurrentTaskTypeDefineByBizCode(String bizCode);

	/**
	 * 根据任务类型定义id获取任务类型定义
	 * 
	 * @param taskTypeId 任务类型定义id
	 * @return 任务类型定义
	 */
	TaskTypeDefine findTaskTypeDefineById(Long taskTypeDefineId);
	
	/**
	 * 根据任务类型定义id和任务所处状态id获取业务字段在该状态下的显示和操作特性配置
	 * 
	 * @param taskTypeDefineId 任务类型定义id
	 * @param taskStateId 任务所处状态id
	 * @return map：	K-字段名称，如【 entType】
	 * 				V-配置DTO
	 */
	Map<String, TaskBizPropertyConfigInStateDTO> findBizPropertyConfigs(Long taskTypeDefineId, Long taskStateId);
}
