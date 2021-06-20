package flipkart.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class fashiontab {
	
	WebDriver driver;
	Actions a;
	
	@FindBy (xpath="//div[text()='Fashion']")
	private WebElement fashion ;
	@FindBy (xpath="(//a[@class='_6WOcW9'])[5]")
	private WebElement  womenfootwear ;
	
	
	public fashiontab(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	public void verityfashion() throws InterruptedException
	{   
	    a= new Actions(driver);
		a.moveToElement(fashion).perform();
		Thread.sleep(3000);
		a.moveToElement(womenfootwear).click().build().perform();
		
	}
	public String backtohomepage()
	{
		driver.navigate().back();
		String url= driver.getCurrentUrl();
	    return url;
	}
	
	
	

}
