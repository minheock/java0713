package practice.submit09;

import java.util.ArrayList;

public class Cafe {
	String name;
	static ArrayList<String> menuList;
	
	
	
	public Cafe(String name, ArrayList<String> menuList) {
		super();
		this.name = name;
		this.menuList = menuList;
	}

	

	@Override
	public String toString() {
		return "Cafe [name=" + name + ", menuList=" + menuList + ", getMenuList()=" + getMenuList() + "]";
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ArrayList<String> getMenuList() {
		return menuList;
	}


	public void setMenuList(ArrayList<String> menuList) {
		this.menuList = menuList;
	}
	
	Coffee star1 = new Coffee("아메리카노", 5000);
	Coffee star2 = new Coffee("카푸치노", 6000);
	Coffee star3 = new Coffee("오곡라떼", 7000);
	Coffee aka1 = new Coffee("아메리카노", 2500);
	Coffee aka2 = new Coffee("바닐라라떼", 3000);
	Coffee aka3 = new Coffee("아이스티", 3500);
	/* 그냥 작성하면 되겠지만 여기서는 메뉴들을
	 * 1. 리스트에 담아줘야함
	 * 2. 담아준걸 반복문으로 돌려서 출력.
	 * 3. 
	 */
	
}
