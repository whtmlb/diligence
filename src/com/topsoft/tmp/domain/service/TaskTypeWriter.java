package com.topsoft.tmp.domain.service;

import com.topsoft.tmp.domain.entity.TaskType;

/**
 * 任务类型写入
 * <p>
 * 物理上的新增，修改，删除等，操作写入存储库或数据库。
 * 
 * @author weichao
 *
 */
public interface TaskTypeWriter {

	/**
	 * 新增一个任务类型
	 * 
	 * @param taskType
	 */
	void addTaskType(TaskType taskType);
	
	/**
	 * 修改一个任务类型
	 * 
	 * @param taskType
	 */
	void updateTaskType(TaskType taskType);
	
	/**
	 * 删除一个任务类型
	 * 
	 * @param taskTypeId
	 */
	void deleteTaskType(Long taskTypeId);
}
