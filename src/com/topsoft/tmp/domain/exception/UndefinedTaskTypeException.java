package com.topsoft.tmp.domain.exception;

/**
 * 未定义的任务类型异常
 * 
 * @author weichao
 *
 */
public class UndefinedTaskTypeException extends RuntimeException {
	
	static final String UNDEFINEDTASKTYPE = "未定义的任务类型"; 

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public UndefinedTaskTypeException() {
		super(UNDEFINEDTASKTYPE);
	}

	public UndefinedTaskTypeException(String message) {
		super(UNDEFINEDTASKTYPE + ":" + message);
	}

	public UndefinedTaskTypeException(Throwable cause) {
		super(UNDEFINEDTASKTYPE, cause);
	}

	public UndefinedTaskTypeException(String message, Throwable cause) {
		super(UNDEFINEDTASKTYPE + ":" + message, cause);
	}

}
