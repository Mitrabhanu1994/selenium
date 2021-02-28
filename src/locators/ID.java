package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.gmail.com");
		WebElement username=driver.findElement(By.id("identifierId"));
		//username.sendKeys("mitrabhanu");*/
driver.findElement(By.id("identifierId")).sendKeys("suchismitadehury369@gmail.com");
driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
	}

}
