package operator;

import java.util.Scanner;

public class OperatorEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);	//입력갑슬 받을 준비
		System.out.print("입력하세요 : ");
		int in = sc.nextInt();

		String rst = (in%3 ==0 && in%5 ==0) ? "3의 배수이면서 5의배수 입니다." : 
					((in%3 ==0) ? "3의배수 입니다." :
						((in%5 ==0) ? "5의배수 입니다." : "3의 배수도 5의 배수도 아닙니다."));
		System.out.println(in + "은 : " + rst);
		
		
	}

}
