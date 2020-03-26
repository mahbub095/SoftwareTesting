import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
public class DragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// let the system know about the location of chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		// RemoteWebDriver implements WebDriver
		// ChromeDriver extends RemoteWebDriver
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.wikipedia.org/");
		
		Select language = new Select(driver.findElement(By.id("searchLanguage")));
		language.selectByIndex(7);
		System.out.println(language.getFirstSelectedOption().getText());
		//waitPlease();
		language.selectByVisibleText("Simple English");
		System.out.println(language.getFirstSelectedOption().getText());
		//waitPlease();
		language.selectByValue("fr");
		System.out.println(language.getFirstSelectedOption().getText());}
		
	}


