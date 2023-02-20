package TestNGPriority;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class TestNGIgnoreTest 
{
	@Ignore
	@Test
	public void ignoretest()
	{
		System.out.println("This is ignore test");
	}
	@Test
	public void test1()
	{
		System.out.println("This is actual test");
	}
}
