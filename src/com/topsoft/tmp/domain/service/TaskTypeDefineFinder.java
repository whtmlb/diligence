package com.topsoft.tmp.domain.service;

import java.util.Map;

import com.topsoft.tmp.domain.bean.TaskBizPropertyConfigInStateDTO;
import com.topsoft.tmp.domain.bean.TaskTypeDefine;

/**
 * �������Ͷ����ѯ����
 * <p>
 * �����ⲿ����
 * 
 * @author weichao
 *
 */
public interface TaskTypeDefineFinder {
	
	/**
	 * �����������ͱ����ȡ����ǰ�汾�����������Ͷ���
	 * 
	 * @param bizCode �������ͱ���
	 * @return �������Ͷ���
	 */
	TaskTypeDefine findCurrentTaskTypeDefineByBizCode(String bizCode);

	/**
	 * �����������Ͷ���id��ȡ�������Ͷ���
	 * 
	 * @param taskTypeId �������Ͷ���id
	 * @return �������Ͷ���
	 */
	TaskTypeDefine findTaskTypeDefineById(Long taskTypeDefineId);
	
	/**
	 * �����������Ͷ���id����������״̬id��ȡҵ���ֶ��ڸ�״̬�µ���ʾ�Ͳ�����������
	 * 
	 * @param taskTypeDefineId �������Ͷ���id
	 * @param taskStateId ��������״̬id
	 * @return map��	K-�ֶ����ƣ��硾 entType��
	 * 				V-����DTO
	 */
	Map<String, TaskBizPropertyConfigInStateDTO> findBizPropertyConfigs(Long taskTypeDefineId, Long taskStateId);
}
