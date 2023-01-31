package com.kdigital.user_info.main;

import com.kdigital.user_info.main.path.PathWrapper;
import com.kdigital.user_info.ui.HomeUi;
import com.kdigital.user_info.ui.UserInfoUi;

public final class MainController {
	// PATH를 UI랑 공유하기 위해서 사용.
	private final PathWrapper pathWrapper;
	private final HomeUi homeUi;
	private final UserInfoUi userInfoUi;

	public MainController() {
		this.pathWrapper = new PathWrapper();
		// 생성자에 파라미터로 넘겨서 공유만 하는 역할.
		this.homeUi = new HomeUi(pathWrapper);
		this.userInfoUi = new UserInfoUi(pathWrapper);
	}

	public void run() {
		mainLoop: while (true) {
			switch (pathWrapper.path) {
			case HOME:
				homeUi.home();
				break;
			case SEARCH_ALL_USERINFO:
				userInfoUi.searchAll();
				break;
			case SEARCH_USERINFO_BY_EMPLOYEEID:
				userInfoUi.searchByEmployeeId();
				break;
			case QUIT:
				break mainLoop;
			default:
				break;
			}
		}
	}
}
