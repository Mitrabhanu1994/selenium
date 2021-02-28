package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/ASUS%20PC/Desktop/dropdownlist.html");
		WebElement dropdownlist=driver.findElement(By.xpath("//select[@name='employees']"));
		Select sel=new Select(dropdownlist);
		//sel.selectByVisibleText("Reena");
		//sel.selectByValue("JU");
		//sel.selectByIndex(2);
		System.out.println(sel.isMultiple());
		//Thread.sleep(3000);
		//sel.deselectAll();
		//Thread.sleep(3000);
		//sel.deselectByIndex(2);
		//Thread.sleep(3000);
		//sel.deselectByValue("JU");
		//Thread.sleep(3000);
		//sel.deselectByVisibleText("Reena");
	}

}
