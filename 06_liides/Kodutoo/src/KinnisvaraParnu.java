import java.util.Arrays;

public class KinnisvaraParnu extends Kinnisvara implements KinnisvaraService{


    public KinnisvaraParnu(String linn, int hind, double pindala, String piirkond) {
        super(linn, hind, pindala, piirkond);
    }

    @Override
    public double getEstateArea(Kinnisvara kinnisvara) {
        return kinnisvara.getPindala();
    }

    @Override
    public int getPrice(Kinnisvara kinnisvara) {
        return kinnisvara.getHind();
    }

    @Override
    public String getLocation(Kinnisvara kinnisvara) {
        if (!Arrays.asList(kinnisvara.getPiirkond()).contains("Rannaäärejoon")){
            System.out.println("Ruutmeetri hind on odavam");
            return kinnisvara.getPiirkond();
        } else {
            return kinnisvara.getPiirkond();
        }
    }

    @Override
    public Kinnisvara getALlData(Kinnisvara kinnisvara) {
        return kinnisvara;
    }
}