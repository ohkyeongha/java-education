package polymorphism;

public class Driver {
	
	void drive(Car car) {	//참조변수로 매개변수를 받을 수 있다.
		car.run();
	}
	
	public static void main(String[] args) {
		Driver driver = new Driver();
		Bus bus = new Bus();		
		Taxi taxi = new Taxi();
		Truck truck = new Truck();
		
		driver.drive(bus);
		driver.drive(taxi);
		driver.drive(truck);
		
		//다형성
		Car car  = new Car();
		Car car1 = new Bus();
		Car car2 = new Taxi();
		Car car3 = new Truck();
		
		car.run();
		car1.run();
		car2.run();
		car3.run();
		
	}
}
