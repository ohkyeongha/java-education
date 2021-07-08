package ifandswitch;

import java.util.Scanner;

public class SwitchStudy {

	public static void main(String[] args) {
		/*
		 * switch - case문
		 * 
		 * switch(조건 변수)	//조건변수에 들어갈 수 있는 값은 정수, 문자, 문자열
		 * 		case 값1: 	//값11: 값12:	 처럼 여러 개 지정 할 수 있다.
		 * 			//조건식의 결과가 값1과 같을 경우 수행될 문장들
		 * 			...
		 * 			break;
		 * 		case 값2:
		 * 			//조건식의 결과가 값2와 같을 경우 수행될 문장들
		 * 			...
		 * 			break;
		 * 		...
		 * 		default:
		 * 			//조건식의 결과와 일치하는 case문이 없을 때 수행될 문장들
		 * }
		 * 
		 */
		
		int score = 80;
		
		switch (score) {
			case 90:
				System.out.println("성적 : A");
				break;
			case 80:
				System.out.println("성적 : B");
				break;
			case 70:
				System.out.println("성적 : C");
				break;
			default:
				System.out.println("성적 : F");
		}
		
		System.out.println("-----------------");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력값 1 : ");
		int in1 = sc.nextInt();
		System.out.print("입력값 2 : ");
		int in2 = sc.nextInt();
		sc.nextLine();		//남아있는 엔터를 제거하기 위함
		System.out.print("연산 : ");
		String op = sc.nextLine();
		
		int result = 0;
		
		switch (op) {
		case "+": case "더하기" : case "합": case "플러스":
			result = in1 + in2;
			System.out.println(in1 + " + " + in2 + " = " + result);
			
			break;
		case "-": case "빼기" : case "차": case "마이너스":
			result = in1 - in2;
			System.out.println(in1 + " - " + in2 + " = " + result);
			break;
		default:
			System.out.println("입력 오류");
			System.out.println("입력된 값 : " + op);
		}
	}

}
