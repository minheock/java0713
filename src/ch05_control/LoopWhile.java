package ch05_control;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		// 조건이 true 이면 반복
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		
		int j = 0;
		while (true) {
			System.out.println(j);
			j++;
			if(j == 10) {
				break;
			}
		}
		
		boolean flag = true;
		while (flag) {
			j++;
			System.out.println(j);
			if(j == 30) {
				flag = false;
			}
		}
		
//		Scanner scanner = new Scanner(System.in);
//		boolean isRun = true;
//		while(isRun) {
//			System.out.println("이름을 입력하세요 (종료 q or Q)");
//			System.out.println(">>>>");
//			String input = scanner.nextLine();
//			if(input.equals("q") || input.equals("Q")) {
//				isRun = false;
//			}else {
//				System.out.println(input + "님 환영합니다. ^^");
//			}
//			System.out.println("=========================");
//		}
		//do-while문
		// 최소 한 번은 실행해야 할 때
//		isRun = false;
//		do {
//			System.out.println("hi");
//		}while(isRun);
		
		// while 문 구구단
		int x = 2;
		outer : while(x <= 9) {
			int x2 = 1;
			System.out.println(x + "단");
			while(x2 <= 9) {
				System.out.printf("%d x %d = %d \n", x, x2, (x * x2));
				x2++;
				if(x == 4) {
					break outer;
				}
			}
			x+=1;
		}
		// label 특정시점까지 break 를 하고 싶을때
		// 단순 break는 해당 반복문만 탈출하게 됨.
		out1 : for(int q = 0 ; q < 5; q++) {
			out2 : for(int w = 0 ; w < 5; w++) {
				out3: for(int e = 0 ; e < 5; e++) {
					if(q * w * e > 10) {
						break out2;
					}
					System.out.println(q + " " + w+ " "+ e);
				}
			}
		}
	
		
		
	}
}
