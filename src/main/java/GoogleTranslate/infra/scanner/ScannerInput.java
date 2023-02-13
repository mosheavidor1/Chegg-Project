package GoogleTranslate.infra.scanner;

import java.util.Scanner;

public class ScannerInput {



        public static String getInputFromScanner() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a value: ");
            String inputValue = null;
            try {
                inputValue = scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            return inputValue;
        }

    }


