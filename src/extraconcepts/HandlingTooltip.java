package extraconcepts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTooltip
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[.='Create New Account']")).click();
		WebElement birthdaytooltip=driver.findElement(By.id("birthday-help"));
		String tooltiptext=birthdaytooltip.getAttribute("title");
		
		if(tooltiptext.equalsIgnoreCase("ritu"))
		{
			System.out.println("tooltip text is amtched with expected result");
		}
		else
		{
			System.out.println("tooltips text is not matched with expexted result");
		}
	}

}
