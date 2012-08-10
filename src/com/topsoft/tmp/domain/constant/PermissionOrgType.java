package com.topsoft.tmp.domain.constant;

/**
 * 任务操作的权限机关属性，表示能够进行该操作的机构相对于当前机构的关系
 * CURRENT-当前机构,PARENT-上级机构,PARENT_INCHARGE-上级主管机构
 * 
 * @author weichao
 */
public enum PermissionOrgType {
	CURRENT,
	PARENT,
	PARENT_INCHARGE
}
