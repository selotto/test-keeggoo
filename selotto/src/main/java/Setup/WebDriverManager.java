package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverManager {

    private static final String DRIVER_DIR = "src/test/resources/";

    public static WebDriver getWebDriver(String browserName) 
    {
           return getChromeDriver();
    }

    private static WebDriver getChromeDriver() {
        System.setProperty("webdriver.chrome.driver", DRIVER_DIR + "chromedriver.exe");
        return new ChromeDriver();
    }

  
}