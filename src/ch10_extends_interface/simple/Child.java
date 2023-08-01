package ch10_extends_interface.simple;
	// 차일드는 파랜트를 상속받음
public class Child extends Parent{
	

	public Child() {
		super();
	}
	
	
	// 부모가 기본적으로 초기값이 있어서 부모의 생성자를 생성해야만 상속할수있다. ctr1 + l로 생성자 추가를하자.
	public Child(String name, int age) {
		super(name, age);
	}
	@Override // 부모의 sayHello 메서드를 재정의
	public void sayHello() {
		System.out.println("자식입니다. !!!");
	}
	
	@Override
	public String toString() {
		return "Child [toString()=" + super.toString() + ", getName()=" + getName() + ", getAge()=" + getAge()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
