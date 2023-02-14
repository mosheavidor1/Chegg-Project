package GoogleTranslate.run.main_run;

import GoogleTranslate.tests.tesng_page.TranslateInputTest;

import java.io.FileNotFoundException;

public class RunTranslateInput {


    public static void main(String[] args) throws InterruptedException, FileNotFoundException {

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
