package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.chrome.driver","F:/Softwares/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https:\\www.myntra.com");
	}

}
