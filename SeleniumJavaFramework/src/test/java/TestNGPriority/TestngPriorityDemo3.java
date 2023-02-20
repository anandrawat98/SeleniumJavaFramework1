package TestNGPriority;

import org.testng.annotations.Test;

public class TestngPriorityDemo3 {

	@Test
	public void zoo()
	{
		System.out.println("This is Test 1");
	}
	@Test(priority =1)
	public void Apple()
	{
		System.out.println("This is Test 2");
	}
	@Test(priority =1)
	public void Test()
	{
		System.out.println("This is Test 3");
	}
}
