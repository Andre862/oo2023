package ee.andre.klassikomplektapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class LaoseisController {
    List<Laoseis> laoseis = new ArrayList<>(Arrays.asList(
            new Laoseis(1, true),
            new Laoseis(2, true),
            new Laoseis(3, false),
            new Laoseis(4, true)
    ));

    @GetMapping("kindlustused")
    public List<Laoseis> saalaoseis() {
        return laoseis;
    }
}