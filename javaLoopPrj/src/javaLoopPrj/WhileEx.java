package javaLoopPrj;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
//		누적 더하기 계산기 누적 값이 100이 넘어가면 종료
		
		System.out.println("누적 더하기 계산기 (누적 값이 100이 넘어가면 종료)\n");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int sum = sc.nextInt();
		int next = 0;
		
		while(true) {
			
			System.out.print(sum + " + ");
			next = sc.nextInt();
			
			sum += next;
			System.out.println("= " + sum + "\n");
			
			if(sum >100) {
				System.out.println("종료합니다.");
				break;
			}
			
		}

	}

}
