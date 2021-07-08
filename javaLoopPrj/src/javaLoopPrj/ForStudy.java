package javaLoopPrj;

public class ForStudy {

	public static void main(String[] args) {
		
		//1~10까지 합
		
		int sum = 0 ;
		
		for(int i = 1 ; i <= 10 ; i++) {
			sum += i;
			
		}
		System.out.println("합계 : " + sum);
		
		
		System.out.println("-------------");
		
		
//		1~50까지 중에 5의 배수의 값만 합계를 구하라
		
		int sum1 = 0;
		
		for (int i = 1 ; i <= 50 ; i++) {
			if (i%5==0) {	//5의 배수
				sum1 += i;
			}
		}
		
		System.out.println("1~50까지 중에 5의 배수의 합계 : " + sum1);	
		
		System.out.println("-------------\n");
		
		//구구단 출력
		
		for (int i = 2 ; i <= 9 ; i++) {
			System.out.println("----" +i + "단----");
			for(int j = 1 ; j <= 9 ; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
			System.out.println();
		}
		
		System.out.println("-------------\n");
		
		// 별그리기
		
		for (int i = 1 ; i <= 5 ; i++) {		//행
			
			for(int j = 1 ; j <= 5 ; j++) {		//열
				System.out.print("*");
			}
			System.out.println();				//한 줄 내려쓰기
		}
		
		System.out.println("-------------");
		for (int i = 1 ; i <= 5 ; i++) {
			
			for(int j = 1 ; j <= i ; j++) {	
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("-------------");
		
		for (int i = 5 ; i >= 1 ; i--) {
			
			for(int j = 1 ; j <= i ; j++) {
//			for(int j = 0 ; i+k <= 5 ; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
