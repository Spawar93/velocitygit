package test.classes;

import org.testng.annotations.Test;

public class testclass2 {
	
	@Test (invocationCount=3)
	public void demo1()
	{
		System.out.println("demo1");
	}

	
	@Test
	public void demo2()
	{
		System.out.println("demo2");
	}
}
