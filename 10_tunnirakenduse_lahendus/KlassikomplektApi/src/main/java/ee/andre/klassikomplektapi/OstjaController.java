package ee.andre.klassikomplektapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class OstjaController {

    List<Ostja> ostjad = new ArrayList<>(Arrays.asList(
            new Ostja(1, "Eigo", "Kaljurand", new Date()),
            new Ostja(2, "Madis", "Seller",new Date()),
            new Ostja(3, "Kaia", "Heroiini",new Date()),
            new Ostja(4, "Kristin", "Pabul",new Date()),
            new Ostja(5, "Laivi", "Tuvahe",new Date())
    ));

    @GetMapping("ostjad")
    public List<Ostja> saaOstjad() {
        return ostjad;
    }

    @DeleteMapping("kustuta-ostja/{index}")
    public String kustutaOstja(@PathVariable int index) {
        ostjad.remove(index);
        return "Ostja sai kustutatud!";
    }

    @PostMapping("lisa-ostja")
    public List<Ostja> lisaOstja(
            @RequestParam int id,
            @RequestParam String eesnimi,
            @RequestParam String perenimi,
            @RequestParam Date loomiseAeg) {
        ostjad.add(new Ostja(id, eesnimi, perenimi, new Date()));
        return ostjad;
    }

}