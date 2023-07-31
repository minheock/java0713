package ch09_class.quiz;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuizMain {
	public static void main(String[] args) {
		/*
		 * 영화 맞추기
		 * 명대사 출력
		 * 못 맞추면 배우출력
		 * 못 맞추면 초성 출력
		 * 못 맞추면 다음 영화로 넘어감
		 * movieDB class 는 싱글톤 패턴으로 디자인되어
		 * 외무에서 new를 할 수 없고 내부에서 생성되어진 하나의 인스턴스만을 사용
		 */
		
		MovieDB movieDB = MovieDB.getInstance();
		Scanner scanner = new Scanner(System.in);
		// movieList 메서드는 가져온 인스턴스로만 호출가능
		ArrayList<Movie> movieList = movieDB.getMovieList();
		Collections.shuffle(movieList);
		
		int score = 0; 
		for(int i = 0 ; i < movieList.size(); i++) {
			System.out.println(movieList.get(i).getQuotes());
			System.out.print(">>>");
			String answer = scanner.nextLine();
			if(answer.equals(movieList.get(i).getTitle())) {
				System.out.println("정답 입니다. ~!");
				score +=3;
				continue; // 다음 문제로 넘어감
			}
			System.out.println(movieList.get(i).getActors());
			System.out.print(">>>");
			answer = scanner.nextLine();
			if(answer.equals(movieList.get(i).getActors())) {
				System.out.println("정답 입니다. ~!");
				score +=2;
				continue; // 다음 문제로 넘어감
			}
			if(answer.equals(movieList.get(i).getWord()));
			System.out.println(">>>");
			answer = scanner.nextLine();
			if(answer.equals(movieList.get(i).getTitle())) {
				System.out.println("정답입니다.~!");
				score += 1;
				continue;
			}
			System.out.println("뗑 틀렸습니다. 다음문제로 넘어갑니다.");
		}
		System.out.println("점수는 :" + score);
	}
}
