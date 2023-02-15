import java.util.Random;
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        prindiForTsykkel(kordadeArv: 5);
        prindiForTsykkel(kordadeArv:10);

        hinnang = ""
        if (12 < 0) {
            hinnang = "on jääs";
        } else {
            hinnang = "on vesi";
        }


    // liitmine
    public static int sum(int a, int b) {
        return a + b;
        }
    }


    //suvaline number
    public static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    //palindroomi ülevaataja
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}