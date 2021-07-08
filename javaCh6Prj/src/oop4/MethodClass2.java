package oop4;

public class MethodClass2 {

	public static void main(String[] args) {

		MethodClass2 mc2 = new MethodClass2();
		mc2.printOneToTen();
		mc2.printOneToTen(1,50);
		int sum = mc2.inputSum(1, 20);//1~20합계 숫자
		//inputSum의 결과값이 int타입이기 때문에 그 값을 넣는 공간도 int여야함
		System.out.println("합계 : " + sum);
		mc2.printEnter();
		
	}
	
	//한 줄 내려쓰고 "------------------" 구분해주는 메소드
	
	void printEnter() {
		System.out.println("\n--------------------");
		
	}
	
	//1~10까지 출력하는 메소드
	void printOneToTen() {
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.print(i + " ");
		}
		printEnter();
		
	}
	
	//start ~ end까지 출력
	void printOneToTen(int start, int end) {
		for(int i = start; i <= end ; i++) {
			System.out.print(i + " ");
		}
		printEnter();
	}
	
	//start ~ end 합계값을 반환해주는 메소드
	int inputSum(int start, int end) {
		int sum = 0;
		for(int i = start; i <= end ; i++) {
			sum += i;
		}
		
		return sum;
	}

}
