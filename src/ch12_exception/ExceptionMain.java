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
		
		
		try {
			ExMethod.printName("길");
		} catch (BizException e) {
			// TODO: handle exception
			System.err.println(e.getErrCode());
			System.err.println(e.getMessage());
		}
		
		
		
	}

}
