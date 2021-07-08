package oop2;

public class Carculator {
	/*
	 * 속성 : 출력 화면 사이즈 
	 * 기능 : 더하기, 뺴기, 곱하기, 나누기
	 * 
	 */
	
	String printSize = "100";
	
	
	int add(int a, int b) {	//더하기
		int result = a+b;
		return result;
	}
	
	int sub(int a, int b) {	//빼기
		int result = a-b;
		return result;
	}
	
	int multi(int a, int b) {	//곱하기
		int result = a*b;
		return result;
	}
	
	int div(int a, int b) {	//나누기
		int result = a/b;
		return result;
	}

}
