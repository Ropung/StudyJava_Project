package com.kdigital.user_info.core.error;

public interface ErrorCode {
	String defaultMessage();
	RuntimeException defaultException();
}
