package GoogleTranslate.run.main_run;

import GoogleTranslate.test.tesng_page.TranslateInputTest;

import java.io.FileNotFoundException;
import java.io.IOException;

public class RunTranslateInput {


    public static void main(String[] args) throws InterruptedException, IOException {

        //In this test I'm typing a text (using scanner class) and send it via Selenium TestNG to Google Translate and getting in  return
//the output of the text and also verifying that the language detection works as expected.

        TranslateInputTest translateInputTest = new TranslateInputTest();
        translateInputTest.typing();
        translateInputTest.setUpDriver();
        translateInputTest.translateInput();


    }

}












//
////    public static void main(String[] args) {
////
////
//////            TranslateEnteredText scannerInputTest = new TranslateEnteredText();
//////            scannerInputTest.scanning();
//////            scannerInputTest.setUpDriver();
//////            //  scannerInputTest.FromFile();
//////            scannerInputTest.translate();
//////            //  scannerInputTest.close();
//////
//////
//////
//////
//////        }
//////    }
//////
//////
////
