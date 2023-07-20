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
		
		Scanner scanner = new Scanner(System.in);
		boolean isRun = true;
		while(isRun) {
			System.out.println("이름을 입력하세요 (종료 q or Q)");
			System.out.println(">>>>");
			String input = scanner.nextLine();
			if(input.equals("q") || input.equals("Q")) {
				isRun = false;
			}else {
				System.out.println(input + "님 환영합니다. ^^");
			}
			System.out.println("=========================");
		}
	}

}
