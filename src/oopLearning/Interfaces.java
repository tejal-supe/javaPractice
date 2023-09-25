package oopLearning;

public class Interfaces implements Cars , Persons{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Started!!");
		
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println("Lets tranform and start walking!");
	}

}
//they provide true absctraction

interface Cars{ 
	void start(); //by default public and abstract
}

interface Persons{
	void walk();
}