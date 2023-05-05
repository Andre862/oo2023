package ee.andre.klassikomplektapi;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Droon {
    private int id;
    private String nimi;
    private double hind;
    private int aasta;
    private boolean aktiivne;


}