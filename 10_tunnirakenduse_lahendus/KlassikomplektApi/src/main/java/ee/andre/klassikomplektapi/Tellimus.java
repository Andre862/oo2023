package ee.andre.klassikomplektapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tellimus {
    private int id;
    private Ostja tellija;
    private List<Droon> droonid;

}