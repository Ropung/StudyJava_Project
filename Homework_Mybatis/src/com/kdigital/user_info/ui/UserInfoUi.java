package com.kdigital.user_info.ui;

import java.util.List;

import com.kdigital.user_info.main.path.PathWrapper;
import com.kdigital.user_info.main.path.Pathname;
import com.kdigital.user_info.service.DefaultUserInfoService;
import com.kdigital.user_info.service.UserInfoService;
import com.kdigital.user_info.util.CustomScanner;
import com.kdigital.user_info.vo.UserInfo;

public class UserInfoUi {
	private final PathWrapper pathWrapper;
	private final UserInfoService userInfoService;
	private final CustomScanner scan;

	public UserInfoUi(PathWrapper pathWrapper) {
		// 공유받는 것
		this.pathWrapper = pathWrapper;
		this.scan = new CustomScanner();
		this.userInfoService = DefaultUserInfoService.getInstance();
	}

	public void searchAll() {
		System.out.println("[ 전체 조회 ]");
		System.out.println("- 목록");
		System.out.println("==============");

		List<UserInfo> list = userInfoService.searchAll();

		for (UserInfo userInfo : list) {
			System.out.println(userInfo);
		}

		pathWrapper.path = Pathname.HOME;
	}

	public void searchByEmployeeId() {
		System.out.println("[ 아이디 조회 ]");
		System.out.println("ID를 입력하세요.");
		System.out.print("> ");

		long employeeId = scan.nextLong();
		UserInfo ui = userInfoService.selectByEmployeeId(employeeId);
		System.out.print(ui);
		System.out.print(employeeId);

		if (ui == null) {
			System.out.println("해당하는 아이디가 없습니다.");
			return;
		}
		System.out.println(" [회원정보] ");
		System.out.println(ui);

		pathWrapper.path = Pathname.HOME;
	}
}
