package flipkart.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class flipkartlogin {
	
	WebDriver driver;
	Actions a;
	
	@FindBy (xpath="(//input[@autocomplete='off'])[2]")
	private WebElement Username ;
	
	@FindBy (xpath="(//input[@autocomplete='off'])[3]")
	private WebElement password ;
	
	@FindBy (xpath="(//span[text()='Login'])[2]")
	private WebElement Login;
	
	@FindBy (xpath="//img[@title='Flipkart']")
	private WebElement logoimage;
	
	@FindBy (xpath="//div[text()='My Account']")
	private WebElement account;
	
	@FindBy (xpath="//div[text()='Logout']")
	private WebElement logout;
	
	public flipkartlogin(WebDriver driver)
	{    
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void fliplogin() throws InterruptedException
	{   
		Username.sendKeys("sunilpawar003@gmail.com");
		
		password.sendKeys("Sunil93#");
		Thread.sleep(3000);
		Login.click();
		boolean r = logoimage.isEnabled();
		System.out.println(r);
	}
	
	public void fliplogout() throws InterruptedException
	{   
		a= new Actions(driver);
		a.moveToElement(account).perform();
		Thread.sleep(3000);
		a.moveToElement(logout).click().build().perform();
		
	}
	
	
	

}
