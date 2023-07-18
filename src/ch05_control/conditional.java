package ch05_control;

import java.util.Scanner;

public class conditional {
	// 전역변수
	// class 중괄호 안에 선언된 변수
	// 해당 클래스 내 어디서든 사용 가능하다.
	static String subject = "조건문";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역변수
		// 해당 스코프 안에서만 사용가능 {}
		int price = 30000;
		int myMoney = 10000;

		// if 문
		if (myMoney < price) {
			System.out.println(subject);
			System.out.println("돈이 부족합니다.");
		}

		String review = "음식이 맛있어요";
		String msgString = "리뷰는 12자 이상 작성하세요";
		if (review.length() < 12) {
			msgString = "";
		} else {
			msgString = "통과";
		}
		System.out.println(msgString);

		// 조건이 두개일때

		int score = 85;
		String grade = "";
		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		System.out.println(grade);

		score = 92;
		if (score >= 80 && score < 90) {
			grade = "B";
		} else if (score >= 90) {
			grade = "A";
		}
		System.out.println(grade);

		/*
		 * 중첩 if문 회원가입 조건을 체크하세요 이름 : 조건(한글자 이상) 휴대폰 번호 : 조건 (10자리 또는 11자리) 나이 : 14세 이상
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름과 폰번호 나이를 입력하세요");
		String nameString = scanner.nextLine();
		String phoneString = scanner.nextLine();
		int age = scanner.nextInt();
		if (nameString.length() >= 1) {
			if (phoneString.length() == 10 || phoneString.length() == 11) {
				if (age >= 14) {
					System.out.println("회원가입 성공");
				} else {
					System.out.println("가입실패. 나이가 맞지않습니다.");
				}
			} else {
				System.out.println("가입 실패. 번호의 자릿수가 맞지않습니다.");
			}

		} else {
			System.out.println("가입 실패. 이름을 입력하세요");
		}

		// 중첩 if2

		boolean isOkay = false;
		if (nameString.length() >= 1) {
			if (phoneString.length() == 10 || phoneString.length() == 11) {
				if (age >= 14) {
					isOkay = true;
					System.out.println("회원가입 성공");
				}
			}
		} else {
			System.out.println("회원가입 실패");
		}

		// if3

		if ((nameString.length() >= 1) && (phoneString.length() == 10 || phoneString.length() == 11) && (age >= 14)) {
			System.out.println("회원가입 성공");
		} else {
			System.out.println("회원가입 실패");
		}
		
		// switch 문
		int month = 3;
		
		switch (month) {
		case 0: {
			System.out.println("수강등록");
			break;
			
		}
		case 1: {
			System.out.println("프로그래밍 기초");
			break;
		}
		case 2: {
			System.out.println("db");
			break;
		}
		case 3: {
			System.out.println("웹 프로그래밍");
			break;
		}
		case 4:
		case 5:
			System.out.println("머신러닝");
			break;
		default:
			System.out.println("프로젝트!!!");
		}
		
		
		
		
		
		
	}
//		System.out.println(price); 지역변수 선언 스코프 밖 사용할 수 없다.

}
