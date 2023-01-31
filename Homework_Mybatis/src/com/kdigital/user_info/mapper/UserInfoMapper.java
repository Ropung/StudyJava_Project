package com.kdigital.user_info.mapper;

import java.util.List;

import com.kdigital.user_info.vo.UserInfo;

public interface UserInfoMapper {
	List<UserInfo> selectAll();

	UserInfo selectByEmployeeId(Long employeeId);
}
