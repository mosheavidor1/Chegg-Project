package GoogleTranslate.infra.drivers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile {

    public static String getScannedFile() throws FileNotFoundException {

        File file = new File("C:\\Users\\Moshe.Avidor\\Desktop\\testing.txt");
        Scanner sc = new Scanner(file);

        String text = sc.nextLine();

        System.out.println(text);

        return text;

    }

}
