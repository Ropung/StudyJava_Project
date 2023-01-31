package com.kdigital.user_info.core.error.user;

import com.kdigital.user_info.core.error.ErrorCode;

public enum UserErrorCode implements ErrorCode {
	DUPLICATED_USERNAME("이미 존재하는 회원입니다."),
	NO_SUCH_EMPLOYEEID("없는 Employee ID입니다.")
	// , ..., ...
	;
	
	public final String MESSAGE;
	
	UserErrorCode(String message) {
		this.MESSAGE = message;
	}

	@Override
	public String defaultMessage() {
		return MESSAGE;
	}

	@Override
	public RuntimeException defaultException() {
		return new UserException(this);
	}
}
