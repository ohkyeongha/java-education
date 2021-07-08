package abs;

public class Guest extends User{
	private String nickName;
	
	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	@Override
	void userInfo() {
		System.out.println("이름 : " + name);
		System.out.println("메일 : " + email);
		System.out.println("주소 : " + address);
		System.out.println("닉네임 : " + nickName);
	}

}
