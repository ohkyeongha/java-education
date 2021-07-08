package oop4;

public class MethodClass3 {

	public static void main(String[] args) {
		MethodClass2 mc2 = new MethodClass2();	//MethodClass2의 공간을 생성
		mc2.printOneToTen();
		
		int a = 10;
		int b = 30;
		int sum = mc2.inputSum(a, b);	//입력에 변수를 넣어서 사용
		
		System.out.println(sum);
		mc2.printEnter();

	}

}
