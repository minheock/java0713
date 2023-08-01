package ch10_extends_interface.simple;

public class Parent {
	private String name;
	private int age;
	
	public Parent() {
		
	}
	
	
	public Parent(String name, int age) {
		// super()<= 부모생성자 호출
		// 기본적으로 Object를 상속받기 때문에 자동으로 super()가 나옴.
		super();
		this.name = name;
		this.age = age;
	}
	
	
	
	// 오버라이딩 부모의 toString 메서드를 재정의(Override)해서 사용
	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}
	
	//세터게터
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void sayHello() {
		System.out.println("부모입니다.");
	}
	
	
}
