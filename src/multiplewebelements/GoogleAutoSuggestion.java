package multiplewebelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestion 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		WebElement searchbar=driver.findElement(By.xpath("//input[@type='text']"));
		searchbar.sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement>suggestions=driver.findElements(By.xpath("//span[contains(text(),'selenium')]"));
		//System.out.println(suggestions.size());
		
		/*for(int i=0;i<2;i++)
		{
			Thread.sleep(2000);
		searchbar.sendKeys(Keys.ENTER);
		}*/
		//driver.findElement(By.xpath("//b[.=' interview questions']")).click();
		//searchbar.sendKeys(Keys.ENTER);
		for(int i=0;i<suggestions.size();i++)
		{
			if(suggestions.get(i).getText().equalsIgnoreCase("selenium interview questions"))
			{
			suggestions.get(i).click();
			break;
			}
		}
	}
}

