package net.kdigital.score.util;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class CustomScanner {

	private final Scanner scan;

	public CustomScanner() {
		this.scan = new Scanner(System.in);
	}

	public int nextInt() {
		while (true) {
			try {
				return scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("데이터가 잘못입력되었으니 정수로 입력하세요.");
				System.out.print("> ");
			} finally {
				scan.nextLine();
			}
		}
	}

	public double nextDouble() {
		while (true) {
			try {
				return scan.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("데이터가 잘못입력되었으니 잘 읽고 좋은말할떄 소수점 쓰세요.");
				System.out.print("> ");
			} finally {
				scan.nextLine();
			}
		}
	}

	public long nextLong() {
		while (true) {
			try {
				return scan.nextLong();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				System.out.print("> ");
			} finally {
				scan.nextLine();
			}
		}
	}

	public String nextLine() {
		return scan.nextLine();
	}
}
