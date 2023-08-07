package practice.submit09;

public class Coffee {
	private String name;
	private int price;
	
	
	public Coffee(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}


	public int getPrice() {
		return price;
	}

	
}
