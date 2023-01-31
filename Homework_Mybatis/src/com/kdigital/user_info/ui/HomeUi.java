package com.kdigital.user_info.ui;

import com.kdigital.user_info.main.path.PathWrapper;
import com.kdigital.user_info.main.path.Pathname;
import com.kdigital.user_info.util.CustomScanner;

public class HomeUi {
	private final PathWrapper pathWrapper;
	private final CustomScanner scan;

	public HomeUi(PathWrapper pathWrapper) {
		this.pathWrapper = pathWrapper;
		this.scan = new CustomScanner();
	}

	public void home() {
		System.out.println("=== Home ===");
		System.out.println(" 1. 전체 조회");
		System.out.println(" 2. 아이디 조회");
		System.out.println(" 0. 종료");
		System.out.print("> ");

		int sel = scan.nextInt();

		switch (sel) {
		case 1:
			pathWrapper.path = Pathname.SEARCH_ALL_USERINFO;
			break;
		case 2:
			pathWrapper.path = Pathname.SEARCH_USERINFO_BY_EMPLOYEEID;
			break;
		case 0:
			pathWrapper.path = Pathname.QUIT;
			break;
		default:
			System.out.println("1, 2, 0 중에서 입력하세요.");
			break;
		}
	}
}
