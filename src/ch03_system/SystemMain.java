package ch03_system;

import java.util.Scanner;

public class SystemMain {

	public static void main(String[] args) {
		/*
		 * 표준 출력
		 * 콘솔창에 텍스트 출력
		 * 프린트린 출력후 줄바꿈 해준다.
		 */
		System.out.println("start");
		System.out.println();
		System.out.println("end");;
		
		System.out.println("줄바꿈 안됨");
		System.out.println("보기 불편...");
		// 문자열 내에 역 슬래시(\)는 특정기능을 사용할 수 있음
		System.out.println("println 처럼\n");
		System.out.println("중간에 \n 을 넣어보세요");
		// \t탭
		System.out.println("월\t화\t수\t목\t금");
		// 일부 특수 문자를 출력하고 싶을 때 
		System.out.println("오늘은 \" 금요일\" ^^");
		// 역슬래시가 2개이상 중복되면 하나를 제외하고 문자열로 출력됨 
		
		// printf 포멧 문자열 형태로 내용을 출력
		System.out.printf("원주율은 %.9f \n",3.141592654);
		System.out.printf("%d명이 수업을 듣고 있습니다. \n" , 23);
		System.out.printf("%d명이 %s를 듣고 있습니다. \n", 24, "수업");
		
		System.out.println("+++++++++표준입력++++++++++");
		Scanner scan = new Scanner(System.in); // 입력이 들어올때까지 대기 
		System.out.println("이름을 입력해주세요.");
		System.out.println(">>>");
		// 키보드 입력 내용 가져오기
		String name= scan.nextLine();
		System.out.println(name + "님 환영합니다. ^^");
		
		System.out.println("에어컨 희망 온도를 입력해 주세요.");
		System.out.println(">>>");
		int temper = Integer.parseInt(scan.nextLine());
		System.out.printf("희망온도 %d 도 이군요.\n", temper);
		
		
		
		System.out.println("취미를 입력해 주세요.");
		System.out.println(">>>");
		String x = scan.nextLine();
		System.out.printf("취미가 %s 이군요." , x);
		scan.close();
	}

}
