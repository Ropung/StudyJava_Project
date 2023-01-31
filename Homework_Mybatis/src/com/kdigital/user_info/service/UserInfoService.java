package com.kdigital.user_info.service;

import java.util.List;

import com.kdigital.user_info.vo.UserInfo;

public interface UserInfoService {
	List<UserInfo> searchAll();

	UserInfo selectByEmployeeId(Long employeeId);
}
