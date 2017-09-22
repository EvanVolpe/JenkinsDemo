package firstTestNGexample;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {

	@BeforeMethod
	public void beforeMethod()
	{
	System.out.println("Im before test");
	}
	@Test
	public void firstdTest()
	{
	System.out.println("Im the before testNG test");
	}
	@BeforeTest
	public void firstTest()
	{
		System.out.println("Im the first testNG test");
	}
		
	@Test
	public void secondTest()
	{
	System.out.println("Im the first testNG test");
	}
	@AfterTest
	public void afterMethod()
	{
	System.out.println("Im after test");
	}
}


