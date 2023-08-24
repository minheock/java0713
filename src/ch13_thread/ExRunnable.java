package ch13_thread;
// (2) 스레드 사용 2번째 방법 Runnable 인터페이스 구현
public class ExRunnable implements Runnable {
	int num;
	String name; 
	
	public ExRunnable(int num, String name) {
		super();
		this.num = num;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 스레디의 기능을 정의하는 부분
				for(int i = num; i<= num + 5; i++) {
					// 현재 실행중인 thread이름 출력
					System.out.println(this.name + " "+ i );
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO: handle exception
						e.printStackTrace();
					}			
				}
		
	}



}
