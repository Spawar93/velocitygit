    package concepts;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Random;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class screenshot {   
	
	static WebDriver driver;
	
	public static void capture() throws IOException
	{  
	  
	   for(int i=101; i<=103; i++)
	   {
	   Date d = new Date();
	   String name= d.toString().replace(':', '_').replace('-', '_');
	   File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
       File dest= new File("D:\\Software Testing\\screenshot"+i+name+".jpg");
	   FileHandler.copy(source, dest);
	   }
	    
	}
	public static void main(String[] args) throws IOException, InterruptedException {
	
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software Testing\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
		driver.manage().window().maximize();
		
		capture();
		Thread.sleep(5000);
		
	/*	for(int i=101; i<=103; i++)
		{
			Date d = new Date();
			String name= d.toString().replace(':', '_').replace('-', '_');
		
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest= new File("D:\\screenshot\\Test"+i+name+".jpg");
		FileHandler.copy(source, dest);
       }    */
		
		driver.close();

	}

}
