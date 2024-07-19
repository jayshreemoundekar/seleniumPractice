package Day11;

class Abc
{
	void m1(int a)
	{
		System.out.println(a);
x`	}
	void m2 (int b)
	{
		System.out.println(b);
	}

}
class Xyz extends Abc
{
	void m1(int a) //overrided method
	{
		System.out.println(a*a);
	}
	
	void m2(int a, int b)  //overloaded method
	
	{
		  System.out.println(a+b);
		 
	}
}
public class OverridingVSOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Xyz xyzobj = new Xyz();
		xyzobj.m1(0);
		xyzobj.m2(0);
		xyzobj.m2(0, 0);

	}
}

