package com.topsoft.tmp.domain.bean;

/**
 * ����״̬DTO
 * 
 * @author weichao
 *
 */
public class TaskStateDTO {
	/**
	 * ״̬��ʶ
	 */
	private Long id;
	
	/**
	 * ״̬����,һ���������͵�״̬���У���Ӧ�ô�������������ͬ��״̬
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
