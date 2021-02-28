package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.americanairlines.in");
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		driver.findElement(By.xpath("(//a[.='19'])[1]")).click();
		driver.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		for(int i=0; i<=4;i++)
		{
			driver.findElement(By.xpath("//a[@title=\"Next\"]")).click();
		}
		driver.findElement(By.xpath("(//a[.='27'])[1]")).click();
	}

}
