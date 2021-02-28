package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdge 
{

	public static void main(String[] args) 
	{
		//System.setProperty("webdriver.edge.driver", "F:/Softwares/msedgedriver.exe");
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");
WebDriver driver=new EdgeDriver();
//driver.get("https:www.facebook.com");
driver.navigate().to("https:\\www.myntra.com");
	}

}
