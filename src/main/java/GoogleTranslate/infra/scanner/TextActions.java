package GoogleTranslate.infra.scanner;

import GoogleTranslate.infra.web_elements.WaitForElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static GoogleTranslate.infra.web_elements.TestElements.*;

public class TextActions {

   static WebDriver driver;


//This function will print the Translated text from Google Translate and will verify language detection works(true/false)

 public TextActions(){
     GetText(driver);
 }



    public static void GetText(WebDriver driver){


            WaitForElement wait = new WaitForElement(driver,30);
            //Getting the translated text to view on consul .
            wait.waitForElement(By.xpath(PRINT_TEXT));

            WebElement textToPrint = driver.findElement(By.xpath(PRINT_TEXT));


            //Detect the tested language
            wait.waitForElement(By.xpath(HEBREW_DETECT_ELEMENT));
            WebElement languageToDetect = driver.findElement(By.xpath(HEBREW_DETECT_ELEMENT));


            ////Verifying the language detection of Google Translate works as expected
            System.out.println(textToPrint.getText());
            String detectElement = HEBREW_DETECT;
            if (detectElement.equals(languageToDetect.getText())) {
                System.out.println("True");
            } else {
                System.out.println("False");

            }
        }



    }

