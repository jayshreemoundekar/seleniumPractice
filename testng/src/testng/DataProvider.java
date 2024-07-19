package testng;

public class DataProvider {
	 @Test(dataProvider = "LogInDataProvider",dataProviderClass = CustomeDataProvider.class)
	    
	 public void loginTest(String email, String password)
	    {
	        System.out.println(email+" "+password);
	    }

}
