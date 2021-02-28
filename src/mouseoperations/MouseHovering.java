package mouseoperations;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com");
		WebElement offers=driver.findElement(By.xpath("//a[.='Offers']"));
		Actions act=new Actions(driver);
		act.moveToElement(offers).perform();
		WebElement watches=driver.findElement(By.xpath("//a[.='Watches at Min 60%']"));
		act.moveToElement(watches).click(watches).perform();
		
		
}

}
