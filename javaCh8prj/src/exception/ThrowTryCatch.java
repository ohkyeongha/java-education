package exception;

public class ThrowTryCatch {

	public static void main(String[] args) {
		System.out.println("시작");
		boolean flag= true;
		try {
			method();
//			if(flag) {
//				System.out.println("예외발생");
//				throw new Exception();	//예외발생
//			}
		} catch (Exception e) {
			System.out.println("예외처리");
			e.printStackTrace();
		}
		System.out.println("종료");
		
	}
	
	public static void method() throws Exception{	//발생한 예외를 상위로 던져줌
		System.out.println("method 시작");
		
		try {
			System.out.println(0/0);	//예외
			
		} catch (Exception e) {
			System.out.println("method 예외 발생");
			throw new Exception();	//예외 발생
		} finally {		//catch문 안에서 예외가 발생해도 실행하는 부분
			
			System.out.println("method 종료");
		}
		
	}
	
}
