package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class lisnersTest implements ITestListener
{
public void onTestStart(ITestResult result)
{
	System.out.println("****Test started :"+result.getName());
}
public void onTestSuccess(ITestResult result)
{
	System.out.println("****Test Successful :"+result.getName());
}
public void onTestFailure(ITestResult result)
{
	System.out.println("****Test failure :"+result.getName());
}
public void onTestSkipped(ITestResult result)
{
	System.out.println("****Test Skipped :"+result.getName());
}
public void onTestFailedButWithinSuccessPercentage(ITestResult result)
{
	System.out.println("****Test Failed But Within Success Percentage :"+result.getName());
}
public void onStart(ITestContext context)
{
	
}
public void OnFinish(ITestContext context)
{
	System.out.println("****Test Finish:"+context.getName());
}

}
