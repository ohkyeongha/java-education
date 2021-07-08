package oop4;

public class MethodClass {
	
	String str = "전역변수";

	//main 메소드
	//자바 프로그램을 처음 실행해주는 메소드
	public static void main(String[] args) {
		/*
		 * 전역변수 : 클래스 바로 아래 적히는 변수 (전역변수, 멤버변수, 인스턴스변스)
		 * 	- 클래스 내에서 사용 가능 (메소드 상관 없이)
		 *  - 초기화가 자동으로 이뤄짐
		 * 지역변수 : 메소드나 조건문, 반복문 안에서 적히는 변수
		 * 		{...} 안에서 동작
		 * 	- 메소드 내, 조건문; 반복무니 내에서 사용 가능
		 *  - 초기회가 자동으로 이뤄지지 않음
		 *  
		 * 메소드 : 클래스 내에 기능의 격할 (변수, 조건문, 반복문, 출력, 실행문 등)
		 *  
		 * 	- 사용방법
		 * 		출력타입(반환타입) 메소드명(입력변수-개수x, 타입x, (기본타입, 참조타입[배열, String]) {
		 * 			실행문	// 중괄호 안에 동작
		 *  	}
		 *  예)	출력타입 없는 메소드, 정수 입력 하나
		 *  	void m1(int a) {
		 *  		//return 없음
		 *  	}
		 *  	
		 *  	출력타입이 int, 입력이 두 개 (int, String) {
		 *  	int m2(int a, String b) {
		 *  		//출력타입이 있는 경우엔 retrun이 필수
		 *  		return int타입변수;
		 *  	}
		 *  	
		 *  	출력타입이 String, 입력이 하나(정수 배열) 
		 *  	String(m3(int[] arr){
		 *  		
		 *  		return String타입변수;
		 *  	}
		 *  
		 */
		
		String strLocal = "지역변수";
		
		MethodClass m1 = new MethodClass();	//객체화
		m1.str = "전역변수 수정";
		System.out.println(m1.str);	//전역변수
		System.out.println(strLocal);
		m1.function();

	}
	
	void function() {
		String strLocal = "지역변수 2";
		System.out.println(str);
		System.out.println(strLocal);
	}
	
	//반환타입, 입력이 없는 메소드
	void method1() {	//입력이 없는 경우는 빈 괄호
		System.out.println("method1 출력");	//출력문
		int a = 0, b = 0, sum = a+b;	//메소드 내에서 계산이 끝나는 실행문
		str ="method1에서 전역변수 수정";
		
	}
	
	//반환이 없고 입력이 있는 메소드
	void method2(String s) {
		//입력을 받아서 처리(출력, 연산)할 때 사용
		System.out.println(s + "문자값 입력");	//입력을 받아 출력
		s = "수정된 문자값";	//입력값을 수정
		
	}
	
	//반환이 있고, 입력이 있는 경우 메소드
	String method3(int a, String s, int[] arr) {
		
		arr[0] = a;
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.println(arr[1]);
		}
		String result = s+a;
		
		return result;
	}
	
	//반환이 있고, 입력이 없는 경우 메소드
	
	
}
