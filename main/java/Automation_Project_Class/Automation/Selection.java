package Automation_Project_Class.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selection 
{
	public WebDriver driver;
	
	@FindBy(name="group_1")private WebElement Large;
	@FindBy(name="Pink")private WebElement Pink;
	@FindBy(id="add_to_cart")private WebElement addtocart;
	
	public Selection(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getLarge() {
		return Large;
	}
	public WebElement getPink() {
		return Pink;
	}
	public WebElement getAddtocart() {
		return addtocart;
	}
	
}
