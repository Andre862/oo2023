package ee.andre.klassikomplektapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class OstjaController {

    List<Ostja> ostja = new ArrayList<>(Arrays.asList(
            new Ostja(1, "Eigo", "Kaljurand"),
            new Ostja(2, "Madis", "Seller"),
            new Ostja(3, "Kaia", "Heroiini"),
            new Ostja(4, "Kristin", "Pabul"),
            new Ostja(5, "Laivi", "Tuvahe")
    ));

    @GetMapping("Ostja")
    public List<Ostja> saaOstja() {
        return ostja;
    }

    @DeleteMapping("kustuta-ostja/{index}")
    public String kustutaIsik(@PathVariable int index) {
        ostja.remove(index);
        return "Ostja sai kustutatud!";
    }

    @PostMapping("lisa-Ostja")
    public List<Ostja> lisaOstja(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi) {
        ostja.add(new Ostja(id, eesnimi, perenimi));
        return ostja;
    }

}