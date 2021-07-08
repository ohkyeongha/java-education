package opp5;

public class UserMain {

	public static void main(String[] args) {
		User user = new User();
		User user1 = new User("admin", "관리자", "서울", 25);
		
		System.out.println("----user----");
		System.out.println(user.id);
		System.out.println(user.name);
		System.out.println(user.address);
		System.out.println(user.age);
		
		System.out.println("----user1----");
		System.out.println(user1.id);
		System.out.println(user1.name);
		System.out.println(user1.address);
		System.out.println(user1.age);

	}

}
