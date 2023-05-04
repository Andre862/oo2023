import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AutomaatTest {

    private KinnisvaraService kinnisvaraService;

    public AutomaatTest(KinnisvaraService kinnisvaraService) {
        this.kinnisvaraService = kinnisvaraService;
    }

//    @Test
//    @DisplayName("Kui piirkond on Tallinnas Kesklinn siis test peab töötama")
//    public void test_peab_tootama_kui_tallinna_piirkond_on_kesklinn(){
//        var kinnisvaraTLN = new Kinnisvara("Tallinn", 799, 30.5, "Kesklinn");
//        assertEquals(this.kinnisvaraService.getLocation(kinnisvaraTLN), kinnisvaraTLN.getPiirkond());
//    }

    @Test
    @DisplayName("")
}