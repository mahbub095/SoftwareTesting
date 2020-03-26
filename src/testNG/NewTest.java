package testNG;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
 
public class NewTest {
	
	
	/*
	 * @Test public void f1() { System.out.println("Inside F1"); }
	 * 
	 * @Test public void f2() { System.out.println("Inside F2"); }
	 * 
	 * @BeforeTest public void beforeAnyTest() {
	 * System.out.println("Before any Test"); }
	 * 
	 * @AfterTest public void afterAllTheTests() {
	 * System.out.println("After any Test"); }
	 * 
	 * @BeforeMethod public void beforeEveryMethod() {
	 * System.out.println("Before all the Test"); }
	 * 
	 * @AfterMethod public void afterEveryMethod() {
	 * System.out.println("After all the Test"); }
	 * 
	 * @BeforeClass public void beforeClass() {
	 * System.out.println("Before all the Class"); }
	 * 
	 * @AfterClass public void afterClass() {
	 * System.out.println("After all the After"); }
	 */
	
	   public String baseUrl = "http://demo.guru99.com/test/newtours/";
	    String driverPath = "C:\\chromedriver.exe";
	  //  chromedrive
	    public WebDriver driver ; 
	     
	  @Test
	  public void verifyHomepageTitle() {
	       
	      
	     System.setProperty("webdriver.gecko.driver", driverPath);
			//System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver = new ChromeDriver();
	      driver.get(baseUrl);
	      String expectedTitle = "Welcome: Mercury Tours";
	      String actualTitle = driver.getTitle();
	      AssertJUnit.assertEquals(actualTitle, expectedTitle);
	      driver.close();
	  }
}
