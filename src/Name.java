import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 

public class Name {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String titlename=driver.getTitle();
		System.out.println("Page title name is " + titlename);
	//	driver.navigate().to("https://www.google.com");
		 
		//driver.navigate().back();
		//driver.navigate().refresh();
		//driver.wait(5000);
		// or use
		// Thread.sleep(5000);
		 
	//	driver.findElement(By.name("email")).sendKeys("xxx@gmail.com");
		//driver.findElement(By.name("pass")).sendKeys("xxxxxx");
		//driver.findElement(By.id("u_0_q")).click();
		 
		//driver.quit();
		}
		

}
