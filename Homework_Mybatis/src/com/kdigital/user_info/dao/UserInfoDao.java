package com.kdigital.user_info.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.kdigital.user_info.config.MybatisConfig;
import com.kdigital.user_info.core.error.Preconditions;
import com.kdigital.user_info.core.error.user.UserErrorCode;
import com.kdigital.user_info.mapper.UserInfoMapper;
import com.kdigital.user_info.vo.UserInfo;

public class UserInfoDao {

	private final SqlSessionFactory factory;

	public UserInfoDao() {
		factory = MybatisConfig.getSqlSessionFactory();
	}

	public List<UserInfo> selectAll() {

		try (SqlSession session = factory.openSession()) {
			UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
			return mapper.selectAll();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public UserInfo selectByEmployeeId(Long employeeId) {
		try (SqlSession session = factory.openSession()) {
			UserInfoMapper mapper = session.getMapper(UserInfoMapper.class);
			UserInfo target = mapper.selectByEmployeeId(employeeId);
			Preconditions.validate(target != null, UserErrorCode.NO_SUCH_EMPLOYEEID);
			return target;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
