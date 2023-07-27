package ch09_class.commons;

import java.util.Iterator;

public class UtilClass {
	
	/**
	 * @파일명   :UtilClass.java
	 * @프로젝트명:JavaStudy
	 * @작성일   :2023. 7. 27.
	 * @작성자   :민혁
	 * @메소드 설명 : 입력한 소수를 반올림하여 소수 n 번째 자리로 리턴해주는 메서드.
	 * @param : num 반올림 하고자 하는 소수
	 * @param : 소수 n 번째 자리까지 리턴
	 * @return : 반올림된 소수를 리턴
	 */
	
	
	public static double weRound(double num, int n) {
		// 10의 n 제곱 구하기
		int ten = 1;
		for(int i = 0 ; i < n; i++) {
			ten *= 10;
		}
		num *= ten;
		long temp = Math.round(num);
		double result = (double)temp/ten;
		return result;
	}
	public static void main(String[] args) {
		System.out.println(weRound(75.416666666666, 2));
		
	}
}
