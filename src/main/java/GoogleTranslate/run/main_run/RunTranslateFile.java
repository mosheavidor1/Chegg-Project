package GoogleTranslate.run.main_run;

import GoogleTranslate.test.tesng_page.TranslateFromFileTest;

import java.io.FileNotFoundException;

public class RunTranslateFile {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

//In this test I'm reading from a text file the text send it via Selenium TestNG to Google Translate and return
//the output of the text and also verifying that the language detection works as expected.

        TranslateFromFileTest translateFromFile = new TranslateFromFileTest();

        TranslateFromFileTest translateFromFileTest = new TranslateFromFileTest();
        translateFromFileTest.Read();
        translateFromFileTest.setUpDriver();
        translateFromFileTest.ReadFromFile();


    }
}
