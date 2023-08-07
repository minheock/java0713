package practice.submit09;

import java.util.Scanner;

public class CafeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		Cafe star = new Cafe("스타벅스", "starbuks");
        Cafe aka = new Cafe("아카", "aka");
       
		star.addCoffee(new Coffee("아메리카노", 5000));
		star.addCoffee(new Coffee("카푸치노", 6000));
		star.addCoffee(new Coffee("오곡라떼", 7000));
		
		aka.addCoffee(new Coffee("아메리카노", 2500));
		aka.addCoffee(new Coffee("바닐라라떼", 3000));
		aka.addCoffee(new Coffee("아이스티", 3500));
		System.out.println(star);
		while(true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 스타벅스 | 2.아카 방문 | 3.사무실복귀..");
			System.out.println(">>> ");
			int select = Integer.parseInt(scan.nextLine()); 
			if(select == 1) {
				System.out.println("어서오세요 스타벅스입니다.");
				star.ShowMenu();
				star.buyCoffee(scan);
				int selectmenu = scan.nextInt();
			}else if(select == 2) {
				System.out.println("어서오세요 아카입니다.");
				aka.ShowMenu();
				aka.buyCoffee(scan);
				int selectmenu = scan.nextInt();
			}else if(select == 3) {
				System.out.println("사무실로 복귀합니다..");
				break;
			}
		}
	}

}
