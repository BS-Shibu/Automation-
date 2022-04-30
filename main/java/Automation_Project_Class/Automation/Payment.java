package Automation_Project_Class.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment 
{
	public WebDriver driver;
	
	@FindBy(className="cheque")private WebElement cheque;
	@FindBy(xpath="(//button[@type='submit'])[2]")private WebElement checkout;
	@FindBy(xpath="//p[@class='alert alert-success']")private WebElement scrolldown;
	
	public Payment(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getCheque() {
		return cheque;
	}
	public WebElement getCheckout() {
		return checkout;
	}
	public WebElement getScrolldown() {
		return scrolldown;
	}
}
