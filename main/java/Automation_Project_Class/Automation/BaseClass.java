package Automation_Project_Class.Automation;

import java.io.File;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class BaseClass 
{
	public static WebDriver driver;
	public static String value;
	public static WebDriver getBrowser (String type) {
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "//Driver//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//Driver//firefox.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;	
	}
	public static void link(String url) {
		driver.get(url);
	}
	public static void inputValueElement(WebElement element , String value) {
		element.sendKeys(value);
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
	public static void implicitTime(int time, TimeUnit format) {
		driver.manage().timeouts().implicitlyWait(time, format);
	}
	public static void close() {
		driver.close();
	}
	public static void quit() {
		driver.quit();
	}
	public static void sleep(int seconds) throws Throwable {
		Thread.sleep(seconds);
	}
	public static void clear(WebElement element) {
		element.clear();
	}
	public static void screenshot() throws Exception{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Training\\Screenshot\\+1.png"));
	}
	public static void scrollUpAndDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
	public static void actionClass(String ActionName, WebElement S_element) {
		Actions ac = new Actions(driver);
		if(ActionName.equalsIgnoreCase("moveto")) {
			ac.moveToElement(S_element).build().perform();
		}
		else if (ActionName.equalsIgnoreCase("click")) {
			ac.click(S_element).build().perform();
		}
		else if (ActionName.equalsIgnoreCase("doubleclick")) {
			ac.doubleClick(S_element).build().perform();
		}
		else if (ActionName.equalsIgnoreCase("clickandhold")) {
			ac.clickAndHold(S_element).build().perform();
		}
		else if (ActionName.equalsIgnoreCase("contextclick")) {
			ac.contextClick(S_element);
		}
	}
	public static void frames(String frametype, String id, WebElement element ) {
		if(frametype.equalsIgnoreCase("framebyid")) {
			driver.switchTo().frame(id);
		}
		else if(frametype.equalsIgnoreCase("framebyindex")) {
			int index = Integer.parseInt(id);
			driver.switchTo().frame(index);
		}
		else if(frametype.equalsIgnoreCase("framebyelement")) {
			driver.switchTo().frame(element);
		}
		else if(frametype.equalsIgnoreCase("parentframe")) {
			driver.switchTo().parentFrame();
		}
		else if(frametype.equalsIgnoreCase("default")) {
			driver.switchTo().defaultContent();
		}
	}
	public static void select(String selecttype, String value, WebElement element) {
		Select s = new Select(element);
		if(selecttype.equalsIgnoreCase("selectbyindex")) {
			int index = Integer.parseInt(value);
			s.selectByIndex(index);
		}
		else if(selecttype.equals("Selectbyvalue")) {
			s.selectByValue(value);
		}
		else if(selecttype.equalsIgnoreCase("selectbytext")) {
			s.selectByVisibleText(value);
		}
	}
	public static String dataDriven(String path, int rowimdex, int cellindex) throws Throwable {
		File f =new File(path);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(rowimdex);
		Cell cell = row.getCell(cellindex);
		CellType cellType = cell.getCellType();
		if(cellType.equals(cellType.STRING)) {
			value = cell.getStringCellValue();
		}
		else if(cellType.equals(cellType.NUMERIC)) {
			double cellValue = cell.getNumericCellValue();
			int val =(int)cellValue;
			value = String.valueOf(val);
		}
		return value;
	}
	
}
