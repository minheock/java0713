package sol_algorithm;

public class al8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "aaaaa";
		String str2 = "bbbbb";
		int str3 = str1.length() + str2.length();
		String answer = "";
		// for문을 돌려서 인덱스 값을 넣으려고 하면 
		// str1 과 str2는 최대 인덱스가 5가 끝인데 i는 10까지 올라가니 str1 과 str2의 문자열을 새로운 문자열에 넣을수가 없음.
		// for문이 아닌 while 문으로 answer의 길이가 10이되면 반복문을 종료해야함.
		int i = 0;
		while(answer.length() < str3 ) {
			if(i == 5) {
				i = 1;
			}
			
			if(i % 2 == 0) {
				System.out.println(str1.substring(i, i+1));
				answer += str1.substring(i, i+1);
			}else if (i % 2 == 1){
				System.out.println(str2.substring(i, i+1));
				answer += str2.substring(i, i+1);
			}
			i++;
		}
		
		System.out.println(answer);
	}
}
