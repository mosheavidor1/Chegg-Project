package GoogleTranslate.test.tesng_page.test_actions;

import GoogleTranslate.infra.scanner.TextActions;
import GoogleTranslate.infra.web_elements.WaitForElement;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;

import java.io.File;
import java.io.IOException;

import static GoogleTranslate.infra.web_elements.languages.LanguageElements.*;
import static screenshots.ScreenshotsPath.SCREENSHOT;


public class TranslateInput {

    WebDriver driver;
    String inputValue;

    public void Type(WebDriver driver, String inputValue) throws InterruptedException, IOException {
        this.driver = driver;
        this.inputValue = inputValue;

        WaitForElement wait = new WaitForElement(driver, 30);

        try {
            driver.get(GOOGLE_TRANSLATE_URL);
            driver.manage().window().fullscreen();

            //Google translate source language area
            WebElement sourceLanguage = driver.findElement(By.cssSelector(SOURCE_LANGUAGE));
            sourceLanguage.sendKeys(inputValue);

            //This function will print the Translated text from Google Translate and will verify language detection works(true/false)
            TextActions.GetText(driver);

            // Add an assertion to check if the translated text is not empty
            String translatedText = TextActions.GetText(driver);



        } catch (Exception e) {
            // If there's an exception, log the error message and take a screenshot
            e.printStackTrace();
            File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            FileUtils.copyFile(screenshotFile, new File( SCREENSHOT));
        }

    }
























}

//
//    WebDriver driver;
//
//    String inputValue;
//
//
//    // Typing the text to be translated.
//    public void Type(WebDriver driver, String inputValue) throws InterruptedException {
//        this.driver = driver;
//        this.inputValue = inputValue;
//
//        WaitForElement wait = new WaitForElement(driver, 30);
//
//
//        driver.get(GOOGLE_TRANSLATE_URL);
//        driver.manage().window().fullscreen();
//
//
////Google translate source language area
//
//        driver.findElement(By.cssSelector(SOURCE_LANGUAGE)).sendKeys(inputValue);
//
////This function will print the Translated text from Google Translate and will verify language detection works(true/false)
//        TextActions.GetText(driver);
//
//    }
//}
//



