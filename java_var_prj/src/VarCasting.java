
public class VarCasting {
	
	public static void main(String[] args) {
		/*
		 * 형변환(Casting)
		 *  - 기본타입 형변환
		 *    1) String + any type : String
		 *    2) 정수형 계산은 int 타입이다.
		 *   	- 1+1 -> int
		 *   	- byte b = 12;
		 *   	- short s = 20;
		 *   	- b+s = 32 (int 타입으로 결과값이 나옴)
		 *  - 기본타입 형변환 방법
		 *    long l = 1000;
		 *    int i = (int)l;	//(변화할 타입)변수명 용량이 큰 타입에서 작은타입으로 변환할 때
		 *    -------
		 *    int intValue1 = 1000;
		 *    long longValue1 = intValue1; //작은 타입에서 큰 타입으로 변환할 땐 자동으로 된다.
		 * 
		 */
	
		long longValue = 1000;
	//	int intValue = longValue;	//오류
		int intValue = (int)longValue;
		
		int intValue1 = 1234;
		long longValue1 = intValue;
		long longValue2 = (long)intValue;	//둘 다 가능하다
		
		System.out.println(intValue1 + longValue1 + longValue2);
		
		float floatValue = 545.12f;
		int intValue2 =(int)floatValue;
		System.out.println(intValue2);


	}
}
