package exception;

public class HitTryCatch {

	public static void main(String[] args) {
		int hit=0;
		try {
			System.out.println("게시판 글을 클릭");
			System.out.println("조회수 증가");
			hit++;
			
			System.out.println("게시판 글 조회");
			System.out.println("예외 발생");
			System.out.println(0/0);
			
			
		} catch (Exception e) {
			
			hit--;
			System.out.println(e.getMessage());
			System.out.println("예외 처리 완료");
			e.printStackTrace();
			
		}
		
		System.out.println("조회수 : " + hit);
		System.out.println("게시판 글 화면에 출력");
		
		System.out.println("사용자가 확인");
	}

}
