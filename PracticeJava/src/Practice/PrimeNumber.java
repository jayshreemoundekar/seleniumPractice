package Practice;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int val=13;
		
		boolean flag = false;
		for(int i=2;i<=val/2;i++)
		{
			if(val%i==0)
			{
				flag= true;
				
				break;
				
				
			}
		}
		
		
		if(flag)
		{
			System.out.println("it is not prime");
		}
		
		else
		{
			System.out.println("it is prime");
		}

	}

}
