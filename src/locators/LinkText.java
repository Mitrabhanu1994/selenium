package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LinkText 
{

	public static void main(String[] args)
	{
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.name("userLoginId")).sendKeys("mitrabhanu");
		driver.findElement(By.name("password")).sendKeys("gudu");
		driver.findElement(By.linkText("Need help?")).click();
		driver.findElement(By.name("forgot_password_input")).sendKeys("mitrabhanu rout");
		driver.navigate().back();
		driver.findElement(By.linkText("Sign up now")).click();
		driver.findElement(By.id("id_email_hero_fuji")).sendKeys("routmitrabhanu");
		driver.close();
	
		//driver.findElement(By.tagName("checkbox")).click();
		
	}

}
