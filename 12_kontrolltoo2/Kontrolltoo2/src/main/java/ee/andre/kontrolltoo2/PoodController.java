package ee.andre.kontrolltoo2;

import ee.andre.kontrolltoo2.ToodeController;
import ee.andre.kontrolltoo2.Pood;
import ee.andre.kontrolltoo2.Toode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class PoodController {
            @Autowired
            ToodeController toodeController;
    List<Toode> tooted = new ArrayList<>(Arrays.asList(
            new Toode(1, "Kurk", 250,0.1, 10),
            new Toode(2, "Tomat", 25,0.2,12),
            new Toode(3, "Kapsas", 15,0.3,90),
            new Toode(4, "Porgand", 14,0.4,24),
            new Toode(5, "Peet", 17,0.5,30)
    ));

    List<Toode> tooted1 = new ArrayList<>(Arrays.asList(
            new Toode(1, "Sai", 250,0.1, 10),
            new Toode(2, "Leib", 25,0.2,12),
            new Toode(3, "Oder", 15,0.3,90),
            new Toode(4, "Tang", 14,0.4,24),
            new Toode(5, "Nisu", 17,0.5,30)
    ));
    List<Pood> poed = new ArrayList<>(Arrays.asList(
            new Pood(1, "PoeNimi", tooted),
            new Pood(2, "PoeNimi2", tooted1)
    ));
    @GetMapping("poed")
    public List<Pood> saaPoed() {
        return poed;
    }
    @PostMapping("lisa-pood")
    public List<Pood> lisaPood(
            @RequestParam int id,
            @RequestParam String nimetus,
            @RequestParam int[] tootenimekiri) {


    List<Toode> tooted = new ArrayList<>();
        for (int i: tootenimekiri) {
        Toode toode = toodeController.tooted.get(i);
        tooted.add(toode);
    }
        poed.add(new Pood(id, nimetus, tooted));
        return poed;
    }
    //localhost:8080/pood?id=1
    @GetMapping("pood")
    public Pood saaPood(
            @RequestParam int id
    ) {
        for (Pood pood : poed) {
            if (pood.getId() == id) {
                return pood;
            }
        }
        return null;
    }

    //localhost:8080/lisa-pood?id=6&nimetus=Selver&tootenimekiri=524




}
