package ch06_Method;

import java.lang.System.Logger;

public class RecursionMain {

	private static int[] a;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Func(5);
		long no = factorial(5);
		System.out.println(no);
		recFactorial(5);
		System.out.println(no);
	}
	
	public static void Func (int num) {
		if(num == 0) {
			return;
		}else {
			System.out.println("hi");
			Func(num - 1);
		}
		
	}
	
	
	public static long recFactorial (int num) {
		if(num == 1) {
			return 1;
		}
		// 3을 넣었다면 3 * recFactorial(2)
		// 3 * 2* recFactorial(1)...
		return num * recFactorial(num-1);
		
	}

	
	public static long factorial (int num) {
		long sum = 1;
		for(int i = 1; i<= num; i++) {
			sum *= i;
		}
		return sum;
		
	}
	

}
