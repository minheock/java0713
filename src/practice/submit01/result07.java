package practice.submit01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

import ch05_control.conditional;
public class result07 {

	public static void main(String[] args) {
		/*
		 * Q 1. 로또번호 생성 메서드 1~45까지 랜덤 숫자 6개를 오름차순으로 출력하 는 makeLotto() 만들어주세요 (로또 번호는 중복이
		 * 없습니다.)
		 */
		ArrayList<Integer> weekLotto = null;
		weekLotto = makeLotto(args);
		System.out.println("문제 1번.");
		System.out.println(weekLotto.toString());
		
		
		
		
		/*
		 * Q 2. 위의 로또번호 생성 메서드를 오버로딩하여 사용자의 희망 번호 최대 6 개를 매개변수로 전달받아 나머지 숫자를 1~45까지로 생성
		 * 후 오름차순 으로 출력하는 makeLotto(String [] strArr) 만들어주세요 (로또 번호는 중복이 없습니다.) 참고사항:
		 * 사용자의 매개변수 전달 값에도 중복은 없습니다.
		 */
		String [] strArr = {"1", "3", "22"};
		int[] intarr = {1, 3, 22};
		System.out.println("\n문제 2번.");
		System.out.println(makeLotto(strArr));
		
		
		
		
		
		/*
		 * Q 3. 위의 메서드를 활용하여 로또번호 생성 콘솔 프로그램을 만들어 주세요. [상황 1] n을 입력하면 전체 자동생성 실행 결과
		 * 
		 * [상황 2] y를 입력하고 4 10 과같이 띄어쓰기로 입력
		 */
		String [] strArr2 = {};
		System.out.println("\n문제 3번.");
		Scanner scan = new Scanner(System.in);
		while(true) {
		System.out.println("==========================");
		System.out.println("행운의 로또 번호 생성기 입니다.\n"
				+ "입력 값이 있으면 'y' , 전체 자동으로 선택하려면 'n'을 선택하세요>>>");
		String autoLottoNum = scan.nextLine();
		if(autoLottoNum.equals("y")) {
			System.out.println("번호를 한 칸씩 띄어서 입력해주세요 최대 6개");
			String selectNum = scan.nextLine();
			System.out.println("선택하신 번호는\n"
					+ selectNum.replace(" ", ","));
			String[] splNum = selectNum.split(" ");
			System.out.println("이번주 행운의 로또 번호는 ♥");
			System.out.println(makeLotto(splNum));
			System.out.println("GOOD LUCK ♥");
			break;
		}else if(autoLottoNum.equals("n")) {
			System.out.println("이번주 행운의 로또 번호는 ♥");
			System.out.println(weekLotto.toString());
			System.out.println("GOOD LUCK ♥");
			break;
		}else {
			System.out.println("다른 입력 값 입니다. 다시 해주세요.");
		}
		System.out.println("==========================");
		}
		
		// 셔플 
		System.out.println(shuffleLotto());
		// 해쉬
		System.out.println(setLotto());
	}
	public static ArrayList<Integer> makeLotto(String [] arr) {
		Random random = new Random();
		ArrayList<Integer> intList = new ArrayList<Integer>();
		// 랜덤한 값을 넣어준다.
		// 스트링 리스트를 정수타입으로 변환해서 넣어준다.
		for(String s : arr) {
            intList.add(Integer.parseInt(s));
        }
		
		while(intList.size() != 6) {
			intList.add(random.nextInt(1,45));
		
		for(int i =0 ; i < intList.size(); i++) {
			for(int j = 0; j < intList.size(); j ++) {
				if(i == j) {
					
				}else if(intList.get(j).equals(intList.get(i))) {
					intList.remove(j);
				}
			}
		}
		}
		Collections.sort(intList);
		return intList;
		
	}
	// 셔플로 푸는법
	public static ArrayList<Integer> shuffleLotto() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		int maxNum = 45;
		for(int i = 1; i<=maxNum; i++) {
			numbers.add(i);
		}	
		Collections.shuffle(numbers);
		ArrayList<Integer> result = new ArrayList<Integer>(numbers.subList(0, 6));
		Collections.sort(result);
		return result;
	}
	// hash set 으로 푸는법
	public static ArrayList<Integer> setLotto() {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		while(lottoSet.size() < 6) {
			int num = (int) (Math.random() * 45 +1);
			lottoSet.add(num);
		}
		for(Integer val : lottoSet) {
			numbers.add(val);
		}
		Collections.sort(numbers);
		return numbers;
	}
	
	

}