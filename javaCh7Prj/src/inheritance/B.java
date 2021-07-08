package inheritance;

public class B extends A{	//A클래스를 상속받은 B클래스
	/*
	 * 상속 - 부모클래스 변수, 메소드를 자식클래스에서 쓸 수 있음
	 * 
	 * 예 ) public class B extends A	// A: 부모클래스, B: 자식클래스
	 * 
	 * 오버라이딩 - 부모클래스의 메소드를 자식클래스에서 재정의해주는 것
	 * 	* 메소드명, 매개변수, 개수/타입/반환타입이 같아야한다.
	 * 	* 자식클래스에서 재정의하지 않으면 부모클래스 메소드를 호출
	 * 		하지만 자식클래스에서 재정의하면 자식클래스 메소드를 호출
	 * 
	 * 예 )	class A
	 * 		void method() {
	 * 			sysout("부모클래스 메소드");
	 * 		}
	 * 		
	 * 		class B extends B
	 * 		void method() {
	 * 			sysout("자식클래스 재정의 메소드");
	 * 		}
	 * 
	 * 
	 * 
	 */
	String strB;
	
	void methodA() {
		System.out.println("methodA 재정의");
	}
	
	void methodB() {
		System.out.println("methodB");
		
//		A a = new A();
//		System.out.println(a.varA);
//		a.methodA();
	}
}
