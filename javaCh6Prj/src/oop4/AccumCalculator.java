package oop4;

public class AccumCalculator {
	
	int totalSum =0;	//전역변수, 멤버변수
	String log = "";
	
	// + 계산기 , 맨 처음 계산되는 함수
	void initAdd(int a, int b) {
		
//		String front = lessThenZero(a);
//		String end = lessThenZero(b);
//		log += front + " + " + end;
		
		String front = init(a);
		String end = plus(b);
		log += front + end;
		
		
		totalSum = a+b;
	}
	// - 계산기 , 맨 처음 계산되는 함수
	void initSub(int a, int b) {
		
//		String front = lessThenZero(a);
//		String end = lessThenZero(b);
//		log += front + " - " + end;
		
		String front = init(a);
		String end = minus(b);
		log += front + end;
		
		totalSum = a-b;
	}
	
	// + 계산기
	void add(int a) {
//		String front = lessThenZero(a);
//		log += " + " + front;
		String front = plus(a);
		log += front;
		
		totalSum += a;
	}
	// - 계산기
	void sub(int a) {
//		String front = lessThenZero(a);
//		log += front;
		
		String front = minus(a);
		log += front;
		
		
		totalSum -= a;
	}
	
	String lessThenZero(int a) {
		
		String str = "";
		if(a < 0)
			str = "(" + a + ")";
		else
			str = "" + a;
		
		return str;
		
	}
	
	void showLog() {
		System.out.println(log + " = " + totalSum);
	}
	
	String minus(int a) {
		
		String str = "";
		if(a < 0)
			str = " + " + -a;
		else
			str = " - " + a;
		
		return str;
		
	}
	
	String plus(int a) {
		
		String str = "";
		if(a < 0)
			str = " - " + -a;
		else
			str = " + " + a;
		
		return str;
	}
	
	String init(int a) {
		
		String str = "";
		if(a < 0)
			str = "- " + -a;
		else
			str = "" + a;
		
		return str;
	}
	
}
