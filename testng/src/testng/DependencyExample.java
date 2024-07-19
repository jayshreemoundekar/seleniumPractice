package testng;

public class DependencyExample {
	@Test
    void startCar()
    {
        System.out.println("Car Started");
        Assert.fail();

    }
    @Test(dependsOnMethods = {"startCar"})
    void driveCar()
    {
        System.out.println("Car driving");

    }
    @Test(dependsOnMethods = "driveCar")
    void stopCar()
    {
        System.out.println("Car Stopped");

    }
    @Test(dependsOnMethods = {"driveCar","stopCar"},alwaysRun = true)
    void parkCar()
    {
        System.out.println("Car parked");

    }

}
