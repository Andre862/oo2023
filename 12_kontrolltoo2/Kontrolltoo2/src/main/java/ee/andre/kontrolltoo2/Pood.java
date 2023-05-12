package ee.andre.kontrolltoo2;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Pood {
    @Id
    private int id;
    private String nimetus;

    @OneToMany
    private List<Toode> tootenimekiri;

    // Isik1 ja Kontaktandmed1
    // Isik2 ja Kontaktandmed2

    // Isik1 KontaktAndmed1
    // Isik2 KontaktAndmed1
}
