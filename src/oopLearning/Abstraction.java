package oopLearning;

public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c1 = new Car();
		Audi a1 = new Audi();
		a1.start();

	}

}
class Audi extends Car{

	@Override
	void start() {
		// TODO Auto-generated method stub
		System.out.println("Audi is starting");
		
	}
	
}
class BMW extends Car{
	void start() {
		// TODO Auto-generated method stub
		System.out.println("BMW is starting");
		
	}
	
}
abstract class Car{ //car is concept - can be of different types/brands there is not point of creating object of CAR
//	String brand;
	int price;
	
	abstract void start();
	
	void breaks() {
		System.out.println("Breaks are applied");
	}
}