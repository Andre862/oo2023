package ee.andre.klassikomplektapi;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class DroonListController {
    List<Droon> droon = new ArrayList<>(Arrays.asList(
            new Droon(2, "Dji Mavic 3 pro", 3600.99, 2023),
            new Droon(3, "Xiaomi fimi x8", 999.99, 2021),
            new Droon(4, "Dji mini 2 se", 399.99, 2022),
            new Droon(5, "Dji avata", 1599.99, 2021)
    ));

    @GetMapping("droon")
    public List<Droon> saaDroon() {
        return droon;
    }

    @DeleteMapping("kustuta-droon/{index}")
    public List<Droon> kustutaDroon(@PathVariable int index) {
        droon.remove(index);
        return droon;
    }

    @PatchMapping("hind-dollaritesse/{kurss}")
    public List<Droon> hindDollaritesse(@PathVariable double kurss) {
        for (Droon toode : droon) {
            double vanaHind = toode.getHind();
            double uusHind = vanaHind * kurss;
            toode.setHind(uusHind);
        }
        return droon;
    }
}