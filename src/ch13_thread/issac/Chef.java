package ch13_thread.issac;

public class Chef extends Thread{
	private Issac issac = Issac.getInstance();
	private int cnt;
	
	public Chef(int count) {
		this.cnt = count;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i < cnt; i++) {
			try {
				Thread.sleep(30000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			issac.makeToast(); // 토스트 만들기 (주문받은 수량만큼)
		}
		
	}
}
