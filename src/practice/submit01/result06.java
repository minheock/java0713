package practice.submit01;

import java.util.Arrays;

public class result06 {

	public static void main(String[] args) {
		//문제 1. 
		//이름, 연락처, 이메일을 입력했을 때 다음과 같이 출력하는 메소드를 만들어주세요.
		
		/* 1. 비지니스 카드라는 메서드를 만든다.
		 * 2. 매개변수에 이름 연락처 이메일을 순서대로 넣는다.
		 * 3. 프린트린을 사용해서 틀을 만들고 안에 인자를 넣어준다.
		 */
		BusinessCard("최민혁", "010-5314-4582", "dygks0602@naver.com");
		
		
		
		/*문제2
		 * 여러분들의 명단을 배열로 입력받아 같은 성을 가진 사람이 몇 명
           인지 출력하는 메소드를 만들어주세요.
           
           
		 */
		String[] nameList = { "김규영", "김동현", "김상준", "김성운", "김세준", "노윤기", "박근혜", "사원기", "송현지", "신가희", "예준서", "윤가영", "윤서준",
				"이규환", "이상희", "이영규", "이재우", "이호제", "임지윤", "정민형", "조하은", "최민혁", "최성웅" };
		searchName("최", nameList);
		
		/*문제3
		 * 
		 */
		int [] intArr = {23,456,213,32,464,1,2,4,33};
		MinAndMax(intArr);
		MinMax(intArr);
		
	}

	public static void BusinessCard(String name,String phoneNumber,String email) {
		System.out.println("===================");
		System.out.println("이름 :" + name);
		System.out.println("연락처 :" + phoneNumber);
		System.out.println("이메일 :" + email);
		System.out.println("===================");
		
	}
	public static void searchName(String firstName,String[] list) {
		int count = 0;
		String name = "";
		System.out.println("===================");
		for(int i = 0; i < list.length; i++) {
			if(list[i].substring(0,1).equals(firstName)){
				count++;
				name += list[i];
			}
		}
		System.out.printf("%s씨성을 가진 동기분이 총 %d명 있습니다.\n%s\n", firstName, count, name);
		System.out.println("===================");
	}
	public static void MinMax(int[] arr) {
		int last = arr.length;
		for(int i = 0 ; i < arr.length-1; i++) {
			for(int j = 0; j < arr.length-1; i++) {
				if(arr[j] < arr[j + 1]) {
					int k = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = k;
				}
			}
			
		}
		System.out.println("최댓값 :" + arr[0] + "\n최솟값 :" + arr[last-1]);
		
	}
	public static void MinAndMax(int[] arr) {
		Arrays.sort(arr);
		int last = arr.length;	
		System.out.println("최댓값 : "+arr[last-1]);
		System.out.println("최솟값 : "+arr[0]);
	}
}
