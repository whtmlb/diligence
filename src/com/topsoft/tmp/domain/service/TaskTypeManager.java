package com.topsoft.tmp.domain.service;

import com.topsoft.tmp.domain.bean.TaskTypeDefine;

/**
 * �������͹���
 * <p>
 * �����������͵����ӡ�ɾ�����޸ĵȹ�����Ϊ
 * 
 * @author weichao
 *
 */
public interface TaskTypeManager {
	
	/**
	 * ����һ���������ͣ�bizCode���ܺ������������͵�bizCode�ظ�
	 * 
	 * @param taskType ��������
	 * @param bizCode ��������ҵ�����
	 */
	void createTaskType(TaskTypeDefine taskType, String bizCode);
	
	/**
	 * �޸��������ͣ�ÿ���޸�һ���������ͣ�����ʹ��ǰ�汾�ĸ���������ʧЧ��������һ���µİ汾��
	 * �������͵�ҵ����� bizCode �ֶβ����޸�
	 * 
	 * @param taskType
	 */
	void modifyTaskType(TaskTypeDefine taskType);
	
	/**
	 * ɾ���������ͣ������ϵ�ɾ��
	 * 
	 * @param taskType
	 * @return
	 */
	void deleteTaskType(TaskTypeDefine taskType);
	
	/**
	 * ɾ�����и�ҵ��������������
	 * 
	 * @param bizCode
	 * @return
	 */
	void deleteTaskTypeByBizCode(String bizCode);
	
}
