package sol_algorithm;
import java.util.Scanner;
public class Al4 {

	public static void main(String[] args) {
		// 대소문자 바꿔서 출력하기
	        String a = "aBcDeFg";
	        String b = "";
	        for(int i = 0 ; i < a.length(); i++){
	        	char c = a.charAt(i);
	        	System.out.println(c);
	        	System.out.println(Character.isUpperCase(c)); // 참/거짓 판별
	        	if(Character.isUpperCase(c)) {
	        		b += Character.toLowerCase(c);
	        	}else {
	        		b += Character.toUpperCase(c);
	        	}
	        }
	        System.out.println(b);

	}

}
