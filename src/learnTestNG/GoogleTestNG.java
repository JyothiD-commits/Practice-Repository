package learnTestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GoogleTestNG {
	WebDriver driver;
	
	@BeforeClass(groups= {"googlegroups"})
	public void setBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jdand\\OneDrive\\Desktop\\Selwebdriver\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
	    //driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
   		driver.manage().window().maximize();
	}
	
	@Test(groups= {"googlegroups"})
	public void getTitleTest() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		Thread.sleep(6000);
		String title = driver.getTitle();
		System.out.println(title);
		sendKeysTest();
	}
	
	//@Test(groups= {"googlegroups"})
	public void sendKeysTest() throws InterruptedException {
		
		 WebElement element = driver.findElement(By.name("q"));
		 element.sendKeys("Software Testing");
		 element.submit();
		 Thread.sleep(3000);
		 
		
	}
	
	/*
	 * @Test(priority=2) public void newWindow() throws InterruptedException {
	 * driver.get("https://www.rediff.com/"); Thread.sleep(3000); }
	 */
	
	  @AfterClass(groups= {"googlegroups"}) 
	  public void tearDown() throws InterruptedException { 
		  Thread.sleep(6000);
		  driver.quit();
	  }
	 
	
}
