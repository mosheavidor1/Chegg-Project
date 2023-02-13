package GoogleTranslate.infra.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverManager extends WebDriverManager {

    WebDriver driver;

    @Override
    public WebDriver setupDriver() {

        System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\New folder\\chromedriver.exe");




        return driver;
    }

}
