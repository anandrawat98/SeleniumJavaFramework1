package TestNGPriority;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParametersDemo
{
	@Parameters({"Myname"})
	@Test
	public void test(String name)
	{
		System.out.println("My Name Is "+name);
	}
	/* @Parameters({"lastName"})
	@AfterTest
	public void test2(@Optional("Rawat") String lastName)
	{
		System.out.println("My Name Is "+lastName);
	}
	*/

}
