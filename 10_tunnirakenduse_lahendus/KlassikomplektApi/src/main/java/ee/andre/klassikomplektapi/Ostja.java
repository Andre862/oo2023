package ee.andre.klassikomplektapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ostja {
    private int id;
    private String eesnimi;
    private String perenimi;
    private Date loomiseAeg;
}