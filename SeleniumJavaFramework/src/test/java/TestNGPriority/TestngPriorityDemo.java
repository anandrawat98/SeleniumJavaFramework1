package TestNGPriority;

import org.testng.annotations.Test;

public class TestngPriorityDemo {

	@Test(priority =1)
	public void zoo()
	{
		System.out.println("This is Test 1");
	}
	@Test(priority =1)
	public void Ran()
	{
		System.out.println("This is Test 2");
	}
	@Test(priority =1)
	public void Test()
	{
		System.out.println("This is Test 3");
	}
}
