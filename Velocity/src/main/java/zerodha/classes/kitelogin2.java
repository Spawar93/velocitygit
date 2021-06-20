package zerodha.classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class kitelogin2 {

	// kite pin and submit
	@FindBy(xpath = "//input[@id='pin']")
	private WebElement pin;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitbutton;

	// intialize the webelements
	public kitelogin2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// type kitepin
	public void Kitepin() throws InterruptedException {
		Thread.sleep(2000);
		pin.sendKeys("260493");
	}

	// click submit button
	 public void Kitesubmit() {
		submitbutton.click();
	}

}
