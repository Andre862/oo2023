package ee.andre.klassikomplektapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.config.AnnotationDrivenBeanDefinitionParser;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.ToDoubleBiFunction;
@RestController
public class TellimusController {
    @Autowired
    DroonListController DroonListController;
    @Autowired
    DroonController OstjaController;
    List<Droon> tellitudDroonid = new ArrayList<>(Arrays.asList(
            new Droon(1,"Dji mini 3 pro", 1000.00, 2022, true),
            new Droon(2, "Dji Mavic 3 pro", 3600.99, 2023, true)
    ));

    Ostja tellija = new Ostja(1, "Eigo", "Kaljurand", new Date());
    List<Tellimus> tellimused = new ArrayList<>(Arrays.asList(
            new Tellimus(1, tellija, tellitudDroonid)
    ));
    @GetMapping("tellimused")
    public List<Tellimus> saaTellimused() {
        return tellimused;
    }

    @DeleteMapping("kustuta-tellimus/{index}")
    public String kustutaLaev(@PathVariable int index) {
        tellimused.remove(index);
        return "Tellimus kustutatud!";
    }


    // POST localhost:8080/lisa-tellimus?id=9&tellijaIndex=3&tooteIndex=2
    @PostMapping("lisa-tellimus")
    public List<Tellimus> lisaDroon(
            @RequestParam int id,
            @RequestParam int tellijaIndex,
            @RequestParam int tooteIndex) {

        Ostja tellija = OstjaController.ostjad.get(tellijaIndex);

        Droon tellitudDroon = DroonListController.droonid.get(tooteIndex);
        List<Droon> tellitudDroonid = new ArrayList<>(Arrays.asList(tellitudDroon));

        tellimused.add(new Tellimus(id, tellija, tellitudDroonid));
        return tellimused;
    }
    // POST localhost:8080/lisa-tellimus2?id=9&tellijaIndex=3&tooteIndexid=2,2,3


}