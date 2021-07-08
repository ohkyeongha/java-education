package javaLoopPrj;

import java.util.Scanner;

public class ForEx {

	public static void main(String[] args) {
		
//		입력값 받아서 1~입력값(100) 까지 홀수 합만 구하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int in = sc.nextInt();
		int sum1 = 0, sum2 = 0;
		
//		첫 번째 방법
		for(int i = 1 ; i <= in ; i +=2) {
			sum1 += i;
		}
		
//		두 번째 방법
		for(int i = 1 ; i <= in ; i ++) {
			if (i%2==1) {
				sum2 += i;
				
			}
		}

		System.out.println("첫 번째 방법으로 구한 1부터 " + in + "까지의 홀수 합 : " + sum1);
		System.out.println("두 번째 방법으로 구한 1부터 " + in + "까지의 홀수 합 : " + sum2);
	}

}
