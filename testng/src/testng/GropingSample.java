package testng;

public class GropingSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 @Test (groups = {"Sanity"})
		    void test1()
		    {
		        System.out.println("This is test1");
		    }
		    @Test(groups = {"regression"})
		    void test2()
		    {
		        System.out.println("This is test2");
		    }
		    @Test(groups = {"Sanity"})
		    void test3()
		    {
		        System.out.println("This is test3");
		    }
		    @Test(groups = {"regression"})
		    void test4()
		    {
		        System.out.println("This is test4");
		    }
		    @Test(groups = {"Sanity","regression"})
		    void test5()
		    {
		        System.out.println("This is test5");
		    }

	}

}
