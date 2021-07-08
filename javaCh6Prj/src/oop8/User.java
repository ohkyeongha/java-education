package oop8;

public class User {
	/*
	 * getter, setter
	 * 	- 클래스 내의 전역변수를 감춰주고 캡슐화하여 사용할 수 있게 해주는 역할
	 * 
	 * private : 다른 클래스에서 객체화를 통해 사용 불가능
	 * 
	 * 예 )	private String name;
	 * 		private String age;
	 * 		private String addr;
	 * 		private String email;
	 * 
	 * 		//getter
	 * 		public String getName(){
	 * 			return this.name;
	 * 		}
	 * 
	 * 		//setter
	 * 		public void setName(){
	 * 			this.name = name;
	 * 		}
	 * 		
	 * 		MainClass{
	 * 			main(){
	 * 				User user = new User();
	 * 				sysout(user.getName();
	 * 
	 * 				//user.name = "이름";
	 * 				user.setName("홍길동");
	 * 			}
	 * 		}
	 * 
	 */
	
	private String name;
	private String age;
	private String address;
	private String email;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
