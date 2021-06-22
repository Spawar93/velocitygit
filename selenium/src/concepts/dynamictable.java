package concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamictable {

	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/table.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> row= driver.findElements(By.xpath("//table[@cellspacing='1']//tbody//tr"));
		 int a= row.size();
		System.out.println("no. of rows="+a);
		// webelements for each rows
		List<WebElement> cell1= driver.findElements(By.xpath("//table[@cellspacing='1']//tbody//tr[1]//td"));
		
		    int b= cell1.size();
			System.out.println("no. of max cells="+b);
			
			for(int i=0; i<a; i++)
				
			{   // webelements for each cells
				List<WebElement> cell2 = driver.findElements(By.xpath("//table[@cellspacing='1']//tbody//tr["+(i+1)+"]//td"));
				 int c= cell2.size();
				for(int j=0; j<c; j++)
				{
					String s = cell2.get(j).getText();
					System.out.print(s+"  ");
				}
				System.out.println();
			}
		

	}

}
