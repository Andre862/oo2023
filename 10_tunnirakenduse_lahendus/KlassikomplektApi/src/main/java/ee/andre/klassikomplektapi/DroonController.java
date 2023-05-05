package ee.andre.klassikomplektapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DroonController {
    Droon droon = new Droon(1,"Dji mini 3 pro", 1000.00, 2022, true);

    @GetMapping("droon") //localhost:8080/droon
    public Droon saaDroon() {
        return droon;
    }

    @GetMapping("kustuta-droon")
    public Droon kustutaDroon() {
        droon = null;
        return droon;
    }
    @GetMapping("muuda-aktiivsust")
    public Droon muudaAktiivsust() {
        droon.setAktiivne(!droon.isAktiivne());
        return droon;
    }
    @GetMapping("muuda-nime/{nimi}")
    public Droon muudaNime(@PathVariable String nimi){
        droon.setNimi(nimi);
        return droon;
    }
    @GetMapping("suurenda-hind")
    public Droon suurendaHinda() {
        droon.setHind( droon.getHind()+10 );
        return droon;
    }

}