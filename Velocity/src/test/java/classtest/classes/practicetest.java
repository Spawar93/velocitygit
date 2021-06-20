    package classtest.classes;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class practicetest {
	
	SoftAssert x = new SoftAssert();
	
	@BeforeSuite
	public void beforesuit()
	{
		System.out.println("excel sheet file open");
	}
	
	@BeforeTest
	public void beforetest()
	{
		System.out.println("before test");
	}
	
	@BeforeClass
	public void beforeclass()
	{
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("Before method");
	}
	
	@Test
	public void Test1()
	{
		System.out.println("test 1");
		Assert.assertEquals("test 1","test 1");
	    x.assertNotEquals("test 1","test 2");
	    System.out.println("pass");
	}
	
	@Test
	public void Test2()
	{
		System.out.println("test 2   ");
		Assert.assertEquals("Hii","Hii");
		x.assertNotEquals("hello", "Hii");
		String s ="Welcome";
		Boolean b = s.contentEquals("ab");
		x.assertTrue(b, "welcome verified");
		System.out.println("pass");
	}
	
	

	@AfterMethod
	public void aftermethod()
	{
		System.out.println("after method");
	}
	
	
	
	
	
	@AfterClass
	public void afterclass()
	{
		System.out.println("Before class");
	}
	
	
	@AfterTest
	public void aftertest()
	{
		System.out.println("after test");
	}
	
	@AfterSuite
	public void aftersuit()
	{
		System.out.println("excel sheet file close");
	}

}
