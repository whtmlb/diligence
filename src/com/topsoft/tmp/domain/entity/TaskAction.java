package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

import com.topsoft.tmp.domain.constant.PermissionOrgType;
import com.topsoft.tmp.domain.constant.TaskActionType;

/**
 * �������
 * <p>
 * ������������ {@link TaskType} �ϣ�������һ�����������У��Ը����͵�������ܽ��еĲ������ܹ����иò�����Ȩ��������
 * Ȩ����������������ɣ�����������Ȩ��������������������{@link PermissionOrgType},Ȩ����������Ȩ�޴��롣
 * 
 * @author weichao
 *
 */
public class TaskAction implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * ������ʶ
	 */
	private Long id;
	
	/**
	 * ��������,һ���������͵Ĳ������в�Ӧ�ô�������������ͬ�Ĳ���
	 */
	private String name;
	
	/**
	 * ������������id
	 */
	private Long taskTypeId;
	
	/**
	 * ��������
	 */
	private TaskActionType type;
	
	/**
	 * �ܹ����иò����Ļ��������ڲ��������󷢴���ʱ��������λ����
	 */
	private PermissionOrgType permissionOrgType;
	
	/**
	 * �ܹ����иò�����Ȩ��
	 */
	private String permissionPrivilage;

	public TaskAction() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getTaskTypeId() {
		return taskTypeId;
	}

	public void setTaskTypeId(Long taskTypeId) {
		this.taskTypeId = taskTypeId;
	}

	public TaskActionType getType() {
		return type;
	}

	public void setType(TaskActionType type) {
		this.type = type;
	}

	public PermissionOrgType getPermissionOrgType() {
		return permissionOrgType;
	}

	public void setPermissionOrgType(PermissionOrgType permissionOrgType) {
		this.permissionOrgType = permissionOrgType;
	}

	public String getPermissionPrivilage() {
		return permissionPrivilage;
	}

	public void setPermissionPrivilage(String permissionPrivilage) {
		this.permissionPrivilage = permissionPrivilage;
	}

}
