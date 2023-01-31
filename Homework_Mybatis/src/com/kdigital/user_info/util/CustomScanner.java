package com.kdigital.user_info.util;

//import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

public final class CustomScanner {

	// Delegation(위임): 상속 대신 위임.
	private final Scanner scan;

	public CustomScanner() {
		this.scan = new Scanner(System.in);
	}

//	public CustomScanner(InputStream source) {
//		this.scan = new Scanner(source);
//	}

	public int nextInt() {
		while (true) {
			try {
				return scan.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("정수로 입력하세요.");
				System.out.print("> ");
			} finally {
				// flush buffer
				scan.nextLine();
			}
		}
	}

	public double nextDouble() {
		while (true) {
			try {
				return scan.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				System.out.print("> ");
			} finally {
				// flush buffer
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
				// flush buffer
				scan.nextLine();
			}
		}
	}

	public String nextLine() {
		return scan.nextLine();
	}
}
