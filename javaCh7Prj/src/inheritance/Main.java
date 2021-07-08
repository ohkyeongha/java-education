package inheritance;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		
		a.varA = 100;
		a.methodA();
		
		B b = new B();
		
		b.strB = "자식클래스 변수";
		b.varA = 200;
		b.methodA();
		b.methodB();

	}

}
