package com.topsoft.tmp.domain.service;

import com.topsoft.tmp.domain.bean.TaskTypeDefine;

/**
 * 任务类型管理
 * <p>
 * 面向任务类型的增加、删除、修改等管理行为
 * 
 * @author weichao
 *
 */
public interface TaskTypeManager {
	
	/**
	 * 新增一个任务类型，bizCode不能和现有任务类型的bizCode重复
	 * 
	 * @param taskType 任务类型
	 * @param bizCode 任务类型业务编码
	 */
	void createTaskType(TaskTypeDefine taskType, String bizCode);
	
	/**
	 * 修改任务类型，每次修改一个任务类型，都将使当前版本的该任务类型失效，并产生一个新的版本；
	 * 任务类型的业务编码 bizCode 字段不能修改
	 * 
	 * @param taskType
	 */
	void modifyTaskType(TaskTypeDefine taskType);
	
	/**
	 * 删除任务类型，物理上的删除
	 * 
	 * @param taskType
	 * @return
	 */
	void deleteTaskType(TaskTypeDefine taskType);
	
	/**
	 * 删除所有该业务编码的任务类型
	 * 
	 * @param bizCode
	 * @return
	 */
	void deleteTaskTypeByBizCode(String bizCode);
	
}
