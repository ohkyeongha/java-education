package abs;

public class IndiUser extends User {
	private String registNumber;
	
	public String getRegistNumber() {
		return registNumber;
	}

	public void setRegistNumber(String registNumber) {
		this.registNumber = registNumber;
	}

	@Override
	void userInfo() {
		System.out.println("이름 : " + name);
		System.out.println("메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("주민 번호 : " + registNumber);
	}

}
