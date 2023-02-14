package GoogleTranslate.infra.seleniume_driver_properties.driver_functionality;

import GoogleTranslate.infra.seleniume_driver_properties.driver_properties.DriverPro;
import org.openqa.selenium.WebDriver;

public class ChromeDriverManager extends WebDriverManager implements DriverPro {

    WebDriver driver;

    @Override
    public WebDriver setupDriver() {

        System.setProperty(DriverPro.ChromeWebDriver, DriverPro.ChromePath);




        return driver;
    }

}
