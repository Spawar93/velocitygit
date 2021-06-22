package concepts;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablehandling {
    
	public static void main(String[] args) {
		
		int i=0, j;
		
System.setProperty("webdriver.chrome.driver", "C:\\Windows\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
		
		List<WebElement> rows =driver.findElements(By.xpath("//table[@id='customers']//tr"));
		int totalrow = rows.size();
		System.out.println(totalrow);
		
		List<WebElement> cells = rows.get(i).findElements(By.xpath("(//table[@id='customers']//tr//th)"));
		int totalcell = cells.size();
		
		System.out.println(totalcell);
		for( i=0; i<totalrow; i++)
		{
			List<WebElement> cell2 = rows.get(i).findElements(By.xpath("(//table[@id='customers']//tr["+(i+1)+"]//td)"));
			
			for( j=0; j<cell2.size(); j++)
			{
				String s = cell2.get(j).getText();
				System.out.print(s+"_   ");
			}
			System.out.println();
		}

	}

}
