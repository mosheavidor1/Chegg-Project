package GoogleTranslate.run.main_run;

import GoogleTranslate.infra.scanner.TextActions;
import GoogleTranslate.infra.scanner.read_file_scanner.LanguageFilePath;
import GoogleTranslate.infra.scanner.read_file_scanner.ScanFile;
import GoogleTranslate.infra.web_elements.languages.SupportedLanguage;
import GoogleTranslate.test.tesng_page.test_actions.TranslateFromFile;
import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

import static GoogleTranslate.infra.seleniume_driver_properties.driver_properties.DriverPro.ChromePath;
import static GoogleTranslate.infra.seleniume_driver_properties.driver_properties.DriverPro.ChromeWebDriver;
import static java.util.Locale.JAPANESE;

public class TranslateFromFileTest {



    WebDriver driver;


    String FileRead;



    //Setting the driver (Choosing FireFox or Chrome).
    @BeforeTest
    public void setUpDriver() {

        //  driver = SelectDriver.d();

        System.setProperty(ChromeWebDriver,ChromePath);

        driver=new ChromeDriver();

    }




    //In this test I will read from a text file and send the input to google translate via Selenium and print the output
    //of the translated text.

    // And also will print if the language detection works as expected(true /false).

    @Test(priority = 1)


    //Steps for Allure reports
    @Step


    public void ReadFromFile_Japanese() throws InterruptedException, FileNotFoundException {
        TranslateFromFile translateFromFile=new TranslateFromFile();
        translateFromFile.Read(driver,FileRead= ScanFile.getScannedFile(LanguageFilePath.JAPANESE));





    }


    @Test(priority = 2)


    //Steps for Allure reports
    @Step


    public void ReadFromFile_Dutch() throws InterruptedException, FileNotFoundException {
        TranslateFromFile translateFromFile=new TranslateFromFile();
        translateFromFile.Read(driver,FileRead= ScanFile.getScannedFile(LanguageFilePath.DUTCH));





    }



    @Test(priority = 3)


    //Steps for Allure reports
    @Step


    public void ReadFromFile_Greek() throws InterruptedException, FileNotFoundException {
        TranslateFromFile translateFromFile=new TranslateFromFile();
        translateFromFile.Read(driver,FileRead= ScanFile.getScannedFile(LanguageFilePath.GREEK));





    }



@Test(priority = 4)


//Steps for Allure reports
@Step


public void ReadFromFile_French() throws InterruptedException, FileNotFoundException {
        TranslateFromFile translateFromFile=new TranslateFromFile();
        translateFromFile.Read(driver,FileRead= ScanFile.getScannedFile(LanguageFilePath.FRENCH));





        }



@Test(priority = 5)


//Steps for Allure reports
@Step


public void ReadFromFile_Hebrew() throws InterruptedException, FileNotFoundException {
        TranslateFromFile translateFromFile=new TranslateFromFile();
        translateFromFile.Read(driver,FileRead= ScanFile.getScannedFile(LanguageFilePath.HEBREW));





        }

        }










