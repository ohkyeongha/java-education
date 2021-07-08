package studyInterface;

public class MyData {
	void myData(UserClass user) {
		// A instanceof B : A와 B가 같은 클래스이거나, 상속으로 연결된 클래스 일 경우 true
		if (user instanceof InfoMenu) {	//InfoMenu를 상속받은 애들만 유저정보를 보여준다. 권한
			user.userInfo();
		}
	}
	
	public static void main(String[] args) {
//		BusinessUser user = new BusinessUser();
		IndiUser user = new IndiUser();
//		Guest user = new Guest();
		
		
		MyData md = new MyData();
		md.myData(user);
		
	}
}
