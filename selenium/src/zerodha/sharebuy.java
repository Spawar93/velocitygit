package zerodha;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class sharebuy extends login {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SANDY\\Desktop\\chromedriver\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.get("https://kite.zerodha.com");
		driver.manage().window().maximize();

		sharebuy.loginmethod();
		// To manage notifactions
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		Thread.sleep(2000);
		WebElement Auto = driver.findElement(By.xpath("//li[@data-balloon='Auto']"));

		Auto.click();
		Thread.sleep(2000);     
		Actions a = new Actions(driver);

		JavascriptExecutor x = ((JavascriptExecutor) driver);

		WebElement MOTHERSUMI = driver.findElement(By.xpath("//span[text()='MOTHERSUMI']"));
		x.executeScript("arguments[0].scrollIntoView(true);", MOTHERSUMI);
		a.moveToElement(MOTHERSUMI).click().build().perform();

		Thread.sleep(2000);
		WebElement buy = driver.findElement(By.xpath("//button[@class='button-blue buy']"));
		a.click(buy).perform();

		WebElement amo = driver.findElement(By.xpath("//label[text()='AMO']"));
		amo.click();

		Thread.sleep(8000);
		driver.equals(driver);
	}

}
