package Day14;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("program is started");
		System.out.println("program is in progress");
		/*
		 * try { Thread.sleep(5000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		Thread.sleep(5000);
		System.out.println("program is finish");
		System.out.println("program is terminated");

	}

}
