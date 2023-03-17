import java.io.*;
import java.util.Scanner;

public class Lugeja {
    public static final String ALPHABET = "abcdefghijklmnopqrstuvöäõüwxyz";

    public static void main(String[] args) {

        try {
            // Open the input file
            FileInputStream fileInputStream = new FileInputStream("krupto.txt");

            // Create a scanner to read from the input file
            Scanner scanner = new Scanner(fileInputStream);
            int HAHA = scanner.nextInt();

            // Open the output file
            FileOutputStream fileOutputStream = new FileOutputStream("dekrupto.txt");
            // Read the contents of the input file and write decrypted text to output file
            while (scanner.hasNextLine()) {
                String encryptedLine = scanner.nextLine();
                String decryptedLine = decryptData(encryptedLine, HAHA); // Change the shift key as needed
                fileOutputStream.write(decryptedLine.getBytes());
                fileOutputStream.write(System.getProperty("line.separator").getBytes());
            }

            // Close the scanner and file input/output streams
            scanner.close();
            fileInputStream.close();
            fileOutputStream.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Decrypt function from previous example
    public static String decryptData(String inputStr, int shiftKey) {
        // konvertib väikesteks tähtedeks
        inputStr = inputStr.toLowerCase();

        // salvestab andmeid
        String decryptStr = "";

        // kasutab loopi et krüptida iga järgnev täht
        for (int i = 0; i < inputStr.length(); i++) {
            // võtab positsiooni tähestikust
            int pos = ALPHABET.indexOf(inputStr.charAt(i));

            // kui täht ei ole tähestikus, siis lisab selle kohe dekrüpteeritud stringi
            if (pos == -1) {
                decryptStr += inputStr.charAt(i);
                continue;
            }

            // võtab dekrüptitud tähe
            int decryptPos = (pos - shiftKey) % 29;

            // kui decryptPos is negatiivne
            if (decryptPos < 0) {
                decryptPos = ALPHABET.length() + decryptPos;
            }

            char decryptChar = ALPHABET.charAt(decryptPos);

            // lisa dekrüpteeritud täht
            decryptStr += decryptChar;
        }

        // returni dekrüpteeritult
        return decryptStr;

    }
}