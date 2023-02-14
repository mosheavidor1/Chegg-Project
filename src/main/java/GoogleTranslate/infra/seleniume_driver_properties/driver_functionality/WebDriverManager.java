package GoogleTranslate.infra.seleniume_driver_properties.driver_functionality;

import org.openqa.selenium.WebDriver;

public abstract class WebDriverManager {

    WebDriver driver;

    public WebDriver setupDriver() {


        return driver;
    }
}
