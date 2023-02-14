package GoogleTranslate.tests.tesng_page;

import GoogleTranslate.infra.scanner.read_file_scanner.ScanFile;
import GoogleTranslate.infra.seleniume_driver_properties.driver_functionality.SelectDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class TranslateFromFileTest {



        WebDriver driver;

        String inputValue;
        String FileRead;

        @BeforeMethod()

        //Using scanner to read from a text file and send it to google translate.
        public void Read() throws FileNotFoundException {

          FileRead= ScanFile.getScannedFile();


        }

        //Setting the driver (Choosing FireFox or Chrome).
        @BeforeTest
        public void setUpDriver() {

            driver = SelectDriver.d();

        }


    //In this test I will read from a text file and send the input to google translate via Selenium and print the output
    //of the translated text.

   // And also will print if the language detection works as expected(true /false).

        @Test()


        //Steps for Allure reports
        @Step


        public void ReadFromFile() throws InterruptedException {
         TranslateFromFile translateFromFile=new TranslateFromFile();
         translateFromFile.Read(driver,FileRead);



        }

    }





