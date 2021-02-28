package extraconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumLogFile 
{

	public static void main(String[] args) throws InterruptedException
	{
		/*System.setProperty("webdriver.chrome.logfile", "./seleniumlogs/chromelog.txt");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();*/
		
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "./seleniumlogs/firefox.txt");
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
	}

}
