package Day9;

public class MethodOverloading {
	int x, y, z;
	double d;

	void sum() // 1
	{
		x = 10;
		y = 20;
		System.out.println(x + y);
	}

	void sum(int a, int b) // 2
	{
		x = 10;
		y = 20;
		System.out.println(x + y);
	}

	void sum(int a, double b) // 3
	{
		x = 10;
		y = 20;
		System.out.println(x + y);
	}

	void sum(double b, int a) // 4
	{
		x = 10;
		y = 20;
		System.out.println(x + y);
	}

	public static void main(String[] args) {

		MethodOverloading mo = new MethodOverloading();
		mo.sum();  //1
		mo.sum(100, 200);  //2
		mo.sum(10.5, 50); //4
		mo.sum(71.6, 584); //3
		

	}

}
