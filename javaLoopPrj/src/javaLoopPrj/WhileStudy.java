package javaLoopPrj;

import java.util.Scanner;

public class WhileStudy {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;	//초기화를 밖에서 해줘야함.
		while (i <= 10) {
			++i;
			sum += i;
		}
		
		/*
		 * 동일 반복문 :
		 * for (int i = 1 ; i <= 10 ; i++)
		 * 	sum += 1
		 * 
		 */
		
		System.out.println(sum);
		
		System.out.println("---------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.print("입력값 1 (-1 입력시 종료) : ");
			int input1 = sc.nextInt();
			
			if(input1 == -1) {
				System.out.println("계산기 종료");
				break;
			}
			
			System.out.println("입력값2 : ");
			int input2 = sc.nextInt();
			
			System.out.println("합계 : " + (input1+input2) + "\n");
			
		}
		
	}

}
