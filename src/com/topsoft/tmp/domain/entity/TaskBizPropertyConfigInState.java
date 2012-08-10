package com.topsoft.tmp.domain.entity;

import java.io.Serializable;

/**
 * ����״̬�е�ҵ���ֶ�����
 * <p>
 * ��������״̬{@link TaskState}�ϣ������˸�״̬�¸���ҵ���ֶε�չʾ��Ϊ�Ͳ�����Ϊ��
 * <p>
 * ���� readonly �� mandatory ��ֵ����ϣ�һ��ҵ���ֶ���ҳ���ϵ�չʾ��Ϊ�Ͳ�����Ϊ������
 * <p>readonly Ϊ true,mandatory Ϊ true�����ֶ��Ǳ���ֻ���ֶΣ���ʾ���ֶ��ڴ�ҳ���ϱ�����ֵ�����ǵ�ǰ����Ա�ڵ�ǰҳ����û��Ȩ���޸ģ�����һЩҵ�񵥾ݱ�ţ�
 * <p>readonly Ϊ true,mandatory Ϊ false�����ֶ���ֻ���ֶΣ���ʾ���ֶ��ڴ�ҳ���Ͻ�ֹ�޸ģ�
 * <p>readonly Ϊ false,mandatory Ϊ true�����ֶ��Ǳ����ֶΣ���ʾ�����ύʱ�����ֶ��ڴ�ҳ���ϵ�ֵ����Ϊ�գ�
 * <p>readonly Ϊ false,mandatory Ϊ false�����ֶ��ǿ�ѡ��д�ֶΣ���ʾ���ֶ��ڴ�ҳ���Ͽ����޸ĵ���ǿ����д��
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
	 * ��ʶ
	 */
	private Long id;
	
	/**
	 * ҵ���ֶ�id
	 */
	private Long bizPropertyId;
	
	/**
	 * �Ƿ�չʾ
	 */
	private boolean show;
	
	/**
	 * �Ƿ�ֻ��
	 */
	private boolean readonly;
	
	/**
	 * �Ƿ����
	 */
	private boolean mandatory;
	
	/**
	 * ����״̬id
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
