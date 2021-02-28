package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CopyPasteWithoutShotcut
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("mitrabhanu");
		String usernamevalue=username.getAttribute("value");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys(usernamevalue);
		String passwordvalue=password.getAttribute("value");
		if(passwordvalue.equalsIgnoreCase(usernamevalue))
		{
		     System.out.println("copy paste done properly");
		}
		
		else
		{
			System.out.println("copy paste done not properly");
		}
	}
}
		
	


