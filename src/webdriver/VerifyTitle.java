package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String actualTitle=driver.getTitle();
		if(actualTitle.equalsIgnoreCase("google"))
		//if(actualTitle.equals("google"))
		{
			System.out.println("titles are matching");
		}
		else
		{
			System.out.println("title are not matching");
		}
	
	String actualUrl=driver.getCurrentUrl();
	if(actualUrl.contains("com"))
	{
		System.out.println("its present");
	}
	else
	{
		System.out.println("its not pressnt");
	}
	}
	}


