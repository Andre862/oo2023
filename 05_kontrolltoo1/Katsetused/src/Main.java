import java.util.Scanner;


public class Main
{


    public static final String ALPHABET = "abcdefghijklmnopqrstuvöäõüwxyz";


    public static String encryptData(String inputStr, int shiftKey)
    {
        // konvertib kõik väikesteks tähtedeks
        inputStr = inputStr.toLowerCase();

        // hoiab krüptituid andmeid
        String encryptStr = "";

        // kasutab loopi et iga järgmist tähte krüptida
        for (int i = 0; i < inputStr.length(); i++)
        {
            char c = inputStr.charAt(i);

            if (c == ' ') { // teeb tühiku korda
                encryptStr += c;
                continue;
            }

            // võtab tähe positsiooni tähestikust
            int pos = ALPHABET.indexOf(c);

            // võtab iga krüptitud tähe
            int encryptPos = (shiftKey + pos) % 29;
            char encryptChar = ALPHABET.charAt(encryptPos);

            // lisab krüptitud tähe
            encryptStr += encryptChar;
        }

        // returnib krüptitud
        return encryptStr;
    }


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


    // main() method start   
    public static void main(String[] args)
    {
        // scanner
        Scanner sc = new Scanner(System.in);

        // küsin kasutajalt
        System.out.println("Lisa tähti mida krüpteerida või dekrüpteerida: ");
        String inputStr = sc.nextLine();

        System.out.println("Lisa number mitme tähe võrra tähestikus liikuda: ");
        int shiftKey = Integer.valueOf(sc.nextLine());

        System.out.println("Teie tähed krüpteeritult ===> "+encryptData(inputStr, shiftKey));
        System.out.println("Teie tähed dekrüpteeritult ===> "+decryptData(encryptData(inputStr, shiftKey), shiftKey));


        sc.close();

    }
}   