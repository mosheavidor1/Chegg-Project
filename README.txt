Google Translate project for:

Introduction:

This project provides a set of sample tests using Selenium WebDriver and TestNG in Java.
The tests are designed to demonstrate basic functionality and features of Selenium and TestNG on Google Translate .



Prerequisites:

    Java JDK 18 or higher
    Maven 3.9.0 or higher
    Chrome or Firefox web browser from latest versions
    Selenium WebDriver latest
    TestNG the latest
    Allure reports
    Extent reports


Installation:

Download and install Java JDK 8 or higher from https://www.oracle.com/java/technologies/downloads/
Download and install Maven 3.9.0 or higher from https://maven.apache.org/download.cgi
Set on environment variables Maven - System variables (MVN_HOME , value path) on path - %MVN_HOME%\bin
Set on environment variables Allure reports 2.21.0 -on path <allure path bin directory>
pox.xml - Has all the needed dependencies if needed to add more -https://mvnrepository.com/


Tests:
About:
Test 1: Translate a text from an outside file  : "TranslateFromFileTest"
On this test a Chrome browser will be open (possible to check also on FireFox).
Tested languages of several languages will be tested .
Assertion of each language that will detect the if Google Translate auto language detect works .
Assertion that file was translated successfully.
Output of the translated text .

How to run : Run from - Chegg-Project\src\main\java\GoogleTranslate\run\main_run\TranslateFromFileTest

How to add new tests :
1.Add the tests to run from : Chegg-Project\src\main\java\GoogleTranslate\run\main_run\TranslateFromFile  and the TestNg to TranslateFromFileTest

2.Languages files : Chegg-Project\src\main\utilities\Files_to_translate

3.Add new language to files and than copy the path and the language name to -Chegg-Project\src\main\java\GoogleTranslate\infra\scanner\read_file_scanner

4.It is also possible to add new language to SupportedLanguage-(for auto-detection) -Chegg-Project\src\main\java\GoogleTranslate\infra\web_elements\languages\SupportedLanguage


Reports :

Allure reports:
 After running the test type on cmd/ terminal  (from Cheg-project directory path)   : "allure serve"
 - it will open an html website of the report from the last run .

 Reports logs are saved in : Chegg-Project\allure-results  also possible to write mvn clean test to see logs .

 Screenshots of failures :Chegg-Project\src\main\java\screenshots



Test 2: Translate typed text . "TranslateInputTest".

Translate any text of any language (That is supported by Google) and see the translation of it .
Also, will detect on the tested languages of this project if language detection works .

 On this test:
  1.There will be a prompt of scanner that will ask you to type a word (any language).
  2.Second prompt to choose which browser to use - Chrome or FireFox .
  3.Test will open the chosen browser and will type and translate the word on Google Translate .
  4.Translated word will also appear in the consul output .


 How to run - Run from - "Chegg-Project\src\main\java\GoogleTranslate\run\main_run\RunTranslateInput.java"

 How to add new tests:
 1.Add the new tests to : "Chegg-Project\src\main\java\GoogleTranslate\test\tesng_page\TranslateInput and TestNG to TranslateInputTest (call from RunTranslateInput class).
 2.This test has common paths with "TranslateFromFileTest" so it is possible to follow same paths.


 Reports :
 1.Extension reports :  "Chegg-Project\src\main\utilities\extent_reports\test-output\ExtentReport.html"
 2.The reports will automatically will be generated when running the test.
 3.Open the latest html file and it will direct you to the html website to see the reports and logs .

 Screenshots: Chegg-Project\src\main\java\screenshots




 Troubleshooting:
  On test  Translate typed text it was not possible to run the Scanner input (for typing browser name and text to translate - Read only mode on TestNG runs)
  so I had to run it from RunTranslateInput.java class , so the output will not be TestNG, although it is calling testNg class.
  Also, because of this issue there is a need to set the browser (Chrome or Firefox) manually if needed to check on different browser.
  Another thing is that Allure reports are generated only if running from TestNG class so that is the reason I have used Extent reports
  on this specific test .




















































