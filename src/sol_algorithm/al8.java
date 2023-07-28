package sol_algorithm;

public class al8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		int length = str1.length() + str2.length();
		String answer = "";
		System.out.println(length);
//		for (int i = 0; i < length; i++) {
//			boolean isTrue = true;
//			if (i % 2 == 0) {
//				isTrue = true;
//			}else if(i % 2 == 1) {
//				isTrue = false;
//			}
//			if(isTrue) {
//				answer += str1.substring(i, i+1);
//			}else {
//				answer += str2.substring(i , i+1);
//			}
//		}
		System.out.println(answer);
	}
}
