package Automation_Project_Class.Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EveningDresses
{
	public WebDriver driver;
	
	@FindBy(xpath="//img[@title='Printed Dress']")private WebElement PrintedDress;
	@FindBy(xpath="//a[@class='quick-view']")private WebElement Quickview;
	@FindBy(xpath="//iframe[@class='fancybox-iframe']")private WebElement Frame;
	
	
	public EveningDresses(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	public WebElement getPrintedDress() {
		return PrintedDress;
	}
	public WebElement getQuickview() {
		return Quickview;
	}
	public WebElement getFrame() {
		return Frame;
	}
	
}
