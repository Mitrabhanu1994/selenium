package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWidthHeight 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com");
		WebElement actitimelogo=driver.findElement(By.xpath("//div[@class='atLogoImg']"));
		System.out.println(actitimelogo.getSize().getWidth());
		System.out.println(actitimelogo.getSize().getHeight());
	}

}
