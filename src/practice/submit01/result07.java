package practice.submit01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;

import ch08_collection.CollectionList;

public class result07 {

	public static void main(String[] args) {
		/*
		 * Q 1. 로또번호 생성 메서드 1~45까지 랜덤 숫자 6개를 오름차순으로 출력하 는 makeLotto() 만들어주세요 (로또 번호는 중복이
		 * 없습니다.)
		 */
		ArrayList<Integer> weekLotto = null;
		weekLotto = makeLotto();
		System.out.println(weekLotto.toString());
		
		/*
		 * Q 2. 위의 로또번호 생성 메서드를 오버로딩하여 사용자의 희망 번호 최대 6 개를 매개변수로 전달받아 나머지 숫자를 1~45까지로 생성
		 * 후 오름차순 으로 출력하는 makeLotto(String [] strArr) 만들어주세요 (로또 번호는 중복이 없습니다.) 참고사항:
		 * 사용자의 매개변수 전달 값에도 중복은 없습니다.
		 */
		/*
		 * Q 3. 위의 메서드를 활용하여 로또번호 생성 콘솔 프로그램을 만들어 주세요. [상황 1] n을 입력하면 전체 자동생성 실행 결과
		 * 
		 * [상황 2] y를 입력하고 4 10 과같이 띄어쓰기로 입력
		 */

	}
	public static ArrayList<Integer> makeLotto() {
		ArrayList<Integer> intList = new ArrayList<Integer>();
		Random random = new Random();
		while(intList.size() < 6) {
			intList.add(random.nextInt(1,45));
			
		}
		for(int i =0 ; i < intList.size()-1; i++) {
			for(int j = 0; j < intList.size()-1; j ++) {
				if(intList.get(j) == intList.get(j+1)) {
					intList.remove(i);
				}
			}
		}
		Collections.sort(intList);
		return intList;
		
	}

}
