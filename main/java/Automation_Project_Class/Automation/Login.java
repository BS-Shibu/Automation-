package Automation_Project_Class.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	public WebDriver driver;
	
	@FindBy(id="email") private WebElement email;
	@FindBy(id="passwd")private WebElement password;
	@FindBy(id="SubmitLogin")private WebElement login;
	
	public Login(WebDriver driver2) {
		this.driver =driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getEmail() {
		return email;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
}
