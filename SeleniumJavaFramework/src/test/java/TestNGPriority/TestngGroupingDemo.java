package TestNGPriority;

import org.testng.annotations.Test;

@Test(groups = {"Allclasslevelgroups"})
public class TestngGroupingDemo {

	@Test(groups = {"sanity"})
	public void test1()
	{
		System.out.println("This is test 1");
	}
	@Test(groups = {"sanity","smoke"})
	public void test2()
	{
		System.out.println("This is test 2");
	}
	@Test(groups = {"sanity","regression"})
	public void test3()
	{
		System.out.println("This is test 3");
	}
	@Test(groups = {"scrum.regression"})
	public void test4()
	{
		System.out.println("This is test 4");
	}
	@Test(groups = {"kanban.regression"})
	public void test5()
	{
		System.out.println("This is test 5");
	}
}
