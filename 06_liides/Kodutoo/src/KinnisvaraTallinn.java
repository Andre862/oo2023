import java.util.Arrays;

public class KinnisvaraTallinn extends Kinnisvara implements KinnisvaraService{

    String[] piirkonnadTLN = new String[]{"Südalinn", "Kalamaja", "Kadriorg"};

    public KinnisvaraTallinn(String linn, int hind, double pindala, String piirkond) {
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
//        if (!Arrays.asList(kinnisvara.getPiirkond()).containsAll(List.of(piirkonnadTLN))){
//        if (!Arrays.asList(kinnisvara.getPiirkond()).contains("Kesklinn")){
        if (!kinnisvara.getPiirkond().equals("Kesklinn")){
            return "Sul pole piisavalt raha";
        } else {
            return kinnisvara.getPiirkond();
        }
    }

    @Override
    public Kinnisvara getALlData(Kinnisvara kinnisvara) {
        return kinnisvara;
    }
}