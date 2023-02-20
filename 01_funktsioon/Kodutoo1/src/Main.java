import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int randomInt = getRandomInt(5, 10);
        System.out.println("Suvaline number: " + randomInt);

        String str = "aias sadas saia";
        boolean isPalindromic = isPalindrome(str);
        System.out.println(str + " on palindroom? " + isPalindromic);

        double[] numbers = {0, 8};
        System.out.println("Average of numbers: " + calculateAverage(numbers));
    }

    // arvutab kahe arvu keskmist
    public static double calculateAverage(double[] numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
        }
        return sum / numbers.length;
    }

    // annab suvalise numbri vahemikus
    public static int getRandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }

    // kontrollib palindroomi
    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
