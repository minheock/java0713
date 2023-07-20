package practice.submit01;

import java.util.Scanner;

public class result03 {
	public static void main(String[] args) {

		/*
		 * 
		 * 문제 1. 사용자로부터 국어, 영어, 수학 점수를 각각 입력받아 평균점수를 구하고, 등급을 출력해주세요. 등급조건: 평균점수가 90점
		 * 이상이면 A, 80점 이상 B, 70점 이상 C, 나머지 D
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("==========국어점수를 입력하시오.");
		System.out.println(">>>>>");
		int kNum = scanner.nextInt();
		System.out.println("==========영어점수를 입력하시오.");
		int ENum = scanner.nextInt();
		System.out.println("==========수학점수를 입력하시오.");
		int FNum = scanner.nextInt();

		float sum = (kNum + ENum + FNum) / 3;
		String rating = "";
		if (sum >= 90) {
			rating = "A";
		} else if (sum >= 80) {
			rating = "B";
		} else if (sum >= 70) {
			rating = "C";
		} else {
			rating = "D";
		}
		System.out.printf("당신의 평균점수는 %.5f 등급은 %s\n", sum, rating);

		/*
		 * 문제2 15 팩토리얼
		 * 
		 */
		long sum2 = 1;
		int sum3 = 1;
		for (int i = 15; i >= 1; i--) {
			sum2 *= i;
			if (i <= 10) {
				sum3 *= i;
			}
		}
		System.out.println("15@:  " + sum2 + "\n10@:  " + sum3);

		/*
		 * 문제 3
		 */
		String findWally = "윌리울리일리울리울리일리월리일리윌리월리울리일리일리월리일리윌리일리윌리일리월리월리윌리울리윌리울리일리울리울리윌리일리";
		int count = 0;
		count += findWally.length() - findWally.replace("월", "").length();
		System.out.println(count);
	
		/*
		 * 문제 4
		 */
		String j = "******";
		for (int i = 1; i <= 5; i++) {
			j = j.substring(0, j.length() - 1);
			System.out.println(j);
		}

	}

}
