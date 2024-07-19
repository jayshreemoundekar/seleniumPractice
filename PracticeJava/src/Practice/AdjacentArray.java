package Practice;

public class AdjacentArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// max difference between any adjacent index

		int[] a = {1,5,78,5,87};
		
		int diff =0;
		for(int i=0;i<a.length-1;i++)
		{
			if( a[i+1]-a[i]>diff )
			{
				
				diff =a[i+1]-a[i];
			}
				
		}
		
		System.out.println(diff);
		

	}

}
