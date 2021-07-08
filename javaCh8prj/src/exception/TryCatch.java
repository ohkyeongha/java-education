package exception;

public class TryCatch {

	public static void main(String[] args) {
		/*
		 * 예외처리 - 예외처리는 에러가 아닌 처리가능한 예외 처리하는 기능을 말한다.
		 * 	 - 예외 : 정상실행이 가능한 에러를 말한다.
		 * 
		 * 사용방법
		 * 	try{
		 * 		실행문
		 * 	}catch(처리할예외){
		 * 
		 * 		예외처리문
		 * 	}
		 * 
		 */
		
		System.out.println("시작");
		
		try {
			int sum = 0;
			for(int i=1; i<=10; i++) {
				sum+=i;
				System.out.println(0/0);
			}
			System.out.println("합계 : " + sum);
		}catch(ArithmeticException ae) {	//Exception 최상위 예외 클래스. 모든 예외를 잡아줌
			System.out.println("예외처리 1");
//			e.getMessage();
			ae.printStackTrace();
		}catch (Exception e) {
			System.out.println("예외처리 2");
		}
		
		System.out.println("종료");
	}

}
