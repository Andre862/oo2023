import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        PrintWriter pw = new PrintWriter(new FileWriter("valjund1.txt"));
        pw.print("Teretereteretere");
        pw.print(" Juku");
        pw.print(" Kuku");
        pw.println(" Mari");
        pw.print(" Uus rida");
        pw.close();
    }
}