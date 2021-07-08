package oop1;

public class MainClass {

	public static void main(String[] args) {
		//void : 반환값이 없는 함수 타입
		//main : 자바에서 실행해주는 함수
		
		Car a = new Car();	//Car 하나 생성
		
		a.carName = "Sonata";
		
		System.out.println(a.carName);
		System.out.println(a.brand);
		
		a.doStartUP();	//시동
		a.doStartUP();	//엑셀
		a.carBreak();	//브레이크
		
		String info = a.carInfo("KIA","K5",3200,"auto");//info
		System.out.println("브랜드\t차이름\t엔진(cc)\t기어");
		System.out.println(info);
		
		System.out.println("-----------------");
		
		Car b = new Car();
		
		b.carName = "Abente";
		
		System.out.println(b.carName);
		System.out.println(b.brand);
		System.out.println(b.engin);
		
		b.doStartUP();	//시동
		b.doStartUP();	//엑셀
		b.carBreak();	//브레이크

	}

}
