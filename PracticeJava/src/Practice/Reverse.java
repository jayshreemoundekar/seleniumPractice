package Practice;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 543= 
		 * 543%10=3
		 * 543/10=54
		 * 54%10=4
		 * 54/5=5
		 */
		
		int a=546;
		int reverse=0;
		
		while(a!=0)
		{
			int digit=a%10;  //6     4
			reverse=digit+reverse*10;  //6      46
			a=a/10;   //54        
			
			
			
			
			
		}
		
		System.out.println(reverse);
		
		

	}

}
