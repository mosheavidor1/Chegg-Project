package GoogleTranslate.tests;

import GoogleTranslate.infra.scanner.TextActions;
import GoogleTranslate.infra.web_elements.WaitForElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static GoogleTranslate.infra.web_elements.TestElements.*;

public class TranslateInput {


    WebDriver driver;

    String inputValue;


    // Typing the text to be translated.
    public void Type(WebDriver driver, String inputValue) throws InterruptedException {
        this.driver = driver;
        this.inputValue = inputValue;

        WaitForElement wait = new WaitForElement(driver, 30);


        driver.get(GOOGLE_TRANSLATE_URL);
        driver.manage().window().fullscreen();


//Google translate source language area

        driver.findElement(By.cssSelector(SOURCE_LANGUAGE)).sendKeys(inputValue);

//This function will print the Translated text from Google Translate and will verify language detection works(true/false)
        TextActions.GetText(driver);

    }
}




