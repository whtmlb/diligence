package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

import com.topsoft.tmp.domain.constant.PermissionOrgType;
import com.topsoft.tmp.domain.constant.TaskActionType;

/**
 * 任务操作
 * <p>
 * 绑定在任务类型 {@link TaskType} 上，定义在一个任务类型中，对该类型的任务可能进行的操作和能够进行该操作的权限描述，
 * 权限描述由两部分组成：机构描述和权限描述，机构描述采用{@link PermissionOrgType},权限描述采用权限代码。
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
	 * 操作标识
	 */
	private Long id;
	
	/**
	 * 操作名称,一个任务类型的操作集中不应该存在两个名称相同的操作
	 */
	private String name;
	
	/**
	 * 所属任务类型id
	 */
	private Long taskTypeId;
	
	/**
	 * 操作类型
	 */
	private TaskActionType type;
	
	/**
	 * 能够进行该操作的机构，用于操作结束后发待办时，辅助定位机构
	 */
	private PermissionOrgType permissionOrgType;
	
	/**
	 * 能够进行该操作的权限
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
