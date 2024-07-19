package Practice;

public class ReverseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s="Jayshree";
		String t="";
		for(int i=s.length()-1;i>=0;i--)
		{
			t=t+s.charAt(i);
		}
		
		System.out.println(t);
		
		if(s==t)
		{
			System.out.println("It is palindrome");
			
		}
		
		else {
			System.out.println("it is not palindrome");
		}

	}

}
