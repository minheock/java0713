package ch09_classSchool;

public class Student {

	public static void main(String[] args) {
		
		
		
	}
	// TODO Auto-generated method stub
			/*
			 * 1. 필드 변수 선언
			 * 접근 제어자
			 * public : 공개, 프로젝트 내부 어디서든 접근 가능
			 * private : 비공개, 현재 클래스 내에서만 접근
			 * (default) : 같은 폴더 내에 있는 클래스에서만 접근 가능
			 * 캡슐화는 필드 변수 접근제어자를 전부 private 으로 만큼
			 * 
			 */
	private String name;
	private int kor;
	private int eng;
	private int math;
	private double avg;
	
	// 2. 생성자 만들기
//	public Student() {}
	//Shift + alt + s

	public Student(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + ", avg=" + avg + "]";
	}
	
	// 4. Getter and Setters..
	// private 로 접근을 막은 필드변수에 대해 접근하기 위한 메서드
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	

}
