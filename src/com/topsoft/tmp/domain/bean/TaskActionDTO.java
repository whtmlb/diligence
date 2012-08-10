package com.topsoft.tmp.domain.bean;

import com.topsoft.tmp.domain.constant.PermissionOrgType;
import com.topsoft.tmp.domain.constant.TaskActionType;

/**
 * �������DTO
 * 
 * @author weichao
 *
 */
public class TaskActionDTO {
	
	/**
	 * ������ʶ
	 */
	private Long id;
	
	/**
	 * ��������,һ���������͵Ĳ������в�Ӧ�ô�������������ͬ�Ĳ���
	 */
	private String name;

	/**
	 * ��������
	 */
	private TaskActionType type;
	
	/**
	 * �ܹ����иò����Ļ��������ڲ��������󷢴���ʱ��������λ����
	 */
	private PermissionOrgType permissionOrg;
	
	/**
	 * �ܹ����иò�����Ȩ�޴���
	 */
	private String permissionPrivilage;

	public TaskActionDTO(Long id, String name, TaskActionType type,
			PermissionOrgType permissionOrg, String permissionPrivilage) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.permissionOrg = permissionOrg;
		this.permissionPrivilage = permissionPrivilage;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public TaskActionType getType() {
		return type;
	}

	public PermissionOrgType getPermissionOrg() {
		return permissionOrg;
	}

	public String getPermissionPrivilage() {
		return permissionPrivilage;
	}
}
