package extraconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HandlingChatbot
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("corover-disha-icon")));
		//driver.findElement(By.id("corover-close-btn")).click();
		
		driver.findElement(By.id("corover-disha-icon")).click();
		driver.switchTo().frame("corover-chat-frame");
		driver.findElement(By.xpath("//input[@placeholder='Enter your query here']")).sendKeys("train to bangalore");
	}

	

}
