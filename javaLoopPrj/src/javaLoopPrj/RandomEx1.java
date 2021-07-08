package javaLoopPrj;

import java.util.Scanner;

public class RandomEx1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int random = (int)(Math.random() * 30) + 1;	//1~30까지의 랜덤한 값 반환
		System.out.println("랜덤값을 맞추세요");
		int count = 0;
		
		while(true) {
			
			System.out.print("입력 : ");
			int input = sc.nextInt();
			count++;
			if (input == random) {
				System.out.println(input + " 값을 찾았습니다. 종료!");
				System.out.println(count + "번 만에 맞췄습니다!");
				break;
			} else if (input > random) {
				System.out.println("Down");
			} else if (input < random){
				System.out.println("UP");
			} else {
				System.out.println("다시 입력 하세요.");
			}
			
			
		}
		

	}

}
