import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Upload {

	static WebDriver driver;

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://crud.test/selenium.php");
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                WebElement uploadZip = driver.findElement(By.id("uploadfile"));
                uploadZip.sendKeys("C:\\Resume Mahbubur Rahman.pdf");
               // driver.findElement(By.name("submit_admin_csv")).click();
        
        
	}

}
