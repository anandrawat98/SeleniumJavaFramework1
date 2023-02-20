package TestNGPriority;

import org.testng.annotations.Test;

public class TestNGDependances 
{
	@Test(dependsOnMethods = {"test2"},priority=2)
	public void test1()
	{
		System.out.println("This is test 1 scrum");
	}
	@Test
	public void test2()
	{
		System.out.println("This is test2 kanban");
	}
	@Test(priority=1)
	public void test3()
	{
		System.out.println("This is test3 test");
	}
}
