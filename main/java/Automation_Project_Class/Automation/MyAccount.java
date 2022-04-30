package Automation_Project_Class.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount 
{
	public WebDriver driver;
	
	@FindBy(xpath="(//a[@title='Dresses'])[2]")private WebElement Dresses;
	@FindBy(xpath="(//a[text()='Evening Dresses'])[2]")private WebElement EveningDresses;
	
	public MyAccount(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getDresses() {
		return Dresses;
	}
	public WebElement getEveningDresses() {
		return EveningDresses;
	}
}
