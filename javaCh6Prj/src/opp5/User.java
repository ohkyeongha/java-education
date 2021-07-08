package opp5;

public class User {
	String id;
	String name;
	String address;
	int age;
	
	User(){	//기본 생성자를 적어주면 매개변수 없이도 기본생성자를 생성할 수 있다.
		this("user", "사용자", "경기", 31);
		System.out.println("기본생성자 User 호출");
		
	}
	User(String id, String name, String address, int age){
		//지역변수가 전역변수보다 우선순위가 높다 -> 전역변수엔 this를 써주자
//		this();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
	}
}
