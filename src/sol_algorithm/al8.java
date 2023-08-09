package sol_algorithm;

public class Al8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcde";
		String str2 = "zxcvb";
		String str4 = str1 + str2;
		System.out.println(str4);
		int str3 = str1.length() + str2.length();
		String answer = "";
		// for문을 돌려서 인덱스 값을 넣으려고 하면 
		// str1 과 str2는 최대 인덱스가 5가 끝인데 i는 10까지 올라가니 str1 과 str2의 문자열을 새로운 문자열에 넣을수가 없음.
		// for문이 아닌 while 문으로 answer의 길이가 10이되면 반복문을 종료해야함.
		Boolean i = true;
		int j = 0;
		int k = 0;
		while(answer.length() < str3 ) {
			if(i) {
				answer += str1.substring(j, j+1);
				i = false;
				j++;
			}else if (!i){
				answer += str2.substring(k, k+1);
				i = true;
				k++;
			}
		}
		System.out.println(answer);
		System.out.println(Integer.parseInt("3"));
	}
}
