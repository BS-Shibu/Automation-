package Automation_Project_Class.Automation;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BassClass_Test extends BaseClass
{
	public static void main(String[] args) throws Throwable
	{
		//LOGIN
		getBrowser("chrome");
		implicitTime(20, TimeUnit.SECONDS);
		link("http://automationpractice.com");
		clickOnElement(driver.findElement(By.className("login")));
		inputValueElement(driver.findElement(By.id("email")), "project@gmail.com");
		inputValueElement(driver.findElement(By.id("passwd")), "a1b2c3");
		clickOnElement(driver.findElement(By.id("SubmitLogin")));
		
		Actions ac = new Actions(driver);
		
		//Dresses & Evening Dresses
		WebElement dresses = driver.findElement(By.xpath("(//a[@title='Dresses'])[2]"));
		ac.moveToElement(dresses).build().perform();
		clickOnElement(driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]")));
		
		WebElement img = driver.findElement(By.xpath("//img[@title='Printed Dress']"));
		ac.moveToElement(img).build().perform();
		
		
		//Quick view page
		WebElement quickView = driver.findElement(By.linkText("Quick view"));
		ac.click(quickView).build().perform();

		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		driver.switchTo().frame(frame);
				
		//Select Options
		WebElement size = driver.findElement(By.name("group_1"));
		Select s = new Select(size);
		s.selectByVisibleText("L");
				
		clickOnElement(driver.findElement(By.name("Pink")));
		
		clickOnElement(driver.findElement(By.id("add_to_cart")));
		driver.switchTo().defaultContent();
		
		//Proceed to checkout
		clickOnElement(driver.findElement(By.linkText("Proceed to checkout")));
		
		clickOnElement(driver.findElement(By.linkText("Proceed to checkout")));
		
		clickOnElement(driver.findElement(By.name("processAddress")));
		
		clickOnElement(driver.findElement(By.id("cgv")));
		
		clickOnElement(driver.findElement(By.name("processCarrier")));
		
		//Payment
		clickOnElement(driver.findElement(By.className("cheque")));
		
		clickOnElement(driver.findElement(By.xpath("(//button[@type='submit'])[2]")));
		
		//Scroll down to result
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement myStore = driver.findElement(By.xpath("//p[@class='alert alert-success']"));
		js.executeScript("arguments[0].scrollIntoView()", myStore);
		
		//Screenshot
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Training\\Screenshot\\Miniproject.png");
		FileHandler.copy(source, destination);
		
		sleep(5000);
		quit();
	}
}
