package com.topsoft.tmp.domain.bean;

import com.topsoft.tmp.domain.constant.PermissionOrgType;
import com.topsoft.tmp.domain.constant.TaskActionType;

/**
 * 任务操作DTO
 * 
 * @author weichao
 *
 */
public class TaskActionDTO {
	
	/**
	 * 操作标识
	 */
	private Long id;
	
	/**
	 * 操作名称,一个任务类型的操作集中不应该存在两个名称相同的操作
	 */
	private String name;

	/**
	 * 操作类型
	 */
	private TaskActionType type;
	
	/**
	 * 能够进行该操作的机构，用于操作结束后发待办时，辅助定位机构
	 */
	private PermissionOrgType permissionOrg;
	
	/**
	 * 能够进行该操作的权限代码
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
