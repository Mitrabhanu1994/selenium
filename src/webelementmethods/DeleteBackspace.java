package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteBackspace
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("priyanka");
		//username.sendKeys(Keys.CONTROL,"a");
		username.sendKeys(Keys.DELETE);
		/*for(int i=0;i>=3;i++)
		{
			Thread.sleep(1000);
			username.sendKeys(Keys.BACK_SPACE);*/
		}
	}


