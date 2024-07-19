package Day14;

public class FinallyBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("Enter a number");
		 */

		System.out.println("program is started");
		System.out.println("program is in progress");

		String s = null;

		try {
			System.out.println(s.length()); // Arithmetic expression
		} catch (ArithmeticException e) {
			System.out.println("Exception occured .....handles");
		}

		finally {
			System.out.println("Entered into finally block");
		}
		System.out.println("program is completed");
		System.out.println("program is exited");

	}
}
