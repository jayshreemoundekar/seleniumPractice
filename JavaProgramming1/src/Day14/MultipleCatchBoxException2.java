package Day14;

import java.util.Scanner;

public class MultipleCatchBoxException2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*System.out.println("Program is started");
		System.out.println("Program is in progress");*/
		
		//example
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		
		String s =null;
		 System.out.println(s.length());
		
		
		/*try {
		System.out.println(100/num); //Arithmetic expression
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("you have entered invalid input");
			e.getMessage();
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number format exception thrown");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception thrown");
		}*/
		 
		 try
		 {
			  System.out.println(100/num);
			 System.out.println(s.length()); 
			 
		 }
		 catch(Exception e)
		 {
			 System.out.println("exception thrown");
		 }
		 
		 System.out.println("program is completed....");
		 System.out.println("[rogram is exited....");
		 
		 
		 
		 
		

	}

}
