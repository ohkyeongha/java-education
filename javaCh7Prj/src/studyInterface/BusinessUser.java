package studyInterface;

public class BusinessUser extends UserClass implements InfoMenu{	//부모클래스를 상속받은 자식클래스
	
	@Override
	public void userInfo() {
	
		System.out.println("사업자 계정정보");

	}

}
