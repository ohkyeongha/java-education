package javaLoopPrj;

import java.util.Scanner;

public class RandomEx2 {

	public static void main(String[] args) {
		
		//가위 바위 보 게임 가위 :1, 바위: 2, 보,3
		
		System.out.println("이길 때 까지 가위 바위 보!");
		
		while(true) {
			
			System.out.println("가위 : 1, 바위 : 2, 보 : 3");
			System.out.print("입력 : ");
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			
			if (input > 3 || input < 1) {	//1~3 이외의 값을 넣으면 다시 입력받도록 하자
				System.out.println("다시 입력 해주세요\n");
				continue;
			}
			
			switch (input) {
			case 1:
				System.out.println("당신\t: 가위");
				break;
			case 2:
				System.out.println("당신\t: 바위");
				break;
			case 3:
				System.out.println("당신\t: 보");
				break;
			}
			
			int random = (int)(Math.random()*3) + 1;	//가위 1, 바위 2 , 보 3
			
			switch (random) {
			case 1:
				System.out.println("컴퓨터\t: 가위");
				break;
			case 2:
				System.out.println("컴퓨터\t: 바위");
				break;
			case 3:
				System.out.println("컴퓨터\t: 보");
				break;
			}
			
			
			if (input == random) {	//비기는경우
				System.out.println("비겼습니다\n");
				
			} else if(input < random) {	//지는것
				if (input == 1 && random == 3) {	//이기는것
					System.out.println("이겼습니다.");
					System.out.println("종료");
					break;
				} else {
					System.out.println("졌습니다\n");
				}
				
			} else if(input > random) {	//이기는것
				
				if (input == 3 && random == 1) {	//지는것
					System.out.println("졌습니다.\n");
				} else {
					System.out.println("이겼습니다");
					System.out.println("종료");
					break;
				}
				
			}
			
		}
		
		

	}

}
