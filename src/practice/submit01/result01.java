package practice.submit01;

public class result01 {

	public static void main(String[] args) {
		/*1번
		 * 본인의 이름과 나이, 키, 연락처, 이메일을 각각 타입에 맞는 변수에 저장한 후 아래와 같이 콘솔창에 출력해주세요.
		 * 
		 * 변수명: name, age, height, phone, email 사용 키는 소수 첫번째자리를 포함
		 */
		String name = "minheock";
		int age = 30;
		double height = 173.8;
		String phone = "010-1234-5678";
		String email = "dygks0602@naver.com";
		System.out.println("이름:"+name +"\n나이:"+age + "\n키:" + height + "\n연락처:" + phone + "\n이메일:" + email);
		
		/* 2번
		 * 문자열 변수 String enigma = “너오구늘리뭐너먹구지리”; 에서 너, 구, 리를 제거해서 출력해보세요.
		 */
		String enigma = "너오구늘리뭐너먹구지리";
//		enigma = enigma.replaceAll("[너, 구, 리]", "");
		enigma = enigma.replace("너", "");
		System.out.println("1차 해독완료 [너]" + enigma );
		enigma = enigma.replace("구", "");
		System.out.println("2차 해독완료 [구]" + enigma);
		enigma = enigma.replace("리", "");
		System.out.println("3차 해독완료 [리]" + enigma);
		System.out.println("해독 끝" + enigma);
		
		//3번
		int example = 278;
		int first = example % 10;
		int mid = example / 100;
		int last = example / 10 % 10;
		int result = first + mid + last;
		System.out.println(result);
	}

}
