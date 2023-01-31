package com.kdigital.user_info.core.error.board;

import com.kdigital.user_info.core.error.ErrorCode;

public enum BoardErrorCode implements ErrorCode {
	NO_SUCH_BOARD("해당 게시글이 존재하지 않습니다."),
	UNAUTHENTICATED("로그인이 필요합니다."),
	FORBIDDEN("권한이 없습니다.")
	// , ..., ...
	;
	
	public final String MESSAGE;
	
	BoardErrorCode(String message) {
		this.MESSAGE = message;
	}

	@Override
	public String defaultMessage() {
		return MESSAGE;
	}

	@Override
	public RuntimeException defaultException() {
		return new BoardException(this);
	}
}
