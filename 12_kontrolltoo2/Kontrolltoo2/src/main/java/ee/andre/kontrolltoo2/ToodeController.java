package ee.andre.kontrolltoo2;

import ee.andre.kontrolltoo2.Pood;
import ee.andre.kontrolltoo2.Toode;
//import ee.andre.kontrolltoo2.ToodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ToodeController {


    List<Toode> tooted = new ArrayList<>(Arrays.asList(
            new Toode(1, "Sai", 250,0.1, 10),
            new Toode(2, "Leib", 25,0.2,12),
            new Toode(3, "Oder", 15,0.3,90),
            new Toode(4, "Tang", 14,0.4,24),
            new Toode(5, "Nisu", 17,0.5,30),
            new Toode(1, "Kurk", 250,0.1, 10),
            new Toode(2, "Tomat", 25,0.2,12),
            new Toode(3, "Kapsas", 15,0.3,90),
            new Toode(4, "Porgand", 14,0.4,24),
            new Toode(5, "Peet", 17,0.5,30)
    ));

    // localhost:8080/lisa-toode?id=8&nimetus=banaan&hind=5&allahindlus=0.8&koguslaos=93
    @GetMapping("lisa-toode")
    public List<Toode> lisaToode(
            @RequestParam int id,
            @RequestParam String nimetus,
            @RequestParam double hind,
            @RequestParam double allahindlus,
            @RequestParam int koguslaos

    ){
        tooted.add(new Toode(id, nimetus, hind, allahindlus, koguslaos));
        return tooted;
    }

    @GetMapping("leia-allahindlus")
    public List<Toode> leiaAllahindlus() {
        List<Toode> filteredTooted = new ArrayList<>();
        for (Toode toode : tooted) {
            if (toode.getAllahindlus() > 0.0) {
                filteredTooted.add(toode);
            }
        }
        return filteredTooted;
    }
    @GetMapping("hind-madalam-kui")
    public List<Toode> leiaHindMadalamKui(
            @RequestParam double hind
    ) {
        List<Toode> filteredTooted = new ArrayList<>();

        for (Toode toode : tooted) {
            if (toode.getHind() < hind) {
                if (toode.getAllahindlus() < 1) {
                    filteredTooted.add(toode);
                }
            }
        }

        return filteredTooted;
    }

}

