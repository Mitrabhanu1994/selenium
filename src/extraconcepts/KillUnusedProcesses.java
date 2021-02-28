package extraconcepts;

import java.awt.Window;

import org.openqa.selenium.os.WindowsUtils;

public class KillUnusedProcesses
{

	public static void main(String[] args)
	{
         WindowsUtils.killByName("chromedriver.exe");
         System.out.println(WindowsUtils.thisIsWindows());
	}

}
