package dropdownlist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UnexpectedTagNameException
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.irctc.co.in/nget/profile/user-registration");
		WebElement dropdown=driver.findElement(By.xpath("(//span[@class='ng-star-inserted'])[4]"));
		Select sel=new Select(dropdown);
		sel.selectByIndex(1);
	}

}
