package opp5;

public class Calculator {
	/*
	 * 메서드 오버로딩 
	 *  - 메서드명이 같은 메서드를 만들 수 있다.
	 *  - 메서드 명이 같고, 입력변수(매개변수) 타입이 다르거나, 개수가 다른 경우
	 *  - 리턴타입은 상관 없다.
	 * 
	 */
	
	int add(int a, int b) {
		return a+b;
	}
	float add(float a, int b) {
		return a+b;
	}
	float add(int a, float b) {
		return a+b;
	}
	float add(float a, float b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
	
	int sub(int a, int b) {
		return a+b;
	}
	float sub(float a, int b) {
		return a+b;
	}
	float sub(int a, float b) {
		return a+b;
	}
	float sub(float a, float b) {
		return a+b;
	}
	double sub(double a, double b) {
		return a+b;
	}
	
	
}
