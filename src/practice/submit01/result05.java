package practice.submit01;

import java.util.Scanner;

public class result05 {

	public static void main(String[] args) throws InterruptedException {
		/*
		 * Q. 01
			1~50 사이의 랜덤한 수를 5번 안에 맞춰야하는 업다운 게임을 만들어보세요.
			실행 시 1~50 사이의 랜덤한 수가 생성되며, 사용자가 입력한 숫자에 대해 업, 다운을
			알려준다.
			5번의 기회 동안 사용자가 정답을 맞추지 못한다면 "실패하였습니다" 문구 출력 후
			프로그램이 종료, 사용자가 정답을 맞춘다면 "정답입니다" 문구 출력 후 프로그램이
			종료된다.
		 */
		/*  수도코드.
		 *  1. 반복문을 사용한다. 조건은 true가 false가 될때까지
		 *  2. 1~50의 랜덤한 난수를 변수에 담는다.
		 *  3. 스캐너로 내가 생각하는 입력값을 입력한다.
		 *  4. if 문으로 난수와 내가 입력한 입력값을 비교한다.
		 *  5. 숫자가 크면 업, 작으면 다운을 출력한다.
		 *  6. 정답이 맞으면 조건이 false가 되고 반복문을 종료한다.
		 */
		boolean fact = true;
		int random = (int)(Math.random()*50 + 1);
		int count = 5;
		while(fact) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n숫자를 입력해주세요 : ");
			int MyNum = scanner.nextInt();
			System.out.println(random);
			count--;
			if(count == 0) {
				System.out.printf("\n실패했습니다. 정답은 %s입니다.",random);
				fact = false;
			}else if(MyNum == random) {
				System.out.println("정답입니다!");
				fact = false;
			}else if(MyNum > random) {
				System.out.printf("Down! 기회가 %d번 남았습니다.", count);
			}else if(MyNum < random) {
				System.out.printf("UP! 기회가 %d번 남았습니다.", count);
			}
		}
		
		
		
		/*
		 * Q. 02
			엘리베이터가 두 대 있는 빌딩에서 엘리베이터 버튼을 눌렀을 때, 한 대의 엘리베이터가
			이동하는
			프로그램을 구현해 봅시다.
			1. 사용자의 현재 위치를 입력하면 사용자의 위치와 가까운 엘리베이터가 이동한다.
			2. 사용자의 위치와 두 엘리베이터의 위치 차이가 동일하다면 위 층 엘리베이터가 내려온다.
			3. 사용자의 위치로 엘리베이터의 위치를 바꿔준다.
			4. 엘리베이터 프로그램을 종료하려면 q, Q, exit, EXIT, Exit 중 하나를 입력한다.
			@. 사용자가 엘리베이터에 탑승하고 층을 입력하면 탑승 중인 엘리베이터가 해당 층으로
			이동하도록 만드세요.
		 */
		
		/* 수도코드
		 * 1.
		 * 2. 
		 * 3. 
		 * 4. 
		 * 5. 
		 * 6. 
		 */
		fact = true;
		int move1 = (int)(Math.random()*15 + 1);
		int move2 = (int)(Math.random()*15 + 1);
		while(fact) {
			int random2 = (int)(Math.random()*2 + 1);
			Scanner scanner = new Scanner(System.in);
			System.out.println("\n========= 엘리베이터 =========");
			System.out.printf("승강기 A의 현재 위치 : %d\n", move1);
			System.out.printf("승강기 B의 현재 위치 : %d\n", move2);
			System.out.println("몇 층에 계시나요? [종료는 q 또는 exit]: ");
			String el = scanner.nextLine();
			if(el.equals("q") || el.equals("Q") ||el.equals("exit")||el.equals("Exit")) {
			 fact = false;
			 System.out.println("프로그램을 종료합니다.");
			}
			int intEl = Integer.parseInt(el);
			int a = Math.abs(move1-intEl);
		    int b = Math.abs(move2-intEl);
			if(el.length() > 0 && el.length() <= 2) {
				if(a < b) { // A엘베가 가까울때
					move1 = Integer.parseInt(el);
					for(int i = 0 ; i< 8; i++) {
						if(i%2 == 0) {
							System.out.println("|///////|");
						}
						
						if(i % 2 == 1) {
							System.out.println("|\\\\\\\\\\\\\\|");
						}
						Thread.sleep(300);
					}
					System.out.printf("엘리베이터 A가 %d층으로 이동하였습니다.\n", Integer.parseInt(el));
				}else if(a > b) {//B엘베가 가까울때
					move2 = Integer.parseInt(el);
					for(int i = 0 ; i< 8; i++) {
						if(i%2 == 0) {
							System.out.println("|///////|");
						}
						
						if(i % 2 == 1) {
							System.out.println("|\\\\\\\\\\\\\\|");
						}
						Thread.sleep(300);
					}
					System.out.printf("엘리베이터 B가 %d층으로 이동하였습니다.\n", Integer.parseInt(el));
				}
				else if(a == b) { //가까운 엘리베이터가 같을때.
					if(random2 == 0) {
						move1 = Integer.parseInt(el);
						System.out.printf("엘리베이터 A가 %d층으로 이동하였습니다.\n", Integer.parseInt(el));
						Thread.sleep(300);
					}else if(random2 == 1){
						move2 = Integer.parseInt(el);
						System.out.printf("엘리베이터 B가 %d층으로 이동하였습니다.\n", Integer.parseInt(el));
						Thread.sleep(300);
					}
				}
			}
		
	}

}
}
