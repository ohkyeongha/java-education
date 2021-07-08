package thread;

public class Calculator {
	
	int sum = 0;
	
	public synchronized void sum(int a, int b) {
		sum =0;
		for (int i = a; i <= b; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			sum+=i;
		}
		
		System.out.println("합계 : " + sum);
		
	}
}
