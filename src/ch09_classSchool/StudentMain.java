package ch09_classSchool;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student pangsu = new Student("팽수", 90, 80, 87);
		Student gildong = new Student("길동", 80, 70, 65);
		System.out.println(pangsu);
		System.out.println(gildong);
		
		// 캡슐화 적용
		// 같은 private 필드는 해당 클래스의 메서드를 사용해서 접근
		System.out.println(pangsu.getEng());
		System.out.println(pangsu.getKor());
		//수정 setter
		pangsu.setEng(85);
		System.out.println(pangsu);
	}

}
