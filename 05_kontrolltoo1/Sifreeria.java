public class Sifreeria {
    public static void main(String[] args) {
        String message = "TERÄ"; // SISESTUS
        int shift = 3; // number alla tähestikust

        String cipher = encrypt(message, shift); // krüptib tektsti
        System.out.println("Teie sõna krüptitult on " + cipher); // outputib krüptitult

        String plaintext = decrypt(cipher, shift); // dekrüpteerib teksti
        System.out.println("Teie sõna dekrüpteeritult on " + plaintext); // outputib orginaal sisestust
    }

    // Krüptib sõnumit
    public static String encrypt(String message, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (Character.isUpperCase(c)) {
                c = (char) ((c + shift - 65) % 26 + 65); // muudab suur tähte
            } else if (Character.isLowerCase(c)) {
                c = (char) ((c + shift - 97) % 26 + 97); // muudab väikest tähte
            }

            result.append(c);
        }

        return result.toString();
    }

    // Dekrüpteerib sõnumit
    public static String decrypt(String ciphertext, int shift) {
        return encrypt(ciphertext, 26 - shift); // liigutab tagasi et saada orginaaltekst
    }
}