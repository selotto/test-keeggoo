package S01_NewUser;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Setup.SetupFramework;

public class CreateNewUser extends SetupFramework
{
	
	@Test
	public void CreateNewUserCorrect()
	{
		 WebDriver driver = new ChromeDriver();
         driver.get("http://advantageonlineshopping.com/#/");
		System.out.println("Sending to log info");
	}
	
	@Test
	public void CreateNewUserIncorrect()
	{
		System.out.println("Sending to log info");
	}
}
