package Automation_Project_Class.Automation;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public WebDriver driver;
	
	private Signin si;
	private Login li;
	private MyAccount ma;
	private EveningDresses ed;
	private Selection se;
	private Proceed pr;
	private Payment py;
	private Signout so;
	
	public PageObjectManager(WebDriver driver2) {
		this.driver = driver2;
	}
	public Signin getSigninPage() {
		if(si==null) {
			si= new Signin(driver);
		}
		return si;
	}
	public Login getLoginPage() {
		if(li==null) {
			li= new Login(driver);
		}
		return li;
	}
	public MyAccount getMyAccountPage() {
		if(ma==null) {
			ma= new MyAccount(driver);
		}
		return ma;
	}
	public EveningDresses getEveningDressesPage() {
		if(ed==null) {
			ed= new EveningDresses(driver);
		}
		return ed;
	}
	public Selection getSelectionPage() {
		if(se==null) {
			se= new Selection(driver);
		}
		return se;
	}
	public Proceed getProceedPage() {
		if(pr==null) {
			pr= new Proceed(driver);
		}
		return pr;
	}
	public Payment getPaymentPage() {
		if(py==null) {
			py= new Payment(driver);
		}
		return py;
	}
	public Signout getSignoutPage() {
		if(so==null) {
			so= new Signout(driver);
		}
		return so;
	}
}
