package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnHandeledAlertException
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/tasks/tasklist.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("manager");
		driver.findElement(By.xpath("//div[.=\"Login \"]")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[@class='title ellipsis']")).click();
		driver.findElement(By.xpath("//div[@class='item createNewCustomer']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[68]")).sendKeys("devika");
		driver.findElement(By.xpath("//div[@class='greyButton cancelBtn']")).click();
		
		driver.findElement(By.id("logoutLink")).click();
	}

}
