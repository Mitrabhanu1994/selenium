package webdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenFirefox
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "F:/Softwares/geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https:www.myntra.com");
		//driver.navigate().to("https:\\www.myntra.com");
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("(//a[.=\"Download\"])[2]")).click();
		
		Robot r=new Robot();
		for(int i=0; i<=2; i++)
		{
			Thread.sleep(2000);
			r.keyPress(KeyEvent.VK_TAB);
		}
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
