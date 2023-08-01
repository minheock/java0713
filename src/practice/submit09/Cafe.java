package practice.submit09;

import java.util.ArrayList;

public class Cafe {
	String name;
	static ArrayList<Coffee> menuList;
	
	
	
	public Cafe(String name, ArrayList<Coffee> menuList) {
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


	public ArrayList<Coffee> getMenuList() {
		return menuList;
	}


	public void setMenuList(ArrayList<Coffee> menuList) {
		this.menuList = menuList;
	}
	
	public void addCoffe(Coffee coffee) {
		menuList.add(coffee);
	}
	
	
}
