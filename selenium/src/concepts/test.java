package concepts;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANDY\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	
		//driver.get("https://www.udemy.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		driver.navigate().to("https://www.udemy.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle()); 
	
	Dimension d = new Dimension(400,700); 
	   
       driver.manage().window().setSize(d);
       Thread.sleep(2000);
	   Point p = new Point(0,-200);
	         driver.manage().window().setPosition(p);
	   

	}
	

}


   