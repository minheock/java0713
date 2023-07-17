package practice.submit01;

import java.util.Scanner;

public class result02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1 . 이름 국어점수 영어점수 수학점수 와 평균점수를 출력.
		Scanner scanner = new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name = scanner.nextLine();
		System.out.println("국어점수를 입력해주세요");
		int score1 = Integer.parseInt(scanner.nextLine());
		System.out.println("영어점수를 입력해주세요");
		int score2 = Integer.parseInt(scanner.nextLine());
		System.out.println("수학점수를 입력해주세요");
		int score3 = Integer.parseInt(scanner.nextLine());
		float sum = (score1 + score2 + score3)/3;
		System.out.println(sum);
		System.out.printf("이름: %s\n국어점수 : %d\n영어점수 : %d\n수학점수 : %d\n평균점수 : %.2f",name, score1, score2, score3, sum);
		
		
		// Q2 . 삼항 연산자를 이용해서
		//주민번호 뒷자리의 첫번째 숫자에 대한 성별을 “남”, “여” 문자열로 변수에 담아 콘솔창에
		//출력해보세요. (주민번호 뒷자리의 첫번째 숫자가 홀수면 남성, 짝수면 여성)
		
		// 1번째 풀이
		System.out.println("\n=========주민등록번호 뒷자리 입력==========\n");
		int xNum = scanner.nextInt()/ 1000000;
		System.out.println(xNum % 2 == 1 ? "남성 입니다." : "여성 입니다.");
		
		// 2번째 풀이
		System.out.println("\n========================\n");
		String jNum = "2467524";
		jNum = jNum.substring(0,1);
		int gender = Integer.parseInt(jNum);
		System.out.println( gender % 2 == 0 ? "여성 입니다." : "남성 입니다.");
		
		
	}

}
