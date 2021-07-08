package thread;

public class ThreadMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.sum(1, 10);

		
//		ThreadEx1은 Thread 상속
		ThreadEx1 t1 = new ThreadEx1(cal);
		
//		ThreadEx2은 Runnable 상속(구현)
		Thread t2 = new Thread(new ThreadEx2(cal));
//		Runnable r = new ThreadEx2();
//		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
		
//		for (int i = 0; i < 10; i++) {
//			try {
//				Thread.sleep(200);
//				System.out.print("M");
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		

	}

}
