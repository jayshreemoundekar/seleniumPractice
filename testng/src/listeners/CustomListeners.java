package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {
	public void onStart(ITestContext arg) {
        System.out.println("Test Execution Started"+ arg.getName());
    }


    public void onFinish(ITestContext arg) {
        System.out.println("Test Execution Finished"+ arg.getName());
    }

    public void onTestStart(ITestContext arg) {
        System.out.println("Test Execution start"+ arg.getName());
    }

    public void onTestSkipped(ITestContext arg) {
        System.out.println("Test Execution skipp"+ arg.getName());
    }

    public void onTestSuccess(ITestResult arg) {
        System.out.println("Test Execution Success"+ arg.getName());
    }
    public void onTestFailure(ITestResult arg) {
        System.out.println("Test Execution Failure"+ arg.getName());
    }
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg) {
        System.out.println("Test Execution FailedButWithinSuccessPercentage"+ arg.getName());
    }


}
