package Automation_Project_Class.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed
{
	public WebDriver driver;
	
	@FindBy(linkText= "Proceed to checkout")private WebElement proceed1;
	@FindBy(linkText= "Proceed to checkout")private WebElement proceed2;
	@FindBy(name="processAddress")private WebElement proceed3;
	@FindBy(id="cgv")private WebElement proceed4;
	@FindBy(name="processCarrier")private WebElement proceed5;
	
	public Proceed(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getProceed1() {
		return proceed1;
	}
	public WebElement getProceed2() {
		return proceed2;
	}
	public WebElement getProceed3() {
		return proceed3;
	}
	public WebElement getProceed4() {
		return proceed4;
	}
	public WebElement getProceed5() {
		return proceed5;
	}
	
}
