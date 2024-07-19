package Practice;

public class MultiplicationOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]  = {10, 20, 30, 40, 50, 10};
	      int sum = sumArray(a);
	      System.out.println(sum);
	      int result=multiply(5,10);
	      System.out.println(result);
	    
	     

	}

	private static int multiply(int i, int j) {
		// TODO Auto-generated method stub
		int k=1;
		int sum=0;
		while (k<=j)
		{
			sum=sum+i;
			k++;
		}
		return sum;
		
		
		
	}

	private static int sumArray(int[] a) {
		return 0;
		// TODO Auto-generated method stub
		
	}

}
