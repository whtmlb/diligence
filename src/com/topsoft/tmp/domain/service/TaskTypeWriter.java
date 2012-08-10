package com.topsoft.tmp.domain.service;

import com.topsoft.tmp.domain.entity.TaskType;

/**
 * ��������д��
 * <p>
 * �����ϵ��������޸ģ�ɾ���ȣ�����д��洢������ݿ⡣
 * 
 * @author weichao
 *
 */
public interface TaskTypeWriter {

	/**
	 * ����һ����������
	 * 
	 * @param taskType
	 */
	void addTaskType(TaskType taskType);
	
	/**
	 * �޸�һ����������
	 * 
	 * @param taskType
	 */
	void updateTaskType(TaskType taskType);
	
	/**
	 * ɾ��һ����������
	 * 
	 * @param taskTypeId
	 */
	void deleteTaskType(Long taskTypeId);
}
