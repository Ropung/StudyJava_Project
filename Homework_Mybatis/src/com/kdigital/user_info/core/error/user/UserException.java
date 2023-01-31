package com.kdigital.user_info.core.error.user;

import com.kdigital.user_info.core.error.ErrorCode;

public class UserException extends RuntimeException {
	public final ErrorCode ERROR_CODE;
	
	public UserException(ErrorCode errorCode) {
		super(errorCode.defaultMessage());
		this.ERROR_CODE = errorCode;
	}

	public UserException(ErrorCode errorCode, Throwable cause) {
		super(errorCode.defaultMessage(), cause);
		this.ERROR_CODE = errorCode;
	}
	
	public UserException(ErrorCode errorCode, String message, Throwable cause) {
		super(message, cause);
		this.ERROR_CODE = errorCode;
	}
}
