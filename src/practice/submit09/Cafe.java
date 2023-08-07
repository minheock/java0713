package practice.submit09;

import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
	private String kname;
	private String ename;
	private ArrayList<Coffee> menuList = new ArrayList<Coffee>();
	
	public Cafe(String kname, String ename, ArrayList<Coffee> menuList) {
		super();
		this.kname = kname;
		this.ename = ename;
		this.menuList = menuList;
	}
	// 오버로딩 동일한 생성자에
	public Cafe(String kname, String ename) {
		super();
		this.kname = kname;
		this.ename = ename;
		this.menuList = new ArrayList<Coffee>();
	}
	
	
	@Override
	public String toString() {
		return "Cafe [kname=" + kname + ", ename=" + ename + ", menuList=" + menuList + "]";
	}
	
	
	public String getKname() {
		return kname;
	}
	public void setKname(String kname) {
		this.kname = kname;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public ArrayList<Coffee> getMenuList() {
		return menuList;
	}
	public void setMenuList(ArrayList<Coffee> menuList) {
		this.menuList = menuList;
	}
	
	// 커피메뉴 추가
	public void addCoffee (Coffee cf) {
		menuList.add(cf);
	}
	// 메뉴판 출력 메소드
	public void ShowMenu() {
		for(int i = 0; i < menuList.size(); i++) {
			System.out.println((i + 1) + "." + menuList.get(i));
			// i = 0 이니까 +1 해주면 1이고 .을 붙이고 메뉴리스트의 0번째 인덱스부터 출력하면
			// 1. 예) 아메리카노 3000원 이렇게 메뉴가 쭉 나열된다.
		}
	}
	
	// 커피 구매
	public void buyCoffee(Scanner sc) {
		System.out.println("메뉴를 선택해주세요");
		int choice = Integer.parseInt(sc.nextLine());
		// 0번째 인덱스부터니까 -1을 해줘야함
		System.out.println(menuList.get(choice-1).getName()+ "를" 
		+ menuList.get(choice -1).getPrice()+"원에 구매했습니다.");
	}
	
	
}
	