package com.topsoft.tmp.domain.bean;

/**
 * 业务字段在某状态中的显示和操作特性配置DTO
 * 
 * @author weichao
 *
 */
public class TaskBizPropertyConfigInStateDTO {
	
	/**
	 * 字段名称，如【 entType】
	 */
	private String name;
	
	/**
	 * 字段描述，如 【企业类型】
	 */
	private String description;
	
	/**
	 * 是否展示
	 */
	private boolean show;
	
	/**
	 * 是否只读
	 */
	private boolean readonly;
	
	/**
	 * 是否必填
	 */
	private boolean mandatory;

	public TaskBizPropertyConfigInStateDTO(String name, String description,
			boolean show, boolean readonly, boolean mandatory) {
		super();
		this.name = name;
		this.description = description;
		this.show = show;
		this.readonly = readonly;
		this.mandatory = mandatory;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public boolean isShow() {
		return show;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public boolean isMandatory() {
		return mandatory;
	}
}
