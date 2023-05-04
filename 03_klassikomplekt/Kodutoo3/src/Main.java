public class Main {
    public static void main(String[] args) {

        Ratas ratas = new Ratas("Scott", "Series 5", new Ostja("Marks", "markus123",
                "markuss@gmail.com", "Markus", "Peterson"));
        System.out.println(ratas.kasutaja.kasutajanimi);
        ratas.rattaKasutaja();
        ratas.setRatas();
    }
}