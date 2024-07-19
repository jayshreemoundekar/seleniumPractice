package Day10;

public class StaticMain {
	
public static void main(String[] args) {
		
		System.out.println(StaticExample.a);
		//System.out.println(b); //b is not static
		StaticExample.m1();
		//m2(); non static method
		
		StaticExample se = new StaticExample();
		System.out.println(se.b);
		se.m2();

	}
	

}
