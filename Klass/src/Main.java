import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Kasutaja andre = new Kasutaja("andre", "andre", "andre", "andre", "andre");

        Kasutaja andre2 = new Kasutaja("andre", "andre", "andre", "andre", "andre");

        Kasutaja andre3 = new Kasutaja("andre", "andre", "andre", "andre", "andre");

        Kasutaja andre4 = new Kasutaja("andre", "andre", "andre", "andre", "andre");

        String sonum = andre.kustutaKasutaja();
        System.out.println(sonum);

        andre3.muudaParool("andreandre");

        Tellimus tellimus1 = new Tellimus("Andre", Arrays.asList("Coca","Fanta"));
        Tellimus tellimus2 = new Tellimus("Andre", Arrays.asList("Coca","Fanta"));
        Tellimus tellimus3 = new Tellimus("Andre", Arrays.asList("Coca","Fanta"));

        tellimus1.muudaMakstuks();
        tellimus2.kasOnMakstud();
        // 1 klass, onsructor, 2+ muutujas, 2+ funktiooni, 2+ väljakutset mainis
    }
}