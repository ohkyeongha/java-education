package opp5;

public class ConstructorClass {
	
//	기본생성자	(클래스에 생성자가 하나도 없으면 컴파일러가 기본생성자를 추가한다.)
//	ConstructorClass() { }	<-	숨겨져있음
//	생성자가 하나라도 있으면 컴파일러는 기본 생성자를 추가하지 않는다.
	
	//생성자 생성	
	ConstructorClass(){	//클래스명과 동일
		System.out.println("ConstructorClass 객체화 진행");
	}
	
	ConstructorClass(String s, int a, char c) {
		System.out.println("s : " + s);
		System.out.println("a : " + a);
		System.out.println("c : " + c);
	}
	
}
