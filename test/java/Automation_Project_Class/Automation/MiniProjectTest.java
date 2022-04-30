package Automation_Project_Class.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

public class MiniProjectTest extends BaseClass
{
	public static void main(String[] args) throws Throwable {
		//OPEN-CHROME AND PROJECT SITE
		getBrowser("Chrome");
		implicitTime(10, TimeUnit.SECONDS);
		link("http://www.automationpractice.com");
		
		//SIGN-IN
		clickOnElement(driver.findElement(By.linkText("Sign in")));
		inputValueElement(driver.findElement(By.id("email")), "project@gmail.com");
		inputValueElement(driver.findElement(By.id("passwd")), "a1b2c3");
		clickOnElement(driver.findElement(By.id("SubmitLogin")));
		
		//DRESSES & EVENING DRESSES
		actionClass("moveto", driver.findElement(By.xpath("(//a[@title='Dresses'])[2]")));
		actionClass("click", driver.findElement(By.xpath("(//a[text()='Evening Dresses'])[2]")));
		actionClass("moveto", driver.findElement(By.xpath("//img[@title='Printed Dress']")));
		
		//QUICK VIEW PAGE
		actionClass("click", driver.findElement(By.xpath("//a[@class='quick-view']")));
		frames("framebyelement", null, driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']")));
		
		//SELECTIONS
		select("selectbytext", "L", driver.findElement(By.name("group_1")));
		clickOnElement(driver.findElement(By.name("Pink")));
		clickOnElement(driver.findElement(By.id("add_to_cart")));
		frames("default", null,null);
		
		//PROCEED TO CHECKOUT
		clickOnElement(driver.findElement(By.linkText("Proceed to checkout")));
		clickOnElement(driver.findElement(By.linkText("Proceed to checkout")));
		clickOnElement(driver.findElement(By.name("processAddress")));
		clickOnElement(driver.findElement(By.id("cgv")));
		clickOnElement(driver.findElement(By.name("processCarrier")));
				
		//PAYMENT
		clickOnElement(driver.findElement(By.className("cheque")));
		clickOnElement(driver.findElement(By.xpath("(//button[@type='submit'])[2]")));
		
		scrollUpAndDown(driver.findElement(By.xpath("//p[@class='alert alert-success']")));
		
		//SCREENSHOT
		screenshot();
		
		sleep(6000);
		quit();
	}
}
