package Automation_Project_Class.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Signout 
{
	public WebDriver driver;
	
	@FindBy(className="logout")private WebElement Signout;

	public Signout(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignout() {
		return Signout;
	}
}
