package abs;

public abstract class User {
	/*
	 * 추상클래스 - 추상메소드 하나 이상 포함된 클래스
	 *  - 설계도 개념
	 *  - 일반메소드 선언 가능
	 *  - 전역변수 선언 가능
	 *  - 다중상속 불가능
	 *  - 객체화 불가능
	 *  
	 * 
	 *  예) abstract class 클래스명{}
	 * 
	 * 추상메소드
	 *  - 실행부(구현부)가 없고, 선언부만 있는 메소드
	 * 
	 *  예) abstract 반환타입 메소드명(매개변수);
	 *   * {실행문} 없음
	 *   
	 */
	
	protected String name;	//상속받은 애들은 쓸 수 있게 한다.
	protected String email;
	protected String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	void login() {
		System.out.println("유저가 로그인");
	}
	
	abstract void userInfo()
//	{
//		System.out.println("이름 : " + name);
//		System.out.println("메일 : " + email);
//		System.out.println("주소 : " + address);
//	}
	;
}
