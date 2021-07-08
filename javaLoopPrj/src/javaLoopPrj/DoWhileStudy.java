package javaLoopPrj;

public class DoWhileStudy {

	public static void main(String[] args) {
		
		int i = 0 ;
		int sum = 0;
		
		do {
			sum += i;
			i++;
		} while(i<=10);
		
		System.out.println("합계 : " + sum);

	}

}
