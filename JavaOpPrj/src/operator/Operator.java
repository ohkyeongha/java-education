package operator;

public class Operator {

	public static void main(String[] args) {
		
		/*
		 * 증감 : ++, --
		 * 	- 1씩 증가, 감소
		 * 	- ++변수 : 먼저 증감이 이뤄지고 대입
		 * 	- 변수++ : 먼저 대입이 이뤄지고 증감
		 * 
		 * 나머지 : %
		 * 	- 숫자1 % 숫자2 : 숫자1을 숫자2로 나눈 나머지 값
		 * 
		 * 비교 : == (같다), != (다르다)
		 * 	- 변수1 == 변수2 : 변수1과 변수2가 같으면 true, 다르면 false
		 * 	- 변수1 != 변수2 : 변수1과 변수2가 다르면 true, 같으면 false
		 * 
		 * 논리 : && (and), || (or)
		 * 	- 변수1 && 변수2 : 변수1과 변수2가 둘 다 true일 때 true, 나머진 false
		 * 	- 변수1 || 변수2 : 변수1과 변수2가 둘 중 하나라도 true일 때 true, 나머진 false
		 * 
		 * 삼항연산자 (조건문) : 	조건식 ? 값1(true) : 값2(false)
		 * 	- 조건식이 true일 때 값1 호출, 조건식이 false일 때 값2 호출
		 * 
		 */
		
//		증감
		System.out.println("--------증감--------");
		int i=0;
		
//		i++;	//i++, ++i, i--, --i를 단독으로 쓸 대 증감역할만 함.
//		int result = ++i;	//i값 : 1	result값 : 1
		int result = i++;	//i값 : 1	result값 : 0
//		i++;
//		++i;
		
		System.out.println("i값 : " + (i++));		//i값 : 1
		System.out.println("result값 : " + result);	//result값 : 0
		System.out.println("i값 : " + (i));			//i값 : 2
		
//		비교
		System.out.println("--------비교--------");
		
		System.out.println("비교 (==) : " + (10 == 10) );
		System.out.println("비교 (!=) : " + (10 != 10) );
		
//		나머지
		System.out.println("-------나머지--------");
		
		int value1 = 14565531;
		int value2 = 4;
		
		int resultRemain = value1 % value2;
		
		System.out.println("value1 : " + value1);
		System.out.println("value2 : " + value2);
		System.out.println("나머지 값 : "+ resultRemain);
		
		System.out.println("value1 짝수 : " + (value1%2 ==0));
		System.out.println("value1 홀수 : " + (value1%2 !=0));
		
//		논리
		System.out.println("--------논리--------");
		
		boolean flag1 = true;
		boolean flag2 = false;
		
		System.out.println("flag1 && flag2 : " + (flag1 && flag2));
		System.out.println("flag1 || flag2 : " + (flag1 || flag2));
		
//		삼항연산자
		System.out.println("------삼항연산자-----");
		
		int input = 2245386;
		
		String resultStr = (input%2 ==0)? "짝수" : "홀수";
		String resultStr1 = (input%3 ==0)? "3의배수 입니" : "3의배수가 아닙니";
		
		System.out.println(input + "은 " + resultStr + "입니다.");
		System.out.println(input + "은 " + resultStr1 + "다.");
		
		System.out.println("-------------------");

		int in1 = 0;
		int in2 = 0;
		
		String resultStr2 = (in1 > in2) ? "in1이 크다." : ((in1 == in2) ? "in1과 in2는 같다." : "in2가 크다" );
		System.out.println(resultStr2);
		
		

	}

}
		