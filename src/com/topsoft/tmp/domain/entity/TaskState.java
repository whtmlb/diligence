package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

/**
 * ����״̬
 * <p>
 * ������������ {@link TaskType} �ϣ���������͵�������ܴ��ڵ�״̬
 * 
 * @author weichao
 *
 */
public class TaskState implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * �����������͵�״̬���ж�������һ�����������״̬�����ύ���κ����͵��½����񶼴��ڴ�״̬��
	 */
	public static final String TASKSTATE_SUBMITTED = "���ύ";
	
	/**
	 * ״̬��ʶ
	 */
	private Long id;
	
	/**
	 * ״̬����,һ���������͵�״̬���У���Ӧ�ô�������������ͬ��״̬
	 */
	private String name;
	
	/**
	 * ������������id
	 */
	private Long taskTypeId;
	
	public TaskState() {
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
}
