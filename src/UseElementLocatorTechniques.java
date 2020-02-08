import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseElementLocatorTechniques {

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
		//	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			elementLocatorTechniques();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void elementLocatorTechniques() {
		
		try {
			driver.get("http://www.amazon.in");
			driver.findElement(By.linkText("Gift Ideas")).click();
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("NONE");
			driver.findElement(By.className("nav-input")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UseElementLocatorTechniques obj =new UseElementLocatorTechniques();
		obj.invokeBrowser();
	}

}
