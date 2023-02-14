//package GoogleTranslate.infra.web_elements;
//
//import GoogleTranslate.infra.scanner.ScannerInput;
//import GoogleTranslate.infra.seleniume_driver_properties.driver_functionality.SelectDriver;
//import io.qameta.allure.Step;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.io.FileNotFoundException;
//
//import static GoogleTranslate.infra.web_elements.TestElements.*;
//
//public class draft {
//
//
//    package GoogleTranslate.run.tesng_run;
//
//import GoogleTranslate.infra.seleniume_driver_properties.driver_functionality.SelectDriver;
//import GoogleTranslate.infra.scanner.ScannerInput;
//import io.qameta.allure.Step;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//import java.io.FileNotFoundException;
//
//import static GoogleTranslate.infra.web_elements.TestElements.*;
//
//    public class TranslateInputTest {
//
//        WebDriver driver;
//
//        String inputValue;
//        String scan;
//
//        @BeforeMethod()
//
//        public void scanning() throws FileNotFoundException {
//
//            inputValue = ScannerInput.getInputFromScanner();
//            //  scan= ScanFile.getScannedFile();
//
//
//
//
//
//        }
//
//        @BeforeTest
//        public void setUpDriver() {
//
//
//
//            driver= SelectDriver.d();
//
//
//
//
//        }
//
//
//        @Test()
//        @Step
//
//        public void translate() throws InterruptedException {
//
//            driver.get(GOOGLE_TRANSLATE_URL);
//            driver.manage().window().fullscreen();
//            driver.findElement(By.cssSelector(SOURCE_LANGUAGE)).sendKeys(inputValue);
//
//
//            Thread.sleep(2000);
//
//            WebElement textToPrint =driver.findElement(By.xpath(PRINT_TEXT));
//            WebElement languageToDetect=driver.findElement(By.xpath( HEBREW_DETECT_ELEMENT));
//
//            System.out.println(textToPrint.getText());
//            String detectElement= HEBREW_DETECT;
//            if(detectElement.equals(languageToDetect.getText())){
//                System.out.println("True");
//            }else {
//                System.out.println("False");
//            }
//
//
//        }
//
//        @Test()
//        @Step
//
//        public void FromFile() throws InterruptedException, FileNotFoundException {
//
//
//            driver.get("https://translate.google.com/");
//            driver.manage().window().fullscreen();
//            driver.findElement(By.cssSelector("textarea[aria-label='Source text']")).sendKeys(scan);
//
//            Thread.sleep(10000);
//
//
//        }
//
//
//        @Test()
//
//        public void close() throws InterruptedException {
//
//
//            driver.quit();
//        }
//
//    }
//
//
//
//
//}
