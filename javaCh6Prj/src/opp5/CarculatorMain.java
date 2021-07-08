package opp5;

public class CarculatorMain {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		double result1 = cal.add(10.0, 10.8);
		float result2 = cal.add(36.5f, 55.9f);
		int result3 = cal.add(10, 30);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);

	}

}
