package oop2;

public class MainClass {

	public static void main(String[] args) {
		// 계산기
		int a = 15;
		int b = 20;
		Carculator cal = new Carculator();
		
		int addResult = cal.add(a, b);
		System.out.println(addResult);

		int subResult = cal.sub(a, b);
		System.out.println(subResult);
		
//		int multiResult = cal.multi(a, b);
		System.out.println(cal.multi(56, 27));
		
		
		System.out.println(cal.multi(addResult, 20));
		System.out.println(cal.multi(cal.add(a, b),10));
		
		
	}

}
