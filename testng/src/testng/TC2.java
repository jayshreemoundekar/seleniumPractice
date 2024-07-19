package testng;

public class TC2 {
	
	@BeforeClass
    void beforeClass()
    {
        System.out.println("This will execute before every class");
    }
    @AfterClass
    void afterClass()
    {
        System.out.println("This will execute after every class");
    }
    @BeforeMethod
    void beforeMethod()
    {
        System.out.println("This will execute before every method");
    }
    @AfterMethod
    void afterMethod()
    {
        System.out.println("This will execute after every method");
    }
    @Test
    void test3()
    {
        System.out.println("this is test3....");
    }
    @Test
    void test4()
    {
        System.out.println("this is test4....");
    }
    @BeforeSuite
     void beforeSuit()
     {
         System.out.println("This will execute before every suit");
     }
    @AfterSuite
    void afterSuit()
    {
        System.out.println("This will execute before every suit");
    }

}
