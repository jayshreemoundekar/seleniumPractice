package testng;

public class FirstClass {
	  @Test(priority = 1)

	    void setup()
	    {
	        System.out.println("Setting up First Class");
	    }
	    @Test(priority = 2)
	     void login()
	    {
	        System.out.println("This is login Test");
	    }
	@Test(priority = 3)
	    void teardown()
	    {
	        System.out.println("Closing browser");
	    }

}
