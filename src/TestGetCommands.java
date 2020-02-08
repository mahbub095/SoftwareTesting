import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestGetCommands {

	
	WebDriver driver;
	
	public void invokeBrowser() {
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
			// manage use for browser property
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			getCommands();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void getCommands() {
		
		try {
			driver.get("http://www.amazon.in");
			String titleofThePage = driver.getTitle();
			System.out.println("Title Of the page is" +titleofThePage);
			driver.findElement(By.linkText("Gift Ideas")).click();
			String currentUrl = driver.getCurrentUrl() ;
			System.out.println("The Current URl is "+currentUrl);
			System.out.println("The Page Source is " +driver.getPageSource());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestGetCommands myObj = new TestGetCommands();
		myObj.invokeBrowser();
	}

}
