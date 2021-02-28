package webelementmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uppercase_Lowercase
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement username=driver.findElement(By.id("email"));
		//username.sendKeys(Keys.SHIFT,"mitrabhanu");
		String name="mitrabhanu";
		//String uppercaseusername=name.toUpperCase();
		//username.sendKeys(uppercaseusername);
		String lowercaseusername=name.toLowerCase();
		username.sendKeys(lowercaseusername);
	}

}
