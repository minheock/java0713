package ch12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("메인시작");
		int[] intArr = { 1, 2, 3 };
		try {
			System.out.println(intArr[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("인덱스 error! 사이즈에 맞게 사용하세요");
			e.printStackTrace();
		} catch (Exception e) {
			// TODO: handle exception
//			e.printStackTrace();
			System.err.println("오류났어!");
			System.out.println("오류났을때 처리구간");
		}

		System.out.println("메인종료");
		
		try {
			System.out.println(ExMethod.dateMillsec("2023.07.12"));
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ExMethod.dateMillsec2("2023.07.12"));
		
		// 입력받은 이름을 콘솔에 출력하는 메서드
		// 만약 입력이 없으면 exception 처리 만약 1자리이면 exception
		// 사용자 정의 예외 처리
		// 코드상 오류는 아니지만 해당 업무에서 오류로 보는 상황에 대한 예외처리 방법
		try {
			ExMethod.printName("길");
		} catch (BizException e) {
			// TODO: handle exception
			System.err.println(e.getErrCode());
			System.err.println(e.getMessage());
		}
		
		
		
	}

}
