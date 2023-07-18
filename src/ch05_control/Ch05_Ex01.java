package ch05_control;

import java.util.Calendar;
import java.util.Scanner;

public class Ch05_Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수만 입력받는 상황
		// 사용자로 부터 숫자를 입력받고, 해당숫자가 짝수인지 홀수인지 판별하는 프로그램을 작성
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.println(">>>");
		int hol = scanner.nextInt();
		if(hol % 2 == 0) {
			System.out.println("짝");
		}else {
			System.out.println("홀");
		}
		
		scanner.close();
		
		
	}

}
