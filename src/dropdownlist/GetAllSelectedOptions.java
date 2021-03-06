package dropdownlist;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ASUS%20PC/Desktop/dropdownlist.html");
		WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='employees']"));
		Select sel=new Select(dropdownlist);
		sel.selectByVisibleText("Reena");
		sel.selectByVisibleText("Juhi");
		sel.selectByVisibleText("Purva");
		List<WebElement>selectedoptions=sel.getAllSelectedOptions();
		System.out.println(selectedoptions.size());
		for(int i=0; i<selectedoptions.size(); i++)
		{
			System.out.println(selectedoptions.get(i).getText());
		}
	}
}
