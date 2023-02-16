package GoogleTranslate.run.main_run;

import GoogleTranslate.test.tesng_page.TranslateInputTest;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;

import java.io.IOException;

import static GoogleTranslate.infra.seleniume_driver_properties.extent_reports_path.EXTENT_PATH;

public class RunTranslateInput{
//In this test the typed word will be sent to google translate, and after it is translated it will print in the consul the translated



        public static void main(String[] args) throws IOException, InterruptedException {
            ExtentReports extent = new ExtentReports();
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(EXTENT_PATH);
            extent.attachReporter(htmlReporter);

            ExtentTest test = extent.createTest("Translate Input Test");

            try {
                TranslateInputTest translateInputTest = new TranslateInputTest();
                translateInputTest.typing();
                translateInputTest.setUpDriver();
                translateInputTest.translateInput();
                translateInputTest.tearDown();


                test.pass("Test Passed");
            } catch (Exception e) {
                test.fail(e);
                test.fail("Test fail");
            } finally {
                extent.flush();
            }
        }
}

