package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

/**
 * 任务类型
 * <p>
 * 一个TaskType可以理解为一个业务种类，该业务种类的一次业务实例称为该种类的一个任务，<br>
 * TaskType定义了该类型的任务在进行过程中所包含的状态、对该任务可能进行的操作、状态迁移规则、<br>
 * 与该任务流转绑定的数据以及不同状态下这些数据的展示行为和操作行为。
 * 
 * @author weichao
 */
public class TaskType implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 唯一标识
	 */
	private Long id;
	
	/**
	 * 任务类型名称
	 */
	private String name;
	
	/**
	 * 任务类型业务编码，唯一标识了一个业务类型。编码不同则任务类型不同，同一任务类型的不同版本，共享同一个业务编码。
	 */
	private String bizCode;
	
	/**
	 * 任务类型版本
	 */
	private String version;
	
	/**
	 * 当前版本标识,为true时，引擎才可以依据该版本的定义来创建任务实例
	 */
	private boolean current;
	
	/**
	 * 有效标识
	 */
	private boolean valid;
	
	public TaskType() {
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

	public String getBizCode() {
		return bizCode;
	}

	public void setBizCode(String bizCode) {
		this.bizCode = bizCode;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean isCurrent() {
		return current;
	}

	public void setCurrent(boolean current) {
		this.current = current;
	}

}
