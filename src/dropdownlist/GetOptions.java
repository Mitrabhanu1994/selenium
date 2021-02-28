package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetOptions 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ASUS%20PC/Desktop/dropdownlist.html");
		WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='employees']"));
		Select sel=new Select(dropdownlist);
		List<WebElement>options=sel.getOptions();
		System.out.println(options.size());
		for(int i=0; i<options.size(); i++)
		{
			System.out.println(options.get(i).getText());
		}
	}

}
