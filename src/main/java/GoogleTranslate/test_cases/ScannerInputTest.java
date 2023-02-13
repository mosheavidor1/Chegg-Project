package GoogleTranslate.test_cases;

import GoogleTranslate.infra.drivers.FireFoxDriverManager;
import GoogleTranslate.infra.drivers.ScanFile;
import GoogleTranslate.infra.drivers.SelectDriver;
import GoogleTranslate.infra.scanner.ScannerInput;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.FileNotFoundException;

public class ScannerInputTest {

    WebDriver driver;

   String inputValue;
   String scan;

   @BeforeMethod()

   public void scanning() throws FileNotFoundException {

      inputValue = ScannerInput.getInputFromScanner();
     //  scan= ScanFile.getScannedFile();





   }

    @BeforeTest
    public void setUpDriver() {

//        ChromeDriverManager chromeDriverManager = new ChromeDriverManager();
//        driver = chromeDriverManager.setupDriver();


//         FireFoxDriverManager fireFoxDriverManager= new FireFoxDriverManager();
//         driver=fireFoxDriverManager.setupDriver();

   driver=SelectDriver.d();




    }


    @Test()
    @Step

    public void translate() throws InterruptedException {

            driver.get("https://translate.google.com/");
            driver.manage().window().fullscreen();
driver.findElement(By.cssSelector("textarea[aria-label='Source text']")).sendKeys(inputValue);


        Thread.sleep(2000);

    WebElement word =driver.findElement(By.xpath("//span[@class='ryNqvb']"));
    WebElement language=driver.findElement(By.xpath("//span[normalize-space()='Hebrew - detected']"));

        System.out.println(word.getText());
        String t= "HEBREW - DETECTED";
       if(t.equals(word.getText())){
           System.out.println("True");
       }else {
           System.out.println("False");
       }


        }

    @Test()
    @Step

    public void FromFile() throws InterruptedException, FileNotFoundException {


        driver.get("https://translate.google.com/");
        driver.manage().window().fullscreen();
        driver.findElement(By.cssSelector("textarea[aria-label='Source text']")).sendKeys(scan);

        Thread.sleep(10000);


    }


        @Test()

    public void close() throws InterruptedException {


       driver.quit();
        }

    }



