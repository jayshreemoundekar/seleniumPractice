package Day9;

public class ConstructorOverloading {
	int x, y;
	double d;
	
	ConstructorOverloading()
	{
		x=10;
		y=20;
	}
	ConstructorOverloading(int a,int b)
	{
		x=10;
		y=20;
	}
	
	ConstructorOverloading(int a,double b)
	{
		x=10;
		y=20;
	}
	
	ConstructorOverloading(double a,int b)
	{
		x=10;
		y=20;
	}
	ConstructorOverloading(double a,double b)
	{
		x=10;
		y=20;
	}
	void display()
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}
	
	
	

	public static void main(String[] args) {
		ConstructorOverloading co=new ConstructorOverloading(1,2);
		co.display();
		

	}
	
}
