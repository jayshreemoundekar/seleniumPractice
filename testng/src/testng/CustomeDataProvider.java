package testng;

public class CustomeDataProvider {
	@Test
    @DataProvider(name="LogInDataProvider")
    public Object[][] getData()
    {
        Object[][] data = {{"abc@gmail.com","abc" },{"xyz@gmail.com","xyz"}, {"mno@gmail.com","mno"},};
        return data;

    }

}
