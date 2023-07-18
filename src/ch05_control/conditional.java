package ch05_control;

public class conditional {
	// 전역변수
	// class 중괄호 안에 선언된 변수
	// 해당 클래스 내 어디서든 사용 가능하다.
	static String subject = "조건문";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역변수
		// 해당 스코프 안에서만 사용가능 {}
		int price = 30000;
		int myMoney = 10000;
		
		// if 문
		if(myMoney < price) {
			System.out.println(subject);
			System.out.println("돈이 부족합니다.");
		}
		System.out.println(price); // 지역변수 선언 스코프 밖 사용할 수 없다.
	}
	
}
