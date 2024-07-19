package Day10;

public class StaticExample {	
	
	static int a =10; //static variable
	int b=20; //non static
	
	static void m1()
	{
		System.out.println("this is m1 static method.");
	}
	void m2()
	{
		System.out.println("this is m2 non static method.");
	}
	
	void m() //non static
	{
		 System.out.println(a);
		 System.out.println(b);
		 m1();
		 m2();
		 
	}
	
	
	

	/*public static void main(String[] args) {
		
		System.out.println(a);
		//System.out.println(b); //b is not static
		m1();
		//m2(); non static method
		
		StaticExample se = new StaticExample();
		 System.out.println(se.b);
		 se.m2();

	}*/

}
