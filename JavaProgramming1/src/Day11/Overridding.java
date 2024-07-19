package Day11;

class Bank
{
	double roi()
	{
		return 0.0;
	}
}
class ICICI extends Bank
{
	double roi()
	{
		return 10.0;
	}
}
class Axis extends Bank
{
	double roi()
	{
		return 100.0;
	}
}

public class Overridding {

	public static void main(String[] args) {
		
		ICICI iciciobj= new ICICI();
		System.out.println(iciciobj.roi());
		
		Bank bn= new Bank();
		System.out.println(bn.roi());
		
		Axis axisobj = new Axis();
		
	}

}
