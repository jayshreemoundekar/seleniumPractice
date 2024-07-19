package Day12;

interface Shape {
	int Lenght = 10; // final & static
	int width = 20; // final & static

	void circle(); // abstract method un-implemented

	default void square() // default method
	{
		System.out.println("this is square default method ");
	}

	static void rectangle() {
		System.out.println("this is rectangle");
	}
}

public class InheritenceDemo implements Shape {

	public void circle() {
		System.out.println("this is circle");
	}

	public static void main(String[] args) {

		InheritenceDemo id = new InheritenceDemo();
		id.circle();
		id.square();
		Shape.rectangle();

		Shape sh = new InheritenceDemo();
		sh.square();
		sh.circle();
		

	}

}
