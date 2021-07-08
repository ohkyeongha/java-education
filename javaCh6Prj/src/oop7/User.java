package oop7;

public class User {
	/*
	 * 1. final - 상수선언 (변수, 메소드, 클래스)
	 * 	- 변수는 값을 변경하지 못하게 만들어 하나의 값을 계속 유지
	 * 		(숫자, 문자 가능)
	 * 	- 상수 변수명은 무조건 대문자로 적는다. 여러 단어를 합칠 때는 _로 합친다,
	 * 	- 상수는 생성과 동시에 초기화 하지만, 생성자를 이용해 초기화도 가능하다.
	 * 
	 * 	예)	final int NUMBER = 10;
	 * 		final String SRART = "START";	
	 * 		
	 * 		final String End;
	 * 		생성자() {
	 * 			END = "END";
	 * 		}
	 * 
	 * 2. static - 객체화를 진행하지 않고 사용할수 있게 마느는 명령어
	 * 	- 변수, 메소드에 사용 가능
	 * 	- 메모리에 꼐속 남아있어서 효율이 떨어질 수 있다. 꼭 공통으로 사용해야하는 값에만 설정해준다
	 * 
	 * 예)	Class A{
	 * 			static int number = 10;
	 * 		}
	 * 		Class B {
	 * 			main() {
	 * 				A a = new A;	//x
	 * 				sysout( a.number );//x
	 * 				
	 * 				sysout( A.number );//o
	 * 		}
	 * 
	 * 
	 * 3. static final - 어디든지 공통으로 객체화 없이 사용 가능한 상수
	 * 		- 보통 상수는 final 하나만 사용하지 않고 static final로 사용
	 * 
	 * 	예)	static final int NUMBER_TEN = 10;
	 * 		static final String GAME_START = "START"
	 * 		final static String GAME_START = "START"
	 * 
	 * 		static final int NUMBER_TEN;
	 * 		static{
	 * 			NUMBER_TEN = 10;
	 * 		}
	 * 
	 * 
	 */
	
	
	//final
	final int NUMBER = 10;	//상수
	final String START = "START";	//직관적으로 확인할 수 있게 사용
	final String END = "END";
	
	void method() {
//		NUMBER = 20;	//final을 지우거나 NUMBER를 설정하지마라. 상수로 설정된 ㄴ것은 
		System.out.println(NUMBER);
		System.out.println(START);
		System.out.println(END);
		
	}
	
	
	//static
	static int a = 10;
	static String str = "문자값";
//	int a = 10;
//	String str = "문자값";
	
	
	//static final
	static final int NUMBER_TEN = 10;
	final static String GAME_START = "START";
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
