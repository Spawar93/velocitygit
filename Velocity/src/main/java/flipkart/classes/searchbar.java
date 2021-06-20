package flipkart.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchbar {
	
	WebDriver driver;
	
	@FindBy (xpath="//input[@placeholder='Search for products, brands and more']")
	private WebElement search;
	
	//@FindBy (xpath="//button[@class='_2KpZ6l _2doB4z']")
	//private WebElement cut;
	
	@FindBy (xpath="//button[@type='submit']")
	private WebElement submitbutton;
	
	public searchbar(WebDriver driver)
	{     this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	public void searchmethod()
	{    boolean x= search.isEnabled();
	 if(x==true)
	 {
		search.sendKeys("Vivo V15");
	 }
	 else
	 {
		System.out.println("search is not enabled");
	 }
	}

	public void submitmethod()
	{
		submitbutton.click();
	}
	public String backtohomepage()
	{
		driver.navigate().back();
		String url= driver.getCurrentUrl();
	    return url;
	}
	
	
}
