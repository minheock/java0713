package practice.submit09;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println(Cafe.menuList);
		
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 스타벅스 | 2.아카 방문 | 3.사무실복귀..");
			int select = scan.nextInt();
			if(select == 1) {
				System.out.println("어서오세요 스타벅스입니다.");
			}else if(select == 2) {
				System.out.println("어서오세요 아카입니다.");
			}else if(select == 3) {
				System.out.println("사무실로 복귀합니다..");
			}
		}
	}

}
