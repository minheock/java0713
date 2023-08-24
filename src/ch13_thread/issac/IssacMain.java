package ch13_thread.issac;

public class IssacMain {
	public static void main(String[] args) {
		// 여러 고객에게 주문을 받았을때
		// 순차적으로 토스트를 생성하고 제공하는 내용.
		Customer pangha = new Customer("팽수", 1);
		Customer nick = new Customer("nick", 2);
		Customer judy = new Customer("judy", 4);
		
		Chef chef = new Chef(7);
		chef.start();
		pangha.start();
		nick.start();
		judy.start();
	}
}

