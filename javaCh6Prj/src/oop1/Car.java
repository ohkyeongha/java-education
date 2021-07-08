package oop1;

public class Car {
	String brand = "Hyundai";
	String carName = "Grandeur";
	int engin = 3000;
	String gear = "Auto";
	
	//자동차 시동을 거는 메소드
	void doStartUP() {
		System.out.println(carName + " 시동이 걸립니다.");
	}
	
	void accelator() {
		System.out.println(carName + " 차가 움직입니다.");
	}
	
	void carBreak() {
		System.out.println(carName + " 차가 멈춥니다");
	}
	
	String carInfo(String inBrand, String inCarName, int inEngin, String inGear) {
//		System.out.println(brand);
//		System.out.println(carName);
//		System.out.println(engin);
//		System.out.println(gear);
		
		String info = inBrand + "\t" + inCarName +"\t" + inEngin + "\t" + inGear; 
//		String info = brand + "," + carName +",\t" + engin + ",\t" + gear; 
		
		return info;
	}
}
