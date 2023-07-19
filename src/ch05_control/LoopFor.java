package ch05_control;

import java.util.Scanner;

public class LoopFor {

	public static void main(String[] args) throws InterruptedException {
		// 콘솔창에 1 ~ 10 까지 출력하시오!
		
		// for 문
		for(int i = 1 ; i <= 10; i++) {
			System.out.println(i);
			
		}

		
		// for 문을 작성해주세요
		/* LOOP가 20번 도는데
		 * 
		 * 1+2+3+4+5+6+7+8+9+10 ... 200대
		 * 1+1+1+1+1+1+1 ... 20
		 * */
		int sum = 0;
		for(int i = 1 ; i <= 20; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		
		int sum2 = 0;
		for(int i = 21 ; i <= 45; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2);
		
		// 1부터 40까지 중에 짝수만 더한 값을 출력하시오
		int sum3 = 0 ;
		
		for(int i = 1 ; i <= 40; i++) {
			if(i % 2 == 0) {
				sum3+=i;
			}
		}
		System.out.println(sum3);
		
		for(int i = 0 ; i <= 40; i = i+2) {
				sum3+=i;
		}
		System.out.println(sum3/2);
		
		
		// for문을 이용해서 2단을 출력해 보세요
		// 2 x 1 = 2
		for(int i = 1; i <= 9; i++) {
			int sums = i*2;
			System.out.printf("2 X %d = %d\n", i, sums);
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("몇단을 출력할까요?");
//		int sum4 = scanner.nextInt();
		int sum4 = 5;
		int sum5 = 0;
		for(int i = 1; i <= 9; i++) {
			sum5 = sum4*i;
			System.out.printf("%d X %d = %d\n", sum4, i, sum5);
		}
		scanner.close();
		
		
		String j = "";
		for(int i = 1; i <= 5; i++) {			
			System.out.println(j = j + "*");
			
		}
		// 10부터 1 까지 출력
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
		// 국수 공장에서 면을 100CM 뽑고 있는데 5CM 마다 잘라줘야 합니다.
		for(int i = 0 ; i< 20; i++) {
			System.out.println("|||||||||||||");
			if(i % 5 == 4) {
				System.out.println("-------------");
			}
		}
		
		// 라면 공장에서 면을 30CM 뽑고 있는데
		// 6CM 마다 잘라주어야 한다.
		for(int i = 0 ; i< 30; i++) {
			if(i%2 == 0) {
				System.out.println("///////");
			}
			
			if(i % 2 == 1) {
				System.out.println("\\\\\\\\\\\\\\");
			}
			if(i % 6 == 5) {
				System.out.println("-------");
			}
		}
		
		
		int example = 478941533;
		int result = 0;
		String strNum = example + "";
		for(int i = 0; i < strNum.length(); i++) {
			result += Integer.parseInt(strNum.substring(i, i+1));
		}
		System.out.println("각 자리를 더한 값 : "+ result) ;
		
	}
}
