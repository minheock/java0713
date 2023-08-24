package ch13_thread.issac;

public class Customer extends Thread {
	private Issac issac = Issac.getInstance();
	private String nm;
	private int cnt;
	

	public Customer(String nm, int cnt) {
		super();
		this.nm = nm;
		this.cnt = cnt;
	}

	@Override
	public void run() {
		issac.buyToast(nm, cnt);
	}
	
}
