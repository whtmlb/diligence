package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

/**
 * 任务状态中的业务字段配置
 * <p>
 * 绑定在任务状态{@link TaskState}上，定义了该状态下各个业务字段的展示行为和操作行为，
 * <p>
 * 依据 readonly 和 mandatory 的值的组合，一个业务字段在页面上的展示行为和操作行为包括：
 * <p>readonly 为 true,mandatory 为 true：该字段是必填只读字段，表示该字段在此页面上必须有值，但是当前操作员在当前页面又没有权限修改，比如一些业务单据编号，
 * <p>readonly 为 true,mandatory 为 false：该字段是只读字段，表示该字段在此页面上禁止修改，
 * <p>readonly 为 false,mandatory 为 true：该字段是必填字段，表示数据提交时，该字段在此页面上的值不能为空，
 * <p>readonly 为 false,mandatory 为 false：该字段是可选填写字段，表示该字段在此页面上可以修改但不强制填写，
 * 
 * @author weichao
 *
 */
public class TaskBizPropertyConfigInState implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 标识
	 */
	private Long id;
	
	/**
	 * 业务字段id
	 */
	private Long bizPropertyId;
	
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
	
	/**
	 * 所属状态id
	 */
	private Long taskStateId;

	public TaskBizPropertyConfigInState() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getBizPropertyId() {
		return bizPropertyId;
	}

	public void setBizPropertyId(Long bizPropertyId) {
		this.bizPropertyId = bizPropertyId;
	}

	public boolean isShow() {
		return show;
	}

	public void setShow(boolean show) {
		this.show = show;
	}

	public boolean isReadonly() {
		return readonly;
	}

	public void setReadonly(boolean readonly) {
		this.readonly = readonly;
	}

	public boolean isMandatory() {
		return mandatory;
	}

	public void setMandatory(boolean mandatory) {
		this.mandatory = mandatory;
	}

	public Long getTaskStateId() {
		return taskStateId;
	}

	public void setTaskStateId(Long taskStateId) {
		this.taskStateId = taskStateId;
	}
	
}
