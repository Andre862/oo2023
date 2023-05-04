package ee.andre.klassikomplektapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ostja {
    private int id;
    private String eesnimi;
    private String perenimi;
}