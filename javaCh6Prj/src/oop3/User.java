package oop3;

public class User {
	/*
	 * 속성 : name, age, gender
	 * 기능 : 컴퓨터 전원 켜기, 모니터 전원 켜기, 게임하기, 영화보기, 인터넷하기
	 * 
	 */
	
	String name = "";
	int age = 0;
	char gender;
	
	void pcPowerOn() {
		System.out.println("컴퓨터 전원을 킨다.");
		
		Computer com1 = new Computer();
		com1.power();
		
	}
	void monitorPowerOn() {
		System.out.println("모니터 전원을 킨다.");
	}
	void pcGame() {
		System.out.println("컴퓨터 게임을 한다.");
	}
	void pcMovie() {
		System.out.println("컴퓨터 영화를 본다.");
	}
	void pcInternet() {
		System.out.println("컴퓨터 인터넷을 한다.");
	}
}
