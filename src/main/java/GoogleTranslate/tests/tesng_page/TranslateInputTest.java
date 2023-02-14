package GoogleTranslate.tests.tesng_page;

import GoogleTranslate.infra.scanner.ScannerInput;
import GoogleTranslate.infra.seleniume_driver_properties.driver_functionality.SelectDriver;
import GoogleTranslate.tests.TranslateInput;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;


//In this test I will check if typed text  will be translated and if language will be detected .


public class TranslateInputTest {

    WebDriver driver;

    String inputValue;
    String scan;

    @BeforeMethod()

    //Using scanner input class for typing the text to be translated.
    public void typing() throws FileNotFoundException {

        inputValue = ScannerInput.getInputFromScanner();



    }

    //Setting the driver (Choosing FireFox or Chrome).
    @BeforeTest
    public void setUpDriver() {

        driver = SelectDriver.d();


    }


    //In this test the typed word will be sent to google translate, and after it is translated it will print in the consul the translated
    //word and also will print if the language detection works as expected(true /false).
    @Test()
    //Steps for Allure reports
    @Step


    public void translateInput() throws InterruptedException {

        TranslateInput translateInput = new TranslateInput();
        translateInput.Type(driver, inputValue);


    }

}

