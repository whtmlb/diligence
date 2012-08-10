package com.topsoft.tmp.domain.bean;

/**
 * 任务状态DTO
 * 
 * @author weichao
 *
 */
public class TaskStateDTO {
	/**
	 * 状态标识
	 */
	private Long id;
	
	/**
	 * 状态名称,一个任务类型的状态集中，不应该存在两个名称相同的状态
	 */
	private String name;

	private TaskStateDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

}
