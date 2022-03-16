package Setup;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class SetupFramework {
	
	 public static void main(String[] args) 
	 {
         // TODO Auto-generated method stub
         WebDriver driver = new ChromeDriver();
         driver.get("http://advantageonlineshopping.com/#/");
	 }
}
