import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {

	WebDriver driver;
	
	public void invokeBrowser()
	{
		
		try {
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
			// manage use for browser property
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
			searchCourse();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void searchCourse() {
		driver.findElement(By.id("email")).sendKeys("Java");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("SubmitLogin")).click();
	}
	
	
	public static void main(String[] args) {
		Day1 myobj=new Day1();
		myobj.invokeBrowser();

	}

}
