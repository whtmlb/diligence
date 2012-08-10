package com.topsoft.tmp.domain.exception;

/**
 * δ���������״̬�쳣
 * 
 * @author weichao
 *
 */
public class UndefinedTaskStateException extends RuntimeException {
	
	static final String UNDEFINEDTASKSTATE = "δ���������״̬"; 
	
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
