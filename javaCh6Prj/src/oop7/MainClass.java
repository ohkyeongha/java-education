package oop7;

public class MainClass {

	static int var = 0;	//static 메소드에서는 static 전역변수만 사용 가능하다.
	
	void methodTest() {
		var = 10;
	}
	
	public static void main(String[] args) {
		
		var = 10;
		
		//객체화 진행하여 변수 사용
//		User user = new User();
//		System.out.println(user.a);
//		System.out.println(user.str);
		
		//final
		System.out.println(User.a);
		System.out.println(User.str);
		
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		
		//static
		user1.a = 20;
		user1.str = "사용자1";
		user2.a = 30;
		user2.str = "사용자2";
		user3.a = 40;
		user3.str = "사용자3";
		
		System.out.println("User 1 : " + user1.a);
		System.out.println("User 1 : " + user1.str);
		
		System.out.println("User 2 : " + user2.a);
		System.out.println("User 2 : " + user2.str);
		
		System.out.println("User 3 : " + user3.a);
		System.out.println("User 3 : " + user3.str);
		
		//static final
		
		System.out.println(User.GAME_START);
		System.out.println(User.NUMBER_TEN);
		
		
	}

}
