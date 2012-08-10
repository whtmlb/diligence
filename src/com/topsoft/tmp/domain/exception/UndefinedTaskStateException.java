package com.topsoft.tmp.domain.exception;

/**
 * 未定义的任务状态异常
 * 
 * @author weichao
 *
 */
public class UndefinedTaskStateException extends RuntimeException {
	
	static final String UNDEFINEDTASKSTATE = "未定义的任务状态"; 
	
	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = 1L;

	public UndefinedTaskStateException() {
		super(UNDEFINEDTASKSTATE);
	}

	public UndefinedTaskStateException(String message) {
		super(UNDEFINEDTASKSTATE + ":" + message);
	}

	public UndefinedTaskStateException(Throwable cause) {
		super(UNDEFINEDTASKSTATE, cause);
	}

	public UndefinedTaskStateException(String message, Throwable cause) {
		super(UNDEFINEDTASKSTATE + ":" + message, cause);
	}

}
