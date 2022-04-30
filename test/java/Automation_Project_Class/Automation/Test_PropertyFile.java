package Automation_Project_Class.Automation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Propertyfile.FileReaderManager;

public class Test_PropertyFile extends BaseClass
{
	public static WebDriver driver = getBrowser("chrome");
	public static PageObjectManager pom = new PageObjectManager(driver);
	
	public static void main(String[] args) throws Throwable 
	{
		implicitTime(10, TimeUnit.SECONDS);
		String url = FileReaderManager.getInstanceFRM().getInstanceCR().geturl();
		link(url);
		
		//SIGNIN PAGE
		clickOnElement(pom.getSigninPage().getSignin());
		
		//LOGIN PAGE
		String username = FileReaderManager.getInstanceFRM().getInstanceCR().getUsername();
		inputValueElement(pom.getLoginPage().getEmail(), username);
		String password = FileReaderManager.getInstanceFRM().getInstanceCR().getPassword();
		inputValueElement(pom.getLoginPage().getPassword(),password);
		clickOnElement(pom.getLoginPage().getLogin());
		
		//MYACCOUNT PAGE
		actionClass("moveto", pom.getMyAccountPage().getDresses());
		actionClass("click", pom.getMyAccountPage().getEveningDresses());
		
		//EVENING DRESSES PAGE
		actionClass("moveto", pom.getEveningDressesPage().getPrintedDress());
		actionClass("click", pom.getEveningDressesPage().getQuickview());
		
		frames("framebyelement", null, pom.getEveningDressesPage().getFrame());
		
		//SELECTION PAGE
		select("selectbytext", "L", pom.getSelectionPage().getLarge());
		clickOnElement(pom.getSelectionPage().getPink());
		clickOnElement(pom.getSelectionPage().getAddtocart());
		
		frames("default", null, null);
		
		//PROCEED PAGES
		clickOnElement(pom.getProceedPage().getProceed1());
		clickOnElement(pom.getProceedPage().getProceed2());
		clickOnElement(pom.getProceedPage().getProceed3());
		clickOnElement(pom.getProceedPage().getProceed4());
		clickOnElement(pom.getProceedPage().getProceed5());
		
		//PAYMENT PAGE
		clickOnElement(pom.getPaymentPage().getCheque());
		clickOnElement(pom.getPaymentPage().getCheckout());
		
		scrollUpAndDown(pom.getPaymentPage().getScrolldown());
		
		screenshot();
		
		//SIGNOUT PAGE
		clickOnElement(pom.getSignoutPage().getSignout());
		
		
		sleep(5000);
		quit();
		
	}
}
