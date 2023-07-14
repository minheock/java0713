package ch03_system;

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
		
	}

}
