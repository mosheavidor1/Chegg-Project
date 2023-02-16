package GoogleTranslate.infra.scanner.read_file_scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static GoogleTranslate.infra.scanner.read_file_scanner.ReadFilePath.HEBREW_FILE;

public class ScanFile {

           public static String getScannedFile(LanguageFilePath languageFilePath) throws FileNotFoundException {
               File file = new File(languageFilePath.getFilePath());
               Scanner sc = new Scanner(file);

               String text = sc.nextLine();
               System.out.println(text);

               return text;
           }
       }




//    public static String getScannedFile() throws FileNotFoundException {
//
//        File file = new File(HEBREW_FILE);
//        Scanner sc = new Scanner(file);
//
//        String text = sc.nextLine();
//
//        System.out.println(text);
//
//        return text;
//
//    }
//
//}
