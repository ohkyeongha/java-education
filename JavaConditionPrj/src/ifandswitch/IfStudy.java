package ifandswitch;

import java.util.Scanner;

public class IfStudy {
	
	public static void main(String[] args) {
		
		/*
		 * if문 - 조건문
		 * 
		 * if(조건식) {	//조건식에는 true, false가 나오는 boolean, 비교(>, <, == ...), 논리 (&&. ||) 등
		 * 		//조건식이 true일 때 동작하는 문장들
		 * }
		 * 
		 * if(조건식) {	
		 * 		//조건식의 결과가 true일 때 동작하는 문장들
		 * } else {
		 * 		//조건식의 결과가 false일 때 동작하는 문장들
		 * }
		 * 
		 * if(조건식1) {	//조건식1과 조건식 2는 관련된 조건식이어야 한다.
		 * 		//조건식1의 결과가 true일 때 동작하는 문장들
		 * } else if(조건식2){	//else if는 개수에 제한이 없다.
		 * 		//조건식1의 결과가 false, 조건식2의 결과가 true일 때 동작하는 문장들
		 * } else {
		 * 		//조건식1과 조건식2의 결과가 모두 false일 때 동작하는 문장들
		 * }
		 * 
		 * if(조건식1) {
		 * 		실행문;
		 * }
		 * 
		 * if(조건식2) {
		 * 		실행문;
		 * }
		 * 
		*/
		
		//3의 배수 확인하기
		int in = 6;
		
		if(in % 3 ==0) {
			System.out.println("3의 배수");
		} else {
			System.out.println("3의 배수 아님");
		}
		
		//중괄호 없이도 사용 가능하다(한 줄만 포함)
		//들여쓰기를 필수로 넣어주시고
		System.out.println("--------------------");
		if(in % 3 ==0) 
			System.out.println("3의 배수");
		else
			System.out.println("3의 배수 아님");
			System.out.println("if else문에 포함 안 된 출력");
		
		System.out.println("--------------------");	
		
		//국어 영어 수학 점수의 총점, 평균, 학점 출력
		//ctrl + shift + o : 자동 import
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 입력 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 입력 : ");
		int math = sc.nextInt();

		int sum = kor + eng + math;
		float avg = sum/3;
		
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		
		if(kor >= 90)
			System.out.println("국어 학점 : A");
		else if (kor >=80)
			System.out.println("국어 학점 : B");
		else if (kor >=70)
			System.out.println("국어 학점 : C");
		else if (kor >= 60)
			System.out.println("국어 학점 : D");
		else
			System.out.println("국어 학점 : F");
		
		if(eng >= 90)
			System.out.println("영어 학점 : A");
		else if (eng >=80)
			System.out.println("영어 학점 : B");
		else if (eng >=70)
			System.out.println("영어 학점 : C");
		else if (eng >= 60)
			System.out.println("영어 학점 : D");
		else
			System.out.println("영어 학점 : F");
		
		if(math >= 90)
			System.out.println("수학 학점 : A");
		else if (math >=80)
			System.out.println("수학 학점 : B");
		else if (math >=70)
			System.out.println("수학 학점 : C");
		else if (math >= 60)
			System.out.println("수학 학점 : D");
		else
			System.out.println("수학 학점 : F");
		
	}
}
