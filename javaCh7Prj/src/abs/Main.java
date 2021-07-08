package abs;

public class Main {

	public static void main(String[] args) {
//		User user = new User();
		
		BusinessUser bu = new BusinessUser();
		IndiUser iu = new IndiUser();
		Guest guest = new Guest();
		
		bu.setName("관리자");
		bu.setAddress("구로");
		bu.setEmail("admin@example.com");
		bu.setBusinessNumber("12345678");
		
		iu.setName("홍길동");
		iu.setAddress("서울");
		iu.setEmail("hong@example.com");
		iu.setRegistNumber("990505");
		
		guest.setName("손님");
		guest.setAddress("경기도");
		guest.setEmail("guest@example.com");
		guest.setNickName("오갱");
		
		bu.userInfo();
		System.out.println("---------------------");
		iu.userInfo();
		System.out.println("---------------------");
		guest.userInfo();
	}

}
