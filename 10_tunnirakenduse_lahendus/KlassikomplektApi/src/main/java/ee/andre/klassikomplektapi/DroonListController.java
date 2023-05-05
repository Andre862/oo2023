package ee.andre.klassikomplektapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class DroonListController {
    List<Droon> droonid = new ArrayList<>(Arrays.asList(
            new Droon(2, "Dji Mavic 3 pro", 3600.99, 2023, true),
            new Droon(3, "Xiaomi fimi x8", 999.99, 2021, true),
            new Droon(4, "Dji mini 2 se", 399.99, 2022, true),
            new Droon(5, "Dji avata", 1599.99, 2021, true)
    ));

    @GetMapping("droonid")
    public List<Droon> saaDroon() {
        return droonid;
    }

    @DeleteMapping("kustuta-droon/{index}")
    public List<Droon> kustutaDroon(@PathVariable int index) {
        droonid.remove(index);
        return droonid;
    }

    @PatchMapping("hind-dollaritesse/{kurss}")
    public List<Droon> hindDollaritesse(@PathVariable double kurss) {
        for (Droon toode : droonid) {
            double vanaHind = toode.getHind();
            double uusHind = vanaHind * kurss;
            toode.setHind(uusHind);
        }
        return droonid;
    }
    @GetMapping("lisa-droon/{id}/{nimi}/{hind}/{aasta}/{aktiivne}")
    public List<Droon> lisaDroon(
            @PathVariable int id,
            @PathVariable String nimi,
            @PathVariable double hind,
            @PathVariable int aasta,
            @PathVariable boolean aktiivne) {
        droonid.add(new Droon(id, nimi, hind, aasta, aktiivne));
        return droonid;
    }
}