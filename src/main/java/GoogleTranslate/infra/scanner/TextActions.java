package GoogleTranslate.infra.scanner;

import GoogleTranslate.infra.web_elements.WaitForElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.logging.Logger;

import static GoogleTranslate.infra.web_elements.TestElements.*;
import static screenshots.ScreenshotsPath.SCREENSHOT;

public class TextActions {

    static WebDriver driver;


//This function will print the Translated text from Google Translate and will verify language detection works(true/false)

    public TextActions() {
        GetText(driver);
    }


    public static String GetText(WebDriver driver) {
        Logger logger = Logger.getLogger(TextActions.class.getName());
        WaitForElement wait = new WaitForElement(driver, 30);

        try {
            //Getting the translated text to view on console.
           wait.waitForElement(By.xpath(PRINT_TEXT));
            WebElement textToPrint = driver.findElement(By.xpath(PRINT_TEXT));
            String translatedText = textToPrint.getText();


            //Add a log message to track the text to print
            logger.info("Translated text: " + translatedText);
            System.out.println("Translated text: " + translatedText);



            //Detect the tested language
            wait.waitForElement(By.xpath(HEBREW_DETECT_ELEMENT));
            WebElement languageToDetect = driver.findElement(By.xpath(HEBREW_DETECT_ELEMENT));
            String detectedLanguage = languageToDetect.getText();

            //Add a log message to track the detected language
              logger.info("Detected language: " + languageToDetect.getText());
           System.out.println("Detected language: " + detectedLanguage);


            ////Verifying the language detection of Google Translate works as expected
           Assert.assertEquals(HEBREW_DETECT, languageToDetect.getText());

            return translatedText;

        } catch (Exception e) {
            // If there's an exception, log the error message and take a screenshot
            e.printStackTrace();
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            try {
                FileUtils.copyFile(screenshotFile, new File(SCREENSHOT));
            } catch (IOException ex) {
                ex.printStackTrace();
            }
            return "";
        }
    }
}




//    public static String GetText(WebDriver driver){
//
//
//            WaitForElement wait = new WaitForElement(driver,30);
//            //Getting the translated text to view on consul .
//            wait.waitForElement(By.xpath(PRINT_TEXT));
//
//            WebElement textToPrint = driver.findElement(By.xpath(PRINT_TEXT));
//
//
//            //Detect the tested language
//            wait.waitForElement(By.xpath(HEBREW_DETECT_ELEMENT));
//            WebElement languageToDetect = driver.findElement(By.xpath(HEBREW_DETECT_ELEMENT));
//
//
//            ////Verifying the language detection of Google Translate works as expected
//            System.out.println(textToPrint.getText());
//            String detectElement = HEBREW_DETECT;
//            if (detectElement.equals(languageToDetect.getText())) {
//                System.out.println("True");
//            } else {
//                System.out.println("False");
//
//            }
//        return detectElement;
//    }
//
//
//
//    }

