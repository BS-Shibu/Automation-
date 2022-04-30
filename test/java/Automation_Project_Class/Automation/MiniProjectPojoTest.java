package Automation_Project_Class.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class MiniProjectPojoTest extends BaseClass
{	public static WebDriver driver = getBrowser("chrome");
	public static Signin si = new Signin(driver);
	public static Login li = new Login(driver);
	public static MyAccount ma = new MyAccount(driver);
	public static EveningDresses ed = new EveningDresses(driver);
	public static Selection se =new Selection(driver);
	public static Proceed pr =new Proceed(driver);
	public static Payment py =new Payment (driver);
	
	public static void main(String[] args) throws Throwable {
		implicitTime(10, TimeUnit.SECONDS);
		link("http://www.automationpractice.com");
		
		//SIGNIN CLASS
		clickOnElement(si.getSignin());
		
		//LOGIN CLASS
		inputValueElement(li.getEmail(), "project@gmail.com");
		inputValueElement(li.getPassword(), "a1b2c3");
		clickOnElement(li.getLogin());
		
		//MYACCOUNT CLASS
		actionClass("moveto", ma.getDresses());
		actionClass("click", ma.getEveningDresses());
		
		//EVENINGDRESSES CLASS
		sleep(3000);
		actionClass("moveto", ed.getPrintedDress());
		actionClass("click", ed.getQuickview());
		
		frames("framebyelement", null, ed.getFrame());
		
		//SELECTION CLASS
		select("selectbytext", "L", se.getLarge());
		clickOnElement(se.getPink());
		clickOnElement(se.getAddtocart());
		
		frames("default", null, null);
		
		//PROCEED CLASS
		clickOnElement(pr.getProceed1());
		clickOnElement(pr.getProceed2());
		clickOnElement(pr.getProceed3());
		clickOnElement(pr.getProceed4());
		clickOnElement(pr.getProceed5());
		
		//PAYMENT CLASS
		clickOnElement(py.getCheque());
		clickOnElement(py.getCheckout());
		
		scrollUpAndDown(py.getScrolldown());
		
		//SCREENSHOT
		screenshot();
		
		sleep(6000);
		quit();
		
	}
}
