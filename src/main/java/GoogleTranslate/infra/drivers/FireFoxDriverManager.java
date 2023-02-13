package GoogleTranslate.infra.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriverManager extends WebDriverManager {


    WebDriver driver;
    @Override
    public WebDriver setupDriver() {

        System.setProperty("webdriver.gecko.driver","C:\\Selenium\\f\\geckodriver.exe");



        return driver;
    }


}

