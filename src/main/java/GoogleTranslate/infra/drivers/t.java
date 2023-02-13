package GoogleTranslate.infra.drivers;

import GoogleTranslate.test_cases.ScannerInputTest;

import java.io.FileNotFoundException;

public class t {

    public static void main(String[] args) throws InterruptedException, FileNotFoundException {



            ScannerInputTest scannerInputTest = new ScannerInputTest();
            scannerInputTest.scan();
            scannerInputTest.setUpDriver();
            scannerInputTest.FromFile();
//            scannerInputTest.translate();
//            scannerInputTest.close();




        }
    }

