package oop3;

public class Computer {
	/*
	 * 속성 : cpu, ram, ssd, graphicCard, power
	 * 기능 : game, movie, internet
	 */
	
	String cpu = "";
	int ram = 0;
	int ssd = 0;
	String graphicCard = "";
	boolean power = false ;
	String lanCard = "";
	
	void power() {
		System.out.println("컴퓨터 : 전원 ON");
	}
	void game() {
		System.out.println("컴퓨터 : 게임 실행중");
	}
	void movie() {
		System.out.println("컴퓨터 : 영화 재생중");
		
	}
	void internet() {
		System.out.println("컴퓨터 : 인터넷 실행중");
		
	}
	
}
