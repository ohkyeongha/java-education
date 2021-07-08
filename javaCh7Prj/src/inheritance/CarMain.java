package inheritance;

public class CarMain {

	public static void main(String[] args) {
		Suv suv = new Suv();
		SmallCar sc = new SmallCar();
		Sedan sd = new Sedan();
		
		suv.run();
		sc.run();
		sd.run();

	}

}
