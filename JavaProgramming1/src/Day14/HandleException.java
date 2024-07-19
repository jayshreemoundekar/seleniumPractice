package Day14;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		//example
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int num=sc.nextInt();
		try {
		System.out.println(100/num); //Arithmetic expression
		}
		catch(ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println("you have entered invalid input");
			e.getMessage();
		}
		System.out.println("Program is completed");
		System.out.println("program is exited");

	}

}
