package GoogleTranslate.infra.seleniume_driver_properties.driver_functionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public  class SelectDriver {


    static String select;

   static WebDriver driver;

public static WebDriver d(){
    getBrowser();

    return driver;
}



    public static String getBrowser() {



        FireFoxDriverManager f=new FireFoxDriverManager();

        ChromeDriverManager c =new ChromeDriverManager();



     selectBrowser();

        switch (select){
            case "FireFox":f.setupDriver();
            driver=new FirefoxDriver();

            break;


            case "Chrome":c.setupDriver();
                driver=new ChromeDriver();



            break;


        }

return select;
    }




     public static String selectBrowser(){


        Scanner sc = new Scanner(System.in);
        System.out.println("Select browser , type Chrome or FireFox");

         select = sc.nextLine();


        return select;
    }
}
