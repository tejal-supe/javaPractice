package oopLearning;

import encapsulation.EncapsulationIntro;

public class oopsPractise {

	public static void main(String[] args) { //args is just variable name which can be named as anything
		// TODO Auto-generated method stub
		Person p1= new Person(); //default constructor 
		Person p2= new Person(24,"tejwwwwu");
		p1.name = "Tejal";
		p1.age=23;
//		p2.name="Teju";
//		p2.age=24;
//		
		Developer d1 = new Developer(24,"tejaa");
		System.out.println(p1.name + " " + p1.age + " " + p2.name);
		p1.walk();
		p2.eat();
		p1.walk(6000);
		System.out.println(Person.count);
		System.out.println(d1.name + " is a developer");
		d1.walk();
	EncapsulationIntro e1 =new EncapsulationIntro();
	e1.doWork();

	}

}
class Developer extends Person{
	public Developer(int age , String name) {
		super(age,name); //used to call parents class constructor
	}
	void walk() {
		System.out.println("Developer " +name + " is walking down the stairs!!"); // run time polymorphism as the compiler does
//		not know which class have the walk()
	}
}

class Person{
	//properties
	String name; //property of an object
	int age;
	static int count ; //static indicates it is a property of class and not object
	// consructor 
	
	public Person(){
		count++;
		System.out.println("This is a constructor!!");
	}
//	public Person(int newAge, String newName) {
//		this();
//		name = newName;
//		age = newAge;
//	}
	public Person(int age, String name) {
		this();
		this.name = name;
		this.age = age;
	}
	//behavior
	void walk() {
		System.out.println(name + " is walking down the street!!");
	}
	void eat() {
		System.out.println(name + " is having his meal");
	}
	void walk(int steps) {
		System.out.println(name + " walked " + steps + " steps");
	}
}


//Classes and objects
/* Only one public class in java file with name of the class same as the file name
 * Class does not have run on its own . It needs its object created to run. Objects are assigned memory at run-time. 
 * We can create multiple objects for the same class .
 * 
 * Ploymorphism - same name different arguments = two types (compile time and run time)
 * 
 * Constructor - After new keyword we call a constructor. If no constructor is defined then java gives us a default 
 * constructor. Constructors are used to create new objects.
 * 
 * 
 * This keyword - for calling one constructor from another constructor from the same class this keyword is used. and also to assign the values
 *  to the properties/variables of the same class having the same name.
 *  
 *   Inheritance - super keyword - to call constructor of the parent class in child class super keyword is used.
 *   
 * In java the - all the objects have Object class as their parent (super parent)
 * 
 * 
 * Encapsulation  - Data hiding / data security reasons.
 * 				- Packages and Access modifiers ->public - access to all
 * private -> access in the same class only
 * default -> access in same pacakge
 * protected - >access to parent and its childers only.
 * 
 * Abstraction - data hiding due to complexity
 * 
 * Java does not allow multiple inheritance. It can have multi-level parents
 * */
 