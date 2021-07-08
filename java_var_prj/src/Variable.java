
public class Variable {

	public static void main(String[] args) {
		/*
		 * 변수 : 값을 저장하기 위한 공간
		 * 
		 * 변수작성방법 : 
		 * 1. 변수타입 변수명 = 초기화값;
		 * 2. 변수타입 변수명;
		 * 	  변수명 = 초기화값;
		 * 	예 ) 1. int a = 0;
		 * 		2. int a;
		 * 		   a = 0;
		 * 
		 * 변수타입
		 * 1. 기본타입
		 * 	- 논리타입 	: boolean	-> true, false
		 *  - 문자 		: char		-> 'a' 문자 하나 값
		 *  - 숫자 (정수) : byte, short, int, long		-> 정수값
		 *  				1	  1		1	1L		
		 *  							int가 우선
		 *  - 숫자 (실수) : float, double				-> 실수
		 *  			  1.1f	1.1 1.1d
		 *  					double이 우선
		 *  
		 *  	* ctrl + d : 한 줄 삭제
		 *  
		 *  
		 * 2. 참조타입
		 * 	- 클래스 타입을 말함
		 * 	- String
		 * 		* String 사용방법 : String str = "문자"; //빈 값, 문자열, null 들어갈 수 있음
		 * 						  String str1 = "";
		 * 						  String str2 = null;
		 * 
		 * 
		 */
		
		boolean flag = true;	// true는 참의 의미
		System.out.println("boolean 값 : " + flag);
		
		char ch = 'a';		//문자 하나값
		System.out.println("char 값 : " + ch);
		
		int i = 123;
		System.out.println(ch + i);		//큰 byte로 맞춰주기 때문에 int가 된다.
		System.out.println("char + int 값 : " + ch + i);	//문자열과 합했기 때문에 문자열로 변환
		System.out.println("char + int 값 : " + (ch + i));
		
		float f = 12.59f;	//12.59만 적게 되면 double로 인식. f를 꼭 붙여줘야 한다.
		System.out.println("float 값 : " + f);
		
		System.out.println("-------------------");
		
		String str = "문자열 입니다.";
		System.out.println("str : " + str);	
		
		String str1 = null;
		System.out.println("str1 : " + str1);	
		
		String str2 = "";
		System.out.println("str2 : " + str2);	
		
		str1 = "null에서 변경";
		str2 = "변경된 문자";
		System.out.println(str1);
		System.out.println(str2);	
		
		System.out.println(str + " " + str1);

	}

}
