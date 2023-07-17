package ch04_operator;

public class OperatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연산자 operator
		// 1. 증감 연산자
		int num = 10; 
		System.out.println(num);
		num++; // 후위증가 1
		System.out.println(num);
		num--;// 후위 감소
		System.out.println(num);
		++ num; // 전위 증가
		System.out.println(num);
		// 증감 연사자가 앞 뒤에 따라 실행 순서가 다름.
		int a, b;
		a= num++;
		b = ++ num;
		System.out.printf("a : %d 는 할당 후 증가, b : %d 는 증가 후 할당.", a, b);
	}

}
