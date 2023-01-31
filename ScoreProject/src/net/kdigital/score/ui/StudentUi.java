package net.kdigital.score.ui;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import net.kdigital.score.service.StudentService;
import net.kdigital.score.util.CustomScanner;
import net.kdigital.score.vo.StudentVo;

public class StudentUi {
	CustomScanner customSc = new CustomScanner();
	Scanner sc = new Scanner(System.in);
	StudentService service = new StudentService();

	public StudentUi() {
		String menuChoice;
		while (true) {
			menu();
			menuChoice = sc.next();
			switch (menuChoice) {
			case "1":
				gradeAdd();
				break;
			case "2":
				selectByID();
				break;
			case "3":
				selectAll();
				break;
			case "4":
				removeStudent();
				break;
			case "5":
				updateStudent();
				break;
			case "0":
				System.out.println("** 성적관리 종료");
				return;
			default:
				System.out.println("** 다시입력");
				break;
			}
		}
	}

	// 성적 홈 화면
	public void menu() {
		System.out.println("=[ Master 성적관리 ]=");
		System.out.println("1. 성적 등록");
		System.out.println("2. 성적 조회(학번)");
		System.out.println("3. 전체 성적 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 수정");
		System.out.println("0. 종료");
		System.out.println("=================");
		System.out.print("> 선택 :");
	}

	private void gradeAdd() {
		System.out.println(">>>>>> [성적 등록] <<<<");
		System.out.print("-학번:");
		int id = customSc.nextInt();
		StudentVo student = service.selectByID(id);
		if (student != null) {
			System.out.println("**이미 존재하는 학번임");
			return;
		}
		System.out.print("-이름:");
		String name = sc.next();
		System.out.print("-IT 점수:");
		double itScore = customSc.nextDouble();
		System.out.print("-외국어 점수:");
		double languageScore = customSc.nextDouble();
		System.out.print("-기본 점수:");
		double basicScore = customSc.nextDouble();

		student = new StudentVo(id, name, itScore, languageScore, basicScore);
		int result = service.studentAdd(student);
		if (result == 1) {
			System.out.println("** 등록!");
			return;
		}
		System.out.println("**등록실패!");
	}

	private void selectByID() {
		System.out.println("[ 학번 조회 ]");
		System.out.println("ID를 입력하세요.");
		System.out.print("> 학번: ");

		int id = customSc.nextInt();
		StudentVo student = service.selectByID(id);
		if (student != null) {
			System.out.println(student);
			return;
		}
		System.out.println("** 학생정보 없음");
	}

	private void selectAll() {
		List<StudentVo> list = service.selectAll();
		if (list.isEmpty()) {
			System.out.println("** 전체성적 없음");
			return;
		}
		Iterator<StudentVo> iter = list.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

	private void removeStudent() {
		System.out.println("[ 학번 삭제 ]");
		System.out.println("삭제할 ID를 입력하세요.");
		System.out.print("> 삭제할 학번 ID: ");
		int id = customSc.nextInt();
		StudentVo student = service.selectByID(id);
		if (student == null) {
			System.out.println("**해당하는 학번없음");
			return;
		}
		System.out.println("[ 삭제할 학번 정보 ]");
		System.out.println(student);
		System.out.print("삭제하실? 복구안해줌");
		System.out.print("> 선택(y / n) ");
		String yorn = sc.next();
		if (yorn.equals("Y") || yorn.equals("y")) {
			service.removeStudent(id);
			System.out.println("** 삭제 되었음 복구ㄴㄴ");
			return;
		}
		System.out.println("** 삭제 작업 취소");
	}

	private void updateStudent() {
		System.out.println("[ 성적 수정 ]");
		System.out.println("수정할 ID를 입력하세요.");
		System.out.print("> 수정할 학번 ID: ");
		int id = customSc.nextInt();
		StudentVo student = service.selectByID(id);
		if (student == null) {
			System.out.println("**해당하는 학번없음");
			return;
		}
		System.out.println("[ 조회된 학생정보 확인용 ]");
		System.out.println(student);

		System.out.print("-수정할 IT 점수:");
		double it = customSc.nextDouble();
		System.out.print("-수정할 외국어 점수:");
		double language = customSc.nextDouble();
		System.out.print("-수정할 기본 점수:");
		double basic = customSc.nextDouble();
//		member = new MemberVO(id, null, height, weight);
		student = new StudentVo(id, null, it, language, basic);
		int result = service.updateStudent(student);
		if (result == 1) {
			System.out.println("** 수정됬다잉!");
			return;
		}
		System.out.println("**수정실패!");
	}

}
