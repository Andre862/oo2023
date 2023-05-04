import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AutomaatTest {
    //@Test  alt+ enter Add 'JUnit4' to classpath    "OK"
    @Test
    public void kontrolli_kolmnurga_ymbermoot() {
        Kolmnurk Kolmnurk = new Kolmnurk("3" ,"6", "7", "8");
        assertEquals(21.0); // alt+enter -----> Assert.assertEquals
    }
}
