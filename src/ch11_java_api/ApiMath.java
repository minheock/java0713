package ch11_java_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class ApiMath {

	public static void main(String[] args) {
		// Math
		// 수학에서 사용되는 여러가지 함수들을 메서드로 제공하는 클래스
		final double PI = 3.141592;
		// 반올림 round
		long roundPI = Math.round(PI);
		System.out.println(roundPI);
		// 소수 넷째 자리에서 반올림
		double fourPI = (Math.round(PI * 1000)) / 1000.0;
		System.out.println(fourPI);
		// 올림
		double ceilPI = Math.ceil(PI);
		// 내림(버림) floor
		double floorPI = Math.floor(PI);
		// 절대값
		int mines = -10;
		System.out.println(Math.abs(mines));
		// 제곱 3의 4제곱
		double powVal = Math.pow(3, 4);
		System.out.println(powVal);
		// 제곱근(루트)
		int anyNum = 144;
		System.out.println(Math.sqrt(anyNum));

		// 랜덤 숫자(난수) 생성
		// 0~1 사이 실수 리턴(0은 포함, 1은 포함되지 않음)
		for (int i = 0; i < 10; i++) {
			randomCard();
		}

		// 1~45 랜덤숫자
		int lottoNum = (int) Math.random() * 45 + 1;
		System.out.println(lottoNum);
		// 10~20 랜덤숫자
		int ranNum = (int) Math.random() * 11 + 10;
		System.out.println(ranNum);
		
		
		
		
		ArrayList<String> classMateList = new ArrayList<String>(
				Arrays.asList("김규영", "김동현", "김상준", "김성운", "김세준", "노윤기", "박근혜", "사원기", "송현지", "신가희", "예준서", "윤가영", "윤서준",
						"이규환", "이상희", "이영규", "이재우", "이호제", "임지윤", "정민형", "조하은", "최민혁", "최성웅"));
		HashMap<String, String> resultMap = randomCoffee(classMateList);
		System.out.println(resultMap);
		Set<String>keySet = resultMap.keySet();
		for(String key : keySet) {
			System.out.println(key + "님은" + resultMap.get(key));
		}
		
	}

	// a부터 b사이의 랜덤 숫자리턴
	public static int makeNum(int a, int b) {
		int result = (int) (Math.random() * (b - a + 1)) + a;
		return result;
	}

	public static String randomCard() {
		// random 은 클래스로 존재함.
		Random random = new Random();
		String result;
		// .nextInt(n) 0~ n-1 사이의 정수 리턴
		int randomNum = random.nextInt();
		// 1~ 100 사이의 정수
		randomNum = random.nextInt(100) + 1;
		if (randomNum <= 10) {
			result = "당첨!![10%]";
		} else {
			result = "꽝";
		}
		return result;
	}

	public static HashMap<String, String> randomCoffee(ArrayList<String> arr) {
		// input : ArryList<String>타입
		// output : HashMap(String, String) key : 학생이름, value : 당첨/꽝
		HashMap<String, String> resultMap = new HashMap<String, String>();
		/*
		 * 1. input 으로 받은 arr의 건수만큼 for문 
		 * 2. 10% 확률로 당첨/꽝의 결과 
		 * 3. resultMap.put(학생이름, 결과)로 담기
		 */
		for(int i = 0; i < arr.size(); i++) {
			resultMap.put(arr.get(i), randomCard());
		}
		return resultMap;
	}

}
