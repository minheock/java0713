package ch06_Method;
// javadoc 주석 단축키 shift + alt + j
// 자동 주석 생성 설정
// window - preferences - java - code style - code templates - comments






/**
 * @파일명   :MethodMain.java
 * @프로젝트명:JavaStudy
 * @작성일   :2023. 7. 21.
 * @작성자   :202-08
 * @프로그램 설명 : 
 * @변경이력 :
 */
public class MethodMain {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  method (메소드) 클래스에 종속된 함수.
		 *  java 는 모두 class에 작성되기 때문에 사용되는 함수를 메소드라고 부름.
		 *  function은 클래스에 독립적인 함수
		 *  1 ~ 100 까지 더하면 결과는?
		 *  1 ~ 50 까지 더하면 결과는?
		 *  1 ~ 25 까지 더하면 결과는?
		 *  30 ~ 60 까지 더 하면 ?
		 */
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		printSum(1, 100);
		printSum(1, 50);
		printSum(1, 25);
		printSum(30, 75);
		
		int hap = returnSum(50, 60);
				System.out.println("리턴 받았음" + hap);
				System.out.println("리턴 받았음" + returnSum(50, 60));
				
		print("hi");		
		MakeTree(30);
		int num1 = Math.abs(-10);
		print(num1);
		print(MyAbs(-10));
		// 메소드 생성
		// [접근 제어자 static] 리턴 타입 메소드명 (파라미터){
		
	}
	
	/**
	 * @Method Name : printSum
	 * @작성일        : 2023. 7. 21.
	 * @작성자        : 202-08
	 * @메소드 설명    :
	 * @param       :from 시작값, to 종료값
	 * @return      :from ~ to 까지 값을 합하여 리턴
	 */
	public static void printSum(int from, int to) {
		int sum = 0; 
		for(int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.println(from + "부터" + to + "까지 더한 결과는 " + sum);
		
	} 
	
	public static int returnSum(int from, int to) {
		int sum = 0; 
		for(int i = from; i <= to; i++) {
			sum += i;
		}
		System.out.println(from + "부터" + to + "까지 더한 결과는 " + sum);
		return sum;
	} 
	
	public static void print(String msg) {
		System.out.println(msg);
	}
	// 메소드 오버로딩 동일한 이름 입력 타입이 다른 함수로 정의할 수 있음.
	public static void print(int msg) {
		System.out.println(msg);
	}
	
	public static void MakeTree(int num) {
		String tree = "*";
		for (int i = 0; i < num; i++) {
			if(i > 0) {
				tree += "**";
			}
			for (int j = num -1 - i; j > 0; j--) {
				System.out.print(" ");
			}
			System.out.println(tree);
		}
		
		//반전
		int stop = 0;
		for (int i = 0; i < num; i++) {
			stop = 0;
			if(i > 0 ) {
				tree = tree.substring(0, tree.length()-2);
			}
			System.out.println(tree);
			for (int j = stop; j < i+1; j++) {
				System.out.print(" ");
			}	
		}	
	} 
	public static int MyAbs(int num) {
		if(num < 0) {
			num *= -1;
		}
		return num;
	}
	
	
}
