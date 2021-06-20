package test.classes;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import zerodha.classes.VerifyFund;
import zerodha.classes.kitelogin1;
import zerodha.classes.kitelogin2;
import zerodha.classes.verifylogin;

public class testclass1 {
	
@Test
public void test1()
{
	System.out.println("Test1");
}

@Test (invocationCount=2)
public void test2()
{
	System.out.println("Test2");
}




}


