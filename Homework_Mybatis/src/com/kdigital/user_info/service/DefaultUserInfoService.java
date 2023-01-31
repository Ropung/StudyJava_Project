package com.kdigital.user_info.service;

import java.util.List;

import com.kdigital.user_info.dao.UserInfoDao;
import com.kdigital.user_info.vo.UserInfo;

public final class DefaultUserInfoService implements UserInfoService {

	private final UserInfoDao userInfoDao;

	private DefaultUserInfoService() {
		userInfoDao = new UserInfoDao();
	}

	static class Holder {
		private static final DefaultUserInfoService INSTANCE = new DefaultUserInfoService();
	}

	public static DefaultUserInfoService getInstance() {
		return Holder.INSTANCE;
	}

	@Override
	public List<UserInfo> searchAll() {
		return userInfoDao.selectAll();
	}

	@Override
	public UserInfo selectByEmployeeId(Long employeeId) {
		return userInfoDao.selectByEmployeeId(employeeId);
	}

}
