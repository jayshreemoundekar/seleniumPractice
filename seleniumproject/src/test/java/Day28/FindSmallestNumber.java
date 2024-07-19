package Day28;

import java.util.Arrays;

public class FindSmallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Removing doller sign
		String price = "200";
		String[] x = price.split("$");
		String price1 = price.replace("$", "");

		System.out.println(Double.parseDouble(price1));

		
		//find smallest number
		int a[] = { 200, 4839, 400, 500 };
		Arrays.sort(a);

		/*
		 * for (int v:a) { System.out.println(v); }
		 */

		System.out.println("Smallest number:" + a[0]);
		System.out.println("$" + a[0]);

		

	}

}
