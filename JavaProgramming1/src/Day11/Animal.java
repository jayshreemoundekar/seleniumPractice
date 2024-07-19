package Day11;


public class Animal {
	
String 	colour="white";
	
	void eat()
	{
		System.out.println("eating...");
	}
}
class Dog extends Animal
{
	
	String colour ="black";
	
	void displaycolour()
	{
		System.out.println(super.colour);
	}
	
	void eat()
	{
		System.out.println("eating bread");
		super.eat();
	}
}
