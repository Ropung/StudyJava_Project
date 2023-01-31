package com.kdigital.user_info.core.error.board;

import com.kdigital.user_info.core.error.ErrorCode;

public class BoardException extends RuntimeException {
	public final ErrorCode ERROR_CODE;
	
	public BoardException(ErrorCode errorCode) {
		super(errorCode.defaultMessage());
		this.ERROR_CODE = errorCode;
	}

	public BoardException(ErrorCode errorCode, Throwable cause) {
		super(errorCode.defaultMessage(), cause);
		this.ERROR_CODE = errorCode;
	}
	
	public BoardException(ErrorCode errorCode, String message, Throwable cause) {
		super(message, cause);
		this.ERROR_CODE = errorCode;
	}
}
